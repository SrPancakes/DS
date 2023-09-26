package ex2;

public class ex2 {

    public static void main(String[] args) {
        InmutableMatrix m = new InmutableMatrix(3, 4);
        InmutableMatrix x = m.reshape(6);
        System.out.println(x.toString());
    }

}
