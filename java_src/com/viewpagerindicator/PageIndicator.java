package com.viewpagerindicator;

import androidx.viewpager.widget.ViewPager;
/* loaded from: classes7.dex */
public interface PageIndicator extends ViewPager.InterfaceC12076i {
    void notifyDataSetChanged();

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
    /* synthetic */ void onPageScrollStateChanged(int i);

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
    /* synthetic */ void onPageScrolled(int i, float f, int i2);

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
    /* synthetic */ void onPageSelected(int i);

    void setCurrentItem(int i);

    void setOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i);

    void setViewPager(ViewPager viewPager);

    void setViewPager(ViewPager viewPager, int i);
}
