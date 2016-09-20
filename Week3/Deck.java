package com.aytona;

/**
 * Created by Aytona on 2016-09-20.
 */
public class Deck
{
    private String[] cardNames =
            {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "J", "Q", "K", "A"};

    public Iterator getIterator()
    {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<String>
    {
        private int current = -1;

        @Override
        public boolean hasNext()
        {
            return current < cardNames.length - 1;
        }

        @Override
        public String next() throws IndexOutOfBoundsException
        {
            if (hasNext())
            {
                current++;
                return cardNames[current];
            }

            throw new IndexOutOfBoundsException("next() executed for an iterator that has no more elements");
        }
    }
}
