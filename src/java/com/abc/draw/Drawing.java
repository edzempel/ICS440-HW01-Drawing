package com.abc.draw;

import java.awt.*;
import java.util.*;

public class Drawing extends Object {
    private ArrayList<Drawable> drawables;

    public Drawing() {
        drawables = new ArrayList<>();
    }

    public void drawAll(Graphics2D g2) {
        // Invoke draw(Graphics2D) on each of the Drawable's that
        // have been added via append(Drawable).
        for ( Drawable drawable : drawables ) {
            drawable.draw(g2);
        }

    }

    /**
     * Add the passed Drawable to the list of items that make up this Drawing.
     *
     * @param drawable
     */
    public void append(Drawable drawable) {
        drawables.add(drawable);
    }
}
