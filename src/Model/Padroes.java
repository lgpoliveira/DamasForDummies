/**
 * @author: Luis Gustavo Peil de Oliveira
 * Biblioteca de padrões de comunicação serial para um tabuleiro de 64 casas.
 * Desenvolvida para o trabalho de conclusão de curso.
 * Engenharia da Computação - Unversidade Positivo - 2011
 *
 */
package Model;

public class Padroes {

    private static byte A0TRUE = new Byte((byte) 0x02);
    private static byte A1TRUE = new Byte((byte) 0x06);
    private static byte A2TRUE = new Byte((byte) 0x0A);
    private static byte A3TRUE = new Byte((byte) 0x0E);
    private static byte A4TRUE = new Byte((byte) 0x12);
    private static byte A5TRUE = new Byte((byte) 0x16);
    private static byte A6TRUE = new Byte((byte) 0x1A);
    private static byte A7TRUE = new Byte((byte) 0x1E);
    private static byte B0TRUE = new Byte((byte) 0x22);
    private static byte B1TRUE = new Byte((byte) 0x26);
    private static byte B2TRUE = new Byte((byte) 0x2A);
    private static byte B3TRUE = new Byte((byte) 0x2E);
    private static byte B4TRUE = new Byte((byte) 0x32);
    private static byte B5TRUE = new Byte((byte) 0x36);
    private static byte B6TRUE = new Byte((byte) 0x3A);
    private static byte B7TRUE = new Byte((byte) 0x3E);
    private static byte C0TRUE = new Byte((byte) 0x42);
    private static byte C1TRUE = new Byte((byte) 0x46);
    private static byte C2TRUE = new Byte((byte) 0x4A);
    private static byte C3TRUE = new Byte((byte) 0x4E);
    private static byte C4TRUE = new Byte((byte) 0x52);
    private static byte C5TRUE = new Byte((byte) 0x56);
    private static byte C6TRUE = new Byte((byte) 0x5A);
    private static byte C7TRUE = new Byte((byte) 0x5E);
    private static byte D0TRUE = new Byte((byte) 0x62);
    private static byte D1TRUE = new Byte((byte) 0x66);
    private static byte D2TRUE = new Byte((byte) 0x6A);
    private static byte D3TRUE = new Byte((byte) 0x6E);
    private static byte D4TRUE = new Byte((byte) 0x72);
    private static byte D5TRUE = new Byte((byte) 0x76);
    private static byte D6TRUE = new Byte((byte) 0x7A);
    private static byte D7TRUE = new Byte((byte) 0x7E);
    private static byte E0TRUE = new Byte((byte) 0x82);
    private static byte E1TRUE = new Byte((byte) 0x86);
    private static byte E2TRUE = new Byte((byte) 0x8A);
    private static byte E3TRUE = new Byte((byte) 0x8E);
    private static byte E4TRUE = new Byte((byte) 0x92);
    private static byte E5TRUE = new Byte((byte) 0x96);
    private static byte E6TRUE = new Byte((byte) 0x9A);
    private static byte E7TRUE = new Byte((byte) 0x9E);
    private static byte F0TRUE = new Byte((byte) 0xA2);
    private static byte F1TRUE = new Byte((byte) 0xA6);
    private static byte F2TRUE = new Byte((byte) 0xAA);
    private static byte F3TRUE = new Byte((byte) 0xAE);
    private static byte F4TRUE = new Byte((byte) 0xB2);
    private static byte F5TRUE = new Byte((byte) 0xB6);
    private static byte F6TRUE = new Byte((byte) 0xBA);
    private static byte F7TRUE = new Byte((byte) 0xBE);
    private static byte G0TRUE = new Byte((byte) 0xC2);
    private static byte G1TRUE = new Byte((byte) 0xC6);
    private static byte G2TRUE = new Byte((byte) 0xCA);
    private static byte G3TRUE = new Byte((byte) 0xCE);
    private static byte G4TRUE = new Byte((byte) 0xD2);
    private static byte G5TRUE = new Byte((byte) 0xD6);
    private static byte G6TRUE = new Byte((byte) 0xDA);
    private static byte G7TRUE = new Byte((byte) 0xDE);
    private static byte H0TRUE = new Byte((byte) 0xE2);
    private static byte H1TRUE = new Byte((byte) 0xE6);
    private static byte H2TRUE = new Byte((byte) 0xEA);
    private static byte H3TRUE = new Byte((byte) 0xEE);
    private static byte H4TRUE = new Byte((byte) 0xF2);
    private static byte H5TRUE = new Byte((byte) 0xF6);
    private static byte H6TRUE = new Byte((byte) 0xFA);
    private static byte H7TRUE = new Byte((byte) 0xFE);
    private static byte A0FALSE = new Byte((byte) 0x00);
    private static byte A1FALSE = new Byte((byte) 0x04);
    private static byte A2FALSE = new Byte((byte) 0x08);
    private static byte A3FALSE = new Byte((byte) 0x0C);
    private static byte A4FALSE = new Byte((byte) 0x10);
    private static byte A5FALSE = new Byte((byte) 0x14);
    private static byte A6FALSE = new Byte((byte) 0x18);
    private static byte A7FALSE = new Byte((byte) 0x1C);
    private static byte B0FALSE = new Byte((byte) 0x20);
    private static byte B1FALSE = new Byte((byte) 0x24);
    private static byte B2FALSE = new Byte((byte) 0x28);
    private static byte B3FALSE = new Byte((byte) 0x2C);
    private static byte B4FALSE = new Byte((byte) 0x30);
    private static byte B5FALSE = new Byte((byte) 0x34);
    private static byte B6FALSE = new Byte((byte) 0x38);
    private static byte B7FALSE = new Byte((byte) 0x3C);
    private static byte C0FALSE = new Byte((byte) 0x40);
    private static byte C1FALSE = new Byte((byte) 0x44);
    private static byte C2FALSE = new Byte((byte) 0x48);
    private static byte C3FALSE = new Byte((byte) 0x4C);
    private static byte C4FALSE = new Byte((byte) 0x50);
    private static byte C5FALSE = new Byte((byte) 0x54);
    private static byte C6FALSE = new Byte((byte) 0x58);
    private static byte C7FALSE = new Byte((byte) 0x5C);
    private static byte D0FALSE = new Byte((byte) 0x60);
    private static byte D1FALSE = new Byte((byte) 0x64);
    private static byte D2FALSE = new Byte((byte) 0x68);
    private static byte D3FALSE = new Byte((byte) 0x6C);
    private static byte D4FALSE = new Byte((byte) 0x70);
    private static byte D5FALSE = new Byte((byte) 0x74);
    private static byte D6FALSE = new Byte((byte) 0x78);
    private static byte D7FALSE = new Byte((byte) 0x7C);
    private static byte E0FALSE = new Byte((byte) 0x80);
    private static byte E1FALSE = new Byte((byte) 0x84);
    private static byte E2FALSE = new Byte((byte) 0x88);
    private static byte E3FALSE = new Byte((byte) 0x8C);
    private static byte E4FALSE = new Byte((byte) 0x90);
    private static byte E5FALSE = new Byte((byte) 0x94);
    private static byte E6FALSE = new Byte((byte) 0x98);
    private static byte E7FALSE = new Byte((byte) 0x9C);
    private static byte F0FALSE = new Byte((byte) 0xA0);
    private static byte F1FALSE = new Byte((byte) 0xA4);
    private static byte F2FALSE = new Byte((byte) 0xA8);
    private static byte F3FALSE = new Byte((byte) 0xAC);
    private static byte F4FALSE = new Byte((byte) 0xB0);
    private static byte F5FALSE = new Byte((byte) 0xB4);
    private static byte F6FALSE = new Byte((byte) 0xB8);
    private static byte F7FALSE = new Byte((byte) 0xBC);
    private static byte G0FALSE = new Byte((byte) 0xC0);
    private static byte G1FALSE = new Byte((byte) 0xC4);
    private static byte G2FALSE = new Byte((byte) 0xC8);
    private static byte G3FALSE = new Byte((byte) 0xCC);
    private static byte G4FALSE = new Byte((byte) 0xD0);
    private static byte G5FALSE = new Byte((byte) 0xD4);
    private static byte G6FALSE = new Byte((byte) 0xD8);
    private static byte G7FALSE = new Byte((byte) 0xDC);
    private static byte H0FALSE = new Byte((byte) 0xE0);
    private static byte H1FALSE = new Byte((byte) 0xE4);
    private static byte H2FALSE = new Byte((byte) 0xE8);
    private static byte H3FALSE = new Byte((byte) 0xEC);
    private static byte H4FALSE = new Byte((byte) 0xF0);
    private static byte H5FALSE = new Byte((byte) 0xF4);
    private static byte H6FALSE = new Byte((byte) 0xF8);
    private static byte H7FALSE = new Byte((byte) 0xFC);
    private static byte FIMDEJOGO = new Byte((byte) 0x01);
    private static byte INICIOCOMUNICACAO = new Byte((byte) 0x05);
    private static byte FIMCOMUNICACAO = new Byte((byte) 0xFF);
    private static byte JOGADAVALIDA = new Byte((byte) 0x6F);
    private static byte JOGADAINVALIDA = new Byte((byte) 0x27);

