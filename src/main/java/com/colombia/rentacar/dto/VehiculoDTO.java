package com.colombia.rentacar.dto;

/**
 * DTO para la transferencia de datos relacionados con vehículos.
 * Esta clase se usa para recibir o enviar información simplificada
 * sin exponer directamente la entidad completa.
 *
 * Más adelante, este DTO permitirá implementar validaciones,
 * reglas de negocio, y evitar exponer atributos internos.
 */
public class VehiculoDTO {

    private String marca;
    private String modelo;
    private int anio;
    private double precioPorDia;

    /**
     * Constructor vacío requerido para procesos de serialización.
     */
    public VehiculoDTO() {}

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
}
