package com.example.renato_menu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityDisciplinas extends AppCompatActivity {

    private String opcao;
    private ListView listViewDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_disciplinas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();
        opcao = intent.getStringExtra("periodo");

        if (opcao != null) {
            listViewDisciplinas = findViewById(R.id.listViewDisciplinas);
            ArrayAdapter<String> arrayAdapter = Util.criaMenu(ActivityDisciplinas.this,opcao);
            listViewDisciplinas.setAdapter(arrayAdapter);
        }

    }


}
