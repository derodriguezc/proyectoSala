package com.proyecto.proyectoSala.controller;

import com.proyecto.proyectoSala.entity.Responsable;
import com.proyecto.proyectoSala.service.ResponsableServiceImpl;
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
@RequestMapping("/responsable")
public class ResponsableController {

    @Autowired
    private ResponsableServiceImpl responsableService;

    //localhost:8080/responsable

    @ApiOperation(value = "Obtener un responsable por id",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Responsable")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontro responsable en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})

    @GetMapping("/{id}")
    public Responsable findById(@PathVariable("id") Integer id) throws Exception {
        return responsableService.findById(id);
    }

    @ApiOperation(value = "Obtener todos las Responsables",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Responsable")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron responsables en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @GetMapping
    public  @ResponseBody
    List<Responsable> findAll(){
        return responsableService.findAll();
    }


    @ApiOperation(value = "Guargar un responsable",
            notes = "Necesita un body nombre_sala, ubicacion_sala,tipo, estado,responsable_sala.",
            response = List.class,
            responseContainer = "Responsable")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 200, message = "Peticón OK")})
    @PostMapping
    public @ResponseBody Responsable save(@RequestBody Responsable responsable){return responsableService.save(responsable);}

}
