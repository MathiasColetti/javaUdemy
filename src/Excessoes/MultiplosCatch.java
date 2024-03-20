package Excessoes;

public class MultiplosCatch {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomindador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denomindador[i] + "=" + (numeros[i] / denomindador[i]));
            } catch (ArithmeticException exception) {
                System.out.println("Erro ao dividir por 0");
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Posção do Array INvalida");
            } catch (Throwable throwable) {
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
