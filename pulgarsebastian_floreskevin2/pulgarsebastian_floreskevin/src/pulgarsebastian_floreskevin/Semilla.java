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


/**
 *
 * @author Duoc UC
 */
public abstract class Semilla implements Vendible{
    protected int codigo;
    protected String nombre;
    protected int precio;
   
     
     
public Semilla (int codigo, String nombre, int precio){
this.codigo=codigo;
this.nombre=nombre;
this.precio=precio;
}
    
public int getCodigo(){
return codigo;
}
public void setCodigo(int codigo){
this.codigo = codigo;
}
public String getNombre( ){
return nombre;
}
public void setNombre(String nombre){
this.nombre= nombre;
}
public int getPrecio(){return precio;}
public void setPrecio(int precio){
this.precio=precio;
}
public String mostrar(){
return "Semilla{Codigo:"+codigo+" ,nombre"+nombre+" ,precio"+precio;   
}

}


