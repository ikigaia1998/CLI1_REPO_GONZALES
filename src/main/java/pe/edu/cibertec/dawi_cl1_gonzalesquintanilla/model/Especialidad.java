package pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.model;



import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    private String idesp ;

    @Column(name = "nomEsp")
    private String nomesp;

    @Column(name = "costo")
    private Double costo;
}

/*
    IdEsp CHAR(3) NOT NULL PRIMARY KEY,
    NomEsp VARCHAR(30) NOT NULL,
    Costo NUMERIC(8,1) NOT NULL*/