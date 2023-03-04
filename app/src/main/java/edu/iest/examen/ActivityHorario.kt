package edu.iest.examen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityHorario : AppCompatActivity() {
    private var tvTitulo: TextView? = null
    private var tvHorario: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horario)

        tvTitulo = findViewById(R.id.tvPelicula)
        tvHorario = findViewById(R.id.tvHorario)

        val horario = intent.getStringExtra("horario")
        val nombre = intent.getStringExtra("nombre")
        tvTitulo?.text = nombre
        tvHorario?.text = horario

    }
}