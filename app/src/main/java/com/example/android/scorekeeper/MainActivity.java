package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int golesLocales;
    private int golesVisitantes;
    private int tarjetasAmarillasLocal;
    private int tarjetasAmarillasVisitante;
    private int tRojasLocales;
    private int tRojasVisitante;

    // Al inciar la app muestra un toast.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();
    }

    /**
     * Reseteamos los contadores a cero y mostramos un toast como inicio de partido nuevo.
     **/

    public void reseteo(View view) {
        mostrarGolesEquipoA(golesLocales = 0);
        mostrarGolesEquipoB(golesVisitantes = 0);
        tarjetasAmarillasEquipoA(tarjetasAmarillasLocal = 0);
        tarjetasAmarillasEquipoB(tarjetasAmarillasVisitante = 0);
        mostrarRojasL(tRojasLocales = 0);
        mostarRojasV(tRojasVisitante = 0);
        Toast toast = Toast.makeText(this, R.string.toast, Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * Muestra la puntuación dada para el Equipo A.
     */
    public void mostrarGolesEquipoA(int score) {
        TextView marcadorA = (TextView) findViewById(R.id.contadorLocal);
        marcadorA.setText(String.valueOf(score));
    }

    /**
     * CREAMOS EL MISMO METODO PARA EL EQUIPO B
     **/
    public void mostrarGolesEquipoB(int score) {

        TextView marcadorB = (TextView) findViewById(R.id.contadorVisitante);
        marcadorB.setText(String.valueOf(score));
    }

    /* SE CREAN LOS METODOS PARA MOSTAR LAS TARJETAS DE AMBOS EQUIPOS */
    public void tarjetasAmarillasEquipoA(int tarjetaL) {
        TextView amarillaLocal = (TextView) findViewById(R.id.amarillasLocales);
        amarillaLocal.setText(String.valueOf(tarjetaL));
    }

    public void tarjetasAmarillasEquipoB(int tarjetaV) {

        TextView amarillaVisitante = (TextView) findViewById(R.id.amarillasVisitantes);
        amarillaVisitante.setText(String.valueOf(tarjetaV));
    }

    public void mostrarRojasL(int rojasL) {

        TextView rojaLocal = (TextView) findViewById(R.id.rojasLocales);
        rojaLocal.setText(String.valueOf(rojasL));
    }

    public void mostarRojasV(int rojasV) {

        TextView rojaVisitante = (TextView) findViewById(R.id.rojasVisitantes);
        rojaVisitante.setText(String.valueOf(rojasV));
    }

    /*   MARCA GOL EQUIPO LOCAL    */
    public void setGolLocal(View view) {
        this.golesLocales = golesLocales + 1;
        mostrarGolesEquipoA(golesLocales);
    }

    /*  MARCA GOL EQUIPO VISITANTE  */
    public void setgolVisitante(View view) {
        this.golesVisitantes = golesVisitantes + 1;
        mostrarGolesEquipoB(golesVisitantes);
    }

    /* METODOS PARA AÑADIR LAS TARJETAS DE AMBOS EQUIPOS */
    public void setAmarillaLocal(View view) {
        this.tarjetasAmarillasLocal = tarjetasAmarillasLocal + 1;
        tarjetasAmarillasEquipoA(tarjetasAmarillasLocal);
    }

    public void setAmarillaVisitante(View view) {
        this.tarjetasAmarillasVisitante = tarjetasAmarillasVisitante + 1;
        tarjetasAmarillasEquipoB(tarjetasAmarillasVisitante);
    }

    public void setRojaLocal(View view) {
        this.tRojasLocales = tRojasLocales + 1;
        mostrarRojasL(tRojasLocales);
    }

    public void setRojaVisitante(View view) {
        this.tRojasVisitante = tRojasVisitante + 1;
        mostarRojasV(tRojasVisitante);
    }
}