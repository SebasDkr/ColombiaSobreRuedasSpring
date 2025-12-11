package com.colombia.rentacar.exceptions;

/**
 * Excepción personalizada que se lanza cuando un vehículo no se encuentra.
 */
public class VehiculoNotFoundException extends RuntimeException {
    public VehiculoNotFoundException(Long id) {
        super("Vehículo con ID " + id + " no encontrado.");
    }
}
