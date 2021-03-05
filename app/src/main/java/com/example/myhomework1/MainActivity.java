package com.example.myhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity2_main);
    }

    public void Click(View view) {
                    //Создаем переход:
                Intent intent=new Intent(MainActivity.this,R.layout.activity_3);
                //Запускаем его при нажатии:
                startActivity(intent);
            }

}