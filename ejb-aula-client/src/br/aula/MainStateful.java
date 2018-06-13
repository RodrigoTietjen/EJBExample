package br.aula;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;

import br.model.Produto;

public class MainStateful {
	
	public static void main(String[] args) {
		MainStateful ms = new MainStateful();
		ms.testEJB();
	}

	private void testEJB() {
		ISessionBeanStatefulRemote remote;
		try {
			InitialContext ctx = new InitialContext(JNDIConfig.getConfigs());
			remote = (ISessionBeanStatefulRemote)ctx.lookup("ejb:/ejb-aula/SessionBeanStateful!br.aula.ISessionBeanStatefulRemote?stateful");
			int adicionando = 1;
			String nome = "";
			int estoque = 0;
			
			while(adicionando == 1) {
				nome = JOptionPane.showInputDialog("Nome do produto:");
				estoque = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de estoque do produto(" + nome + "):"));
				Produto p = new Produto();
				p.setNome(nome);
				p.setEstoque(estoque);
				remote.addProduto(p);
				adicionando = Integer.parseInt(JOptionPane.showInputDialog("Adicionar mais produtos?\n 1-sim  0-nao"));
			}
			
			//TODO
			int comprando = 1;
			while(comprando == 1) {
				StringBuilder sb = new StringBuilder();
				sb.append("Selecione um produto: ");
			}
			
			for (Produto produto : remote.getProdutos()) {
				System.out.println(produto);
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
