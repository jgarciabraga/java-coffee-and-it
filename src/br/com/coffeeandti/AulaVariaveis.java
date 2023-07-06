package br.com.coffeeandti;

public class AulaVariaveis {

    public static void main(String[] args){
        String hello = "CoffeeAndIT, meu caracter é:";
        int meuCaracter = 'a';
        hello = hello + " " + meuCaracter;
        System.out.println(hello);
        System.out.println("Converte o valor do char para seu correspondente em inteiro");
        String stringBoolean = "O boolean ocupa 1 bit";
        String stringChar = "O char ocupa 16 bits";
        String stringByte = "O byte ocupa 8 bits";
        String stringShort = "O short ocupa 16 bits";
        String stringInt = "O int ocupa 32 bits";
        String stringLong = "O long ocupa 64 bits";
        String stringFloat = "O float ocupa 32 bits";
        String stringDouble = "O double ocupa 64 bits";
        System.out.println(stringBoolean);
        System.out.println(stringChar);
        System.out.println(stringByte);
        System.out.println(stringShort);
        System.out.println(stringInt);
        System.out.println(stringLong);
        System.out.println(stringFloat);
        System.out.println(stringDouble);
    }
}
