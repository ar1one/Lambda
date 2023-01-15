package Worker;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = () -> System.out.println("error on task");
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }


}
