/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulgarsebastian_floreskevin;
import java.util.ArrayList;
/**
 *
 * @author Duoc UC
 */
public class Inventario {
         ArrayList<Semilla> listado;           

public void registro(){
      listado = new ArrayList<>();
}

public void agregarSemilla(Semilla semilla){
if (this.buscarSemilla(semilla.getCodigo())==false){
listado.add(semilla);
System.out.println("Semilla Ingresada");}
else {
System.out.println("Semilla ya existe");
}
}
public void listarSemilla(){
for(Semilla tmp:listado)
{
    System.out.println(tmp.mostrar());
}
}
public boolean buscarSemilla(int codigo1){
boolean valida=false;
for(Semilla tmp:listado){
if (tmp.getCodigo()==(codigo1)){
valida=true;
break;}
    }
return valida;
}


public int eliminarSemilla(int codigo1){
    int contador = 0;
    for(int i=0;i<listado.size();i++){
    if(listado.get(i).getCodigo()==codigo1){
        listado.remove(i);
        contador++;
        i--;
    }}
    return contador;

}


}