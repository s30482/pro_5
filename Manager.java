import java.time.LocalDate;
import java.util.ArrayList;

class Manager extends employee{
    private ArrayList<Goal> goals;

    public Manager(String firstName, String lastName, String city, String email, String pesel,int yearOfEmpl){
        super(firstName, lastName, city, email, pesel, yearOfEmpl);
        this.goals = new ArrayList<>();
    }
    public void addGoal(Goal goal){
        goals.add(goal);
    }

    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        LocalDate currentDate = LocalDate.now();
        for (Goal goal : goals){
            if (currentDate.getYear() == goal.getDate(), getYear() && currentDate.getMonth() == goal.getDate().getMonth()){
                bonus += goal.getBonus();
            }
        }
        return baseSalary + bonus;
    }
}
