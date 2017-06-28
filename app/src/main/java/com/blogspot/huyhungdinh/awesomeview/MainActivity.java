package com.blogspot.huyhungdinh.awesomeview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivAnim = (ImageView) findViewById(R.id.ivAnim);
        ivAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotale));

        Button btnTrans = (Button) findViewById(R.id.btnTrans);
        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TransActivity.class));
            }
        });

        Button btnTool = (Button) findViewById(R.id.btnToolbar);
        btnTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ToolbarActivity.class));
            }
        });

        Button btnTips = (Button) findViewById(R.id.btnTips);
        btnTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TipsActivity.class));
            }
        });

        Button btnShortcut = (Button) findViewById(R.id.btnShortcut);
        btnShortcut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addShortcut();
                Toast.makeText(MainActivity.this, "Shortcut was created in Home Screen", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void addShortcut() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(this, ShortcutActivity.class.getName());

        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("android.intent.extra.shortcut.NAME", getString(R.string.app_name));
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, R.mipmap.ic_launcher));
        intent2.putExtra("duplicate", false);
        intent2.setFlags(524288);
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");

        sendBroadcast(intent2);
    }
}
