import java.util.Scanner;

public class Task {


    private Integer idCount;
    private Integer id;
    private boolean isCompleted;
    private String name;


    public Task(boolean isCompleted, String name) {
        this.isCompleted = isCompleted;
        this.name = name;
        this.id = idCount + 1;
        idCount++;
    }

    public static String createNewTask(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a task.");
        String name = scanner.nextLine();
        Task input = new Task(false, name);
        return input.toString();
    }


    public Integer getId() {
        return id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return (isCompleted ? "[X]" : "[ ]") + "Task: " + name + "\n";
    }

}
