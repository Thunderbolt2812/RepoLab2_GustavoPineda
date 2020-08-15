/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repolab2_gustavopineda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RepoLab2_GustavoPineda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList Universidades = new ArrayList();
        boolean verificacion = false;
        int opcionMenu = 0;
        int contNacional = 0;
        System.out.println("Primero Ingrese su log in");
        System.out.println("***Menu***");
        System.out.println("1. Crear Universidad");
        System.out.println("2. Eliminar Universidad");
        System.out.println("3. Log in");
        System.out.println("4. Ascender Universidad");
        System.out.println("5. Listar univeridad y su Sucursal");
        System.out.println("6. Modificar Universidad");
        System.out.println("7. Descender Universidad");
        System.out.println("8. RANDOM");
        System.out.println("9. Salir Corriendo");
        opcionMenu = input.nextInt();

        if (opcionMenu == 3) {
            verificacion = true;
        } else {
            while (opcionMenu != 3) {
                System.out.println("Te dije que le des log in, necio");
                System.out.println("Volve a ingresar la opcion que deseas ingresar: ");
                opcionMenu = input.nextInt();
            }
            verificacion = true;
        }
        while (verificacion) {
            verificacion = false;
            System.out.println("Usuario: ");
            String usuario = input.next();
            while (!usuario.equals("leobanegas")) {
                System.out.println("El usuario es incorrecto");
                System.out.println("Usuario: ");
                usuario = input.next();
            }
            System.out.println("Contraseña: ");
            String password = input.next();
            while (!password.equals("99")) {
                System.out.println("La contraseña es incorrecta");
                System.out.println("Contraseña: ");
                password = input.next();
            }
        }
        while (opcionMenu != 9) {
            System.out.println("Log in completo grax");
            System.out.println("");
            System.out.println("***Menu***");
            System.out.println("1. Crear Universidad");
            System.out.println("2. Eliminar Universidad");
            System.out.println("3. Log in");
            System.out.println("4. Ascender Universidad");
            System.out.println("5. Listar univeridad y su Sucursal");
            System.out.println("6. Modificar Universidad");
            System.out.println("7. Descender Universidad");
            System.out.println("8. RANDOM");
            System.out.println("9. Salir Corriendo");
            System.out.print("Elija opcion:");
            opcionMenu = input.nextInt();
            switch(opcionMenu){
                case 1:
                    System.out.println("Que tipo de universidad desea crear?");
                    System.out.println("1. Publica");
                    System.out.println("2. Privada");
                    int opcionUni=input.nextInt();
                    while(opcionUni<1||opcionUni>2){
                        System.out.println("Ingrese un valor valido");
                        opcionUni=input.nextInt();
                    }
                    if (opcionUni==1) {
                        int costo=0;
                        String nivel="Publica";
                        System.out.println("Ingrese el nombre de la Universidad");
                        String nombre=input.next();
                        System.out.println("Ingrese el nombre del rector");
                        String nomRector=input.next();
                        System.out.println("Ingrese la sucursal");
                        String sucursal=input.next();
                        System.out.println("Ingrese el año de creacion de la universidad");
                        int añoCreacion=input.nextInt();
                        while(añoCreacion<1||añoCreacion>2021){
                            System.out.println("El año es invalido porfavor ingrese otra vez");
                            añoCreacion=input.nextInt();
                        }
                        System.out.println("Ingrese el numero de estudiantes que asisten a la universidad");
                        int numEstudiantes=input.nextInt();
                        while(numEstudiantes<1){
                            System.out.println("Numero de estudiantes invalido Ingrese de nuevo");
                            numEstudiantes=input.nextInt();
                        }
                        System.out.println("Ingrese el numero de Maestros en la universidad");
                        int numMaestros=input.nextInt();
                        while(numMaestros<1){
                            System.out.println("Numero de maestros invalido ingrese de nuevo");
                            numMaestros=input.nextInt();
                        }
                        Universidades.add(new Universidades(nombre, nomRector, sucursal, añoCreacion, numMaestros, numEstudiantes, costo, nivel));
                    }
                    if (opcionUni==2) {
                        int costo=6000;
                        String nivel="Privada";
                        System.out.println("Ingrese el nombre de la Universidad");
                        String nombre=input.next();
                        System.out.println("Ingrese el nombre del rector");
                        String nomRector=input.next();
                        System.out.println("Ingrese la sucursal");
                        String sucursal=input.next();
                        System.out.println("Ingrese el año de creacion de la universidad");
                        int añoCreacion=input.nextInt();
                        while(añoCreacion<1||añoCreacion>2021){
                            System.out.println("El año es invalido porfavor ingrese otra vez");
                            añoCreacion=input.nextInt();
                        }
                        System.out.println("Ingrese el numero de estudiantes que asisten a la universidad");
                        int numEstudiantes=input.nextInt();
                        while(numEstudiantes<1){
                            System.out.println("Numero de estudiantes invalido Ingrese de nuevo");
                            numEstudiantes=input.nextInt();
                        }
                        System.out.println("Ingrese el numero de Maestros en la universidad");
                        int numMaestros=input.nextInt();
                        while(numMaestros<1){
                            System.out.println("Numero de maestros invalido ingrese de nuevo");
                            numMaestros=input.nextInt();
                        }
                        Universidades.add(new Universidades(nombre, nomRector, sucursal, añoCreacion, numMaestros, numEstudiantes, costo, nivel));
                    }
                    break;
                case 2:
                    System.out.println("Seleccione la posicion de la universidad que quiere eliminar");
                    int posicionElim=input.nextInt();
                    Universidades.remove(posicionElim);
                    break;
                case 3:
                    System.out.println("Ya estas logged in lol");
                    break;
                case 4:
                    System.out.println("Ingrese la posicion de la universidad que desea ascender");
                    int posicionAscen=input.nextInt();
                    if (((Universidades) Universidades.get(posicionAscen)).getNivel().equals("Publica")) {
                        (( Universidades ) Universidades.get(posicionAscen)).setNivel("Publica Prestigiosa");
                    }
                    if (((Universidades) Universidades.get(posicionAscen)).getNivel().equals("Privada")) {
                        (( Universidades ) Universidades.get(posicionAscen)).setNivel("Privada Prestigiosa");
                    }
                    if (((Universidades) Universidades.get(posicionAscen)).getNivel().equals("Privada Prestigiosa")) {
                        if (contNacional==1) {
                            System.out.println("Ya hay una Universidad Nacional");
                        }else{
                           (( Universidades ) Universidades.get(posicionAscen)).setNivel("Nacional");
                            contNacional=1; 
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < Universidades.size(); i++) {
                        System.out.println(Universidades.get(i));
                        System.out.println("");
                    }
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Ingrese la posicion de la Universidad que quiere descender");
                    int posicionDescender=input.nextInt();
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Publica Prestigiosa")) {
                        (( Universidades ) Universidades.get(posicionDescender)).setNivel("Publica");
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Privada Privada")) {
                        (( Universidades ) Universidades.get(posicionDescender)).setNivel("Privada");
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Publica")) {
                        Universidades.remove(posicionDescender);
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Privada")) {
                        Universidades.remove(posicionDescender);
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Nacional")) {
                        (( Universidades ) Universidades.get(posicionDescender)).setNivel("Privada Prestigiosa");
                    }
                    break;
                case 8:
                    break;
            }
        }
    }

}
