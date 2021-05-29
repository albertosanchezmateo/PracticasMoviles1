package com.example.practica2;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pregunta {
    public int tipoPregunta;

    @PrimaryKey @NonNull
    public String enunciado;

    public String respuesta1;

    public String respuesta2;

    public String respuesta3;

    public String respuesta4;

    public String respuestaCorr;

    public int ruta1;

    public int ruta2;

    public int ruta3;

    public int ruta4;

    /*public Pregunta( int tipoPregunta, String enunciado, String respuesta1, String respuesta2, String respuesta3, String respuesta4, String respuestaCorr) {

        this.tipoPregunta = tipoPregunta;
        this.enunciado = enunciado;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuestaCorr = respuestaCorr;
    }*/
    public Pregunta( String enunciado, int ruta1, int ruta2, int ruta3, int ruta4, String respuestaCorr, int tipoPregunta){
        this.tipoPregunta = tipoPregunta;
        this.enunciado = enunciado;
        this.ruta1 = ruta1;
        this.ruta2 = ruta2;
        this.ruta3 = ruta3;
        this.ruta4 = ruta4;
        this.respuestaCorr = respuestaCorr;
    }

    public int getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(int tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public int getRuta1() {
        return ruta1;
    }

    public void setRuta1(int respuesta1) {
        this.ruta1 = respuesta1;
    }

    public int getRuta2() {
        return ruta2;
    }

    public void setRuta2(int respuesta2) {
        this.ruta2 = respuesta2;
    }

    public int getRuta3() {
        return ruta3;
    }

    public void setRuta3(int respuesta3) {
        this.ruta3 = respuesta3;
    }

    public int getRuta4() {
        return ruta4;
    }

    public void setRuta4(int respuesta4) {
        this.ruta4 = respuesta4;
    }

    public String getRespuestaCorr() {
        return respuestaCorr;
    }

    public void setRespuestaCorr(String respuestaCorr) {
        this.respuestaCorr = respuestaCorr;
    }
}
