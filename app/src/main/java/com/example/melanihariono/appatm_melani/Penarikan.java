package com.example.melanihariono.appatm_melani;

/**
 * Created by Melanihariono on 2/19/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Penarikan extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnok, btndel;
    EditText edittarik, editsaldo;
    String tarik = "";
    int temp;
    int tab = 100000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penarikan);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndel = (Button) findViewById(R.id.btndel);
        btnok = (Button) findViewById(R.id.btnok);
        edittarik = (EditText) findViewById(R.id.edittarik);
        editsaldo = (EditText) findViewById(R.id.editsaldo);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "0";
                edittarik.setText(tarik);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "1";
                edittarik.setText(tarik);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "2";
                edittarik.setText(tarik);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "3";
                edittarik.setText(tarik);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "4";
                edittarik.setText(tarik);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "5";
                edittarik.setText(tarik);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "6";
                edittarik.setText(tarik);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "7";
                edittarik.setText(tarik);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "8";
                edittarik.setText(tarik);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik += "9";
                edittarik.setText(tarik);
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tarik = "";
                edittarik.setText(tarik);
            }
        });
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean valid;
                if (tarik.equals("")) {
                    edittarik.setError("Masukkan Jumlah Tarikan Dengan Benar!");
                    valid = (false);

                } else {
                    int e = Integer.parseInt(tarik);
                    if (e > tab) {
                        edittarik.setError("Saldo Anda tidak mencukupi");
                        valid = (false);
                    } else {
                        isi(e);

                    }
                    String var_isi1 = editsaldo.getText().toString();
                    Bundle b = new Bundle();
                    b.putString("parse_isi1", var_isi1);
                    Intent i = new Intent(Penarikan.this, Ceksaldo.class);
                    i.putExtras(b);
                    startActivity(i);
                }

            }
        });
    }

    public void isi(int uang) {
        int tab = 100000;
        int h1 = Integer.parseInt(String.valueOf(edittarik.getText()));
        int x = tab - h1;

        editsaldo.setText(String.valueOf(x));
    }
}