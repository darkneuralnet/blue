package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public final class RunnableC11921k implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<RunnableC11921k> f55497f = new ThreadLocal<>();

    /* renamed from: g */
    public static Comparator<C11924c> f55498g = new C11922a();

    /* renamed from: c */
    public long f55500c;

    /* renamed from: d */
    public long f55501d;

    /* renamed from: b */
    public ArrayList<RecyclerView> f55499b = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<C11924c> f55502e = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: classes.dex */
    public class C11922a implements Comparator<C11924c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C11924c c11924c, C11924c c11924c2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = c11924c.f55510d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (c11924c2.f55510d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z3 = c11924c.f55507a;
            if (z3 != c11924c2.f55507a) {
                if (!z3) {
                    return 1;
                }
                return -1;
            }
            int i = c11924c2.f55508b - c11924c.f55508b;
            if (i != 0) {
                return i;
            }
            int i2 = c11924c.f55509c - c11924c2.f55509c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.k$b */
    /* loaded from: classes.dex */
    public static class C11923b implements RecyclerView.AbstractC11855p.InterfaceC11858c {

        /* renamed from: a */
        public int f55503a;

        /* renamed from: b */
        public int f55504b;

        /* renamed from: c */
        public int[] f55505c;

        /* renamed from: d */
        public int f55506d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11855p.InterfaceC11858c
        /* renamed from: a */
        public void mo66216a(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.f55506d * 2;
                    int[] iArr = this.f55505c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f55505c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i3 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 2];
                        this.f55505c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f55505c;
                    iArr4[i3] = i;
                    iArr4[i3 + 1] = i2;
                    this.f55506d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* renamed from: b */
        public void m66215b() {
            int[] iArr = this.f55505c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f55506d = 0;
        }

        /* renamed from: c */
        public void m66214c(RecyclerView recyclerView, boolean z) {
            this.f55506d = 0;
            int[] iArr = this.f55505c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC11855p abstractC11855p = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && abstractC11855p != null && abstractC11855p.m66629K0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.m66351p()) {
                        abstractC11855p.mo66632J(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    abstractC11855p.mo66475I(this.f55503a, this.f55504b, recyclerView.mState, this);
                }
                int i = this.f55506d;
                if (i > abstractC11855p.f55241n) {
                    abstractC11855p.f55241n = i;
                    abstractC11855p.f55242o = z;
                    recyclerView.mRecycler.m66527P();
                }
            }
        }

        /* renamed from: d */
        public boolean m66213d(int i) {
            if (this.f55505c != null) {
                int i2 = this.f55506d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f55505c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m66212e(int i, int i2) {
            this.f55503a = i;
            this.f55504b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    /* loaded from: classes.dex */
    public static class C11924c {

        /* renamed from: a */
        public boolean f55507a;

        /* renamed from: b */
        public int f55508b;

        /* renamed from: c */
        public int f55509c;

        /* renamed from: d */
        public RecyclerView f55510d;

        /* renamed from: e */
        public int f55511e;

        /* renamed from: a */
        public void m66211a() {
            this.f55507a = false;
            this.f55508b = 0;
            this.f55509c = 0;
            this.f55510d = null;
            this.f55511e = 0;
        }
    }

    /* renamed from: e */
    public static boolean m66223e(RecyclerView recyclerView, int i) {
        int m66305j = recyclerView.mChildHelper.m66305j();
        for (int i2 = 0; i2 < m66305j; i2++) {
            RecyclerView.AbstractC11834D childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m66306i(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m66227a(RecyclerView recyclerView) {
        this.f55499b.add(recyclerView);
    }

    /* renamed from: b */
    public final void m66226b() {
        C11924c c11924c;
        boolean z;
        int size = this.f55499b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f55499b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m66214c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f55506d;
            }
        }
        this.f55502e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f55499b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C11923b c11923b = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(c11923b.f55503a) + Math.abs(c11923b.f55504b);
                for (int i5 = 0; i5 < c11923b.f55506d * 2; i5 += 2) {
                    if (i3 >= this.f55502e.size()) {
                        c11924c = new C11924c();
                        this.f55502e.add(c11924c);
                    } else {
                        c11924c = this.f55502e.get(i3);
                    }
                    int[] iArr = c11923b.f55505c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c11924c.f55507a = z;
                    c11924c.f55508b = abs;
                    c11924c.f55509c = i6;
                    c11924c.f55510d = recyclerView2;
                    c11924c.f55511e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f55502e, f55498g);
    }

    /* renamed from: c */
    public final void m66225c(C11924c c11924c, long j) {
        long j2;
        if (c11924c.f55507a) {
            j2 = LongCompanionObject.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.AbstractC11834D m66219i = m66219i(c11924c.f55510d, c11924c.f55511e, j2);
        if (m66219i != null && m66219i.mNestedRecyclerView != null && m66219i.isBound() && !m66219i.isInvalid()) {
            m66220h(m66219i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    public final void m66224d(long j) {
        for (int i = 0; i < this.f55502e.size(); i++) {
            C11924c c11924c = this.f55502e.get(i);
            if (c11924c.f55510d != null) {
                m66225c(c11924c, j);
                c11924c.m66211a();
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void m66222f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f55500c == 0) {
            this.f55500c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m66212e(i, i2);
    }

    /* renamed from: g */
    public void m66221g(long j) {
        m66226b();
        m66224d(j);
    }

    /* renamed from: h */
    public final void m66220h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m66305j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        C11923b c11923b = recyclerView.mPrefetchRegistry;
        c11923b.m66214c(recyclerView, true);
        if (c11923b.f55506d != 0) {
            try {
                C40152e66.m43277a("RV Nested Prefetch");
                recyclerView.mState.m66486f(recyclerView.mAdapter);
                for (int i = 0; i < c11923b.f55506d * 2; i += 2) {
                    m66219i(recyclerView, c11923b.f55505c[i], j);
                }
            } finally {
                C40152e66.m43276b();
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView.AbstractC11834D m66219i(RecyclerView recyclerView, int i, long j) {
        if (m66223e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C11866v c11866v = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC11834D m66529N = c11866v.m66529N(i, false, j);
            if (m66529N != null) {
                if (m66529N.isBound() && !m66529N.isInvalid()) {
                    c11866v.m66536G(m66529N.itemView);
                } else {
                    c11866v.m66524a(m66529N, false);
                }
            }
            return m66529N;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: j */
    public void m66218j(RecyclerView recyclerView) {
        this.f55499b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C40152e66.m43277a("RV Prefetch");
            if (!this.f55499b.isEmpty()) {
                int size = this.f55499b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f55499b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m66221g(TimeUnit.MILLISECONDS.toNanos(j) + this.f55501d);
                }
            }
        } finally {
            this.f55500c = 0L;
            C40152e66.m43276b();
        }
    }
}
