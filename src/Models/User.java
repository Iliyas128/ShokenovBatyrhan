package Models;

import java.util.List;

public class User {

    private int id;
    private int money;
    private String name;
    private String email;
    private List<Car> cars;

    public User(int money, String name, String email, List<Car> cars) {
        this.money = money;
        this.name = name;
        this.email = email;
        this.cars = cars;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" + "money=" + money + ", name=" + name + ", email=" + email + ", cars=" + cars + '}';
    }
}
