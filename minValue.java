import java.util.Scanner;

public class minValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Giá trị của mảng là (max = 20 ) : ");
        int size = scanner.nextInt();
        if (size>20){
            System.out.print("Mảng chỉ chứa tối đa 20 phần tử ");
            return;
        }
        int[] array;
        array = new int[size];
        for (int i=0;i<size;i++){
            System.out.print("nhập giá trị vào mảng ");
            array[i]= scanner.nextInt();
        }
        int min;
        min = Chuyen_Doi_Do_C_F.giaTriNhoNhat(array);
        System.out.print("giá trị nhỏ nhất của mảng là "+min);
    }
}



