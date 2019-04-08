/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

public class OperacionesGeometricas {
    
    public float areaRectangulo(float a, float b){
        return a*b;
    }
    public float areaTriangulo(float a,float b){
        return (a*b)/2;
    }
    public double circuloLongitud(float a){
        return 2*Math.PI* a;
    }
    public double cirucloArea(double a){
        return Math.PI*Math.pow(a,2);
    }
    public float velocidad(float a,float b){
        a*=1000;
        b*=60;
        return a/b;
    }
    
    public double hipotenusa(float a ,float b){
        return Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
    }
}
