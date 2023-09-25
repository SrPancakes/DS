package ex2;

public class ex2 {

    public static void main(String[] args) {
        /*InmutableMatrix m = new InmutableMatrix(4, 4);
        for(int[] i : m.getArray()){
            for(int j : i){
                System.out.println(j);
            }
        }*/

        int[][] arr = {{1,2,3}, {2,3,5}};
        InmutableMatrix m = new InmutableMatrix(arr);
        System.out.println(m.toString());
    }

}
