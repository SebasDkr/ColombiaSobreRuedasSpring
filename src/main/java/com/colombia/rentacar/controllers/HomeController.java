package com.colombia.rentacar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controlador encargado de gestionar las solicitudes que llegan a la raíz
 * ("/") de la aplicación web.
 * 
 * Esta clase permite verificar que la aplicación se encuentra funcionando
 * correctamente al devolver un mensaje de estado en texto plano.
 */
@Controller
public class HomeController {

    /**
     * Método que atiende solicitudes HTTP GET dirigidas a la ruta "/".
     * 
     * @return Un mensaje simple indicando que la aplicación inició correctamente.
     */
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "La aplicación Spring Boot se está ejecutando correctamente.";
    }

}
