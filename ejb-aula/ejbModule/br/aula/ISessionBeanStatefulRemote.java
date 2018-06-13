package br.aula;

import java.util.List;

import javax.ejb.Remote;

import br.model.Produto;

@Remote
public interface ISessionBeanStatefulRemote {
	void addProduto(Produto produto);
	
	List<Produto> getProdutos();
	
	
}
