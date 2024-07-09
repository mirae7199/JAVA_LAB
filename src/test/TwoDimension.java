package test;

public class TwoDimension {
    public static void main(String[] args) {
        char Array[][] = new char[13][2];

        Array[0][0] = 'A';



        for(int i = 0; i<Array.length; i++) {
            for(int j = 0; j<Array[i].length; j++) {
                System.out.print(Array[i][j]);
            }
        }
    }
}
