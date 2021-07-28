package br.com.bytebank.banco.test;

public class TesteString {

    public static void main(String[] args) {
        String nome = "Mario"; //object literal
        String outro = new String("Alura"); //má prática, sempre prefere a sintaxe literal

        String novo = outro.replace("A", "a");

        System.out.println(novo);

        String novo2 = nome.toLowerCase(); //também teste toUpperCase()

        System.out.println(novo2);

        char c = nome.charAt(3); //char i
        System.out.println(c);

        int pos = nome.indexOf("rio");
        System.out.println(pos);

        String sub = nome.substring(2);
        System.out.println(sub);

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        System.out.println(nome.contains("i"));
        String[] nova = nome.split("");
        for (int i = 0; i < nova.length; i++) {
            System.out.println(nova[i]);
        }
    }
}