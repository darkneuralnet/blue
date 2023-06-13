package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C11947r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import net.danlew.android.joda.DateUtils;
import p000.C27125p2;
import p000.DB6;
import p000.InterfaceC28996u2;
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: v */
    public static boolean f56101v = true;

    /* renamed from: w */
    public static final DB6 f56102w = new DB6.C1417b().m110762a();

    /* renamed from: b */
    public final Rect f56103b;

    /* renamed from: c */
    public final Rect f56104c;

    /* renamed from: d */
    public C12112a f56105d;

    /* renamed from: e */
    public int f56106e;

    /* renamed from: f */
    public boolean f56107f;

    /* renamed from: g */
    public RecyclerView.AbstractC11846j f56108g;

    /* renamed from: h */
    public LinearLayoutManager f56109h;

    /* renamed from: i */
    public int f56110i;

    /* renamed from: j */
    public Parcelable f56111j;

    /* renamed from: k */
    public RecyclerView f56112k;

    /* renamed from: l */
    public C11947r f56113l;

    /* renamed from: m */
    public C12114c f56114m;

    /* renamed from: n */
    public C12112a f56115n;

    /* renamed from: o */
    public C32865Fj1 f56116o;

    /* renamed from: p */
    public C12113b f56117p;

    /* renamed from: q */
    public RecyclerView.AbstractC11849m f56118q;

    /* renamed from: r */
    public boolean f56119r;

    /* renamed from: s */
    public boolean f56120s;

    /* renamed from: t */
    public int f56121t;

    /* renamed from: u */
    public AbstractC12099e f56122u;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    /* loaded from: classes.dex */
    public class C12095a extends AbstractC12101g {
        public C12095a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12101g, androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f56107f = true;
            viewPager2.f56114m.m65632j();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    /* loaded from: classes.dex */
    public class C12096b extends AbstractC12103i {
        public C12096b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: a */
        public void mo48696a(int i) {
            if (i == 0) {
                ViewPager2.this.m65683u();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f56106e != i) {
                viewPager2.f56106e = i;
                viewPager2.f56122u.mo65655r();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    /* loaded from: classes.dex */
    public class C12097c extends AbstractC12103i {
        public C12097c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12103i
        /* renamed from: c */
        public void mo224c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f56112k.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    /* loaded from: classes.dex */
    public class C12098d implements RecyclerView.InterfaceC11860q {
        public C12098d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11860q
        /* renamed from: a */
        public void mo65678a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11860q
        /* renamed from: d */
        public void mo65677d(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                return;
            }
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    /* loaded from: classes.dex */
    public abstract class AbstractC12099e {
        public AbstractC12099e() {
        }

        /* renamed from: a */
        public boolean mo65667a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo65676b(int i) {
            return false;
        }

        /* renamed from: c */
        public boolean mo65666c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        public boolean mo65675d() {
            return false;
        }

        /* renamed from: e */
        public void mo65665e(RecyclerView.AbstractC11843h<?> abstractC11843h) {
        }

        /* renamed from: f */
        public void mo65664f(RecyclerView.AbstractC11843h<?> abstractC11843h) {
        }

        /* renamed from: g */
        public String mo65663g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        public void mo65662h(C12112a c12112a, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo65661i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        public void mo65674j(C27125p2 c27125p2) {
        }

        /* renamed from: k */
        public void mo65660k(View view, C27125p2 c27125p2) {
        }

        /* renamed from: l */
        public boolean mo65673l(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public boolean mo65659m(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: n */
        public void mo65658n() {
        }

        /* renamed from: o */
        public CharSequence mo65672o() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: p */
        public void mo65657p(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: q */
        public void mo65656q() {
        }

        /* renamed from: r */
        public void mo65655r() {
        }

        /* renamed from: s */
        public void mo65654s() {
        }

        /* renamed from: t */
        public void mo65653t() {
        }

        public /* synthetic */ AbstractC12099e(ViewPager2 viewPager2, C12095a c12095a) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    /* loaded from: classes.dex */
    public class C12100f extends AbstractC12099e {
        public C12100f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: b */
        public boolean mo65676b(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.m65692l()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: d */
        public boolean mo65675d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: j */
        public void mo65674j(C27125p2 c27125p2) {
            if (!ViewPager2.this.m65692l()) {
                c27125p2.m20095W(C27125p2.C27126a.f103006r);
                c27125p2.m20095W(C27125p2.C27126a.f103005q);
                c27125p2.m20124H0(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: l */
        public boolean mo65673l(int i) {
            if (mo65676b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: o */
        public CharSequence mo65672o() {
            if (mo65675d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12101g extends RecyclerView.AbstractC11846j {
        private AbstractC12101g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        public /* synthetic */ AbstractC12101g(C12095a c12095a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    /* loaded from: classes.dex */
    public class C12102h extends LinearLayoutManager {
        public C12102h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
        /* renamed from: K1 */
        public boolean mo65671K1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
        /* renamed from: e1 */
        public void mo65670e1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C27125p2 c27125p2) {
            super.mo65670e1(c11866v, c11872z, c27125p2);
            ViewPager2.this.f56122u.mo65674j(c27125p2);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: e2 */
        public void mo49651e2(RecyclerView.C11872z c11872z, int[] iArr) {
            int m65699e = ViewPager2.this.m65699e();
            if (m65699e == -1) {
                super.mo49651e2(c11872z, iArr);
                return;
            }
            int m65697g = ViewPager2.this.m65697g() * m65699e;
            iArr[0] = m65697g;
            iArr[1] = m65697g;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
        /* renamed from: g1 */
        public void mo65669g1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, View view, C27125p2 c27125p2) {
            ViewPager2.this.f56122u.mo65660k(view, c27125p2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
        /* renamed from: y1 */
        public boolean mo65668y1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, int i, Bundle bundle) {
            if (ViewPager2.this.f56122u.mo65676b(i)) {
                return ViewPager2.this.f56122u.mo65673l(i);
            }
            return super.mo65668y1(c11866v, c11872z, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12103i {
        /* renamed from: a */
        public void mo48696a(int i) {
        }

        /* renamed from: b */
        public void mo48695b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo224c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    /* loaded from: classes.dex */
    public class C12104j extends AbstractC12099e {

        /* renamed from: b */
        public final InterfaceC28996u2 f56133b;

        /* renamed from: c */
        public final InterfaceC28996u2 f56134c;

        /* renamed from: d */
        public RecyclerView.AbstractC11846j f56135d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        /* loaded from: classes.dex */
        public class C12105a implements InterfaceC28996u2 {
            public C12105a() {
            }

            @Override // p000.InterfaceC28996u2
            /* renamed from: a */
            public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                C12104j.this.m65649x(((ViewPager2) view).m65700d() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        /* loaded from: classes.dex */
        public class C12106b implements InterfaceC28996u2 {
            public C12106b() {
            }

            @Override // p000.InterfaceC28996u2
            /* renamed from: a */
            public boolean mo8762a(View view, InterfaceC28996u2.AbstractC28997a abstractC28997a) {
                C12104j.this.m65649x(((ViewPager2) view).m65700d() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        /* loaded from: classes.dex */
        public class C12107c extends AbstractC12101g {
            public C12107c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12101g, androidx.recyclerview.widget.RecyclerView.AbstractC11846j
            public void onChanged() {
                C12104j.this.m65648y();
            }
        }

        public C12104j() {
            super(ViewPager2.this, null);
            this.f56133b = new C12105a();
            this.f56134c = new C12106b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: a */
        public boolean mo65667a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: c */
        public boolean mo65666c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: e */
        public void mo65665e(RecyclerView.AbstractC11843h<?> abstractC11843h) {
            m65648y();
            if (abstractC11843h != null) {
                abstractC11843h.registerAdapterDataObserver(this.f56135d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: f */
        public void mo65664f(RecyclerView.AbstractC11843h<?> abstractC11843h) {
            if (abstractC11843h != null) {
                abstractC11843h.unregisterAdapterDataObserver(this.f56135d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: g */
        public String mo65663g() {
            if (mo65667a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: h */
        public void mo65662h(C12112a c12112a, RecyclerView recyclerView) {
            C38790bq6.m62539H0(recyclerView, 2);
            this.f56135d = new C12107c();
            if (C38790bq6.m62552B(ViewPager2.this) == 0) {
                C38790bq6.m62539H0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: i */
        public void mo65661i(AccessibilityNodeInfo accessibilityNodeInfo) {
            C27125p2 m20096V0 = C27125p2.m20096V0(accessibilityNodeInfo);
            m65652u(m20096V0);
            m65650w(m20096V0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: k */
        public void mo65660k(View view, C27125p2 c27125p2) {
            m65651v(view, c27125p2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: m */
        public boolean mo65659m(int i, Bundle bundle) {
            int m65700d;
            if (mo65666c(i, bundle)) {
                if (i == 8192) {
                    m65700d = ViewPager2.this.m65700d() - 1;
                } else {
                    m65700d = ViewPager2.this.m65700d() + 1;
                }
                m65649x(m65700d);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: n */
        public void mo65658n() {
            m65648y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: p */
        public void mo65657p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo65663g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: q */
        public void mo65656q() {
            m65648y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: r */
        public void mo65655r() {
            m65648y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: s */
        public void mo65654s() {
            m65648y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC12099e
        /* renamed from: t */
        public void mo65653t() {
            m65648y();
        }

        /* renamed from: u */
        public final void m65652u(C27125p2 c27125p2) {
            int i;
            int i2;
            if (ViewPager2.this.m65701c() != null) {
                i2 = 1;
                if (ViewPager2.this.m65698f() == 1) {
                    i2 = ViewPager2.this.m65701c().getItemCount();
                    i = 1;
                } else {
                    i = ViewPager2.this.m65701c().getItemCount();
                }
            } else {
                i = 0;
                i2 = 0;
            }
            c27125p2.m20076h0(C27125p2.C27127b.m20034b(i2, i, false, 0));
        }

        /* renamed from: v */
        public final void m65651v(View view, C27125p2 c27125p2) {
            int i;
            int i2 = 0;
            if (ViewPager2.this.m65698f() == 1) {
                i = ViewPager2.this.f56109h.m66564x0(view);
            } else {
                i = 0;
            }
            if (ViewPager2.this.m65698f() == 0) {
                i2 = ViewPager2.this.f56109h.m66564x0(view);
            }
            c27125p2.m20074i0(C27125p2.C27128c.m20033a(i, 1, i2, 1, false, false));
        }

        /* renamed from: w */
        public final void m65650w(C27125p2 c27125p2) {
            int itemCount;
            RecyclerView.AbstractC11843h m65701c = ViewPager2.this.m65701c();
            if (m65701c != null && (itemCount = m65701c.getItemCount()) != 0 && ViewPager2.this.m65692l()) {
                if (ViewPager2.this.f56106e > 0) {
                    c27125p2.m20091a(8192);
                }
                if (ViewPager2.this.f56106e < itemCount - 1) {
                    c27125p2.m20091a(4096);
                }
                c27125p2.m20124H0(true);
            }
        }

        /* renamed from: x */
        public void m65649x(int i) {
            if (ViewPager2.this.m65692l()) {
                ViewPager2.this.m65687q(i, true);
            }
        }

        /* renamed from: y */
        public void m65648y() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            C38790bq6.m62464p0(viewPager2, 16908360);
            C38790bq6.m62464p0(viewPager2, 16908361);
            C38790bq6.m62464p0(viewPager2, 16908358);
            C38790bq6.m62464p0(viewPager2, 16908359);
            if (ViewPager2.this.m65701c() == null || (itemCount = ViewPager2.this.m65701c().getItemCount()) == 0 || !ViewPager2.this.m65692l()) {
                return;
            }
            if (ViewPager2.this.m65698f() == 0) {
                boolean m65693k = ViewPager2.this.m65693k();
                if (m65693k) {
                    i = 16908360;
                } else {
                    i = 16908361;
                }
                if (m65693k) {
                    i2 = 16908361;
                }
                if (ViewPager2.this.f56106e < itemCount - 1) {
                    C38790bq6.m62460r0(viewPager2, new C27125p2.C27126a(i, null), null, this.f56133b);
                }
                if (ViewPager2.this.f56106e > 0) {
                    C38790bq6.m62460r0(viewPager2, new C27125p2.C27126a(i2, null), null, this.f56134c);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f56106e < itemCount - 1) {
                C38790bq6.m62460r0(viewPager2, new C27125p2.C27126a(16908359, null), null, this.f56133b);
            }
            if (ViewPager2.this.f56106e > 0) {
                C38790bq6.m62460r0(viewPager2, new C27125p2.C27126a(16908358, null), null, this.f56134c);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    /* loaded from: classes.dex */
    public interface InterfaceC12108k {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    /* loaded from: classes.dex */
    public class C12109l extends C11947r {
        public C12109l() {
        }

        @Override // androidx.recyclerview.widget.C11947r, androidx.recyclerview.widget.AbstractC11953v
        /* renamed from: g */
        public View mo65647g(RecyclerView.AbstractC11855p abstractC11855p) {
            if (ViewPager2.this.m65694j()) {
                return null;
            }
            return super.mo65647g(abstractC11855p);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    /* loaded from: classes.dex */
    public class C12110m extends RecyclerView {
        public C12110m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f56122u.mo65675d()) {
                return ViewPager2.this.f56122u.mo65672o();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f56106e);
            accessibilityEvent.setToIndex(ViewPager2.this.f56106e);
            ViewPager2.this.f56122u.mo65657p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m65692l() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m65692l() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    /* loaded from: classes.dex */
    public static class RunnableC12111n implements Runnable {

        /* renamed from: b */
        public final int f56142b;

        /* renamed from: c */
        public final RecyclerView f56143c;

        public RunnableC12111n(int i, RecyclerView recyclerView) {
            this.f56142b = i;
            this.f56143c = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56143c.smoothScrollToPosition(this.f56142b);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f56103b = new Rect();
        this.f56104c = new Rect();
        this.f56105d = new C12112a(3);
        this.f56107f = false;
        this.f56108g = new C12095a();
        this.f56110i = -1;
        this.f56118q = null;
        this.f56119r = false;
        this.f56120s = true;
        this.f56121t = -1;
        m65695i(context, null);
    }

    /* renamed from: a */
    public final WindowInsets m65703a(WindowInsets windowInsets) {
        DB6 db6 = f56102w;
        if (db6.m110766x() != null) {
            return db6.m110766x();
        }
        return windowInsets.consumeSystemWindowInsets().consumeStableInsets();
    }

    /* renamed from: b */
    public final RecyclerView.InterfaceC11860q m65702b() {
        return new C12098d();
    }

    /* renamed from: c */
    public RecyclerView.AbstractC11843h m65701c() {
        return this.f56112k.getAdapter();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f56112k.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f56112k.canScrollVertically(i);
    }

    /* renamed from: d */
    public int m65700d() {
        return this.f56106e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f56123b;
            sparseArray.put(this.f56112k.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m65688p();
    }

    /* renamed from: e */
    public int m65699e() {
        return this.f56121t;
    }

    /* renamed from: f */
    public int m65698f() {
        return this.f56109h.m66744F2();
    }

    /* renamed from: g */
    public int m65697g() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f56112k;
        if (m65698f() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f56122u.mo65667a()) {
            return this.f56122u.mo65663g();
        }
        return super.getAccessibilityClassName();
    }

    /* renamed from: h */
    public int m65696h() {
        return this.f56114m.m65636f();
    }

    /* renamed from: i */
    public final void m65695i(Context context, AttributeSet attributeSet) {
        AbstractC12099e c12100f;
        if (f56101v) {
            c12100f = new C12104j();
        } else {
            c12100f = new C12100f();
        }
        this.f56122u = c12100f;
        C12110m c12110m = new C12110m(context);
        this.f56112k = c12110m;
        c12110m.setId(C38790bq6.m62473l());
        this.f56112k.setDescendantFocusability(DateUtils.FORMAT_NUMERIC_DATE);
        C12102h c12102h = new C12102h(context);
        this.f56109h = c12102h;
        this.f56112k.setLayoutManager(c12102h);
        this.f56112k.setScrollingTouchSlop(1);
        m65686r(context, attributeSet);
        this.f56112k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f56112k.addOnChildAttachStateChangeListener(m65702b());
        C12114c c12114c = new C12114c(this);
        this.f56114m = c12114c;
        this.f56116o = new C32865Fj1(this, c12114c, this.f56112k);
        C12109l c12109l = new C12109l();
        this.f56113l = c12109l;
        c12109l.m66132b(this.f56112k);
        this.f56112k.addOnScrollListener(this.f56114m);
        C12112a c12112a = new C12112a(3);
        this.f56115n = c12112a;
        this.f56114m.m65629m(c12112a);
        C12096b c12096b = new C12096b();
        C12097c c12097c = new C12097c();
        this.f56115n.m65646d(c12096b);
        this.f56115n.m65646d(c12097c);
        this.f56122u.mo65662h(this.f56115n, this.f56112k);
        this.f56115n.m65646d(this.f56105d);
        C12113b c12113b = new C12113b(this.f56109h);
        this.f56117p = c12113b;
        this.f56115n.m65646d(c12113b);
        RecyclerView recyclerView = this.f56112k;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: j */
    public boolean m65694j() {
        return this.f56116o.m106646a();
    }

    /* renamed from: k */
    public boolean m65693k() {
        return this.f56109h.m66572t0() == 1;
    }

    /* renamed from: l */
    public boolean m65692l() {
        return this.f56120s;
    }

    /* renamed from: m */
    public final void m65691m(RecyclerView.AbstractC11843h<?> abstractC11843h) {
        if (abstractC11843h != null) {
            abstractC11843h.registerAdapterDataObserver(this.f56108g);
        }
    }

    /* renamed from: n */
    public void m65690n(AbstractC12103i abstractC12103i) {
        this.f56105d.m65646d(abstractC12103i);
    }

    /* renamed from: o */
    public void m65689o() {
        this.f56117p.m65643d();
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets.isConsumed()) {
            return onApplyWindowInsets;
        }
        int childCount = this.f56112k.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f56112k.getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(onApplyWindowInsets));
        }
        return m65703a(windowInsets);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f56122u.mo65661i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f56112k.getMeasuredWidth();
        int measuredHeight = this.f56112k.getMeasuredHeight();
        this.f56103b.left = getPaddingLeft();
        this.f56103b.right = (i3 - i) - getPaddingRight();
        this.f56103b.top = getPaddingTop();
        this.f56103b.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f56103b, this.f56104c);
        RecyclerView recyclerView = this.f56112k;
        Rect rect = this.f56104c;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f56107f) {
            m65683u();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        measureChild(this.f56112k, i, i2);
        int measuredWidth = this.f56112k.getMeasuredWidth();
        int measuredHeight = this.f56112k.getMeasuredHeight();
        int measuredState = this.f56112k.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f56110i = savedState.f56124c;
        this.f56111j = savedState.f56125d;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f56123b = this.f56112k.getId();
        int i = this.f56110i;
        if (i == -1) {
            i = this.f56106e;
        }
        savedState.f56124c = i;
        Parcelable parcelable = this.f56111j;
        if (parcelable != null) {
            savedState.f56125d = parcelable;
        } else {
            RecyclerView.AbstractC11843h adapter = this.f56112k.getAdapter();
            if (adapter instanceof MP5) {
                savedState.f56125d = ((MP5) adapter).mo65726a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    /* renamed from: p */
    public final void m65688p() {
        RecyclerView.AbstractC11843h m65701c;
        if (this.f56110i == -1 || (m65701c = m65701c()) == null) {
            return;
        }
        Parcelable parcelable = this.f56111j;
        if (parcelable != null) {
            if (m65701c instanceof MP5) {
                ((MP5) m65701c).mo65725m(parcelable);
            }
            this.f56111j = null;
        }
        int max = Math.max(0, Math.min(this.f56110i, m65701c.getItemCount() - 1));
        this.f56106e = max;
        this.f56110i = -1;
        this.f56112k.scrollToPosition(max);
        this.f56122u.mo65658n();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f56122u.mo65666c(i, bundle)) {
            return this.f56122u.mo65659m(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    /* renamed from: q */
    public void m65687q(int i, boolean z) {
        int i2;
        RecyclerView.AbstractC11843h m65701c = m65701c();
        if (m65701c == null) {
            if (this.f56110i != -1) {
                this.f56110i = Math.max(i, 0);
            }
        } else if (m65701c.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), m65701c.getItemCount() - 1);
            if (min == this.f56106e && this.f56114m.m65634h()) {
                return;
            }
            int i3 = this.f56106e;
            if (min == i3 && z) {
                return;
            }
            double d = i3;
            this.f56106e = min;
            this.f56122u.mo65655r();
            if (!this.f56114m.m65634h()) {
                d = this.f56114m.m65637e();
            }
            this.f56114m.m65631k(min, z);
            if (!z) {
                this.f56112k.scrollToPosition(min);
                return;
            }
            double d2 = min;
            if (Math.abs(d2 - d) > 3.0d) {
                RecyclerView recyclerView = this.f56112k;
                if (d2 > d) {
                    i2 = min - 3;
                } else {
                    i2 = min + 3;
                }
                recyclerView.scrollToPosition(i2);
                RecyclerView recyclerView2 = this.f56112k;
                recyclerView2.post(new RunnableC12111n(min, recyclerView2));
                return;
            }
            this.f56112k.smoothScrollToPosition(min);
        }
    }

    /* renamed from: r */
    public final void m65686r(Context context, AttributeSet attributeSet) {
        int[] iArr = C33822Jl4.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(C33822Jl4.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    public final void m65685s(RecyclerView.AbstractC11843h<?> abstractC11843h) {
        if (abstractC11843h != null) {
            abstractC11843h.unregisterAdapterDataObserver(this.f56108g);
        }
    }

    public void setAdapter(RecyclerView.AbstractC11843h abstractC11843h) {
        RecyclerView.AbstractC11843h adapter = this.f56112k.getAdapter();
        this.f56122u.mo65664f(adapter);
        m65685s(adapter);
        this.f56112k.setAdapter(abstractC11843h);
        this.f56106e = 0;
        m65688p();
        this.f56122u.mo65665e(abstractC11843h);
        m65691m(abstractC11843h);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f56122u.mo65656q();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f56121t = i;
        this.f56112k.requestLayout();
    }

    public void setOrientation(int i) {
        this.f56109h.m66730T2(i);
        this.f56122u.mo65654s();
    }

    public void setPageTransformer(InterfaceC12108k interfaceC12108k) {
        if (interfaceC12108k != null) {
            if (!this.f56119r) {
                this.f56118q = this.f56112k.getItemAnimator();
                this.f56119r = true;
            }
            this.f56112k.setItemAnimator(null);
        } else if (this.f56119r) {
            this.f56112k.setItemAnimator(this.f56118q);
            this.f56118q = null;
            this.f56119r = false;
        }
        this.f56117p.m65643d();
        if (interfaceC12108k == null) {
            return;
        }
        this.f56117p.m65642e(interfaceC12108k);
        m65689o();
    }

    public void setUserInputEnabled(boolean z) {
        this.f56120s = z;
        this.f56122u.mo65653t();
    }

    /* renamed from: t */
    public void m65684t(AbstractC12103i abstractC12103i) {
        this.f56105d.m65645e(abstractC12103i);
    }

    /* renamed from: u */
    public void m65683u() {
        C11947r c11947r = this.f56113l;
        if (c11947r != null) {
            View mo65647g = c11947r.mo65647g(this.f56109h);
            if (mo65647g == null) {
                return;
            }
            int m66564x0 = this.f56109h.m66564x0(mo65647g);
            if (m66564x0 != this.f56106e && m65696h() == 0) {
                this.f56115n.mo224c(m66564x0);
            }
            this.f56107f = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C12094a();

        /* renamed from: b */
        public int f56123b;

        /* renamed from: c */
        public int f56124c;

        /* renamed from: d */
        public Parcelable f56125d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        /* loaded from: classes.dex */
        public class C12094a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m65682a(parcel, classLoader);
        }

        /* renamed from: a */
        public final void m65682a(Parcel parcel, ClassLoader classLoader) {
            this.f56123b = parcel.readInt();
            this.f56124c = parcel.readInt();
            this.f56125d = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f56123b);
            parcel.writeInt(this.f56124c);
            parcel.writeParcelable(this.f56125d, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCurrentItem(int i, boolean z) {
        if (!m65694j()) {
            m65687q(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56103b = new Rect();
        this.f56104c = new Rect();
        this.f56105d = new C12112a(3);
        this.f56107f = false;
        this.f56108g = new C12095a();
        this.f56110i = -1;
        this.f56118q = null;
        this.f56119r = false;
        this.f56120s = true;
        this.f56121t = -1;
        m65695i(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56103b = new Rect();
        this.f56104c = new Rect();
        this.f56105d = new C12112a(3);
        this.f56107f = false;
        this.f56108g = new C12095a();
        this.f56110i = -1;
        this.f56118q = null;
        this.f56119r = false;
        this.f56120s = true;
        this.f56121t = -1;
        m65695i(context, attributeSet);
    }
}
