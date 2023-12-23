package br.com.rafaelvieira.shopbeer.repository;

import br.com.rafaelvieira.shopbeer.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
