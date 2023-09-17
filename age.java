import java.util.Scanner;

public class age{
public static void main(String[] args){
Scanner scanner= new Scanner(System.in);
int x=scanner.nextInt();
if(x>=18){
System.out.println("Eligible to vote");
}
else{
System.out.println("Not Eligible to vote");
}
}
}