package br.com.mainu.rest.estabelecimentos;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.mainu.bussines.estabelecimentos.EstabelecimentoManagerBean;
import br.com.mainu.entity.Estabelecimento;

@Path("/estabelecimentos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstabelecimentoResource {
	
	@EJB
	private EstabelecimentoManagerBean managerBean;
	
	@GET
	public List<Estabelecimento> getAll(){
		return managerBean.buscaEstabelecimentos();
	}
	
}
