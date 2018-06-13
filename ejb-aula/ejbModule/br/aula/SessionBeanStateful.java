package br.aula;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Stateful;

import br.model.Produto;

@Stateful
public class SessionBeanStateful implements ISessionBeanStatefulRemote {
	List<Produto> produtos = new ArrayList<>();

	@Override
	public void addProduto(Produto produto) {
		
		produtos.add(produto);
	}

	@Override
	public List<Produto> getProdutos() {
		// TODO Auto-generated method stub
		return produtos;
	}
	

}
