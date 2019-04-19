package org.techtown.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.btn1);
        button1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),manage.class);
                        startActivity(intent);
                    }
                }
        );

        Button button2=(Button)findViewById(R.id.btn2);
        button2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent intent=new Intent(getApplicationContext(),state.class);
                        startActivity(intent);
                    }
                }
        );

        Button button3=(Button)findViewById(R.id.btn3);
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),sales_volume.class);
                        startActivity(intent);
                    }
                }
        );

        Button button4=(Button)findViewById(R.id.btn4);
        button4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        Intent intent=new Intent(getApplicationContext(),setting.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
