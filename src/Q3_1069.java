import java.util.Scanner;

public class Q3_1069 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int length=1, max=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                length++;
            }
            else{
                max=Math.max(length, max);
                length=1;
            }
        }
        System.out.print(Math.max(max, length));
    }
}
