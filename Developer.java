import java.util.ArrayList;

class Developer extends employee{
    private ArrayList<Technology> technologies;

    public Developer(String firstName, String lastName, String city, String email, String pesel,int yearOfEmpl){
        super(firstName, lastName, city, email, pesel, yearOfEmpl);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology){
        technologies.add(technology);
    }

    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology technology : technologies){
            bonus += technology.getBonus();
        }
        return baseSalary + bonus;
    }
}