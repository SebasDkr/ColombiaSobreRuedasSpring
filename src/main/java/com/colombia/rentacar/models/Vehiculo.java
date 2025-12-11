package com.colombia.rentacar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
/**
 * Clase que representa un vehículo en el sistema.
 * Contiene los datos básicos de cada vehículo.
 */
@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    /** Identificador único del vehículo (generado automáticamente) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Marca del vehículo, obligatorio */
    @NotBlank(message = "La marca es obligatoria")
    private String marca;

    /** Modelo del vehículo, obligatorio */
    @NotBlank(message = "El modelo es obligatorio")
    private String modelo;

    /** Matrícula del vehículo, obligatorio y único */
    @NotBlank(message = "La matrícula es obligatoria")
    private String matricula;

    /** Año de fabricación, debe ser positivo */
    @Positive(message = "El año debe ser positivo")
    private int anio;

    /** Precio de alquiler por día, debe ser positivo o cero */
    @PositiveOrZero(message = "El precio diario debe ser positivo o cero")
    private double precioDia;

    /** Estado del vehículo (Disponible, Rentado, En mantenimiento) */
    @NotBlank(message = "El estado es obligatorio")
    private String estado;


    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
