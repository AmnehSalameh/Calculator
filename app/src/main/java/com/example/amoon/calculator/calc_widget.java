package com.example.amoon.calculator;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calc_widget extends AppCompatActivity {

    double SaveToMemory;
     TextView inp;
    double num1,num2;
    int op=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_widget);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Bundle b = getIntent().getExtras();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
        Button nine = (Button) findViewById(R.id.nine);
        Button eight = (Button) findViewById(R.id.eight);
        Button seven = (Button) findViewById(R.id.seven);
        Button six = (Button) findViewById(R.id.six);
        Button five = (Button) findViewById(R.id.five);
        Button four = (Button) findViewById(R.id.four);
          inp = (TextView) findViewById(R.id.txt);
        Button three = (Button) findViewById(R.id.three);
        Button two = (Button) findViewById(R.id.two);
        Button one = (Button) findViewById(R.id.one);
        Button zero = (Button) findViewById(R.id.zero);
        //actions
        Button clear = (Button) findViewById(R.id.C);
        Button back = (Button) findViewById(R.id.BACK);
        Button mc = (Button) findViewById(R.id.MC);
        Button mr = (Button) findViewById(R.id.MR);
        Button n = (Button) findViewById(R.id.N);
        Button msave = (Button) findViewById(R.id.savetoMem);
        Button div = (Button) findViewById(R.id.div);
        Button mult = (Button) findViewById(R.id.mult);
        Button plus = (Button) findViewById(R.id.plus);
        Button min = (Button) findViewById(R.id.min);
        Button equal = (Button) findViewById(R.id.equal);

        msave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SaveToMemory = Double.parseDouble(inp.getText().toString());

            }
        });
        mc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                inp.setText("SaveToMemory");

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                inp.setText("");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "7" +
                        "");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "6" +
                        "");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "8" +
                        "");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "5" +
                        "");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "4" +
                        "");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "3" +
                        "");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "2" +
                        "");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "1" +
                        "");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "9" +
                        "");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "0" +
                        "");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                inp.setText(inp.getText() + "0");
                num1 = Double.parseDouble(inp.getText().toString());
                op = 1;
                inp.setText("");
            }
        });
        min.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                num1 = Double.parseDouble(inp.getText().toString());
                op=2;
                inp.setText("");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                num1 = Double.parseDouble(inp.getText().toString());
                op=3;
                inp.setText("");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                num1 =Double.parseDouble(inp.getText().toString());
                op=4;//meansdiv
                inp.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            public  void  onClick(View view){
              Count();
            }

        });
        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inp.setText(SaveToMemory + "");
            }
        });
        n.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v) {

            inp.setText(Double.parseDouble(inp.getText().toString())*-1+"");
            }
                             }
        );
        back.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                if(inp.getText().length()==0)
                    inp.setText("");
                else
               inp.setText(inp.getText().subSequence(0,inp.length()-1));
            }
        });
    }
public void Count(){
    num2=Double.parseDouble(inp.getText().toString());
    double res=0;
    switch (op){
        case 1:
            res=num1 + num2;
            break;
        case 2:
            res=num1-num2;
            break;
        case 3:
            res=num1*num2;
            break;
        case 4:
            if(num2!=0)
                res=num1/num2;
            else res=0;
            break;
    }
    inp.setText(res+"");
    num2=0;num1=0;//inisilazed the varibles
}
}
