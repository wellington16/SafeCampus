package com.ufrpe.safecampus;

import android.view.KeyEvent;

import static android.view.KeyEvent.KEYCODE_VOLUME_DOWN;
import static android.view.KeyEvent.KEYCODE_VOLUME_UP;

/**
 * Created by wellington on 22/07/17.
 */

public final class Utils {

    private Utils() {
        // Intentionally blank
    }

    public static boolean isMediaButton(int keyCode) {
        return keyCode == KEYCODE_VOLUME_UP || keyCode == KEYCODE_VOLUME_DOWN||
                keyCode == KeyEvent.KEYCODE_VOLUME_MUTE;
    }

    public static int getAdjustedKeyCode(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == KEYCODE_VOLUME_UP || keyCode == KEYCODE_VOLUME_DOWN) {


        }
        return keyCode;
    }

}
