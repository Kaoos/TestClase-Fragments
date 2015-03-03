package com.example.ruben.pr02;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    boolean showing_frag4 = true; //creamos la variable boleana para ver si el fragment esta abierto

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///miramos si es la primera vez que se crea la pantalla, si es la primera vez realiza el if sino pasa de el

        if (savedInstanceState !=null) {
          return;
        }
        // esto permite manipular los fragments

        getFragmentManager()
        .beginTransaction()
        .add(R.id.container01, new Frag4())
        .commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {


               if (showing_frag4) //miramos el estado de la boleana para abrir el fragment adecuado
                   getFragmentManager()
                           .beginTransaction()
                           .replace(R.id.container01, new Frag3())
                           .commit();
                   else
                   getFragmentManager()
                           .beginTransaction()
                           .replace(R.id.container01, new Frag4())
                           .commit();

                showing_frag4 = !showing_frag4; //cambiamos el valor de la variable

            return true;
        }






        return super.onOptionsItemSelected(item);

    }
}
