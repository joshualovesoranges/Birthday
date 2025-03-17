import java.util.Random;

public class BirthdayFinder {
    private int classSize;
    private int trials;
    private int sameBirthdayCounter;

    public BirthdayFinder(int classSize, int trials) {
        this.classSize = classSize;
        this.trials = trials;
    }

    public double simulation() {
        Random rand = new Random();
        sameBirthdayCounter = 0; // Reset counter for each simulation

        // Run multiple trials
        for (int trial = 0; trial < trials; trial++) {
            int[] birthdays = new int[classSize]; // Store birthdays for this trial
            boolean foundDuplicate = false;

            // Assign random birthdays
            for (int i = 0; i < classSize; i++) {
                birthdays[i] = rand.nextInt(365) + 1; // Generate a random birthday (1-365)

                // Check if this birthday matches any previous person's birthday
                for (int j = 0; j < i; j++) {
                    if (birthdays[i] == birthdays[j]) {
                        foundDuplicate = true;
                        break; // Stop checking further once a match is found
                    }
                }

                if (foundDuplicate) {
                    sameBirthdayCounter++; // Count this trial as successful
                    break; // Stop adding more birthdays in this trial
                }
            }
        }

        // Return the percentage of trials with at least one shared birthday
        return ((double) sameBirthdayCounter / trials) * 100;
    }
}

