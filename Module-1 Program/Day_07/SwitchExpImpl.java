import java.util.Scanner;

public class SwitchExpImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch (day) {
            case "Monday", "Wednesday":
                System.out.println("Weekday");
                break;
            case "Tuesday":
                System.out.println("Weekday");
                break;
            case "Thursday":
                    System.out.println("Weekday");
                    break;
                    case "Friday":
                        System.out.println("Weekday");
                        break;
                        case "Saturday":
                            System.out.println("Weekday");
                            break;
                           default:
                                System.out.println("Weekend");
                                break;

        }
        switch (day) {
            case "Monday","Tuesday","Wednesday","Friday" -> System.out.println("Weekday");
            default -> System.out.println("Weekend");
        }
    }
}
