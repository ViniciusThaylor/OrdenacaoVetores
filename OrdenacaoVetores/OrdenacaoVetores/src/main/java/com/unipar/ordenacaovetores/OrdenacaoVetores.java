package com.unipar.ordenacaovetores;

import javax.swing.JOptionPane;

public class OrdenacaoVetores {

    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + " do vetor:"));
        }

        int selecao = -1;
        while (selecao != 0) {
            selecao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual método deseja usar para ordenar?"
                    + "\n1 - Ordenação por Inserção"
                    + "\n2 - Ordenação por Seleção"
                    + "\n3 - Ordenação por Bolha"
                    + "\n0 - Sair"));

            switch (selecao) {
                case 0:
                    break;
                case 1:
                    ordenacaoPorInsercao(vetor, tamanho);
                    break;
                case 2:
                    ordenacaoPorSelecao(vetor, tamanho);
                    break;
                case 3:
                    ordenacaoPorBolha(vetor, tamanho);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        }
    }

    private static void ordenacaoPorInsercao(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            int posicaoMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            if (posicaoMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = aux;
            }
        }

        
        StringBuilder numerosFormatados = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            numerosFormatados.append(vetor[i]);
            if (i < tamanho - 1) {
                numerosFormatados.append(", ");
            }
        }

        
        JOptionPane.showMessageDialog(null, "Os números do vetor ordenados são:\n" + numerosFormatados.toString());
    }

    private static void ordenacaoPorSelecao(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            int posicaoMenor = i;

            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }

            if (posicaoMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = aux;
            }
        }

        
        StringBuilder numerosFormatados = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            numerosFormatados.append(vetor[i]);
            if (i < tamanho - 1) {
                numerosFormatados.append(", ");
            }
        }

       
        JOptionPane.showMessageDialog(null, "Os números do vetor ordenados são:\n" + numerosFormatados.toString());
    }

    private static void ordenacaoPorBolha(int[] vetor, int tamanho) {
        boolean houveTroca = true;

        while (houveTroca) {
            houveTroca = false;

            for (int i = 0; i < tamanho - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houveTroca = true;
                }
            }
        }

        
        StringBuilder numerosFormatados = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            numerosFormatados.append(vetor[i]);
            if (i < tamanho - 1) {
                numerosFormatados.append(", ");
            }
        }

        
        JOptionPane.showMessageDialog(null, "Os números do vetor ordenados são:\n" + numerosFormatados.toString());
    }
}
