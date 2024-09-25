package com.aldorayhanr.minggu5mobileapp;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    private CardView btn_contacts;
    private CardView btn_settings;
    private CardView btn_folder;
    private CardView btn_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn_contacts = findViewById(R.id.btn_contacts);
        btn_settings = findViewById(R.id.btn_settings);
        btn_folder = findViewById(R.id.btn_folder);
        btn_camera = findViewById(R.id.btn_camera);

        btn_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        ContactActivity.class));
            }
        });
        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hallo ini Button Settings", Toast.LENGTH_SHORT).show();
            }
        });
        btn_folder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),
                        FolderActivity.class));
            }
        });
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hallo ini Button Camera",Toast.LENGTH_SHORT).show();
            }
        });
    }
}