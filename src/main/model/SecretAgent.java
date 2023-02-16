package main.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="SECRET_AGENT_TABLE")
public class SecretAgent {

    @Id
    @Column(name="AGENT_ID")
    @SequenceGenerator(
            name = "aSeqGen",
            sequenceName = "aSeq",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "aSeqGen"
    )
    private long id;

    @NotEmpty(message = "CODENAME cannot be empty!")
    @Size(min=2, max=10, message="CODENAME must be [2, 10] chars inclusive")
    private String codename;

    @NotEmpty(message = "SPECIALTY cannot be empty!")
    @Size(min=2, max=10, message="SPECIALTY must be [2, 10] chars inclusive")
    private String specialty;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public SecretAgent(String codename, String specialty) {
        this.codename = codename;
        this.specialty = specialty;
    }

    public SecretAgent() {
    }

    @Override
    public String toString() {
        return "SecretAgent{" +
                "id=" + id +
                ", codename='" + codename + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
