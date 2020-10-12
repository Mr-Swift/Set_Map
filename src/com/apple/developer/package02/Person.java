package com.apple.developer.package02;

public class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name：" + this.getName() + "\t" + "id:" + this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        if (this.getName().equals(p.getName())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 31 * this.getName().hashCode();
    }
}