    public Padroes() {
    }

    public static byte getFIMCOMUNICACAO() {
        return FIMCOMUNICACAO;
    }

    public static byte getINICIOCOMUNICACAO() {
        return INICIOCOMUNICACAO;
    }

    public static byte getJOGADAINVALIDA() {
        return JOGADAINVALIDA;
    }

    public static byte getJOGADAVALIDA() {
        return JOGADAVALIDA;
    }

    public static byte getA0FALSE() {
        return A0FALSE;
    }

    public static byte getA0TRUE() {
        return A0TRUE;
    }

    public static byte getA1FALSE() {
        return A1FALSE;
    }

    public static byte getA1TRUE() {
        return A1TRUE;
    }

    public static byte getA2FALSE() {
        return A2FALSE;
    }

    public static byte getA2TRUE() {
        return A2TRUE;
    }

    public static byte getA3FALSE() {
        return A3FALSE;
    }

    public static byte getA3TRUE() {
        return A3TRUE;
    }

    public static byte getA4FALSE() {
        return A4FALSE;
    }

    public static byte getA4TRUE() {
        return A4TRUE;
    }

    public static byte getA5FALSE() {
        return A5FALSE;
    }

    public static byte getA5TRUE() {
        return A5TRUE;
    }

    public static byte getA6FALSE() {
        return A6FALSE;
    }

