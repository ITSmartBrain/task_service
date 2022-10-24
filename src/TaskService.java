import java.util.Arrays;

public class TaskService {
    String[] arr = new String[5];
    int index;
    public void addTask(String task){
        if(index>=task.length()){
            arr = Arrays.copyOf(arr, arr.length*2);
        }
        arr[index++] = task;
    }
    //0: task1
    //1: null
    //2: null
    public int size(){
        return index;
    }

    public void printTask(){
        for (int i = 0; i < size(); i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //task1 task2 task3 task4 null null
    //task1 task4 task3 null null null
    public boolean executeTask(String task){
        for (int i = 0; i < size(); i++) {
            if(arr[i].equals(task)){
                arr[i] = arr[size()-1];
                arr[size()-1] = null;
                index--;
                return true;
            }
        }
        return false;
    }


}
