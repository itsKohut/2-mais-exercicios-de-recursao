package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursao {
    public static void main(String[] args) {

        ArrayList<Integer> teste = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 8, 13, 21));
        System.out.println(Recursao.findBiggest(teste));

    }

    /**
     * Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
     */
    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    /**
     * Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.
     */
    public static int somatorio(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (n < 0) {
            return n + somatorio(n + 1);
        }
        return n + somatorio(n - 1);
    }

    /**
     * Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
     */
    public static int fib(int n) {
        if (n < 0 || n == 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j,
     * passados como parâmetro.
     */
    public static int somaSucessiva(int k, int j) {
        if (k == j) {
            return k;
        }
        if (k > j) {
            return j + somaSucessiva(k, j + 1);
        }
        return k + somaSucessiva(k + 1, j);
    }

    /**
     * Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome,
     * false caso contrário.
     */
    public static boolean isPal(String palavra) {
        if (palavra.isEmpty() || palavra.length() == 1) {
            return true;
        }

        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(palavra.length() - 1);

        if (primeiraLetra != ultimaLetra) {
            return false;
        } else if (palavra.length() == 2) {
            return true;
        } else {
            return isPal(palavra.substring(1, palavra.length() - 1));
        }
    }

    /**
     * Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros,
     * passado como parâmetro.
     */
    public static int somatorioElementos(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException();
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        return arrayList.get(0) + somatorioElementos((ArrayList<Integer>) arrayList.subList(1, arrayList.size()));
    }

    /**
     * Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
     */
    public static int findBiggest(ArrayList<Integer> arraylist) {
        if (arraylist == null || arraylist.size() == 0) {
            throw new IllegalArgumentException();
        }
        return (int) findBiggest2(arraylist).get(0);
    }

    public static List<Integer> findBiggest2(List<Integer> arrayList) {
        if (arrayList.size() == 1) {
            return arrayList;
        }

        if (arrayList.get(0) > arrayList.get(1)) {
            int elementoSalvo = arrayList.get(0);
            List<Integer> arrayListNovo = arrayList.subList(1, arrayList.size());
            arrayListNovo.set(0, elementoSalvo);
            return findBiggest2(arrayListNovo);
        }
        return findBiggest2(arrayList.subList(1, arrayList.size()));
    }

    /**
     * Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o
     * número em binário.
     */
    public static String convBase2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return convBase2(n / 2) + (n % 2);
    }

    /**
     * Faça um método recursivo que determina o número de dígitos de um inteiro.
     */
    public static int nroDigit(int n) {
        return 0;
    }
}