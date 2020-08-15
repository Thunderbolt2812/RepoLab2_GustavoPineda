/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repolab2_gustavopineda;

import java.util.ArrayList;
import java.util.Random;
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
            System.out.println("Log in completo grax");
        }
        while (opcionMenu != 9) {
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
            switch (opcionMenu) {
                case 1:
                    System.out.println("Que tipo de universidad desea crear?");
                    System.out.println("1. Publica");
                    System.out.println("2. Privada");
                    int opcionUni = input.nextInt();
                    while (opcionUni < 1 || opcionUni > 2) {
                        System.out.println("Ingrese un valor valido");
                        opcionUni = input.nextInt();
                    }
                    if (opcionUni == 1) {
                        int costo = 0;
                        String nivel = "Publica";
                        System.out.println("Ingrese el nombre de la Universidad");
                        String nombre = input.next();
                        System.out.println("Ingrese el nombre del rector");
                        String nomRector = input.next();
                        System.out.println("Ingrese la sucursal");
                        String sucursal = input.next();
                        System.out.println("Ingrese el año de creacion de la universidad");
                        int añoCreacion = input.nextInt();
                        while (añoCreacion < 1 || añoCreacion > 2021) {
                            System.out.println("El año es invalido porfavor ingrese otra vez");
                            añoCreacion = input.nextInt();
                        }
                        System.out.println("Ingrese el numero de estudiantes que asisten a la universidad");
                        int numEstudiantes = input.nextInt();
                        while (numEstudiantes < 1) {
                            System.out.println("Numero de estudiantes invalido Ingrese de nuevo");
                            numEstudiantes = input.nextInt();
                        }
                        System.out.println("Ingrese el numero de Maestros en la universidad");
                        int numMaestros = input.nextInt();
                        while (numMaestros < 1) {
                            System.out.println("Numero de maestros invalido ingrese de nuevo");
                            numMaestros = input.nextInt();
                        }
                        Universidades.add(new Universidades(nombre, nomRector, sucursal, añoCreacion, numMaestros, numEstudiantes, costo, nivel));
                    }
                    if (opcionUni == 2) {
                        int costo = 6000;
                        String nivel = "Privada";
                        System.out.println("Ingrese el nombre de la Universidad");
                        String nombre = input.next();
                        System.out.println("Ingrese el nombre del rector");
                        String nomRector = input.next();
                        System.out.println("Ingrese la sucursal");
                        String sucursal = input.next();
                        System.out.println("Ingrese el año de creacion de la universidad");
                        int añoCreacion = input.nextInt();
                        while (añoCreacion < 1 || añoCreacion > 2021) {
                            System.out.println("El año es invalido porfavor ingrese otra vez");
                            añoCreacion = input.nextInt();
                        }
                        System.out.println("Ingrese el numero de estudiantes que asisten a la universidad");
                        int numEstudiantes = input.nextInt();
                        while (numEstudiantes < 1) {
                            System.out.println("Numero de estudiantes invalido Ingrese de nuevo");
                            numEstudiantes = input.nextInt();
                        }
                        System.out.println("Ingrese el numero de Maestros en la universidad");
                        int numMaestros = input.nextInt();
                        while (numMaestros < 1) {
                            System.out.println("Numero de maestros invalido ingrese de nuevo");
                            numMaestros = input.nextInt();
                        }
                        Universidades.add(new Universidades(nombre, nomRector, sucursal, añoCreacion, numMaestros, numEstudiantes, costo, nivel));
                    }
                    break;
                case 2:
                    System.out.println("Seleccione la posicion de la universidad que quiere eliminar");
                    int posicionElim = input.nextInt();
                    while (posicionElim < 0 || posicionElim > Universidades.size()) {
                        System.out.println("La posicion no existe vuelva a ingresarlo");
                        posicionElim = input.nextInt();
                    }
                    Universidades.remove(posicionElim);
                    break;
                case 3:
                    System.out.println("Ya estas logged in lol");
                    break;
                case 4:
                    System.out.println("Ingrese la posicion de la universidad que desea ascender");
                    int posicionAscen = input.nextInt();
                    while (posicionAscen < 0 || posicionAscen > Universidades.size()) {
                        System.out.println("La posicion no existe vuelva a ingresarlo");
                        posicionAscen = input.nextInt();
                    }
                    if (((Universidades) Universidades.get(posicionAscen)).getNivel().equals("Privada Prestigiosa")) {
                        if (contNacional == 1) {
                            System.out.println("Ya hay una Universidad Nacional");
                        } else {
                            ((Universidades) Universidades.get(posicionAscen)).setNivel("Nacional");
                            ((Universidades) Universidades.get(posicionAscen)).setCostMensual(500);
                            contNacional = 1;
                        }
                    }
                    if (((Universidades) Universidades.get(posicionAscen)).getNivel().equals("Publica")) {
                        ((Universidades) Universidades.get(posicionAscen)).setNivel("Publica Prestigiosa");
                        ((Universidades) Universidades.get(posicionAscen)).setCostMensual(200);
                    }
                    if (((Universidades) Universidades.get(posicionAscen)).getNivel().equals("Privada")) {
                        ((Universidades) Universidades.get(posicionAscen)).setNivel("Privada Prestigiosa");
                        ((Universidades) Universidades.get(posicionAscen)).setCostMensual(12000);
                    }
                    break;
                case 5:
                    for (int i = 0; i < Universidades.size(); i++) {
                        System.out.println(Universidades.get(i));
                        System.out.println("");
                    }
                    break;
                case 6:
                    int opcionMenuMod = 0;
                    while (opcionMenuMod != 7) {
                        System.out.println("Menu de Modificacion");
                        System.out.println("1. Modificar Nombre");
                        System.out.println("2. Modificar Nombre del rector");
                        System.out.println("3. Modificar Sucursal");
                        System.out.println("4. Modificar Año de creacion");
                        System.out.println("5. Modificar Numero de Estudiantes");
                        System.out.println("6. Modificar numero de Maestros");
                        System.out.println("7. Regresar al menu principal");
                        System.out.println("Elija Opcion:");
                        opcionMenuMod = input.nextInt();
                        switch (opcionMenuMod) {
                            case 1:
                                System.out.println("Ingrese la posicion de que desea modificar el nombre");
                                int opcionNom = input.nextInt();
                                while (opcionNom < 0 || opcionNom > Universidades.size()) {
                                    System.out.println("La posicion no existe vuelva a ingresarlo");
                                    opcionNom = input.nextInt();
                                }
                                System.out.println("Ingrese el nuevo nombre de la Universidad");
                                String nuevoNom = input.next();
                                ((Universidades) Universidades.get(opcionNom)).setNombre(nuevoNom);
                                System.out.println("Modificacion exitosa");
                                break;
                            case 2:
                                System.out.println("Ingrese la posicion de que desea modificar el nombre del rector");
                                int opcionNomRect = input.nextInt();
                                while (opcionNomRect < 0 || opcionNomRect > Universidades.size()) {
                                    System.out.println("La posicion no existe vuelva a ingresarlo");
                                    opcionNomRect = input.nextInt();
                                }
                                System.out.println("Ingrese el nuevo nombre del rector de la universidad");
                                String nuevoNomRect = input.next();
                                ((Universidades) Universidades.get(opcionNomRect)).setNombreRector(nuevoNomRect);
                                break;
                            case 3:
                                System.out.println("Ingrese la posicion de que desea modificar la sucursal");
                                int opcionSuc = input.nextInt();
                                while (opcionSuc < 0 || opcionSuc > Universidades.size()) {
                                    System.out.println("La posicion no existe vuelva a ingresarlo");
                                    opcionSuc = input.nextInt();
                                }
                                System.out.println("Ingrese la nueva sucursal");
                                String nuevaSuc = input.next();
                                ((Universidades) Universidades.get(opcionSuc)).setSucursal(nuevaSuc);
                                break;
                            case 4:
                                System.out.println("Ingrese la posicion de que desea modificar el año de creacion");
                                int opcionA = input.nextInt();
                                while (opcionA < 0 || opcionA > Universidades.size()) {
                                    System.out.println("La posicion no existe vuelva a ingresarlo");
                                    opcionA = input.nextInt();
                                }
                                System.out.println("Ingrese el nuevo año de creacion de la universidad");
                                int nuevoA = input.nextInt();
                                while (nuevoA < 1 || nuevoA > 2021) {
                                    System.out.println("El año es invalido porfavor ingrese otra vez");
                                    nuevoA = input.nextInt();
                                }
                                ((Universidades) Universidades.get(opcionA)).setAñoCreacion(nuevoA);
                                break;
                            case 5:
                                System.out.println("Ingrese la posicion de que desea modificar el numero de estudiantes");
                                int opcionE = input.nextInt();
                                while (opcionE < 0 || opcionE > Universidades.size()) {
                                    System.out.println("La posicion no existe vuelva a ingresarlo");
                                    opcionE = input.nextInt();
                                }
                                System.out.println("Ingrese el nuevo numero de estudiantes");
                                int nuevoE = input.nextInt();
                                while (nuevoE < 1) {
                                    System.out.println("El numero de estudiantes es invalido");
                                    nuevoE = input.nextInt();
                                }
                                ((Universidades) Universidades.get(opcionE)).setNumEstudiantes(nuevoE);
                                break;
                            case 6:
                                System.out.println("Ingrese la posicion de que desea modificar el numero de maestros");
                                int opcionM = input.nextInt();
                                while (opcionM < 0 || opcionM > Universidades.size()) {
                                    System.out.println("La posicion no existe vuelva a ingresarlo");
                                    opcionM = input.nextInt();
                                }
                                System.out.println("Ingrese el nuevo numero de maestros");
                                int nuevoM = input.nextInt();
                                while (nuevoM < 1) {
                                    System.out.println("El numero de estudiantes es invalido");
                                    nuevoM = input.nextInt();
                                }
                                ((Universidades) Universidades.get(opcionM)).setNumEstudiantes(nuevoM);
                                break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("Ingrese la posicion de la Universidad que quiere descender");
                    int posicionDescender = input.nextInt();
                    while (posicionDescender < 0 || posicionDescender > Universidades.size()) {
                        System.out.println("La posicion no existe vuelva a ingresarlo");
                        posicionDescender = input.nextInt();

                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Publica")) {
                        Universidades.remove(posicionDescender);
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Privada")) {
                        Universidades.remove(posicionDescender);
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Publica Prestigiosa")) {
                        ((Universidades) Universidades.get(posicionDescender)).setNivel("Publica");
                        ((Universidades) Universidades.get(posicionDescender)).setCostMensual(200);
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Privada Prestigiosa")) {
                        ((Universidades) Universidades.get(posicionDescender)).setNivel("Privada");
                        ((Universidades) Universidades.get(posicionDescender)).setCostMensual(6000);
                    }
                    if (((Universidades) Universidades.get(posicionDescender)).getNivel().equals("Nacional")) {
                        ((Universidades) Universidades.get(posicionDescender)).setNivel("Privada Prestigiosa");
                        ((Universidades) Universidades.get(posicionDescender)).setCostMensual(12000);
                    }
                    break;
                case 8:
                    Random R = new Random();
                    int posicionRandom = 0 + R.nextInt(Universidades.size());
                    int posicionNacional = 0;
                    if (contNacional == 1) {
                        for (int i = 0; i < Universidades.size(); i++) {
                            if (((Universidades) Universidades.get(i)).getNivel().equals("Nacional")) {
                                posicionNacional = i;
                            }
                        }
                        ((Universidades) Universidades.get(posicionNacional)).setNivel("Privada Prestigiosa");
                        System.out.println("Se elimino la Universidad Nacional actual");
                    }
                    ((Universidades) Universidades.get(posicionRandom)).setNivel("Nacional");
                    ((Universidades) Universidades.get(posicionRandom)).setCostMensual(500);
                    System.out.println("La nueva universidad nacional esta establecida");
                    break;
            }
        }
    }

}
