package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC11855p implements RecyclerView.AbstractC11869y.InterfaceC11871b {

    /* renamed from: C */
    public BitSet f55296C;

    /* renamed from: H */
    public boolean f55301H;

    /* renamed from: I */
    public boolean f55302I;

    /* renamed from: J */
    public SavedState f55303J;

    /* renamed from: K */
    public int f55304K;

    /* renamed from: T */
    public int[] f55309T;

    /* renamed from: u */
    public C11877c[] f55312u;

    /* renamed from: v */
    public AbstractC11944q f55313v;

    /* renamed from: w */
    public AbstractC11944q f55314w;

    /* renamed from: x */
    public int f55315x;

    /* renamed from: y */
    public int f55316y;

    /* renamed from: z */
    public final C11938m f55317z;

    /* renamed from: t */
    public int f55311t = -1;

    /* renamed from: A */
    public boolean f55294A = false;

    /* renamed from: B */
    public boolean f55295B = false;

    /* renamed from: D */
    public int f55297D = -1;

    /* renamed from: E */
    public int f55298E = Integer.MIN_VALUE;

    /* renamed from: F */
    public LazySpanLookup f55299F = new LazySpanLookup();

    /* renamed from: G */
    public int f55300G = 2;

    /* renamed from: P */
    public final Rect f55305P = new Rect();

    /* renamed from: Q */
    public final C11876b f55306Q = new C11876b();

    /* renamed from: R */
    public boolean f55307R = false;

    /* renamed from: S */
    public boolean f55308S = true;

    /* renamed from: U */
    public final Runnable f55310U = new RunnableC11875a();

    /* loaded from: classes.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: f */
        public C11877c f55318f;

        /* renamed from: g */
        public boolean f55319g;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public boolean m66413e() {
            return this.f55319g;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11874a();

        /* renamed from: b */
        public int f55326b;

        /* renamed from: c */
        public int f55327c;

        /* renamed from: d */
        public int f55328d;

        /* renamed from: e */
        public int[] f55329e;

        /* renamed from: f */
        public int f55330f;

        /* renamed from: g */
        public int[] f55331g;

        /* renamed from: h */
        public List<LazySpanLookup.FullSpanItem> f55332h;

        /* renamed from: i */
        public boolean f55333i;

        /* renamed from: j */
        public boolean f55334j;

        /* renamed from: k */
        public boolean f55335k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        /* loaded from: classes.dex */
        public class C11874a implements Parcelable.Creator<SavedState> {
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
        public void m66394a() {
            this.f55329e = null;
            this.f55328d = 0;
            this.f55326b = -1;
            this.f55327c = -1;
        }

        /* renamed from: b */
        public void m66393b() {
            this.f55329e = null;
            this.f55328d = 0;
            this.f55330f = 0;
            this.f55331g = null;
            this.f55332h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f55326b);
            parcel.writeInt(this.f55327c);
            parcel.writeInt(this.f55328d);
            if (this.f55328d > 0) {
                parcel.writeIntArray(this.f55329e);
            }
            parcel.writeInt(this.f55330f);
            if (this.f55330f > 0) {
                parcel.writeIntArray(this.f55331g);
            }
            parcel.writeInt(this.f55333i ? 1 : 0);
            parcel.writeInt(this.f55334j ? 1 : 0);
            parcel.writeInt(this.f55335k ? 1 : 0);
            parcel.writeList(this.f55332h);
        }

        public SavedState(Parcel parcel) {
            this.f55326b = parcel.readInt();
            this.f55327c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f55328d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f55329e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f55330f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f55331g = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f55333i = parcel.readInt() == 1;
            this.f55334j = parcel.readInt() == 1;
            this.f55335k = parcel.readInt() == 1;
            this.f55332h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f55328d = savedState.f55328d;
            this.f55326b = savedState.f55326b;
            this.f55327c = savedState.f55327c;
            this.f55329e = savedState.f55329e;
            this.f55330f = savedState.f55330f;
            this.f55331g = savedState.f55331g;
            this.f55333i = savedState.f55333i;
            this.f55334j = savedState.f55334j;
            this.f55335k = savedState.f55335k;
            this.f55332h = savedState.f55332h;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: classes.dex */
    public class RunnableC11875a implements Runnable {
        public RunnableC11875a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m66432k2();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: classes.dex */
    public class C11876b {

        /* renamed from: a */
        public int f55337a;

        /* renamed from: b */
        public int f55338b;

        /* renamed from: c */
        public boolean f55339c;

        /* renamed from: d */
        public boolean f55340d;

        /* renamed from: e */
        public boolean f55341e;

        /* renamed from: f */
        public int[] f55342f;

        public C11876b() {
            m66388c();
        }

        /* renamed from: a */
        public void m66390a() {
            int mo66152m;
            if (this.f55339c) {
                mo66152m = StaggeredGridLayoutManager.this.f55313v.mo66156i();
            } else {
                mo66152m = StaggeredGridLayoutManager.this.f55313v.mo66152m();
            }
            this.f55338b = mo66152m;
        }

        /* renamed from: b */
        public void m66389b(int i) {
            if (this.f55339c) {
                this.f55338b = StaggeredGridLayoutManager.this.f55313v.mo66156i() - i;
            } else {
                this.f55338b = StaggeredGridLayoutManager.this.f55313v.mo66152m() + i;
            }
        }

        /* renamed from: c */
        public void m66388c() {
            this.f55337a = -1;
            this.f55338b = Integer.MIN_VALUE;
            this.f55339c = false;
            this.f55340d = false;
            this.f55341e = false;
            int[] iArr = this.f55342f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        public void m66387d(C11877c[] c11877cArr) {
            int length = c11877cArr.length;
            int[] iArr = this.f55342f;
            if (iArr == null || iArr.length < length) {
                this.f55342f = new int[StaggeredGridLayoutManager.this.f55312u.length];
            }
            for (int i = 0; i < length; i++) {
                this.f55342f[i] = c11877cArr[i].m66371p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: classes.dex */
    public class C11877c {

        /* renamed from: a */
        public ArrayList<View> f55344a = new ArrayList<>();

        /* renamed from: b */
        public int f55345b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f55346c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f55347d = 0;

        /* renamed from: e */
        public final int f55348e;

        public C11877c(int i) {
            this.f55348e = i;
        }

        /* renamed from: a */
        public void m66386a(View view) {
            LayoutParams m66373n = m66373n(view);
            m66373n.f55318f = this;
            this.f55344a.add(view);
            this.f55346c = Integer.MIN_VALUE;
            if (this.f55344a.size() == 1) {
                this.f55345b = Integer.MIN_VALUE;
            }
            if (m66373n.m66674c() || m66373n.m66675b()) {
                this.f55347d += StaggeredGridLayoutManager.this.f55313v.mo66160e(view);
            }
        }

        /* renamed from: b */
        public void m66385b(boolean z, int i) {
            int m66371p;
            if (z) {
                m66371p = m66375l(Integer.MIN_VALUE);
            } else {
                m66371p = m66371p(Integer.MIN_VALUE);
            }
            m66382e();
            if (m66371p == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m66371p >= StaggeredGridLayoutManager.this.f55313v.mo66156i()) {
                if (!z && m66371p > StaggeredGridLayoutManager.this.f55313v.mo66152m()) {
                    return;
                }
                if (i != Integer.MIN_VALUE) {
                    m66371p += i;
                }
                this.f55346c = m66371p;
                this.f55345b = m66371p;
            }
        }

        /* renamed from: c */
        public void m66384c() {
            LazySpanLookup.FullSpanItem m66407f;
            ArrayList<View> arrayList = this.f55344a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams m66373n = m66373n(view);
            this.f55346c = StaggeredGridLayoutManager.this.f55313v.mo66161d(view);
            if (m66373n.f55319g && (m66407f = StaggeredGridLayoutManager.this.f55299F.m66407f(m66373n.m66676a())) != null && m66407f.f55323c == 1) {
                this.f55346c += m66407f.m66397a(this.f55348e);
            }
        }

        /* renamed from: d */
        public void m66383d() {
            LazySpanLookup.FullSpanItem m66407f;
            View view = this.f55344a.get(0);
            LayoutParams m66373n = m66373n(view);
            this.f55345b = StaggeredGridLayoutManager.this.f55313v.mo66158g(view);
            if (m66373n.f55319g && (m66407f = StaggeredGridLayoutManager.this.f55299F.m66407f(m66373n.m66676a())) != null && m66407f.f55323c == -1) {
                this.f55345b -= m66407f.m66397a(this.f55348e);
            }
        }

        /* renamed from: e */
        public void m66382e() {
            this.f55344a.clear();
            m66370q();
            this.f55347d = 0;
        }

        /* renamed from: f */
        public int m66381f() {
            if (StaggeredGridLayoutManager.this.f55294A) {
                return m66378i(this.f55344a.size() - 1, -1, true);
            }
            return m66378i(0, this.f55344a.size(), true);
        }

        /* renamed from: g */
        public int m66380g() {
            if (StaggeredGridLayoutManager.this.f55294A) {
                return m66378i(0, this.f55344a.size(), true);
            }
            return m66378i(this.f55344a.size() - 1, -1, true);
        }

        /* renamed from: h */
        public int m66379h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int mo66152m = StaggeredGridLayoutManager.this.f55313v.mo66152m();
            int mo66156i = StaggeredGridLayoutManager.this.f55313v.mo66156i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f55344a.get(i);
                int mo66158g = StaggeredGridLayoutManager.this.f55313v.mo66158g(view);
                int mo66161d = StaggeredGridLayoutManager.this.f55313v.mo66161d(view);
                boolean z5 = false;
                if (!z3 ? mo66158g < mo66156i : mo66158g <= mo66156i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z3 ? mo66161d > mo66152m : mo66161d >= mo66152m) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z && z2) {
                        if (mo66158g >= mo66152m && mo66161d <= mo66156i) {
                            return StaggeredGridLayoutManager.this.m66564x0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.m66564x0(view);
                    } else {
                        if (mo66158g < mo66152m || mo66161d > mo66156i) {
                            return StaggeredGridLayoutManager.this.m66564x0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        public int m66378i(int i, int i2, boolean z) {
            return m66379h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m66377j() {
            return this.f55347d;
        }

        /* renamed from: k */
        public int m66376k() {
            int i = this.f55346c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m66384c();
            return this.f55346c;
        }

        /* renamed from: l */
        public int m66375l(int i) {
            int i2 = this.f55346c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f55344a.size() == 0) {
                return i;
            }
            m66384c();
            return this.f55346c;
        }

        /* renamed from: m */
        public View m66374m(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f55344a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.f55344a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f55294A && staggeredGridLayoutManager.m66564x0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f55294A && staggeredGridLayoutManager2.m66564x0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.f55344a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f55344a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f55294A && staggeredGridLayoutManager3.m66564x0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f55294A && staggeredGridLayoutManager4.m66564x0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        public LayoutParams m66373n(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: o */
        public int m66372o() {
            int i = this.f55345b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m66383d();
            return this.f55345b;
        }

        /* renamed from: p */
        public int m66371p(int i) {
            int i2 = this.f55345b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f55344a.size() == 0) {
                return i;
            }
            m66383d();
            return this.f55345b;
        }

        /* renamed from: q */
        public void m66370q() {
            this.f55345b = Integer.MIN_VALUE;
            this.f55346c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        public void m66369r(int i) {
            int i2 = this.f55345b;
            if (i2 != Integer.MIN_VALUE) {
                this.f55345b = i2 + i;
            }
            int i3 = this.f55346c;
            if (i3 != Integer.MIN_VALUE) {
                this.f55346c = i3 + i;
            }
        }

        /* renamed from: s */
        public void m66368s() {
            int size = this.f55344a.size();
            View remove = this.f55344a.remove(size - 1);
            LayoutParams m66373n = m66373n(remove);
            m66373n.f55318f = null;
            if (m66373n.m66674c() || m66373n.m66675b()) {
                this.f55347d -= StaggeredGridLayoutManager.this.f55313v.mo66160e(remove);
            }
            if (size == 1) {
                this.f55345b = Integer.MIN_VALUE;
            }
            this.f55346c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        public void m66367t() {
            View remove = this.f55344a.remove(0);
            LayoutParams m66373n = m66373n(remove);
            m66373n.f55318f = null;
            if (this.f55344a.size() == 0) {
                this.f55346c = Integer.MIN_VALUE;
            }
            if (m66373n.m66674c() || m66373n.m66675b()) {
                this.f55347d -= StaggeredGridLayoutManager.this.f55313v.mo66160e(remove);
            }
            this.f55345b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        public void m66366u(View view) {
            LayoutParams m66373n = m66373n(view);
            m66373n.f55318f = this;
            this.f55344a.add(0, view);
            this.f55345b = Integer.MIN_VALUE;
            if (this.f55344a.size() == 1) {
                this.f55346c = Integer.MIN_VALUE;
            }
            if (m66373n.m66674c() || m66373n.m66675b()) {
                this.f55347d += StaggeredGridLayoutManager.this.f55313v.mo66160e(view);
            }
        }

        /* renamed from: v */
        public void m66365v(int i) {
            this.f55345b = i;
            this.f55346c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC11855p.C11859d m66561y0 = RecyclerView.AbstractC11855p.m66561y0(context, attributeSet, i, i2);
        m66449b3(m66561y0.f55249a);
        m66446d3(m66561y0.f55250b);
        m66448c3(m66561y0.f55251c);
        this.f55317z = new C11938m();
        m66422s2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: A */
    public void mo66484A(String str) {
        if (this.f55303J == null) {
            super.mo66484A(str);
        }
    }

    /* renamed from: A2 */
    public final void m66483A2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        int mo66152m;
        int m66477G2 = m66477G2(Integer.MAX_VALUE);
        if (m66477G2 != Integer.MAX_VALUE && (mo66152m = m66477G2 - this.f55313v.mo66152m()) > 0) {
            int m66453Z2 = mo66152m - m66453Z2(mo66152m, c11866v, c11872z);
            if (z && m66453Z2 > 0) {
                this.f55313v.mo66148r(-m66453Z2);
            }
        }
    }

    /* renamed from: B2 */
    public int m66482B2() {
        if (m66594d0() == 0) {
            return 0;
        }
        return m66564x0(m66597c0(0));
    }

    /* renamed from: C2 */
    public int m66481C2() {
        int m66594d0 = m66594d0();
        if (m66594d0 == 0) {
            return 0;
        }
        return m66564x0(m66597c0(m66594d0 - 1));
    }

    /* renamed from: D2 */
    public final int m66480D2(int i) {
        int m66375l = this.f55312u[0].m66375l(i);
        for (int i2 = 1; i2 < this.f55311t; i2++) {
            int m66375l2 = this.f55312u[i2].m66375l(i);
            if (m66375l2 > m66375l) {
                m66375l = m66375l2;
            }
        }
        return m66375l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: E */
    public boolean mo51880E() {
        return this.f55315x == 0;
    }

    /* renamed from: E2 */
    public final int m66479E2(int i) {
        int m66371p = this.f55312u[0].m66371p(i);
        for (int i2 = 1; i2 < this.f55311t; i2++) {
            int m66371p2 = this.f55312u[i2].m66371p(i);
            if (m66371p2 > m66371p) {
                m66371p = m66371p2;
            }
        }
        return m66371p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: F */
    public boolean mo51878F() {
        return this.f55315x == 1;
    }

    /* renamed from: F2 */
    public final int m66478F2(int i) {
        int m66375l = this.f55312u[0].m66375l(i);
        for (int i2 = 1; i2 < this.f55311t; i2++) {
            int m66375l2 = this.f55312u[i2].m66375l(i);
            if (m66375l2 < m66375l) {
                m66375l = m66375l2;
            }
        }
        return m66375l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: G */
    public boolean mo51876G(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: G2 */
    public final int m66477G2(int i) {
        int m66371p = this.f55312u[0].m66371p(i);
        for (int i2 = 1; i2 < this.f55311t; i2++) {
            int m66371p2 = this.f55312u[i2].m66371p(i);
            if (m66371p2 < m66371p) {
                m66371p = m66371p2;
            }
        }
        return m66371p;
    }

    /* renamed from: H2 */
    public final C11877c m66476H2(C11938m c11938m) {
        int i;
        int i2;
        int i3;
        if (m66465R2(c11938m.f55571e)) {
            i2 = this.f55311t - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f55311t;
            i2 = 0;
            i3 = 1;
        }
        C11877c c11877c = null;
        if (c11938m.f55571e == 1) {
            int mo66152m = this.f55313v.mo66152m();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                C11877c c11877c2 = this.f55312u[i2];
                int m66375l = c11877c2.m66375l(mo66152m);
                if (m66375l < i4) {
                    c11877c = c11877c2;
                    i4 = m66375l;
                }
                i2 += i3;
            }
            return c11877c;
        }
        int mo66156i = this.f55313v.mo66156i();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            C11877c c11877c3 = this.f55312u[i2];
            int m66371p = c11877c3.m66371p(mo66156i);
            if (m66371p > i5) {
                c11877c = c11877c3;
                i5 = m66371p;
            }
            i2 += i3;
        }
        return c11877c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: I */
    public void mo66475I(int i, int i2, RecyclerView.C11872z c11872z, RecyclerView.AbstractC11855p.InterfaceC11858c interfaceC11858c) {
        int m66375l;
        int i3;
        if (this.f55315x != 0) {
            i = i2;
        }
        if (m66594d0() != 0 && i != 0) {
            m66464S2(i, c11872z);
            int[] iArr = this.f55309T;
            if (iArr == null || iArr.length < this.f55311t) {
                this.f55309T = new int[this.f55311t];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f55311t; i5++) {
                C11938m c11938m = this.f55317z;
                if (c11938m.f55570d == -1) {
                    m66375l = c11938m.f55572f;
                    i3 = this.f55312u[i5].m66371p(m66375l);
                } else {
                    m66375l = this.f55312u[i5].m66375l(c11938m.f55573g);
                    i3 = this.f55317z.f55573g;
                }
                int i6 = m66375l - i3;
                if (i6 >= 0) {
                    this.f55309T[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.f55309T, 0, i4);
            for (int i7 = 0; i7 < i4 && this.f55317z.m66177a(c11872z); i7++) {
                interfaceC11858c.mo66216a(this.f55317z.f55569c, this.f55309T[i7]);
                C11938m c11938m2 = this.f55317z;
                c11938m2.f55569c += c11938m2.f55570d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: I0 */
    public boolean mo51873I0() {
        return this.f55300G != 0;
    }

    /* renamed from: I2 */
    public int m66474I2() {
        return this.f55315x;
    }

    /* renamed from: J2 */
    public int m66473J2() {
        return this.f55311t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: K */
    public int mo51870K(RecyclerView.C11872z c11872z) {
        return m66428m2(c11872z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: K2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m66472K2(int i, int i2, int i3) {
        int m66482B2;
        int i4;
        int i5;
        int m66481C2;
        if (this.f55295B) {
            m66482B2 = m66481C2();
        } else {
            m66482B2 = m66482B2();
        }
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
                this.f55299F.m66405h(i5);
                if (i3 == 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            this.f55299F.m66402k(i, 1);
                            this.f55299F.m66403j(i2, 1);
                        }
                    } else {
                        this.f55299F.m66402k(i, i2);
                    }
                } else {
                    this.f55299F.m66403j(i, i2);
                }
                if (i4 > m66482B2) {
                    return;
                }
                if (this.f55295B) {
                    m66481C2 = m66482B2();
                } else {
                    m66481C2 = m66481C2();
                }
                if (i5 <= m66481C2) {
                    m66627L1();
                    return;
                }
                return;
            }
        } else {
            i4 = i + i2;
        }
        i5 = i;
        this.f55299F.m66405h(i5);
        if (i3 == 1) {
        }
        if (i4 > m66482B2) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: L */
    public int mo51868L(RecyclerView.C11872z c11872z) {
        return m66427n2(c11872z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: L2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m66471L2() {
        char c;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int m66594d0 = m66594d0() - 1;
        BitSet bitSet = new BitSet(this.f55311t);
        bitSet.set(0, this.f55311t, true);
        int i3 = -1;
        if (this.f55315x == 1 && m66469N2()) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.f55295B) {
            i = -1;
        } else {
            i = m66594d0 + 1;
            m66594d0 = 0;
        }
        if (m66594d0 < i) {
            i3 = 1;
        }
        while (m66594d0 != i) {
            View m66597c0 = m66597c0(m66594d0);
            LayoutParams layoutParams = (LayoutParams) m66597c0.getLayoutParams();
            if (bitSet.get(layoutParams.f55318f.f55348e)) {
                if (m66430l2(layoutParams.f55318f)) {
                    return m66597c0;
                }
                bitSet.clear(layoutParams.f55318f.f55348e);
            }
            if (!layoutParams.f55319g && (i2 = m66594d0 + i3) != i) {
                View m66597c02 = m66597c0(i2);
                if (this.f55295B) {
                    int mo66161d = this.f55313v.mo66161d(m66597c0);
                    int mo66161d2 = this.f55313v.mo66161d(m66597c02);
                    if (mo66161d < mo66161d2) {
                        return m66597c0;
                    }
                } else {
                    int mo66158g = this.f55313v.mo66158g(m66597c0);
                    int mo66158g2 = this.f55313v.mo66158g(m66597c02);
                    if (mo66158g > mo66158g2) {
                        return m66597c0;
                    }
                }
                if (z) {
                    if (layoutParams.f55318f.f55348e - ((LayoutParams) m66597c02.getLayoutParams()).f55318f.f55348e < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 != z3) {
                        return m66597c0;
                    }
                } else {
                    continue;
                }
            }
            m66594d0 += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: M */
    public int mo51866M(RecyclerView.C11872z c11872z) {
        return m66426o2(c11872z);
    }

    /* renamed from: M2 */
    public void m66470M2() {
        this.f55299F.m66411b();
        m66627L1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: N */
    public int mo51864N(RecyclerView.C11872z c11872z) {
        return m66428m2(c11872z);
    }

    /* renamed from: N2 */
    public boolean m66469N2() {
        return m66572t0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: O */
    public int mo51861O(RecyclerView.C11872z c11872z) {
        return m66427n2(c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: O1 */
    public int mo51860O1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        return m66453Z2(i, c11866v, c11872z);
    }

    /* renamed from: O2 */
    public final void m66468O2(View view, int i, int i2, boolean z) {
        boolean m66604X1;
        m66645D(view, this.f55305P);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.f55305P;
        int m66429l3 = m66429l3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.f55305P;
        int m66429l32 = m66429l3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z) {
            m66604X1 = m66601Z1(view, m66429l3, m66429l32, layoutParams);
        } else {
            m66604X1 = m66604X1(view, m66429l3, m66429l32, layoutParams);
        }
        if (m66604X1) {
            view.measure(m66429l3, m66429l32);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: P */
    public int mo51858P(RecyclerView.C11872z c11872z) {
        return m66426o2(c11872z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: P1 */
    public void mo51857P1(int i) {
        SavedState savedState = this.f55303J;
        if (savedState != null && savedState.f55326b != i) {
            savedState.m66394a();
        }
        this.f55297D = i;
        this.f55298E = Integer.MIN_VALUE;
        m66627L1();
    }

    /* renamed from: P2 */
    public final void m66467P2(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f55319g) {
            if (this.f55315x == 1) {
                m66468O2(view, this.f55304K, RecyclerView.AbstractC11855p.m66592e0(m66578q0(), m66576r0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
            } else {
                m66468O2(view, RecyclerView.AbstractC11855p.m66592e0(m66642E0(), m66640F0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), this.f55304K, z);
            }
        } else if (this.f55315x == 1) {
            m66468O2(view, RecyclerView.AbstractC11855p.m66592e0(this.f55316y, m66640F0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.AbstractC11855p.m66592e0(m66578q0(), m66576r0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
        } else {
            m66468O2(view, RecyclerView.AbstractC11855p.m66592e0(m66642E0(), m66640F0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.AbstractC11855p.m66592e0(this.f55316y, m66576r0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Q1 */
    public int mo51855Q1(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        return m66453Z2(i, c11866v, c11872z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (m66432k2() != false) goto L83;
     */
    /* renamed from: Q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m66466Q2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        boolean z2;
        boolean z3;
        SavedState savedState;
        C11876b c11876b = this.f55306Q;
        if ((this.f55303J != null || this.f55297D != -1) && c11872z.m66490b() == 0) {
            m66646C1(c11866v);
            c11876b.m66388c();
            return;
        }
        boolean z4 = true;
        if (c11876b.f55341e && this.f55297D == -1 && this.f55303J == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            c11876b.m66388c();
            if (this.f55303J != null) {
                m66443f2(c11876b);
            } else {
                m66455Y2();
                c11876b.f55339c = this.f55295B;
            }
            m66438h3(c11872z, c11876b);
            c11876b.f55341e = true;
        }
        if (this.f55303J == null && this.f55297D == -1 && (c11876b.f55339c != this.f55301H || m66469N2() != this.f55302I)) {
            this.f55299F.m66411b();
            c11876b.f55340d = true;
        }
        if (m66594d0() > 0 && ((savedState = this.f55303J) == null || savedState.f55328d < 1)) {
            if (c11876b.f55340d) {
                for (int i = 0; i < this.f55311t; i++) {
                    this.f55312u[i].m66382e();
                    int i2 = c11876b.f55338b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f55312u[i].m66365v(i2);
                    }
                }
            } else if (!z2 && this.f55306Q.f55342f != null) {
                for (int i3 = 0; i3 < this.f55311t; i3++) {
                    C11877c c11877c = this.f55312u[i3];
                    c11877c.m66382e();
                    c11877c.m66365v(this.f55306Q.f55342f[i3]);
                }
            } else {
                for (int i4 = 0; i4 < this.f55311t; i4++) {
                    this.f55312u[i4].m66385b(this.f55295B, c11876b.f55338b);
                }
                this.f55306Q.m66387d(this.f55312u);
            }
        }
        m66620Q(c11866v);
        this.f55317z.f55567a = false;
        this.f55307R = false;
        m66433j3(this.f55314w.mo66151n());
        m66436i3(c11876b.f55337a, c11872z);
        if (c11876b.f55339c) {
            m66451a3(-1);
            m66421t2(c11866v, this.f55317z, c11872z);
            m66451a3(1);
            C11938m c11938m = this.f55317z;
            c11938m.f55569c = c11876b.f55337a + c11938m.f55570d;
            m66421t2(c11866v, c11938m, c11872z);
        } else {
            m66451a3(1);
            m66421t2(c11866v, this.f55317z, c11872z);
            m66451a3(-1);
            C11938m c11938m2 = this.f55317z;
            c11938m2.f55569c = c11876b.f55337a + c11938m2.f55570d;
            m66421t2(c11866v, c11938m2, c11872z);
        }
        m66456X2();
        if (m66594d0() > 0) {
            if (this.f55295B) {
                m66414z2(c11866v, c11872z, true);
                m66483A2(c11866v, c11872z, false);
            } else {
                m66483A2(c11866v, c11872z, true);
                m66414z2(c11866v, c11872z, false);
            }
        }
        if (z && !c11872z.m66487e()) {
            if (this.f55300G != 0 && m66594d0() > 0 && (this.f55307R || m66471L2() != null)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                m66637G1(this.f55310U);
            }
        }
        z4 = false;
        if (c11872z.m66487e()) {
            this.f55306Q.m66388c();
        }
        this.f55301H = c11876b.f55339c;
        this.f55302I = m66469N2();
        if (z4) {
            this.f55306Q.m66388c();
            m66466Q2(c11866v, c11872z, false);
        }
    }

    /* renamed from: R2 */
    public final boolean m66465R2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f55315x == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f55295B) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f55295B) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == m66469N2()) {
            return true;
        }
        return false;
    }

    /* renamed from: S2 */
    public void m66464S2(int i, RecyclerView.C11872z c11872z) {
        int m66482B2;
        int i2;
        if (i > 0) {
            m66482B2 = m66481C2();
            i2 = 1;
        } else {
            m66482B2 = m66482B2();
            i2 = -1;
        }
        this.f55317z.f55567a = true;
        m66436i3(m66482B2, c11872z);
        m66451a3(i2);
        C11938m c11938m = this.f55317z;
        c11938m.f55569c = m66482B2 + c11938m.f55570d;
        c11938m.f55568b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: T0 */
    public void mo66463T0(int i) {
        super.mo66463T0(i);
        for (int i2 = 0; i2 < this.f55311t; i2++) {
            this.f55312u[i2].m66369r(i);
        }
    }

    /* renamed from: T2 */
    public final void m66462T2(View view) {
        for (int i = this.f55311t - 1; i >= 0; i--) {
            this.f55312u[i].m66366u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: U0 */
    public void mo66461U0(int i) {
        super.mo66461U0(i);
        for (int i2 = 0; i2 < this.f55311t; i2++) {
            this.f55312u[i2].m66369r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: U1 */
    public void mo66460U1(Rect rect, int i, int i2) {
        int m66636H;
        int m66636H2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f55315x == 1) {
            m66636H2 = RecyclerView.AbstractC11855p.m66636H(i2, rect.height() + paddingTop, m66569v0());
            m66636H = RecyclerView.AbstractC11855p.m66636H(i, (this.f55316y * this.f55311t) + paddingLeft, m66567w0());
        } else {
            m66636H = RecyclerView.AbstractC11855p.m66636H(i, rect.width() + paddingLeft, m66567w0());
            m66636H2 = RecyclerView.AbstractC11855p.m66636H(i2, (this.f55316y * this.f55311t) + paddingTop, m66569v0());
        }
        m66611T1(m66636H, m66636H2);
    }

    /* renamed from: U2 */
    public final void m66459U2(RecyclerView.C11866v c11866v, C11938m c11938m) {
        int min;
        int min2;
        if (c11938m.f55567a && !c11938m.f55575i) {
            if (c11938m.f55568b == 0) {
                if (c11938m.f55571e == -1) {
                    m66458V2(c11866v, c11938m.f55573g);
                } else {
                    m66457W2(c11866v, c11938m.f55572f);
                }
            } else if (c11938m.f55571e == -1) {
                int i = c11938m.f55572f;
                int m66479E2 = i - m66479E2(i);
                if (m66479E2 < 0) {
                    min2 = c11938m.f55573g;
                } else {
                    min2 = c11938m.f55573g - Math.min(m66479E2, c11938m.f55568b);
                }
                m66458V2(c11866v, min2);
            } else {
                int m66478F2 = m66478F2(c11938m.f55573g) - c11938m.f55573g;
                if (m66478F2 < 0) {
                    min = c11938m.f55572f;
                } else {
                    min = Math.min(m66478F2, c11938m.f55568b) + c11938m.f55572f;
                }
                m66457W2(c11866v, min);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: V0 */
    public void mo51849V0(RecyclerView.AbstractC11843h abstractC11843h, RecyclerView.AbstractC11843h abstractC11843h2) {
        this.f55299F.m66411b();
        for (int i = 0; i < this.f55311t; i++) {
            this.f55312u[i].m66382e();
        }
    }

    /* renamed from: V2 */
    public final void m66458V2(RecyclerView.C11866v c11866v, int i) {
        for (int m66594d0 = m66594d0() - 1; m66594d0 >= 0; m66594d0--) {
            View m66597c0 = m66597c0(m66594d0);
            if (this.f55313v.mo66158g(m66597c0) >= i && this.f55313v.mo66149q(m66597c0) >= i) {
                LayoutParams layoutParams = (LayoutParams) m66597c0.getLayoutParams();
                if (layoutParams.f55319g) {
                    for (int i2 = 0; i2 < this.f55311t; i2++) {
                        if (this.f55312u[i2].f55344a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f55311t; i3++) {
                        this.f55312u[i3].m66368s();
                    }
                } else if (layoutParams.f55318f.f55344a.size() == 1) {
                    return;
                } else {
                    layoutParams.f55318f.m66368s();
                }
                m66641E1(m66597c0, c11866v);
            } else {
                return;
            }
        }
    }

    /* renamed from: W2 */
    public final void m66457W2(RecyclerView.C11866v c11866v, int i) {
        while (m66594d0() > 0) {
            View m66597c0 = m66597c0(0);
            if (this.f55313v.mo66161d(m66597c0) <= i && this.f55313v.mo66150p(m66597c0) <= i) {
                LayoutParams layoutParams = (LayoutParams) m66597c0.getLayoutParams();
                if (layoutParams.f55319g) {
                    for (int i2 = 0; i2 < this.f55311t; i2++) {
                        if (this.f55312u[i2].f55344a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f55311t; i3++) {
                        this.f55312u[i3].m66367t();
                    }
                } else if (layoutParams.f55318f.f55344a.size() == 1) {
                    return;
                } else {
                    layoutParams.f55318f.m66367t();
                }
                m66641E1(m66597c0, c11866v);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: X */
    public RecyclerView.LayoutParams mo51846X() {
        if (this.f55315x == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: X2 */
    public final void m66456X2() {
        if (this.f55314w.mo66154k() == 1073741824) {
            return;
        }
        int m66594d0 = m66594d0();
        float f = 0.0f;
        for (int i = 0; i < m66594d0; i++) {
            View m66597c0 = m66597c0(i);
            float mo66160e = this.f55314w.mo66160e(m66597c0);
            if (mo66160e >= f) {
                if (((LayoutParams) m66597c0.getLayoutParams()).m66413e()) {
                    mo66160e = (mo66160e * 1.0f) / this.f55311t;
                }
                f = Math.max(f, mo66160e);
            }
        }
        int i2 = this.f55316y;
        int round = Math.round(f * this.f55311t);
        if (this.f55314w.mo66154k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f55314w.mo66151n());
        }
        m66433j3(round);
        if (this.f55316y == i2) {
            return;
        }
        for (int i3 = 0; i3 < m66594d0; i3++) {
            View m66597c02 = m66597c0(i3);
            LayoutParams layoutParams = (LayoutParams) m66597c02.getLayoutParams();
            if (!layoutParams.f55319g) {
                if (m66469N2() && this.f55315x == 1) {
                    int i4 = this.f55311t;
                    int i5 = layoutParams.f55318f.f55348e;
                    m66597c02.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f55316y) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = layoutParams.f55318f.f55348e;
                    int i7 = this.f55316y * i6;
                    int i8 = i6 * i2;
                    if (this.f55315x == 1) {
                        m66597c02.offsetLeftAndRight(i7 - i8);
                    } else {
                        m66597c02.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Y */
    public RecyclerView.LayoutParams mo51842Y(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: Y2 */
    public final void m66455Y2() {
        if (this.f55315x != 1 && m66469N2()) {
            this.f55295B = !this.f55294A;
        } else {
            this.f55295B = this.f55294A;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Z */
    public RecyclerView.LayoutParams mo66454Z(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: Z0 */
    public void mo51840Z0(RecyclerView recyclerView, RecyclerView.C11866v c11866v) {
        super.mo51840Z0(recyclerView, c11866v);
        m66637G1(this.f55310U);
        for (int i = 0; i < this.f55311t; i++) {
            this.f55312u[i].m66382e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: Z2 */
    public int m66453Z2(int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0 || i == 0) {
            return 0;
        }
        m66464S2(i, c11872z);
        int m66421t2 = m66421t2(c11866v, this.f55317z, c11872z);
        if (this.f55317z.f55568b >= m66421t2) {
            if (i < 0) {
                i = -m66421t2;
            } else {
                i = m66421t2;
            }
        }
        this.f55313v.mo66148r(-i);
        this.f55301H = this.f55295B;
        C11938m c11938m = this.f55317z;
        c11938m.f55568b = 0;
        m66459U2(c11866v, c11938m);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11869y.InterfaceC11871b
    /* renamed from: a */
    public PointF mo51838a(int i) {
        int m66434j2 = m66434j2(i);
        PointF pointF = new PointF();
        if (m66434j2 == 0) {
            return null;
        }
        if (this.f55315x == 0) {
            pointF.x = m66434j2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m66434j2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: a1 */
    public View mo66452a1(View view, int i, RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        View m66609V;
        int m66482B2;
        boolean z;
        boolean z2;
        int m66380g;
        int m66380g2;
        int m66380g3;
        View m66374m;
        if (m66594d0() == 0 || (m66609V = m66609V(view)) == null) {
            return null;
        }
        m66455Y2();
        int m66425p2 = m66425p2(i);
        if (m66425p2 == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) m66609V.getLayoutParams();
        boolean z3 = layoutParams.f55319g;
        C11877c c11877c = layoutParams.f55318f;
        if (m66425p2 == 1) {
            m66482B2 = m66481C2();
        } else {
            m66482B2 = m66482B2();
        }
        m66436i3(m66482B2, c11872z);
        m66451a3(m66425p2);
        C11938m c11938m = this.f55317z;
        c11938m.f55569c = c11938m.f55570d + m66482B2;
        c11938m.f55568b = (int) (this.f55313v.mo66151n() * 0.33333334f);
        C11938m c11938m2 = this.f55317z;
        c11938m2.f55574h = true;
        c11938m2.f55567a = false;
        m66421t2(c11866v, c11938m2, c11872z);
        this.f55301H = this.f55295B;
        if (!z3 && (m66374m = c11877c.m66374m(m66482B2, m66425p2)) != null && m66374m != m66609V) {
            return m66374m;
        }
        if (m66465R2(m66425p2)) {
            for (int i2 = this.f55311t - 1; i2 >= 0; i2--) {
                View m66374m2 = this.f55312u[i2].m66374m(m66482B2, m66425p2);
                if (m66374m2 != null && m66374m2 != m66609V) {
                    return m66374m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f55311t; i3++) {
                View m66374m3 = this.f55312u[i3].m66374m(m66482B2, m66425p2);
                if (m66374m3 != null && m66374m3 != m66609V) {
                    return m66374m3;
                }
            }
        }
        boolean z4 = !this.f55294A;
        if (m66425p2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                m66380g3 = c11877c.m66381f();
            } else {
                m66380g3 = c11877c.m66380g();
            }
            View mo66607W = mo66607W(m66380g3);
            if (mo66607W != null && mo66607W != m66609V) {
                return mo66607W;
            }
        }
        if (m66465R2(m66425p2)) {
            for (int i4 = this.f55311t - 1; i4 >= 0; i4--) {
                if (i4 != c11877c.f55348e) {
                    if (z2) {
                        m66380g2 = this.f55312u[i4].m66381f();
                    } else {
                        m66380g2 = this.f55312u[i4].m66380g();
                    }
                    View mo66607W2 = mo66607W(m66380g2);
                    if (mo66607W2 != null && mo66607W2 != m66609V) {
                        return mo66607W2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f55311t; i5++) {
                if (z2) {
                    m66380g = this.f55312u[i5].m66381f();
                } else {
                    m66380g = this.f55312u[i5].m66380g();
                }
                View mo66607W3 = mo66607W(m66380g);
                if (mo66607W3 != null && mo66607W3 != m66609V) {
                    return mo66607W3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: a2 */
    public void mo51837a2(RecyclerView recyclerView, RecyclerView.C11872z c11872z, int i) {
        C11939n c11939n = new C11939n(recyclerView.getContext());
        c11939n.setTargetPosition(i);
        m66598b2(c11939n);
    }

    /* renamed from: a3 */
    public final void m66451a3(int i) {
        boolean z;
        C11938m c11938m = this.f55317z;
        c11938m.f55571e = i;
        boolean z2 = this.f55295B;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c11938m.f55570d = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: b1 */
    public void mo66450b1(AccessibilityEvent accessibilityEvent) {
        super.mo66450b1(accessibilityEvent);
        if (m66594d0() > 0) {
            View m66417w2 = m66417w2(false);
            View m66418v2 = m66418v2(false);
            if (m66417w2 != null && m66418v2 != null) {
                int m66564x0 = m66564x0(m66417w2);
                int m66564x02 = m66564x0(m66418v2);
                if (m66564x0 < m66564x02) {
                    accessibilityEvent.setFromIndex(m66564x0);
                    accessibilityEvent.setToIndex(m66564x02);
                    return;
                }
                accessibilityEvent.setFromIndex(m66564x02);
                accessibilityEvent.setToIndex(m66564x0);
            }
        }
    }

    /* renamed from: b3 */
    public void m66449b3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo66484A(null);
        if (i == this.f55315x) {
            return;
        }
        this.f55315x = i;
        AbstractC11944q abstractC11944q = this.f55313v;
        this.f55313v = this.f55314w;
        this.f55314w = abstractC11944q;
        m66627L1();
    }

    /* renamed from: c3 */
    public void m66448c3(boolean z) {
        mo66484A(null);
        SavedState savedState = this.f55303J;
        if (savedState != null && savedState.f55333i != z) {
            savedState.f55333i = z;
        }
        this.f55294A = z;
        m66627L1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: d2 */
    public boolean mo66447d2() {
        return this.f55303J == null;
    }

    /* renamed from: d3 */
    public void m66446d3(int i) {
        mo66484A(null);
        if (i != this.f55311t) {
            m66470M2();
            this.f55311t = i;
            this.f55296C = new BitSet(this.f55311t);
            this.f55312u = new C11877c[this.f55311t];
            for (int i2 = 0; i2 < this.f55311t; i2++) {
                this.f55312u[i2] = new C11877c(i2);
            }
            m66627L1();
        }
    }

    /* renamed from: e2 */
    public final void m66445e2(View view) {
        for (int i = this.f55311t - 1; i >= 0; i--) {
            this.f55312u[i].m66386a(view);
        }
    }

    /* renamed from: e3 */
    public final void m66444e3(int i, int i2) {
        for (int i3 = 0; i3 < this.f55311t; i3++) {
            if (!this.f55312u[i3].f55344a.isEmpty()) {
                m66431k3(this.f55312u[i3], i, i2);
            }
        }
    }

    /* renamed from: f2 */
    public final void m66443f2(C11876b c11876b) {
        int mo66152m;
        SavedState savedState = this.f55303J;
        int i = savedState.f55328d;
        if (i > 0) {
            if (i == this.f55311t) {
                for (int i2 = 0; i2 < this.f55311t; i2++) {
                    this.f55312u[i2].m66382e();
                    SavedState savedState2 = this.f55303J;
                    int i3 = savedState2.f55329e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (savedState2.f55334j) {
                            mo66152m = this.f55313v.mo66156i();
                        } else {
                            mo66152m = this.f55313v.mo66152m();
                        }
                        i3 += mo66152m;
                    }
                    this.f55312u[i2].m66365v(i3);
                }
            } else {
                savedState.m66393b();
                SavedState savedState3 = this.f55303J;
                savedState3.f55326b = savedState3.f55327c;
            }
        }
        SavedState savedState4 = this.f55303J;
        this.f55302I = savedState4.f55335k;
        m66448c3(savedState4.f55333i);
        m66455Y2();
        SavedState savedState5 = this.f55303J;
        int i4 = savedState5.f55326b;
        if (i4 != -1) {
            this.f55297D = i4;
            c11876b.f55339c = savedState5.f55334j;
        } else {
            c11876b.f55339c = this.f55295B;
        }
        if (savedState5.f55330f > 1) {
            LazySpanLookup lazySpanLookup = this.f55299F;
            lazySpanLookup.f55320a = savedState5.f55331g;
            lazySpanLookup.f55321b = savedState5.f55332h;
        }
    }

    /* renamed from: f3 */
    public final boolean m66442f3(RecyclerView.C11872z c11872z, C11876b c11876b) {
        int m66420u2;
        if (this.f55301H) {
            m66420u2 = m66415y2(c11872z.m66490b());
        } else {
            m66420u2 = m66420u2(c11872z.m66490b());
        }
        c11876b.f55337a = m66420u2;
        c11876b.f55338b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: g2 */
    public boolean m66441g2() {
        int m66375l = this.f55312u[0].m66375l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f55311t; i++) {
            if (this.f55312u[i].m66375l(Integer.MIN_VALUE) != m66375l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g3 */
    public boolean m66440g3(RecyclerView.C11872z c11872z, C11876b c11876b) {
        int i;
        int m66482B2;
        int mo66152m;
        boolean z = false;
        if (!c11872z.m66487e() && (i = this.f55297D) != -1) {
            if (i >= 0 && i < c11872z.m66490b()) {
                SavedState savedState = this.f55303J;
                if (savedState != null && savedState.f55326b != -1 && savedState.f55328d >= 1) {
                    c11876b.f55338b = Integer.MIN_VALUE;
                    c11876b.f55337a = this.f55297D;
                } else {
                    View mo66607W = mo66607W(this.f55297D);
                    if (mo66607W != null) {
                        if (this.f55295B) {
                            m66482B2 = m66481C2();
                        } else {
                            m66482B2 = m66482B2();
                        }
                        c11876b.f55337a = m66482B2;
                        if (this.f55298E != Integer.MIN_VALUE) {
                            if (c11876b.f55339c) {
                                c11876b.f55338b = (this.f55313v.mo66156i() - this.f55298E) - this.f55313v.mo66161d(mo66607W);
                            } else {
                                c11876b.f55338b = (this.f55313v.mo66152m() + this.f55298E) - this.f55313v.mo66158g(mo66607W);
                            }
                            return true;
                        } else if (this.f55313v.mo66160e(mo66607W) > this.f55313v.mo66151n()) {
                            if (c11876b.f55339c) {
                                mo66152m = this.f55313v.mo66156i();
                            } else {
                                mo66152m = this.f55313v.mo66152m();
                            }
                            c11876b.f55338b = mo66152m;
                            return true;
                        } else {
                            int mo66158g = this.f55313v.mo66158g(mo66607W) - this.f55313v.mo66152m();
                            if (mo66158g < 0) {
                                c11876b.f55338b = -mo66158g;
                                return true;
                            }
                            int mo66156i = this.f55313v.mo66156i() - this.f55313v.mo66161d(mo66607W);
                            if (mo66156i < 0) {
                                c11876b.f55338b = mo66156i;
                                return true;
                            }
                            c11876b.f55338b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f55297D;
                        c11876b.f55337a = i2;
                        int i3 = this.f55298E;
                        if (i3 == Integer.MIN_VALUE) {
                            if (m66434j2(i2) == 1) {
                                z = true;
                            }
                            c11876b.f55339c = z;
                            c11876b.m66390a();
                        } else {
                            c11876b.m66389b(i3);
                        }
                        c11876b.f55340d = true;
                    }
                }
                return true;
            }
            this.f55297D = -1;
            this.f55298E = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: h2 */
    public boolean m66439h2() {
        int m66371p = this.f55312u[0].m66371p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f55311t; i++) {
            if (this.f55312u[i].m66371p(Integer.MIN_VALUE) != m66371p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h3 */
    public void m66438h3(RecyclerView.C11872z c11872z, C11876b c11876b) {
        if (m66440g3(c11872z, c11876b) || m66442f3(c11872z, c11876b)) {
            return;
        }
        c11876b.m66390a();
        c11876b.f55337a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: i1 */
    public void mo51816i1(RecyclerView recyclerView, int i, int i2) {
        m66472K2(i, i2, 1);
    }

    /* renamed from: i2 */
    public final void m66437i2(View view, LayoutParams layoutParams, C11938m c11938m) {
        if (c11938m.f55571e == 1) {
            if (layoutParams.f55319g) {
                m66445e2(view);
            } else {
                layoutParams.f55318f.m66386a(view);
            }
        } else if (layoutParams.f55319g) {
            m66462T2(view);
        } else {
            layoutParams.f55318f.m66366u(view);
        }
    }

    /* renamed from: i3 */
    public final void m66436i3(int i, RecyclerView.C11872z c11872z) {
        int i2;
        int i3;
        int m66489c;
        boolean z;
        C11938m c11938m = this.f55317z;
        boolean z2 = false;
        c11938m.f55568b = 0;
        c11938m.f55569c = i;
        if (m66622O0() && (m66489c = c11872z.m66489c()) != -1) {
            boolean z3 = this.f55295B;
            if (m66489c < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = this.f55313v.mo66151n();
                i3 = 0;
            } else {
                i3 = this.f55313v.mo66151n();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (m66589g0()) {
            this.f55317z.f55572f = this.f55313v.mo66152m() - i3;
            this.f55317z.f55573g = this.f55313v.mo66156i() + i2;
        } else {
            this.f55317z.f55573g = this.f55313v.mo66157h() + i2;
            this.f55317z.f55572f = -i3;
        }
        C11938m c11938m2 = this.f55317z;
        c11938m2.f55574h = false;
        c11938m2.f55567a = true;
        if (this.f55313v.mo66154k() == 0 && this.f55313v.mo66157h() == 0) {
            z2 = true;
        }
        c11938m2.f55575i = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: j1 */
    public void mo66435j1(RecyclerView recyclerView) {
        this.f55299F.m66411b();
        m66627L1();
    }

    /* renamed from: j2 */
    public final int m66434j2(int i) {
        boolean z;
        if (m66594d0() == 0) {
            if (!this.f55295B) {
                return -1;
            }
            return 1;
        }
        if (i < m66482B2()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f55295B) {
            return -1;
        }
        return 1;
    }

    /* renamed from: j3 */
    public void m66433j3(int i) {
        this.f55316y = i / this.f55311t;
        this.f55304K = View.MeasureSpec.makeMeasureSpec(i, this.f55314w.mo66154k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: k1 */
    public void mo51810k1(RecyclerView recyclerView, int i, int i2, int i3) {
        m66472K2(i, i2, 8);
    }

    /* renamed from: k2 */
    public boolean m66432k2() {
        int m66482B2;
        int m66481C2;
        int i;
        if (m66594d0() == 0 || this.f55300G == 0 || !m66635H0()) {
            return false;
        }
        if (this.f55295B) {
            m66482B2 = m66481C2();
            m66481C2 = m66482B2();
        } else {
            m66482B2 = m66482B2();
            m66481C2 = m66481C2();
        }
        if (m66482B2 == 0 && m66471L2() != null) {
            this.f55299F.m66411b();
            m66625M1();
            m66627L1();
            return true;
        } else if (!this.f55307R) {
            return false;
        } else {
            if (this.f55295B) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = m66481C2 + 1;
            LazySpanLookup.FullSpanItem m66408e = this.f55299F.m66408e(m66482B2, i2, i, true);
            if (m66408e == null) {
                this.f55307R = false;
                this.f55299F.m66409d(i2);
                return false;
            }
            LazySpanLookup.FullSpanItem m66408e2 = this.f55299F.m66408e(m66482B2, m66408e.f55322b, i * (-1), true);
            if (m66408e2 == null) {
                this.f55299F.m66409d(m66408e.f55322b);
            } else {
                this.f55299F.m66409d(m66408e2.f55322b + 1);
            }
            m66625M1();
            m66627L1();
            return true;
        }
    }

    /* renamed from: k3 */
    public final void m66431k3(C11877c c11877c, int i, int i2) {
        int m66377j = c11877c.m66377j();
        if (i == -1) {
            if (c11877c.m66372o() + m66377j <= i2) {
                this.f55296C.set(c11877c.f55348e, false);
            }
        } else if (c11877c.m66376k() - m66377j >= i2) {
            this.f55296C.set(c11877c.f55348e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: l1 */
    public void mo51807l1(RecyclerView recyclerView, int i, int i2) {
        m66472K2(i, i2, 2);
    }

    /* renamed from: l2 */
    public final boolean m66430l2(C11877c c11877c) {
        if (this.f55295B) {
            if (c11877c.m66376k() < this.f55313v.mo66156i()) {
                ArrayList<View> arrayList = c11877c.f55344a;
                return !c11877c.m66373n(arrayList.get(arrayList.size() - 1)).f55319g;
            }
        } else if (c11877c.m66372o() > this.f55313v.mo66152m()) {
            return !c11877c.m66373n(c11877c.f55344a.get(0)).f55319g;
        }
        return false;
    }

    /* renamed from: l3 */
    public final int m66429l3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* renamed from: m2 */
    public final int m66428m2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        return C11951t.m66136a(c11872z, this.f55313v, m66417w2(!this.f55308S), m66418v2(!this.f55308S), this, this.f55308S);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: n1 */
    public void mo51801n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        m66472K2(i, i2, 4);
    }

    /* renamed from: n2 */
    public final int m66427n2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        return C11951t.m66135b(c11872z, this.f55313v, m66417w2(!this.f55308S), m66418v2(!this.f55308S), this, this.f55308S, this.f55295B);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: o1 */
    public void mo51798o1(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z) {
        m66466Q2(c11866v, c11872z, true);
    }

    /* renamed from: o2 */
    public final int m66426o2(RecyclerView.C11872z c11872z) {
        if (m66594d0() == 0) {
            return 0;
        }
        return C11951t.m66134c(c11872z, this.f55313v, m66417w2(!this.f55308S), m66418v2(!this.f55308S), this, this.f55308S);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: p1 */
    public void mo51795p1(RecyclerView.C11872z c11872z) {
        super.mo51795p1(c11872z);
        this.f55297D = -1;
        this.f55298E = Integer.MIN_VALUE;
        this.f55303J = null;
        this.f55306Q.m66388c();
    }

    /* renamed from: p2 */
    public final int m66425p2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f55315x == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f55315x == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f55315x == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f55315x == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f55315x != 1 && m66469N2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f55315x == 1 || !m66469N2()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: q2 */
    public final LazySpanLookup.FullSpanItem m66424q2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f55324d = new int[this.f55311t];
        for (int i2 = 0; i2 < this.f55311t; i2++) {
            fullSpanItem.f55324d[i2] = i - this.f55312u[i2].m66375l(i);
        }
        return fullSpanItem;
    }

    /* renamed from: r2 */
    public final LazySpanLookup.FullSpanItem m66423r2(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f55324d = new int[this.f55311t];
        for (int i2 = 0; i2 < this.f55311t; i2++) {
            fullSpanItem.f55324d[i2] = this.f55312u[i2].m66371p(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: s2 */
    public final void m66422s2() {
        this.f55313v = AbstractC11944q.m66165b(this, this.f55315x);
        this.f55314w = AbstractC11944q.m66165b(this, 1 - this.f55315x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: t1 */
    public void mo51787t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f55303J = savedState;
            if (this.f55297D != -1) {
                savedState.m66394a();
                this.f55303J.m66393b();
            }
            m66627L1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: t2 */
    public final int m66421t2(RecyclerView.C11866v c11866v, C11938m c11938m, RecyclerView.C11872z c11872z) {
        int i;
        int mo66152m;
        int m66480D2;
        boolean z;
        C11877c c11877c;
        int m66371p;
        int mo66160e;
        int i2;
        int mo66152m2;
        int i3;
        int mo66160e2;
        boolean z2;
        int mo66156i;
        boolean m66439h2;
        int m66375l;
        ?? r9 = 0;
        this.f55296C.set(0, this.f55311t, true);
        if (this.f55317z.f55575i) {
            if (c11938m.f55571e == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (c11938m.f55571e == 1) {
            i = c11938m.f55573g + c11938m.f55568b;
        } else {
            i = c11938m.f55572f - c11938m.f55568b;
        }
        int i4 = i;
        m66444e3(c11938m.f55571e, i4);
        if (this.f55295B) {
            mo66152m = this.f55313v.mo66156i();
        } else {
            mo66152m = this.f55313v.mo66152m();
        }
        int i5 = mo66152m;
        boolean z3 = false;
        while (c11938m.m66177a(c11872z) && (this.f55317z.f55575i || !this.f55296C.isEmpty())) {
            View m66176b = c11938m.m66176b(c11866v);
            LayoutParams layoutParams = (LayoutParams) m66176b.getLayoutParams();
            int m66676a = layoutParams.m66676a();
            int m66406g = this.f55299F.m66406g(m66676a);
            if (m66406g == -1) {
                z = true;
            } else {
                z = r9;
            }
            if (z) {
                if (layoutParams.f55319g) {
                    c11877c = this.f55312u[r9];
                } else {
                    c11877c = m66476H2(c11938m);
                }
                this.f55299F.m66399n(m66676a, c11877c);
            } else {
                c11877c = this.f55312u[m66406g];
            }
            C11877c c11877c2 = c11877c;
            layoutParams.f55318f = c11877c2;
            if (c11938m.f55571e == 1) {
                m66565x(m66176b);
            } else {
                m66562y(m66176b, r9);
            }
            m66467P2(m66176b, layoutParams, r9);
            if (c11938m.f55571e == 1) {
                if (layoutParams.f55319g) {
                    m66375l = m66480D2(i5);
                } else {
                    m66375l = c11877c2.m66375l(i5);
                }
                int mo66160e3 = this.f55313v.mo66160e(m66176b) + m66375l;
                if (z && layoutParams.f55319g) {
                    LazySpanLookup.FullSpanItem m66424q2 = m66424q2(m66375l);
                    m66424q2.f55323c = -1;
                    m66424q2.f55322b = m66676a;
                    this.f55299F.m66412a(m66424q2);
                }
                i2 = mo66160e3;
                mo66160e = m66375l;
            } else {
                if (layoutParams.f55319g) {
                    m66371p = m66477G2(i5);
                } else {
                    m66371p = c11877c2.m66371p(i5);
                }
                mo66160e = m66371p - this.f55313v.mo66160e(m66176b);
                if (z && layoutParams.f55319g) {
                    LazySpanLookup.FullSpanItem m66423r2 = m66423r2(m66371p);
                    m66423r2.f55323c = 1;
                    m66423r2.f55322b = m66676a;
                    this.f55299F.m66412a(m66423r2);
                }
                i2 = m66371p;
            }
            if (layoutParams.f55319g && c11938m.f55570d == -1) {
                if (z) {
                    this.f55307R = true;
                } else {
                    if (c11938m.f55571e == 1) {
                        m66439h2 = m66441g2();
                    } else {
                        m66439h2 = m66439h2();
                    }
                    if (!m66439h2) {
                        LazySpanLookup.FullSpanItem m66407f = this.f55299F.m66407f(m66676a);
                        if (m66407f != null) {
                            m66407f.f55325e = true;
                        }
                        this.f55307R = true;
                    }
                }
            }
            m66437i2(m66176b, layoutParams, c11938m);
            if (m66469N2() && this.f55315x == 1) {
                if (layoutParams.f55319g) {
                    mo66156i = this.f55314w.mo66156i();
                } else {
                    mo66156i = this.f55314w.mo66156i() - (((this.f55311t - 1) - c11877c2.f55348e) * this.f55316y);
                }
                mo66160e2 = mo66156i;
                i3 = mo66156i - this.f55314w.mo66160e(m66176b);
            } else {
                if (layoutParams.f55319g) {
                    mo66152m2 = this.f55314w.mo66152m();
                } else {
                    mo66152m2 = (c11877c2.f55348e * this.f55316y) + this.f55314w.mo66152m();
                }
                i3 = mo66152m2;
                mo66160e2 = this.f55314w.mo66160e(m66176b) + mo66152m2;
            }
            if (this.f55315x == 1) {
                m66619Q0(m66176b, i3, mo66160e, mo66160e2, i2);
            } else {
                m66619Q0(m66176b, mo66160e, i3, i2, mo66160e2);
            }
            if (layoutParams.f55319g) {
                m66444e3(this.f55317z.f55571e, i4);
            } else {
                m66431k3(c11877c2, this.f55317z.f55571e, i4);
            }
            m66459U2(c11866v, this.f55317z);
            if (this.f55317z.f55574h && m66176b.hasFocusable()) {
                if (layoutParams.f55319g) {
                    this.f55296C.clear();
                } else {
                    z2 = false;
                    this.f55296C.set(c11877c2.f55348e, false);
                    r9 = z2;
                    z3 = true;
                }
            }
            z2 = false;
            r9 = z2;
            z3 = true;
        }
        int i6 = r9;
        if (!z3) {
            m66459U2(c11866v, this.f55317z);
        }
        if (this.f55317z.f55571e == -1) {
            m66480D2 = this.f55313v.mo66152m() - m66477G2(this.f55313v.mo66152m());
        } else {
            m66480D2 = m66480D2(this.f55313v.mo66156i()) - this.f55313v.mo66156i();
        }
        if (m66480D2 > 0) {
            return Math.min(c11938m.f55568b, m66480D2);
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: u1 */
    public Parcelable mo51784u1() {
        int m66482B2;
        int m66371p;
        int mo66152m;
        int[] iArr;
        if (this.f55303J != null) {
            return new SavedState(this.f55303J);
        }
        SavedState savedState = new SavedState();
        savedState.f55333i = this.f55294A;
        savedState.f55334j = this.f55301H;
        savedState.f55335k = this.f55302I;
        LazySpanLookup lazySpanLookup = this.f55299F;
        if (lazySpanLookup != null && (iArr = lazySpanLookup.f55320a) != null) {
            savedState.f55331g = iArr;
            savedState.f55330f = iArr.length;
            savedState.f55332h = lazySpanLookup.f55321b;
        } else {
            savedState.f55330f = 0;
        }
        if (m66594d0() > 0) {
            if (this.f55301H) {
                m66482B2 = m66481C2();
            } else {
                m66482B2 = m66482B2();
            }
            savedState.f55326b = m66482B2;
            savedState.f55327c = m66416x2();
            int i = this.f55311t;
            savedState.f55328d = i;
            savedState.f55329e = new int[i];
            for (int i2 = 0; i2 < this.f55311t; i2++) {
                if (this.f55301H) {
                    m66371p = this.f55312u[i2].m66375l(Integer.MIN_VALUE);
                    if (m66371p != Integer.MIN_VALUE) {
                        mo66152m = this.f55313v.mo66156i();
                        m66371p -= mo66152m;
                        savedState.f55329e[i2] = m66371p;
                    } else {
                        savedState.f55329e[i2] = m66371p;
                    }
                } else {
                    m66371p = this.f55312u[i2].m66371p(Integer.MIN_VALUE);
                    if (m66371p != Integer.MIN_VALUE) {
                        mo66152m = this.f55313v.mo66152m();
                        m66371p -= mo66152m;
                        savedState.f55329e[i2] = m66371p;
                    } else {
                        savedState.f55329e[i2] = m66371p;
                    }
                }
            }
        } else {
            savedState.f55326b = -1;
            savedState.f55327c = -1;
            savedState.f55328d = 0;
        }
        return savedState;
    }

    /* renamed from: u2 */
    public final int m66420u2(int i) {
        int m66594d0 = m66594d0();
        for (int i2 = 0; i2 < m66594d0; i2++) {
            int m66564x0 = m66564x0(m66597c0(i2));
            if (m66564x0 >= 0 && m66564x0 < i) {
                return m66564x0;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p
    /* renamed from: v1 */
    public void mo66419v1(int i) {
        if (i == 0) {
            m66432k2();
        }
    }

    /* renamed from: v2 */
    public View m66418v2(boolean z) {
        int mo66152m = this.f55313v.mo66152m();
        int mo66156i = this.f55313v.mo66156i();
        View view = null;
        for (int m66594d0 = m66594d0() - 1; m66594d0 >= 0; m66594d0--) {
            View m66597c0 = m66597c0(m66594d0);
            int mo66158g = this.f55313v.mo66158g(m66597c0);
            int mo66161d = this.f55313v.mo66161d(m66597c0);
            if (mo66161d > mo66152m && mo66158g < mo66156i) {
                if (mo66161d > mo66156i && z) {
                    if (view == null) {
                        view = m66597c0;
                    }
                } else {
                    return m66597c0;
                }
            }
        }
        return view;
    }

    /* renamed from: w2 */
    public View m66417w2(boolean z) {
        int mo66152m = this.f55313v.mo66152m();
        int mo66156i = this.f55313v.mo66156i();
        int m66594d0 = m66594d0();
        View view = null;
        for (int i = 0; i < m66594d0; i++) {
            View m66597c0 = m66597c0(i);
            int mo66158g = this.f55313v.mo66158g(m66597c0);
            if (this.f55313v.mo66161d(m66597c0) > mo66152m && mo66158g < mo66156i) {
                if (mo66158g < mo66152m && z) {
                    if (view == null) {
                        view = m66597c0;
                    }
                } else {
                    return m66597c0;
                }
            }
        }
        return view;
    }

    /* renamed from: x2 */
    public int m66416x2() {
        View m66417w2;
        if (this.f55295B) {
            m66417w2 = m66418v2(true);
        } else {
            m66417w2 = m66417w2(true);
        }
        if (m66417w2 == null) {
            return -1;
        }
        return m66564x0(m66417w2);
    }

    /* renamed from: y2 */
    public final int m66415y2(int i) {
        for (int m66594d0 = m66594d0() - 1; m66594d0 >= 0; m66594d0--) {
            int m66564x0 = m66564x0(m66597c0(m66594d0));
            if (m66564x0 >= 0 && m66564x0 < i) {
                return m66564x0;
            }
        }
        return 0;
    }

    /* renamed from: z2 */
    public final void m66414z2(RecyclerView.C11866v c11866v, RecyclerView.C11872z c11872z, boolean z) {
        int mo66156i;
        int m66480D2 = m66480D2(Integer.MIN_VALUE);
        if (m66480D2 != Integer.MIN_VALUE && (mo66156i = this.f55313v.mo66156i() - m66480D2) > 0) {
            int i = mo66156i - (-m66453Z2(-mo66156i, c11866v, c11872z));
            if (z && i > 0) {
                this.f55313v.mo66148r(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f55320a;

        /* renamed from: b */
        public List<FullSpanItem> f55321b;

        /* renamed from: a */
        public void m66412a(FullSpanItem fullSpanItem) {
            if (this.f55321b == null) {
                this.f55321b = new ArrayList();
            }
            int size = this.f55321b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f55321b.get(i);
                if (fullSpanItem2.f55322b == fullSpanItem.f55322b) {
                    this.f55321b.remove(i);
                }
                if (fullSpanItem2.f55322b >= fullSpanItem.f55322b) {
                    this.f55321b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f55321b.add(fullSpanItem);
        }

        /* renamed from: b */
        public void m66411b() {
            int[] iArr = this.f55320a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f55321b = null;
        }

        /* renamed from: c */
        public void m66410c(int i) {
            int[] iArr = this.f55320a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f55320a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m66398o(i)];
                this.f55320a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f55320a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public int m66409d(int i) {
            List<FullSpanItem> list = this.f55321b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f55321b.get(size).f55322b >= i) {
                        this.f55321b.remove(size);
                    }
                }
            }
            return m66405h(i);
        }

        /* renamed from: e */
        public FullSpanItem m66408e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f55321b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f55321b.get(i4);
                int i5 = fullSpanItem.f55322b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f55323c == i3 || (z && fullSpanItem.f55325e))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public FullSpanItem m66407f(int i) {
            List<FullSpanItem> list = this.f55321b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f55321b.get(size);
                if (fullSpanItem.f55322b == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: g */
        public int m66406g(int i) {
            int[] iArr = this.f55320a;
            if (iArr != null && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        /* renamed from: h */
        public int m66405h(int i) {
            int[] iArr = this.f55320a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int m66404i = m66404i(i);
            if (m66404i == -1) {
                int[] iArr2 = this.f55320a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f55320a.length;
            }
            int min = Math.min(m66404i + 1, this.f55320a.length);
            Arrays.fill(this.f55320a, i, min, -1);
            return min;
        }

        /* renamed from: i */
        public final int m66404i(int i) {
            if (this.f55321b == null) {
                return -1;
            }
            FullSpanItem m66407f = m66407f(i);
            if (m66407f != null) {
                this.f55321b.remove(m66407f);
            }
            int size = this.f55321b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (this.f55321b.get(i2).f55322b >= i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f55321b.remove(i2);
            return this.f55321b.get(i2).f55322b;
        }

        /* renamed from: j */
        public void m66403j(int i, int i2) {
            int[] iArr = this.f55320a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m66410c(i3);
                int[] iArr2 = this.f55320a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f55320a, i, i3, -1);
                m66401l(i, i2);
            }
        }

        /* renamed from: k */
        public void m66402k(int i, int i2) {
            int[] iArr = this.f55320a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m66410c(i3);
                int[] iArr2 = this.f55320a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f55320a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m66400m(i, i2);
            }
        }

        /* renamed from: l */
        public final void m66401l(int i, int i2) {
            List<FullSpanItem> list = this.f55321b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f55321b.get(size);
                int i3 = fullSpanItem.f55322b;
                if (i3 >= i) {
                    fullSpanItem.f55322b = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        public final void m66400m(int i, int i2) {
            List<FullSpanItem> list = this.f55321b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f55321b.get(size);
                int i4 = fullSpanItem.f55322b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f55321b.remove(size);
                    } else {
                        fullSpanItem.f55322b = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: n */
        public void m66399n(int i, C11877c c11877c) {
            m66410c(i);
            this.f55320a[i] = c11877c.f55348e;
        }

        /* renamed from: o */
        public int m66398o(int i) {
            int length = this.f55320a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C11873a();

            /* renamed from: b */
            public int f55322b;

            /* renamed from: c */
            public int f55323c;

            /* renamed from: d */
            public int[] f55324d;

            /* renamed from: e */
            public boolean f55325e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            /* loaded from: classes.dex */
            public class C11873a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f55322b = parcel.readInt();
                this.f55323c = parcel.readInt();
                this.f55325e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f55324d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            public int m66397a(int i) {
                int[] iArr = this.f55324d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f55322b + ", mGapDir=" + this.f55323c + ", mHasUnwantedGapAfter=" + this.f55325e + ", mGapPerSpan=" + Arrays.toString(this.f55324d) + CoreConstants.CURLY_RIGHT;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f55322b);
                parcel.writeInt(this.f55323c);
                parcel.writeInt(this.f55325e ? 1 : 0);
                int[] iArr = this.f55324d;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f55324d);
                    return;
                }
                parcel.writeInt(0);
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f55315x = i2;
        m66446d3(i);
        this.f55317z = new C11938m();
        m66422s2();
    }
}
