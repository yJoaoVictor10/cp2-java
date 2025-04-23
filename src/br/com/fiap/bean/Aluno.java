package br.com.fiap.bean;
import javax.swing.*;
import java.time.LocalDate;

public class Aluno {
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    public Aluno() {

    }

    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        setRegistroMatricula(registroMatricula);
        this.nomeCompleto = nomeCompleto;
        setAnoDeNascimento(anoDeNascimento);
    }

    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999){
                this.registroMatricula = registroMatricula;
            }else{
                throw new Exception("O registro da matrícula deve ser maior ou igual a 80000 e menor ou igual a 599999.");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        try {
            LocalDate dataAtual = LocalDate.now();
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()){
                this.anoDeNascimento = anoDeNascimento;
            }else{
                throw new Exception("O ano de nascimento deve ser maior ou igual a 1945 e menor ou igual ao ano atual.");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int calcularIdade(LocalDate dataAtual){
        return dataAtual.getYear() - getAnoDeNascimento();
    }
}