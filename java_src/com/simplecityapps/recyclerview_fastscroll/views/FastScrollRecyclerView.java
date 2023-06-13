package com.simplecityapps.recyclerview_fastscroll.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes6.dex */
public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.InterfaceC11862s {

    /* renamed from: b */
    public FastScroller f75076b;

    /* renamed from: c */
    public boolean f75077c;

    /* renamed from: d */
    public C18583d f75078d;

    /* renamed from: e */
    public int f75079e;

    /* renamed from: f */
    public int f75080f;

    /* renamed from: g */
    public int f75081g;

    /* renamed from: h */
    public SparseIntArray f75082h;

    /* renamed from: i */
    public C18582c f75083i;

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC18581b {
        /* renamed from: a */
        int m45793a(RecyclerView recyclerView, int i);
    }

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView$c */
    /* loaded from: classes6.dex */
    public class C18582c extends RecyclerView.AbstractC11846j {
        public C18582c() {
        }

        /* renamed from: a */
        public final void m45792a() {
            FastScrollRecyclerView.this.f75082h.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onChanged() {
            m45792a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2) {
            m45792a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeInserted(int i, int i2) {
            m45792a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeMoved(int i, int i2, int i3) {
            m45792a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeRemoved(int i, int i2) {
            m45792a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11846j
        public void onItemRangeChanged(int i, int i2, Object obj) {
            m45792a();
        }
    }

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView$d */
    /* loaded from: classes6.dex */
    public static class C18583d {

        /* renamed from: a */
        public int f75085a;

        /* renamed from: b */
        public int f75086b;

        /* renamed from: c */
        public int f75087c;
    }

    /* renamed from: com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC18584e {
        /* renamed from: b */
        String mo16260b(int i);
    }

    public FastScrollRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
    /* renamed from: b */
    public void mo45809b(RecyclerView recyclerView, MotionEvent motionEvent) {
        m45797n(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
    /* renamed from: c */
    public boolean mo45808c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return m45797n(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f75077c) {
            m45796o();
            this.f75076b.m45785g(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC11862s
    /* renamed from: e */
    public void mo45806e(boolean z) {
    }

    /* renamed from: f */
    public final int m45805f() {
        if (getAdapter() instanceof InterfaceC18581b) {
            return m45804g(getAdapter().getItemCount());
        }
        throw new IllegalStateException("calculateAdapterHeight() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
    }

    /* renamed from: g */
    public final int m45804g(int i) {
        if (getAdapter() instanceof InterfaceC18581b) {
            if (this.f75082h.indexOfKey(i) >= 0) {
                return this.f75082h.get(i);
            }
            InterfaceC18581b interfaceC18581b = (InterfaceC18581b) getAdapter();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                this.f75082h.put(i3, i2);
                i2 += interfaceC18581b.m45793a(this, getAdapter().getItemViewType(i3));
            }
            this.f75082h.put(i, i2);
            return i2;
        }
        throw new IllegalStateException("calculateScrollDistanceToPosition() should only be called where the RecyclerView.Adapter is an instance of MeasurableAdapter");
    }

    /* renamed from: h */
    public final float m45803h(float f) {
        if (getAdapter() instanceof InterfaceC18581b) {
            InterfaceC18581b interfaceC18581b = (InterfaceC18581b) getAdapter();
            int m45805f = (int) (m45805f() * f);
            for (int i = 0; i < getAdapter().getItemCount(); i++) {
                int m45804g = m45804g(i);
                int m45793a = interfaceC18581b.m45793a(this, getAdapter().getItemViewType(i)) + m45804g;
                if (m45805f >= m45804g && m45805f <= m45793a) {
                    return i;
                }
            }
            Log.w("FastScrollRecyclerView", "Failed to find a view at the provided scroll fraction (" + f + ")");
            return f * getAdapter().getItemCount();
        }
        return getAdapter().getItemCount() * f;
    }

    /* renamed from: i */
    public int m45802i() {
        return getHeight() - this.f75076b.m45784h();
    }

    /* renamed from: j */
    public int m45801j(int i, int i2) {
        return (((getPaddingTop() + i2) + i) + getPaddingBottom()) - getHeight();
    }

    /* renamed from: k */
    public final void m45800k(C18583d c18583d) {
        c18583d.f75085a = -1;
        c18583d.f75086b = -1;
        c18583d.f75087c = -1;
        if (getAdapter().getItemCount() != 0 && getChildCount() != 0) {
            View childAt = getChildAt(0);
            c18583d.f75085a = getChildAdapterPosition(childAt);
            if (getLayoutManager() instanceof GridLayoutManager) {
                c18583d.f75085a /= ((GridLayoutManager) getLayoutManager()).m66769o3();
            }
            c18583d.f75086b = getLayoutManager().m66580o0(childAt);
            c18583d.f75087c = childAt.getHeight() + getLayoutManager().m66647C0(childAt) + getLayoutManager().m66599b0(childAt);
        }
    }

    /* renamed from: l */
    public int m45799l() {
        return this.f75076b.m45784h();
    }

    /* renamed from: m */
    public int m45798m() {
        return this.f75076b.m45783i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 != 3) goto L9;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m45797n(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.f75081g = y;
                    this.f75076b.m45782j(motionEvent, this.f75079e, this.f75080f, y, null);
                }
            }
            this.f75076b.m45782j(motionEvent, this.f75079e, this.f75080f, this.f75081g, null);
        } else {
            this.f75079e = x;
            this.f75081g = y;
            this.f75080f = y;
            this.f75076b.m45782j(motionEvent, x, y, y, null);
        }
        return this.f75076b.m45781k();
    }

    /* renamed from: o */
    public void m45796o() {
        if (getAdapter() == null) {
            return;
        }
        int itemCount = getAdapter().getItemCount();
        if (getLayoutManager() instanceof GridLayoutManager) {
            itemCount = (int) Math.ceil(itemCount / ((GridLayoutManager) getLayoutManager()).m66769o3());
        }
        if (itemCount == 0) {
            this.f75076b.m45768x(-1, -1);
            return;
        }
        m45800k(this.f75078d);
        C18583d c18583d = this.f75078d;
        if (c18583d.f75085a < 0) {
            this.f75076b.m45768x(-1, -1);
        } else {
            m45794q(c18583d, itemCount);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addOnItemTouchListener(this);
    }

    /* renamed from: p */
    public String m45795p(float f) {
        int i;
        int i2;
        float f2;
        int i3;
        int itemCount = getAdapter().getItemCount();
        if (itemCount == 0) {
            return "";
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            i = ((GridLayoutManager) getLayoutManager()).m66769o3();
            itemCount = (int) Math.ceil(itemCount / i);
        } else {
            i = 1;
        }
        stopScroll();
        m45800k(this.f75078d);
        if (getAdapter() instanceof InterfaceC18581b) {
            f2 = m45803h(f);
            i3 = (int) f2;
            i2 = m45804g(i3) - ((int) (m45805f() * f));
        } else {
            float m45803h = m45803h(f);
            int m45801j = (int) (m45801j(itemCount * this.f75078d.f75087c, 0) * f);
            int i4 = this.f75078d.f75087c;
            int i5 = (i * m45801j) / i4;
            i2 = -(m45801j % i4);
            f2 = m45803h;
            i3 = i5;
        }
        ((LinearLayoutManager) getLayoutManager()).m66731S2(i3, i2);
        if (!(getAdapter() instanceof InterfaceC18584e)) {
            return "";
        }
        if (f == 1.0f) {
            f2 -= 1.0f;
        }
        return ((InterfaceC18584e) getAdapter()).mo16260b((int) f2);
    }

    /* renamed from: q */
    public void m45794q(C18583d c18583d, int i) {
        int m45801j;
        int i2;
        int i3 = 0;
        if (getAdapter() instanceof InterfaceC18581b) {
            m45801j = m45801j(m45805f(), 0);
            i2 = m45804g(c18583d.f75085a);
        } else {
            m45801j = m45801j(i * c18583d.f75087c, 0);
            i2 = c18583d.f75085a * c18583d.f75087c;
        }
        int m45802i = m45802i();
        if (m45801j <= 0) {
            this.f75076b.m45768x(-1, -1);
            return;
        }
        int paddingTop = (int) ((((getPaddingTop() + i2) - c18583d.f75086b) / m45801j) * m45802i);
        if (!C35669Ri6.m86426a(getResources())) {
            i3 = getWidth() - this.f75076b.m45783i();
        }
        this.f75076b.m45768x(i3, paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.AbstractC11843h abstractC11843h) {
        if (getAdapter() != null) {
            getAdapter().unregisterAdapterDataObserver(this.f75083i);
        }
        if (abstractC11843h != null) {
            abstractC11843h.registerAdapterDataObserver(this.f75083i);
        }
        super.setAdapter(abstractC11843h);
    }

    public void setAutoHideDelay(int i) {
        this.f75076b.m45778n(i);
    }

    public void setAutoHideEnabled(boolean z) {
        this.f75076b.m45777o(z);
    }

    public void setPopUpTypeface(Typeface typeface) {
        this.f75076b.m45771u(typeface);
    }

    public void setPopupBgColor(int i) {
        this.f75076b.m45775q(i);
    }

    public void setPopupPosition(int i) {
        this.f75076b.m45774r(i);
    }

    public void setPopupTextColor(int i) {
        this.f75076b.m45773s(i);
    }

    public void setPopupTextSize(int i) {
        this.f75076b.m45772t(i);
    }

    public void setStateChangeListener(InterfaceC35180Pg3 interfaceC35180Pg3) {
    }

    public void setThumbColor(int i) {
        this.f75076b.m45770v(i);
    }

    public void setThumbEnabled(boolean z) {
        this.f75077c = z;
    }

    public void setThumbInactiveColor(boolean z) {
        this.f75076b.m45769w(z);
    }

    public void setTrackColor(int i) {
        this.f75076b.m45767y(i);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75077c = true;
        this.f75078d = new C18583d();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C37332Yl4.FastScrollRecyclerView, 0, 0);
        try {
            this.f75077c = obtainStyledAttributes.getBoolean(C37332Yl4.FastScrollRecyclerView_fastScrollThumbEnabled, true);
            obtainStyledAttributes.recycle();
            this.f75076b = new FastScroller(context, this, attributeSet);
            this.f75083i = new C18582c();
            this.f75082h = new SparseIntArray();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
