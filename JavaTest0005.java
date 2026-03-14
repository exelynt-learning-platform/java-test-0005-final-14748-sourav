import java.util.Scanner;

public class JavaTest0005 {
    public static void main(String[] args) {
        
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Enter the number of row : ");
            int n = sc.nextInt();
            generatePattern(n);
        } catch (Exception e) {
            System.err.println("Some internal error occur: "+e.getMessage());
        }finally{
            if(sc != null)  sc.close();
        }

    }

    private static void generatePattern(int n){
        int value = 1;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}