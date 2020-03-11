public class Recursao {
    public static void main(String[] args) {

    }

    public static int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0 || n == 1) {
            return 1
        }
        return n * fatorial(n - 1);
    }

    public static int somatorio(int n) {
        if (n == 0) {
            return 0
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

    public static int somatorioElementos(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException();
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        return arrayList.get(0) + arrayList.subList(1, arrayList.size() - 1);
    }

    public static int findBiggest(Arraylist arraylist) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new IllegalArgumentException();
        }
        return findBiggest2(arraylist).get(0);
    }

    public static ArrayList findBiggest2(Arraylist arraylist) {
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }

        if (arraylist.get(0) > arraylist.get(1)) {
            int elementoSalvo = arraylist.get(0);
            ArrayList arrayListNovo = arraylist.subList(1, arraylist.size() - 1);
            arrayListNovo.set(0, elementoSalvo);
            return arrayListNovo;
        }
        return arraylist.subList(1, arraylist.size() - 1);
    }
}