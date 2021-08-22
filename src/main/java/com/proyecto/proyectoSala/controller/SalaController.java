package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Sala;
import com.proyecto.proyectoSala.service.SalaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sala")
public class SalaController {

    @Autowired
    private SalaService salaService;

    //localhost:8080/sala

    @ApiOperation(value = "Obtener una sala por id",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Sala")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontro sala en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})

    @GetMapping("/{id}")
    public Sala findById(@PathVariable("id") Integer id) throws Exception {
        return salaService.findById(id);
    }

    @ApiOperation(value = "Obtener todos las Salas",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Sala")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron salas en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})

    @GetMapping
    public  @ResponseBody List<Sala> findAll(){
        return salaService.findAll();
    }

    @ApiOperation(value = "Guargar una sala",
            notes = "Necesita un body nombre_sala, ubicacion_sala,tipo, estado,responsable_sala.",
            response = List.class,
            responseContainer = "Sala")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 200, message = "Peticón OK")})

    @PostMapping
    public @ResponseBody Sala save(@RequestBody Sala sala){
        return salaService.save(sala);
    }

}
