package pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.dawi_cl1_gonzalesquintanilla.model.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, String> {

}
