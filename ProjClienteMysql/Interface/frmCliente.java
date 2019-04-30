package Interface;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import RegrasDeNegocio.PessoaFisica;


public class frmCliente extends JFrame implements ActionListener{

	private String cpfantigo;
	private JLabel lbNome;
	private JLabel lbCpfCnpj;
	private JLabel lbLogradouro;
	private JLabel lbBairro;
	private JLabel lbNumero;
	private JLabel lbComplemento;
	private JLabel lbCidade;
	private JLabel lbPais;
	private JLabel lbCep;
	private JLabel lbUf;
	
	private JTextField txtNome;
	private JTextField txtCpfCnpj;
	private JTextField txtLogradouro;
	private JTextField txtBairro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtCidade;
	private JTextField txtPais;
	private JTextField txtCep;
	private JTextField txtUf;
	
	private JButton btnCadastrar;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnExcluir;
	private JButton btnLimpar;
	public frmCliente()
	{
		lbNome = new JLabel("Nome do Cliente");
		lbCpfCnpj = new JLabel("CPF/CNPJ");
		lbLogradouro = new JLabel("Logradouro");
		lbBairro = new JLabel("Bairro");
		lbNumero =  new JLabel("Número");
		lbComplemento = new JLabel("Complemento");
		lbCidade =  new JLabel("Cidade");
		lbPais = new JLabel("Pais");
		lbCep =  new JLabel("CEP");
		lbUf = new JLabel("UF");
		
		txtNome = new JTextField(30);
		txtCpfCnpj = new JTextField(30);
		txtLogradouro = new JTextField(30);
		txtBairro = new JTextField(30);
		txtNumero = new JTextField(30);
		txtComplemento = new JTextField(30);
		txtCidade = new JTextField(30);
		txtPais = new JTextField(30);
		txtCep = new JTextField(30);
		txtUf = new JTextField(30);
		
		btnCadastrar = new JButton("Cadastar");
		btnLimpar = new JButton("Limpar");
		btnConsultar = new JButton("Consultar");
		btnAlterar = new JButton("Alterar");
		btnExcluir = new JButton("Excluir");
		
		GridLayout grid = new GridLayout(13,2);
		this.getContentPane().setLayout(grid);
		this.getContentPane().add(lbNome);
		this.getContentPane().add(txtNome);
		this.getContentPane().add(lbCpfCnpj);
		this.getContentPane().add(txtCpfCnpj);
		this.getContentPane().add(lbLogradouro);
		this.getContentPane().add(txtLogradouro);
		this.getContentPane().add(lbBairro);
		this.getContentPane().add(txtBairro);
		this.getContentPane().add(lbNumero);
		this.getContentPane().add(txtNumero);
		this.getContentPane().add(lbComplemento);
		this.getContentPane().add(txtComplemento);
		this.getContentPane().add(lbCidade);
		this.getContentPane().add(txtCidade);
		this.getContentPane().add(lbUf);
		this.getContentPane().add(txtUf);
		this.getContentPane().add(lbPais);
		this.getContentPane().add(txtPais);
		this.getContentPane().add(lbCep);
		this.getContentPane().add(txtCep);
		this.getContentPane().add(btnCadastrar);
		this.getContentPane().add(btnConsultar);
		this.getContentPane().add(btnAlterar);
		this.getContentPane().add(btnExcluir);
		this.getContentPane().add(btnLimpar);
		
		btnCadastrar.addActionListener(this);
		btnConsultar.addActionListener(this);
		btnAlterar.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnLimpar.addActionListener(this);
		this.setBounds(0, 0, 300, 300);
		this.setVisible(true);
	}
	//Essa função limpa todos os campos do formulário
	private void Limpar()
	{
		cpfantigo =  "";
		txtNome.setText("");
		txtCpfCnpj.setText("");
		txtLogradouro.setText("");
		txtBairro.setText("");
		txtNumero.setText("");
		txtComplemento.setText("");
		txtCidade.setText("");
		txtPais.setText("");
		txtCep.setText("");
		txtUf.setText("");
		
	}
	private void preencherForm(ResultSet rs)
	{
		
		try {
			if(rs.next())
			{
			cpfantigo =  rs.getString("cpf");
			txtNome.setText(rs.getString("nome"));
			txtCpfCnpj.setText(rs.getString("cpf"));
			txtLogradouro.setText(rs.getString("logradouro"));
			txtBairro.setText(rs.getString("bairro"));
			txtNumero.setText(rs.getString("numero"));
			txtComplemento.setText(rs.getString("complemento"));
			txtCidade.setText(rs.getString("cidade"));
			txtPais.setText(rs.getString("pais"));
			txtCep.setText("");
			txtUf.setText("");
			}
			else
				JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		
		//Cadastar
		if(e.getSource().equals(btnCadastrar))
		{
			
			PessoaFisica pf = new PessoaFisica();
			boolean resultado = pf.cadastrar(this.txtNome.getText(), this.txtCpfCnpj.getText(), this.txtLogradouro.getText(), this.txtBairro.getText(), this.txtNumero.getText(), this.txtComplemento.getText(), this.txtCidade.getText(), this.txtPais.getText());
			if(resultado)
			{
				JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!");
				this.Limpar();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Cliente não foi Cadastrado!");
			}
		}
		if(e.getSource().equals(btnAlterar))
		{
			
			boolean resultado = PessoaFisica.alterar(cpfantigo,this.txtNome.getText(), this.txtCpfCnpj.getText(), this.txtLogradouro.getText(), this.txtBairro.getText(), this.txtNumero.getText(), this.txtComplemento.getText(), this.txtCidade.getText(), this.txtPais.getText());
			if(resultado)
			{
				JOptionPane.showMessageDialog(null, "Cliente alterado com Sucesso!");				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Cliente não foi alterado!");
			}
		}

		//Limpar
		if(e.getSource().equals(btnLimpar))
			this.Limpar();
		//consultar
		if(e.getSource().equals(btnConsultar))
		{
			preencherForm(PessoaFisica.consultar(this.txtCpfCnpj.getText()));
		}
		//Excluir
		if(e.getSource().equals(btnExcluir))
			if(PessoaFisica.excluir(this.txtCpfCnpj.getText()))
				JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
			else
				JOptionPane.showMessageDialog(null, "Não foi possível exlcuir o cliente!");
		
	}
	
}
