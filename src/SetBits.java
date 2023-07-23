import java.util.Scanner;




public class SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextByte();
        int B = sc.nextInt();
        if(A==B)
        {
            System.out.println(findSetBit(A));
        }
        else
            System.out.println(findSetBit(A)+findSetBit(B));
    }
    public static int findSetBit(int A)
    {
        int B=0;
        B=B|(1<<A);
        return B;
    }

}
