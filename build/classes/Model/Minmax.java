/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Controller.Tabuleiro;

/**
 *
 * @author guga
 */
public class Minmax {

    final int NUMBERPLYLOOKAHEAD = 2;
    private int depthOfGameTree;
    final int MAXNODE = 0;
    final int MINDICENODE =1;
    final int MINNODE = 2;
    final int MAXDICENODE =  3;
    int playerNumber;
    int heighestLevelReached = 0;


    public Minmax(int playerNumber)
    {
        depthOfGameTree = (this.NUMBERPLYLOOKAHEAD*2)+1;
        this.playerNumber = playerNumber;
    }

    public int[] minmaxDecision (Tabuleiro tabuleiro)
    {
        //DataContainer maximisedChild = maxValue(tabuleiro,this.MAXNODE, this.depthOfGameTree);
        return null;
    }

}
