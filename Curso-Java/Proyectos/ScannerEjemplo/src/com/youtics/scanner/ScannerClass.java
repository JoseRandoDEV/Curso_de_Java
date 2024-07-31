package com.youtics.scanner;

import java.util.Scanner;

public class ScannerClass {
    private int numero;
    private String username;
    private Character letra;

    public void ScannerNumber()
    {
        System.out.println("Ingrerse un numero...");
        Scanner scanner = new Scanner(System.in);
        this.numero = scanner.nextInt();
    }

    public void ScannerUser()
    {
        System.out.println("Ingrerse el nombre de Usuario: ");
        Scanner scanner = new Scanner(System.in);
        this.username = scanner.nextLine();
    }

    public void ScannerLetra()
    {
        System.out.println("Ingrerse solo UNA letra: ");
        Scanner scanner = new Scanner(System.in);
        this.letra = scanner.next().charAt(0);
    }

    public int getNumero() {      //generate-geeter genera un metodo que devuelve el valor
        return numero;
    }

    public String getUsername() {
        return username;
    }

    public Character getLetra() {
        return letra;
    }
}

