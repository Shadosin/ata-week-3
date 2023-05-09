package com.kenzie.increment;

/**
 * An Incrementable that allows incrementing by a specified integer value.
 */
public class FixedIncrementer implements Incrementable {
    private final int incrementSize;
    private int value;

    /**
     * Constructs a FixedIncrementer with the specified increment size and a default
     * starting value of 0.
     * @param incrementSize the increment size to jump on each call to increment()
     */
    public FixedIncrementer(int incrementSize) {
        this(incrementSize, 0);
    }

    /**
     * Constructs a FixedIncrementer with the specified increment size and starting value.
     * @param incrementSize The amount to increment each time increment() is called
     * @param value The starting value
     */
    public FixedIncrementer(int incrementSize, int value) {
        // TODO: Finish implementing this constructor to initialize incrementSize and value

        // TODO: Remove this line and update it with the correct implementation
        this.incrementSize = 0;
    }

    @Override
    public int increment() {
        // TODO: Add logic here to increment the value by the size of the increment

        // returns the newly updated value, after incrementing
        return value;
    }

    @Override
    public int getValue() {
        return value;
    }
}