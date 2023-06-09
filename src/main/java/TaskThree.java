import java.util.Scanner;
import java.time.LocalTime;
public class TaskThree {
    public static void main(String[] args) {
//        3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        if( currentTime.isAfter(LocalTime.of(5, 0))
                && currentTime.isBefore(LocalTime.of(11, 59, 59))){
            System.out.println("Good morning, " + name);

        } else if (currentTime.isAfter(LocalTime.of(12, 0))
                && currentTime.isBefore(LocalTime.of(17, 59, 59))) {
            System.out.println("Good day, " + name);

        } else if (currentTime.isAfter(LocalTime.of(18, 0))
                && currentTime.isBefore(LocalTime.of(22, 59, 59))) {
            System.out.println("Good evening, " + name);

        } else if (currentTime.isAfter(LocalTime.of(23, 0))
                && currentTime.isBefore(LocalTime.of(4, 59, 59))) {
            System.out.println("Good night, " + name);

        }
        else {
            System.out.println("ERROR");
        }

        iScanner.close();
    }
}
