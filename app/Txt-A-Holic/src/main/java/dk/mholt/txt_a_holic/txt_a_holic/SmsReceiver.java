package dk.mholt.txt_a_holic.txt_a_holic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SmsReceiver extends BroadcastReceiver {
    public SmsReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("SmsReciver", "Test");
        Toast.makeText(context, "Test", Toast.LENGTH_LONG).show();
    }
}
