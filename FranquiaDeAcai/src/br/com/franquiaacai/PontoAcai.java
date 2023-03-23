package br.com.franquiaacai;

import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Açaí desejado:\n300 ml\n500 ml\n700 ml"));

        boolean possuiAcrescimo = JOptionPane.showInputDialog(null, "Haverá acréscimo de sorvete? (Sim/Não)").equalsIgnoreCase("Sim");
        Acai acai = new Acai(tamanho, possuiAcrescimo);

            JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: " + acai.getValor(), "Valor", JOptionPane.INFORMATION_MESSAGE);
        }


    }


