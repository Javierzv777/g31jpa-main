package com.g31.jpa.controller;

import com.g31.jpa.entity.Admin;
import com.g31.jpa.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    private AdminService AdminService;
    
    //Metodo para consultar todos los registros (Capa de controlador)
    @GetMapping("/all")
    public List<Admin> getAdmin(){
        return AdminService.getAdmin();
    }

    //Metodo para insertar (Capa de controlador)
    @PostMapping("/save")
    public ResponseEntity insertAdmin(@RequestBody Admin Admin){
      AdminService.insertAdmin(Admin);
      return ResponseEntity.status(201).build(); 
    }
}
