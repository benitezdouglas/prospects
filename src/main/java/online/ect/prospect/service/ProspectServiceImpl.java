package online.ect.prospect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.ect.prospect.model.Prospect;
import online.ect.prospect.repository.ProspectRepository;

@Service
public class ProspectServiceImpl implements ProspectService{

    @Autowired
    private ProspectRepository prospectRepository;

    @Override
    public Prospect save(Prospect prospect) {
    	prospect.setSincronized(true);
        return prospectRepository.save(prospect);
    }

    @Override
    public List<Prospect> findAll() {
        return prospectRepository.findAll();
    }

    @Override
    public Optional<Prospect> findById(Long id) {
        return prospectRepository.findById(id);
    }

    @Override
    public Prospect update(Prospect prospect) {
        return prospectRepository.save(prospect);
    }

    @Override
    public void deleteById(Long id) {
    	prospectRepository.deleteById(id);
    }

}