package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
public abstract class AbstractC11944q {

    /* renamed from: a */
    public final RecyclerView.AbstractC11855p f55578a;

    /* renamed from: b */
    public int f55579b;

    /* renamed from: c */
    public final Rect f55580c;

    /* renamed from: androidx.recyclerview.widget.q$a */
    /* loaded from: classes.dex */
    public class C11945a extends AbstractC11944q {
        public C11945a(RecyclerView.AbstractC11855p abstractC11855p) {
            super(abstractC11855p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: d */
        public int mo66161d(View view) {
            return this.f55578a.m66581n0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: e */
        public int mo66160e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f55578a.m66582m0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: f */
        public int mo66159f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f55578a.m66583l0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: g */
        public int mo66158g(View view) {
            return this.f55578a.m66584k0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: h */
        public int mo66157h() {
            return this.f55578a.m66642E0();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: i */
        public int mo66156i() {
            return this.f55578a.m66642E0() - this.f55578a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: j */
        public int mo66155j() {
            return this.f55578a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: k */
        public int mo66154k() {
            return this.f55578a.m66640F0();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: l */
        public int mo66153l() {
            return this.f55578a.m66576r0();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: m */
        public int mo66152m() {
            return this.f55578a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: n */
        public int mo66151n() {
            return (this.f55578a.m66642E0() - this.f55578a.getPaddingLeft()) - this.f55578a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: p */
        public int mo66150p(View view) {
            this.f55578a.m66644D0(view, true, this.f55580c);
            return this.f55580c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: q */
        public int mo66149q(View view) {
            this.f55578a.m66644D0(view, true, this.f55580c);
            return this.f55580c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: r */
        public void mo66148r(int i) {
            this.f55578a.mo66463T0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    /* loaded from: classes.dex */
    public class C11946b extends AbstractC11944q {
        public C11946b(RecyclerView.AbstractC11855p abstractC11855p) {
            super(abstractC11855p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: d */
        public int mo66161d(View view) {
            return this.f55578a.m66586i0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: e */
        public int mo66160e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f55578a.m66583l0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: f */
        public int mo66159f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f55578a.m66582m0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: g */
        public int mo66158g(View view) {
            return this.f55578a.m66580o0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: h */
        public int mo66157h() {
            return this.f55578a.m66578q0();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: i */
        public int mo66156i() {
            return this.f55578a.m66578q0() - this.f55578a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: j */
        public int mo66155j() {
            return this.f55578a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: k */
        public int mo66154k() {
            return this.f55578a.m66576r0();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: l */
        public int mo66153l() {
            return this.f55578a.m66640F0();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: m */
        public int mo66152m() {
            return this.f55578a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: n */
        public int mo66151n() {
            return (this.f55578a.m66578q0() - this.f55578a.getPaddingTop()) - this.f55578a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: p */
        public int mo66150p(View view) {
            this.f55578a.m66644D0(view, true, this.f55580c);
            return this.f55580c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: q */
        public int mo66149q(View view) {
            this.f55578a.m66644D0(view, true, this.f55580c);
            return this.f55580c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC11944q
        /* renamed from: r */
        public void mo66148r(int i) {
            this.f55578a.mo66461U0(i);
        }
    }

    public /* synthetic */ AbstractC11944q(RecyclerView.AbstractC11855p abstractC11855p, C11945a c11945a) {
        this(abstractC11855p);
    }

    /* renamed from: a */
    public static AbstractC11944q m66166a(RecyclerView.AbstractC11855p abstractC11855p) {
        return new C11945a(abstractC11855p);
    }

    /* renamed from: b */
    public static AbstractC11944q m66165b(RecyclerView.AbstractC11855p abstractC11855p, int i) {
        if (i != 0) {
            if (i == 1) {
                return m66164c(abstractC11855p);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m66166a(abstractC11855p);
    }

    /* renamed from: c */
    public static AbstractC11944q m66164c(RecyclerView.AbstractC11855p abstractC11855p) {
        return new C11946b(abstractC11855p);
    }

    /* renamed from: d */
    public abstract int mo66161d(View view);

    /* renamed from: e */
    public abstract int mo66160e(View view);

    /* renamed from: f */
    public abstract int mo66159f(View view);

    /* renamed from: g */
    public abstract int mo66158g(View view);

    /* renamed from: h */
    public abstract int mo66157h();

    /* renamed from: i */
    public abstract int mo66156i();

    /* renamed from: j */
    public abstract int mo66155j();

    /* renamed from: k */
    public abstract int mo66154k();

    /* renamed from: l */
    public abstract int mo66153l();

    /* renamed from: m */
    public abstract int mo66152m();

    /* renamed from: n */
    public abstract int mo66151n();

    /* renamed from: o */
    public int m66163o() {
        if (Integer.MIN_VALUE == this.f55579b) {
            return 0;
        }
        return mo66151n() - this.f55579b;
    }

    /* renamed from: p */
    public abstract int mo66150p(View view);

    /* renamed from: q */
    public abstract int mo66149q(View view);

    /* renamed from: r */
    public abstract void mo66148r(int i);

    /* renamed from: s */
    public void m66162s() {
        this.f55579b = mo66151n();
    }

    public AbstractC11944q(RecyclerView.AbstractC11855p abstractC11855p) {
        this.f55579b = Integer.MIN_VALUE;
        this.f55580c = new Rect();
        this.f55578a = abstractC11855p;
    }
}
