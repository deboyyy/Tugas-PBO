import java.util.Scanner;
public class QuestD {
    public static void main(String[] args){
        Scanner bil = new Scanner(System.in);
        int n, m;
        n = bil.nextInt();
        m = bil.nextInt();
        System.out.println("masing-masing " + n / m);
        System.out.println("bersisa " + n % m);
    }
}