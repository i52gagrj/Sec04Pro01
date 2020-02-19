package com.i52gagrj.sec04pro01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String GREETER = "Hello from the other side!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Acceder al segundo activity y mandarle un string
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Intent greeter = intent.putExtra("greeter", GREETER);
                startActivity(intent);
            }
        });
    }

}
