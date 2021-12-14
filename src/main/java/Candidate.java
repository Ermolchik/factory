import java.util.Scanner;

public class Candidate extends Human {
    Position position;


    Candidate(String firstname) {

        this.position = position;

        super.firstname = firstname;

        System.out.println("Введите Вашу фамилию:");
        Scanner scanner1 = new Scanner(System.in);
        super.surname = scanner1.nextLine();

        System.out.println("Введите Ваш возраст:");
        Scanner scanner2 = new Scanner(System.in);
        super.age = scanner2.nextInt();

        System.out.println("Укажите Ваш пол:");
        Scanner scanner3 = new Scanner(System.in);

        switch (scanner3.nextLine()) {
            case "Мужской":
                super.gender = Gender.MALE;
                break;
            case "Женский":
                super.gender = Gender.FEMALE;
                break;
            default:
                System.out.println("Ошибка");
        }

        System.out.println("Укажите на какую позицию Вы претендуете Менеджер/Слесарь/Мастер:");
        Scanner scanner4 = new Scanner(System.in);
        switch (scanner4.nextLine()) {
            case "Менеджер":
                this.position = Position.MANAGER;
                break;
            case "Слесарь":
                this.position = Position.LOCKSMITH;
                break;
            case "Мастер":
                this.position = Position.MASTER;
                break;
            default:
                System.out.println("Error");
        }

    }

    Candidate() {
    }

    static void addCandidate() {
        System.out.println("Добрый день, укажите ваши данные и на какую должность вы претендуете: ");
        System.out.println("Введите Ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        HumanResourcesDepartament.candidate.add(new Candidate(firstname));
        System.out.println("Спасибо что уделили нам время, мы свяжемся с Вами, как будут известны результаты собеседованияю.");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Позиция - %s", position);
    }
}
