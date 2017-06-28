package com.blogspot.huyhungdinh.awesomeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class RTextView extends android.support.v7.widget.AppCompatTextView {

    public RTextView(Context context) {
        super(context);
        font();
    }

    public RTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        font();
    }

    public RTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        font();
    }

    private void font() {
        try {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "AvenirLTStd-Roman.otf"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
