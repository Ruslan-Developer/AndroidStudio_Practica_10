package com.example.proyecto10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Actividad2 extends AppCompatActivity {

    private WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        web1 = findViewById(R.id.web1);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        web1.loadUrl("https://"+dato);
    }

    public void finalizar(View view){
        finish();
    }


}