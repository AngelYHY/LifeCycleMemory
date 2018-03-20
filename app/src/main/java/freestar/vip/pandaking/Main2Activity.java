package freestar.vip.pandaking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vip.freestar.mylogger.Logger;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Logger.e("M2 9.7  xxx 12.24  xx 13.71  x 18.6  h 25.11  m 44.3");
        Logger.e("9.7   xx 10 x 10.6 m 13.55 ");
        Logger.e("768*1280 320   10.1  xxx 11 xx 11.8  x 13.9");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.e("M2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.e("M2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.e("M2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.e("M2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.e("M2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.e("M2");
    }

    public void finish(View view) {
        finish();
    }
}
