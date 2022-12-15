package net.aoulad.polboir;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText coteBill,Tip,NBRpeople;
Button Calcolator;
TextView textViewTip,textViewTotal;
    float billInteger1,TipInteger,NbrPersonne;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coteBill =(EditText) findViewById(R.id.Bill);
        Tip =(EditText) findViewById(R.id.tip);
        NBRpeople =(EditText) findViewById(R.id.people);

        Calcolator =(Button) findViewById(R.id.Calculator);
        textViewTip =(TextView) findViewById(R.id.Tip);
        textViewTotal =(TextView) findViewById(R.id.total);

        Calcolator.setOnClickListener(new View.OnClickListener() {
            float b ;
            float s;
            @Override
            public void onClick(View v) {

                billInteger1 =Float.parseFloat(coteBill.getText().toString());
                TipInteger = Float.parseFloat(Tip.getText().toString());
                NbrPersonne = Float.parseFloat(NBRpeople.getText().toString());

                b=Math.round(billInteger1 * (TipInteger/100)     /NbrPersonne);
                s=Math.round(billInteger1/NbrPersonne)+b;

                textViewTip.setText(String.valueOf(b));
                textViewTotal.setText(String.valueOf(s));
            }
        });



    }
}