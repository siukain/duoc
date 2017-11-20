/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulgarsebastian_floreskevin;

/**
 *
 * @author Duoc UC
 */
public class Flor extends Semilla {
    private String color;
     



public Flor(int codigo, String nombre, int precio,String color){
super(codigo,nombre,precio);
this.color=color;
}

public void setColor(String color){
this.color=color;
}
public String getColor(){
return color;
}


@Override
public double calcularPrecioOferta(){
    double precioOferta = 0;
if("Rojo".equals(color)){
    precioOferta=precio;
}
else{
    precioOferta=precio*desc_flor;
}
return precioOferta;
}
}
