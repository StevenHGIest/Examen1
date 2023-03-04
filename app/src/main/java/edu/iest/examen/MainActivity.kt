package edu.iest.examen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var spOpciones: Spinner? = null
    private var bnComprar: Button? = null
    private var tvCerrar: TextView? = null
    private var tvTitulo: TextView? = null
    private var ivImagen: ImageView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spOpciones = findViewById(R.id.spOpciones)
        bnComprar = findViewById(R.id.bnComprar)
        tvCerrar = findViewById(R.id.tvCerrar)
        tvTitulo = findViewById(R.id.tvTitulo)
        ivImagen = findViewById(R.id.ivImagen)

        val adaptador = ArrayAdapter.createFromResource(this, R.array.horas, android.R.layout.simple_spinner_item)
        spOpciones?.adapter = adaptador

        eventos()
    }

    fun eventos(){
        tvCerrar?.setOnClickListener{
            finish()
        }

        bnComprar?.setOnClickListener {
            if (spOpciones?.selectedItem.toString() == "15:00 SUB"){
                Toast.makeText(this, "Lo sentimos se han agotado las entradas", Toast.LENGTH_LONG).show()
            }else if (spOpciones?.selectedItem.toString() == "17:00 3D ESP"){
                Toast.makeText(this, "Lo sentimos se han agotado las entradas", Toast.LENGTH_LONG).show()
            }else if(spOpciones?.selectedItem.toString() == "19:00 ESP"){
                Toast.makeText(this, "Lo sentimos se han agotado las entradas", Toast.LENGTH_LONG).show()
            }else{
                val i = Intent(this, ActivityHorario::class.java)
                i.putExtra("horario", spOpciones?.selectedItem.toString())
                i.putExtra("nombre", tvTitulo?.text.toString())
                startActivity(i)
            }
        }




    }
}