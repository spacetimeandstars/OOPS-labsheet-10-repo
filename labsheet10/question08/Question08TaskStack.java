package labsheet10.question08;

import java.util.Stack;

public class Question08TaskStack {
    private Stack<Task> tasks = new Stack<>();

    public void pushTask(Task task) {
        tasks.push(task);
    }

    public Task popTask() {
        return tasks.isEmpty() ? null : tasks.pop();
    }

    public void displayRemainingTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No remaining tasks.");
        } else {
            System.out.println("Remaining tasks:");
            for (Task task : tasks) {
                task.display();
            }
        }
    }

    public static void main(String[] args) {
        Question08TaskStack manager = new Question08TaskStack();
        manager.pushTask(new Task(1, "Complete assignments"));
        manager.pushTask(new Task(2, "Prepare presentation"));

        System.out.println("Completed task:");
        Task completed = manager.popTask();
        if (completed != null) {
            completed.display();
        }
        manager.displayRemainingTasks();
    }
}
