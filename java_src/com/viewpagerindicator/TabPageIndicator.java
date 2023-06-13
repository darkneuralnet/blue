package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes7.dex */
public class TabPageIndicator extends HorizontalScrollView implements PageIndicator {
    private static final CharSequence EMPTY_TITLE = "";
    private ViewPager.InterfaceC12076i mListener;
    private int mMaxTabWidth;
    private int mSelectedTabIndex;
    private final View.OnClickListener mTabClickListener;
    private final IcsLinearLayout mTabLayout;
    private OnTabReselectedListener mTabReselectedListener;
    private Runnable mTabSelector;
    private ViewPager mViewPager;

    /* loaded from: classes7.dex */
    public interface OnTabReselectedListener {
        void onTabReselected(int i);
    }

    /* loaded from: classes7.dex */
    public class TabView extends TextView {
        private int mIndex;

        public TabView(Context context) {
            super(context, null, C19589R.attr.vpiTabPageIndicatorStyle);
        }

        public int getIndex() {
            return this.mIndex;
        }

        @Override // android.widget.TextView, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (TabPageIndicator.this.mMaxTabWidth > 0 && getMeasuredWidth() > TabPageIndicator.this.mMaxTabWidth) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.mMaxTabWidth, 1073741824), i2);
            }
        }
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    private void addTab(int i, CharSequence charSequence, int i2) {
        TabView tabView = new TabView(getContext());
        tabView.mIndex = i;
        tabView.setFocusable(true);
        tabView.setOnClickListener(this.mTabClickListener);
        tabView.setText(charSequence);
        if (i2 != 0) {
            tabView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.mTabLayout.addView(tabView, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    private void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.viewpagerindicator.TabPageIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                TabPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((TabPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                TabPageIndicator.this.mTabSelector = null;
            }
        };
        this.mTabSelector = runnable2;
        post(runnable2);
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void notifyDataSetChanged() {
        IconPagerAdapter iconPagerAdapter;
        int i;
        this.mTabLayout.removeAllViews();
        AbstractC39022cE3 adapter = this.mViewPager.getAdapter();
        if (adapter instanceof IconPagerAdapter) {
            iconPagerAdapter = (IconPagerAdapter) adapter;
        } else {
            iconPagerAdapter = null;
        }
        int count = adapter.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            CharSequence pageTitle = adapter.getPageTitle(i2);
            if (pageTitle == null) {
                pageTitle = EMPTY_TITLE;
            }
            if (iconPagerAdapter != null) {
                i = iconPagerAdapter.getIconResId(i2);
            } else {
                i = 0;
            }
            addTab(i2, pageTitle, i);
        }
        if (this.mSelectedTabIndex > count) {
            this.mSelectedTabIndex = count - 1;
        }
        setCurrentItem(this.mSelectedTabIndex);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
            }
        } else {
            this.mMaxTabWidth = -1;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setCurrentItem(this.mSelectedTabIndex);
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
            this.mSelectedTabIndex = i;
            viewPager.setCurrentItem(i);
            int childCount = this.mTabLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mTabLayout.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (z) {
                    animateToTab(i);
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

    public void setOnTabReselectedListener(OnTabReselectedListener onTabReselectedListener) {
        this.mTabReselectedListener = onTabReselectedListener;
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

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabClickListener = new View.OnClickListener() { // from class: com.viewpagerindicator.TabPageIndicator.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int currentItem = TabPageIndicator.this.mViewPager.getCurrentItem();
                int index = ((TabView) view).getIndex();
                TabPageIndicator.this.mViewPager.setCurrentItem(index);
                if (currentItem == index && TabPageIndicator.this.mTabReselectedListener != null) {
                    TabPageIndicator.this.mTabReselectedListener.onTabReselected(index);
                }
            }
        };
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, C19589R.attr.vpiTabPageIndicatorStyle);
        this.mTabLayout = icsLinearLayout;
        addView(icsLinearLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // com.viewpagerindicator.PageIndicator
    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
