import java.util.ArrayList;

public class Matrix {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = list.size();
        while (a <= 10){
            list.add((int) Math.random()*10);
        }
    }
}
