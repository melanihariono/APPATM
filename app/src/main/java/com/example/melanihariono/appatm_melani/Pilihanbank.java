package com.example.melanihariono.appatm_melani;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Melanihariono on 2/19/2017.
 */
public class Pilihanbank extends AppCompatActivity {
    Button btnceksaldo, btntarik, btnsetor, btntransfer, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanbank);
        btnceksaldo = (Button) findViewById(R.id.btnceksaldo);
        btnsetor = (Button) findViewById(R.id.btnsetor);
        btntarik = (Button) findViewById(R.id.btntarik);
        btntransfer = (Button) findViewById(R.id.btntransfer);
        btnexit = (Button) findViewById(R.id.btnexit);

        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Penarikan.class);
                startActivity(i);
            }
        });
        btnsetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Penyetoran.class);
                startActivity(i);
            }
        });
        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Transfer.class);
                startActivity(i);
            }
        });
        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = getIntent().getExtras();
                final String get_isii = b.getString("parse_isii");
                String var_isii = get_isii;
                Intent i = null;
                i = new Intent(Pilihanbank.this, Ceksaldo.class);
                Bundle z = new Bundle();
                z.putString("parse_isi1", var_isii);
                i.putExtras(b);
                startActivity(i);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Pilihanbank.this);
                builder.setMessage("Apakah Anda yakin ingin keluar ?").setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).show();
            }
        });
    }
}


