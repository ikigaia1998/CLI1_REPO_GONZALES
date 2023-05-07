package pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.model.Especialidad;
import pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.repository.EspecialidadRepository;

import java.util.List;

@Service
public class EspecialidadService {

@Autowired
    private EspecialidadRepository especialidadRepository;

public List<Especialidad> listarEspecialidad(){
    return especialidadRepository.findAll();
}

public void registrarEspecialidad(Especialidad especialidad) {
        especialidadRepository.save(especialidad);
    }

}
