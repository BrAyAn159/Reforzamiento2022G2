package reforsamiento;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicios {

    public static void mostrarcursoDia() {
        //Definir Variable
        int diaSen;
        String mensaje;
        //Leer datos
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana:\n1=Dom"+"\n2=Lun\n3=Mar\n4=Mier\n5=Jue\n6=vie\n7=Sab");
        diaSen=lt.nextInt();
        //Proceso
        if (diaSen==1 || diaSen==7) {
            mensaje="No hay clase";
        }else if(diaSen==2){
            mensaje="Matematica";
        }else if(diaSen==3 || diaSen==5){
            mensaje="Fundamentos de programacion";
        }else if(diaSen==4){
            mensaje="Capacidades comunicativa";
        }else if(diaSen==6){
            mensaje="Introduccion ala Ingenieria de Sistemas";
        }else{
            mensaje="El dia que coloco no existe";

        }
        //datos de salida
        System.out.println("Ese dia toca el curso de: "+mensaje);
    }   


    
    public static void main(String[] args) {
        mostrarcursoDia();
    }
    }

    
