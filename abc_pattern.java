import java.util.Scanner;
public class abc_pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++){
            char c='a';
            for(int j=1;j<=i;j++){
                System.out.print(c+ " ");
                c++;
            }
            System.out.println();
        }

    }
}
