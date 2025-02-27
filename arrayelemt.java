import java.util.Scanner;
public class arrayelemt {
    public static void main(String[] args) {
    
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int arr[][]=new int[size][size];
        System.out.println("enter the elements:");
        for (int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=obj.nextInt();
            }
        }
    
        for (int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
