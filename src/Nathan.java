import java.util.ArrayList;
import java.util.List;

public class Nathan {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(123);

        for (Integer list :
                lista) {
            System.out.println(list);
        }

    }
}
