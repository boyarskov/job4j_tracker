package ru.job4j.pizza;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] products = new String[]{"Мясная пицца", "Пицца маргарита", "Пицца 4 сыра", "Пицца пепперони", "Пицца BBQ"};
            String[] description = new String[]{
                    "ветчина, грудинка, красный соус, курица, лук, моцарелла, укроп",
                    "дорблю, красный соус, моцарелла, орегано, томаты",
                    "базилик, дорблю, моцарелла, пармезан, сливочный сыр, сырный соус",
                    "базилик, болгарский перец, красный соус, маслины, моцарелла, острый перец, пепперони",
                    "грудинка, красный соус, моцарелла, охотничьи колбаски"
            };
            int[] prices = new int[]{500, 550, 530, 600, 700};

            int[] sum = new int[]{0, 0, 0, 0};
            int[] count = new int[]{0, 0, 0, 0};

            int productNumber = 0;
            int productCount = 0;
            int sumProducts = 0;

            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i] + " - " + prices[i] + " руб. - состав: " + description[i]);
            }

            while (true) {
                System.out.println("Введите номер товара и количество / end для выхода из программы");
                String input = scanner.nextLine();
                if ("end".equals(input))  {

                    break;
                }
                try {
                    String[] split = input.split(" ");

                    String a = split[0];
                    productNumber = Integer.parseInt(a) - 1;

                    String b = split[1];
                    productCount = Integer.parseInt(b);

                    sum[productNumber] = prices[productNumber] * productCount;
                    count[productNumber] = productCount;

                } catch (NumberFormatException e) {
                    System.out.println("Введите целое число");
                    continue;
                }
                if (productNumber > products.length) {
                    System.out.println("Вы ввели неверный номер товара");
                    continue;
                }
            }
            System.out.println(" ");
            System.out.println("Ваша корзина:");
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%s %9s %6s %s\n", "Наименование товара | ", "Количество | ", "Цена/за.ед | ", "Общая " + "стоимость");
            System.out.println("--------------------------------------------------------------------");

            for (int i = 0; i < 3; i++) {
                if (count[i] != 0) {
                    System.out.printf("%s %19s %15s %14s\n", products[i], count[i], prices[i],
                            sum[i]);
                }
                sumProducts += sum[i];
            }
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%57s %d", "Итого: ", sumProducts);
            System.out.println(" ");
            System.out.println("Программа завершена.");
        }
}
