import java.util.Scanner;
public class AttendanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Total classes and attended classes
        System.out.print("Enter the total number of classes conducted: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter the number of classes you have attended: ");
        int attendedClasses = scanner.nextInt();

        // Calculate current attendance percentage
        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        System.out.printf("Your current attendance percentage is: %.2f%%\n", attendancePercentage);

        // Check if attendance is below 75%
        if (attendancePercentage < 75.0) {
            // Calculate additional classes required to meet 75%
            int additionalClassesNeeded = (int) Math.ceil((0.75 * totalClasses - attendedClasses) / 0.25);
            System.out.println("You need to attend at least " + additionalClassesNeeded + 
                               " more classes to reach 75% attendance.");
        } else {
            System.out.println("Congratulations! You already meet the 75% attendance requirement.");
        }

        scanner.close();
    }
}
