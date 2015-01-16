package com.treehouse.gaara.interactivestory.model;

/**
 * Created by Gaara on 1/2/2015.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }
}
