package com.example.thibaut.mysudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //Generation du tableau d'objet
        int tab[][] = {{}};
        int idItem = 1;
        for (int level=1; level<=3; level++) {
            for (int i = 1; i <= 100; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (j == 0) { tab[idItem][j] = idItem; }
                    /*
                    switch(j) {

                        case 0: tab[idItem][j] = idItem; break;
                        case 1: tab[idItem][j] = level; break;
                        case 2: tab[idItem][j] = i; break;
                        case 3: tab[idItem][j] = 0; break;
                        default: break;
                    }
                    */
                }
                idItem++;
            }
        }


        //Creation de la liste
        /*
        final ListView listview = (ListView) findViewById(R.id.listeId);
        String[] values = new String[] {"Liste de Contacts", "A propos"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,android.R.id.text1,values);
        listview.setAdapter(adapter);
*/
    }
}
