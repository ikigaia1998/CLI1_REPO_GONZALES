package pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.model.Especialidad;
import pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.service.EspecialidadService;


@RequestMapping("/Especialidad")
@Controller
public class EspecialidadController {

    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping("/frmListEspecialidad")
    public String frmListEspecialidad(Model model) {
        model.addAttribute("listaEspecialidad",especialidadService.listarEspecialidad());
        return "Especialidad/frmListEspecialidad";
    }

    @GetMapping("/frmRegEspecialidad")
    public String frmRegEstado(Model model){
        model.addAttribute("especialidadForm", new Especialidad());
        model.addAttribute("visualizar",false);

        return "Especialidad/frmRegEspecialidad";
    }


    @PostMapping("frmRegEspecialidad")
    public String registrarEstado(@ModelAttribute("especialidadForm") Especialidad especialidad , Model model){

        String mensaje="Especialidad registrado correctamente";
        try {
            especialidadService.registrarEspecialidad(especialidad);
        }catch (Exception e){
            mensaje="Especialidad no Registrada";
        }

        model.addAttribute("especialidadForm",new Especialidad());
        model.addAttribute("visualizar",true);
        model.addAttribute("respuesta",mensaje);

        return "Especialidad/frmRegEspecialidad";
    }






}



