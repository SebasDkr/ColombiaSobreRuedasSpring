package com.colombia.rentacar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación Colombia Sobre Ruedas.
 * 
 * Esta clase es el punto de entrada de la aplicación desarrollada con Spring Boot.
 * Se encarga de inicializar el contexto de Spring y levantar el servidor embebido
 * (Tomcat) para ejecutar la aplicación web.
 */
@SpringBootApplication
public class ColombiaSobreRuedasSpringApplication {

    /**
     * Método principal (main) que inicia la ejecución de la aplicación.
     * 
     * @param args Parámetros que se pueden pasar desde la línea de comandos.
     */
    public static void main(String[] args) {
        SpringApplication.run(ColombiaSobreRuedasSpringApplication.class, args);
    }

}

