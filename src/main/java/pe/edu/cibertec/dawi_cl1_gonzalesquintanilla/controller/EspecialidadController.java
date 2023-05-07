package pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.service.EspecialidadService;


@RequestMapping("/Especialidad")
@Controller
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;


}
