package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1;
        Aluno aluno2;
        Aluno aluno3;
        Aluno aluno4;

        LocalDate dataAtual = LocalDate.now();

        String auxiliar;
        try {
             aluno1 = new Aluno(565592, "André Emygdio", 2004);
             aluno2 = new Aluno(561995, "Gabriel Lourenço Müller", 2006);
             aluno3 = new Aluno();
             aluno4 = new Aluno();

            auxiliar = JOptionPane.showInputDialog("Digite o RM do aluno 3: ");
                aluno3.setRegistroMatricula(Integer.parseInt(auxiliar));
            auxiliar = JOptionPane.showInputDialog("Digite o nome completo do aluno 3: ");
                aluno3.setNomeCompleto(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento do aluno 3: ");
                aluno3.setAnoDeNascimento(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite o RM do aluno 4: ");
                aluno4.setRegistroMatricula(Integer.parseInt(auxiliar));
            auxiliar = JOptionPane.showInputDialog("Digite o nome completo do aluno 4: ");
                aluno4.setNomeCompleto(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano de nascimento do aluno 4: ");
                aluno4.setAnoDeNascimento(Integer.parseInt(auxiliar));

            String mensagem = String.format(
                    "Aluno 1 -> RM: %d | Nome: %s | Idade: %d\n" +
                            "Aluno 2 -> RM: %d | Nome: %s | Idade: %d\n" +
                            "Aluno 3 -> RM: %d | Nome: %s | Idade: %d\n" +
                            "Aluno 4 -> RM: %d | Nome: %s | Idade: %d",
                    aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual),
                    aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual),
                    aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual),
                    aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual)
            );

            JOptionPane.showMessageDialog(null, mensagem);

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}