package com.colombia.rentacar.services;

import com.colombia.rentacar.models.Vehiculo;
import com.colombia.rentacar.repositories.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementación del servicio de vehículos.
 * Aquí se concentra la lógica de negocio relacionada con la entidad Vehiculo.
 */
@Service
public class VehiculoServiceImpl implements VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    /**
     * Inyección de dependencias del repositorio mediante constructor.
     */
    public VehiculoServiceImpl(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public List<Vehiculo> listarTodos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Optional<Vehiculo> buscarPorId(Long id) {
        return vehiculoRepository.findById(id);
    }

    @Override
    public Vehiculo guardar(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public void eliminar(Long id) {
        vehiculoRepository.deleteById(id);
    }
}
