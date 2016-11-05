package com.example.freeapp.weddingapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by vinove on 4/11/16.
 */

public class Gallary extends AppCompatActivity {

    int[] imageArray;

    Bundle bundle;

    final TypedArray imageArrayIcon=null;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallary);
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);

        ImagePagerAdapter adapter = new ImagePagerAdapter();

        viewPager.setAdapter(adapter);

    }  //imageArrayIcon = getResources().obtainTypedArray(R.array.imageArray);

    public class ImagePagerAdapter extends PagerAdapter {
         private int[] mImages = new int[]{R.drawable.background,R.drawable.icon_couple,R.drawable.app_icon};
       @Override

        public int getCount() {

            return mImages.length;

        }

        @Override

        public boolean isViewFromObject(View view, Object object) {

            return view == ((ImageView) object);

        }
         @Override
         public Object instantiateItem(ViewGroup container, int position) {
           Context context = Gallary.this;
             ImageView imageView = new ImageView(context);
            int padding = context.getResources().getDimensionPixelSize(
                    R.dimen.padding_medium);
            imageView.setPadding(padding, padding, padding, padding);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

            imageView.setImageResource(mImages[position]);
             //imageView.setImageResource(imageArrayIcon.getResourceId(mImages[position], -1));

            ((ViewPager) container).addView(imageView, 0);

            return imageView;

        }

        @Override

        public void destroyItem(ViewGroup container, int position, Object object) {

            ((ViewPager) container).removeView((ImageView) object);

        }

    }

}
