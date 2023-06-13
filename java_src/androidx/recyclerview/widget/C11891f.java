package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public class C11891f {

    /* renamed from: a */
    public final InterfaceC11893b f55388a;

    /* renamed from: b */
    public final C11892a f55389b = new C11892a();

    /* renamed from: c */
    public final List<View> f55390c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* loaded from: classes.dex */
    public static class C11892a {

        /* renamed from: a */
        public long f55391a = 0;

        /* renamed from: b */
        public C11892a f55392b;

        /* renamed from: a */
        public void m66294a(int i) {
            if (i >= 64) {
                C11892a c11892a = this.f55392b;
                if (c11892a != null) {
                    c11892a.m66294a(i - 64);
                    return;
                }
                return;
            }
            this.f55391a &= ~(1 << i);
        }

        /* renamed from: b */
        public int m66293b(int i) {
            C11892a c11892a = this.f55392b;
            if (c11892a == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f55391a);
                }
                return Long.bitCount(this.f55391a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f55391a & ((1 << i) - 1));
            } else {
                return c11892a.m66293b(i - 64) + Long.bitCount(this.f55391a);
            }
        }

        /* renamed from: c */
        public final void m66292c() {
            if (this.f55392b == null) {
                this.f55392b = new C11892a();
            }
        }

        /* renamed from: d */
        public boolean m66291d(int i) {
            if (i >= 64) {
                m66292c();
                return this.f55392b.m66291d(i - 64);
            } else if ((this.f55391a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public void m66290e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                m66292c();
                this.f55392b.m66290e(i - 64, z);
                return;
            }
            long j = this.f55391a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f55391a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m66287h(i);
            } else {
                m66294a(i);
            }
            if (z2 || this.f55392b != null) {
                m66292c();
                this.f55392b.m66290e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m66289f(int i) {
            boolean z;
            if (i >= 64) {
                m66292c();
                return this.f55392b.m66289f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f55391a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f55391a = j3;
            long j4 = j - 1;
            this.f55391a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C11892a c11892a = this.f55392b;
            if (c11892a != null) {
                if (c11892a.m66291d(0)) {
                    m66287h(63);
                }
                this.f55392b.m66289f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m66288g() {
            this.f55391a = 0L;
            C11892a c11892a = this.f55392b;
            if (c11892a != null) {
                c11892a.m66288g();
            }
        }

        /* renamed from: h */
        public void m66287h(int i) {
            if (i >= 64) {
                m66292c();
                this.f55392b.m66287h(i - 64);
                return;
            }
            this.f55391a |= 1 << i;
        }

        public String toString() {
            if (this.f55392b == null) {
                return Long.toBinaryString(this.f55391a);
            }
            return this.f55392b.toString() + "xx" + Long.toBinaryString(this.f55391a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11893b {
        /* renamed from: a */
        View mo66286a(int i);

        /* renamed from: b */
        void mo66285b(View view);

        /* renamed from: c */
        int mo66284c();

        /* renamed from: d */
        RecyclerView.AbstractC11834D mo66283d(View view);

        /* renamed from: e */
        void mo66282e(View view, int i);

        /* renamed from: f */
        void mo66281f();

        /* renamed from: g */
        void mo66280g(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: h */
        void mo66279h(int i);

        /* renamed from: i */
        int mo66278i(View view);

        /* renamed from: j */
        void mo66277j(View view);

        /* renamed from: k */
        void mo66276k(int i);
    }

    public C11891f(InterfaceC11893b interfaceC11893b) {
        this.f55388a = interfaceC11893b;
    }

    /* renamed from: a */
    public void m66314a(View view, int i, boolean z) {
        int m66307h;
        if (i < 0) {
            m66307h = this.f55388a.mo66284c();
        } else {
            m66307h = m66307h(i);
        }
        this.f55389b.m66290e(m66307h, z);
        if (z) {
            m66303l(view);
        }
        this.f55388a.mo66282e(view, m66307h);
    }

    /* renamed from: b */
    public void m66313b(View view, boolean z) {
        m66314a(view, -1, z);
    }

    /* renamed from: c */
    public void m66312c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m66307h;
        if (i < 0) {
            m66307h = this.f55388a.mo66284c();
        } else {
            m66307h = m66307h(i);
        }
        this.f55389b.m66290e(m66307h, z);
        if (z) {
            m66303l(view);
        }
        this.f55388a.mo66280g(view, m66307h, layoutParams);
    }

    /* renamed from: d */
    public void m66311d(int i) {
        int m66307h = m66307h(i);
        this.f55389b.m66289f(m66307h);
        this.f55388a.mo66279h(m66307h);
    }

    /* renamed from: e */
    public View m66310e(int i) {
        int size = this.f55390c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f55390c.get(i2);
            RecyclerView.AbstractC11834D mo66283d = this.f55388a.mo66283d(view);
            if (mo66283d.getLayoutPosition() == i && !mo66283d.isInvalid() && !mo66283d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m66309f(int i) {
        return this.f55388a.mo66286a(m66307h(i));
    }

    /* renamed from: g */
    public int m66308g() {
        return this.f55388a.mo66284c() - this.f55390c.size();
    }

    /* renamed from: h */
    public final int m66307h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo66284c = this.f55388a.mo66284c();
        int i2 = i;
        while (i2 < mo66284c) {
            int m66293b = i - (i2 - this.f55389b.m66293b(i2));
            if (m66293b == 0) {
                while (this.f55389b.m66291d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m66293b;
        }
        return -1;
    }

    /* renamed from: i */
    public View m66306i(int i) {
        return this.f55388a.mo66286a(i);
    }

    /* renamed from: j */
    public int m66305j() {
        return this.f55388a.mo66284c();
    }

    /* renamed from: k */
    public void m66304k(View view) {
        int mo66278i = this.f55388a.mo66278i(view);
        if (mo66278i >= 0) {
            this.f55389b.m66287h(mo66278i);
            m66303l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void m66303l(View view) {
        this.f55390c.add(view);
        this.f55388a.mo66285b(view);
    }

    /* renamed from: m */
    public int m66302m(View view) {
        int mo66278i = this.f55388a.mo66278i(view);
        if (mo66278i == -1 || this.f55389b.m66291d(mo66278i)) {
            return -1;
        }
        return mo66278i - this.f55389b.m66293b(mo66278i);
    }

    /* renamed from: n */
    public boolean m66301n(View view) {
        return this.f55390c.contains(view);
    }

    /* renamed from: o */
    public void m66300o() {
        this.f55389b.m66288g();
        for (int size = this.f55390c.size() - 1; size >= 0; size--) {
            this.f55388a.mo66277j(this.f55390c.get(size));
            this.f55390c.remove(size);
        }
        this.f55388a.mo66281f();
    }

    /* renamed from: p */
    public void m66299p(View view) {
        int mo66278i = this.f55388a.mo66278i(view);
        if (mo66278i < 0) {
            return;
        }
        if (this.f55389b.m66289f(mo66278i)) {
            m66295t(view);
        }
        this.f55388a.mo66276k(mo66278i);
    }

    /* renamed from: q */
    public void m66298q(int i) {
        int m66307h = m66307h(i);
        View mo66286a = this.f55388a.mo66286a(m66307h);
        if (mo66286a == null) {
            return;
        }
        if (this.f55389b.m66289f(m66307h)) {
            m66295t(mo66286a);
        }
        this.f55388a.mo66276k(m66307h);
    }

    /* renamed from: r */
    public boolean m66297r(View view) {
        int mo66278i = this.f55388a.mo66278i(view);
        if (mo66278i == -1) {
            m66295t(view);
            return true;
        } else if (this.f55389b.m66291d(mo66278i)) {
            this.f55389b.m66289f(mo66278i);
            m66295t(view);
            this.f55388a.mo66276k(mo66278i);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: s */
    public void m66296s(View view) {
        int mo66278i = this.f55388a.mo66278i(view);
        if (mo66278i >= 0) {
            if (this.f55389b.m66291d(mo66278i)) {
                this.f55389b.m66294a(mo66278i);
                m66295t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: t */
    public final boolean m66295t(View view) {
        if (this.f55390c.remove(view)) {
            this.f55388a.mo66277j(view);
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f55389b.toString() + ", hidden list:" + this.f55390c.size();
    }
}
