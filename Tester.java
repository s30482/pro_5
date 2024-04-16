import java.util.ArrayList;

class Tester extends employee{
    private ArrayList<String> testTypes;

    public Tester(String firstName, String lastName, String city, String email, String pesel,int yearOfEmpl){
        super(firstName, lastName, city, email, pesel, yearOfEmpl);
        this.testTypes = new ArrayList<>();
    }
    public void addTestType(String testType){
        testTypes.add(testType);
    }

    public int calculateSalary(){
        int baseSalary = super.calculateSalary();
        int bonus = testTypes.size() * 300;
        return baseSalary + bonus;
    }
}