    public static byte getA6TRUE() {
        return A6TRUE;
    }

    public static byte getA7FALSE() {
        return A7FALSE;
    }

    public static byte getA7TRUE() {
        return A7TRUE;
    }

    public static byte getB0FALSE() {
        return B0FALSE;
    }

    public static byte getB0TRUE() {
        return B0TRUE;
    }

    public static byte getB1FALSE() {
        return B1FALSE;
    }

    public static byte getB1TRUE() {
        return B1TRUE;
    }

    public static byte getB2FALSE() {
        return B2FALSE;
    }

    public static byte getB2TRUE() {
        return B2TRUE;
    }

    public static byte getB3FALSE() {
        return B3FALSE;
    }

    public static byte getB3TRUE() {
        return B3TRUE;
    }

    public static byte getB4FALSE() {
        return B4FALSE;
    }

    public static byte getB4TRUE() {
        return B4TRUE;
    }

    public static byte getB5FALSE() {
        return B5FALSE;
    }

    public static byte getB5TRUE() {
        return B5TRUE;
    }

    public static byte getB6FALSE() {
        return B6FALSE;
    }

    public static byte getB6TRUE() {
        return B6TRUE;
    }

    public static byte getB7FALSE() {
        return B7FALSE;
    }

    public static byte getB7TRUE() {
        return B7TRUE;
    }

    public static byte getC0FALSE() {
        return C0FALSE;
    }

    public static byte getC0TRUE() {
        return C0TRUE;
    }

    public static byte getC1FALSE() {
        return C1FALSE;
    }

    public static byte getC1TRUE() {
        return C1TRUE;
    }

    public static byte getC2FALSE() {
        return C2FALSE;
    }

    public static byte getC2TRUE() {
        return C2TRUE;
    }

    public static byte getC3FALSE() {
        return C3FALSE;
    }

    public static byte getC3TRUE() {
        return C3TRUE;
    }

    public static byte getC4FALSE() {
        return C4FALSE;
    }

    public static byte getC4TRUE() {
        return C4TRUE;
    }

    public static byte getC5FALSE() {
        return C5FALSE;
    }

    public static byte getC5TRUE() {
        return C5TRUE;
    }

    public static byte getC6FALSE() {
        return C6FALSE;
    }

    public static byte getC6TRUE() {
        return C6TRUE;
    }

    public static byte getC7FALSE() {
        return C7FALSE;
    }

    public static byte getC7TRUE() {
        return C7TRUE;
    }

    public static byte getD0FALSE() {
        return D0FALSE;
    }

    public static byte getD0TRUE() {
        return D0TRUE;
    }

    public static byte getD1FALSE() {
        return D1FALSE;
    }

    public static byte getD1TRUE() {
        return D1TRUE;
    }

    public static byte getD2FALSE() {
        return D2FALSE;
    }

    public static byte getD2TRUE() {
        return D2TRUE;
    }

    public static byte getD3FALSE() {
        return D3FALSE;
    }

    public static byte getD3TRUE() {
        return D3TRUE;
    }

    public static byte getD4FALSE() {
        return D4FALSE;
    }

    public static byte getD4TRUE() {
        return D4TRUE;
    }

