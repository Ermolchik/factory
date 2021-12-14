import java.util.*;

public class HumanResourcesDepartament implements Pay {
    static List<Employee> employee = new ArrayList<Employee>();
    static List<Candidate> candidate = new ArrayList<Candidate>();
    static Integer key = 0;
    static int salaryChoice;

    void fire() {
        collectionsEmployee();
        System.out.println("Введите индекс сотрудника, которого хотите уволить:");
        Scanner scanner1 = new Scanner(System.in);
        int fireEmployee = scanner1.nextInt();
        employee.remove(fireEmployee);
        collectionsEmployee();
    }

    void collectionsEmployee() {
        System.out.println("Список работников:");
        employee.forEach(System.out::println);

    }

    @Override
    public int payroll(Position position) {

        return 0;
    }

    @Override
    public void payroll() {
        System.out.println("Введите зарплату, которою будет получать работник первые три месяца: ");
        Scanner scanner3 = new Scanner(System.in);
        salaryChoice = scanner3.nextInt();
    }

    void hire() {
        System.out.println("Список всех кандидатов:");
        candidate.forEach(System.out::println);
        System.out.println("Введите индекс кандидата, которого вы хотите нанять:");
        Scanner scanner2 = new Scanner(System.in);
        int indexChoice = scanner2.nextInt();
        payroll();
        Employee employee1 = new Employee(candidate.get(indexChoice), salaryChoice);
        employee.add(employee1);
        candidate.remove(indexChoice);
    }

    void menuResources() {
        System.out.println("Введите что вы хотите сделать: Нанять/Уволить/Вывести список работников");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "Нанять":
                hire();
                break;
            case "Уволить":
                fire();
                break;
            case "Вывести список работников":
                collectionsEmployee();
                break;
            default:
                System.out.println("");
        }
        Main.menu();
    }


}
