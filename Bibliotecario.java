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
public class Bibliotecario implements Comparable,Serializable{
    int Codigo;
    int CI;
    String Nombre;
    char sexo;

    public Bibliotecario(int Codigo, int CI, String Nombre, char sexo) {
        if (sexo =='F' || sexo =='M') {
            this.Codigo = Codigo;
            this.CI = CI;
            this.Nombre = Nombre;
            this.sexo = sexo;    
        }else{
            System.out.println("Crear::Sexo erroneo");
        }
    }
    
    public int getCod(){
        return Codigo;
    }
    public int getCI(){
        return CI;
    }
    public String getNom(){
        return Nombre;
    }
    public char getSexo(){
        return sexo;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "Codigo=" + Codigo + ", CI=" + CI + ", Nombre=" + Nombre + ", sexo=" + sexo + '}';
    }

    @Override
    public int compareTo(Object o){
        Bibliotecario A=(Bibliotecario)o;

        return ((getCod()<A.getCod())?-1:(getCod()>A.getCod())?1:0);
    }
    
}
