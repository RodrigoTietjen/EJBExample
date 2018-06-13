package br.aula;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MainStateless {
	
	public static void main(String[] args) {
		MainStateless ms = new MainStateless();
		ms.testEJB();
	}

	private void testEJB() {
		ISessionBeanStatelessRemote remote;
		try {
			InitialContext ctx = new InitialContext(JNDIConfig.getConfigs());
			remote = (ISessionBeanStatelessRemote)ctx.lookup("ejb:/ejb-aula/SessionBeanStateless!br.aula.ISessionBeanStatelessRemote");
			System.out.println(remote.somar(5, -2));
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	
	
	

}
