/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulgarsebastian_floreskevin;
import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.*;

/**
 *
 * @author Duoc UC
 */
public class Pulgarsebastian_floreskevin {
    public static void main(String[] args) throws IOException {
        Scanner entrada=new Scanner(System.in);
        int wcodigo,wprecio,waltura;
        System.out.println("Ingrese el codigo de la semilla: ");
        wcodigo=entrada.nextInt();
        if(wcodigo>=100 && wcodigo<1000){
            System.out.println("Código CORRECTO");
        }
        else{
             System.out.println("Código INCORRECTO");
             
        }
        System.out.println("Ingrese precio: ");
        wprecio=entrada.nextInt();
        if(wprecio>0){
            System.out.println("El precio ingresado es correcto");
        }
        else{
             System.out.println("El precio ingresado es incorrecto");
             
        }
        System.out.println("Ingrese la altura máxima");
        waltura=entrada.nextInt();
        if(waltura>0){
            System.out.println("La altura ingresada es correcta");
        }
        else{
             System.out.println("La altura ingresada es incorrecta");
             
        }
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la semilla: ");
        String nombre = sc.nextLine();
        System.out.println("el tamaño del string es:"+nombre.length());
        System.out.println("Su nombre es: ");
        
    }
}


