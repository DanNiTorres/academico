package edu.unc.academico.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unc.academico.domain.Departamento;
import edu.unc.academico.domain.Investigador;
import edu.unc.academico.repository.DepartamentoRepository;
import edu.unc.academico.repository.InvestigadorRepository;
import jakarta.transaction.Transactional;

//para decir que e sun componente
@Service
public class InvestigadorDptoServiceImp implements InvestigadorDptoService {
	@Autowired
	private InvestigadorRepository invRep;
	@Autowired
	private DepartamentoRepository dptoRep;
	
	@Override
	@Transactional
	public Investigador replaceDpto(Long idInvestigador, Long idDpto) {
		Optional<Investigador> invEntity = invRep.findById(idInvestigador);
		Optional<Departamento> dptoEntity = dptoRep.findById(idDpto);
		
		invEntity.get().setDepartamento(dptoEntity.get());
		return invEntity.get();
	}
	
	@Override
	@Transactional
	public void removeDpto(Long idInvestigador) {
		Optional<Investigador> invEntity = invRep.findById(idInvestigador);
		Optional<Departamento> 
		        dptoEntity = dptoRep.findById(invEntity.get().getDepartamento().getIdDpto());
		dptoEntity.ifPresent(departamento -> departamento.getInvestigadores().remove(invEntity.getClass()));
		invEntity.get().setDepartamento(null);

    }
}
