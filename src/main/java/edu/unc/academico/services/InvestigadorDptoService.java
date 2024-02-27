package edu.unc.academico.services;

import edu.unc.academico.domain.Investigador;

public interface InvestigadorDptoService {
	                                 //id de investigDOR, ID DE EDEPTO A DONDE VOY A ASIGNARLO
	public Investigador replaceDpto(Long idInvestigador, Long idDpto);
	//remover del dpto
	public void removeDpto(Long idInvestigador);

}
