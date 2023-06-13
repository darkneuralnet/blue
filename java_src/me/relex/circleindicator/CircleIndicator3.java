package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import me.relex.circleindicator.BaseCircleIndicator;
/* loaded from: classes8.dex */
public class CircleIndicator3 extends BaseCircleIndicator {

    /* renamed from: n */
    public ViewPager2 f98488n;

    /* renamed from: o */
    public final ViewPager2.AbstractC12103i f98489o;

    /* renamed from: p */
    public final RecyclerView.AbstractC11846j f98490p;

    /* renamed from: me.relex.circleindicator.CircleIndicator3$a */
    /* loaded from: classes8.dex */
    public class C26158a extends ViewPager2.AbstractC12103i {
        public C26158a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (i != circleIndicator3.f98476m && circleIndicator3.f98488n.m65701c() != null && CircleIndicator3.this.f98488n.m65701c().getItemCount() > 0) {
                CircleIndicator3.this.mo25275b(i);
            }
        }
    }

    public CircleIndicator3(Context context) {
        super(context);
        this.f98489o = new C26158a();
        this.f98490p = new C26159b();
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
    public final void m25270l() {
        int itemCount;
        RecyclerView.AbstractC11843h m65701c = this.f98488n.m65701c();
        if (m65701c == null) {
            itemCount = 0;
        } else {
            itemCount = m65701c.getItemCount();
        }
        mo25274f(itemCount, this.f98488n.m65700d());
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.InterfaceC26152a interfaceC26152a) {
        super.setIndicatorCreatedListener(interfaceC26152a);
    }

    public void setViewPager(ViewPager2 viewPager2) {
        this.f98488n = viewPager2;
        if (viewPager2 != null && viewPager2.m65701c() != null) {
            this.f98476m = -1;
            m25270l();
            this.f98488n.m65684t(this.f98489o);
            this.f98488n.m65690n(this.f98489o);
            this.f98489o.mo224c(this.f98488n.m65700d());
        }
    }

    /* renamed from: me.relex.circleindicator.CircleIndicator3$b */
    /* loaded from: classes8.dex */
    public class C26159b extends RecyclerView.AbstractC11846j {
        public C26159b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            int i;
            super.onChanged();
            if (CircleIndicator3.this.f98488n == null) {
                return;
            }
            RecyclerView.AbstractC11843h m65701c = CircleIndicator3.this.f98488n.m65701c();
            if (m65701c != null) {
                i = m65701c.getItemCount();
            } else {
                i = 0;
            }
            if (i == CircleIndicator3.this.getChildCount()) {
                return;
            }
            CircleIndicator3 circleIndicator3 = CircleIndicator3.this;
            if (circleIndicator3.f98476m < i) {
                circleIndicator3.f98476m = circleIndicator3.f98488n.m65700d();
            } else {
                circleIndicator3.f98476m = -1;
            }
            CircleIndicator3.this.m25270l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2) {
            super.onItemRangeChanged(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeInserted(int i, int i2) {
            super.onItemRangeInserted(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeMoved(int i, int i2, int i3) {
            super.onItemRangeMoved(i, i2, i3);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2, Object obj) {
            super.onItemRangeChanged(i, i2, obj);
            onChanged();
        }
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98489o = new C26158a();
        this.f98490p = new C26159b();
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f98489o = new C26158a();
        this.f98490p = new C26159b();
    }
}
