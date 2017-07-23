package com.ufrpe.safecampus.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ufrpe.safecampus.R;

public class LoginActivity extends AppCompatActivity {

    private Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        entrar = (Button) findViewById(R.id.btnEntrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInicial = new Intent(getApplication(), TelaInicialActivity.class);
                startActivity(telaInicial);
            }
        });
    }
}
