package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {
        String citizenType;
        int age = 60;

        if (age > 65){
        citizenType = "Senior";
        }else {
            citizenType = "Not Senior";
        }
        System.out.println("The citizen's age is " + age + ", he is " + citizenType);

    }

}
