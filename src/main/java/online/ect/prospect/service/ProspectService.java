package online.ect.prospect.service;

import java.util.List;
import java.util.Optional;

import online.ect.prospect.model.Prospect;

public interface ProspectService {

    Prospect save(Prospect product);

    List<Prospect> findAll();

    Optional<Prospect> findById(Long id);

    Prospect update(Prospect product);

    void deleteById(Long id);

}