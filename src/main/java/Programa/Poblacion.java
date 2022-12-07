/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;
import Programa.Individuo;
import java.awt.List;
import java.util.ArrayList;
/**
 *
 * @author jessi
 */
public class Poblacion {
    //Atributos
    ArrayList<Individuo> individuos = new ArrayList<Individuo>();
    int tam;
    public Poblacion(int min_x, int max_x, int min_y, int max_y,int size){
        for(int i=0;i<size;i++){
            individuos.add(new Individuo());
            individuos.get(i).inicializar(min_x,max_x,min_y,max_y);
            int coordenada[] = individuos.get(i).getCoordena();
            System.out.print("\n"+i+ " X: "+coordenada[0]+" Y: "+ coordenada[1]);
        }
    }
    public int[] getCoordena(int indx){
        return individuos.get(indx).getCoordena();
    }
    
    public ArrayList getIndividuos(){
        return individuos;
    
    }
    public void agregarIndividuo(Individuo ind){
        individuos.add(ind);
    }
    
}
