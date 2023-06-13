package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes.dex */
public class C11947r extends AbstractC11953v {

    /* renamed from: d */
    public AbstractC11944q f55581d;

    /* renamed from: e */
    public AbstractC11944q f55582e;

    /* renamed from: androidx.recyclerview.widget.r$a */
    /* loaded from: classes.dex */
    public class C11948a extends C11939n {
        public C11948a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C11939n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C11939n
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.C11939n, androidx.recyclerview.widget.RecyclerView.AbstractC11869y
        public void onTargetFound(View view, RecyclerView.C11872z c11872z, RecyclerView.AbstractC11869y.C11870a c11870a) {
            C11947r c11947r = C11947r.this;
            int[] mo66131c = c11947r.mo66131c(c11947r.f55588a.getLayoutManager(), view);
            int i = mo66131c[0];
            int i2 = mo66131c[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                c11870a.m66493d(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC11953v
    /* renamed from: c */
    public int[] mo66131c(RecyclerView.AbstractC11855p abstractC11855p, View view) {
        int[] iArr = new int[2];
        if (abstractC11855p.mo51880E()) {
            iArr[0] = m66147l(view, m66145n(abstractC11855p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC11855p.mo51878F()) {
            iArr[1] = m66147l(view, m66143p(abstractC11855p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC11953v
    /* renamed from: d */
    public RecyclerView.AbstractC11869y mo66130d(RecyclerView.AbstractC11855p abstractC11855p) {
        if (!(abstractC11855p instanceof RecyclerView.AbstractC11869y.InterfaceC11871b)) {
            return null;
        }
        return new C11948a(this.f55588a.getContext());
    }

    @Override // androidx.recyclerview.widget.AbstractC11953v
    @SuppressLint({"UnknownNullness"})
    /* renamed from: g */
    public View mo65647g(RecyclerView.AbstractC11855p abstractC11855p) {
        if (abstractC11855p.mo51878F()) {
            return m66146m(abstractC11855p, m66143p(abstractC11855p));
        }
        if (abstractC11855p.mo51880E()) {
            return m66146m(abstractC11855p, m66145n(abstractC11855p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC11953v
    @SuppressLint({"UnknownNullness"})
    /* renamed from: h */
    public int mo66127h(RecyclerView.AbstractC11855p abstractC11855p, int i, int i2) {
        AbstractC11944q m66144o;
        int i3;
        int m66574s0 = abstractC11855p.m66574s0();
        if (m66574s0 == 0 || (m66144o = m66144o(abstractC11855p)) == null) {
            return -1;
        }
        int m66594d0 = abstractC11855p.m66594d0();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < m66594d0; i6++) {
            View m66597c0 = abstractC11855p.m66597c0(i6);
            if (m66597c0 != null) {
                int m66147l = m66147l(m66597c0, m66144o);
                if (m66147l <= 0 && m66147l > i5) {
                    view2 = m66597c0;
                    i5 = m66147l;
                }
                if (m66147l >= 0 && m66147l < i4) {
                    view = m66597c0;
                    i4 = m66147l;
                }
            }
        }
        boolean m66142q = m66142q(abstractC11855p, i, i2);
        if (m66142q && view != null) {
            return abstractC11855p.m66564x0(view);
        }
        if (!m66142q && view2 != null) {
            return abstractC11855p.m66564x0(view2);
        }
        if (m66142q) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m66564x0 = abstractC11855p.m66564x0(view);
        if (m66141r(abstractC11855p) == m66142q) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = m66564x0 + i3;
        if (i7 < 0 || i7 >= m66574s0) {
            return -1;
        }
        return i7;
    }

    /* renamed from: l */
    public final int m66147l(View view, AbstractC11944q abstractC11944q) {
        return (abstractC11944q.mo66158g(view) + (abstractC11944q.mo66160e(view) / 2)) - (abstractC11944q.mo66152m() + (abstractC11944q.mo66151n() / 2));
    }

    /* renamed from: m */
    public final View m66146m(RecyclerView.AbstractC11855p abstractC11855p, AbstractC11944q abstractC11944q) {
        int m66594d0 = abstractC11855p.m66594d0();
        View view = null;
        if (m66594d0 == 0) {
            return null;
        }
        int mo66152m = abstractC11944q.mo66152m() + (abstractC11944q.mo66151n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m66594d0; i2++) {
            View m66597c0 = abstractC11855p.m66597c0(i2);
            int abs = Math.abs((abstractC11944q.mo66158g(m66597c0) + (abstractC11944q.mo66160e(m66597c0) / 2)) - mo66152m);
            if (abs < i) {
                view = m66597c0;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: n */
    public final AbstractC11944q m66145n(RecyclerView.AbstractC11855p abstractC11855p) {
        AbstractC11944q abstractC11944q = this.f55582e;
        if (abstractC11944q == null || abstractC11944q.f55578a != abstractC11855p) {
            this.f55582e = AbstractC11944q.m66166a(abstractC11855p);
        }
        return this.f55582e;
    }

    /* renamed from: o */
    public final AbstractC11944q m66144o(RecyclerView.AbstractC11855p abstractC11855p) {
        if (abstractC11855p.mo51878F()) {
            return m66143p(abstractC11855p);
        }
        if (abstractC11855p.mo51880E()) {
            return m66145n(abstractC11855p);
        }
        return null;
    }

    /* renamed from: p */
    public final AbstractC11944q m66143p(RecyclerView.AbstractC11855p abstractC11855p) {
        AbstractC11944q abstractC11944q = this.f55581d;
        if (abstractC11944q == null || abstractC11944q.f55578a != abstractC11855p) {
            this.f55581d = AbstractC11944q.m66164c(abstractC11855p);
        }
        return this.f55581d;
    }

    /* renamed from: q */
    public final boolean m66142q(RecyclerView.AbstractC11855p abstractC11855p, int i, int i2) {
        return abstractC11855p.mo51880E() ? i > 0 : i2 > 0;
    }

    /* renamed from: r */
    public final boolean m66141r(RecyclerView.AbstractC11855p abstractC11855p) {
        PointF mo51838a;
        int m66574s0 = abstractC11855p.m66574s0();
        if (!(abstractC11855p instanceof RecyclerView.AbstractC11869y.InterfaceC11871b) || (mo51838a = ((RecyclerView.AbstractC11869y.InterfaceC11871b) abstractC11855p).mo51838a(m66574s0 - 1)) == null) {
            return false;
        }
        if (mo51838a.x >= 0.0f && mo51838a.y >= 0.0f) {
            return false;
        }
        return true;
    }
}
