package tw.agudoe2.dt2c;

//import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
//import android.os.Bundle;
//import android.view.View.OnClickListener;
//import android.view.View;
//import android.widget.Button;

public class CommonReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        
        if(action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent startIntent = new Intent();
            startIntent.setClass(context, NotifyingService.class);
            context.startService(startIntent);
        }
    }
}
