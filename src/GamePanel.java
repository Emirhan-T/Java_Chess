import Pawn.pieces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {

    int boxSize = 50;
    JPanel [][]loc = new JPanel [8][8];
    public GamePanel() {
        Table();
        Pawns();


    }
    void Pawns(){
        for (int i = 0; i < 8; i++) {
            loc[6][i].add(new pieces("white"));
            loc[1][i].add(new pieces("black"));
        }
    }

    void Table(){
        int y_axis=50;
        this.setLayout(null);
        for(int i = 0; i<8;i++){

            int x_axis = 50;
            for(int j = 0; j<8;j++){
                JPanel panel = new JPanel();
                if((i+j) % 2 == 0){
                    Color light = new Color(248, 227, 176);
                    panel.setBackground(light);
                    panel.setBounds(x_axis, y_axis, boxSize, boxSize);
                }
                else {
                    Color dark = new Color(1, 204, 197);
                    panel.setBackground(dark);
                    panel.setBounds(x_axis, y_axis, boxSize, boxSize);
                }
                mouseMovment(panel);
                loc[i][j] = panel;
                x_axis = x_axis + boxSize;
                this.add(panel);
            }
            y_axis = y_axis + boxSize;
        }
    }
    void mouseMovment(JPanel p){
        p.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseclicked");
            }
        });
    }

}


