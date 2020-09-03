package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class SextoComputacion extends CursoCicloSuperior {

    public SextoComputacion(){

        super(
                R.string.txt_sexto,
                new ArrayList<Materia>() {{
                    add(new Materia("Materia 1","simple"));
                    add(new Materia("Materia 2","contraturno"));
                }},
                R.string.txt_Computacion
        );
    }
}