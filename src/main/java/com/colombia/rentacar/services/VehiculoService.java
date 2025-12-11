package com.colombia.rentacar.services;

import com.colombia.rentacar.models.Vehiculo;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio para la gestión de vehículos.
 * Define las operaciones de negocio disponibles para la entidad Vehiculo.
 */
public interface VehiculoService {

    /**
     * Obtiene la lista completa de vehículos registrados.
     */
    List<Vehiculo> listarTodos();

    /**
     * Busca un vehículo por su ID.
     * @param id Identificador único del vehículo
     */
    Optional<Vehiculo> buscarPorId(Long id);

    /**
     * Guarda o actualiza un vehículo en la base de datos.
     */
    Vehiculo guardar(Vehiculo vehiculo);

    /**
     * Elimina un vehículo por su ID.
     */
    void eliminar(Long id);
}
