import java.util.Scanner;

public class NameFilter
{
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = in.nextLine();
        System.out.println("Enter your last name");
        String lastName = in.nextLine();



        if(firstName.equals("Julian") && lastName.equals("Cochran"))
        {
            System.out.println(firstName + " " +  lastName + " is a great name!");
        }
        else
        {
            System.out.println("Ew, who names their child " +
                    firstName + " " + lastName + " ? What a terrible name!");
            //Thread.sleep(4200, 69);
            for(int i = 0; i < 11; i++)
            {
                System.out.println(".");
                Thread.sleep(420, 69);
            }
            System.out.println("Jk man, " + firstName + " " + lastName + " is a great name, just not as good as Mr. Cochran's name!");
        }
    }
}

