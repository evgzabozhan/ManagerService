package com.zeoblocks.ManagerService.model;

import java.util.Objects;

public class Client {

    private long id;
    private String fullName;
    private String legalAddress;
    private Manager manager;

    public Client(){
    }

    public Client(String fullName, String legalAddress, Manager manager) {
        this.fullName = fullName;
        this.legalAddress = legalAddress;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", legalAddress='" + legalAddress + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(fullName, client.fullName) && Objects.equals(legalAddress, client.legalAddress) && Objects.equals(manager, client.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, legalAddress, manager);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
