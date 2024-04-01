package com.app.marcos.api.Model;
import jakarta.persistence.*;
@Entity
public class Moto {   
    @Column(name = "motoId")
    @Id
    private Long motoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "marca")
    private String marca;

    @Column(name = "matricula")
    private String matricula;

    public String getmarca() {
        return marca;
    }

    public Long getMotoId() {
        return motoId;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMotoId(Long motoId) {
        this.motoId = motoId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
