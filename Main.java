// Simple productivity task manager
import java.security.KeyStore;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


class add{

    Scanner scanner = new Scanner(System.in);
    boolean todo;
    String hello;
    String ch;
    public void insert(ArrayList<String>work){
        todo= true;
        while (todo){
            System.out.print("Enter your to do task : ");
            hello= scanner.nextLine();

            work.add(hello);

            System.out.print("Would You like to add more Y/N: ");
            ch=scanner.nextLine();

            if(Objects.equals(ch, "Y")){
                todo=true;
                System.out.println("The task is added");

            }

            else{
                todo=false;
            }





        }



    }
}


class show{
    public void list (ArrayList<String>work){
        if (work.isEmpty()){
            System.out.println("You have no work left 🥳🥳");
        }

        else{
            System.out.println("Your current task left are/is : ");
            for (String s : work) {
                System.out.println(s);
            }
            }

    }
}

class Del{
    Scanner scanner = new Scanner(System.in);

    show check = new show();
    String ch;
    public void remove(ArrayList<String>work){
        check.list(work);
        System.out.print("What would you like to remove : ");
        ch=scanner.nextLine();

        work.remove((ch));
        System.out.println("Congratulations you have completed the work onto the next one 🥳🥳");






    }
}

class Main {
    public static void main(String[] args){
        ArrayList<String> work = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        add Add = new add();
        show Show = new show();
        Del del = new Del();
        boolean run=true;

        int ch;
        System.out.println("Welcome to the prdocuctivity manager 👋👋");

        while(run){
            System.out.println("1. To add tasks");
            System.out.println("2. To show tasks");
            System.out.println("3. To delete tasks");
            System.out.println("4. To Exit");
            System.out.print("Enter your choice :");
            ch=scanner.nextInt();

            if(ch == 1){
                Add.insert(work);

            }

            else if(ch == 2) {
                Show.list(work);

            }

            else if(ch == 3){
                del.remove(work);

            }
            else if(ch ==4){
                System.out.println("Exiting program ....");
                run=false;
            }
            else {
                System.out.println("Invalid input");
            }

        }



        scanner.close();


    }
}




