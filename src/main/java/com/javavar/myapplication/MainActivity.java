package com.javavar.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt1;
    private com.javavar.myapplication.Log.Log log = new com.javavar.myapplication.Log.Log();
    private static final String TAG = "[MainActiviy]";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.gc();
        log.d(TAG,"App is Running!");
        click();
    }
    public void click(){
        bt1 = (Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AboutStudioActivity.class);
                log.v(TAG,"Go to About!");
                startActivity(intent);
            }
        });
    }
}
