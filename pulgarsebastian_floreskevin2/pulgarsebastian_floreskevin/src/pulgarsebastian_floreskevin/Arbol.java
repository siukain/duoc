/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulgarsebastian_floreskevin;

import static pulgarsebastian_floreskevin.Vendible.desc_flor;

/**
 *
 * @author Duoc UC
 */
public class Arbol extends Semilla {
    private int alturaMaxima;


public Arbol(int codigo, String nombre, int precio, int alturaMaxima){
super(codigo,nombre,precio);
this.alturaMaxima=alturaMaxima;
}

public void setAlturamaxima(int alturaMaxima){
this.alturaMaxima=alturaMaxima;
}

public int getAlturamaxima(){
return alturaMaxima;
}


@Override
public double calcularPrecioOferta(){
    double precioOferta = 0;
if(alturaMaxima<=180){

    precioOferta=precio;
}
else{
    precioOferta=precio*desc_arbol;
}
return precioOferta;
}
}