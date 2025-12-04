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
public class Libros implements Comparable,Serializable{
     int Codigo;
     String Nombre;
     String Autor;
     String Categoria;
     int Stock;

    public Libros(int Codigo, String Nombre, String Autor, String Categoria, int Stock) {
        if (Stock >= 0) {
            this.Codigo = Codigo;
            this.Nombre = Nombre;
            this.Autor = Autor;
            this.Categoria = Categoria;
            this.Stock = Stock;   
        }else{
            System.out.println("Crear::No stock NEGATIVOS");
        }
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public int getStock() {
        return Stock;
    }
    
    public void AumentarLibros(int cant){
        if (cant>0) {
            this.Stock=this.Stock+cant;
        }else{
            System.out.println("Aumentar::No se puede aumentar con negativos");
        }
        
    }
    
    public void DecrementarLibros(int cant){
        if (cant>0) {
            this.Stock=this.Stock-cant;
        }else{
            System.out.println("Decrementar::No se puede decrementar con negativos");
        }
    }

    @Override
    public String toString() {
        return "Libros{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Categoria=" + Categoria + ", Stock=" + Stock + '}';
    }
    
    @Override
    public int compareTo(Object o){
        Libros A=(Libros)o;
        return ((getCodigo()<A.getCodigo())?-1:(getCodigo()>A.getCodigo())?1:0);
    }
}