    public static byte getD5FALSE() {
        return D5FALSE;
    }

    public static byte getD5TRUE() {
        return D5TRUE;
    }

    public static byte getD6FALSE() {
        return D6FALSE;
    }

    public static byte getD6TRUE() {
        return D6TRUE;
    }

    public static byte getD7FALSE() {
        return D7FALSE;
    }

    public static byte getD7TRUE() {
        return D7TRUE;
    }

    public static byte getE0FALSE() {
        return E0FALSE;
    }

    public static byte getE0TRUE() {
        return E0TRUE;
    }

    public static byte getE1FALSE() {
        return E1FALSE;
    }

    public static byte getE1TRUE() {
        return E1TRUE;
    }

    public static byte getE2FALSE() {
        return E2FALSE;
    }

    public static byte getE2TRUE() {
        return E2TRUE;
    }

    public static byte getE3FALSE() {
        return E3FALSE;
    }

    public static byte getE3TRUE() {
        return E3TRUE;
    }

    public static byte getE4FALSE() {
        return E4FALSE;
    }

    public static byte getE4TRUE() {
        return E4TRUE;
    }

    public static byte getE5FALSE() {
        return E5FALSE;
    }

    public static byte getE5TRUE() {
        return E5TRUE;
    }

    public static byte getE6FALSE() {
        return E6FALSE;
    }

    public static byte getE6TRUE() {
        return E6TRUE;
    }

    public static byte getE7FALSE() {
        return E7FALSE;
    }

    public static byte getE7TRUE() {
        return E7TRUE;
    }

    public static byte getF0FALSE() {
        return F0FALSE;
    }

    public static byte getF0TRUE() {
        return F0TRUE;
    }

    public static byte getF1FALSE() {
        return F1FALSE;
    }

    public static byte getF1TRUE() {
        return F1TRUE;
    }

    public static byte getF2FALSE() {
        return F2FALSE;
    }

    public static byte getF2TRUE() {
        return F2TRUE;
    }

    public static byte getF3FALSE() {
        return F3FALSE;
    }

    public static byte getF3TRUE() {
        return F3TRUE;
    }

    public static byte getF4FALSE() {
        return F4FALSE;
    }

    public static byte getF4TRUE() {
        return F4TRUE;
    }

    public static byte getF5FALSE() {
        return F5FALSE;
    }

    public static byte getF5TRUE() {
        return F5TRUE;
    }

    public static byte getF6FALSE() {
        return F6FALSE;
    }

    public static byte getF6TRUE() {
        return F6TRUE;
    }

    public static byte getF7FALSE() {
        return F7FALSE;
    }

    public static byte getF7TRUE() {
        return F7TRUE;
    }

    public static byte getFIMDEJOGO() {
        return FIMDEJOGO;
    }

    public static byte getG0FALSE() {
        return G0FALSE;
    }

    public static byte getG0TRUE() {
        return G0TRUE;
    }

    public static byte getG1FALSE() {
        return G1FALSE;
    }

    public static byte getG1TRUE() {
        return G1TRUE;
    }

    public static byte getG2FALSE() {
        return G2FALSE;
    }

    public static byte getG2TRUE() {
        return G2TRUE;
    }

    public static byte getG3FALSE() {
        return G3FALSE;
    }

    public static byte getG3TRUE() {
        return G3TRUE;
    }

    public static byte getG4FALSE() {
        return G4FALSE;
    }

    public static byte getG4TRUE() {
        return G4TRUE;
    }

    public static byte getG5FALSE() {
        return G5FALSE;
    }

    public static byte getG5TRUE() {
        return G5TRUE;
    }

    public static byte getG6FALSE() {
        return G6FALSE;
    }

    public static byte getG6TRUE() {
        return G6TRUE;
    }

    public static byte getG7FALSE() {
        return G7FALSE;
    }

    public static byte getG7TRUE() {
        return G7TRUE;
    }

    public static byte getH0FALSE() {
        return H0FALSE;
    }

    public static byte getH0TRUE() {
        return H0TRUE;
    }

    public static byte getH1FALSE() {
        return H1FALSE;
    }

    public static byte getH1TRUE() {
        return H1TRUE;
    }

    public static byte getH2FALSE() {
        return H2FALSE;
    }

    public static byte getH2TRUE() {
        return H2TRUE;
    }

    public static byte getH3FALSE() {
        return H3FALSE;
    }

    public static byte getH3TRUE() {
        return H3TRUE;
    }

    public static byte getH4FALSE() {
        return H4FALSE;
    }

    public static byte getH4TRUE() {
        return H4TRUE;
    }

