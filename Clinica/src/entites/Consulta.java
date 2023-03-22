package entites;



public class Consulta {
	private Medico medico;
	private Paciente paciente;
	private String dateConsulta;
	private String horaConsulta;
	private String firstConsulta;
	private String statusConsulta;
	private double valorConsulta;
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getDateConsulta() {
		return dateConsulta;
	}
	public void setDateConsulta(String dateConsulta) {
		this.dateConsulta = dateConsulta;
	}
	public String getHoraConsulta() {
		return horaConsulta;
	}
	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}
	public String getFirstConsulta() {
		return firstConsulta;
	}
	public void setFirstConsulta(String firstConsulta) {
		this.firstConsulta = firstConsulta;
	}
	public String getStatusConsulta() {
		return statusConsulta;
	}
	public void setStatusConsulta(String statusConsulta) {
		this.statusConsulta = statusConsulta;
	}
	public double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	public String toString() {
		return this.medico + "\n" + this.paciente + "\nData da consulta: " + this.dateConsulta + " às " + this.horaConsulta + "\nStatus: " + this.statusConsulta + "\nValor: " + this.valorConsulta;
	}
	
	
}
