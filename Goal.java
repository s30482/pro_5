import java.time.LocalDate;

class Goal{
    private LocalDate date;
    private String description;
    private int bonus;

    public Goal(int year, int month, int dayOfMonth, String description, int bonus){
        this.date = LocalDate.of(year, month, dayOfMonth);
        this.description = description;
        this.bonus = bonus;
    }

    public LocalDate getDate(){
        return date;
    }
    public String getDescription(){
        return description;
    }
    public int getBonus(){
        return bonus;
    }
}