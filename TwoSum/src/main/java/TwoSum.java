import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива чисел
        System.out.println("Введите числа массива через пробел:");
        String input = scanner.nextLine();
        String[] numsStr = input.split(" ");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        // Ввод числа target
        System.out.println("Введите число target:");
        int target = scanner.nextInt();

        // Поиск пары чисел
        String result = findTwoSum(nums, target);
        if (result.isEmpty()) {
            System.out.println("Пара чисел, сумма которых равна " + target + ", не найдена.");
        } else {
            System.out.println("Индексы пары чисел: " + result);
        }

        scanner.close();
    }

    public static String findTwoSum(int[] nums, int target) {
        // Проходим по массиву и ищем пару чисел
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return i + "," + j; // Возвращаем индексы
                }
            }
        }
        return ""; // Если пара не найдена
    }
}