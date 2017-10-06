package br.com.androidpro.selectioncontrols;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SwitchCompat switchCompat;
    private AppCompatCheckBox checkBox;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = (SwitchCompat) findViewById(R.id.switchButton);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(MainActivity.this, "Ligado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Desligado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBox = (AppCompatCheckBox) findViewById(R.id.checkboxButton);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(MainActivity.this, "Selecionado", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Não Selecionado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i) {
                    case R.id.option1: {
                        Toast.makeText(MainActivity.this, "Opção 1", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.option2: {
                        Toast.makeText(MainActivity.this, "Opção 2", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.option3: {
                        Toast.makeText(MainActivity.this, "Opção 3", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

            }
        });
    }
}
