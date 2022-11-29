import java.util.Scanner;

/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов c1 и c2, начиная с c1.*/

public class Seminar02 {
    public static void main(String[] args) {
        FerstTask result=new FerstTask();
        System.out.println(result.GetResult());
        
    }
    
}

class FerstTask{
    int n;
    char a;
    char b;
    int count = 0;

    FerstTask(){
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.print("Введите певый символ:");
        a=in.next().charAt(0);
        System.out.print("Введите второй символ: ");
        b=in.next().charAt(0);
        in.close();
    }
    
    public StringBuilder GetResult(){
        StringBuilder res=new StringBuilder();
        while(n!=count){
            res.append(a).append(b);
            count=count+2;
        }
        return res;
    }
    
}

