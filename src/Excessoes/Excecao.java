package Excessoes;

public class Excecao {
    public static void main(String[] args) {
        int[] vetor = new int[4];
        System.out.println("Antes da Exception");

        try {
            vetor[4] = 1;
            System.out.println("Esse texto não sera impresso");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Excessao ao acessar um indice de vetor que ñão existe");
        }
        System.out.println("Esse texto serrá impresso apos tentarr");

    }
}
