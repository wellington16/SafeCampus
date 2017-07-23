package com.ufrpe.safecampus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by wellington on 22/07/17.
 */

public class MediaButtonReceiver extends  BroadcastReceiver {
    int contador = 0;

    @Override
    public void onReceive(Context context, Intent intent) {
        evento(context, intent );

    }

    private void evento(Context context, Intent intent) {
        int prevVolume;
        int volume;
        Toast.makeText(context, "xxxxxxxx", Toast.LENGTH_SHORT).show();

        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
            volume = (int)intent.getExtras().get("android.media.EXTRA_VOLUME_STREAM_VALUE");
            prevVolume = (int)intent.getExtras().get("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE");
            Toast.makeText(context, "Volume para baixo: "+prevVolume+" Volume para cima: "+volume, Toast.LENGTH_SHORT).show();
            if(volume < prevVolume) {
                Toast.makeText(context, " up1", Toast.LENGTH_SHORT).show();
                //Toast.makeText(context, "Volume down!", Toast.LENGTH_SHORT).show();
                abortBroadcast();

            }else if(volume > prevVolume){
                Log.i("MediaButtonReceiver", "onReceive : ");
                Toast.makeText(context, " up2", Toast.LENGTH_SHORT).show();
                //Toast.makeText(context, "Volume up!", Toast.LENGTH_SHORT).show();
                abortBroadcast();
            }
        }
    }
}

