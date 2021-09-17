package com.project.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FlowEvent;

import com.project.model.ClienteModel;

import lombok.Data;

@ManagedBean(name = "cliente")
@SessionScoped
public class ClienteBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ClienteModel model = new ClienteModel();
	private List<ClienteModel> list = new ArrayList<>();
	private boolean skip;
	
	public void save() {
		System.out.println("Hola");
		FacesMessage msg = new FacesMessage("Successful", "Bienvenido: " + model.getApellido() + ", " + model.getNombre());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public String onFlowProcess(FlowEvent event) {
		if(skip) {
			skip = false;
			return "confirm";
		}
		else {
			return event.getNewStep();
		}
	}
	
	public ClienteModel getModel() {
		return model;
	}
	public void setModel(ClienteModel model) {
		this.model = model;
	}
	public List<ClienteModel> getList() {
		return list;
	}
	public void setList(List<ClienteModel> list) {
		this.list = list;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}
	
}