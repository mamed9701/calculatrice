package com.example.guill.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText login;
    EditText passwd;
    SharedPreferences preferences;
    public final static String EXTRA_MESSAGE = "com.example.guill.login.MESSAGE";

    public final static String EXTRA_PASSWD = "com.example.guill.login.PASSWD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.login = findViewById(R.id.login);
        this.passwd = findViewById(R.id.passwd);
        this.preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void ok(View view){
        if(this.login.getText().toString().equals(preferences.getString("login", "admin")) && this.passwd.getText().toString().equals(preferences.getString("passwd","admin"))){
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(this,edition.class));
            Intent intent = new Intent(this, edition.class);
            intent.putExtra(EXTRA_MESSAGE, this.login.getText().toString());
            intent.putExtra(EXTRA_PASSWD, this.passwd.getText().toString());
            startActivity(intent);

        }
        else {
            Toast.makeText(this, "erreur", Toast.LENGTH_SHORT).show();
            this.login.getText().clear();
            this.passwd.getText().clear();
        }

    }
}
