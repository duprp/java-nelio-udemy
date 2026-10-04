package entities;

public class Empregado {
    int id;
    String name;
    double salary;

    public Empregado(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public void increaseSalary(double percentage){
        salary += salary * percentage/100.0;
    }

    @Override
    public String toString() {
        return id +
                ", " +
                name +
                ", " +
                salary ;
    }
}
