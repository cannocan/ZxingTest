package me.test.zxing;

import android.app.Activity;
import android.os.Bundle;


public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
//        TextView tv = (TextView) findViewById(R.id.abc);
//        tv.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE);

        setContentView(R.layout.activity_main2);
    }
}
