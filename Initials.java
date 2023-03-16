import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner s = new Scanner(System.in);
        // declare any other variables you may need
        String name, initials;
        // collect the required inputs
        System.out.print("Enter name : ");
        name = s.nextLine();
        // call your required method
        initials = getInitials(name);
        // disply the required results 
        System.out.println("Initials for " + name + " : " + initials);
    }
    
    // define your required method here below
    public static String getInitials(String name) {
        String initials="";
        int i = name.indexOf(" ");
        int j = name.lastIndexOf(" ");
        if(i == -1) { // if space not found means only firstname is given
            initials = name.substring(0,1) + ".";
        } else if(i == j) { // if one space found means firstname ans lastname is given
            initials = name.substring(0,1) + ". " + name.substring(i+1,i+2) + ".";
        } else { // if two space found means firstname, middlename ans lastname is given
            initials = name.substring(0,1) + ". " + name.substring(i+1,i+2) + ". " + name.substring(j+1,j+2) + ".";
        }
        return initials;
    }
}
