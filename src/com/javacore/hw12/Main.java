package com.javacore.hw12;

public class Main {
    public static void main(String[] args) throws TaskException {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = () -> {
            for (int i = 1; i <= 100; i++) {
                if (i == 33) {
                    throw new TaskException();
                } else {
                    System.out.println("Task " + i + " is done");
                }
            }
        };

        Worker worker = new Worker(listener, errorListener);
        System.out.println("Задачи без ошибок (OnTaskDoneListener):");
        worker.start();
        System.out.println("");
        System.out.println("Задачи с ошибкой в 33 позиции (OnTaskErrorListener):");
        worker.errorCallback.onError();
    }
}
