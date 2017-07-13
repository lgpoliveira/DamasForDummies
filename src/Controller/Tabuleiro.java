/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Tela;

/**
 *
 * @author Guga
 */
public class Tabuleiro {

    private Casa[][] matriz = new Casa[8][8];
    private static Peca peca;
    private static Tela t = new Tela();
    private int linIni;
    private int linFim;
    private int colIni;
    private int colFim;

    public static Peca getPeca() {
        return peca;
    }

    public Casa[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Casa[][] matriz) {
        this.matriz = matriz;
    }

    public void setCasa(int linha, int coluna, Casa casa) {
        this.matriz[linha][coluna] = casa;
    }

    public Casa getCasa(int linha, int coluna) {
        return matriz[linha][coluna];
    }

    public Tabuleiro() {
        //setTabuleiroInicial();
    }
    public Tela getTela()
    {
        return t;
    }

    public void setTabuleiroInicial() {
        Peca pecaTemp;
        Casa casa = null;

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 8; i++) {
                if (j == 0 || j == 2) {
                    if (i % 2 == 0) {
                        casa = new Casa(j, i);
                        pecaTemp = new Peca(0);
                        casa.setPeca(pecaTemp);
                        this.setCasa(j, i, casa);
                    }
                } else {
                    if (i % 2 != 0) {
                        casa = new Casa(j, i);
                        pecaTemp = new Peca(0);
                        casa.setPeca(pecaTemp);
                        this.setCasa(j, i, casa);
                    }
                }
            }
        }
        for (int j = 3; j < 5; j++) {
            for (int i = 0; i < 8; i++) {
                if (j == 3) {
                    if (i % 2 != 0) {
                        casa = new Casa(j, i);
                        casa.setPeca(null);
                        this.setCasa(j, i, casa);
                    }
                } else {
                    if (i % 2 == 0) {
                        casa = new Casa(j, i);
                        casa.setPeca(null);
                        this.setCasa(j, i, casa);
                    }
                }

            }
        }

        for (int j = 5; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (j == 5 || j == 7) {
                    if (i % 2 != 0) {
                        casa = new Casa(j, i);
                        peca = new Peca(1);
                        casa.setPeca(peca);
                        this.setCasa(j, i, casa);
                    }
                } else {
                    if (i % 2 == 0) {
                        casa = new Casa(j, i);
                        peca = new Peca(1);
                        casa.setPeca(peca);
                        this.setCasa(j, i, casa);
                    }
                }
            }
        }
    }

    void updateTabuleiro(int[] msg) {
        if (msg[0] == 5 && msg[3] == 255) {
            switch (msg[1]) {
                case 0: {
                    peca = getCasa(0, 0).getPeca();
                    linIni = 0;
                    colIni = 0;
                    break;
                }
                case 8: {
                    peca = getCasa(2, 0).getPeca();
                    linIni = 2;
                    colIni = 0;
                    break;
                }
                case 16: {
                    peca = getCasa(4, 0).getPeca();
                    linIni = 4;
                    colIni = 0;
                    break;
                }
                case 24: {
                    peca = getCasa(6, 0).getPeca();
                    linIni = 6;
                    colIni = 0;
                    break;
                }
                case 36: {
                    peca = getCasa(1, 1).getPeca();
                    linIni = 1;
                    colIni = 1;
                    break;
                }
                case 44: {
                    peca = getCasa(3, 1).getPeca();
                    linIni = 3;
                    colIni = 1;
                    break;
                }
                case 52: {
                    peca = getCasa(5, 1).getPeca();
                    linIni = 5;
                    colIni = 1;
                    break;
                }
                case 60: {
                    peca = getCasa(7, 1).getPeca();
                    linIni = 7;
                    colIni = 1;
                    break;
                }
                case 64: {
                    peca = getCasa(0, 2).getPeca();
                    linIni = 0;
                    colIni = 2;
                    break;
                }
                case 72: {
                    peca = getCasa(2, 2).getPeca();
                    linIni = 2;
                    colIni = 2;
                    break;
                }
                case 80: {
                    peca = getCasa(4, 2).getPeca();
                    linIni = 4;
                    colIni = 2;
                    break;
                }
                case 88: {
                    peca = getCasa(6, 2).getPeca();
                    linIni = 6;
                    colIni = 2;
                    break;
                }
                case 100: {
                    peca = getCasa(1, 3).getPeca();
                    linIni = 1;
                    colIni = 3;
                    break;
                }
                case 108: {
                    peca = getCasa(3, 3).getPeca();
                    linIni = 3;
                    colIni = 3;
                    break;
                }
                case 116: {
                    peca = getCasa(5, 3).getPeca();
                    linIni = 5;
                    colIni = 3;
                    break;
                }
                case 124: {
                    peca = getCasa(7, 3).getPeca();
                    linIni = 7;
                    colIni = 3;
                    break;
                }
                case 128: {
                    peca = getCasa(0, 4).getPeca();
                    linIni = 0;
                    colIni = 4;
                    break;
                }
                case 136: {
                    peca = getCasa(2, 4).getPeca();
                    linIni = 2;
                    colIni = 4;
                    break;
                }
                case 144: {
                    peca = getCasa(4, 4).getPeca();
                    linIni = 4;
                    colIni = 4;
                    break;
                }
                case 152: {
                    peca = getCasa(6, 4).getPeca();
                    linIni = 6;
                    colIni = 4;
                    break;
                }
                case 164: {
                    peca = getCasa(1, 5).getPeca();
                    linIni = 1;
                    colIni = 5;
                    break;
                }
                case 172: {
                    peca = getCasa(3, 5).getPeca();
                    linIni = 3;
                    colIni = 5;
                    break;
                }
                case 180: {
                    peca = getCasa(5, 5).getPeca();
                    linIni = 5;
                    colIni = 5;
                    break;
                }
                case 188: {
                    peca = getCasa(7, 5).getPeca();
                    linIni = 7;
                    colIni = 5;
                    break;
                }
                case 192: {
                    peca = getCasa(0, 6).getPeca();
                    linIni = 0;
                    colIni = 6;
                    break;
                }
                case 200: {
                    peca = getCasa(2, 6).getPeca();
                    linIni = 2;
                    colIni = 6;
                    break;
                }
                case 208: {
                    peca = getCasa(4, 6).getPeca();
                    linIni = 4;
                    colIni = 6;
                    break;
                }
                case 216: {
                    peca = getCasa(6, 6).getPeca();
                    linIni = 6;
                    colIni = 6;
                    break;
                }
                case 228: {
                    peca = getCasa(1, 7).getPeca();
                    linIni = 1;
                    colIni = 7;
                    break;
                }
                case 236: {
                    peca = getCasa(3, 7).getPeca();
                    linIni = 3;
                    colIni = 7;
                    break;
                }
                case 244: {
                    peca = getCasa(5, 7).getPeca();
                    linIni = 5;
                    colIni = 7;
                    break;
                }
                case 252: {
                    peca = getCasa(7, 7).getPeca();
                    linIni = 7;
                    colIni = 7;

                    break;
                }
            }
            switch (msg[2]) {
                case 0: {
                    //getCasa(0, 0).setPeca(peca);
                    linFim = 0;
                    colFim = 0;
                    break;
                }
                case 8: {
                    //getCasa(2, 0).setPeca(peca);
                    linFim = 2;
                    colFim = 0;
                    break;
                }
                case 16: {
                    //getCasa(4, 0).setPeca(peca);
                    linFim = 4;
                    colFim = 0;
                    break;
                }
                case 24: {
                    //getCasa(6, 0).setPeca(peca);
                    linFim = 6;
                    colFim = 0;
                    break;
                }
                case 36: {
                    //getCasa(1, 1).setPeca(peca);
                    linFim = 1;
                    colFim = 1;
                    break;
                }
                case 44: {
                    //getCasa(3, 1).setPeca(peca);
                    linFim = 3;
                    colFim = 1;
                    break;
                }
                case 52: {
                    //getCasa(5, 1).setPeca(peca);
                    linFim = 5;
                    colFim = 1;
                    break;
                }
                case 60: {
                    //getCasa(7, 1).setPeca(peca);
                    linFim = 7;
                    colFim = 1;
                    break;
                }
                case 64: {
                    //getCasa(0, 2).setPeca(peca);
                    linFim = 0;
                    colFim = 2;
                    break;
                }
                case 72: {
                    //getCasa(2, 2).setPeca(peca);
                    linFim = 2;
                    colFim = 2;
                    break;
                }
                case 80: {
                    //getCasa(4, 2).setPeca(peca);
                    linFim = 4;
                    colFim = 2;
                    break;
                }
                case 88: {
                    //getCasa(6, 2).setPeca(peca);
                    linFim = 6;
                    colFim = 2;
                    break;
                }
                case 100: {
                    //getCasa(1, 3).setPeca(peca);
                    linFim = 1;
                    colFim = 3;
                    break;
                }
                case 108: {
                    //getCasa(3, 3).setPeca(peca);
                    linFim = 3;
                    colFim = 3;
                    break;
                }
                case 116: {
                    //getCasa(5, 3).setPeca(peca);
                    linFim = 5;
                    colFim = 3;
                    break;
                }
                case 124: {
                    //getCasa(7, 3).setPeca(peca);
                    linFim = 7;
                    colFim = 3;
                    break;
                }
                case 128: {
                    //getCasa(0, 4).setPeca(peca);
                    linFim = 0;
                    colFim = 4;
                    break;
                }
                case 136: {
                    //getCasa(2, 4).setPeca(peca);
                    linFim = 2;
                    colFim = 4;
                    break;
                }
                case 144: {
                    //getCasa(4, 4).setPeca(peca);
                    linFim = 4;
                    colFim = 4;
                    break;
                }
                case 152: {
                    //getCasa(6, 4).setPeca(peca);
                    linFim = 6;
                    colFim = 4;
                    break;
                }
                case 164: {
                    //getCasa(1, 5).setPeca(peca);
                    linFim = 1;
                    colFim = 5;
                    break;
                }
                case 172: {
                    //getCasa(3, 5).setPeca(peca);
                    linFim = 3;
                    colFim = 5;
                    break;
                }
                case 180: {
                    //getCasa(5, 5).setPeca(peca);
                    linFim = 5;
                    colFim = 5;
                    break;
                }
                case 188: {
                    //getCasa(7, 5).setPeca(peca);
                    linFim = 7;
                    colFim = 5;
                    break;
                }
                case 192: {
                    //getCasa(0, 6).setPeca(peca);
                    linFim = 0;
                    colFim = 6;
                    break;
                }
                case 200: {
                    //getCasa(2, 6).setPeca(peca);
                    linFim = 2;
                    colFim = 6;
                    break;
                }
                case 208: {
                    //getCasa(4, 6).setPeca(peca);
                    linFim = 4;
                    colFim = 6;
                    break;
                }
                case 216: {
                    //getCasa(6, 6).setPeca(peca);
                    linFim = 6;
                    colFim = 6;
                    break;
                }
                case 228: {
                    //getCasa(1, 7).setPeca(peca);
                    linFim = 1;
                    colFim = 7;
                    break;
                }
                case 236: {
                    //getCasa(3, 7).setPeca(peca);
                    linFim = 3;
                    colFim = 7;
                    break;
                }
                case 244: {
                    //getCasa(5, 7).setPeca(peca);
                    linFim = 5;
                    colFim = 7;
                    break;
                }
                case 252: {
                    //getCasa(7, 7).setPeca(peca);
                    linFim = 7;
                    colFim = 7;
                    break;
                }
            }
        }
        if (isJogadaValida(linIni, linFim, colIni, colFim, peca)) {
            getCasa(linIni,colIni).setPeca(null);
            getCasa(linFim,colFim).setPeca(peca);
            t.updatePecas(linIni, colIni);
            t.updatePecas(linFim, colFim);
            if (linFim == 0)
                  getCasa(linFim, colFim).getPeca().setIsDama(true);

        } 

    }

    public boolean isJogadaValida(int linIni, int linFim, int colIni, int colFim, Peca peca) {
        if (getCasa(linFim, colFim).getPeca() != null) {
            return false;
        }
        if (peca.isDama()) {
            if ((linFim == (linIni + 1)
                    || linFim == (linIni - 1))
                    && (colFim == (colIni + 1)
                    || colFim == (colIni - 1))) {
                return true;
            } else if ((linFim == (linIni + 2)
                    || linFim == (linIni - 2))
                    && (colFim == (colIni + 2)
                    || colFim == (colIni - 2))) {
                if (getCasa(linFim - 1, colFim - 1).getPeca().getCor() == 0
                    || getCasa(linFim + 1, colFim + 1).getPeca().getCor() == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if ((linFim == (linIni + 4)
                    || linFim == (linIni - 4))
                    && (colFim == (colIni + 4)
                    || colFim == (colIni - 4)
                    || colFim == colIni)) {
                if ((getCasa(linFim - 1, colFim - 1).getPeca().getCor() == 0 || getCasa(linFim + 1, colFim + 1).getPeca().getCor() == 0)
                        && (getCasa(linFim - 3, colFim - 3).getPeca().getCor() == 0 || getCasa(linFim + 3, colFim + 3).getPeca().getCor() == 0)) {
                    return true;
                } else {
                    return false;
                }

            } else if ((linFim == (linIni + 6)
                    || linFim == (linIni - 6))
                    && (colFim == (colIni + 6)
                    || colFim == (colIni - 6)
                    || colFim == (colIni + 2)
                    || colFim == (colIni - 2))) {
                if ((getCasa(linFim - 1, colFim - 1).getPeca().getCor() == 0 || getCasa(linFim + 1, colFim + 1).getPeca().getCor() == 0)
                        && (getCasa(linFim - 3, colFim - 3).getPeca().getCor() == 0 || getCasa(linFim + 3, colFim + 3).getPeca().getCor() == 0)
                        && (getCasa(linFim - 5, colFim - 5).getPeca().getCor() == 0 || getCasa(linFim + 5, colFim + 5).getPeca().getCor() == 0)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            if (linFim == (linIni + 1)
                    && (colFim == (colIni + 1)
                    || colFim == (colIni - 1))) {
                return true;
            } else if (linFim == (linIni + 2)
                    && (colFim == (colIni + 2)
                    || colFim == (colIni - 2))) {
                if (getCasa(linFim - 1, colFim - 1).getPeca().getCor() == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (linFim == (linIni + 4)
                    && (colFim == (colIni + 4)
                    || colFim == (colIni - 4)
                    || colFim == colIni)) {
                if (getCasa(linFim - 1, colFim - 1).getPeca().getCor() == 0
                        && getCasa(linFim - 3, colFim - 3).getPeca().getCor() == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (linFim == (linIni + 6)
                    && (colFim == (colIni + 6)
                    || colFim == (colIni - 6)
                    || colFim == (colIni + 2)
                    || colFim == (colIni - 2))) {
                if (getCasa(linFim - 1, colFim - 1).getPeca().getCor() == 0
                        && getCasa(linFim - 3, colFim - 3).getPeca().getCor() == 0
                        && getCasa(linFim - 5, colFim - 5).getPeca().getCor() == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

    }
}
