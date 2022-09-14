import java.util.Scanner;

public class NameFilter
{
    public static void main(String[] args)
    {
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
            System.out.println("Why the heck would anyone be named " + firstName + " " + lastName + " ? What a terrible name!");
        }
    }
}

