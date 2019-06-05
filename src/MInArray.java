import java.util.Scanner;

public class MInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int[] array = new int[Size];
        System.out.println("Nhap phan tu cho mang");
        for (int i=0;i<array.length;i++){
            int number =scanner.nextInt();
            array[i] = number;
        }
        int min =array[0];
        for (int j=0;j<array.length;j++){
            if (min > array[j]){
                min = array[j];
            }
        }
        System.out.println("Value Min of Array:"+min);

    }
}
