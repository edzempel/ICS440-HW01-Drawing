package com.abc.draw;

import java.awt.*;
import java.util.*;

public class Drawing extends Object {
    // FIXME - probably need a member variable or two...
    private ArrayList<Drawable> drawables;

	public Drawing() {
        // FIXME - initialize
	    drawables = new ArrayList<Drawable>();
	}

	public void drawAll(Graphics2D g2) {
        // FIXME - Invoke draw(Graphics2D) on each of the Drawable's that
        //         have been added via append(Drawable).
	    for ( Drawable drawable : drawables ) {
            drawable.draw(g2);
        }

	}

	public void append(Drawable drawable) {
	    // FIXME - Add the passed Drawable to the list of items that make up
        //         this Drawing.
	    drawables.add(drawable);
	}
}
