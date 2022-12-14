import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Запуск метода сканер
        int x = scanner.nextInt();//Создание переменных для расширения массива
        int y = scanner.nextInt();
        twoArray(x,y); //Вызов метода в коттором у нас реализован двумерный массив и его вывод
    }
    public static void twoArray(int x, int y){
        int [][] twoArr= new int [y][x];
        for(int i = 0; i < y; i++) {
            for(int j=0; j < x; j++){
                Scanner scanner = new Scanner(System.in);
                int s = scanner.nextInt();//Переменные для заполнения массива
                twoArr[i][j] = s;
            }
        }
        System.out.println("Двухмерный массив twoArr:  " + Arrays.deepToString(twoArr)); //Вывод двумерного массива через вспомогательный метод Arrays
    }
}
