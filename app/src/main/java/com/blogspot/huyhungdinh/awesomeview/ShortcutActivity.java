package com.blogspot.huyhungdinh.awesomeview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ShortcutActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortcut);

        ImageView ivAnim = (ImageView) findViewById(R.id.ivAnim);
        ivAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotale));
    }
}
