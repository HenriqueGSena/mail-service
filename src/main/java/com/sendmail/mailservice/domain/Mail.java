package com.sendmail.mailservice.domain;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mail")
public class Mail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mail_address")
    private String mailAddress;

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;

    public Mail() {}

    public Mail(Long id, String name, String mailAddress, String subject, String message) {
        this.id = id;
        this.name = name;
        this.mailAddress = mailAddress;
        this.subject = subject;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mail mail)) return false;

        if (!getId().equals(mail.getId())) return false;
        if (!getName().equals(mail.getName())) return false;
        if (!getMailAddress().equals(mail.getMailAddress())) return false;
        if (!getSubject().equals(mail.getSubject())) return false;
        return getMessage().equals(mail.getMessage());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getMailAddress().hashCode();
        result = 31 * result + getSubject().hashCode();
        result = 31 * result + getMessage().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return (
            "Mail{" +
            "id=" +
            id +
            ", name='" +
            name +
            '\'' +
            ", mailAddress='" +
            mailAddress +
            '\'' +
            ", subject='" +
            subject +
            '\'' +
            ", message='" +
            message +
            '\'' +
            '}'
        );
    }
}
