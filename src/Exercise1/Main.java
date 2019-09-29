package Exercise1;

public class Main {
    public static void main(String[] args) {

     JavaDeveloper javaDeveloper = new JavaDeveloper("i am JavaDeveloper");
        System.out.println(javaDeveloper.getJobTitle());

        String[] cars = {"Volvo", "BMW", "Ford"};
        cars[0] = "Cat";
        System.out.println(cars[0]);

    }


}
