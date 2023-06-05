import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    NaPewnoZdam obj1 = new NaPewnoZdam(" java ", 1, " Karczewski ");
    NaPewnoZdam obj2 = new NaPewnoZdam(" matma ", 1, " Wierciński ");
    NaPewnoZdam obj3 = new NaPewnoZdam(" anglik ", 6, " Hurkot ");
    Zdalem zdalem = new Zdalem(" anglik ", 6, " hurkot", 2023-06-05);


        List<NaPewnoZdam> lista = new ArrayList<>();
        lista.add(obj1);
        lista.add(obj2);
        lista.add(obj3);
        lista.add(zdalem);

        System.out.println(lista);

        lista.remove(obj2);
    }
}