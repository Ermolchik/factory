public enum Gender {
    MALE("Мужской"),
    FEMALE("Женский");
    String sex;

    Gender(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}
