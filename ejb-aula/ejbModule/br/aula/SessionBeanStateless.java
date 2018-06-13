package br.aula;

import javax.ejb.Stateless;

@Stateless
public class SessionBeanStateless
		implements ISessionBeanStatelessRemote{

	@Override
	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}

}
