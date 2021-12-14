public class Bookkeeping implements Pay {

    @Override
    public int payroll(Position position) {
        int salary;

        switch (position) {
            case LOCKSMITH:
                salary = 500;
                break;
            case MASTER:
                salary = 800;
                break;
            case MANAGER:
                salary = 600;
                break;
            default:
                salary = 0;
                System.out.println("Error");

        }
        return salary;
    }

    void calculatePay() {
        int count = HumanResourcesDepartament.employee.size();

        for (Employee e : HumanResourcesDepartament.employee) {
            payroll(e.position);
            System.out.println("Зарплата сотрудника " + e.firstname + " будет составлять: " + payroll(e.position));
        }
    }

    @Override
    public void payroll() {

    }
}
