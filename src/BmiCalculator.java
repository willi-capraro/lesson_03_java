public class BmiCalculator {

    public static void main(String[] args) {
        double massInKg = 90;
        double sizeInM = 1.83;
        double bmi = massInKg / (sizeInM * sizeInM);
        System.out.print("your BMI is ");
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Du bist untergewichtig.");
        } else if (bmi < 25) {
            System.out.println("Du bist normalgewichtig.");
        }
        else if (bmi < 30) {
            System.out.println("Du bist übergewichtig.");
        }
        else {
            System.out.println("Du bist fettleibig.");
        }
            
    }
}
