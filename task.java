import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class task {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.print("Выбор задания (1 2 3): ");
              int input_w = sc.nextInt();
              switch (input_w) {
                     case (1):
                     // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
                            System.out.println("Введите число");
                            int numb = sc.nextInt();
                            int count_1 = 0;
                            int count_2 = 1;
                            for (int i = 1; i < numb + 1; i++) {
                                   count_1 = count_1 + i;
                                   count_2 = count_2 * i;
                            }
                            System.out.println("треугольное число = " + count_1 + "; факториал = " + count_2);

                            break;
                     case (2):
                     // 2) Вывести все простые числа от 1 до 1000

                            Scanner scanner = new Scanner(System.in);
                            System.out.print("Введите положительное число: ");
                            int input = scanner.nextInt();
                            scanner.close();
                            List<Integer> primes = new ArrayList<>();

                            for (int i = 2; i <= input; i++) {
                                   boolean isPrimeNumber = true;

                                   for (int j = 2; j < i; j++) {
                                          if (i % j == 0) {
                                                 isPrimeNumber = false;
                                                 break;
                                          }
                                   }
                                   if (isPrimeNumber) {
                                          primes.add(i);
                                   }
                            }
                            System.out.println("Простые числа: " + primes);
                            break;
                     case (3):
                     // 3) Реализовать простой калькулятор (+-/*)
                            System.out.print("Введите первое число: ");
                            float input_1 = sc.nextInt();
                            System.out.print("Введите второе число: ");
                            float input_2 = sc.nextInt();
                            System.out.print("Выбор знака: 1(+) 2(-) 3(/) 4(*): ");
                            int input_3 = sc.nextInt();
                            float value = 0;

                            switch (input_3) {
                                   case (1):
                                          value = input_1 + input_2;
                                          System.out.println("Cумма = " + value);
                                          break;
                                   case (2):
                                          value = input_1 - input_2;
                                          System.out.println("Вычетание = " + value);
                                          break;
                                   case (3):
                                          float value_1 = input_1 / input_2;
                                          System.out.format("Деление = %.2f", value_1);
                                          break;
                                   case (4):
                                          value = input_1 * input_2;
                                          System.out.println("Умножение = " + value);
                                          break;
                                   default:
                                          break;
                                          }
                            break;
                            default:
                                   break;
              }
       }
}