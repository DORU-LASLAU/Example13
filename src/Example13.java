import java.util.Scanner;
class Example13 {
    public static void main(String[] argv) {
        float x,y,z;
        System.out.println("Enter first number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextFloat();
        System.out.println("Enter second number:");
        y = inputValue.nextFloat();
        System.out.println("Enter third number:");
        z = inputValue.nextFloat();

        if (x >=y & x>=z) {
            System.out.println("The biggest number is:"+x);
        } else if(y >=x & y>=z) {
            System.out.println("The biggest number is:"+y);
        } else {
            System.out.println("The biggest number is:"+z);
        }
    }
}
