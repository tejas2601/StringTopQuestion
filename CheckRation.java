
import java.util.*;
public class CheckRation
{

    public static boolean checkRotation(String s1,String s2){
        int n=s1.length();
        if(s1.equals(s2)){
            return true;
        }
        for(int i=0;i<n;i++){
            if(s1.equals(s2)){
                return true;
            }
            char last=s1.charAt(s1.length()-1);
            s1=last+s1.substring(0,n-1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter An First String");
        String s1=sc.nextLine();
        System.out.println("Enter An secound String");
        String s2 = sc.nextLine();

        System.out.println(checkRotation(s1,s2));
    }
}