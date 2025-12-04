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
public class Alumno implements Comparable,Serializable{
    int Registro;
    int CI;
    String Nombre;
    char Sexo;
    int Edad;
    int Telefono;
    String Carrera;

    public Alumno(int Registro, int CI, String Nombre, char Sexo, int Edad, int Telefono, String Carrera) {
        if (Edad>=18 && Edad<=90 && (Sexo=='M' || Sexo == 'F')) {
            this.Registro = Registro;
            this.CI = CI;
            this.Nombre = Nombre;
            this.Sexo = Sexo;
            this.Edad = Edad;
            this.Telefono = Telefono;
            this.Carrera = Carrera;           
        }else{
            System.out.println("Crear::Edad debe ser entre 18 a 90");
            System.out.println("Crear::Sexo debe ser M a F");
        }
    }

    public int getRegistro() {
        return Registro;
    }

    public int getCI() {
        return CI;
    }

    public String getNombre() {
        return Nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setEdad(int Edad) {
        if (Edad<91 && Edad>=18) {
            this.Edad = Edad;
        }else{
            System.out.println("Edad::Edad debe ser entre 18 a 90");
        }
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    public void setCarrera(String Carrera){
        this.Carrera=Carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Registro=" + Registro + ", CI=" + CI + ", Nombre=" + Nombre + ", Sexo=" + Sexo + ", Edad=" + Edad + ", Telefono=" + Telefono + ", Carrera=" + Carrera + '}';
    }
    
    @Override
    public int compareTo(Object o){
        Alumno A=(Alumno)o;
        return ((getRegistro()<A.getRegistro())?-1:(getRegistro()>A.getRegistro())?1:0);
    }
}
