package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC11944q;
import androidx.recyclerview.widget.C11939n;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.flexbox.C17467b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class FlexboxLayoutManager extends RecyclerView.AbstractC11855p implements InterfaceC36681Vr1, RecyclerView.AbstractC11869y.InterfaceC11871b {

    /* renamed from: Y */
    public static final Rect f70203Y = new Rect();

    /* renamed from: A */
    public List<C17466a> f70204A;

    /* renamed from: B */
    public final C17467b f70205B;

    /* renamed from: C */
    public RecyclerView.C11866v f70206C;

    /* renamed from: D */
    public RecyclerView.C11872z f70207D;

    /* renamed from: E */
    public C17465c f70208E;

    /* renamed from: F */
    public C17464b f70209F;

    /* renamed from: G */
    public AbstractC11944q f70210G;

    /* renamed from: H */
    public AbstractC11944q f70211H;

    /* renamed from: I */
    public SavedState f70212I;

    /* renamed from: J */
    public int f70213J;

    /* renamed from: K */
    public int f70214K;

    /* renamed from: P */
    public int f70215P;

    /* renamed from: Q */
    public int f70216Q;

    /* renamed from: R */
    public boolean f70217R;

    /* renamed from: S */
    public SparseArray<View> f70218S;

    /* renamed from: T */
    public final Context f70219T;

    /* renamed from: U */
    public View f70220U;

    /* renamed from: W */
    public int f70221W;

    /* renamed from: X */
    public C17467b.C17469b f70222X;

    /* renamed from: t */
    public int f70223t;

    /* renamed from: u */
    public int f70224u;

    /* renamed from: v */
    public int f70225v;

    /* renamed from: w */
    public int f70226w;

    /* renamed from: x */
    public int f70227x;

    /* renamed from: y */
    public boolean f70228y;

    /* renamed from: z */
    public boolean f70229z;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    /* loaded from: classes5.dex */
    public class C17464b {

        /* renamed from: a */
        public int f70241a;

        /* renamed from: b */
        public int f70242b;

        /* renamed from: c */
        public int f70243c;

        /* renamed from: d */
        public int f70244d;

        /* renamed from: e */
        public boolean f70245e;

        /* renamed from: f */
        public boolean f70246f;

        /* renamed from: g */
        public boolean f70247g;

        public C17464b() {
            this.f70244d = 0;
        }

        /* renamed from: l */
        public static /* synthetic */ int m51741l(C17464b c17464b, int i) {
            int i2 = c17464b.f70244d + i;
            c17464b.f70244d = i2;
            return i2;
        }

        /* renamed from: r */
        public final void m51735r() {
            int mo66152m;
            int m66642E0;
            if (!FlexboxLayoutManager.this.mo51785u() && FlexboxLayoutManager.this.f70228y) {
                if (this.f70245e) {
                    m66642E0 = FlexboxLayoutManager.this.f70210G.mo66156i();
                } else {
                    m66642E0 = FlexboxLayoutManager.this.m66642E0() - FlexboxLayoutManager.this.f70210G.mo66152m();
                }
                this.f70243c = m66642E0;
                return;
            }
            if (this.f70245e) {
                mo66152m = FlexboxLayoutManager.this.f70210G.mo66156i();
            } else {
                mo66152m = FlexboxLayoutManager.this.f70210G.mo66152m();
            }
            this.f70243c = mo66152m;
        }

        /* renamed from: s */
        public final void m51734s(View view) {
            AbstractC11944q abstractC11944q;
            if (FlexboxLayoutManager.this.f70224u == 0) {
                abstractC11944q = FlexboxLayoutManager.this.f70211H;
            } else {
                abstractC11944q = FlexboxLayoutManager.this.f70210G;
            }
            if (!FlexboxLayoutManager.this.mo51785u() && FlexboxLayoutManager.this.f70228y) {
                if (this.f70245e) {
                    this.f70243c = abstractC11944q.mo66158g(view) + abstractC11944q.m66163o();
                } else {
                    this.f70243c = abstractC11944q.mo66161d(view);
                }
            } else if (this.f70245e) {
                this.f70243c = abstractC11944q.mo66161d(view) + abstractC11944q.m66163o();
            } else {
                this.f70243c = abstractC11944q.mo66158g(view);
            }
            this.f70241a = FlexboxLayoutManager.this.m66564x0(view);
            int i = 0;
            this.f70247g = false;
            int[] iArr = FlexboxLayoutManager.this.f70205B.f70279c;
            int i2 = this.f70241a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f70242b = i;
            if (FlexboxLayoutManager.this.f70204A.size() > this.f70242b) {
                this.f70241a = ((C17466a) FlexboxLayoutManager.this.f70204A.get(this.f70242b)).f70273o;
            }
        }

        /* renamed from: t */
        public final void m51733t() {
            this.f70241a = -1;
            this.f70242b = -1;
            this.f70243c = Integer.MIN_VALUE;
            boolean z = false;
            this.f70246f = false;
            this.f70247g = false;
            if (FlexboxLayoutManager.this.mo51785u()) {
                if (FlexboxLayoutManager.this.f70224u == 0) {
                    if (FlexboxLayoutManager.this.f70223t == 1) {
                        z = true;
                    }
                    this.f70245e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f70224u == 2) {
                    z = true;
                }
                this.f70245e = z;
            } else if (FlexboxLayoutManager.this.f70224u == 0) {
                if (FlexboxLayoutManager.this.f70223t == 3) {
                    z = true;
                }
                this.f70245e = z;
            } else {
                if (FlexboxLayoutManager.this.f70224u == 2) {
                    z = true;
                }
                this.f70245e = z;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f70241a + ", mFlexLinePosition=" + this.f70242b + ", mCoordinate=" + this.f70243c + ", mPerpendicularCoordinate=" + this.f70244d + ", mLayoutFromEnd=" + this.f70245e + ", mValid=" + this.f70246f + ", mAssignedFromSavedState=" + this.f70247g + CoreConstants.CURLY_RIGHT;
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    /* loaded from: classes5.dex */
    public static class C17465c {

        /* renamed from: a */
        public int f70249a;

        /* renamed from: b */
        public boolean f70250b;

        /* renamed from: c */
        public int f70251c;

        /* renamed from: d */
        public int f70252d;

        /* renamed from: e */
        public int f70253e;

        /* renamed from: f */
        public int f70254f;

        /* renamed from: g */
        public int f70255g;

        /* renamed from: h */
        public int f70256h;

        /* renamed from: i */
        public int f70257i;

        /* renamed from: j */
        public boolean f70258j;

        private C17465c() {
            this.f70256h = 1;
            this.f70257i = 1;
        }

        /* renamed from: c */
        public static /* synthetic */ int m51726c(C17465c c17465c, int i) {
            int i2 = c17465c.f70253e + i;
            c17465c.f70253e = i2;
            return i2;
        }

        /* renamed from: d */
        public static /* synthetic */ int m51725d(C17465c c17465c, int i) {
            int i2 = c17465c.f70253e - i;
            c17465c.f70253e = i2;
            return i2;
        }

        /* renamed from: i */
        public static /* synthetic */ int m51720i(C17465c c17465c, int i) {
            int i2 = c17465c.f70249a - i;
            c17465c.f70249a = i2;
            return i2;
        }

        /* renamed from: l */
        public static /* synthetic */ int m51717l(C17465c c17465c) {
            int i = c17465c.f70251c;
            c17465c.f70251c = i + 1;
            return i;
        }

        /* renamed from: m */
        public static /* synthetic */ int m51716m(C17465c c17465c) {
            int i = c17465c.f70251c;
            c17465c.f70251c = i - 1;
            return i;
        }

        /* renamed from: n */
        public static /* synthetic */ int m51715n(C17465c c17465c, int i) {
            int i2 = c17465c.f70251c + i;
            c17465c.f70251c = i2;
            return i2;
        }

        /* renamed from: q */
        public static /* synthetic */ int m51712q(C17465c c17465c, int i) {
            int i2 = c17465c.f70254f + i;
            c17465c.f70254f = i2;
            return i2;
        }

        /* renamed from: u */
        public static /* synthetic */ int m51708u(C17465c c17465c, int i) {
            int i2 = c17465c.f70252d + i;
            c17465c.f70252d = i2;
            return i2;
        }

        /* renamed from: v */
        public static /* synthetic */ int m51707v(C17465c c17465c, int i) {
            int i2 = c17465c.f70252d - i;
            c17465c.f70252d = i2;
            return i2;
        }

        /* renamed from: D */
        public final boolean m51729D(RecyclerView.C11872z c11872z, List<C17466a> list) {
            int i;
            int i2 = this.f70252d;
            if (i2 >= 0 && i2 < c11872z.m66490b() && (i = this.f70251c) >= 0 && i < list.size()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f70249a + ", mFlexLinePosition=" + this.f70251c + ", mPosition=" + this.f70252d + ", mOffset=" + this.f70253e + ", mScrollingOffset=" + this.f70254f + ", mLastScrollDelta=" + this.f70255g + ", mItemDirection=" + this.f70256h + ", mLayoutDirection=" + this.f70257i + CoreConstants.CURLY_RIGHT;
        }
    }

    public FlexboxLayoutManager(Context context, int i) {
        this(context, i, 1);
    }

    /* renamed from: N0 */
    public static boolean m51863N0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: X1 */
    private boolean m51844X1(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (!view.isLayoutRequested() && m66626M0() && m51863N0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m51863N0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return false;
        }
        return true;
    }

    /* renamed from: A2 */
    public final View m51884A2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View m66597c0 = m66597c0(i);
            if (m51859O2(m66597c0, z)) {
                return m66597c0;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: B2 */
    public final View m51883B2(int i, int i2, int i3) {
        int i4;
        int m66564x0;
        m51789s2();
        m51791r2();
        int mo66152m = this.f70210G.mo66152m();
        int mo66156i = this.f70210G.mo66156i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m66597c0 = m66597c0(i);
            if (m66597c0 != null && (m66564x0 = m66564x0(m66597c0)) >= 0 && m66564x0 < i3) {
                if (((RecyclerView.LayoutParams) m66597c0.getLayoutParams()).m66674c()) {
                    if (view2 == null) {
                        view2 = m66597c0;
                    }
                } else if (this.f70210G.mo66158g(m66597c0) >= mo66152m && this.f70210G.mo66161d(m66597c0) <= mo66156i) {
                    return m66597c0;
                } else {
                    if (view == null) {
                        view = m66597c0;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* renamed from: C2 */
    public final int m51882C2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        boolean z2;
        int i2;
        int mo66156i;
        if (!mo51785u() && this.f70228y) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int mo66152m = i - this.f70210G.mo66152m();
            if (mo66152m <= 0) {
                return 0;
            }
            i2 = m51867L2(mo66152m, c11866v, c11872z);
        } else {
            int mo66156i2 = this.f70210G.mo66156i() - i;
            if (mo66156i2 <= 0) {
                return 0;
            }
            i2 = -m51867L2(-mo66156i2, c11866v, c11872z);
        }
        int i3 = i + i2;
        if (z && (mo66156i = this.f70210G.mo66156i() - i3) > 0) {
            this.f70210G.mo66148r(mo66156i);
            return mo66156i + i2;
        }
        return i2;
    }

    /* renamed from: D2 */
    public final int m51881D2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        int i2;
        int mo66152m;
        if (!mo51785u() && this.f70228y) {
            int mo66156i = this.f70210G.mo66156i() - i;
            if (mo66156i <= 0) {
                return 0;
            }
            i2 = m51867L2(-mo66156i, c11866v, c11872z);
        } else {
            int mo66152m2 = i - this.f70210G.mo66152m();
            if (mo66152m2 <= 0) {
                return 0;
            }
            i2 = -m51867L2(mo66152m2, c11866v, c11872z);
        }
        int i3 = i + i2;
        if (z && (mo66152m = i3 - this.f70210G.mo66152m()) > 0) {
            this.f70210G.mo66148r(-mo66152m);
            return i2 - mo66152m;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: E */
    public boolean mo51880E() {
        int i;
        if (this.f70224u == 0) {
            return mo51785u();
        }
        if (mo51785u()) {
            int m66642E0 = m66642E0();
            View view = this.f70220U;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (m66642E0 <= i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: E2 */
    public final int m51879E2(View view) {
        return m66586i0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: F */
    public boolean mo51878F() {
        int i;
        if (this.f70224u == 0) {
            return !mo51785u();
        }
        if (mo51785u()) {
            return true;
        }
        int m66578q0 = m66578q0();
        View view = this.f70220U;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (m66578q0 > i) {
            return true;
        }
        return false;
    }

    /* renamed from: F2 */
    public final View m51877F2() {
        return m66597c0(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: G */
    public boolean mo51876G(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: G2 */
    public final int m51875G2(View view) {
        return m66584k0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    /* renamed from: H2 */
    public final int m51874H2(View view) {
        return m66581n0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: I0 */
    public boolean mo51873I0() {
        return true;
    }

    /* renamed from: I2 */
    public final int m51872I2(View view) {
        return m66580o0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    /* renamed from: J2 */
    public List<C17466a> m51871J2() {
        ArrayList arrayList = new ArrayList(this.f70204A.size());
        int size = this.f70204A.size();
        for (int i = 0; i < size; i++) {
            C17466a c17466a = this.f70204A.get(i);
            if (c17466a.m51701b() != 0) {
                arrayList.add(c17466a);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: K */
    public int mo51870K(RecyclerView.C11872z c11872z) {
        return m51797o2(c11872z);
    }

    /* renamed from: K2 */
    public int m51869K2(int i) {
        return this.f70205B.f70279c[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: L */
    public int mo51868L(RecyclerView.C11872z c11872z) {
        return m51794p2(c11872z);
    }

    /* renamed from: L2 */
    public final int m51867L2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        boolean z;
        if (m66594d0() == 0 || i == 0) {
            return 0;
        }
        m51789s2();
        int i2 = 1;
        this.f70208E.f70258j = true;
        if (!mo51785u() && this.f70228y) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m51821g3(i2, abs);
        int m51786t2 = this.f70208E.f70254f + m51786t2(c11866v, c11872z, this.f70208E);
        if (m51786t2 < 0) {
            return 0;
        }
        if (z) {
            if (abs > m51786t2) {
                i = (-i2) * m51786t2;
            }
        } else if (abs > m51786t2) {
            i = i2 * m51786t2;
        }
        this.f70210G.mo66148r(-i);
        this.f70208E.f70255g = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: M */
    public int mo51866M(RecyclerView.C11872z c11872z) {
        return m51793q2(c11872z);
    }

    /* renamed from: M2 */
    public final int m51865M2(int i) {
        int height;
        int m66578q0;
        int i2;
        boolean z = false;
        if (m66594d0() == 0 || i == 0) {
            return 0;
        }
        m51789s2();
        boolean mo51785u = mo51785u();
        View view = this.f70220U;
        if (mo51785u) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        if (mo51785u) {
            m66578q0 = m66642E0();
        } else {
            m66578q0 = m66578q0();
        }
        if (m66572t0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((m66578q0 + this.f70209F.f70244d) - height, abs);
            } else if (this.f70209F.f70244d + i > 0) {
                i2 = this.f70209F.f70244d;
            } else {
                return i;
            }
        } else if (i > 0) {
            return Math.min((m66578q0 - this.f70209F.f70244d) - height, i);
        } else {
            if (this.f70209F.f70244d + i < 0) {
                i2 = this.f70209F.f70244d;
            } else {
                return i;
            }
        }
        return -i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: N */
    public int mo51864N(RecyclerView.C11872z c11872z) {
        return m51797o2(c11872z);
    }

    /* renamed from: N2 */
    public boolean m51862N2() {
        return this.f70228y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: O */
    public int mo51861O(RecyclerView.C11872z c11872z) {
        return m51794p2(c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: O1 */
    public int mo51860O1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (mo51785u() && this.f70224u != 0) {
            int m51865M2 = m51865M2(i);
            C17464b.m51741l(this.f70209F, m51865M2);
            this.f70211H.mo66148r(-m51865M2);
            return m51865M2;
        }
        int m51867L2 = m51867L2(i, c11866v, c11872z);
        this.f70218S.clear();
        return m51867L2;
    }

    /* renamed from: O2 */
    public final boolean m51859O2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int m66642E0 = m66642E0() - getPaddingRight();
        int m66578q0 = m66578q0() - getPaddingBottom();
        int m51875G2 = m51875G2(view);
        int m51872I2 = m51872I2(view);
        int m51874H2 = m51874H2(view);
        int m51879E2 = m51879E2(view);
        if (paddingLeft <= m51875G2 && m66642E0 >= m51874H2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m51875G2 < m66642E0 && m51874H2 < paddingLeft) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (paddingTop <= m51872I2 && m66578q0 >= m51879E2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (m51872I2 < m66578q0 && m51879E2 < paddingTop) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z) {
            if (z2 && z4) {
                return true;
            }
            return false;
        } else if (z3 && z5) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: P */
    public int mo51858P(RecyclerView.C11872z c11872z) {
        return m51793q2(c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: P1 */
    public void mo51857P1(int i) {
        this.f70213J = i;
        this.f70214K = Integer.MIN_VALUE;
        SavedState savedState = this.f70212I;
        if (savedState != null) {
            savedState.m51755i();
        }
        m66627L1();
    }

    /* renamed from: P2 */
    public final int m51856P2(C17466a c17466a, C17465c c17465c) {
        if (mo51785u()) {
            return m51854Q2(c17466a, c17465c);
        }
        return m51853R2(c17466a, c17465c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Q1 */
    public int mo51855Q1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (!mo51785u() && (this.f70224u != 0 || mo51785u())) {
            int m51865M2 = m51865M2(i);
            C17464b.m51741l(this.f70209F, m51865M2);
            this.f70211H.mo66148r(-m51865M2);
            return m51865M2;
        }
        int m51867L2 = m51867L2(i, c11866v, c11872z);
        this.f70218S.clear();
        return m51867L2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* renamed from: Q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m51854Q2(C17466a c17466a, C17465c c17465c) {
        float f;
        float f2;
        float f3;
        int m51701b;
        int i;
        LayoutParams layoutParams;
        float f4;
        int i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int m66642E0 = m66642E0();
        int i3 = c17465c.f70253e;
        if (c17465c.f70257i == -1) {
            i3 -= c17466a.f70265g;
        }
        int i4 = i3;
        int i5 = c17465c.f70252d;
        int i6 = this.f70225v;
        int i7 = 1;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 == 5) {
                                if (c17466a.f70266h != 0) {
                                    f3 = (m66642E0 - c17466a.f70263e) / (i2 + 1);
                                } else {
                                    f3 = 0.0f;
                                }
                                f = paddingLeft + f3;
                                f2 = (m66642E0 - paddingRight) - f3;
                            } else {
                                throw new IllegalStateException("Invalid justifyContent is set: " + this.f70225v);
                            }
                        } else {
                            int i8 = c17466a.f70266h;
                            if (i8 != 0) {
                                f3 = (m66642E0 - c17466a.f70263e) / i8;
                            } else {
                                f3 = 0.0f;
                            }
                            float f5 = f3 / 2.0f;
                            f = paddingLeft + f5;
                            f2 = (m66642E0 - paddingRight) - f5;
                        }
                    } else {
                        f = paddingLeft;
                        int i9 = c17466a.f70266h;
                        if (i9 != 1) {
                            f4 = i9 - 1;
                        } else {
                            f4 = 1.0f;
                        }
                        f3 = (m66642E0 - c17466a.f70263e) / f4;
                        f2 = m66642E0 - paddingRight;
                    }
                } else {
                    int i10 = c17466a.f70263e;
                    f = paddingLeft + ((m66642E0 - i10) / 2.0f);
                    f2 = (m66642E0 - paddingRight) - ((m66642E0 - i10) / 2.0f);
                }
            } else {
                int i11 = c17466a.f70263e;
                f3 = 0.0f;
                f2 = i11 - paddingLeft;
                f = (m66642E0 - i11) + paddingRight;
            }
            float f6 = f - this.f70209F.f70244d;
            float f7 = f2 - this.f70209F.f70244d;
            float max = Math.max(f3, 0.0f);
            m51701b = c17466a.m51701b();
            int i12 = 0;
            i = i5;
            while (i < i5 + m51701b) {
                View mo51829e = mo51829e(i);
                if (mo51829e != null) {
                    if (c17465c.f70257i == i7) {
                        m66645D(mo51829e, f70203Y);
                        m66565x(mo51829e);
                    } else {
                        m66645D(mo51829e, f70203Y);
                        m66562y(mo51829e, i12);
                        i12++;
                    }
                    int i13 = i12;
                    C17467b c17467b = this.f70205B;
                    long j = c17467b.f70280d[i];
                    int m51648y = c17467b.m51648y(j);
                    int m51649x = this.f70205B.m51649x(j);
                    LayoutParams layoutParams2 = (LayoutParams) mo51829e.getLayoutParams();
                    if (m51844X1(mo51829e, m51648y, m51649x, layoutParams2)) {
                        mo51829e.measure(m51648y, m51649x);
                    }
                    float m66571u0 = f6 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + m66571u0(mo51829e);
                    float m66559z0 = f7 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + m66559z0(mo51829e));
                    int m66647C0 = i4 + m66647C0(mo51829e);
                    if (this.f70228y) {
                        layoutParams = layoutParams2;
                        this.f70205B.m51682Q(mo51829e, c17466a, Math.round(m66559z0) - mo51829e.getMeasuredWidth(), m66647C0, Math.round(m66559z0), m66647C0 + mo51829e.getMeasuredHeight());
                    } else {
                        layoutParams = layoutParams2;
                        this.f70205B.m51682Q(mo51829e, c17466a, Math.round(m66571u0), m66647C0, Math.round(m66571u0) + mo51829e.getMeasuredWidth(), m66647C0 + mo51829e.getMeasuredHeight());
                    }
                    i12 = i13;
                    f6 = m66571u0 + mo51829e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + m66559z0(mo51829e) + max;
                    f7 = m66559z0 - (((mo51829e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + m66571u0(mo51829e)) + max);
                }
                i++;
                i7 = 1;
            }
            C17465c.m51715n(c17465c, this.f70208E.f70257i);
            return c17466a.m51702a();
        }
        f = paddingLeft;
        f2 = m66642E0 - paddingRight;
        f3 = 0.0f;
        float f62 = f - this.f70209F.f70244d;
        float f72 = f2 - this.f70209F.f70244d;
        float max2 = Math.max(f3, 0.0f);
        m51701b = c17466a.m51701b();
        int i122 = 0;
        i = i5;
        while (i < i5 + m51701b) {
        }
        C17465c.m51715n(c17465c, this.f70208E.f70257i);
        return c17466a.m51702a();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* renamed from: R2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m51853R2(C17466a c17466a, C17465c c17465c) {
        float f;
        float f2;
        float f3;
        int m51701b;
        int i;
        float f4;
        LayoutParams layoutParams;
        boolean z;
        View view;
        int i2;
        float f5;
        int i3;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int m66578q0 = m66578q0();
        int i4 = c17465c.f70253e;
        int i5 = c17465c.f70253e;
        if (c17465c.f70257i == -1) {
            int i6 = c17466a.f70265g;
            i4 -= i6;
            i5 += i6;
        }
        int i7 = i4;
        int i8 = i5;
        int i9 = c17465c.f70252d;
        int i10 = this.f70225v;
        boolean z2 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                if (c17466a.f70266h != 0) {
                                    f3 = (m66578q0 - c17466a.f70263e) / (i3 + 1);
                                } else {
                                    f3 = 0.0f;
                                }
                                f = paddingTop + f3;
                                f2 = (m66578q0 - paddingBottom) - f3;
                            } else {
                                throw new IllegalStateException("Invalid justifyContent is set: " + this.f70225v);
                            }
                        } else {
                            int i11 = c17466a.f70266h;
                            if (i11 != 0) {
                                f3 = (m66578q0 - c17466a.f70263e) / i11;
                            } else {
                                f3 = 0.0f;
                            }
                            float f6 = f3 / 2.0f;
                            f = paddingTop + f6;
                            f2 = (m66578q0 - paddingBottom) - f6;
                        }
                    } else {
                        f = paddingTop;
                        int i12 = c17466a.f70266h;
                        if (i12 != 1) {
                            f5 = i12 - 1;
                        } else {
                            f5 = 1.0f;
                        }
                        f3 = (m66578q0 - c17466a.f70263e) / f5;
                        f2 = m66578q0 - paddingBottom;
                    }
                } else {
                    int i13 = c17466a.f70263e;
                    f = paddingTop + ((m66578q0 - i13) / 2.0f);
                    f2 = (m66578q0 - paddingBottom) - ((m66578q0 - i13) / 2.0f);
                }
            } else {
                int i14 = c17466a.f70263e;
                f3 = 0.0f;
                f2 = i14 - paddingTop;
                f = (m66578q0 - i14) + paddingBottom;
            }
            float f7 = f - this.f70209F.f70244d;
            float f8 = f2 - this.f70209F.f70244d;
            float max = Math.max(f3, 0.0f);
            m51701b = c17466a.m51701b();
            int i15 = 0;
            i = i9;
            while (i < i9 + m51701b) {
                View mo51829e = mo51829e(i);
                if (mo51829e == null) {
                    i2 = i;
                    z = z2;
                    f4 = max;
                } else {
                    C17467b c17467b = this.f70205B;
                    f4 = max;
                    long j = c17467b.f70280d[i];
                    int m51648y = c17467b.m51648y(j);
                    int m51649x = this.f70205B.m51649x(j);
                    if (m51844X1(mo51829e, m51648y, m51649x, (LayoutParams) mo51829e.getLayoutParams())) {
                        mo51829e.measure(m51648y, m51649x);
                    }
                    float m66647C0 = f7 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + m66647C0(mo51829e);
                    float m66599b0 = f8 - (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + m66599b0(mo51829e));
                    if (c17465c.f70257i == 1) {
                        m66645D(mo51829e, f70203Y);
                        m66565x(mo51829e);
                    } else {
                        m66645D(mo51829e, f70203Y);
                        m66562y(mo51829e, i15);
                        i15++;
                    }
                    int i16 = i15;
                    int m66571u0 = i7 + m66571u0(mo51829e);
                    int m66559z0 = i8 - m66559z0(mo51829e);
                    boolean z3 = this.f70228y;
                    if (z3) {
                        if (this.f70229z) {
                            z = true;
                            view = mo51829e;
                            i2 = i;
                            this.f70205B.m51681R(mo51829e, c17466a, z3, m66559z0 - mo51829e.getMeasuredWidth(), Math.round(m66599b0) - mo51829e.getMeasuredHeight(), m66559z0, Math.round(m66599b0));
                        } else {
                            z = true;
                            view = mo51829e;
                            i2 = i;
                            this.f70205B.m51681R(view, c17466a, z3, m66559z0 - view.getMeasuredWidth(), Math.round(m66647C0), m66559z0, Math.round(m66647C0) + view.getMeasuredHeight());
                        }
                    } else {
                        z = true;
                        view = mo51829e;
                        i2 = i;
                        if (this.f70229z) {
                            this.f70205B.m51681R(view, c17466a, z3, m66571u0, Math.round(m66599b0) - view.getMeasuredHeight(), m66571u0 + view.getMeasuredWidth(), Math.round(m66599b0));
                        } else {
                            this.f70205B.m51681R(view, c17466a, z3, m66571u0, Math.round(m66647C0), m66571u0 + view.getMeasuredWidth(), Math.round(m66647C0) + view.getMeasuredHeight());
                        }
                    }
                    View view2 = view;
                    f7 = m66647C0 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + m66599b0(view2) + f4;
                    i15 = i16;
                    f8 = m66599b0 - (((view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + m66647C0(view2)) + f4);
                }
                i = i2 + 1;
                max = f4;
                z2 = z;
            }
            C17465c.m51715n(c17465c, this.f70208E.f70257i);
            return c17466a.m51702a();
        }
        f = paddingTop;
        f2 = m66578q0 - paddingBottom;
        f3 = 0.0f;
        float f72 = f - this.f70209F.f70244d;
        float f82 = f2 - this.f70209F.f70244d;
        float max2 = Math.max(f3, 0.0f);
        m51701b = c17466a.m51701b();
        int i152 = 0;
        i = i9;
        while (i < i9 + m51701b) {
        }
        C17465c.m51715n(c17465c, this.f70208E.f70257i);
        return c17466a.m51702a();
    }

    /* renamed from: S2 */
    public final void m51852S2(RecyclerView.C11866v c11866v, C17465c c17465c) {
        if (!c17465c.f70258j) {
            return;
        }
        if (c17465c.f70257i == -1) {
            m51850U2(c11866v, c17465c);
        } else {
            m51848V2(c11866v, c17465c);
        }
    }

    /* renamed from: T2 */
    public final void m51851T2(RecyclerView.C11866v c11866v, int i, int i2) {
        while (i2 >= i) {
            m66639F1(i2, c11866v);
            i2--;
        }
    }

    /* renamed from: U2 */
    public final void m51850U2(RecyclerView.C11866v c11866v, C17465c c17465c) {
        int m66594d0;
        int i;
        View m66597c0;
        int i2;
        if (c17465c.f70254f < 0 || (m66594d0 = m66594d0()) == 0 || (m66597c0 = m66597c0(m66594d0 - 1)) == null || (i2 = this.f70205B.f70279c[m66564x0(m66597c0)]) == -1) {
            return;
        }
        C17466a c17466a = this.f70204A.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View m66597c02 = m66597c0(i3);
            if (m66597c02 != null) {
                if (!m51806l2(m66597c02, c17465c.f70254f)) {
                    break;
                } else if (c17466a.f70273o != m66564x0(m66597c02)) {
                    continue;
                } else if (i2 <= 0) {
                    m66594d0 = i3;
                    break;
                } else {
                    i2 += c17465c.f70257i;
                    c17466a = this.f70204A.get(i2);
                    m66594d0 = i3;
                }
            }
            i3--;
        }
        m51851T2(c11866v, m66594d0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: V0 */
    public void mo51849V0(RecyclerView.AbstractC11843h abstractC11843h, RecyclerView.AbstractC11843h abstractC11843h2) {
        m66649B1();
    }

    /* renamed from: V2 */
    public final void m51848V2(RecyclerView.C11866v c11866v, C17465c c17465c) {
        int m66594d0;
        View m66597c0;
        if (c17465c.f70254f < 0 || (m66594d0 = m66594d0()) == 0 || (m66597c0 = m66597c0(0)) == null) {
            return;
        }
        int i = this.f70205B.f70279c[m66564x0(m66597c0)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        C17466a c17466a = this.f70204A.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= m66594d0) {
                break;
            }
            View m66597c02 = m66597c0(i3);
            if (m66597c02 != null) {
                if (!m51803m2(m66597c02, c17465c.f70254f)) {
                    break;
                } else if (c17466a.f70274p != m66564x0(m66597c02)) {
                    continue;
                } else if (i >= this.f70204A.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += c17465c.f70257i;
                    c17466a = this.f70204A.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        m51851T2(c11866v, 0, i2);
    }

    /* renamed from: W2 */
    public final void m51847W2() {
        int m66640F0;
        boolean z;
        if (mo51785u()) {
            m66640F0 = m66576r0();
        } else {
            m66640F0 = m66640F0();
        }
        C17465c c17465c = this.f70208E;
        if (m66640F0 != 0 && m66640F0 != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        c17465c.f70250b = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: X */
    public RecyclerView.LayoutParams mo51846X() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: X0 */
    public void mo51845X0(RecyclerView recyclerView) {
        super.mo51845X0(recyclerView);
        this.f70220U = (View) recyclerView.getParent();
    }

    /* renamed from: X2 */
    public final void m51843X2() {
        boolean z;
        boolean z2;
        boolean z3;
        int m66572t0 = m66572t0();
        int i = this.f70223t;
        boolean z4 = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f70228y = false;
                        this.f70229z = false;
                        return;
                    }
                    if (m66572t0 == 1) {
                        z4 = true;
                    }
                    this.f70228y = z4;
                    if (this.f70224u == 2) {
                        this.f70228y = !z4;
                    }
                    this.f70229z = true;
                    return;
                }
                if (m66572t0 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f70228y = z3;
                if (this.f70224u == 2) {
                    this.f70228y = !z3;
                }
                this.f70229z = false;
                return;
            }
            if (m66572t0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f70228y = z2;
            if (this.f70224u == 2) {
                z4 = true;
            }
            this.f70229z = z4;
            return;
        }
        if (m66572t0 == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f70228y = z;
        if (this.f70224u == 2) {
            z4 = true;
        }
        this.f70229z = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Y */
    public RecyclerView.LayoutParams mo51842Y(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: Y2 */
    public void m51841Y2(int i) {
        int i2 = this.f70226w;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                m66649B1();
                m51800n2();
            }
            this.f70226w = i;
            m66627L1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Z0 */
    public void mo51840Z0(RecyclerView recyclerView, RecyclerView.C11866v c11866v) {
        super.mo51840Z0(recyclerView, c11866v);
        if (this.f70217R) {
            m66646C1(c11866v);
            c11866v.m66522c();
        }
    }

    /* renamed from: Z2 */
    public void m51839Z2(int i) {
        if (this.f70223t != i) {
            m66649B1();
            this.f70223t = i;
            this.f70210G = null;
            this.f70211H = null;
            m51800n2();
            m66627L1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11869y.InterfaceC11871b
    /* renamed from: a */
    public PointF mo51838a(int i) {
        View m66597c0;
        int i2;
        if (m66594d0() == 0 || (m66597c0 = m66597c0(0)) == null) {
            return null;
        }
        if (i < m66564x0(m66597c0)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo51785u()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: a2 */
    public void mo51837a2(RecyclerView recyclerView, RecyclerView.C11872z c11872z, int i) {
        C11939n c11939n = new C11939n(recyclerView.getContext());
        c11939n.setTargetPosition(i);
        m66598b2(c11939n);
    }

    /* renamed from: a3 */
    public void m51836a3(int i) {
        if (i != 2) {
            int i2 = this.f70224u;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    m66649B1();
                    m51800n2();
                }
                this.f70224u = i;
                this.f70210G = null;
                this.f70211H = null;
                m66627L1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: b */
    public void mo51835b(View view, int i, int i2, C17466a c17466a) {
        m66645D(view, f70203Y);
        if (mo51785u()) {
            int m66571u0 = m66571u0(view) + m66559z0(view);
            c17466a.f70263e += m66571u0;
            c17466a.f70264f += m66571u0;
            return;
        }
        int m66647C0 = m66647C0(view) + m66599b0(view);
        c17466a.f70263e += m66647C0;
        c17466a.f70264f += m66647C0;
    }

    /* renamed from: b3 */
    public final boolean m51834b3(RecyclerView.C11872z c11872z, C17464b c17464b) {
        View m51783u2;
        int mo66152m;
        boolean z = false;
        if (m66594d0() == 0) {
            return false;
        }
        if (c17464b.f70245e) {
            m51783u2 = m51780x2(c11872z.m66490b());
        } else {
            m51783u2 = m51783u2(c11872z.m66490b());
        }
        if (m51783u2 == null) {
            return false;
        }
        c17464b.m51734s(m51783u2);
        if (!c11872z.m66487e() && mo66447d2()) {
            if (this.f70210G.mo66158g(m51783u2) >= this.f70210G.mo66156i() || this.f70210G.mo66161d(m51783u2) < this.f70210G.mo66152m()) {
                z = true;
            }
            if (z) {
                if (c17464b.f70245e) {
                    mo66152m = this.f70210G.mo66156i();
                } else {
                    mo66152m = this.f70210G.mo66152m();
                }
                c17464b.f70243c = mo66152m;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: c */
    public int mo51833c() {
        return this.f70223t;
    }

    /* renamed from: c3 */
    public final boolean m51832c3(RecyclerView.C11872z c11872z, C17464b c17464b, SavedState savedState) {
        int i;
        View m66597c0;
        int mo66158g;
        boolean z = false;
        if (!c11872z.m66487e() && (i = this.f70213J) != -1) {
            if (i >= 0 && i < c11872z.m66490b()) {
                c17464b.f70241a = this.f70213J;
                c17464b.f70242b = this.f70205B.f70279c[c17464b.f70241a];
                SavedState savedState2 = this.f70212I;
                if (savedState2 != null && savedState2.m51756h(c11872z.m66490b())) {
                    c17464b.f70243c = this.f70210G.mo66152m() + savedState.f70240c;
                    c17464b.f70247g = true;
                    c17464b.f70242b = -1;
                    return true;
                } else if (this.f70214K == Integer.MIN_VALUE) {
                    View mo66607W = mo66607W(this.f70213J);
                    if (mo66607W != null) {
                        if (this.f70210G.mo66160e(mo66607W) > this.f70210G.mo66151n()) {
                            c17464b.m51735r();
                            return true;
                        } else if (this.f70210G.mo66158g(mo66607W) - this.f70210G.mo66152m() < 0) {
                            c17464b.f70243c = this.f70210G.mo66152m();
                            c17464b.f70245e = false;
                            return true;
                        } else if (this.f70210G.mo66156i() - this.f70210G.mo66161d(mo66607W) < 0) {
                            c17464b.f70243c = this.f70210G.mo66156i();
                            c17464b.f70245e = true;
                            return true;
                        } else {
                            if (c17464b.f70245e) {
                                mo66158g = this.f70210G.mo66161d(mo66607W) + this.f70210G.m66163o();
                            } else {
                                mo66158g = this.f70210G.mo66158g(mo66607W);
                            }
                            c17464b.f70243c = mo66158g;
                        }
                    } else {
                        if (m66594d0() > 0 && (m66597c0 = m66597c0(0)) != null) {
                            if (this.f70213J < m66564x0(m66597c0)) {
                                z = true;
                            }
                            c17464b.f70245e = z;
                        }
                        c17464b.m51735r();
                    }
                    return true;
                } else {
                    if (!mo51785u() && this.f70228y) {
                        c17464b.f70243c = this.f70214K - this.f70210G.mo66155j();
                    } else {
                        c17464b.f70243c = this.f70210G.mo66152m() + this.f70214K;
                    }
                    return true;
                }
            }
            this.f70213J = -1;
            this.f70214K = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: d */
    public int mo51831d() {
        if (this.f70204A.size() == 0) {
            return 0;
        }
        int size = this.f70204A.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f70204A.get(i2).f70263e);
        }
        return i;
    }

    /* renamed from: d3 */
    public final void m51830d3(RecyclerView.C11872z c11872z, C17464b c17464b) {
        if (m51832c3(c11872z, c17464b, this.f70212I) || m51834b3(c11872z, c17464b)) {
            return;
        }
        c17464b.m51735r();
        c17464b.f70241a = 0;
        c17464b.f70242b = 0;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: e */
    public View mo51829e(int i) {
        View view = this.f70218S.get(i);
        if (view != null) {
            return view;
        }
        return this.f70206C.m66510o(i);
    }

    /* renamed from: e3 */
    public final void m51827e3(int i) {
        if (i >= m51778z2()) {
            return;
        }
        int m66594d0 = m66594d0();
        this.f70205B.m51653t(m66594d0);
        this.f70205B.m51652u(m66594d0);
        this.f70205B.m51654s(m66594d0);
        if (i >= this.f70205B.f70279c.length) {
            return;
        }
        this.f70221W = i;
        View m51877F2 = m51877F2();
        if (m51877F2 == null) {
            return;
        }
        this.f70213J = m66564x0(m51877F2);
        if (!mo51785u() && this.f70228y) {
            this.f70214K = this.f70210G.mo66161d(m51877F2) + this.f70210G.mo66155j();
        } else {
            this.f70214K = this.f70210G.mo66158g(m51877F2) - this.f70210G.mo66152m();
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: f */
    public List<C17466a> mo51826f() {
        return this.f70204A;
    }

    /* renamed from: f3 */
    public final void m51824f3(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m66642E0(), m66640F0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m66578q0(), m66576r0());
        int m66642E0 = m66642E0();
        int m66578q0 = m66578q0();
        boolean z = true;
        if (mo51785u()) {
            int i4 = this.f70215P;
            if (i4 == Integer.MIN_VALUE || i4 == m66642E0) {
                z = false;
            }
            if (this.f70208E.f70250b) {
                i2 = this.f70219T.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f70208E.f70249a;
            }
        } else {
            int i5 = this.f70216Q;
            if (i5 == Integer.MIN_VALUE || i5 == m66578q0) {
                z = false;
            }
            if (this.f70208E.f70250b) {
                i2 = this.f70219T.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f70208E.f70249a;
            }
        }
        int i6 = i2;
        this.f70215P = m66642E0;
        this.f70216Q = m66578q0;
        int i7 = this.f70221W;
        if (i7 == -1 && (this.f70213J != -1 || z)) {
            if (this.f70209F.f70245e) {
                return;
            }
            this.f70204A.clear();
            this.f70222X.m51646a();
            if (mo51785u()) {
                this.f70205B.m51668e(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i6, this.f70209F.f70241a, this.f70204A);
            } else {
                this.f70205B.m51665h(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i6, this.f70209F.f70241a, this.f70204A);
            }
            this.f70204A = this.f70222X.f70282a;
            this.f70205B.m51657p(makeMeasureSpec, makeMeasureSpec2);
            this.f70205B.m51675X();
            C17464b c17464b = this.f70209F;
            c17464b.f70242b = this.f70205B.f70279c[c17464b.f70241a];
            this.f70208E.f70251c = this.f70209F.f70242b;
            return;
        }
        if (i7 != -1) {
            i3 = Math.min(i7, this.f70209F.f70241a);
        } else {
            i3 = this.f70209F.f70241a;
        }
        int i8 = i3;
        this.f70222X.m51646a();
        if (mo51785u()) {
            if (this.f70204A.size() > 0) {
                this.f70205B.m51663j(this.f70204A, i8);
                this.f70205B.m51671b(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.f70209F.f70241a, this.f70204A);
            } else {
                this.f70205B.m51654s(i);
                this.f70205B.m51669d(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f70204A);
            }
        } else if (this.f70204A.size() > 0) {
            this.f70205B.m51663j(this.f70204A, i8);
            this.f70205B.m51671b(this.f70222X, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.f70209F.f70241a, this.f70204A);
        } else {
            this.f70205B.m51654s(i);
            this.f70205B.m51666g(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f70204A);
        }
        this.f70204A = this.f70222X.f70282a;
        this.f70205B.m51656q(makeMeasureSpec, makeMeasureSpec2, i8);
        this.f70205B.m51674Y(i8);
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: g */
    public int mo51823g(int i, int i2, int i3) {
        return RecyclerView.AbstractC11855p.m66592e0(m66578q0(), m66576r0(), i2, i3, mo51878F());
    }

    /* renamed from: g3 */
    public final void m51821g3(int i, int i2) {
        boolean z;
        int i3;
        this.f70208E.f70257i = i;
        boolean mo51785u = mo51785u();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m66642E0(), m66640F0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m66578q0(), m66576r0());
        if (!mo51785u && this.f70228y) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            View m66597c0 = m66597c0(m66594d0() - 1);
            if (m66597c0 == null) {
                return;
            }
            this.f70208E.f70253e = this.f70210G.mo66161d(m66597c0);
            int m66564x0 = m66564x0(m66597c0);
            View m51779y2 = m51779y2(m66597c0, this.f70204A.get(this.f70205B.f70279c[m66564x0]));
            this.f70208E.f70256h = 1;
            C17465c c17465c = this.f70208E;
            c17465c.f70252d = m66564x0 + c17465c.f70256h;
            if (this.f70205B.f70279c.length <= this.f70208E.f70252d) {
                this.f70208E.f70251c = -1;
            } else {
                C17465c c17465c2 = this.f70208E;
                c17465c2.f70251c = this.f70205B.f70279c[c17465c2.f70252d];
            }
            if (z) {
                this.f70208E.f70253e = this.f70210G.mo66158g(m51779y2);
                this.f70208E.f70254f = (-this.f70210G.mo66158g(m51779y2)) + this.f70210G.mo66152m();
                C17465c c17465c3 = this.f70208E;
                c17465c3.f70254f = Math.max(c17465c3.f70254f, 0);
            } else {
                this.f70208E.f70253e = this.f70210G.mo66161d(m51779y2);
                this.f70208E.f70254f = this.f70210G.mo66161d(m51779y2) - this.f70210G.mo66156i();
            }
            if ((this.f70208E.f70251c == -1 || this.f70208E.f70251c > this.f70204A.size() - 1) && this.f70208E.f70252d <= mo51802n()) {
                int i4 = i2 - this.f70208E.f70254f;
                this.f70222X.m51646a();
                if (i4 > 0) {
                    if (mo51785u) {
                        this.f70205B.m51669d(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i4, this.f70208E.f70252d, this.f70204A);
                    } else {
                        this.f70205B.m51666g(this.f70222X, makeMeasureSpec, makeMeasureSpec2, i4, this.f70208E.f70252d, this.f70204A);
                    }
                    this.f70205B.m51656q(makeMeasureSpec, makeMeasureSpec2, this.f70208E.f70252d);
                    this.f70205B.m51674Y(this.f70208E.f70252d);
                }
            }
        } else {
            View m66597c02 = m66597c0(0);
            if (m66597c02 == null) {
                return;
            }
            this.f70208E.f70253e = this.f70210G.mo66158g(m66597c02);
            int m66564x02 = m66564x0(m66597c02);
            View m51782v2 = m51782v2(m66597c02, this.f70204A.get(this.f70205B.f70279c[m66564x02]));
            this.f70208E.f70256h = 1;
            int i5 = this.f70205B.f70279c[m66564x02];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 > 0) {
                this.f70208E.f70252d = m66564x02 - this.f70204A.get(i5 - 1).m51701b();
            } else {
                this.f70208E.f70252d = -1;
            }
            C17465c c17465c4 = this.f70208E;
            if (i5 > 0) {
                i3 = i5 - 1;
            } else {
                i3 = 0;
            }
            c17465c4.f70251c = i3;
            if (z) {
                this.f70208E.f70253e = this.f70210G.mo66161d(m51782v2);
                this.f70208E.f70254f = this.f70210G.mo66161d(m51782v2) - this.f70210G.mo66156i();
                C17465c c17465c5 = this.f70208E;
                c17465c5.f70254f = Math.max(c17465c5.f70254f, 0);
            } else {
                this.f70208E.f70253e = this.f70210G.mo66158g(m51782v2);
                this.f70208E.f70254f = (-this.f70210G.mo66158g(m51782v2)) + this.f70210G.mo66152m();
            }
        }
        C17465c c17465c6 = this.f70208E;
        c17465c6.f70249a = i2 - c17465c6.f70254f;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: h */
    public int mo51820h() {
        return 5;
    }

    /* renamed from: h3 */
    public final void m51818h3(C17464b c17464b, boolean z, boolean z2) {
        if (z2) {
            m51847W2();
        } else {
            this.f70208E.f70250b = false;
        }
        if (!mo51785u() && this.f70228y) {
            this.f70208E.f70249a = c17464b.f70243c - getPaddingRight();
        } else {
            this.f70208E.f70249a = this.f70210G.mo66156i() - c17464b.f70243c;
        }
        this.f70208E.f70252d = c17464b.f70241a;
        this.f70208E.f70256h = 1;
        this.f70208E.f70257i = 1;
        this.f70208E.f70253e = c17464b.f70243c;
        this.f70208E.f70254f = Integer.MIN_VALUE;
        this.f70208E.f70251c = c17464b.f70242b;
        if (z && this.f70204A.size() > 1 && c17464b.f70242b >= 0 && c17464b.f70242b < this.f70204A.size() - 1) {
            C17465c.m51717l(this.f70208E);
            C17465c.m51708u(this.f70208E, this.f70204A.get(c17464b.f70242b).m51701b());
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: i */
    public int mo51817i(View view) {
        int m66571u0;
        int m66559z0;
        if (mo51785u()) {
            m66571u0 = m66647C0(view);
            m66559z0 = m66599b0(view);
        } else {
            m66571u0 = m66571u0(view);
            m66559z0 = m66559z0(view);
        }
        return m66571u0 + m66559z0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: i1 */
    public void mo51816i1(RecyclerView recyclerView, int i, int i2) {
        super.mo51816i1(recyclerView, i, i2);
        m51827e3(i);
    }

    /* renamed from: i3 */
    public final void m51814i3(C17464b c17464b, boolean z, boolean z2) {
        if (z2) {
            m51847W2();
        } else {
            this.f70208E.f70250b = false;
        }
        if (!mo51785u() && this.f70228y) {
            this.f70208E.f70249a = (this.f70220U.getWidth() - c17464b.f70243c) - this.f70210G.mo66152m();
        } else {
            this.f70208E.f70249a = c17464b.f70243c - this.f70210G.mo66152m();
        }
        this.f70208E.f70252d = c17464b.f70241a;
        this.f70208E.f70256h = 1;
        this.f70208E.f70257i = -1;
        this.f70208E.f70253e = c17464b.f70243c;
        this.f70208E.f70254f = Integer.MIN_VALUE;
        this.f70208E.f70251c = c17464b.f70242b;
        if (z && c17464b.f70242b > 0 && this.f70204A.size() > c17464b.f70242b) {
            C17465c.m51716m(this.f70208E);
            C17465c.m51707v(this.f70208E, this.f70204A.get(c17464b.f70242b).m51701b());
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: j */
    public int mo51813j() {
        return this.f70224u;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: k */
    public View mo51811k(int i) {
        return mo51829e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: k1 */
    public void mo51810k1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo51810k1(recyclerView, i, i2, i3);
        m51827e3(Math.min(i, i2));
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: l */
    public int mo51808l() {
        return this.f70226w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: l1 */
    public void mo51807l1(RecyclerView recyclerView, int i, int i2) {
        super.mo51807l1(recyclerView, i, i2);
        m51827e3(i);
    }

    /* renamed from: l2 */
    public final boolean m51806l2(View view, int i) {
        if (!mo51785u() && this.f70228y) {
            if (this.f70210G.mo66161d(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f70210G.mo66158g(view) >= this.f70210G.mo66157h() - i) {
            return true;
        } else {
            return false;
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: m */
    public int mo51805m(View view, int i, int i2) {
        int m66647C0;
        int m66599b0;
        if (mo51785u()) {
            m66647C0 = m66571u0(view);
            m66599b0 = m66559z0(view);
        } else {
            m66647C0 = m66647C0(view);
            m66599b0 = m66599b0(view);
        }
        return m66647C0 + m66599b0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: m1 */
    public void mo51804m1(RecyclerView recyclerView, int i, int i2) {
        super.mo51804m1(recyclerView, i, i2);
        m51827e3(i);
    }

    /* renamed from: m2 */
    public final boolean m51803m2(View view, int i) {
        if (!mo51785u() && this.f70228y) {
            if (this.f70210G.mo66157h() - this.f70210G.mo66158g(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f70210G.mo66161d(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: n */
    public int mo51802n() {
        return this.f70207D.m66490b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: n1 */
    public void mo51801n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo51801n1(recyclerView, i, i2, obj);
        m51827e3(i);
    }

    /* renamed from: n2 */
    public final void m51800n2() {
        this.f70204A.clear();
        this.f70209F.m51733t();
        this.f70209F.f70244d = 0;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: o */
    public int mo51799o() {
        return this.f70227x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: o1 */
    public void mo51798o1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        int i;
        int i2;
        this.f70206C = c11866v;
        this.f70207D = c11872z;
        int m66490b = c11872z.m66490b();
        if (m66490b == 0 && c11872z.m66487e()) {
            return;
        }
        m51843X2();
        m51789s2();
        m51791r2();
        this.f70205B.m51653t(m66490b);
        this.f70205B.m51652u(m66490b);
        this.f70205B.m51654s(m66490b);
        this.f70208E.f70258j = false;
        SavedState savedState = this.f70212I;
        if (savedState != null && savedState.m51756h(m66490b)) {
            this.f70213J = this.f70212I.f70239b;
        }
        if (!this.f70209F.f70246f || this.f70213J != -1 || this.f70212I != null) {
            this.f70209F.m51733t();
            m51830d3(c11872z, this.f70209F);
            this.f70209F.f70246f = true;
        }
        m66620Q(c11866v);
        if (this.f70209F.f70245e) {
            m51814i3(this.f70209F, false, true);
        } else {
            m51818h3(this.f70209F, false, true);
        }
        m51824f3(m66490b);
        m51786t2(c11866v, c11872z, this.f70208E);
        if (this.f70209F.f70245e) {
            i2 = this.f70208E.f70253e;
            m51818h3(this.f70209F, true, false);
            m51786t2(c11866v, c11872z, this.f70208E);
            i = this.f70208E.f70253e;
        } else {
            i = this.f70208E.f70253e;
            m51814i3(this.f70209F, true, false);
            m51786t2(c11866v, c11872z, this.f70208E);
            i2 = this.f70208E.f70253e;
        }
        if (m66594d0() > 0) {
            if (this.f70209F.f70245e) {
                m51881D2(i2 + m51882C2(i, c11866v, c11872z, true), c11866v, c11872z, false);
            } else {
                m51882C2(i + m51881D2(i2, c11866v, c11872z, true), c11866v, c11872z, false);
            }
        }
    }

    /* renamed from: o2 */
    public final int m51797o2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        int m66490b = c11872z.m66490b();
        m51789s2();
        View m51783u2 = m51783u2(m66490b);
        View m51780x2 = m51780x2(m66490b);
        if (c11872z.m66490b() == 0 || m51783u2 == null || m51780x2 == null) {
            return 0;
        }
        return Math.min(this.f70210G.mo66151n(), this.f70210G.mo66161d(m51780x2) - this.f70210G.mo66158g(m51783u2));
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: p */
    public int mo51796p(int i, int i2, int i3) {
        return RecyclerView.AbstractC11855p.m66592e0(m66642E0(), m66640F0(), i2, i3, mo51880E());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: p1 */
    public void mo51795p1(RecyclerView.C11872z c11872z) {
        super.mo51795p1(c11872z);
        this.f70212I = null;
        this.f70213J = -1;
        this.f70214K = Integer.MIN_VALUE;
        this.f70221W = -1;
        this.f70209F.m51733t();
        this.f70218S.clear();
    }

    /* renamed from: p2 */
    public final int m51794p2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        int m66490b = c11872z.m66490b();
        View m51783u2 = m51783u2(m66490b);
        View m51780x2 = m51780x2(m66490b);
        if (c11872z.m66490b() != 0 && m51783u2 != null && m51780x2 != null) {
            int m66564x0 = m66564x0(m51783u2);
            int m66564x02 = m66564x0(m51780x2);
            int abs = Math.abs(this.f70210G.mo66161d(m51780x2) - this.f70210G.mo66158g(m51783u2));
            int[] iArr = this.f70205B.f70279c;
            int i = iArr[m66564x0];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[m66564x02] - i) + 1))) + (this.f70210G.mo66152m() - this.f70210G.mo66158g(m51783u2)));
            }
        }
        return 0;
    }

    /* renamed from: q2 */
    public final int m51793q2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        int m66490b = c11872z.m66490b();
        View m51783u2 = m51783u2(m66490b);
        View m51780x2 = m51780x2(m66490b);
        if (c11872z.m66490b() == 0 || m51783u2 == null || m51780x2 == null) {
            return 0;
        }
        int m51781w2 = m51781w2();
        return (int) ((Math.abs(this.f70210G.mo66161d(m51780x2) - this.f70210G.mo66158g(m51783u2)) / ((m51778z2() - m51781w2) + 1)) * c11872z.m66490b());
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: r */
    public void mo51792r(C17466a c17466a) {
    }

    /* renamed from: r2 */
    public final void m51791r2() {
        if (this.f70208E == null) {
            this.f70208E = new C17465c();
        }
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: s */
    public void mo51790s(int i, View view) {
        this.f70218S.put(i, view);
    }

    /* renamed from: s2 */
    public final void m51789s2() {
        if (this.f70210G != null) {
            return;
        }
        if (mo51785u()) {
            if (this.f70224u == 0) {
                this.f70210G = AbstractC11944q.m66166a(this);
                this.f70211H = AbstractC11944q.m66164c(this);
                return;
            }
            this.f70210G = AbstractC11944q.m66164c(this);
            this.f70211H = AbstractC11944q.m66166a(this);
        } else if (this.f70224u == 0) {
            this.f70210G = AbstractC11944q.m66164c(this);
            this.f70211H = AbstractC11944q.m66166a(this);
        } else {
            this.f70210G = AbstractC11944q.m66166a(this);
            this.f70211H = AbstractC11944q.m66164c(this);
        }
    }

    @Override // p000.InterfaceC36681Vr1
    public void setFlexLines(List<C17466a> list) {
        this.f70204A = list;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: t */
    public int mo51788t() {
        int size = this.f70204A.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f70204A.get(i2).f70265g;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: t1 */
    public void mo51787t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f70212I = (SavedState) parcelable;
            m66627L1();
        }
    }

    /* renamed from: t2 */
    public final int m51786t2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C17465c c17465c) {
        if (c17465c.f70254f != Integer.MIN_VALUE) {
            if (c17465c.f70249a < 0) {
                C17465c.m51712q(c17465c, c17465c.f70249a);
            }
            m51852S2(c11866v, c17465c);
        }
        int i = c17465c.f70249a;
        int i2 = c17465c.f70249a;
        boolean mo51785u = mo51785u();
        int i3 = 0;
        while (true) {
            if ((i2 > 0 || this.f70208E.f70250b) && c17465c.m51729D(c11872z, this.f70204A)) {
                C17466a c17466a = this.f70204A.get(c17465c.f70251c);
                c17465c.f70252d = c17466a.f70273o;
                i3 += m51856P2(c17466a, c17465c);
                if (!mo51785u && this.f70228y) {
                    C17465c.m51725d(c17465c, c17466a.m51702a() * c17465c.f70257i);
                } else {
                    C17465c.m51726c(c17465c, c17466a.m51702a() * c17465c.f70257i);
                }
                i2 -= c17466a.m51702a();
            }
        }
        C17465c.m51720i(c17465c, i3);
        if (c17465c.f70254f != Integer.MIN_VALUE) {
            C17465c.m51712q(c17465c, i3);
            if (c17465c.f70249a < 0) {
                C17465c.m51712q(c17465c, c17465c.f70249a);
            }
            m51852S2(c11866v, c17465c);
        }
        return i - c17465c.f70249a;
    }

    @Override // p000.InterfaceC36681Vr1
    /* renamed from: u */
    public boolean mo51785u() {
        int i = this.f70223t;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: u1 */
    public Parcelable mo51784u1() {
        if (this.f70212I != null) {
            return new SavedState(this.f70212I);
        }
        SavedState savedState = new SavedState();
        if (m66594d0() > 0) {
            View m51877F2 = m51877F2();
            savedState.f70239b = m66564x0(m51877F2);
            savedState.f70240c = this.f70210G.mo66158g(m51877F2) - this.f70210G.mo66152m();
        } else {
            savedState.m51755i();
        }
        return savedState;
    }

    /* renamed from: u2 */
    public final View m51783u2(int i) {
        View m51883B2 = m51883B2(0, m66594d0(), i);
        if (m51883B2 == null) {
            return null;
        }
        int i2 = this.f70205B.f70279c[m66564x0(m51883B2)];
        if (i2 == -1) {
            return null;
        }
        return m51782v2(m51883B2, this.f70204A.get(i2));
    }

    /* renamed from: v2 */
    public final View m51782v2(View view, C17466a c17466a) {
        boolean mo51785u = mo51785u();
        int i = c17466a.f70266h;
        for (int i2 = 1; i2 < i; i2++) {
            View m66597c0 = m66597c0(i2);
            if (m66597c0 != null && m66597c0.getVisibility() != 8) {
                if (this.f70228y && !mo51785u) {
                    if (this.f70210G.mo66161d(view) >= this.f70210G.mo66161d(m66597c0)) {
                    }
                    view = m66597c0;
                } else {
                    if (this.f70210G.mo66158g(view) <= this.f70210G.mo66158g(m66597c0)) {
                    }
                    view = m66597c0;
                }
            }
        }
        return view;
    }

    /* renamed from: w2 */
    public int m51781w2() {
        View m51884A2 = m51884A2(0, m66594d0(), false);
        if (m51884A2 == null) {
            return -1;
        }
        return m66564x0(m51884A2);
    }

    /* renamed from: x2 */
    public final View m51780x2(int i) {
        View m51883B2 = m51883B2(m66594d0() - 1, -1, i);
        if (m51883B2 == null) {
            return null;
        }
        return m51779y2(m51883B2, this.f70204A.get(this.f70205B.f70279c[m66564x0(m51883B2)]));
    }

    /* renamed from: y2 */
    public final View m51779y2(View view, C17466a c17466a) {
        boolean mo51785u = mo51785u();
        int m66594d0 = (m66594d0() - c17466a.f70266h) - 1;
        for (int m66594d02 = m66594d0() - 2; m66594d02 > m66594d0; m66594d02--) {
            View m66597c0 = m66597c0(m66594d02);
            if (m66597c0 != null && m66597c0.getVisibility() != 8) {
                if (this.f70228y && !mo51785u) {
                    if (this.f70210G.mo66158g(view) <= this.f70210G.mo66158g(m66597c0)) {
                    }
                    view = m66597c0;
                } else {
                    if (this.f70210G.mo66161d(view) >= this.f70210G.mo66161d(m66597c0)) {
                    }
                    view = m66597c0;
                }
            }
        }
        return view;
    }

    /* renamed from: z2 */
    public int m51778z2() {
        View m51884A2 = m51884A2(m66594d0() - 1, -1, false);
        if (m51884A2 == null) {
            return -1;
        }
        return m66564x0(m51884A2);
    }

    /* loaded from: classes5.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C17462a();

        /* renamed from: b */
        public int f70239b;

        /* renamed from: c */
        public int f70240c;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        /* loaded from: classes5.dex */
        public class C17462a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: h */
        public final boolean m51756h(int i) {
            int i2 = this.f70239b;
            return i2 >= 0 && i2 < i;
        }

        /* renamed from: i */
        public final void m51755i() {
            this.f70239b = -1;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f70239b + ", mAnchorOffset=" + this.f70240c + CoreConstants.CURLY_RIGHT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f70239b);
            parcel.writeInt(this.f70240c);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f70239b = parcel.readInt();
            this.f70240c = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.f70239b = savedState.f70239b;
            this.f70240c = savedState.f70240c;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f70227x = -1;
        this.f70204A = new ArrayList();
        this.f70205B = new C17467b(this);
        this.f70209F = new C17464b();
        this.f70213J = -1;
        this.f70214K = Integer.MIN_VALUE;
        this.f70215P = Integer.MIN_VALUE;
        this.f70216Q = Integer.MIN_VALUE;
        this.f70218S = new SparseArray<>();
        this.f70221W = -1;
        this.f70222X = new C17467b.C17469b();
        m51839Z2(i);
        m51836a3(i2);
        m51841Y2(4);
        this.f70219T = context;
    }

    /* loaded from: classes5.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C17461a();

        /* renamed from: f */
        public float f70230f;

        /* renamed from: g */
        public float f70231g;

        /* renamed from: h */
        public int f70232h;

        /* renamed from: i */
        public float f70233i;

        /* renamed from: j */
        public int f70234j;

        /* renamed from: k */
        public int f70235k;

        /* renamed from: l */
        public int f70236l;

        /* renamed from: m */
        public int f70237m;

        /* renamed from: n */
        public boolean f70238n;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        /* loaded from: classes5.dex */
        public class C17461a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f70230f = 0.0f;
            this.f70231g = 1.0f;
            this.f70232h = -1;
            this.f70233i = -1.0f;
            this.f70236l = 16777215;
            this.f70237m = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: N1 */
        public int mo51777N1() {
            return this.f70232h;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: P1 */
        public float mo51776P1() {
            return this.f70231g;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: U2 */
        public void mo51775U2(int i) {
            this.f70234j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: V0 */
        public int mo51774V0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: W2 */
        public int mo51773W2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f */
        public int mo51772f() {
            return this.f70234j;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: f0 */
        public int mo51771f0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: g2 */
        public void mo51770g2(int i) {
            this.f70235k = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.f70237m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.f70236l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: i2 */
        public float mo51769i2() {
            return this.f70230f;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: m2 */
        public float mo51768m2() {
            return this.f70233i;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: n3 */
        public int mo51767n3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: o3 */
        public int mo51766o3() {
            return this.f70235k;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: v2 */
        public boolean mo51765v2() {
            return this.f70238n;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f70230f);
            parcel.writeFloat(this.f70231g);
            parcel.writeInt(this.f70232h);
            parcel.writeFloat(this.f70233i);
            parcel.writeInt(this.f70234j);
            parcel.writeInt(this.f70235k);
            parcel.writeInt(this.f70236l);
            parcel.writeInt(this.f70237m);
            parcel.writeByte(this.f70238n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f70230f = 0.0f;
            this.f70231g = 1.0f;
            this.f70232h = -1;
            this.f70233i = -1.0f;
            this.f70236l = 16777215;
            this.f70237m = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f70230f = 0.0f;
            this.f70231g = 1.0f;
            this.f70232h = -1;
            this.f70233i = -1.0f;
            this.f70236l = 16777215;
            this.f70237m = 16777215;
            this.f70230f = parcel.readFloat();
            this.f70231g = parcel.readFloat();
            this.f70232h = parcel.readInt();
            this.f70233i = parcel.readFloat();
            this.f70234j = parcel.readInt();
            this.f70235k = parcel.readInt();
            this.f70236l = parcel.readInt();
            this.f70237m = parcel.readInt();
            this.f70238n = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f70227x = -1;
        this.f70204A = new ArrayList();
        this.f70205B = new C17467b(this);
        this.f70209F = new C17464b();
        this.f70213J = -1;
        this.f70214K = Integer.MIN_VALUE;
        this.f70215P = Integer.MIN_VALUE;
        this.f70216Q = Integer.MIN_VALUE;
        this.f70218S = new SparseArray<>();
        this.f70221W = -1;
        this.f70222X = new C17467b.C17469b();
        RecyclerView.AbstractC11855p.C11859d m66561y0 = RecyclerView.AbstractC11855p.m66561y0(context, attributeSet, i, i2);
        int i3 = m66561y0.f55249a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (m66561y0.f55251c) {
                    m51839Z2(3);
                } else {
                    m51839Z2(2);
                }
            }
        } else if (m66561y0.f55251c) {
            m51839Z2(1);
        } else {
            m51839Z2(0);
        }
        m51836a3(1);
        m51841Y2(4);
        this.f70219T = context;
    }
}
