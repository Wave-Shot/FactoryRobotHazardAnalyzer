import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        sc.nextLine();
        String machineryState = sc.nextLine();

        if (armPrecision < 0.0 || armPrecision > 1.0) {
            System.out.println("Error: Arm precision must be 0.0-1.0");
            return;
        }

        if (workerDensity < 1 || workerDensity > 20) {
            System.out.println("Error: Worker density must be 1-20");
            return;
        }

        double factor = 0;

        if (machineryState.equals("Worn")) factor = 1.3;
        else if (machineryState.equals("Faulty")) factor = 2.0;
        else if (machineryState.equals("Critical")) factor = 3.0;
        else {
            System.out.println("Error: Unsupported machinery state");
            return;
        }

        double risk = ((1.0 - armPrecision) * 15.0) + (workerDensity * factor);
        System.out.println("Robot Hazard Risk Score: " + risk);
    }
}
