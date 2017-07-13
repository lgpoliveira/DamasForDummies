/**
 * @author Luis Gustavo Peil de Oliveira
 * Classe responsável por controlar todo o funcionamento e lógica do jogo.
 */
package Controller;

import Model.Communication;
import Model.Padroes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guga
 */
public class Jogo extends Tabuleiro {

    boolean isPlayer;
    Peca peca;
    private static Padroes pad = new Padroes();
    private static Communication com = new Communication();
    int linhaFim = 0, colunaFim = 0, comeu = 0;
    byte[] jogada = new byte[2];
    List comidas;

    
    public void startConn() throws Exception {
        iniciarPartida();
    }

    public Jogo() {
    }

    @Override
    public void setTabuleiroInicial() {
        super.setTabuleiroInicial();
    }

    private void setIsPlayer(boolean isPlayer) {
        this.isPlayer = isPlayer;
    }

    public boolean IsPlayer() {
        return this.isPlayer;
    }

    public void updateTela() {
    }

    public void updateTabuleiro(int[] msg) {
        super.updateTabuleiro(msg);
        this.isPlayer = false;
        executarJogada();
        this.isPlayer = true;
        com.read();

    }

    private void executarJogada() {
        Casa[][] tabuleiro = super.getMatriz();

        int tempComeu = 0;
        int linha = 0, coluna = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] != null
                        && tabuleiro[i][j].getPeca() != null
                        && tabuleiro[i][j].getPeca().isDama()
                        && tabuleiro[i][j].getPeca().getCor() == 0) {
                    calculaMelhorJogada(i, j, true);
                    if (comeu > tempComeu) {
                        tempComeu = comeu;
                        comeu = 0;
                        linha = i;
                        coluna = j;
                        jogada[0] = pad.getValorMsgTrue(i, j);
                        jogada[1] = pad.getValorMsgFalse(linhaFim, colunaFim);
                        break;
                    }else
                    {
                        if (comeu == 0 && i != linhaFim && j != colunaFim)
                        {
                            jogada[0] = pad.getValorMsgTrue(i, j);
                            jogada[1] = pad.getValorMsgFalse(linhaFim, colunaFim);
                            break;
                        }
                    }

                } else if (tabuleiro[i][j] != null
                        && tabuleiro[i][j].getPeca() != null
                        && !tabuleiro[i][j].getPeca().isDama()
                        && tabuleiro[i][j].getPeca().getCor() == 0) {
                    calculaMelhorJogada(i, j, false);
                    if (comeu > tempComeu) {
                        tempComeu = comeu;
                        comeu = 0;
                        jogada[0] = pad.getValorMsgTrue(i, j);
                        jogada[1] = pad.getValorMsgFalse(linhaFim, colunaFim);
                        break;
                    }else
                    {
                         if (comeu == 0 && i != linhaFim && j != colunaFim)
                        {
                            jogada[0] = pad.getValorMsgTrue(i, j);
                            jogada[1] = pad.getValorMsgFalse(linhaFim, colunaFim);
                            break;
                        }
                    }
                }


            }
            

        }
        super.getTela().updatePecas(linha, coluna);
            super.getTela().updatePecas(linhaFim, colunaFim);
            peca = getCasa(linha, coluna).getPeca();
            getCasa(linha,coluna).setPeca(null);
            getCasa(linhaFim, colunaFim).setPeca(peca);
            if (linhaFim == 7) {
                getCasa(linhaFim, colunaFim).getPeca().setIsDama(true);
            }
            linhaFim = 0;
            colunaFim = 0;
            comeu = 0;

            com.sendMessage(jogada);



    }

    private void calculaMelhorJogada(int linha, int coluna, boolean dama) {
        comidas = new ArrayList();
        int tempLinha, tempLinha2,tempLinha3,tempLinha4, tempColuna, tempColuna2,tempColuna3,tempColuna4;
        tempLinha = linha + 1;
        tempLinha2 = linha + 2;
        tempLinha3 = linha - 1;
        tempLinha4 = linha - 2;
        tempColuna = coluna + 1;
        tempColuna2 = coluna + 2;
        tempColuna3 = coluna - 1;
        tempColuna4 = coluna - 2;
        if (tempLinha <= 7 && tempLinha2 <= 7 && tempLinha3 >= 0 && tempLinha4 >= 0
             && tempColuna <= 7 && tempColuna2 <= 7 && tempColuna3 >= 0 && tempColuna4 >= 0) {
            if (dama) {
                if (linha ++ <= 7 && tempColuna <= 7
                        &&getCasa(tempLinha, tempColuna) != null
                        && getCasa(tempLinha, tempColuna).getPeca() != null
                        && getCasa(tempLinha, tempColuna).getPeca().getCor() == 1
                        && tempLinha2 <= 7 && tempColuna2 <= 7
                        && getCasa(tempLinha2, tempColuna2) != null
                        && getCasa(tempLinha2, tempColuna2).getPeca() == null) {
                    comeu++;
                    if (linha <= 5 && coluna <= 5)
                        calculaMelhorJogada(tempLinha2, tempColuna2, dama);
                    else
                    {
                        linhaFim = linha;
                        colunaFim = coluna;
                        
                    }
                } else if (tempLinha3 >= 0 && tempColuna3 >= 0
                        && getCasa(tempLinha3, tempColuna3) != null
                        && getCasa(tempLinha3, tempColuna3).getPeca() != null
                        && getCasa(tempLinha3, tempColuna3).getPeca().getCor() == 1
                        && (tempLinha4 )>= 0 && (tempColuna4) >= 0
                        && getCasa(tempLinha4, tempColuna4) != null
                        && getCasa(tempLinha4, tempColuna4).getPeca() == null) {
                    comeu++;
                    if (linha > 1 && coluna > 1)
                        calculaMelhorJogada(tempLinha4, tempColuna4, dama);
                    else
                    {
                        linhaFim = linha;
                        colunaFim = coluna;
                    }
                    
                } else if (tempLinha <= 7 && tempColuna3 >= 0
                        && getCasa(tempLinha, tempColuna3) != null
                        && getCasa(tempLinha, tempColuna3).getPeca() != null
                        && getCasa(tempLinha, tempColuna3).getPeca().getCor() == 1
                        && tempLinha2 <= 7 && tempColuna4 >= 0
                        && getCasa(tempLinha2, tempColuna4) != null
                        && getCasa(tempLinha2, tempColuna4).getPeca() == null) {
                    comeu++;
                    if (linha <= 5 && coluna > 1)
                        calculaMelhorJogada(tempLinha2, tempColuna4, dama);
                    else
                    {
                        linhaFim = linha;
                        colunaFim = coluna;
                    }
                } else if (tempLinha3 >= 0 && tempColuna <= 7
                        && getCasa(tempLinha3, tempColuna) != null
                        && getCasa(tempLinha3, tempColuna).getPeca() != null
                        && getCasa(tempLinha3, tempColuna).getPeca().getCor() == 1
                        && tempLinha4 >= 0 && tempColuna2 <= 7
                        && getCasa(tempLinha4, tempColuna2) != null
                        && getCasa(tempLinha4, tempColuna2).getPeca() == null) {
                    comeu++;
                    if (linha >1 && coluna <= 5)
                        calculaMelhorJogada(tempLinha4, tempColuna2, dama);
                    else
                    {
                        linhaFim = linha;
                        colunaFim = coluna;
                    }
                    
                } else if (linha ++ <= 7 && tempColuna <= 7
                        && getCasa(tempLinha, tempColuna) != null
                        && getCasa(tempLinha, tempColuna).getPeca() == null
                        && comeu == 0) {
                    linhaFim = tempLinha;
                    colunaFim = tempColuna;
                } else if (tempLinha3 >= 0 && tempColuna3 >= 0
                        && getCasa(tempLinha3, tempColuna3) != null
                        && getCasa(tempLinha3, tempColuna3).getPeca() == null
                        && comeu == 0) {
                    linhaFim = tempLinha3;
                    colunaFim = tempColuna3;
                } else if ( tempLinha <= 7 && tempColuna3 >= 0
                        && getCasa(tempLinha, tempColuna3) != null
                        && getCasa(tempLinha, tempColuna3).getPeca() == null
                        && comeu == 0) {
                    linhaFim = tempLinha;
                    colunaFim = tempColuna3;
                } else if (tempLinha3 >= 0 && tempColuna <= 7
                        && getCasa(tempLinha3, tempColuna) != null
                        && getCasa(tempLinha3, tempColuna).getPeca() == null
                        && comeu == 0) {
                    linhaFim = tempLinha3;
                    colunaFim = tempColuna;
                } else {
                    linhaFim = linha;
                    colunaFim = coluna;
                }
            } else {
                if (tempLinha <= 7 && tempColuna <= 7
                        && getCasa(tempLinha, tempColuna) != null
                        && getCasa(tempLinha, tempColuna).getPeca() != null
                        && getCasa(tempLinha, tempColuna).getPeca().getCor() == 1
                        && tempLinha2 <= 7 && tempColuna2 <= 7
                        && getCasa(tempLinha2, tempColuna2) != null
                        && getCasa(tempLinha2, tempColuna2).getPeca() == null) {
                    comeu++;
                    if (linha <= 5 && coluna <= 5)
                        calculaMelhorJogada(tempLinha2, tempColuna2, dama);
                    else
                    {
                        linhaFim = linha;
                        colunaFim = coluna;
                    }
                    
                } else if ( tempLinha <= 7 && tempColuna3 >= 0
                        && getCasa(tempLinha, tempColuna3) != null
                        && getCasa(tempLinha, tempColuna3).getPeca() != null
                        && getCasa(tempLinha, tempColuna3).getPeca().getCor() == 1
                        && linha +2 <= 7 && tempColuna4 >= 0
                        && getCasa(tempLinha2, tempColuna4) != null
                        && getCasa(tempLinha2, tempColuna4).getPeca() == null) {
                    comeu++;
                    if (linha <= 5 && coluna > 1)
                        calculaMelhorJogada(tempLinha2, tempColuna4, dama);
                    else
                    {
                        linhaFim = linha;
                        colunaFim = coluna;
                    }
                } else if (tempLinha <= 7 && tempColuna <= 7
                        && getCasa(tempLinha, tempColuna) != null
                        && getCasa(tempLinha, tempColuna).getPeca() == null
                        && comeu == 0) {
                    linhaFim = tempLinha;
                    colunaFim = tempColuna;
                } else if (tempLinha <= 7 && tempColuna3 >= 0
                        && getCasa(tempLinha, tempColuna3) != null
                        && getCasa(tempLinha, tempColuna3).getPeca() == null
                        && comeu == 0) {
                    linhaFim = tempLinha;
                    colunaFim = tempColuna3;
                } else {
                    linhaFim = linha;
                    colunaFim = coluna;
                }
            }
        } else
        {
           linhaFim = linha;
           colunaFim = coluna;
        }

    }

    public void iniciarPartida() throws Exception {
        com.connectToServer();
        com.read();
    }
}
