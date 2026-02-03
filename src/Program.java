import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        sc.nextLine();
        String machineryState = sc.nextLine();

        double factor = 0;

        if (machineryState.equals("Worn")) factor = 1.3;
        if (machineryState.equals("Faulty")) factor = 2.0;
        if (machineryState.equals("Critical")) factor = 3.0;

        double risk = ((1.0 - armPrecision) * 15.0) + (workerDensity * factor);

        System.out.println("Robot Hazard Risk Score: " + risk);
    }
}
