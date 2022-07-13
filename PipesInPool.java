package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int flowPipe1 = Integer.parseInt(scanner.nextLine());
        int flowPipe2 = Integer.parseInt(scanner.nextLine());
        double hoursOfActivities = Double.parseDouble(scanner.nextLine());
        double volumePipe1 = flowPipe1 * hoursOfActivities;
        double volumePipe2 = flowPipe2 * hoursOfActivities;
        double totalPipeVolume = volumePipe1 + volumePipe2;
        double volumeInPoolInPercentage = totalPipeVolume / poolVolume*100;
        double volumePipe1InPercentage = volumePipe1  / totalPipeVolume *100;
        double volumePipe2InPercentage = volumePipe2  / totalPipeVolume *100;
        if (totalPipeVolume <= poolVolume) {
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f. Pipe 2: %.2f",
                    volumeInPoolInPercentage, volumePipe1InPercentage, volumePipe2InPercentage);
        } else {
            System.out.printf("For %s hours the pool overflows with %.2f liters.", hoursOfActivities, totalPipeVolume-poolVolume);
        }
    }
}
