package com.blogspot.huyhungdinh.awesomeview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class BButton extends AppCompatButton {

    public BButton(Context context) {
        super(context);
        font();
    }

    public BButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        font();
    }

    public BButton(Context context, AttributeSet attrs, int defStyleAttr) {
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
