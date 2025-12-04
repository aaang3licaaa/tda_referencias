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
public class ListaG<Tipovar extends Comparable> implements Serializable {
    NodoGP<Tipovar> L;//La Cabeza
    int Cant;
    //CompareTo
//    devolviendo un número 
//    negativo, cero o un número positivo para indicar si el objeto actual es menor, igual o mayor
    public ListaG(){
        L=null;
        Cant=0;
    }
    
    public int cantidad(){
        return Cant;
    }
    
    public void insertar(Tipovar Dato){
        if (L==null) {
            NodoGP P=new NodoGP<Tipovar>();
            P.SetDato(Dato);
            L=P;
            Cant++;
        }else{
            NodoGP<Tipovar> Ant=null;
            NodoGP<Tipovar> Aux=L;
            while ((Aux!=null)&&(Aux.GetDato().compareTo(Dato)<=0)){
                Ant=Aux;
                Aux=Aux.GetEnlace();
            }
            NodoGP P= new NodoGP<Tipovar>(Dato);
            if (Ant==null) {
                P.SetEnlace(L);
                L=P;
                Cant++;
            }else{
                if(Ant.GetDato().compareTo(Dato)!=0){
                    Ant.SetEnlace(P);
                    P.SetEnlace(Aux);
                    Cant++;
                }    
            }
        }
    }
    
    public String Mostrar(){
        String S="Vacia!!!";
        if (L!=null) {
            S="";
            NodoGP P=L;
            while (P!=null){
                if (P.GetEnlace()==null) {
                    S=S+P.GetDato();
                }else{
                    S=S+P.GetDato()+"->";
                }
                P=P.GetEnlace();
            }
        }
        return S;
    }
    
    public Boolean Buscar(Tipovar Dato){
        if (L==null) {
            return (false);
        }else{
            NodoGP<Tipovar> Aux = L;
            while ((Aux!=null)&&(Aux.GetDato().compareTo(Dato)!=0)){
                //System.out.println(Aux.Dato);
                Aux=Aux.GetEnlace();
            }
            if (Aux!=null) {
                return true;
            }else{
                return false;
            }
        }
    }
    
    public Tipovar GetDato(int pos){
        if (pos<=Cant) {
            NodoGP<Tipovar> Aux=L;
            for (int i = 1; i < pos; i++) {
                Aux=Aux.GetEnlace();
            }
            return (Aux.GetDato()); 
        }else{
            return null;
        }
    }
    
    public Tipovar BuscarObj(Tipovar Dato){
        if (L==null) {
            return null;
        }else{
            NodoGP<Tipovar> Aux = L;
            while ((Aux!=null)&&(Aux.GetDato().compareTo(Dato)!=0)){
                Aux=Aux.GetEnlace();
            }
            if (Aux!=null) {
                Dato=Aux.GetDato();
                return Dato;
            }else{
                return null;
            }
        }
    }
    
    public boolean Modificar(Tipovar Dato,Tipovar Dato1){
        if (L==null) {
            return false;
        }else{
            NodoGP<Tipovar> Aux = L;
            while ((Aux!=null)&&(Aux.GetDato().compareTo(Dato)!=0)){
                Aux=Aux.GetEnlace();
            }
            if (Aux!=null) {
                Aux.Dato=Dato1;
                return true;
            }
            return false;
        }
    }
    
    public void Eliminar(Tipovar ele){
        if (L!=null) {
            NodoGP<Tipovar> Aux=L;
            NodoGP<Tipovar> Ant=null;
            while ((Aux!=null)&&(Aux.GetDato().compareTo(ele)!=0)){
                Ant=Aux;
                Aux=Aux.GetEnlace();
            }
            if (Aux!=null) {
                if (Ant==null) {
                    L=L.GetEnlace();
                    Cant--;
                }else{
                    Ant.SetEnlace(Aux.GetEnlace());
                    Cant--;
                }
            }
        }
    }
    
    @Override
    public String toString(){
        String S="";
        NodoGP<Tipovar> Aux = L;
        while (Aux!=null){
            S=S+Aux.GetDato()+"\n";
            Aux=Aux.GetEnlace();
        }  
        return S;
    }
    
}
