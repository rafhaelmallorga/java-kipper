import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10_000;
        int i = 100_000;
        long l = 1_000_000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'a';
        String str = "Mallorga";
        boolean bool = true;

        if (bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        colecaoDeInteiros[1] = 666;

        System.out.println(Arrays.toString(colecaoDeInteiros));

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mallorga");
        nomes.add("Rafhael");
        nomes.add("Bruna");
        nomes.add("Rafaela");
        nomes.add("Spock");
        nomes.add("Yoda");

        System.out.println(nomes.get(1));
        nomes.remove("Mallorga");

        System.out.println(Arrays.toString(nomes.toArray()));

//        for (int ii = 0; ii < nomes.size(); ii++) {
//            System.out.println(nomes.get(ii));
//        }

        String[] nomesArr = new String[10];
        nomesArr[0] = "Mallorga";
        nomesArr[1] = "Rafhael";
        nomesArr[2] = "Bruna";
        nomesArr[3] = "Rafaela";

//        for (int ii = 0; ii < nomesArr.length; ii++) {
//            System.out.println(nomesArr[ii]);
//        }

        for (String nome : nomesArr) {
            System.out.println(nome);
        }

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        System.out.println(resultado);
        System.out.println(resultadoInt);

        int meuInt = 10;
        double meuDouble = meuInt;

        System.out.println(meuInt);
        System.out.println(meuDouble);

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        System.out.println(meuInt2);

        String meuString2 = Integer.toString(meuInt2);
        System.out.println(meuString2);
    }
}