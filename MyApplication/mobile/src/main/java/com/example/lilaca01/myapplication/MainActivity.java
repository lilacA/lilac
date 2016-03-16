package com.example.lilaca01.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mButton;
    EditText mEdit;
    EditText mEdit2;
    private CheckBox checkRound;
    String tipString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.button);
        mEdit   = (EditText)findViewById(R.id.editText);
        mEdit2 = (EditText)findViewById(R.id.editText2);
        checkRound = (CheckBox) findViewById(R.id.checkBox);

        mButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        final double inputBill = Double.parseDouble(mEdit.getText().toString());
                        double tip = inputBill * 0.12;
                        if(checkRound.isChecked()){
                            tip = Math.ceil(tip);
                        }
                        tipString = tip + "$";
                        mEdit2.setText(tipString);
                    }
                });

    }
}
