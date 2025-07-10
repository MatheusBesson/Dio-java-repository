import java.util.ArrayList;
import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList(); // error here
        toDoList.addTask(new Task("homework"));
        toDoList.addTask(new Task("read"));
        toDoList.addTask(new Task("supermarket"));
        toDoList.addTask(new Task("work"));

       System.out.println(toDoList.allTasks());

       System.out.println(toDoList.descTasks(toDoList));

       toDoList.removeTask("home");
       toDoList.removeTask("homework");
       System.out.println(toDoList.descTasks(toDoList));
    }

    public static class ToDoList {
        List<Task> toDoList = new ArrayList<>();

        public ToDoList() {;
        }

        public void addTask(Task task) {
            toDoList.add(task);
            System.out.println("Task added to To-do-List.");
        }

        public void removeTask(String description) {
            String trimDesc = description.trim();
            boolean flag = false;
            for (Task task : toDoList) {
                if (task.getDescription().equalsIgnoreCase(trimDesc)) {
                    flag = true;
                }
            }
            if (flag) {
                toDoList.removeIf(t -> t.getDescription().equals(trimDesc));
                System.out.println(String.format("\nTask %s removed from To-do-list.", trimDesc));
            } else {
                System.out.println(String.format("\nTask not found."));
            }
        }

        public String allTasks () {
            int allTasks = toDoList.size();
            return String.format("There is %d tasks on the list.", allTasks);
        }

        public String descTasks(ToDoList tdl) {
            String message = "";
            for(Task task: tdl.toDoList) {
                message += String.format("============\nTask: %s. \n============",task.getDescription());
            }
            return message;
        }
    }

    public static class Task {
        String description;

        //------------------------------------------------
        public Task(String description) {
            this.description = description.trim();
        }

        //------------------------------------------------
        public String getDescription() {
            return description;
        }

        public void setDescription(String task) {
            this.description = description;
        }
    }
}
