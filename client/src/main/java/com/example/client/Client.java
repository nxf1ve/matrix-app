package com.example.client;

import java.util.Scanner;

public class Client {
    private Service service;

    public Client() {
        service = new Service();
    }

    public void startIt() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Ваша первая матрица");

        do {
            System.out.println("""
                1. Сгенерировать матрицу размером 5
                2. Разделить на минимум в матрице 
                3. Показать матрицу
                """);

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    service.genGraph(5);
                    service.printGraph();
                    break;
                case "2":
                    service.division();
                    service.printGraph();
                    break;
                case "3":
                    service.printGraph();
                    break;
                default:
                    System.out.println("Выбора ответа не существует");
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.startIt();
    }
}
