package com.proyecto.proyectoSala.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tipo")
public class Tipo {

    @Id
    @Column(name = "id_tipo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nro_sillas")
    private Integer nro_sillas;

    @Column(name = "refrigerio")
    private Boolean refrigerio;

    @Column(name = "pc")
    private Boolean pc;

    @Column(name = "pizarra")
    private Boolean pizarra;

    @Column(name = "podio")
    private Boolean podio;

    @OneToMany
    @JoinTable(
            name = "salaTipo",
            joinColumns = @JoinColumn(name = "id_sala"),
            inverseJoinColumns = @JoinColumn(name = "id_tipo"))
    private List<Tipo> tipos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNro_sillas() {
        return nro_sillas;
    }

    public void setNro_sillas(Integer nro_sillas) {
        this.nro_sillas = nro_sillas;
    }

    public Boolean getRefrigerio() {
        return refrigerio;
    }

    public void setRefrigerio(Boolean refrigerio) {
        this.refrigerio = refrigerio;
    }

    public Boolean getPc() {
        return pc;
    }

    public void setPc(Boolean pc) {
        this.pc = pc;
    }

    public Boolean getPizarra() {
        return pizarra;
    }

    public void setPizarra(Boolean pizarra) {
        this.pizarra = pizarra;
    }

    public Boolean getPodio() {
        return podio;
    }

    public void setPodio(Boolean podio) {
        this.podio = podio;
    }
}
