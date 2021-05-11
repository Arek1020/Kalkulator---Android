package com.example.kalkulatorek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.poleTekstowe);
        textView.setTextSize(30);

        final String[] str = {""};
        final double[] arg1 = new double[1];
        final double[] arg2 = new double[1];
        final char[] znak = new char[1];


        Button cyfry[] = new Button[10];

        cyfry[0] = (Button) findViewById(R.id.b0);
        cyfry[1] = (Button) findViewById(R.id.b1);
        cyfry[2] = (Button) findViewById(R.id.b2);
        cyfry[3] = (Button) findViewById(R.id.b3);
        cyfry[4] = (Button) findViewById(R.id.b4);
        cyfry[5] = (Button) findViewById(R.id.b5);
        cyfry[6] = (Button) findViewById(R.id.b6);
        cyfry[7] = (Button) findViewById(R.id.b7);
        cyfry[8] = (Button) findViewById(R.id.b8);
        cyfry[9] = (Button) findViewById(R.id.b9);

       /* for(int i=0; i<10; i++)
        {

            String j = toString(i);
            cyfry[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    str[0] += j;
                    textView.setText(str[0]);
                }});
        }*/

        cyfry[0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "0";
                textView.setText(str[0]);
            }});
        cyfry[1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "1";
                textView.setText(str[0]);
            }});
        cyfry[2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "2";
                textView.setText(str[0]);
            }});
        cyfry[3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "3";
                textView.setText(str[0]);
            }});
        cyfry[4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "4";
                textView.setText(str[0]);
            }});
        cyfry[5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "5";
                textView.setText(str[0]);
            }});
        cyfry[6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "6";
                textView.setText(str[0]);
            }});
        cyfry[7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "7";
                textView.setText(str[0]);
            }});
        cyfry[8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "8";
                textView.setText(str[0]);
            }});
        cyfry[9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                str[0] += "9";
                textView.setText(str[0]);
            }});

        Button plus = (Button) findViewById(R.id.bDod);
        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arg1[0] = Double.parseDouble(str[0]);
                str[0] = "";
                znak[0] = '+';
                textView.setText(str[0]);
            }
        });

        Button minus = (Button) findViewById(R.id.bOdej);
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arg1[0] = Double.parseDouble(str[0]);
                str[0] = "";
                znak[0] = '-';
                textView.setText(str[0]);
            }
        });

        Button mnoz = (Button) findViewById(R.id.bMnoz);
        mnoz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arg1[0] = Double.parseDouble(str[0]);
                str[0] = "";
                znak[0] = '*';
                textView.setText(str[0]);
            }
        });

        Button dziel = (Button) findViewById(R.id.bDziel);
        dziel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                arg1[0] = Double.parseDouble(str[0]);
                str[0] = "";
                znak[0] = '/';
                textView.setText(str[0]);
            }
        });

        Button rowne = (Button) findViewById(R.id.bRowne);
        rowne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg2[0] = Double.parseDouble(str[0]);
                str[0] = "";
                textView.setText(str[0]);
                switch (znak[0]){
                    case '+':
                        str[0] = String.valueOf(arg1[0] + arg2[0]);
                        break;
                    case '-':
                        str[0] = String.valueOf(arg1[0] - arg2[0]);
                        break;
                    case '*':
                        str[0] = String.valueOf(arg1[0] * arg2[0]);
                        break;
                    case '/':
                        str[0] = String.valueOf(arg1[0] / arg2[0]);
                        break;
                }
                textView.setText(str[0]);
            }
        });

        Button CLR = (Button) findViewById(R.id.bC);
        CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str[0] = "";
                textView.setText(str[0]);
            }
        });

        Button CE = (Button) findViewById(R.id.bCE);
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = (String) textView.getText();
                str[0] = s.substring(0, s.length()-1);
                textView.setText(str[0]);
            }
        });

        Button przecinek = (Button) findViewById(R.id.bPrzecinek);
        przecinek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = (String) textView.getText();

                if(s.equals("")) {
                    str[0] += "0.";
                    textView.setText(str[0]);
                }
                else if(s.charAt(s.length()-1) != '.'){
                    str[0] +=".";
                    textView.setText(str[0]);
                }

            }
        });

        Button sqrt = (Button) findViewById(R.id.bPierwiastek);
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg1[0] = Double.parseDouble(str[0]);
                str[0] = String.valueOf(Math.sqrt(arg1[0]));
                textView.setText(str[0]);
            }
        });

        Button procent = (Button) findViewById(R.id.bProc);
        procent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double proc = Double.parseDouble(str[0]) * 0.01;
                str[0] = proc.toString();
                textView.setText(String.valueOf(str[0]));
            }
        });
    }

    private String toString(int i) {
        return toString(i);
    }


}