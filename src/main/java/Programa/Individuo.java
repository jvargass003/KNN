package Programa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jessi
 */

import java.util.Random;
public class Individuo {
    //Atributos
    int coordenada[] = new int[2];
    int clase;
    public Individuo(){
    
    }
    public void asignarCoordenada(int x,int y){
        coordenada[0] = x;
        coordenada[1] =y;
    
    }
    public void inicializar(int min_x, int max_x, int min_y, int max_y){
      Random random = new Random();
      coordenada[0] = random.nextInt(max_x-5) + min_x;
      coordenada[1] = random.nextInt(max_y-5) + min_y;
    }
    public int[] getCoordena(){
        
        return this.coordenada;
    }
    public void setClase(int idx){
        clase = idx;
    }
    public int getClase(){
        return clase;
    }
    
}
