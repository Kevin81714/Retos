package com.misiontic.reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "messages")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private Date messageText;

    @ManyToOne
    @JoinColumn(name = "ortopedicId")
    @JsonIgnoreProperties("message")
    private Ortopedic ortopedic;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("message")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("message")
    private Category Category;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public Date getMessageText() {
        return messageText;
    }

    public void setMessageText(Date messageText) {
        this.messageText = messageText;
    }

    public Ortopedic getOrtopedic() {
        return ortopedic;
    }

    public void setOrtopedic(Ortopedic ortopedic) {
        this.ortopedic = ortopedic;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public com.misiontic.reto3.entities.Category getCategory() {
        return Category;
    }

    public void setCategory(com.misiontic.reto3.entities.Category category) {
        Category = category;
    }
}
