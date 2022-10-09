package com.g31.jpa.service;

import com.g31.jpa.entity.Admin;
import com.g31.jpa.repository.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaextremo
 */
@Service
public class AdminService {

    @Autowired
    private AdminRepository AdminRepository;

    //Metodo para consultar todos los registros (Capa de servicios)
    public List<Admin> getAdmin() {
        return AdminRepository.findAll();
    }

    //Metodo para insertar (Capa de servicios)
    public Admin insertAdmin(Admin Admin) {
        return AdminRepository.save(Admin);
    }
}
