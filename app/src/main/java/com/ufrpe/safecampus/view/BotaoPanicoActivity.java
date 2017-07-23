package com.ufrpe.safecampus.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.ufrpe.safecampus.R;



public class BotaoPanicoActivity extends AppCompatActivity  {
    private Switch btnPanico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botao_panico);
        btnPanico = (Switch) findViewById(R.id.swPanico);
        btnPanico.setChecked(false);
        btnPanico.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ligarModoPanico(buttonView);
                } else {
                    desligarModoPanico(buttonView);
                }

            }
        });

    }




    @Override
    public void onBackPressed(){
        Intent voltar = new Intent(BotaoPanicoActivity.this, TelaInicialActivity.class);
        startActivity(voltar);
        finish();
    }

    //pegar o evento da tela do botão do panico quando
    public void ligarModoPanico(View view) {
        Toast.makeText(this,"Ligado ", Toast.LENGTH_SHORT).show();

    }
    public void desligarModoPanico(View view){

        Toast.makeText(this,"Desligado " ,Toast.LENGTH_SHORT).show();
    }


}