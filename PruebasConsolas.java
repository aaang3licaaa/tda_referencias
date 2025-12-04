/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases_Bibliotecas;
// Importa la clase de la otra carpeta
import tda.lista.generica.ListaG;
/**
 *
 * @author Marco Alejandro
 */
public class PruebasConsolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaG LL=new ListaG<>();
        ListaG LB=new ListaG<>();
        ListaG LA=new ListaG<>(); 
        Alumno A1=new Alumno(22232124,43234,"Marco Ale",'M',21,70831560,"Ing Informatica");
        Alumno A2=new Alumno(3242,214,"Alexa",'F',24,70834260,"Medicina");
        Alumno AX = new Alumno(3242,0,"",'F',19,0,"");
        Bibliotecario B1=new Bibliotecario(4303,24241,"Jose",'M');
        Bibliotecario B2=new Bibliotecario(232,123,"Ramirez",'M');
        Bibliotecario BX=new Bibliotecario(4303,0,"",'M');
        Bibliotecario BX1=new Bibliotecario(4301,1415,"Fernanda",'F');
        Libros L1=new Libros(12,"Principito","Antoine de Saint-Exupéry","Infantil",12);
        LA.insertar(A1);
        LA.insertar(A2);
        LB.insertar(B1);
        LB.insertar(B2);
        LL.insertar(L1);
        System.out.println(LB);
        System.out.println(LB);
                

    }
    
}
