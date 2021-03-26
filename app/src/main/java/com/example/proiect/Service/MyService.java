package com.example.proiect.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;

public class MyService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String message;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("LOG","onStartCommand");
        sendToServer(message);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    protected InputStream inp;

    public void sendToServer(String message){
        new Thread(new Runnable() {
            @Override
            public void run() {
                ByteBuffer request = ByteBuffer.allocate(256);
                int message_size = message.length();
                request.put(message.getBytes(),0,message_size);
                try{
                    Socket client = new Socket();
                    SocketAddress adr = new InetSocketAddress("172.25.160.1",7000);
                    client.connect(adr);
                    OutputStream out = client.getOutputStream();
                    out.write(request.array());
                    out.flush();
                    inp = client.getInputStream();
                    //BufferedReader reader = new BufferedReader(new InputStreamReader(inp));
                    //String raspuns = reader.readLine();
                    //Log.e("Raspuns de la server : ",raspuns);
                    inp.close();
                    client.close();
                }catch (Exception e){
                    Log.i("TAG","sendToServer : "+e.getClass().getSimpleName()+" "+e.getMessage());
                    e.printStackTrace();
                }stopSelf();
            }
        }).start();
    }
}
