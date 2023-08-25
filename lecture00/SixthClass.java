package lecture00;

public class SixthClass {
    public static void main(String[] args) {
        int number = 5;

        //ternory operator
        String type = ((number%2)==0)? "even" : "odd";
        System.out.println(type);
    }
}
