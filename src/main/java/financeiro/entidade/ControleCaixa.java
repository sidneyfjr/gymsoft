package financeiro.entidade;


import pessoas.entidade.OperadorCaixa;

public interface ControleCaixa {
	
	public abstract void abrir(Integer n, OperadorCaixa o);
	public abstract void fechar();
	public abstract void entrada(Integer n);
	public abstract void saida(Integer n); 

}
