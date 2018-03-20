package freestar.vip.pandaking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import vip.freestar.mylogger.Logger;

public class MainActivity extends AppCompatActivity {

    Runnable mRunnable = new Runnable() {
        @Override
        public void run() {
            Logger.e("name");
            int i = 0;
            while (i < 1000) {
                i++;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.e("M1", getResources().getDisplayMetrics().density, getResources().getDisplayMetrics().densityDpi);
//        new Thread(new MyRun()).start();
//        finish();
        mImageView = findViewById(R.id.iv);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.e("M1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.e("M1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.e("M1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.e("M1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.e("M1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.e("M1");
    }

    public void open(View view) {
//        startActivity(new Intent(this, Main2Activity.class));
        mImageView.setImageResource(R.drawable.love_tree);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Logger.e("", mImageView.getWidth(), mImageView.getHeight());
            }
        }).start();
    }
}
