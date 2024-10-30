import java.util.Scanner;

class GRADECalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics, chemistry, math, english, hindi;
        int failCount = 0;
        int total;
        double average;
        String grade;

        System.out.print("Enter marks of Physics (0-100): ");
        physics = sc.nextInt();
        if (physics < 0 || physics > 100) {
            System.out.println("Invalid Input in Physics");
            return;
        }
        if (physics < 35) 
          failCount++;

        System.out.print("Enter marks of Chemistry (0-100): ");
        chemistry = sc.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            System.out.println("Invalid Input in Chemistry");
            return;
        }
        if (chemistry < 35) 
            failCount++;

        System.out.print("Enter marks of Math (0-100): ");
        math = sc.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("Invalid Input in Math");
            return;
        }
        if (math < 35) 
         failCount++;

        System.out.print("Enter marks of English (0-100): ");
        english = sc.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid Input in English");
            return;
        }
        if (english < 35)
            failCount++;

        System.out.print("Enter marks of Hindi (0-100): ");
        hindi = sc.nextInt();
        if (hindi < 0 || hindi > 100) {
            System.out.println("Invalid Input in Hindi");
            return;
        }
        if (hindi < 35) 
          failCount++;

        // Calculate total marks of all inputs:
        total = physics + chemistry + math + english + hindi;
        average = total / 5.0;

        // Check result based on fail count and calculate grade
        if (failCount == 0) {
            System.out.println("Result: Pass");
            System.out.println("Total Marks: " + total);
            System.out.println("Average Percentage: " + average + "%");

            if (average >= 60) {
                grade = "I";
            } else if (average >= 45 && average < 60) {
                grade = "II";
            } else {
                grade = "III";
            }

            System.out.println("Division: " + grade);

        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
