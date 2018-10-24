package com.devapp.dev_05.bookfinder.Model;

import org.w3c.dom.Text;

public class BookItem {

    // Declare Variables
    private String mBookImageUrl;
    private String mAuthor;
    private String mBookTitle;
    private String mCategory;
    private String mPublisher;
    private String mDate;
    private String mRating;

    public BookItem(String mBookImageUrl, String mAuthor, String mBookTitle, String mCategory, String mPublisher, String mDate, String mRating) {
        this.mBookImageUrl = mBookImageUrl;
        this.mAuthor = mAuthor;
        this.mBookTitle = mBookTitle;
        this.mCategory = mCategory;
        this.mPublisher = mPublisher;
        this.mDate = mDate;
        this.mRating = mRating;
    }

    public String getmBookImageUrl() {
        return mBookImageUrl;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmBookTitle() {
        return mBookTitle;
    }

    public String getmCategory() {
        return mCategory;
    }

    public String getmPublisher() {
        return mPublisher;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmRating() {
        return mRating;
    }
}
