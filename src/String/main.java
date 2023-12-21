package String;

public class main {

    public static void comparaValores(float a, float b) {
        if (a > b) {
            System.out.println("O numero " + a + " é maior que " + b);
        } else if (a < b) {
            System.out.println("O numero " + b + " é maior que " + a);
        } else {
            System.out.println("São iguais");
        }
    }

    public static void main(String[] args) {
        /*Paciencia*/
        String nome = "-  Mathias  -";

        System.out.println(nome.toUpperCase());
        System.out.println(nome.replace("M", "n")); // Replace
        System.out.println(nome.trim());


        comparaValores(3, 2);

    }
}
