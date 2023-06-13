package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.AbstractC11953v;
import androidx.recyclerview.widget.RecyclerView;
import me.relex.circleindicator.BaseCircleIndicator;
/* loaded from: classes8.dex */
public class CircleIndicator2 extends BaseCircleIndicator {

    /* renamed from: n */
    public RecyclerView f98482n;

    /* renamed from: o */
    public AbstractC11953v f98483o;

    /* renamed from: p */
    public final RecyclerView.AbstractC11863t f98484p;

    /* renamed from: q */
    public final RecyclerView.AbstractC11846j f98485q;

    /* renamed from: me.relex.circleindicator.CircleIndicator2$a */
    /* loaded from: classes8.dex */
    public class C26156a extends RecyclerView.AbstractC11863t {
        public C26156a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            int m25276m = CircleIndicator2.this.m25276m(recyclerView.getLayoutManager());
            if (m25276m == -1) {
                return;
            }
            CircleIndicator2.this.mo25275b(m25276m);
        }
    }

    public CircleIndicator2(Context context) {
        super(context);
        this.f98484p = new C26156a();
        this.f98485q = new C26157b();
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
    public final void m25277l() {
        int itemCount;
        RecyclerView.AbstractC11843h adapter = this.f98482n.getAdapter();
        if (adapter == null) {
            itemCount = 0;
        } else {
            itemCount = adapter.getItemCount();
        }
        mo25274f(itemCount, m25276m(this.f98482n.getLayoutManager()));
    }

    /* renamed from: m */
    public int m25276m(RecyclerView.AbstractC11855p abstractC11855p) {
        View mo65647g;
        if (abstractC11855p == null || (mo65647g = this.f98483o.mo65647g(abstractC11855p)) == null) {
            return -1;
        }
        return abstractC11855p.m66564x0(mo65647g);
    }

    @Override // me.relex.circleindicator.BaseCircleIndicator
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.InterfaceC26152a interfaceC26152a) {
        super.setIndicatorCreatedListener(interfaceC26152a);
    }

    /* renamed from: me.relex.circleindicator.CircleIndicator2$b */
    /* loaded from: classes8.dex */
    public class C26157b extends RecyclerView.AbstractC11846j {
        public C26157b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            int i;
            super.onChanged();
            if (CircleIndicator2.this.f98482n == null) {
                return;
            }
            RecyclerView.AbstractC11843h adapter = CircleIndicator2.this.f98482n.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            if (i == CircleIndicator2.this.getChildCount()) {
                return;
            }
            CircleIndicator2 circleIndicator2 = CircleIndicator2.this;
            if (circleIndicator2.f98476m < i) {
                circleIndicator2.f98476m = circleIndicator2.m25276m(circleIndicator2.f98482n.getLayoutManager());
            } else {
                circleIndicator2.f98476m = -1;
            }
            CircleIndicator2.this.m25277l();
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

    public CircleIndicator2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98484p = new C26156a();
        this.f98485q = new C26157b();
    }

    public CircleIndicator2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f98484p = new C26156a();
        this.f98485q = new C26157b();
    }
}
