package me.relex.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import me.relex.circleindicator.BaseCircleIndicator;
/* loaded from: classes8.dex */
public class CircleIndicator extends BaseCircleIndicator {

    /* renamed from: n */
    public ViewPager f98477n;

    /* renamed from: o */
    public final ViewPager.InterfaceC12076i f98478o;

    /* renamed from: p */
    public final DataSetObserver f98479p;

    /* renamed from: me.relex.circleindicator.CircleIndicator$a */
    /* loaded from: classes8.dex */
    public class C26154a implements ViewPager.InterfaceC12076i {
        public C26154a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            if (CircleIndicator.this.f98477n.getAdapter() != null && CircleIndicator.this.f98477n.getAdapter().getCount() > 0) {
                CircleIndicator.this.mo25275b(i);
            }
        }
    }

    /* renamed from: me.relex.circleindicator.CircleIndicator$b */
    /* loaded from: classes8.dex */
    public class C26155b extends DataSetObserver {
        public C26155b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            int i;
            super.onChanged();
            if (CircleIndicator.this.f98477n == null) {
                return;
            }
            AbstractC39022cE3 adapter = CircleIndicator.this.f98477n.getAdapter();
            if (adapter != null) {
                i = adapter.getCount();
            } else {
                i = 0;
            }
            if (i == CircleIndicator.this.getChildCount()) {
                return;
            }
            CircleIndicator circleIndicator = CircleIndicator.this;
            if (circleIndicator.f98476m < i) {
                circleIndicator.f98476m = circleIndicator.f98477n.getCurrentItem();
            } else {
                circleIndicator.f98476m = -1;
            }
            CircleIndicator.this.m25280l();
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        this.f98478o = new C26154a();
        this.f98479p = new C26155b();
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo25275b(int i) {
        super.mo25275b(i);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo25274f(int i, int i2) {
        super.mo25274f(i, i2);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo25273i(C33431Hu0 c33431Hu0) {
        super.mo25273i(c33431Hu0);
    }

    /* renamed from: l */
    public final void m25280l() {
        int count;
        AbstractC39022cE3 adapter = this.f98477n.getAdapter();
        if (adapter == null) {
            count = 0;
        } else {
            count = adapter.getCount();
        }
        mo25274f(count, this.f98477n.getCurrentItem());
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.InterfaceC26152a interfaceC26152a) {
        super.setIndicatorCreatedListener(interfaceC26152a);
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.InterfaceC12076i interfaceC12076i) {
        ViewPager viewPager = this.f98477n;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(interfaceC12076i);
            this.f98477n.addOnPageChangeListener(interfaceC12076i);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }

    public void setViewPager(ViewPager viewPager) {
        this.f98477n = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f98476m = -1;
            m25280l();
            this.f98477n.removeOnPageChangeListener(this.f98478o);
            this.f98477n.addOnPageChangeListener(this.f98478o);
            this.f98478o.onPageSelected(this.f98477n.getCurrentItem());
        }
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98478o = new C26154a();
        this.f98479p = new C26155b();
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f98478o = new C26154a();
        this.f98479p = new C26155b();
    }
}
