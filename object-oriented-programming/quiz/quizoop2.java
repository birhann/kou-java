abstract class Kisi {
    private String name;

    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    Kisi(String name) {
        this.name = name;
    }
}

class Yonetici extends Worker {

    private int bonus;

    @Override
    public String toString() {
        return "(Yonetici) Isim: " + getName() + ", Maas: " + super.getSalary() + ", Bonus: " + bonus;
    }

    void setBonus(int bonus) {
        this.bonus = bonus / 2;
    }

    int getBonus() {
        return this.bonus;
    }

    Yonetici(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus / 2;
    }
}

class Worker extends Kisi {
    private int salary;

    @Override
    public String toString() {
        return "Name: " + super.getName() + ", Salary: " + salary;
    }

    void setSalary(int salary) {
        this.salary = salary * 2;
    }

    int getSalary() {
        return this.salary;
    }

    Worker(String name, int salary) {
        super(name);
        this.salary = salary * 2;
    }
}

class quizoop2 {
    public static void main(String[] args) {
        Worker[] staff = {
                new Worker("Berkan", 1500),
                new Worker("Birhan", 1000),
                new Worker("Hasan", 2500),
                new Worker("Huseyin", 4000),
                new Yonetici("Mehmet", 1500, 2000) };

        System.out.println(staff[0].toString());
        System.out.println(staff[0].getName());
        System.out.println(staff[1].toString());
        System.out.println(staff[2].toString());
        System.out.println(staff[3].toString());
        System.out.println(staff[4].toString());
    }
}