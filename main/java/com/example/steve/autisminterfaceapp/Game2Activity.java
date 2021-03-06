package com.example.steve.autisminterfaceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Game2Activity extends Activity
{
    private ImageView binView;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game2);
        binView=(ImageView)findViewById(R.id.imageView7);
    }
    public void backButtonClicked(View v)
    {
        zoomAnimation(v);
    }
    private void zoomAnimation(View v)
    {
        animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        animation.setAnimationListener(new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation){}
            @Override
            public void onAnimationRepeat(Animation animation){}
            @Override
            public void onAnimationEnd(Animation animation)
            {
                finish();
            }
        });
        v.startAnimation(animation);
    }
    public void cookiesClicked(View v)
    {
        zoom2Animation(v);
    }
    public void muffinClicked(View v)
    {
        zoom2Animation(v);
    }
    public void chocolateClicked(View v)
    {
        zoom2Animation(v);
    }
    public void umbrellaClicked(View v)
    {
        zoom3Animation(v);
    }
    private void zoom2Animation(View v)
    {
        animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        animation.setAnimationListener(new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation){}
            @Override
            public void onAnimationRepeat(Animation animation){}
            @Override
            public void onAnimationEnd(Animation animation)
            {
                binView.setImageDrawable(getResources().getDrawable(R.mipmap.bin_full));
                Intent intent=new Intent(getApplicationContext(),LoseActivity.class);
                startActivity(intent);
                finish();
            }
        });
        v.startAnimation(animation);
    }
    private void zoom3Animation(View v)
    {
        animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        animation.setAnimationListener(new Animation.AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation){}
            @Override
            public void onAnimationRepeat(Animation animation){}
            @Override
            public void onAnimationEnd(Animation animation)
            {
                binView.setImageDrawable(getResources().getDrawable(R.mipmap.bin_full));
                Intent intent=new Intent(getApplicationContext(),WinActivity.class);
                intent.putExtra("next_level",3);
                startActivity(intent);
                finish();
            }
        });
        v.startAnimation(animation);
    }
}
