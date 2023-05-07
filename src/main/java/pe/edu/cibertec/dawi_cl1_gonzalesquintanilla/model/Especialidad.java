package pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    private String IdEsp ;
    @Column(name = "NomEsp")
    private String NomEsp;
    @Column(name = "Costo")
    private Double Costo;
}

/*
    IdEsp CHAR(3) NOT NULL PRIMARY KEY,
    NomEsp VARCHAR(30) NOT NULL,
    Costo NUMERIC(8,1) NOT NULL*/