    public static byte getH5FALSE() {
        return H5FALSE;
    }

    public static byte getH5TRUE() {
        return H5TRUE;
    }

    public static byte getH6FALSE() {
        return H6FALSE;
    }

    public static byte getH6TRUE() {
        return H6TRUE;
    }

    public static byte getH7FALSE() {
        return H7FALSE;
    }

    public static byte getH7TRUE() {
        return H7TRUE;
    }

    public byte getValorMsgTrue(int lin, int col) {
        switch (lin) {
            case 0: {
                switch (col) {
                    case 0:
                        return getA0TRUE();
                    case 2:
                        return getC0TRUE();
                    case 4:
                        return getE0TRUE();
                    case 6:
                        return getF0TRUE();
                }
            }
            case 1: {
                switch (col) {
                    case 1:
                        return getB1TRUE();
                    case 3:
                        return getD1TRUE();
                    case 5:
                        return getF1TRUE();
                    case 7:
                        return getH1TRUE();
                }
            }
            case 2: {
                switch (col) {
                    case 0:
                        return getA2TRUE();
                    case 2:
                        return getC2TRUE();
                    case 4:
                        return getE2TRUE();
                    case 6:
                        return getF2TRUE();
                }
            }
            case 3: {
                switch (col) {
                    case 1:
                        return getB3TRUE();
                    case 3:
                        return getD3TRUE();
                    case 5:
                        return getF3TRUE();
                    case 7:
                        return getH3TRUE();
                }
            }
            case 4: {
                switch (col) {
                    case 0:
                        return getA4TRUE();
                    case 2:
                        return getC4TRUE();
                    case 4:
                        return getE4TRUE();
                    case 6:
                        return getF4TRUE();
                }
            }
            case 5: {
                switch (col) {
                    case 1:
                        return getB5TRUE();
                    case 3:
                        return getD5TRUE();
                    case 5:
                        return getF5TRUE();
                    case 7:
                        return getH5TRUE();
                }
            }
            case 6: {
                switch (col) {
                    case 0:
                        return getA6TRUE();
                    case 2:
                        return getC6TRUE();
                    case 4:
                        return getE6TRUE();
                    case 6:
                        return getF6TRUE();
                }
            }
            case 7: {
                switch (col) {
                    case 1:
                        return getB7TRUE();
                    case 3:
                        return getD7TRUE();
                    case 5:
                        return getF7TRUE();
                    case 7:
                        return getH7TRUE();
                }
            }
        }

        return new Byte((byte) 0xDF);
    }

    public byte getValorMsgFalse(int lin, int col) {
        switch (lin) {
            case 0: {
                switch (col) {
                    case 0:
                        return getA0FALSE();
                    case 2:
                        return getC0FALSE();
                    case 4:
                        return getE0FALSE();
                    case 6:
                        return getF0FALSE();
                }
            }
            case 1: {
                switch (col) {
                    case 1:
                        return getB1FALSE();
                    case 3:
                        return getD1FALSE();
                    case 5:
                        return getF1FALSE();
                    case 7:
                        return getH1FALSE();
                }
            }
            case 2: {
                switch (col) {
                    case 0:
                        return getA2FALSE();
                    case 2:
                        return getC2FALSE();
                    case 4:
                        return getE2FALSE();
                    case 6:
                        return getF2FALSE();
                }
            }
            case 3: {
                switch (col) {
                    case 1:
                        return getB3FALSE();
                    case 3:
                        return getD3FALSE();
                    case 5:
                        return getF3FALSE();
                    case 7:
                        return getH3FALSE();
                }
            }
            case 4: {
                switch (col) {
                    case 0:
                        return getA4FALSE();
                    case 2:
                        return getC4FALSE();
                    case 4:
                        return getE4FALSE();
                    case 6:
                        return getF4FALSE();
                }
            }
            case 5: {
                switch (col) {
                    case 1:
                        return getB5FALSE();
                    case 3:
                        return getD5FALSE();
                    case 5:
                        return getF5FALSE();
                    case 7:
                        return getH5FALSE();
                }
            }
            case 6: {
                switch (col) {
                    case 0:
                        return getA6FALSE();
                    case 2:
                        return getC6FALSE();
                    case 4:
                        return getE6FALSE();
                    case 6:
                        return getF6FALSE();
                }
            }
            case 7: {
                switch (col) {
                    case 1:
                        return getB7FALSE();
                    case 3:
                        return getD7FALSE();
                    case 5:
                        return getF7FALSE();
                    case 7:
                        return getH7FALSE();
                }
            }
        }

        return new Byte((byte) 0xDF);
    }
}
