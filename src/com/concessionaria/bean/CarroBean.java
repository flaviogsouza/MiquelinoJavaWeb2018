package com.concessionaria.bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import com.concessionaria.dao.CarroDAO;
import com.concessionaria.domain.Carro;
import com.concessionaria.util.JSFUtil;

@ManagedBean(name = "MBCarro")
@ViewScoped /* mantem estado da beam enquanto houver requisiçoes */

public class CarroBean {

	private Carro carro;
	private ListDataModel<Carro> itens;

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public ListDataModel<Carro> getItens() {
		return itens;
	}

	public void setItens(ListDataModel<Carro> itens) {
		this.itens = itens;
	}

	@PostConstruct /* esse metodo automaticamente vai ser chmado antes da paguna */

	private void listar() throws Exception {
		try {
			CarroDAO dao = new CarroDAO();
			List<Carro> lista = dao.listAll();
			itens = new ListDataModel<Carro>(lista);
		} catch (SQLException ex) {
			ex.printStackTrace(); /* imprimi log de transação para mostra erro */
			JSFUtil.adicionarMensagemErro(ex.getMessage());
		}
	}

	public void preparaSalvar() {
		carro = new Carro();

	}

	public void salvar() throws Exception {

		try {
			CarroDAO dao = new CarroDAO();
			dao.inserir(carro);

			List<Carro> lista = dao.listAll(); /* para atualizar a lista atutomaticamente depois de add dados */
			itens = new ListDataModel<Carro>(lista);
			JSFUtil.adicionarMensagemSucesso("Carro cadastrado com Sucesso!!");

		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemErro(ex.getMessage());
		}

	}

	public void preparaExcluir() {

		carro = itens.getRowData(); /* traz qual foi o carro clicado */

	}

	public void excluir() throws Exception {

		try {
			CarroDAO dao = new CarroDAO();
			dao.excluir(carro);
			List<Carro> lista = dao.listAll();

			JSFUtil.adicionarMensagemSucesso("Carro excluido!!");

		} catch (SQLException ex) {
			ex.printStackTrace();
			JSFUtil.adicionarMensagemErro(ex.getMessage());/* imprimi a msg do banco */
		}
	}
	
	public void preparaEditar() {
		
	}
	
	public void editar() {
		
	}

}
