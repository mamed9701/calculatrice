package fr.stjolorient.snir2.compteur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

/*click droit sur res
    new/ android resource directory ->  change type en menu
    click droit menu new/ menu ressource file -> name popup_menu
    dans le xml -> popup_menu.xml
*/
public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    TextView somme;
    Button btn1;
    Button btn10;
    Button btn100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        somme = (TextView)findViewById(R.id.somme);
        btn1 = (Button)findViewById(R.id.un);
        btn10 = (Button)findViewById(R.id.dix);
        btn100 = (Button)findViewById(R.id.cent);
    }

    public void showPopup(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.quitter:
                finish();break;
            case R.id.reset:
                somme.setText("0");break;
        }
        return true;
    }

    public void ajoutun (View view){

        btn1.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view){
                showPopup(view);
                return true;
            }
        });

        int n;
        n = 1 + Integer.valueOf(somme.getText().toString());
        CharSequence msg = String.valueOf(n);
        somme.setText(msg);
    }

    public void ajoutdix (View view){
        btn10.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view){
                showPopup(view);
                return true;
            }
        });

        int n;
        n = 10 + Integer.valueOf(somme.getText().toString());
        CharSequence msg = String.valueOf(n);
        somme.setText(msg);
    }

    public void ajoutcent (View view){
        btn100.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view){
                showPopup(view);
                return true;
            }
        });

        int n;
        n = 100 + Integer.valueOf(somme.getText().toString());
        CharSequence msg = String.valueOf(n);
        somme.setText(msg);
    }
}
