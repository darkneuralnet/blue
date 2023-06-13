package co.bird.android.widget.viewpager.fixedspeed;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
public class ScrollerViewPager extends ViewPager {

    /* renamed from: c */
    public static final String f68157c = "ScrollerViewPager";

    /* renamed from: b */
    public int f68158b;

    public ScrollerViewPager(Context context) {
        super(context);
        this.f68158b = 1000;
    }

    /* renamed from: a */
    public void m53947a() {
        m53946b(this.f68158b);
    }

    /* renamed from: b */
    public void m53946b(int i) {
        this.f68158b = i;
        m53945c(i);
    }

    /* renamed from: c */
    public final void m53945c(int i) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            C42933io1 c42933io1 = new C42933io1(getContext(), new DecelerateInterpolator(1.5f));
            c42933io1.m31855a(i);
            declaredField.set(this, c42933io1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            Log.e(f68157c, "onInterceptTouchEvent in IllegalArgumentException");
            return false;
        }
    }

    public ScrollerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68158b = 1000;
    }
}
