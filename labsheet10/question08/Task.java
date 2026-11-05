package labsheet10.question08;

public class Task {
    private int taskId;
    private String description;

    public Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    public void display() {
        System.out.println(taskId + ": " + description);
    }
}
