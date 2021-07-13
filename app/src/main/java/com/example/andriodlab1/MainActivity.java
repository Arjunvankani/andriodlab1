package com.example.andriodlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,n1,n2,s1,c1;
    Button btn;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        s1 = findViewById(R.id.s1);
        c1 = findViewById(R.id.c1);
        btn = findViewById(R.id.btn);
        output = findViewById(R.id.output);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText("Details are given below : \n" + name.getText() + "\n" + n1.getText() + "\n" + n2.getText() + "\n"+ s1.getText() + "\n" + c1.getText() + "\n");
            }
        });



    }

}