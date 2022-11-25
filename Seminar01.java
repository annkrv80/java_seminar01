import java.util.Calendar;
import java.util.Scanner;

/*import java.time.LocalDateTime;

public class Seminar01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
    }

}*/
/*public class Seminar01{
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        System.out.println("Привет," + name +"!");
    }

}*/
/*public class Seminar01 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("Доброе утро," + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.println("Добрый день," + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.println("Добрый вечер," + name + "!");
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) > 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.println("Доброй ночи," + name + "!");
        }

    }
}*/
public class Seminar01{
    public static void main(String[] args) {
        Task arr = new Task();
        arr.maxOfOnes();

        
    }
}

class Task{
    int n;
    int[] array;

    Task(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива.");
        n = input.nextInt();
        array = new int[n];
        System.out.print("Введите массив: ");
        for(int i = 0; i<n; i++){
            array[i]=input.nextInt();
        }
        input.close();
    }

    void maxOfOnes(){
        int count = 0;
        int otherCounr=0;
        for(int i=0; i<array.length; i++){
            if (array[i]==1){
                otherCounr+=1;
            }else if(count<otherCounr){
                count=otherCounr;
                otherCounr=0;
            }    
        }
        if (count>otherCounr){
            System.out.println(count);
        }else{
            System.out.println(otherCounr);
        }
    }
}

