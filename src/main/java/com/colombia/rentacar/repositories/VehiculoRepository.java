package com.colombia.rentacar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.colombia.rentacar.models.Vehiculo;

/**
 * Repositorio para gestionar las operaciones CRUD de la entidad Vehiculo.
 * Spring Data JPA genera automáticamente los métodos básicos (findAll, save, delete, etc.).
 */
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    // Aquí puedes agregar consultas personalizadas más adelante si lo necesitas.
}
