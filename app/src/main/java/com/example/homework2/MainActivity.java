package com.example.homework2;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText, editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.ed_username);
        editText1 = findViewById(R.id.ed_password);

        button.setOnClickListener(view -> {
            if (editText1.getText().toString().length() < 6) {
                Toast.makeText(MainActivity.this, "у вас не достаточна слов", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("key" , editText.getText().toString());
                intent.putExtra("key1" , editText1.getText().toString());
                startActivity(intent);
            }
        });
    }
}