package org.boilit.bsl.iterator;

import java.util.Iterator;

/**
 * @author Boilit
 * @see
 */
public final class DigitIterator implements Iterator {
    private int index = 0;
    private final int digit;

    public DigitIterator(final double digit) {
        this.digit = (int) digit;
    }

    public final boolean hasNext() {
        return index < digit;
    }

    public final Integer next() {
        return index++;
    }

    @Override
    public final void remove() {
    }
}
