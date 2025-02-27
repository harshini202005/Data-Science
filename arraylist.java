import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add("hi");
        a.add("hello");
        a.add(1,"world");
        System.out.println(a.size());
        System.out.println(a.remove("hihi"));
        System.out.println(a.get(0));

    }
}
