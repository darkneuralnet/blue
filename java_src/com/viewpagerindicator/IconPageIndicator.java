package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes7.dex */
public class IconPageIndicator extends HorizontalScrollView implements PageIndicator {
    private Runnable mIconSelector;
    private final IcsLinearLayout mIconsLayout;
    private ViewPager.InterfaceC12076i mListener;
    private int mSelectedIndex;
    private ViewPager mViewPager;

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    private void animateToIcon(int i) {
        final View childAt = this.mIconsLayout.getChildAt(i);
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.viewpagerindicator.IconPageIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                IconPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((IconPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                IconPageIndicator.this.mIconSelector = null;
            }
        };
        this.mIconSelector = runnable2;
        post(runnable2);
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        this.mIconsLayout.removeAllViews();
        IconPagerAdapter iconPagerAdapter = (IconPagerAdapter) this.mViewPager.getAdapter();
        int count = iconPagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            ImageView imageView = new ImageView(getContext(), null, C19589R.attr.vpiIconPageIndicatorStyle);
            imageView.setImageResource(iconPagerAdapter.getIconResId(i));
            this.mIconsLayout.addView(imageView);
        }
        if (this.mSelectedIndex > count) {
            this.mSelectedIndex = count - 1;
        }
        setCurrentItem(this.mSelectedIndex);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrollStateChanged(int i) {
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrollStateChanged(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageScrolled(int i, float f, int i2) {
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageScrolled(i, f, i2);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator, androidx.viewpager.widget.ViewPager.InterfaceC12076i
    public void onPageSelected(int i) {
        setCurrentItem(i);
        ViewPager.InterfaceC12076i interfaceC12076i = this.mListener;
        if (interfaceC12076i != null) {
            interfaceC12076i.onPageSelected(i);
        }
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setCurrentItem(int i) {
        boolean z;
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            this.mSelectedIndex = i;
            viewPager.setCurrentItem(i);
            int childCount = this.mIconsLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mIconsLayout.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (z) {
                    animateToIcon(i);
                }
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        this.mListener = interfaceC12076i;
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() != null) {
            this.mViewPager = viewPager;
            viewPager.setOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, C19589R.attr.vpiIconPageIndicatorStyle);
        this.mIconsLayout = icsLinearLayout;
        addView(icsLinearLayout, new FrameLayout.LayoutParams(-2, -1, 17));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
