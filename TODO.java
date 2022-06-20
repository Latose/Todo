import java.util.Scanner;

public class TODO {
       public static void main(String[] args) {
              //Первая заметка
           System.out.println("Write your task :");
           Scanner task1 = new Scanner(System.in);
           String bob = task1.nextLine();
           System.out.println("~Saved");
           //еще один да нет
           System.out.println("Do you have another task (YES/NO)");
           Scanner qust = new Scanner(System.in);
           String yeno = qust.nextLine();
           //если да
           if(yeno.contains("YES") || yeno.contains("Yes") || yeno.contains("yes")){
                  //второй
                  System.out.println("Write your second task : ");
                  Scanner task2 = new Scanner(System.in);
                  String bob2 = task2.nextLine();
                  System.out.println("~Saved");
                  //делать третье или нет
                  System.out.println("Another one ? (YES/NO)");
                  Scanner anyn = new Scanner(System.in);
                  String anot = anyn.nextLine();
                  //делать третье
                  if(anot.contains("YES") || anot.contains("Yes") || anot.contains("yes")){
                     System.out.println("Write your third task : ");
                     Scanner task3 = new Scanner(System.in);
                     String bob3 = task3.nextLine();
                     System.out.println("~Saved");
                     System.out.println("! Task list is full !");
                     System.out.println("Do you want to see your tasks ? (!showtask / no)");
                     Scanner showtask3 = new Scanner(System.in);
                     String smt3 = showtask3.nextLine();
                     //показать заметки bob и bob2
                     if(smt3.contains("!showtask")){
                            System.out.println("[1] " + bob + "\n" + "[2] " +bob2 + "\n"+"[3] " +bob3);
                     }
                  }
                  //не делать третье
                  else if (anot.contains("NO") || anot.contains("No") || anot.contains("no")){
                     System.out.println("Do you want to see your tasks ? (!showtask / no)");
                     Scanner showtask2 = new Scanner(System.in);
                     String smt2 = showtask2.nextLine();
                     //показать заметки bob и bob2
                     if(smt2.contains("!showtask")){
                            System.out.println("[1] " + bob + "\n" + "[2] " +bob2);
                     }
                  }
           }
           //первое нет
           else if (yeno.contains("NO") || yeno.contains("No") || yeno.contains("no")){
              System.out.println("Do you want to see your tasks ? (!showtask / no)");
              Scanner showtask = new Scanner(System.in);
              String smt = showtask.nextLine();
              //показать заметки первое bob
              if(smt.contains("!showtask")){
                     System.out.println("[1] " + bob);
              }
          }
       }
}
