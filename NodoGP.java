/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.lista.generica;
import java.io.Serializable;
/**
 *
 * @author Marco Alejandro
 */
public class NodoGP<ele> implements Serializable {
    ele Dato;
    NodoGP<ele> Enlace;
    
    public NodoGP(){
        Enlace=null;
    }
    
    public NodoGP(ele Dato){
        this.Dato=Dato;
        Enlace=null;
    }
    
    public void SetDato(ele Dato){
        this.Dato=Dato;
    }
    
    public ele GetDato(){
        return Dato;
    }
    
    public void SetEnlace(NodoGP<ele> P){
        Enlace=P;
    }
    
    public NodoGP<ele> GetEnlace(){
        return Enlace;
    }
    
    //@Override
    public String toString(){
        return "NodoGP["+"Dato="+Dato+",Enlace="+Enlace+"}";
    }
}

