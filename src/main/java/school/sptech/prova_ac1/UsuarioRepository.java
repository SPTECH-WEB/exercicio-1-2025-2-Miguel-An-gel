package school.sptech.prova_ac1;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.security.auth.callback.LanguageCallback;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

boolean existsByEmail(String email);
boolean existsByCpf(String cpf);

List<Usuario> findByDataNascimentoAfter(LocalDate dataNascimento);

    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByCpf(String cpf);
}
