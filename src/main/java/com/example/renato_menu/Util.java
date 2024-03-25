package com.example.renato_menu;

import android.content.Context;
import android.widget.ArrayAdapter;

public class Util {
    public static ArrayAdapter criaMenu(Context context, String opcao) {
        String[] disciplinas = preencherLista(context, opcao);
        return preencherAdapter(context, disciplinas);
    }

    private static ArrayAdapter preencherAdapter(Context context, String[] disciplinas) {
        return new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, disciplinas);
    }

    private static String[] preencherLista(Context context, String opcao) {
        switch (opcao) {
            case "1º Periodo":
                return context.getResources().getStringArray(R.array.primeiro_Array);
            case "2º Periodo":
                return context.getResources().getStringArray(R.array.segundo_Array);
            case "3º Periodo":
                return context.getResources().getStringArray(R.array.terceiro_Array);
            case "4º Periodo":
                return context.getResources().getStringArray(R.array.quarto_Array);
            case "5º Periodo":
                return context.getResources().getStringArray(R.array.quinto_Array);
            case "6º Periodo":
                return context.getResources().getStringArray(R.array.sexto_Array);
        }
        return new String[0];
    }
}
