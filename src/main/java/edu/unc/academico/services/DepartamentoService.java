package edu.unc.academico.services;


import java.util.List;
import java.util.Optional;

import edu.unc.academico.domain.Departamento;

public interface DepartamentoService {
	//@Autowired   //con esto dto va a poder creear o eliminar un departamento
	//private DepartamentoRepository dto;
	List<Departamento>listarDptos();
	Optional<Departamento> buscarPorIdDpto(Long idDpto);
	Departamento grabarDpto(Departamento dpto);
	//void porque si elimina no retorna nada
	void eliminarDpto(Long idDpto);
}
