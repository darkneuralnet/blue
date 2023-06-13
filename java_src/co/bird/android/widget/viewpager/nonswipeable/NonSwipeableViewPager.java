package co.bird.android.widget.viewpager.nonswipeable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import co.bird.android.widget.viewpager.fixedspeed.ScrollerViewPager;
/* loaded from: classes4.dex */
public class NonSwipeableViewPager extends ScrollerViewPager {

    /* renamed from: d */
    public boolean f68159d;

    public NonSwipeableViewPager(Context context) {
        super(context);
        this.f68159d = false;
    }

    @Override // co.bird.android.widget.viewpager.fixedspeed.ScrollerViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f68159d && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f68159d && super.onTouchEvent(motionEvent);
    }

    public void setSwipeEnabled(boolean z) {
        this.f68159d = z;
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68159d = false;
    }
}
