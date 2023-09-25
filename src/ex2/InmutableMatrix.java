package ex2;

public class InmutableMatrix {

    private int[][] arr;

    public InmutableMatrix(int[][] arr){
        int aux = 0;
        for(int i = 0; i < arr.length; i++){
            if(aux == 0) aux = arr[i].length;
            else if(aux != arr[i].length) throw new IllegalArgumentException();
        }
        this.arr = arr;
    }

    public InmutableMatrix(int filas, int columnas){
        arr = new int[filas][columnas];
        if(filas <= 0 || columnas <= 0) throw new IllegalArgumentException();
        int aux = 0;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                arr[i][j] = aux;
                aux++;
            }
        }
    }

    public int at(int x, int y){
        if(x > arr.length || y > arr[x].length) throw new IllegalArgumentException();
        return arr[x][y];
    }
    public String toString(){
        String res = "";
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                res += arr[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

    public int[][] getArray(){
        return this.arr;
    }

}
