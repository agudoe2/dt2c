package tw.agudoe2.dt2c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.View.OnClickListener;
//import android.view.View;
//import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        
        startService(new Intent(MainActivity.this, NotifyingService.class));
        finish();

//        Button button = (Button) findViewById(R.id.notifyStart);
//        button.setOnClickListener(mStartListener);
//        button = (Button) findViewById(R.id.notifyStop);
//        button.setOnClickListener(mStopListener);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }

//    private OnClickListener mStartListener = new OnClickListener() {
//        public void onClick(View v) {
//            startService(new Intent(MainActivity.this, NotifyingService.class));
//        }
//    };

//    private OnClickListener mStopListener = new OnClickListener() {
//        public void onClick(View v) {
//            stopService(new Intent(MainActivity.this, NotifyingService.class));
//        }
//    };
}
