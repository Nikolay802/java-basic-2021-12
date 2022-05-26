package OtusHashMap;

import java.util.Objects;

public class Client {
    String name;
    String age;
    String id;

    @Override
    public String toString() {
        return "Клиент" + getId() + "   Имя:" + name + " " + ", Возраст:" + age;
    }

    public Client(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(age, client.age) && Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}

