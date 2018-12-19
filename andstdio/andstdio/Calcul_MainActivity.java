package fr.stjolorient.calculatrice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Tres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tres = (TextView)findViewById(R.id.res);
    }
    
    public void plus(View view){
        EditText edit1 = (EditText)findViewById(R.id.number1);
        EditText edit2 = (EditText)findViewById(R.id.number2);
        float res = Float.parseFloat(edit1.getText().toString()) + Float.parseFloat(edit2.getText().toString());
        Tres.setText(Float.toString(res));
    }

    public void moins(View view){
        EditText edit1 = (EditText)findViewById(R.id.number1);
        EditText edit2 = (EditText)findViewById(R.id.number2);
        float res = Float.parseFloat(edit1.getText().toString()) - Float.parseFloat(edit2.getText().toString());
        Tres.setText(Float.toString(res));
    }

    public void divise(View view){
        EditText edit1 = (EditText)findViewById(R.id.number1);
        EditText edit2 = (EditText)findViewById(R.id.number2);
        float res = Float.parseFloat(edit1.getText().toString()) / Float.parseFloat(edit2.getText().toString());
        Tres.setText(Float.toString(res));
    }

    public void multiplie(View view){
        EditText edit1 = (EditText)findViewById(R.id.number1);
        EditText edit2 = (EditText)findViewById(R.id.number2);
        float res = Float.parseFloat(edit1.getText().toString()) * Float.parseFloat(edit2.getText().toString());
        Tres.setText(Float.toString(res));
    }
}
