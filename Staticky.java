public class Staticky {

    //considered a global variable, changed to static
   static int a = 0;

   // example could be there are 12 months in a year if making calendar
    static int months = 12;
    public static void main(String[] args) {
        int b = 1;

        // cant call global variable but can call local b
        // even though a is in the same scope on the main
        // is being run during compile

        //you can make an object to access a "Staticky s = new Staticky();"

        //Changed to static now its able to print
        //Allows you to access variable from outside the main
        //Static increases the scope of the main to outside of it
        System.out.println(a);
        System.out.println(months);
    }
}
