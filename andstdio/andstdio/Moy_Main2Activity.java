package fr.stjolorient.moyenne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent1 = getIntent();
        String res = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView moyenne = (TextView)findViewById (R.id.moy);
        moyenne.setText(res);

    }
}
