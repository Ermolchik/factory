public class Employee extends Candidate {
    int salary;

    Employee(Candidate candidate, int salary) {

        super.firstname = candidate.firstname;
        super.surname = candidate.surname;
        super.age = candidate.age;
        super.gender = candidate.gender;
        super.position = candidate.position;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Зарплата - %s.", salary);
    }
}
