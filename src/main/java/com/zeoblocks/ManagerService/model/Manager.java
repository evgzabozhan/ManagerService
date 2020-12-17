package com.zeoblocks.ManagerService.model;

import java.util.Objects;

public class Manager {

    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private String number;
    private Manager manager;

    public Manager(){}

    public Manager(String surname, String name, String patronymic, String number, Manager manager) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.number = number;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", number='" + number + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager1 = (Manager) o;
        return id == manager1.id && Objects.equals(surname, manager1.surname) && Objects.equals(name, manager1.name) && Objects.equals(patronymic, manager1.patronymic) && Objects.equals(number, manager1.number) && Objects.equals(manager, manager1.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, number, manager);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
