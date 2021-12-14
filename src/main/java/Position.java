public enum Position {
    MANAGER("Менеджер"),
    LOCKSMITH("Слесарь"),
    MASTER("Мастер");

    String careerObjective;
    Position(String careerObjective){
        this.careerObjective = careerObjective;
    }

    @Override
    public String toString() {
        return careerObjective;
    }
}
