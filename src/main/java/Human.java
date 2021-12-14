public abstract class Human {
    String firstname;
    String surname;
    int age;
    Gender gender;

    public Human() {
    }

    @Override
    public String toString() {
        return String.format("Кандидат: Фамилия - %s, Имя - %s, Возраст - %d, Пол - %s", firstname, surname, age, gender);

    }
}
