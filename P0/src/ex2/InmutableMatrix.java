package ex2;

import java.util.Arrays;

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
        int aux = 1;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                arr[i][j] = aux;
                aux++;
            }
        }
    }

    public int[][] toArray2D(){
        return Arrays.copyOf(arr, arr.length);
    }

    public int rowCount(){
        return arr.length;
    }

    public int columnCount(){
        return arr[0].length;
    }

    public int at(int x, int y){
        if(x >= arr.length || y >= arr[x].length) throw new IllegalArgumentException();
        return arr[x][y];
    }

    public InmutableMatrix reverse(){
        int[][] rev = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                rev[i][j] = arr[i][arr[i].length - j - 1];
            }
        }
        return new InmutableMatrix(rev);
    }

    public InmutableMatrix transpose(){
        int[][] tras = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                tras[j][i] = arr[i][j];
            }
        }
        return new InmutableMatrix(tras);
    }

    public InmutableMatrix reshape(int col){
        if((arr.length * arr[0].length) % col != 0) throw new IllegalArgumentException();

        int newFiles = (arr.length * arr[0].length) / col;
        int[][] res = new int[newFiles][col];

        int aux = 0;
        int[] vals = new int[arr.length * arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                vals[aux] = arr[i][j];
                aux++;
            }
        }

        aux = 0;
        for(int i = 0; i < newFiles; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = vals[aux];
                aux++;
            }
        }

        return new InmutableMatrix(res);
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(j==0)
                    res.append("[" + arr[i][j] + ", ");
                else if (j == arr[i].length - 1)
                    res.append(arr[i][j] + "");
                else
                    res.append(arr[i][j] + ", ");
            }
            res.append("]\n");
        }
        return res.toString();
    }

}
