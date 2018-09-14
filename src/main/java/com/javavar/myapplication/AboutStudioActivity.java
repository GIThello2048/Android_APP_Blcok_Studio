package com.javavar.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Thread.sleep;

/**
 * @author GIThello2048
 * @version 1.0.0
 */
public class AboutStudioActivity extends AppCompatActivity {
    Button abt1,abt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);
        abt1 = (Button) findViewById(R.id.abt1);
        abt2 = (Button) findViewById(R.id.abt2);
        Click_About();
    }
    private void Click_About(){
        abt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutStudioActivity.this,
                        "You are using a lastest Version!",Toast.LENGTH_SHORT).show();
            }
        });
        abt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutStudioActivity.this,
                        "You are in BETA-1 Version!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
