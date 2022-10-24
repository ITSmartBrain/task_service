import java.util.Scanner;

//Задача Создайте класс TaskService - класс по управлению задачами для персонала.
//Класс хранит задачи в типе String в виде массива с начальным размером 5 элементов.
//
//Создайте методы
//public void addTask(String task); //добавляет новую задачу в массив.
// Если места не хватает, массив увеличиваем в 2 раза
//public int size(); //возвращает количество добавленных задач
//public void printTask() //выводит на консоль все добавленные задачи
//public boolean executeTask(String task) //выполняет задачу с названием task и удаляет ее из массива, возвращая true в случае успешного удаления
//При удалении не должно образовываться пустых пространств.
//К примеру, если был массив на 5 элементов с тремя задачами: task1 task2 task3 null null
//И мы удаляем задачу task2
//Тогда должно получиться: task1 task3 null null null
//Если после этого добавить новую задачу task4, тогда должно получится:  task1 task3 task4 null null
//
//В мейне создайте консольное меню:
//1. Добавить задачу
//2. Вывести все задачи в работе
//3. Выполнить задачу (юзер вводит название задачи с консоли)
//4. Выход
//
//Программа завершается только при выборе пункта 4.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        TaskService taskService = new TaskService();
        taskService.addTask("task1");;
        taskService.addTask("task2");;
        taskService.addTask("task3");;
        taskService.addTask("task4");;
        taskService.addTask("task5");;
        taskService.addTask("task6");;
        int input = 0;
        while(input!=4){
            System.out.println("1. Добавить задачу\n" +
                    "2. Вывести все задачи в работе\n" +
                    "3. Выполнить задачу (юзер вводит название задачи с консоли)\n" +
                    "4. Выход");
            input = scn.nextInt();
            switch (input){
                case 1->{
                    System.out.print("Enter new task: ");
                    taskService.addTask(scn.next());
                }
                case 2 -> taskService.printTask();
                case 3 ->{
                    System.out.print("Enter new task: ");
                    if(taskService.executeTask(scn.next())){
                        System.out.println("Task executed");
                    }else{
                        System.out.println("Task not executed");
                    }
                }

            }
        }
    }
}
