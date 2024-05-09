public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000 && this.salary > 0) {
            System.out.println("Maaştan vergi alınmayacaktır.");
            return 0;
        } else {
            return (salary * 0.03);
        }
    }

    public int bonus() {
        if (this.workHours > 40) {
            return ((workHours - 40) * 30);
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int workYears = 2021 - hireYear;
        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears > 10 && workYears <= 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        double totalSalary = salary - tax() + bonus();
        double totalRaise = totalSalary + raiseSalary();
        return "İsim : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n" +
                "Toplam Maaş: " + totalRaise;
    }
}
