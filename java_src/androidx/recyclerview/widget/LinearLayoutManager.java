package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC11855p implements C11925l.InterfaceC11937i, RecyclerView.AbstractC11869y.InterfaceC11871b {

    /* renamed from: A */
    public boolean f55161A;

    /* renamed from: B */
    public int f55162B;

    /* renamed from: C */
    public int f55163C;

    /* renamed from: D */
    public boolean f55164D;

    /* renamed from: E */
    public SavedState f55165E;

    /* renamed from: F */
    public final C11828a f55166F;

    /* renamed from: G */
    public final C11829b f55167G;

    /* renamed from: H */
    public int f55168H;

    /* renamed from: I */
    public int[] f55169I;

    /* renamed from: t */
    public int f55170t;

    /* renamed from: u */
    public C11830c f55171u;

    /* renamed from: v */
    public AbstractC11944q f55172v;

    /* renamed from: w */
    public boolean f55173w;

    /* renamed from: x */
    public boolean f55174x;

    /* renamed from: y */
    public boolean f55175y;

    /* renamed from: z */
    public boolean f55176z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11827a();

        /* renamed from: b */
        public int f55177b;

        /* renamed from: c */
        public int f55178c;

        /* renamed from: d */
        public boolean f55179d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        public class C11827a implements Parcelable.Creator<SavedState> {
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

        public SavedState() {
        }

        /* renamed from: a */
        public boolean m66698a() {
            return this.f55177b >= 0;
        }

        /* renamed from: b */
        public void m66697b() {
            this.f55177b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f55177b);
            parcel.writeInt(this.f55178c);
            parcel.writeInt(this.f55179d ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f55177b = parcel.readInt();
            this.f55178c = parcel.readInt();
            this.f55179d = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f55177b = savedState.f55177b;
            this.f55178c = savedState.f55178c;
            this.f55179d = savedState.f55179d;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: classes.dex */
    public static class C11828a {

        /* renamed from: a */
        public AbstractC11944q f55180a;

        /* renamed from: b */
        public int f55181b;

        /* renamed from: c */
        public int f55182c;

        /* renamed from: d */
        public boolean f55183d;

        /* renamed from: e */
        public boolean f55184e;

        public C11828a() {
            m66690e();
        }

        /* renamed from: a */
        public void m66694a() {
            int mo66152m;
            if (this.f55183d) {
                mo66152m = this.f55180a.mo66156i();
            } else {
                mo66152m = this.f55180a.mo66152m();
            }
            this.f55182c = mo66152m;
        }

        /* renamed from: b */
        public void m66693b(View view, int i) {
            if (this.f55183d) {
                this.f55182c = this.f55180a.mo66161d(view) + this.f55180a.m66163o();
            } else {
                this.f55182c = this.f55180a.mo66158g(view);
            }
            this.f55181b = i;
        }

        /* renamed from: c */
        public void m66692c(View view, int i) {
            int m66163o = this.f55180a.m66163o();
            if (m66163o >= 0) {
                m66693b(view, i);
                return;
            }
            this.f55181b = i;
            if (this.f55183d) {
                int mo66156i = (this.f55180a.mo66156i() - m66163o) - this.f55180a.mo66161d(view);
                this.f55182c = this.f55180a.mo66156i() - mo66156i;
                if (mo66156i > 0) {
                    int mo66160e = this.f55182c - this.f55180a.mo66160e(view);
                    int mo66152m = this.f55180a.mo66152m();
                    int min = mo66160e - (mo66152m + Math.min(this.f55180a.mo66158g(view) - mo66152m, 0));
                    if (min < 0) {
                        this.f55182c += Math.min(mo66156i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo66158g = this.f55180a.mo66158g(view);
            int mo66152m2 = mo66158g - this.f55180a.mo66152m();
            this.f55182c = mo66158g;
            if (mo66152m2 > 0) {
                int mo66156i2 = (this.f55180a.mo66156i() - Math.min(0, (this.f55180a.mo66156i() - m66163o) - this.f55180a.mo66161d(view))) - (mo66158g + this.f55180a.mo66160e(view));
                if (mo66156i2 < 0) {
                    this.f55182c -= Math.min(mo66152m2, -mo66156i2);
                }
            }
        }

        /* renamed from: d */
        public boolean m66691d(View view, RecyclerView.C11872z c11872z) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (!layoutParams.m66674c() && layoutParams.m66676a() >= 0 && layoutParams.m66676a() < c11872z.m66490b()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void m66690e() {
            this.f55181b = -1;
            this.f55182c = Integer.MIN_VALUE;
            this.f55183d = false;
            this.f55184e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f55181b + ", mCoordinate=" + this.f55182c + ", mLayoutFromEnd=" + this.f55183d + ", mValid=" + this.f55184e + CoreConstants.CURLY_RIGHT;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: classes.dex */
    public static class C11829b {

        /* renamed from: a */
        public int f55185a;

        /* renamed from: b */
        public boolean f55186b;

        /* renamed from: c */
        public boolean f55187c;

        /* renamed from: d */
        public boolean f55188d;

        /* renamed from: a */
        public void m66689a() {
            this.f55185a = 0;
            this.f55186b = false;
            this.f55187c = false;
            this.f55188d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: classes.dex */
    public static class C11830c {

        /* renamed from: b */
        public int f55190b;

        /* renamed from: c */
        public int f55191c;

        /* renamed from: d */
        public int f55192d;

        /* renamed from: e */
        public int f55193e;

        /* renamed from: f */
        public int f55194f;

        /* renamed from: g */
        public int f55195g;

        /* renamed from: k */
        public int f55199k;

        /* renamed from: m */
        public boolean f55201m;

        /* renamed from: a */
        public boolean f55189a = true;

        /* renamed from: h */
        public int f55196h = 0;

        /* renamed from: i */
        public int f55197i = 0;

        /* renamed from: j */
        public boolean f55198j = false;

        /* renamed from: l */
        public List<RecyclerView.AbstractC11834D> f55200l = null;

        /* renamed from: a */
        public void m66688a() {
            m66687b(null);
        }

        /* renamed from: b */
        public void m66687b(View view) {
            View m66683f = m66683f(view);
            if (m66683f == null) {
                this.f55192d = -1;
            } else {
                this.f55192d = ((RecyclerView.LayoutParams) m66683f.getLayoutParams()).m66676a();
            }
        }

        /* renamed from: c */
        public boolean m66686c(RecyclerView.C11872z c11872z) {
            int i = this.f55192d;
            return i >= 0 && i < c11872z.m66490b();
        }

        /* renamed from: d */
        public View m66685d(RecyclerView.C11866v c11866v) {
            if (this.f55200l != null) {
                return m66684e();
            }
            View m66510o = c11866v.m66510o(this.f55192d);
            this.f55192d += this.f55193e;
            return m66510o;
        }

        /* renamed from: e */
        public final View m66684e() {
            int size = this.f55200l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f55200l.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.m66674c() && this.f55192d == layoutParams.m66676a()) {
                    m66687b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: f */
        public View m66683f(View view) {
            int m66676a;
            int size = this.f55200l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f55200l.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.m66674c() && (m66676a = (layoutParams.m66676a() - this.f55192d) * this.f55193e) >= 0 && m66676a < i) {
                    view2 = view3;
                    if (m66676a == 0) {
                        break;
                    }
                    i = m66676a;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: A */
    public void mo66484A(String str) {
        if (this.f55165E == null) {
            super.mo66484A(str);
        }
    }

    /* renamed from: A2 */
    public final int m66749A2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        int mo66156i;
        int mo66156i2 = this.f55172v.mo66156i() - i;
        if (mo66156i2 > 0) {
            int i2 = -m66732R2(-mo66156i2, c11866v, c11872z);
            int i3 = i + i2;
            if (z && (mo66156i = this.f55172v.mo66156i() - i3) > 0) {
                this.f55172v.mo66148r(mo66156i);
                return mo66156i + i2;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: B2 */
    public final int m66748B2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        int mo66152m;
        int mo66152m2 = i - this.f55172v.mo66152m();
        if (mo66152m2 > 0) {
            int i2 = -m66732R2(mo66152m2, c11866v, c11872z);
            int i3 = i + i2;
            if (z && (mo66152m = i3 - this.f55172v.mo66152m()) > 0) {
                this.f55172v.mo66148r(-mo66152m);
                return i2 - mo66152m;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: C2 */
    public final View m66747C2() {
        return m66597c0(this.f55175y ? 0 : m66594d0() - 1);
    }

    /* renamed from: D2 */
    public final View m66746D2() {
        return m66597c0(this.f55175y ? m66594d0() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: E */
    public boolean mo51880E() {
        return this.f55170t == 0;
    }

    @Deprecated
    /* renamed from: E2 */
    public int m66745E2(RecyclerView.C11872z c11872z) {
        if (c11872z.m66488d()) {
            return this.f55172v.mo66151n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: F */
    public boolean mo51878F() {
        return this.f55170t == 1;
    }

    /* renamed from: F2 */
    public int m66744F2() {
        return this.f55170t;
    }

    /* renamed from: G2 */
    public boolean m66743G2() {
        return m66572t0() == 1;
    }

    /* renamed from: H2 */
    public boolean m66742H2() {
        return this.f55161A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: I */
    public void mo66475I(int i, int i2, RecyclerView.C11872z c11872z, RecyclerView.AbstractC11855p.InterfaceC11858c interfaceC11858c) {
        int i3;
        if (this.f55170t != 0) {
            i = i2;
        }
        if (m66594d0() != 0 && i != 0) {
            m66713l2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m66724Z2(i3, Math.abs(i), true, c11872z);
            mo66719f2(c11872z, this.f55171u, interfaceC11858c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: I0 */
    public boolean mo51873I0() {
        return true;
    }

    /* renamed from: I2 */
    public void mo66741I2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C11830c c11830c, C11829b c11829b) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int mo66159f;
        boolean z2;
        View m66685d = c11830c.m66685d(c11866v);
        if (m66685d == null) {
            c11829b.f55186b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) m66685d.getLayoutParams();
        if (c11830c.f55200l == null) {
            boolean z3 = this.f55175y;
            if (c11830c.f55194f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                m66565x(m66685d);
            } else {
                m66562y(m66685d, 0);
            }
        } else {
            boolean z4 = this.f55175y;
            if (c11830c.f55194f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                m66570v(m66685d);
            } else {
                m66568w(m66685d, 0);
            }
        }
        m66617R0(m66685d, 0, 0);
        c11829b.f55185a = this.f55172v.mo66160e(m66685d);
        if (this.f55170t == 1) {
            if (m66743G2()) {
                mo66159f = m66642E0() - getPaddingRight();
                i4 = mo66159f - this.f55172v.mo66159f(m66685d);
            } else {
                i4 = getPaddingLeft();
                mo66159f = this.f55172v.mo66159f(m66685d) + i4;
            }
            if (c11830c.f55194f == -1) {
                int i5 = c11830c.f55190b;
                i3 = i5;
                i2 = mo66159f;
                i = i5 - c11829b.f55185a;
            } else {
                int i6 = c11830c.f55190b;
                i = i6;
                i2 = mo66159f;
                i3 = c11829b.f55185a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int mo66159f2 = this.f55172v.mo66159f(m66685d) + paddingTop;
            if (c11830c.f55194f == -1) {
                int i7 = c11830c.f55190b;
                i2 = i7;
                i = paddingTop;
                i3 = mo66159f2;
                i4 = i7 - c11829b.f55185a;
            } else {
                int i8 = c11830c.f55190b;
                i = paddingTop;
                i2 = c11829b.f55185a + i8;
                i3 = mo66159f2;
                i4 = i8;
            }
        }
        m66619Q0(m66685d, i4, i, i2, i3);
        if (layoutParams.m66674c() || layoutParams.m66675b()) {
            c11829b.f55187c = true;
        }
        c11829b.f55188d = m66685d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: J */
    public void mo66632J(int i, RecyclerView.AbstractC11855p.InterfaceC11858c interfaceC11858c) {
        boolean z;
        int i2;
        SavedState savedState = this.f55165E;
        int i3 = -1;
        if (savedState != null && savedState.m66698a()) {
            SavedState savedState2 = this.f55165E;
            z = savedState2.f55179d;
            i2 = savedState2.f55177b;
        } else {
            m66733Q2();
            z = this.f55175y;
            i2 = this.f55162B;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f55168H && i2 >= 0 && i2 < i; i4++) {
            interfaceC11858c.mo66216a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: J2 */
    public final void m66740J2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, int i, int i2) {
        boolean z;
        if (c11872z.m66485g() && m66594d0() != 0 && !c11872z.m66487e() && mo66447d2()) {
            List<RecyclerView.AbstractC11834D> m66514k = c11866v.m66514k();
            int size = m66514k.size();
            int m66564x0 = m66564x0(m66597c0(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.AbstractC11834D abstractC11834D = m66514k.get(i5);
                if (!abstractC11834D.isRemoved()) {
                    boolean z2 = true;
                    if (abstractC11834D.getLayoutPosition() < m66564x0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f55175y) {
                        z2 = true;
                    }
                    if (z2) {
                        i3 += this.f55172v.mo66160e(abstractC11834D.itemView);
                    } else {
                        i4 += this.f55172v.mo66160e(abstractC11834D.itemView);
                    }
                }
            }
            this.f55171u.f55200l = m66514k;
            if (i3 > 0) {
                m66721c3(m66564x0(m66746D2()), i);
                C11830c c11830c = this.f55171u;
                c11830c.f55196h = i3;
                c11830c.f55191c = 0;
                c11830c.m66688a();
                m66712m2(c11866v, this.f55171u, c11872z, false);
            }
            if (i4 > 0) {
                m66723a3(m66564x0(m66747C2()), i2);
                C11830c c11830c2 = this.f55171u;
                c11830c2.f55196h = i4;
                c11830c2.f55191c = 0;
                c11830c2.m66688a();
                m66712m2(c11866v, this.f55171u, c11872z, false);
            }
            this.f55171u.f55200l = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: K */
    public int mo51870K(RecyclerView.C11872z c11872z) {
        return m66718g2(c11872z);
    }

    /* renamed from: K2 */
    public void mo66739K2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C11828a c11828a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: L */
    public int mo51868L(RecyclerView.C11872z c11872z) {
        return m66717h2(c11872z);
    }

    /* renamed from: L2 */
    public final void m66738L2(RecyclerView.C11866v c11866v, C11830c c11830c) {
        if (c11830c.f55189a && !c11830c.f55201m) {
            int i = c11830c.f55195g;
            int i2 = c11830c.f55197i;
            if (c11830c.f55194f == -1) {
                m66736N2(c11866v, i, i2);
            } else {
                m66735O2(c11866v, i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: M */
    public int mo51866M(RecyclerView.C11872z c11872z) {
        return m66716i2(c11872z);
    }

    /* renamed from: M2 */
    public final void m66737M2(RecyclerView.C11866v c11866v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m66639F1(i3, c11866v);
            }
            return;
        }
        while (i > i2) {
            m66639F1(i, c11866v);
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: N */
    public int mo51864N(RecyclerView.C11872z c11872z) {
        return m66718g2(c11872z);
    }

    /* renamed from: N2 */
    public final void m66736N2(RecyclerView.C11866v c11866v, int i, int i2) {
        int m66594d0 = m66594d0();
        if (i < 0) {
            return;
        }
        int mo66157h = (this.f55172v.mo66157h() - i) + i2;
        if (this.f55175y) {
            for (int i3 = 0; i3 < m66594d0; i3++) {
                View m66597c0 = m66597c0(i3);
                if (this.f55172v.mo66158g(m66597c0) < mo66157h || this.f55172v.mo66149q(m66597c0) < mo66157h) {
                    m66737M2(c11866v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = m66594d0 - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View m66597c02 = m66597c0(i5);
            if (this.f55172v.mo66158g(m66597c02) < mo66157h || this.f55172v.mo66149q(m66597c02) < mo66157h) {
                m66737M2(c11866v, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: O */
    public int mo51861O(RecyclerView.C11872z c11872z) {
        return m66717h2(c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: O1 */
    public int mo51860O1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (this.f55170t == 1) {
            return 0;
        }
        return m66732R2(i, c11866v, c11872z);
    }

    /* renamed from: O2 */
    public final void m66735O2(RecyclerView.C11866v c11866v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int m66594d0 = m66594d0();
        if (this.f55175y) {
            int i4 = m66594d0 - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View m66597c0 = m66597c0(i5);
                if (this.f55172v.mo66161d(m66597c0) > i3 || this.f55172v.mo66150p(m66597c0) > i3) {
                    m66737M2(c11866v, i4, i5);
                    return;
                }
            }
            return;
        }
        for (int i6 = 0; i6 < m66594d0; i6++) {
            View m66597c02 = m66597c0(i6);
            if (this.f55172v.mo66161d(m66597c02) > i3 || this.f55172v.mo66150p(m66597c02) > i3) {
                m66737M2(c11866v, 0, i6);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: P */
    public int mo51858P(RecyclerView.C11872z c11872z) {
        return m66716i2(c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: P1 */
    public void mo51857P1(int i) {
        this.f55162B = i;
        this.f55163C = Integer.MIN_VALUE;
        SavedState savedState = this.f55165E;
        if (savedState != null) {
            savedState.m66697b();
        }
        m66627L1();
    }

    /* renamed from: P2 */
    public boolean m66734P2() {
        if (this.f55172v.mo66154k() == 0 && this.f55172v.mo66157h() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: Q1 */
    public int mo51855Q1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (this.f55170t == 0) {
            return 0;
        }
        return m66732R2(i, c11866v, c11872z);
    }

    /* renamed from: Q2 */
    public final void m66733Q2() {
        if (this.f55170t != 1 && m66743G2()) {
            this.f55175y = !this.f55174x;
        } else {
            this.f55175y = this.f55174x;
        }
    }

    /* renamed from: R2 */
    public int m66732R2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        int i2;
        if (m66594d0() == 0 || i == 0) {
            return 0;
        }
        m66713l2();
        this.f55171u.f55189a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m66724Z2(i2, abs, true, c11872z);
        C11830c c11830c = this.f55171u;
        int m66712m2 = c11830c.f55195g + m66712m2(c11866v, c11830c, c11872z, false);
        if (m66712m2 < 0) {
            return 0;
        }
        if (abs > m66712m2) {
            i = i2 * m66712m2;
        }
        this.f55172v.mo66148r(-i);
        this.f55171u.f55199k = i;
        return i;
    }

    /* renamed from: S2 */
    public void m66731S2(int i, int i2) {
        this.f55162B = i;
        this.f55163C = i2;
        SavedState savedState = this.f55165E;
        if (savedState != null) {
            savedState.m66697b();
        }
        m66627L1();
    }

    /* renamed from: T2 */
    public void m66730T2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo66484A(null);
        if (i != this.f55170t || this.f55172v == null) {
            AbstractC11944q m66165b = AbstractC11944q.m66165b(this, i);
            this.f55172v = m66165b;
            this.f55166F.f55180a = m66165b;
            this.f55170t = i;
            m66627L1();
        }
    }

    /* renamed from: U2 */
    public void m66729U2(boolean z) {
        mo66484A(null);
        if (z == this.f55174x) {
            return;
        }
        this.f55174x = z;
        m66627L1();
    }

    /* renamed from: V2 */
    public void mo66728V2(boolean z) {
        mo66484A(null);
        if (this.f55176z == z) {
            return;
        }
        this.f55176z = z;
        m66627L1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: W */
    public View mo66607W(int i) {
        int m66594d0 = m66594d0();
        if (m66594d0 == 0) {
            return null;
        }
        int m66564x0 = i - m66564x0(m66597c0(0));
        if (m66564x0 >= 0 && m66564x0 < m66594d0) {
            View m66597c0 = m66597c0(m66564x0);
            if (m66564x0(m66597c0) == i) {
                return m66597c0;
            }
        }
        return super.mo66607W(i);
    }

    /* renamed from: W2 */
    public final boolean m66727W2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C11828a c11828a) {
        View mo66699z2;
        boolean z;
        boolean z2 = false;
        if (m66594d0() == 0) {
            return false;
        }
        View m66579p0 = m66579p0();
        if (m66579p0 != null && c11828a.m66691d(m66579p0, c11872z)) {
            c11828a.m66692c(m66579p0, m66564x0(m66579p0));
            return true;
        }
        boolean z3 = this.f55173w;
        boolean z4 = this.f55176z;
        if (z3 != z4 || (mo66699z2 = mo66699z2(c11866v, c11872z, c11828a.f55183d, z4)) == null) {
            return false;
        }
        c11828a.m66693b(mo66699z2, m66564x0(mo66699z2));
        if (!c11872z.m66487e() && mo66447d2()) {
            int mo66158g = this.f55172v.mo66158g(mo66699z2);
            int mo66161d = this.f55172v.mo66161d(mo66699z2);
            int mo66152m = this.f55172v.mo66152m();
            int mo66156i = this.f55172v.mo66156i();
            if (mo66161d <= mo66152m && mo66158g < mo66152m) {
                z = true;
            } else {
                z = false;
            }
            if (mo66158g >= mo66156i && mo66161d > mo66156i) {
                z2 = true;
            }
            if (z || z2) {
                if (c11828a.f55183d) {
                    mo66152m = mo66156i;
                }
                c11828a.f55182c = mo66152m;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: X */
    public RecyclerView.LayoutParams mo51846X() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: X2 */
    public final boolean m66726X2(RecyclerView.C11872z c11872z, C11828a c11828a) {
        int i;
        boolean z;
        int mo66158g;
        boolean z2 = false;
        if (!c11872z.m66487e() && (i = this.f55162B) != -1) {
            if (i >= 0 && i < c11872z.m66490b()) {
                c11828a.f55181b = this.f55162B;
                SavedState savedState = this.f55165E;
                if (savedState != null && savedState.m66698a()) {
                    boolean z3 = this.f55165E.f55179d;
                    c11828a.f55183d = z3;
                    if (z3) {
                        c11828a.f55182c = this.f55172v.mo66156i() - this.f55165E.f55178c;
                    } else {
                        c11828a.f55182c = this.f55172v.mo66152m() + this.f55165E.f55178c;
                    }
                    return true;
                } else if (this.f55163C == Integer.MIN_VALUE) {
                    View mo66607W = mo66607W(this.f55162B);
                    if (mo66607W != null) {
                        if (this.f55172v.mo66160e(mo66607W) > this.f55172v.mo66151n()) {
                            c11828a.m66694a();
                            return true;
                        } else if (this.f55172v.mo66158g(mo66607W) - this.f55172v.mo66152m() < 0) {
                            c11828a.f55182c = this.f55172v.mo66152m();
                            c11828a.f55183d = false;
                            return true;
                        } else if (this.f55172v.mo66156i() - this.f55172v.mo66161d(mo66607W) < 0) {
                            c11828a.f55182c = this.f55172v.mo66156i();
                            c11828a.f55183d = true;
                            return true;
                        } else {
                            if (c11828a.f55183d) {
                                mo66158g = this.f55172v.mo66161d(mo66607W) + this.f55172v.m66163o();
                            } else {
                                mo66158g = this.f55172v.mo66158g(mo66607W);
                            }
                            c11828a.f55182c = mo66158g;
                        }
                    } else {
                        if (m66594d0() > 0) {
                            if (this.f55162B < m66564x0(m66597c0(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f55175y) {
                                z2 = true;
                            }
                            c11828a.f55183d = z2;
                        }
                        c11828a.m66694a();
                    }
                    return true;
                } else {
                    boolean z4 = this.f55175y;
                    c11828a.f55183d = z4;
                    if (z4) {
                        c11828a.f55182c = this.f55172v.mo66156i() - this.f55163C;
                    } else {
                        c11828a.f55182c = this.f55172v.mo66152m() + this.f55163C;
                    }
                    return true;
                }
            }
            this.f55162B = -1;
            this.f55163C = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Y1 */
    public boolean mo66602Y1() {
        if (m66576r0() != 1073741824 && m66640F0() != 1073741824 && m66638G0()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y2 */
    public final void m66725Y2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, C11828a c11828a) {
        int i;
        if (m66726X2(c11872z, c11828a) || m66727W2(c11866v, c11872z, c11828a)) {
            return;
        }
        c11828a.m66694a();
        if (this.f55176z) {
            i = c11872z.m66490b() - 1;
        } else {
            i = 0;
        }
        c11828a.f55181b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: Z0 */
    public void mo51840Z0(RecyclerView recyclerView, RecyclerView.C11866v c11866v) {
        super.mo51840Z0(recyclerView, c11866v);
        if (this.f55164D) {
            m66646C1(c11866v);
            c11866v.m66522c();
        }
    }

    /* renamed from: Z2 */
    public final void m66724Z2(int i, int i2, boolean z, RecyclerView.C11872z c11872z) {
        int i3;
        int mo66152m;
        this.f55171u.f55201m = m66734P2();
        this.f55171u.f55194f = i;
        int[] iArr = this.f55169I;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo49651e2(c11872z, iArr);
        int max = Math.max(0, this.f55169I[0]);
        int max2 = Math.max(0, this.f55169I[1]);
        if (i == 1) {
            z2 = true;
        }
        C11830c c11830c = this.f55171u;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c11830c.f55196h = i3;
        if (!z2) {
            max = max2;
        }
        c11830c.f55197i = max;
        if (z2) {
            c11830c.f55196h = i3 + this.f55172v.mo66155j();
            View m66747C2 = m66747C2();
            C11830c c11830c2 = this.f55171u;
            if (this.f55175y) {
                i4 = -1;
            }
            c11830c2.f55193e = i4;
            int m66564x0 = m66564x0(m66747C2);
            C11830c c11830c3 = this.f55171u;
            c11830c2.f55192d = m66564x0 + c11830c3.f55193e;
            c11830c3.f55190b = this.f55172v.mo66161d(m66747C2);
            mo66152m = this.f55172v.mo66161d(m66747C2) - this.f55172v.mo66156i();
        } else {
            View m66746D2 = m66746D2();
            this.f55171u.f55196h += this.f55172v.mo66152m();
            C11830c c11830c4 = this.f55171u;
            if (!this.f55175y) {
                i4 = -1;
            }
            c11830c4.f55193e = i4;
            int m66564x02 = m66564x0(m66746D2);
            C11830c c11830c5 = this.f55171u;
            c11830c4.f55192d = m66564x02 + c11830c5.f55193e;
            c11830c5.f55190b = this.f55172v.mo66158g(m66746D2);
            mo66152m = (-this.f55172v.mo66158g(m66746D2)) + this.f55172v.mo66152m();
        }
        C11830c c11830c6 = this.f55171u;
        c11830c6.f55191c = i2;
        if (z) {
            c11830c6.f55191c = i2 - mo66152m;
        }
        c11830c6.f55195g = mo66152m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11869y.InterfaceC11871b
    @SuppressLint({"UnknownNullness"})
    /* renamed from: a */
    public PointF mo51838a(int i) {
        if (m66594d0() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < m66564x0(m66597c0(0))) {
            z = true;
        }
        if (z != this.f55175y) {
            i2 = -1;
        }
        if (this.f55170t == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: a1 */
    public View mo66452a1(View view, int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        int m66715j2;
        View m66701x2;
        View m66747C2;
        m66733Q2();
        if (m66594d0() == 0 || (m66715j2 = m66715j2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m66713l2();
        m66724Z2(m66715j2, (int) (this.f55172v.mo66151n() * 0.33333334f), false, c11872z);
        C11830c c11830c = this.f55171u;
        c11830c.f55195g = Integer.MIN_VALUE;
        c11830c.f55189a = false;
        m66712m2(c11866v, c11830c, c11872z, true);
        if (m66715j2 == -1) {
            m66701x2 = m66700y2();
        } else {
            m66701x2 = m66701x2();
        }
        if (m66715j2 == -1) {
            m66747C2 = m66746D2();
        } else {
            m66747C2 = m66747C2();
        }
        if (m66747C2.hasFocusable()) {
            if (m66701x2 == null) {
                return null;
            }
            return m66747C2;
        }
        return m66701x2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: a2 */
    public void mo51837a2(RecyclerView recyclerView, RecyclerView.C11872z c11872z, int i) {
        C11939n c11939n = new C11939n(recyclerView.getContext());
        c11939n.setTargetPosition(i);
        m66598b2(c11939n);
    }

    /* renamed from: a3 */
    public final void m66723a3(int i, int i2) {
        int i3;
        this.f55171u.f55191c = this.f55172v.mo66156i() - i2;
        C11830c c11830c = this.f55171u;
        if (this.f55175y) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c11830c.f55193e = i3;
        c11830c.f55192d = i;
        c11830c.f55194f = 1;
        c11830c.f55190b = i2;
        c11830c.f55195g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: b1 */
    public void mo66450b1(AccessibilityEvent accessibilityEvent) {
        super.mo66450b1(accessibilityEvent);
        if (m66594d0() > 0) {
            accessibilityEvent.setFromIndex(m66707r2());
            accessibilityEvent.setToIndex(m66704u2());
        }
    }

    /* renamed from: b3 */
    public final void m66722b3(C11828a c11828a) {
        m66723a3(c11828a.f55181b, c11828a.f55182c);
    }

    /* renamed from: c3 */
    public final void m66721c3(int i, int i2) {
        int i3;
        this.f55171u.f55191c = i2 - this.f55172v.mo66152m();
        C11830c c11830c = this.f55171u;
        c11830c.f55192d = i;
        if (this.f55175y) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c11830c.f55193e = i3;
        c11830c.f55194f = -1;
        c11830c.f55190b = i2;
        c11830c.f55195g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: d2 */
    public boolean mo66447d2() {
        return this.f55165E == null && this.f55173w == this.f55176z;
    }

    /* renamed from: d3 */
    public final void m66720d3(C11828a c11828a) {
        m66721c3(c11828a.f55181b, c11828a.f55182c);
    }

    /* renamed from: e2 */
    public void mo49651e2(RecyclerView.C11872z c11872z, int[] iArr) {
        int i;
        int m66745E2 = m66745E2(c11872z);
        if (this.f55171u.f55194f == -1) {
            i = 0;
        } else {
            i = m66745E2;
            m66745E2 = 0;
        }
        iArr[0] = m66745E2;
        iArr[1] = i;
    }

    /* renamed from: f2 */
    public void mo66719f2(RecyclerView.C11872z c11872z, C11830c c11830c, RecyclerView.AbstractC11855p.InterfaceC11858c interfaceC11858c) {
        int i = c11830c.f55192d;
        if (i >= 0 && i < c11872z.m66490b()) {
            interfaceC11858c.mo66216a(i, Math.max(0, c11830c.f55195g));
        }
    }

    /* renamed from: g2 */
    public final int m66718g2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        m66713l2();
        return C11951t.m66136a(c11872z, this.f55172v, m66708q2(!this.f55161A, true), m66709p2(!this.f55161A, true), this, this.f55161A);
    }

    /* renamed from: h2 */
    public final int m66717h2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        m66713l2();
        return C11951t.m66135b(c11872z, this.f55172v, m66708q2(!this.f55161A, true), m66709p2(!this.f55161A, true), this, this.f55161A, this.f55175y);
    }

    /* renamed from: i2 */
    public final int m66716i2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        m66713l2();
        return C11951t.m66134c(c11872z, this.f55172v, m66708q2(!this.f55161A, true), m66709p2(!this.f55161A, true), this, this.f55161A);
    }

    /* renamed from: j2 */
    public int m66715j2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f55170t == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f55170t == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f55170t == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f55170t == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f55170t != 1 && m66743G2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f55170t == 1 || !m66743G2()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: k2 */
    public C11830c m66714k2() {
        return new C11830c();
    }

    /* renamed from: l2 */
    public void m66713l2() {
        if (this.f55171u == null) {
            this.f55171u = m66714k2();
        }
    }

    /* renamed from: m2 */
    public int m66712m2(RecyclerView.C11866v c11866v, C11830c c11830c, RecyclerView.C11872z c11872z, boolean z) {
        int i = c11830c.f55191c;
        int i2 = c11830c.f55195g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c11830c.f55195g = i2 + i;
            }
            m66738L2(c11866v, c11830c);
        }
        int i3 = c11830c.f55191c + c11830c.f55196h;
        C11829b c11829b = this.f55167G;
        while (true) {
            if ((!c11830c.f55201m && i3 <= 0) || !c11830c.m66686c(c11872z)) {
                break;
            }
            c11829b.m66689a();
            mo66741I2(c11866v, c11872z, c11830c, c11829b);
            if (!c11829b.f55186b) {
                c11830c.f55190b += c11829b.f55185a * c11830c.f55194f;
                if (!c11829b.f55187c || c11830c.f55200l != null || !c11872z.m66487e()) {
                    int i4 = c11830c.f55191c;
                    int i5 = c11829b.f55185a;
                    c11830c.f55191c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c11830c.f55195g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c11829b.f55185a;
                    c11830c.f55195g = i7;
                    int i8 = c11830c.f55191c;
                    if (i8 < 0) {
                        c11830c.f55195g = i7 + i8;
                    }
                    m66738L2(c11866v, c11830c);
                }
                if (z && c11829b.f55188d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c11830c.f55191c;
    }

    /* renamed from: n2 */
    public int m66711n2() {
        View m66702w2 = m66702w2(0, m66594d0(), true, false);
        if (m66702w2 == null) {
            return -1;
        }
        return m66564x0(m66702w2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: o1 */
    public void mo51798o1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m66749A2;
        int i6;
        View mo66607W;
        int mo66158g;
        int i7;
        int i8 = -1;
        if ((this.f55165E != null || this.f55162B != -1) && c11872z.m66490b() == 0) {
            m66646C1(c11866v);
            return;
        }
        SavedState savedState = this.f55165E;
        if (savedState != null && savedState.m66698a()) {
            this.f55162B = this.f55165E.f55177b;
        }
        m66713l2();
        this.f55171u.f55189a = false;
        m66733Q2();
        View m66579p0 = m66579p0();
        C11828a c11828a = this.f55166F;
        if (c11828a.f55184e && this.f55162B == -1 && this.f55165E == null) {
            if (m66579p0 != null && (this.f55172v.mo66158g(m66579p0) >= this.f55172v.mo66156i() || this.f55172v.mo66161d(m66579p0) <= this.f55172v.mo66152m())) {
                this.f55166F.m66692c(m66579p0, m66564x0(m66579p0));
            }
        } else {
            c11828a.m66690e();
            C11828a c11828a2 = this.f55166F;
            c11828a2.f55183d = this.f55175y ^ this.f55176z;
            m66725Y2(c11866v, c11872z, c11828a2);
            this.f55166F.f55184e = true;
        }
        C11830c c11830c = this.f55171u;
        if (c11830c.f55199k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        c11830c.f55194f = i;
        int[] iArr = this.f55169I;
        iArr[0] = 0;
        iArr[1] = 0;
        mo49651e2(c11872z, iArr);
        int max = Math.max(0, this.f55169I[0]) + this.f55172v.mo66152m();
        int max2 = Math.max(0, this.f55169I[1]) + this.f55172v.mo66155j();
        if (c11872z.m66487e() && (i6 = this.f55162B) != -1 && this.f55163C != Integer.MIN_VALUE && (mo66607W = mo66607W(i6)) != null) {
            if (this.f55175y) {
                i7 = this.f55172v.mo66156i() - this.f55172v.mo66161d(mo66607W);
                mo66158g = this.f55163C;
            } else {
                mo66158g = this.f55172v.mo66158g(mo66607W) - this.f55172v.mo66152m();
                i7 = this.f55163C;
            }
            int i9 = i7 - mo66158g;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        C11828a c11828a3 = this.f55166F;
        if (!c11828a3.f55183d ? !this.f55175y : this.f55175y) {
            i8 = 1;
        }
        mo66739K2(c11866v, c11872z, c11828a3, i8);
        m66620Q(c11866v);
        this.f55171u.f55201m = m66734P2();
        this.f55171u.f55198j = c11872z.m66487e();
        this.f55171u.f55197i = 0;
        C11828a c11828a4 = this.f55166F;
        if (c11828a4.f55183d) {
            m66720d3(c11828a4);
            C11830c c11830c2 = this.f55171u;
            c11830c2.f55196h = max;
            m66712m2(c11866v, c11830c2, c11872z, false);
            C11830c c11830c3 = this.f55171u;
            i3 = c11830c3.f55190b;
            int i10 = c11830c3.f55192d;
            int i11 = c11830c3.f55191c;
            if (i11 > 0) {
                max2 += i11;
            }
            m66722b3(this.f55166F);
            C11830c c11830c4 = this.f55171u;
            c11830c4.f55196h = max2;
            c11830c4.f55192d += c11830c4.f55193e;
            m66712m2(c11866v, c11830c4, c11872z, false);
            C11830c c11830c5 = this.f55171u;
            i2 = c11830c5.f55190b;
            int i12 = c11830c5.f55191c;
            if (i12 > 0) {
                m66721c3(i10, i3);
                C11830c c11830c6 = this.f55171u;
                c11830c6.f55196h = i12;
                m66712m2(c11866v, c11830c6, c11872z, false);
                i3 = this.f55171u.f55190b;
            }
        } else {
            m66722b3(c11828a4);
            C11830c c11830c7 = this.f55171u;
            c11830c7.f55196h = max2;
            m66712m2(c11866v, c11830c7, c11872z, false);
            C11830c c11830c8 = this.f55171u;
            i2 = c11830c8.f55190b;
            int i13 = c11830c8.f55192d;
            int i14 = c11830c8.f55191c;
            if (i14 > 0) {
                max += i14;
            }
            m66720d3(this.f55166F);
            C11830c c11830c9 = this.f55171u;
            c11830c9.f55196h = max;
            c11830c9.f55192d += c11830c9.f55193e;
            m66712m2(c11866v, c11830c9, c11872z, false);
            C11830c c11830c10 = this.f55171u;
            i3 = c11830c10.f55190b;
            int i15 = c11830c10.f55191c;
            if (i15 > 0) {
                m66723a3(i13, i2);
                C11830c c11830c11 = this.f55171u;
                c11830c11.f55196h = i15;
                m66712m2(c11866v, c11830c11, c11872z, false);
                i2 = this.f55171u.f55190b;
            }
        }
        if (m66594d0() > 0) {
            if (this.f55175y ^ this.f55176z) {
                int m66749A22 = m66749A2(i2, c11866v, c11872z, true);
                i4 = i3 + m66749A22;
                i5 = i2 + m66749A22;
                m66749A2 = m66748B2(i4, c11866v, c11872z, false);
            } else {
                int m66748B2 = m66748B2(i3, c11866v, c11872z, true);
                i4 = i3 + m66748B2;
                i5 = i2 + m66748B2;
                m66749A2 = m66749A2(i5, c11866v, c11872z, false);
            }
            i3 = i4 + m66749A2;
            i2 = i5 + m66749A2;
        }
        m66740J2(c11866v, c11872z, i3, i2);
        if (!c11872z.m66487e()) {
            this.f55172v.m66162s();
        } else {
            this.f55166F.m66690e();
        }
        this.f55173w = this.f55176z;
    }

    /* renamed from: o2 */
    public final View m66710o2() {
        return m66703v2(0, m66594d0());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: p1 */
    public void mo51795p1(RecyclerView.C11872z c11872z) {
        super.mo51795p1(c11872z);
        this.f55165E = null;
        this.f55162B = -1;
        this.f55163C = Integer.MIN_VALUE;
        this.f55166F.m66690e();
    }

    /* renamed from: p2 */
    public View m66709p2(boolean z, boolean z2) {
        if (this.f55175y) {
            return m66702w2(0, m66594d0(), z, z2);
        }
        return m66702w2(m66594d0() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.C11925l.InterfaceC11937i
    /* renamed from: q */
    public void mo66178q(View view, View view2, int i, int i2) {
        boolean z;
        mo66484A("Cannot drop a view during a scroll or layout calculation");
        m66713l2();
        m66733Q2();
        int m66564x0 = m66564x0(view);
        int m66564x02 = m66564x0(view2);
        if (m66564x0 < m66564x02) {
            z = true;
        } else {
            z = true;
        }
        if (this.f55175y) {
            if (z) {
                m66731S2(m66564x02, this.f55172v.mo66156i() - (this.f55172v.mo66158g(view2) + this.f55172v.mo66160e(view)));
            } else {
                m66731S2(m66564x02, this.f55172v.mo66156i() - this.f55172v.mo66161d(view2));
            }
        } else if (z) {
            m66731S2(m66564x02, this.f55172v.mo66158g(view2));
        } else {
            m66731S2(m66564x02, this.f55172v.mo66161d(view2) - this.f55172v.mo66160e(view));
        }
    }

    /* renamed from: q2 */
    public View m66708q2(boolean z, boolean z2) {
        if (this.f55175y) {
            return m66702w2(m66594d0() - 1, -1, z, z2);
        }
        return m66702w2(0, m66594d0(), z, z2);
    }

    /* renamed from: r2 */
    public int m66707r2() {
        View m66702w2 = m66702w2(0, m66594d0(), false, true);
        if (m66702w2 == null) {
            return -1;
        }
        return m66564x0(m66702w2);
    }

    /* renamed from: s2 */
    public int m66706s2() {
        View m66702w2 = m66702w2(m66594d0() - 1, -1, true, false);
        if (m66702w2 == null) {
            return -1;
        }
        return m66564x0(m66702w2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: t1 */
    public void mo51787t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f55165E = savedState;
            if (this.f55162B != -1) {
                savedState.m66697b();
            }
            m66627L1();
        }
    }

    /* renamed from: t2 */
    public final View m66705t2() {
        return m66703v2(m66594d0() - 1, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    @SuppressLint({"UnknownNullness"})
    /* renamed from: u1 */
    public Parcelable mo51784u1() {
        if (this.f55165E != null) {
            return new SavedState(this.f55165E);
        }
        SavedState savedState = new SavedState();
        if (m66594d0() > 0) {
            m66713l2();
            boolean z = this.f55173w ^ this.f55175y;
            savedState.f55179d = z;
            if (z) {
                View m66747C2 = m66747C2();
                savedState.f55178c = this.f55172v.mo66156i() - this.f55172v.mo66161d(m66747C2);
                savedState.f55177b = m66564x0(m66747C2);
            } else {
                View m66746D2 = m66746D2();
                savedState.f55177b = m66564x0(m66746D2);
                savedState.f55178c = this.f55172v.mo66158g(m66746D2) - this.f55172v.mo66152m();
            }
        } else {
            savedState.m66697b();
        }
        return savedState;
    }

    /* renamed from: u2 */
    public int m66704u2() {
        View m66702w2 = m66702w2(m66594d0() - 1, -1, false, true);
        if (m66702w2 == null) {
            return -1;
        }
        return m66564x0(m66702w2);
    }

    /* renamed from: v2 */
    public View m66703v2(int i, int i2) {
        char c;
        int i3;
        int i4;
        m66713l2();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return m66597c0(i);
        }
        if (this.f55172v.mo66158g(m66597c0(i)) < this.f55172v.mo66152m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f55170t == 0) {
            return this.f55233f.m66123a(i, i2, i3, i4);
        }
        return this.f55234g.m66123a(i, i2, i3, i4);
    }

    /* renamed from: w2 */
    public View m66702w2(int i, int i2, boolean z, boolean z2) {
        int i3;
        m66713l2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f55170t == 0) {
            return this.f55233f.m66123a(i, i2, i3, i4);
        }
        return this.f55234g.m66123a(i, i2, i3, i4);
    }

    /* renamed from: x2 */
    public final View m66701x2() {
        if (this.f55175y) {
            return m66710o2();
        }
        return m66705t2();
    }

    /* renamed from: y2 */
    public final View m66700y2() {
        if (this.f55175y) {
            return m66705t2();
        }
        return m66710o2();
    }

    /* renamed from: z2 */
    public View mo66699z2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        m66713l2();
        int m66594d0 = m66594d0();
        if (z2) {
            i2 = m66594d0() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m66594d0;
            i2 = 0;
            i3 = 1;
        }
        int m66490b = c11872z.m66490b();
        int mo66152m = this.f55172v.mo66152m();
        int mo66156i = this.f55172v.mo66156i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View m66597c0 = m66597c0(i2);
            int m66564x0 = m66564x0(m66597c0);
            int mo66158g = this.f55172v.mo66158g(m66597c0);
            int mo66161d = this.f55172v.mo66161d(m66597c0);
            if (m66564x0 >= 0 && m66564x0 < m66490b) {
                if (((RecyclerView.LayoutParams) m66597c0.getLayoutParams()).m66674c()) {
                    if (view3 == null) {
                        view3 = m66597c0;
                    }
                } else {
                    if (mo66161d <= mo66152m && mo66158g < mo66152m) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (mo66158g >= mo66156i && mo66161d > mo66156i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return m66597c0;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m66597c0;
                        }
                        view2 = m66597c0;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m66597c0;
                        }
                        view2 = m66597c0;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.f55170t = 1;
        this.f55174x = false;
        this.f55175y = false;
        this.f55176z = false;
        this.f55161A = true;
        this.f55162B = -1;
        this.f55163C = Integer.MIN_VALUE;
        this.f55165E = null;
        this.f55166F = new C11828a();
        this.f55167G = new C11829b();
        this.f55168H = 2;
        this.f55169I = new int[2];
        m66730T2(i);
        m66729U2(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f55170t = 1;
        this.f55174x = false;
        this.f55175y = false;
        this.f55176z = false;
        this.f55161A = true;
        this.f55162B = -1;
        this.f55163C = Integer.MIN_VALUE;
        this.f55165E = null;
        this.f55166F = new C11828a();
        this.f55167G = new C11829b();
        this.f55168H = 2;
        this.f55169I = new int[2];
        RecyclerView.AbstractC11855p.C11859d m66561y0 = RecyclerView.AbstractC11855p.m66561y0(context, attributeSet, i, i2);
        m66730T2(m66561y0.f55249a);
        m66729U2(m66561y0.f55251c);
        mo66728V2(m66561y0.f55252d);
    }
}
