package br.com.finan.form.receita;

import br.com.finan.entidade.Conta;
import br.com.finan.entidade.enumerator.TipoConta;
import br.com.finan.form.principal.CadastroContaForm;

/**
 * @author Wesley Luiz
 */
public class CadastroReceitaForm extends CadastroContaForm<Conta> {

	/** Atributo serialVersionUID. */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void iniciarDados() {
		getEntidade().setTipo(TipoConta.RECEITA);
		super.iniciarDados();
	}
	
	@Override
	protected void iniciarComponentes() {
		setTitle(CadastroContaForm.TITULO_CAD_RECEITA);
		super.iniciarComponentes();
	}
}
