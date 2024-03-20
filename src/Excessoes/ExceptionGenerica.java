package Excessoes;

public class ExceptionGenerica {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomindador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denomindador[i] + "=" + (numeros[i] / denomindador[i]));
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            } catch (Throwable throwable) {
                System.out.println(throwable.getMessage());
                throwable.printStackTrace();
            }
        }
    }
}
