package faculdade;

public class ForEach {
    public static void main(String[] args) {
        int[] colecao = {1,2,3,4,5};

        int soma = 0;

        for (int elem: colecao){
            soma += elem;
        }
        System.out.println(soma);
    }
}
