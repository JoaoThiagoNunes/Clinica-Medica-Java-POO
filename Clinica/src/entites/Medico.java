package entites;

import java.time.LocalDate;
import java.util.Date;

public class Medico {
	private int crm;
	private String name;
	private Date dateNascimento;
	private LocalDate dateCadastro;
	

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateNascimento() {
		return dateNascimento;
	}

	public void setDateNascimento(Date dateNascimento) {
		this.dateNascimento = dateNascimento;
	}

	public LocalDate getDateCadastro() {
		return dateCadastro;
	}

	public void setDateCadastro(LocalDate dateCadastro) {
		this.dateCadastro = dateCadastro;
	}

	public String toString() {
		return "Nome do médico: " + this.name + " CRM: " + this.crm + " Data do cadastro: " + this.dateCadastro;
	}

	
	
	
}
