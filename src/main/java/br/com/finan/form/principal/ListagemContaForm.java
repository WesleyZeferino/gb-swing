package br.com.finan.form.principal;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import br.com.finan.dto.DTO;
import br.com.finan.entidade.Conta;
import br.com.finan.entidade.enumerator.Mes;

/**
 *
 * @author Wesley Luiz
 * @param <T>
 */
public abstract class ListagemContaForm<T extends DTO> extends ListagemForm<T> {

	/** Atributo serialVersionUID. */
	private static final long serialVersionUID = 1L;

	protected static final String MASK_YEAR = "yyyy";

	private List<Mes> meses;
	private Mes mesSelecionado;
	private String ano;

	/**
	 * Creates new form ListagemDespesa
	 */
	public ListagemContaForm() {
		meses = Arrays.asList(Mes.values());
		mesSelecionado = Mes.JANEIRO;
		ano = new SimpleDateFormat(MASK_YEAR).format(new Date());

		initComponents();
		iniciarDados();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {
		bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

		btnMesAnterior = new javax.swing.JButton();
		btnMesProximo = new javax.swing.JButton();
		txtMes = new javax.swing.JComboBox();
		txtAno = new javax.swing.JTextField();

		setClosable(true);
		setMaximizable(true);
		setResizable(true);

		jScrollPane1.setViewportView(tabela);

		btnMesAnterior.setText("<");
		btnMesAnterior.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				btnMesAnteriorActionPerformed(evt);
			}
		});

		btnMesProximo.setText(">");
		btnMesProximo.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(final java.awt.event.ActionEvent evt) {
				btnMesProximoActionPerformed(evt);
			}
		});

		final org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${meses}");
		final org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, txtMes);
		bindingGroup.addBinding(jComboBoxBinding);
		org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${mesSelecionado}"), txtMes,
				org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
		bindingGroup.addBinding(binding);

		txtAno.setEnabled(false);

		binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${ano}"), txtAno, org.jdesktop.beansbinding.BeanProperty.create("text"));
		bindingGroup.addBinding(binding);

		pnlPaginacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		lbPaginacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

		final javax.swing.GroupLayout pnlPaginacaoLayout = new javax.swing.GroupLayout(pnlPaginacao);
		pnlPaginacao.setLayout(pnlPaginacaoLayout);
		pnlPaginacaoLayout.setHorizontalGroup(pnlPaginacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				pnlPaginacaoLayout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(lbPaginacao, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnPrimeiro).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnAnterior).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(btnProximo).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnUltimo).addContainerGap()));
		pnlPaginacaoLayout.setVerticalGroup(pnlPaginacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlPaginacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnUltimo).addComponent(btnProximo).addComponent(btnAnterior).addComponent(btnPrimeiro))
				.addComponent(lbPaginacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE));

		final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1)
						.addGroup(
								layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												layout.createSequentialGroup().addComponent(btnMesAnterior).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnMesProximo)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup().addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(btnExcluir))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(pnlPaginacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))).addContainerGap()));

		layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { btnExcluir, btnSalvar });

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnMesAnterior).addComponent(btnMesProximo).addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(pnlPaginacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap()));

		bindingGroup.bind();

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnMesAnteriorActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesAnteriorActionPerformed
		irMesAnterior(txtMes, txtAno);
	}// GEN-LAST:event_btnMesAnteriorActionPerformed

	private void btnMesProximoActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMesProximoActionPerformed
		irProximoMes(txtMes, txtAno);
	}// GEN-LAST:event_btnMesProximoActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnMesAnterior;
	private javax.swing.JButton btnMesProximo;
	private javax.swing.JTextField txtAno;
	private javax.swing.JComboBox txtMes;
	private org.jdesktop.beansbinding.BindingGroup bindingGroup;

	// End of variables declaration//GEN-END:variables

	@Override
	protected String getNomeEntidade() {
		return Conta.class.getSimpleName();
	}

	protected void irMesAnterior(final JComboBox txtMes, final JTextField txtAno) {
		final int mes = getMesSelecionado().getReferencia() - 1;
		navegar(mes, txtAno, txtMes);
	}

	protected void irProximoMes(final JComboBox txtMes, final JTextField txtAno) {
		final int mes = getMesSelecionado().getReferencia() + 1;
		navegar(mes, txtAno, txtMes);
	}

	private void navegar(int mes, final JTextField txtAno, final JComboBox txtMes) throws NumberFormatException {
		if (mes < 1) {
			mes = 12;
			final Integer a = Integer.valueOf(getAno()) - 1;
			txtAno.setText(a.toString());
		} else if (mes > 12) {
			mes = 1;
			final Integer a = Integer.valueOf(getAno()) + 1;
			txtAno.setText(a.toString());
		}

		txtMes.setSelectedItem(Mes.getMesPorReferencia(mes));
		buscarDados(1);
		validarBtnPaginacao();
	}

	public List<Mes> getMeses() {
		return meses;
	}

	public void setMeses(final List<Mes> meses) {
		this.meses = meses;
	}

	public Mes getMesSelecionado() {
		return mesSelecionado;
	}

	public void setMesSelecionado(final Mes mesSelecionado) {
		this.mesSelecionado = mesSelecionado;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(final String ano) {
		this.ano = ano;
	}

}
