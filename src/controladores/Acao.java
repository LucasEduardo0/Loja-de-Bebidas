package controladores;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;

public class Acao {
	
	//M�todos para cadastro
	public void Cadastrar(double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorTotal, int idadeMinima) {
		
		//Criar objeto
		ProdutoCadastrado pc = new ProdutoCadastrado();
		pc.setCodigoProduto(codigoProduto);
		pc.setNomeProduto(nomeProduto);
		pc.setDescricao(descricao);
		pc.setQuantidade(quantidade);
		pc.setValorUnitario(valorUnitario);
		pc.setValorTotal(valorTotal);
		pc.setIdadeMinima(idadeMinima);
		
		//Add ao ArrayList
		ProdutoCadastrado.dadosCadastro.add(pc);
		
	}
	
	//M�todo para retornar os dados do produto cadastrado
	public DefaultTableModel listarProdutoCadastrado() {
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("C�digo");
		modelo.addColumn("Nome");
		modelo.addColumn("Descri��o");
		modelo.addColumn("Quantidade (Litros)");
		modelo.addColumn("Valor (Litro)");
		modelo.addColumn("Valor Total");
		modelo.addColumn("Idade");
		
		for(int indice = 0; indice < ProdutoCadastrado.dadosCadastro.size(); indice++) {
			
			modelo.addRow(new Object [] {
					ProdutoCadastrado.dadosCadastro.get(indice).getCodigoProduto(),
					ProdutoCadastrado.dadosCadastro.get(indice).getNomeProduto(),
					ProdutoCadastrado.dadosCadastro.get(indice).getDescricao(),
					ProdutoCadastrado.dadosCadastro.get(indice).getQuantidade(),
					ProdutoCadastrado.dadosCadastro.get(indice).getValorUnitario(),
					ProdutoCadastrado.dadosCadastro.get(indice).getValorTotal(),
					ProdutoCadastrado.dadosCadastro.get(indice).getIdadeMinima()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//M�todo para alterar produto
	public void alterar(double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorTotal, int idadeMinima, int linha) {
	
		//Criar objeto
		ProdutoCadastrado pc = new ProdutoCadastrado();
		pc.setCodigoProduto(codigoProduto);
		pc.setNomeProduto(nomeProduto);
		pc.setDescricao(descricao);
		pc.setQuantidade(quantidade);
		pc.setValorUnitario(valorUnitario);
		pc.setValorTotal(valorTotal);
		pc.setIdadeMinima(idadeMinima);
		
		//Realizar a altera��o
		ProdutoCadastrado.dadosCadastro.set(linha, pc);
		
	}
	
	//M�todo para excluir produto
	public void excluir(int linha) {
		
		ProdutoCadastrado.dadosCadastro.remove(linha);
		
	}
	
	//M�todo para cadastrar o pedido
	public void cadastrarPedido(String nomeCliente, int idadeCliente, double codigoProduto, String nomeProduto, String descricao, double quantidade, double valorUnitario, double valorCompra, double pagoCliente, double troco, String hora, String data) {
		
		//Criar objeto
		ProdutoPedido pp = new ProdutoPedido();
		pp.setNomeCliente(nomeCliente);
		pp.setIdadeCliente(idadeCliente);
		pp.setCodigoProduto(codigoProduto);
		pp.setNomeProduto(nomeProduto);
		pp.setDescricao(descricao);
		pp.setQuantidade(quantidade);
		pp.setValorUnitario(valorUnitario);
		pp.setValorCompta(valorCompra);
		pp.setPagoCliente(pagoCliente);
		pp.setTroco(troco);
		pp.setHora(hora);
		pp.setData(data);
		
		//Add ao ArrayList
		ProdutoPedido.dadosPedido.add(pp);
		
	}
	
	//M�todo para retornar os dados do produto cadastrado
	public DefaultTableModel listarProdutoPedido() {
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Cliente");
		modelo.addColumn("Idade");
		modelo.addColumn("Codigo");
		modelo.addColumn("Produto");
		modelo.addColumn("Descri��o");
		modelo.addColumn("Quantidade");
		modelo.addColumn("Valor(Litro)");
		modelo.addColumn("Valor Compra");
		modelo.addColumn("Valor pago");
		modelo.addColumn("Troco");
		modelo.addColumn("Hora");
		modelo.addColumn("Data");
		
		for(int indice = 0; indice < ProdutoPedido.dadosPedido.size(); indice++) {
			
			modelo.addRow(new Object [] {
					ProdutoPedido.dadosPedido.get(indice).getNomeCliente(),
					ProdutoPedido.dadosPedido.get(indice).getIdadeCliente(),
					ProdutoPedido.dadosPedido.get(indice).getCodigoProduto(),
					ProdutoPedido.dadosPedido.get(indice).getNomeProduto(),
					ProdutoPedido.dadosPedido.get(indice).getDescricao(),
					ProdutoPedido.dadosPedido.get(indice).getQuantidade(),
					ProdutoPedido.dadosPedido.get(indice).getValorUnitario(),
					ProdutoPedido.dadosPedido.get(indice).getValorCompra(),
					ProdutoPedido.dadosPedido.get(indice).getPagoCliente(),
					ProdutoPedido.dadosPedido.get(indice).getTroco(),
					ProdutoPedido.dadosPedido.get(indice).getHora(),
					ProdutoPedido.dadosPedido.get(indice).getData()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//M�todo para cadastrar administrador
	public void cadastrarAdministrador(String nomeAdministrador, String loginAdministrador, String senhaAdministrador) {
		
		//Criar objeto
		Administrador a = new Administrador();
		a.setNomeAdministrador(nomeAdministrador);
		a.setLoginAdministrador(loginAdministrador);
		a.setSenhaAdministrador(senhaAdministrador);
		
		//Add ao ArrayList
		Administrador.dadosAdministrador.add(a);
		
	}
	
	//M�todos para retornar os dados do administrador
	public DefaultTableModel listarAdministrador() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Admistrador");
		
		for(int indice = 0; indice < Administrador.dadosAdministrador.size(); indice++) {
			
			modelo.addRow(new Object [] {
					Administrador.dadosAdministrador.get(indice).getNomeAdministrador(),
					Administrador.dadosAdministrador.get(indice).getLoginAdministrador(),
					Administrador.dadosAdministrador.get(indice).getSenhaAdministrador()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	//M�todo para excluir produto
		public void excluirAdministrador(int linha) {
			
			Administrador.dadosAdministrador.remove(linha);
			
		}
	
	

		
		
}
