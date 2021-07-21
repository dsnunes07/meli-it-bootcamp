package meli.bootcamp.sql.appconsultoriomysql.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Long securityNumber;

    public Customer(String firstName, String lastName, Long securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }

    public Customer() {
    }
}
