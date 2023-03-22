package entites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Paciente {
	private int cpf;
	private String name;
	private Date dateNascimento;
	private LocalDate dateCadastro;
	private String endereco;
	public ArrayList <Consulta> consulta;
	
	public ArrayList<Consulta> getConsultas() {
		if (consulta.size() == 0) {
			return null;
		}
		return consulta;
	}
	public void setConsulta(ArrayList<Consulta> consulta) {
		this.consulta =  consulta;
		
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
	return "Nome do paciente: " + this.name + " CPF: " + this.cpf + " Data de nascimento: " + this.dateNascimento;
	}
	
	public void removeConsulta(String date, int crm) {
		int cont = 0;
		for (Consulta consulta : this.consulta) {
			int count = 0;
			if (consulta.getMedico().getCrm() == crm && consulta.getDateConsulta().intern() == date.intern()) {
				cont = count;					
			}
			count += 1;		
		}
		this.consulta.remove(cont);
	}
	

}
