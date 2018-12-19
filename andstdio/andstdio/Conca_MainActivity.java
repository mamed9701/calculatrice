package com.example.guill.concatenation;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText box1;
    EditText box2;
    CheckBox check;
    String memoire;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.box1 = findViewById(R.id.box1);
        this.box2 = findViewById(R.id.box2);
        this.check = findViewById(R.id.check);
    }
    public void concatener(View view){
        if(this.check.isChecked()){
            memoire = this.box1.getText().toString()+ " " + this.box2.getText().toString();


        }
        else {
            memoire = this.box1.getText().toString()+this.box2.getText().toString();
        }
        Toast toast = Toast.makeText(this, memoire, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();

    }
    public void sauvegarder(View view){
        writeFile("fichier.txt", memoire);
    }

    public File writeFile(String nomfichier, String contenu){
        BufferedWriter bW;
        File racine = Environment.getExternalStorageDirectory();
        File file = new File (racine + "/" + nomfichier);
        try {
            if (!file.exists()) bW = new BufferedWriter(new FileWriter(file)); // ajout
            else bW = new BufferedWriter(new FileWriter(file, true)); // création
            bW.write(contenu);
            bW.flush();
            bW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

}
