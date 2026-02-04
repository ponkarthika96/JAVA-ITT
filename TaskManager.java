import java.util.*;

abstract class Task {
    String description;
    abstract void setDescription(String s);

    String getDescription() {
        return description;
    }
}

class ToDo extends Task {
    void setDescription(String s) {
        description = s;
    }
}

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task description: ");
        String taskDescription = scanner.nextLine();

        ToDo newTask = new ToDo();
        newTask.setDescription(taskDescription);

        System.out.println("Task: " + newTask.getDescription());

        scanner.close();
    }
}