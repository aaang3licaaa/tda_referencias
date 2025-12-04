/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Bibliotecas;

import java.io.Serializable;

/**
 *
 * @author Marco Alejandro
 */
public class FichaPrestamo implements Comparable,Serializable{
    int NroV;
    int CodigoL;
    int CodigoB;
    int RegistroE;

    public FichaPrestamo(int NroV, int CodigoL, int CodigoB, int RegistroE) {
        this.NroV = NroV;
        this.CodigoL = CodigoL;
        this.CodigoB = CodigoB;
        this.RegistroE = RegistroE;
    }

    public int getNroV() {
        return NroV;
    }

    public int getCodigoL() {
        return CodigoL;
    }

    public int getCodigoB() {
        return CodigoB;
    }

    public int getRegistroE() {
        return RegistroE;
    }
    
    @Override
    public int compareTo(Object o){
        FichaPrestamo A=(FichaPrestamo)o;
        return ((getNroV()<A.getNroV())?-1:(getNroV()>A.getNroV())?1:0);
    }
}
