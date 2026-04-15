package utp.edu.sistema_encomiendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import utp.edu.sistema_encomiendas.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
