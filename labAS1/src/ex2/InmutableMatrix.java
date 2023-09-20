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
        this.arr = new int[filas][columnas];
        if(filas <= 0 || columnas <= 0) throw new IllegalArgumentException();
        int aux = 0;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                this.arr[i][j] = aux;
                aux++;
            }
        }
    }

    public int[][] getArray(){
        return this.arr;
    }

    public void setArray(int[][] arr){
        this.arr = arr;
    }

}
