/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ALEXIS
 */
@Entity
@Table(name = "bike")
public class Bicicleta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name; 
    private String address;
    private Integer  extension; 
    private String description;
    
    @ManyToOne
    @JoinColumn(name="categoryid")
    @JsonIgnoreProperties("bike")
    private Categoria category;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","client"})            
    private List<Mensaje> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "bike")
    @JsonIgnoreProperties({"bike","message"})
    public List<Reservacion> reservations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getExtension() {
        return extension;
    }

    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public List<Mensaje> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    public List<Reservacion> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }
    
    

}
