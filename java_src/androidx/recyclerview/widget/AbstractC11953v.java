package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes.dex */
public abstract class AbstractC11953v extends RecyclerView.AbstractC11861r {

    /* renamed from: a */
    public RecyclerView f55588a;

    /* renamed from: b */
    public Scroller f55589b;

    /* renamed from: c */
    public final RecyclerView.AbstractC11863t f55590c = new C11954a();

    /* renamed from: androidx.recyclerview.widget.v$a */
    /* loaded from: classes.dex */
    public class C11954a extends RecyclerView.AbstractC11863t {

        /* renamed from: a */
        public boolean f55591a = false;

        public C11954a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f55591a) {
                this.f55591a = false;
                AbstractC11953v.this.m66124k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f55591a = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$b */
    /* loaded from: classes.dex */
    public class C11955b extends C11939n {
        public C11955b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C11939n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C11939n, androidx.recyclerview.widget.RecyclerView.AbstractC11869y
        public void onTargetFound(View view, RecyclerView.C11872z c11872z, RecyclerView.AbstractC11869y.C11870a c11870a) {
            AbstractC11953v abstractC11953v = AbstractC11953v.this;
            RecyclerView recyclerView = abstractC11953v.f55588a;
            if (recyclerView == null) {
                return;
            }
            int[] mo66131c = abstractC11953v.mo66131c(recyclerView.getLayoutManager(), view);
            int i = mo66131c[0];
            int i2 = mo66131c[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                c11870a.m66493d(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11861r
    /* renamed from: a */
    public boolean mo66133a(int i, int i2) {
        RecyclerView.AbstractC11855p layoutManager = this.f55588a.getLayoutManager();
        if (layoutManager == null || this.f55588a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f55588a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !m66125j(layoutManager, i, i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m66132b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f55588a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m66128f();
        }
        this.f55588a = recyclerView;
        if (recyclerView != null) {
            m66126i();
            this.f55589b = new Scroller(this.f55588a.getContext(), new DecelerateInterpolator());
            m66124k();
        }
    }

    /* renamed from: c */
    public abstract int[] mo66131c(RecyclerView.AbstractC11855p abstractC11855p, View view);

    /* renamed from: d */
    public RecyclerView.AbstractC11869y mo66130d(RecyclerView.AbstractC11855p abstractC11855p) {
        return m66129e(abstractC11855p);
    }

    @Deprecated
    /* renamed from: e */
    public C11939n m66129e(RecyclerView.AbstractC11855p abstractC11855p) {
        if (!(abstractC11855p instanceof RecyclerView.AbstractC11869y.InterfaceC11871b)) {
            return null;
        }
        return new C11955b(this.f55588a.getContext());
    }

    /* renamed from: f */
    public final void m66128f() {
        this.f55588a.removeOnScrollListener(this.f55590c);
        this.f55588a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: g */
    public abstract View mo65647g(RecyclerView.AbstractC11855p abstractC11855p);

    @SuppressLint({"UnknownNullness"})
    /* renamed from: h */
    public abstract int mo66127h(RecyclerView.AbstractC11855p abstractC11855p, int i, int i2);

    /* renamed from: i */
    public final void m66126i() throws IllegalStateException {
        if (this.f55588a.getOnFlingListener() == null) {
            this.f55588a.addOnScrollListener(this.f55590c);
            this.f55588a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: j */
    public final boolean m66125j(RecyclerView.AbstractC11855p abstractC11855p, int i, int i2) {
        RecyclerView.AbstractC11869y mo66130d;
        int mo66127h;
        if (!(abstractC11855p instanceof RecyclerView.AbstractC11869y.InterfaceC11871b) || (mo66130d = mo66130d(abstractC11855p)) == null || (mo66127h = mo66127h(abstractC11855p, i, i2)) == -1) {
            return false;
        }
        mo66130d.setTargetPosition(mo66127h);
        abstractC11855p.m66598b2(mo66130d);
        return true;
    }

    /* renamed from: k */
    public void m66124k() {
        RecyclerView.AbstractC11855p layoutManager;
        View mo65647g;
        RecyclerView recyclerView = this.f55588a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo65647g = mo65647g(layoutManager)) == null) {
            return;
        }
        int[] mo66131c = mo66131c(layoutManager, mo65647g);
        int i = mo66131c[0];
        if (i != 0 || mo66131c[1] != 0) {
            this.f55588a.smoothScrollBy(i, mo66131c[1]);
        }
    }
}
