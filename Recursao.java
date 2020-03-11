package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursao {
    public static void main(String[] args) {

        ArrayList<Integer> teste = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 8, 13, 21));
        System.out.println(Recursao.findBiggest(teste));

    }

    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

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

    public static int fib(int n) {
        if (n < 0 || n == 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static int somaSucessiva(int k, int j) {
        if (k == j) {
            return k;
        }
        if (k > j) {
            return j + somaSucessiva(k, j + 1);
        }
        return k + somaSucessiva(k + 1, j);
    }

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
}