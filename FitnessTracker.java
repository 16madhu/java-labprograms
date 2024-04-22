public class FitnessTracker {
    private int steps;
    private int caloriesBurned;
    private double distance;
    public FitnessTracker(int steps, int caloriesBurned, double distance) {
        this.steps = steps;
        this.caloriesBurned = caloriesBurned;
        this.distance = distance;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public int getSteps() {
        return steps;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public double getDistance() {
        return distance;
    }
    public void displayFitnessData() {
        System.out.println("Fitness Data:");
        System.out.println("Steps: " + steps);
        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Distance: " + distance + " miles");
    }
public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker(10000, 500, 5.2);
        tracker.displayFitnessData();
    }
}