import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of Day: ");
        int day = scanner.nextInt();

        switch(day){
          case 1:
             System.out.println("Monday");
             break;
          case 2:
             System.out.println("Tuesday");
             break;
          case 3:
             System.out.println("Wednesday");
             break;
          case 4:
             System.out.println("Thursday");
             break;
          case 5:
             System.out.println("Friday");
             break;
          case 6:
             System.out.println("Its Saturday!");
             break;
          case 7:
             System.out.println("Its Sunday Holidayy!");
             break;

        }
        

    }
}