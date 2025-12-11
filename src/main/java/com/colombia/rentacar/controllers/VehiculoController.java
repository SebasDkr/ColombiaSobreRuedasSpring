package com.colombia.rentacar.controllers;

import com.colombia.rentacar.models.Vehiculo;
import com.colombia.rentacar.services.VehiculoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    /** Listar todos los vehículos */
    @GetMapping
    public List<Vehiculo> listarTodos() {
        return vehiculoService.listarTodos();
    }

    /** Obtener un vehículo por su ID */
    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> obtenerPorId(@PathVariable Long id) {
        Optional<Vehiculo> vehiculo = vehiculoService.buscarPorId(id);
        return vehiculo.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /** Crear un vehículo nuevo */
    @PostMapping
    public ResponseEntity<Vehiculo> crear(@Valid @RequestBody Vehiculo vehiculo) {
        Vehiculo creado = vehiculoService.guardar(vehiculo);
        return ResponseEntity.ok(creado);
    }

    /** Actualizar un vehículo existente */
    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> actualizar(@PathVariable Long id,
                                               @Valid @RequestBody Vehiculo vehiculo) {
        Optional<Vehiculo> existente = vehiculoService.buscarPorId(id);
        if (existente.isPresent()) {
            Vehiculo v = existente.get();
            v.setMarca(vehiculo.getMarca());
            v.setModelo(vehiculo.getModelo());
            v.setMatricula(vehiculo.getMatricula());
            v.setAnio(vehiculo.getAnio());
            v.setPrecioDia(vehiculo.getPrecioDia());
            v.setEstado(vehiculo.getEstado());
            Vehiculo actualizado = vehiculoService.guardar(v);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /** Eliminar un vehículo por su ID */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        Optional<Vehiculo> existente = vehiculoService.buscarPorId(id);
        if (existente.isPresent()) {
            vehiculoService.eliminar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
