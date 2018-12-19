package fr.stjolorient.moyenne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "fr.stjolorient.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void moyenne(View view){
        EditText edit1 = (EditText) findViewById(R.id.number1);
        EditText edit2 = (EditText) findViewById(R.id.number2);
        EditText edit3 = (EditText) findViewById(R.id.number3);
        float res = (Float.parseFloat(edit1.getText().toString()) + Float.parseFloat(edit2.getText().toString()) + Float.parseFloat(edit3.getText().toString())) / 3;

        if (res >= 10) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra(EXTRA_MESSAGE, String.valueOf(res));
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, Main3Activity.class);
            intent.putExtra(EXTRA_MESSAGE, String.valueOf(res));
            startActivity(intent);
        }
    }
}
