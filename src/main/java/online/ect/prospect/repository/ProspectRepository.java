package online.ect.prospect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import online.ect.prospect.model.Prospect;

public interface ProspectRepository extends JpaRepository<Prospect, Long> {

}