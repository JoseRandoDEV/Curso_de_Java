package com.youtics.scanner;

public class MainScanner {

    public static void main(String[] args) {
        ScannerClass scannerClass = new ScannerClass(); //CREO UN OBJETO DE UNA INSTANCIA DE LA CLASE
        
        scannerClass.ScannerNumber();
        System.out.println("scannerClass.getNumero() = " + scannerClass.getNumero());

        scannerClass.ScannerUser();
        System.out.println("scannerClass.getUsername = " + scannerClass.getUsername());
        
        scannerClass.ScannerLetra();
        System.out.println("scannerClass = " + scannerClass.getLetra());
    }
}
