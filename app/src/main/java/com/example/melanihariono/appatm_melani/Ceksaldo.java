package com.example.melanihariono.appatm_melani;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by Melanihariono on 2/21/2017.
 */
public class Ceksaldo extends AppCompatActivity {
    EditText editsaldo;
    int tab = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceksaldo);
        editsaldo = (EditText) findViewById(R.id.saldo);

        Bundle b = getIntent().getExtras();
        String get_isi1 = b.getString("parse_isi1");
        editsaldo.setText(get_isi1);

    }
}


