package fr.stjolorient.moyenne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent1 = getIntent();
        String res = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView moyenne = (TextView)findViewById (R.id.moy);
        moyenne.setTextSize(40);
        moyenne.setText(res);
    }
}
