package br.com.finan.form;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import br.com.arq.form.CadastroForm;
import br.com.finan.dao.CriteriaBuilder;
import br.com.finan.dao.Criterion;
import br.com.finan.dto.CategoriaDTO;
import br.com.finan.entidade.Categoria;
import br.com.finan.util.BindingUtil;
import br.com.finan.util.HibernateUtil;

public class CadastroCategoriaForm extends CadastroForm<Categoria, CategoriaDTO> {

	private static final long serialVersionUID = 1L;

	private static final String TITULO_FRAME = "Cadastro de Categorias";
	private JTextField txtNome;
	private JComboBox<Categoria> cmbSupCategoria;
	private JPanel pnlCadastro;
	
	public CadastroCategoriaForm() {
		txtNome = new JTextField(20);
		cmbSupCategoria = new JComboBox<Categoria>();

		pnlCadastro = new JPanel(new MigLayout());
		pnlCadastro.add(new JLabel("Nome:"));
		pnlCadastro.add(txtNome, "wrap");
		pnlCadastro.add(new JLabel("Categoria:"));
		pnlCadastro.add(cmbSupCategoria, "wrap, growx");
		
		add(pnlCadastro, "growx");

		BindingUtil binding = getBinding();
		binding.addJComboBoxBinding(HibernateUtil.getCriteriaBuilder(Categoria.class).eqStatusAtivo().list(), cmbSupCategoria)
			.add(this, "${entidade.superCategoria}", cmbSupCategoria, "selectedItem")
			.add(this, "${entidade.nome}", txtNome)
			.getBindingGroup().bind();
	}
	
	@Override
	protected String getTituloFrame() {
		return TITULO_FRAME;
	}

	@Override
	protected CriteriaBuilder getBuilderListagem() {
		return getBuilderQntDados().addProjection("id", "id").addProjection("nome", "nome").addAliases("superCategoria", "superCategoria", Criterion.LEFT_JOIN)
				.addProjection("superCategoria.nome", "supCategoria").addAliasToBean(CategoriaDTO.class).close();
	}

	@Override
	protected CriteriaBuilder getBuilderQntDados() {
		return HibernateUtil.getCriteriaBuilder(Categoria.class).eqStatusAtivo();
	}

	@Override
	protected JPanel getPanelCadastro() {
		return pnlCadastro;
	}

}