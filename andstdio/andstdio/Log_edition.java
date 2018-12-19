package com.example.guill.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class edition extends AppCompatActivity {
    EditText name;
    EditText mdp;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edition);
        this.mdp = findViewById(R.id.mdp);
        this.name = findViewById(R.id.name);
        Intent intent = getIntent();
        this.name.setText(intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
        this.mdp.setText(intent.getStringExtra(MainActivity.EXTRA_PASSWD));

        this.preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void retour(View view){
        this.preferences.edit().putString("login", this.name.getText().toString()).apply();
        this.preferences.edit().putString("passwd", this.mdp.getText().toString()).apply();
        finish();
    }
}
