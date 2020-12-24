package day1;

public class Task5 {
    public static void main(String[] args) {
        int year = 1980;
        for (int x=1980; x<=2020; x=x+4){
            System.out.println("Олимпиада "+x+" года");
            year = x;
        }
    }
}
