package com.example.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView stateLifeCycleLabel;
    String l;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        stateLifeCycleLabel = findViewById(R.id.firstText);
        l="Activity Life Cycle State::CREATE";
        stateLifeCycleLabel.setText(l);


    }
    @Override
    protected void onStart(){
        super.onStart();
        l=l+"\nStart";
        stateLifeCycleLabel.setText(l);
    }
    @Override
    protected void onResume(){
        super.onResume();
        l=l+"\nResume";
        stateLifeCycleLabel.setText(l);
    }
    @Override
    protected void onStop(){
        super.onStop();
        l=l+"\nStop";
        stateLifeCycleLabel.setText(l);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        l=l+"\nReStart";
        stateLifeCycleLabel.setText(l);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        l=l+"\nDestroy";
        stateLifeCycleLabel.setText(l);
    }
}

