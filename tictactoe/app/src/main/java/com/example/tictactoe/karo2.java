package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class karo2 extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView text_result;
    int count = 0;


    void checkXO(Button button) {
        if (count % 2 == 0) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        count++;
    }

    void checkWinXO(Button b1, Button b2, Button b3, String XO) {
        String btn1 = b1.getText().toString();
        String btn2 = b2.getText().toString();
        String btn3 = b3.getText().toString();
        text_result =  findViewById(R.id.result);
        if (btn1.equals(XO) && btn2.equals(XO) && btn3.equals(XO)) {
            text_result.setText(XO + " win !");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karo2);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn1);
                checkWinXO(btn1, btn2, btn3,"X");
                checkWinXO(btn1, btn4, btn7,"X");
                checkWinXO(btn1, btn5, btn9,"X");
                checkWinXO(btn1, btn2, btn3,"O");
                checkWinXO(btn1, btn4, btn7,"O");
                checkWinXO(btn1, btn5, btn9,")");
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn2);
                checkWinXO(btn1, btn2, btn3, "X");
                checkWinXO(btn2, btn5, btn8, "X");
                checkWinXO(btn1, btn2, btn3, "O");
                checkWinXO(btn2, btn5, btn8, "O");
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn3);
                checkWinXO(btn1, btn2, btn3, "X");
                checkWinXO(btn3, btn6, btn9, "X");
                checkWinXO(btn3, btn5, btn7, "X");
                checkWinXO(btn1, btn2, btn3, "O");
                checkWinXO(btn3, btn6, btn9, "O");
                checkWinXO(btn3, btn5, btn7, "O");
            }
        });

        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn4);
                checkWinXO(btn1, btn4, btn7, "X");
                checkWinXO(btn4, btn5, btn6, "X");
                checkWinXO(btn1, btn4, btn7, "O");
                checkWinXO(btn4, btn5, btn6, "O");
            }
        });

        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn5);
                checkWinXO(btn1, btn5, btn9, "X");
                checkWinXO(btn2, btn5, btn8, "X");
                checkWinXO(btn4, btn5, btn6, "X");
                checkWinXO(btn3, btn5, btn7, "X");
                checkWinXO(btn1, btn5, btn9, "O");
                checkWinXO(btn2, btn5, btn8, "O");
                checkWinXO(btn4, btn5, btn6, "O");
                checkWinXO(btn3, btn5, btn7, "O");
            }
        });

        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn6);
                checkWinXO(btn4, btn5, btn6, "X");
                checkWinXO(btn3, btn6, btn9, "X");
                checkWinXO(btn4, btn5, btn6, "O");
                checkWinXO(btn3, btn6, btn9, "O");
            }
        });

        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn7);
                checkWinXO(btn1, btn4, btn7, "X");
                checkWinXO(btn7, btn8, btn9, "X");
                checkWinXO(btn3, btn5, btn7, "X");
                checkWinXO(btn1, btn4, btn7, "O");
                checkWinXO(btn7, btn8, btn9, "O");
                checkWinXO(btn3, btn5, btn7, "O");
            }
        });

        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn8);
                checkWinXO(btn2, btn5, btn8, "X");
                checkWinXO(btn2, btn5, btn8, "X");
                checkWinXO(btn2, btn5, btn8, "O");
                checkWinXO(btn2, btn5, btn8, "O");
            }
        });

        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkXO(btn9);
                checkWinXO(btn1, btn5, btn9, "X");
                checkWinXO(btn7, btn8, btn9, "X");
                checkWinXO(btn3, btn6, btn9, "X");
                checkWinXO(btn1, btn5, btn9, "O");
                checkWinXO(btn7, btn8, btn9, "O");
                checkWinXO(btn3, btn6, btn9, "O");
            }
        });

    }


}
