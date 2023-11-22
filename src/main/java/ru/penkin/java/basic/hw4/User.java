package ru.penkin.java.basic.hw4;

public class User {          // На гитхаб vetka1
    private String name;
    private String surname;
    private String middlename;
    private int yearbirth;
    private String email;

    public User(String lastName, String firstName, String middleName, int birthYear, String email) {
        this.name = lastName;
        this.surname = firstName;
        this.middlename = middleName;
        this.yearbirth = birthYear;
        this.email = email;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name + " " + surname + " " + middlename);
        System.out.println("Год рождения: " + yearbirth);
        System.out.println("e-mail: " + email);
    }

    public int getAge() {
        return 2023 - yearbirth;
    }

    public static void main(String[] args) {
        User[] users = new User[10];

        users[0] = new User("Березов", "Роман", "Сергеевич", 1979, "berezov@mail.com");
        users[1] = new User("Листов", "Кузьма", "Александрович", 1990, "listov@mail.com");
        users[2] = new User("Грибов", "Андрей", "Александрович", 1988, "petrenko@mail.com");
        users[3] = new User("Сидоров", "Сидр", "Александрович", 1975, "sidorov@mail.com");
        users[4] = new User("Козлов", "Виктор", "Александрович", 1995, "kozlov@mail.com");
        users[5] = new User("Цуциков", "Антон", "Алексеевич", 1972, "tsutsikov@mail.com");
        users[6] = new User("Мамонтов", "Иван", "Кузьмич", 1957, "mamonтov@maile.com");
        users[7] = new User("Кузьмин", "Владислав", "Петрович", 1976, "kuzmin@mail.com");
        users[8] = new User("Никаноров", "Станислав", "Кузьма", 1991, "nikanorov@mail.com");
        users[9] = new User("Карасев", "Вячеслав", "Петрович", 1960, "karasev@mail.com");

        for (User user : users) {
            if (user.getAge() > 40) {
                user.printInfo();
                System.out.println();
            }
        }
    }
}
