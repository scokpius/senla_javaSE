package eu.selna.task4;

import java.util.Arrays;

public class Main {
    private static String[][] matrix = new String[10][10];
    private static String[] directDiagonal = new String[10];
    private static String[] sideDiagonal = new String[10];
    private static String[] diagonals = new String[20];
    private static double[] doubleMatrix = new double[0];
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {

        createMatrix10x10();
        getDirectDiagonal();
        getSideDiagonal();
        printDiagonalMatrix(directDiagonal);
        printDiagonalMatrix(sideDiagonal);
        System.out.println(Arrays.equals(directDiagonal, sideDiagonal));
        System.out.println("---------------------------------------------------------------------------------------");
        createJointMatrix();
        createDoubleMatrixAndStringBilder();
        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-2));
        for (int i = 0; i < doubleMatrix.length; i++) {
            if (i < doubleMatrix.length-1){
                System.out.print(doubleMatrix[i] + "__");
            } else{
                System.out.println(doubleMatrix[i]);
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
        printMatrix10x10();

    }

    private static void createDoubleMatrixAndStringBilder() {
        int k = 0;
        for (String element : diagonals) {
            if (element.matches("[0-9.]+")) {
                doubleMatrix = Arrays.copyOf(doubleMatrix, doubleMatrix.length + 1);
                doubleMatrix[k] = Math.rint(Double.parseDouble(element));
                k = k + 1;
            }
            if (element.matches("[A-Za-z]+")) {
                stringBuilder.append(element, 1, 4).append(", ");
            }
        }
    }

    private static void createJointMatrix() {
        for (int i = 0; i < 10; i++) {
            diagonals[i] = directDiagonal[i];
            diagonals[i+10] = sideDiagonal[i];
        }
    }

    private static void createMatrix10x10() {
        for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix.length; j++) {
                 if (j % 3 == 0){
                     matrix[i][j] = String.valueOf(Math.random() * 10 + 1).substring(0, 6);
                 }
                 else{
                     matrix[i][j] = getRandomString();
                 }
             }
         }
    }

    private static void getSideDiagonal() {
        for (int i = matrix.length; i >=0; i--) {
            for (int j = matrix.length-1; j >= 0; j--) {
                if (j + i == matrix.length-1){
                    sideDiagonal[matrix.length-1-i] = matrix[i][j];
                }
            }
        }
    }

    private static void getDirectDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j){
                    directDiagonal[i] = matrix[i][j];
                }
            }
        }
    }

    private static void printMatrix10x10() {
        for (String[] strings : matrix) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(strings[j] + "   ");
            }
            System.out.println();
        }
    }

    private static void printDiagonalMatrix(String[] mtrix) {
        for (int i = 0; i < mtrix.length; i++) {
            if (i<mtrix.length-1){
                System.out.print(mtrix[i] + "   ");
            } else {
                System.out.println(mtrix[i]);
            }
        }

    }

    private static String getRandomString() {
        int i = 0;
        String randomString = "";
        do {
            char randomChar;
            if ((Math.random()*2) < 1){
                randomChar = (char)(Math.random()*25+97);
            }else {
                randomChar = (char)(Math.random()*25+65);
            }
            randomString = randomString + randomChar;
            i++;
        }while (i<6);
        return randomString;
    }
}
