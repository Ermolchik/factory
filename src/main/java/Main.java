import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.menu();
    }

    static void menu() {
        System.out.println("Укажите Вашу роль: Кандидат/Бухгалтер/Кадровик");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "Кандидат":
                Candidate.addCandidate();
                menu();
                break;
            case "Бухгалтер":
                Bookkeeping bookkeeping = new Bookkeeping();
                bookkeeping.calculatePay();
                menu();
                break;
            case "Кадровик":
                HumanResourcesDepartament humanResourcesDepartament = new HumanResourcesDepartament();
                humanResourcesDepartament.menuResources();
                menu();
                break;
            default:
                System.out.println("Error");
        }
    }
}
