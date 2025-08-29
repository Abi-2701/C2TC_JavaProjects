package taskscheduler_assignment;

public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();

        // Schedule Task 1
        taskScheduler.scheduleTask(() -> System.out.println("Task 1 executed: Printing Hello!"), 2);

        // Schedule Task 2
        taskScheduler.scheduleTask(() -> System.out.println("Task 2 executed: Saving data..."), 3);

        // Schedule Task 3
        taskScheduler.scheduleTask(() -> System.out.println("Task 3 executed: Sending Email..."), 5);

        // Let the program run for some time (15 seconds), then shut down
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        taskScheduler.shutdown();
        System.out.println("Scheduler stopped.");
    }
}