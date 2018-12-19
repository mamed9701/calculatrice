package com.example.guill.compteurfruit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton btPommes;
    RadioButton btPoires;
    Button compter;
    TextView nbPommes;
    TextView nbPoires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.nbPoires = findViewById(R.id.nbPoires);
        this.nbPommes = findViewById(R.id.nbPommes);
        this.btPommes = findViewById(R.id.btPommes);
        this.btPoires = findViewById(R.id.btPoires);
    }

    public void compterFruit(View view){
        int pommes = Integer.parseInt(this.nbPommes.getText().toString());
        int poires = Integer.parseInt(this.nbPoires.getText().toString());
        if(this.btPommes.isChecked()){
            pommes ++;
            this.nbPommes.setText(String.valueOf(pommes));
            Toast.makeText(this, nbPommes.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        else if(this.btPoires.isChecked()){
            poires ++;
            this.nbPoires.setText(String.valueOf(poires));
            Toast.makeText(this, nbPoires.getText().toString(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,3,0,"nbPommes");
        menu.add(0,2,0,"nbPoires");
        menu.add(0,1,0,"Quitter");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        TextView pomme = findViewById(R.id.nbPommes);
        TextView poire = findViewById(R.id.nbPoires);

        switch (item.getItemId()) {
            case 1:
                finish();break;
            case 2:
                Toast.makeText(getApplicationContext(), poire.getText().toString(), Toast.LENGTH_SHORT).show();break;
            case 3:
                Toast.makeText(getApplicationContext(), pomme.getText().toString(), Toast.LENGTH_SHORT).show();break;
        }
        return super.
                onOptionsItemSelected(item);
    }
}
