package org.example;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users", schema = "hibernate_k1", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "Name", nullable = true, length = 45)
    private String name;
    @Basic
    @Column(name = "Address", nullable = true, length = 45)
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name,address);
    }
    @Override
    public  String toString(){
        return "UsersEntity{ " +
                "id: " + id +
                "name: " + name + '\'' +
                "address: " + address + '\'' +
                '}';
    }
}

