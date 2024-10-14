import java.util.Arrays;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入三个城市
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        // 将城市存储在数组中以便于排序
        String[] cities = {city1, city2, city3};

        // 对城市进行排序
        Arrays.sort(cities);

        // 显示排序后的城市
        System.out.println("The three cities in alphabetical order are " +
                cities[0] + ", " + cities[1] + ", and " + cities[2]);
    }
}
