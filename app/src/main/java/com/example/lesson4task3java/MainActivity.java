package com.example.lesson4task3java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lesson4task3java.Model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText nameText = findViewById(R.id.name);
        EditText ageText = findViewById(R.id.age);

        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());

        User user = new User(name, age);

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(User.class.getSimpleName(), user);
        startActivity(intent);
    }
}