package com.abi.taskscheduler_assignment;

import java.util.concurrent.*;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void scheduleTask(Task task, int intervalInSeconds) {
        scheduler.scheduleAtFixedRate(() -> task.execute(),
                0, intervalInSeconds, TimeUnit.SECONDS);
    }

    public void shutdown() {
        scheduler.shutdown();
    }
}