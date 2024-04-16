public class employee {
    String firstName;
    String lastName;
    String city;
    String email;
    String pesel;
    int yearOfEmpl;

    public Employee(String firstName, String lastName, String city, String email,
                    String pesel,int yearOfEmpl){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmpl = yearOfEmpl;
    }

    public int calculateSalary(){
        int baseSalary = 3000 + (2024 - yearOfEmpl) * 1000;
        return baseSalary;
    }
}
