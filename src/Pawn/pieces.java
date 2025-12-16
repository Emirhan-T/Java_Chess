package Pawn;

import javax.swing.*;

public class pieces extends JLabel {
    ImageIcon pawn_w = new ImageIcon("res/pieces/w_pawn.png");
    ImageIcon pawn_b = new ImageIcon("res/pieces/b_pawn.png");
    ImageIcon bishop_w = new ImageIcon("res/pieces/w_bishop.png");
    ImageIcon bishop_b = new ImageIcon("res/pieces/b_bishop.png");
    ImageIcon knight_w = new ImageIcon("res/pieces/w_knight.png");
    ImageIcon knight_b = new ImageIcon("res/pieces/b_knight.png");
    ImageIcon rook_w = new ImageIcon("res/pieces/w_rook.png");
    ImageIcon rook_b = new ImageIcon("res/pieces/b_rook.png");
    ImageIcon king_w = new ImageIcon("res/pieces/w_king.png");
    ImageIcon king_b = new ImageIcon("res/pieces/b_king.png");
    ImageIcon queen_w = new ImageIcon("res/pieces/w_queen.png");
    ImageIcon queen_b = new ImageIcon("res/pieces/b_queen.png");
    public pieces(String Color) {
        if (Color == "white") {
            this.setIcon(pawn_w);
        } else {
            this.setIcon(pawn_b);
        }
        this.setHorizontalAlignment(JLabel.CENTER);
    }

}
