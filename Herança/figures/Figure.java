package figures;

import java.awt.Graphics;

public abstract class Figure {
    int x,y;
    int r,g,b;
    int rot;
    public abstract void paint (Graphics g);
}
