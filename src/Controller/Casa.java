/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 *
 * @author Guga
 */
public final class Casa {
    private int linha;
    private int coluna;
    private Peca peca;

    public Casa(int linha, int coluna) {
        setLinha(linha);
        setColuna(coluna);
    }

    

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }


}
