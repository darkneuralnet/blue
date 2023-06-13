package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C11942p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C11878a implements C11942p.InterfaceC11943a {

    /* renamed from: a */
    public InterfaceC41591gY3<C11880b> f55350a;

    /* renamed from: b */
    public final ArrayList<C11880b> f55351b;

    /* renamed from: c */
    public final ArrayList<C11880b> f55352c;

    /* renamed from: d */
    public final InterfaceC11879a f55353d;

    /* renamed from: e */
    public Runnable f55354e;

    /* renamed from: f */
    public final boolean f55355f;

    /* renamed from: g */
    public final C11942p f55356g;

    /* renamed from: h */
    public int f55357h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11879a {
        /* renamed from: a */
        void mo66340a(int i, int i2);

        /* renamed from: b */
        void mo66339b(C11880b c11880b);

        /* renamed from: c */
        void mo66338c(C11880b c11880b);

        /* renamed from: d */
        RecyclerView.AbstractC11834D mo66337d(int i);

        /* renamed from: e */
        void mo66336e(int i, int i2);

        /* renamed from: f */
        void mo66335f(int i, int i2);

        /* renamed from: g */
        void mo66334g(int i, int i2);

        /* renamed from: h */
        void mo66333h(int i, int i2, Object obj);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class C11880b {

        /* renamed from: a */
        public int f55358a;

        /* renamed from: b */
        public int f55359b;

        /* renamed from: c */
        public Object f55360c;

        /* renamed from: d */
        public int f55361d;

        public C11880b(int i, int i2, int i3, Object obj) {
            this.f55358a = i;
            this.f55359b = i2;
            this.f55361d = i3;
            this.f55360c = obj;
        }

        /* renamed from: a */
        public String m66332a() {
            int i = this.f55358a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11880b)) {
                return false;
            }
            C11880b c11880b = (C11880b) obj;
            int i = this.f55358a;
            if (i != c11880b.f55358a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f55361d - this.f55359b) == 1 && this.f55361d == c11880b.f55359b && this.f55359b == c11880b.f55361d) {
                return true;
            }
            if (this.f55361d != c11880b.f55361d || this.f55359b != c11880b.f55359b) {
                return false;
            }
            Object obj2 = this.f55360c;
            if (obj2 != null) {
                if (!obj2.equals(c11880b.f55360c)) {
                    return false;
                }
            } else if (c11880b.f55360c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f55358a * 31) + this.f55359b) * 31) + this.f55361d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m66332a() + ",s:" + this.f55359b + "c:" + this.f55361d + ",p:" + this.f55360c + "]";
        }
    }

    public C11878a(InterfaceC11879a interfaceC11879a) {
        this(interfaceC11879a, false);
    }

    @Override // androidx.recyclerview.widget.C11942p.InterfaceC11943a
    /* renamed from: a */
    public C11880b mo66168a(int i, int i2, int i3, Object obj) {
        C11880b mo9830a = this.f55350a.mo9830a();
        if (mo9830a == null) {
            return new C11880b(i, i2, i3, obj);
        }
        mo9830a.f55358a = i;
        mo9830a.f55359b = i2;
        mo9830a.f55361d = i3;
        mo9830a.f55360c = obj;
        return mo9830a;
    }

    @Override // androidx.recyclerview.widget.C11942p.InterfaceC11943a
    /* renamed from: b */
    public void mo66167b(C11880b c11880b) {
        if (!this.f55355f) {
            c11880b.f55360c = null;
            this.f55350a.mo9829b(c11880b);
        }
    }

    /* renamed from: c */
    public final void m66364c(C11880b c11880b) {
        m66345v(c11880b);
    }

    /* renamed from: d */
    public final void m66363d(C11880b c11880b) {
        m66345v(c11880b);
    }

    /* renamed from: e */
    public int m66362e(int i) {
        int size = this.f55351b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11880b c11880b = this.f55351b.get(i2);
            int i3 = c11880b.f55358a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c11880b.f55359b;
                        if (i4 == i) {
                            i = c11880b.f55361d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c11880b.f55361d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c11880b.f55359b;
                    if (i5 <= i) {
                        int i6 = c11880b.f55361d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c11880b.f55359b <= i) {
                i += c11880b.f55361d;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void m66361f(C11880b c11880b) {
        boolean z;
        char c;
        int i = c11880b.f55359b;
        int i2 = c11880b.f55361d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f55353d.mo66337d(i3) == null && !m66359h(i3)) {
                if (c2 == 1) {
                    m66345v(mo66168a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            } else {
                if (c2 == 0) {
                    m66356k(mo66168a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c11880b.f55361d) {
            mo66167b(c11880b);
            c11880b = mo66168a(2, i, i4, null);
        }
        if (c2 == 0) {
            m66356k(c11880b);
        } else {
            m66345v(c11880b);
        }
    }

    /* renamed from: g */
    public final void m66360g(C11880b c11880b) {
        int i = c11880b.f55359b;
        int i2 = c11880b.f55361d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f55353d.mo66337d(i) == null && !m66359h(i)) {
                if (z) {
                    m66345v(mo66168a(4, i4, i3, c11880b.f55360c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            } else {
                if (!z) {
                    m66356k(mo66168a(4, i4, i3, c11880b.f55360c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            }
            i3++;
            i++;
        }
        if (i3 != c11880b.f55361d) {
            Object obj = c11880b.f55360c;
            mo66167b(c11880b);
            c11880b = mo66168a(4, i4, i3, obj);
        }
        if (!z) {
            m66356k(c11880b);
        } else {
            m66345v(c11880b);
        }
    }

    /* renamed from: h */
    public final boolean m66359h(int i) {
        int size = this.f55352c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11880b c11880b = this.f55352c.get(i2);
            int i3 = c11880b.f55358a;
            if (i3 == 8) {
                if (m66353n(c11880b.f55361d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c11880b.f55359b;
                int i5 = c11880b.f55361d + i4;
                while (i4 < i5) {
                    if (m66353n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m66358i() {
        int size = this.f55352c.size();
        for (int i = 0; i < size; i++) {
            this.f55353d.mo66338c(this.f55352c.get(i));
        }
        m66343x(this.f55352c);
        this.f55357h = 0;
    }

    /* renamed from: j */
    public void m66357j() {
        m66358i();
        int size = this.f55351b.size();
        for (int i = 0; i < size; i++) {
            C11880b c11880b = this.f55351b.get(i);
            int i2 = c11880b.f55358a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            this.f55353d.mo66338c(c11880b);
                            this.f55353d.mo66340a(c11880b.f55359b, c11880b.f55361d);
                        }
                    } else {
                        this.f55353d.mo66338c(c11880b);
                        this.f55353d.mo66333h(c11880b.f55359b, c11880b.f55361d, c11880b.f55360c);
                    }
                } else {
                    this.f55353d.mo66338c(c11880b);
                    this.f55353d.mo66335f(c11880b.f55359b, c11880b.f55361d);
                }
            } else {
                this.f55353d.mo66338c(c11880b);
                this.f55353d.mo66336e(c11880b.f55359b, c11880b.f55361d);
            }
            Runnable runnable = this.f55354e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m66343x(this.f55351b);
        this.f55357h = 0;
    }

    /* renamed from: k */
    public final void m66356k(C11880b c11880b) {
        int i;
        boolean z;
        int i2 = c11880b.f55358a;
        if (i2 != 1 && i2 != 8) {
            int m66341z = m66341z(c11880b.f55359b, i2);
            int i3 = c11880b.f55359b;
            int i4 = c11880b.f55358a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c11880b);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c11880b.f55361d; i6++) {
                int m66341z2 = m66341z(c11880b.f55359b + (i * i6), c11880b.f55358a);
                int i7 = c11880b.f55358a;
                if (i7 == 2 ? m66341z2 != m66341z : i7 != 4 || m66341z2 != m66341z + 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i5++;
                } else {
                    C11880b mo66168a = mo66168a(i7, m66341z, i5, c11880b.f55360c);
                    m66355l(mo66168a, i3);
                    mo66167b(mo66168a);
                    if (c11880b.f55358a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    m66341z = m66341z2;
                }
            }
            Object obj = c11880b.f55360c;
            mo66167b(c11880b);
            if (i5 > 0) {
                C11880b mo66168a2 = mo66168a(c11880b.f55358a, m66341z, i5, obj);
                m66355l(mo66168a2, i3);
                mo66167b(mo66168a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: l */
    public void m66355l(C11880b c11880b, int i) {
        this.f55353d.mo66339b(c11880b);
        int i2 = c11880b.f55358a;
        if (i2 != 2) {
            if (i2 == 4) {
                this.f55353d.mo66333h(i, c11880b.f55361d, c11880b.f55360c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f55353d.mo66335f(i, c11880b.f55361d);
    }

    /* renamed from: m */
    public int m66354m(int i) {
        return m66353n(i, 0);
    }

    /* renamed from: n */
    public int m66353n(int i, int i2) {
        int size = this.f55352c.size();
        while (i2 < size) {
            C11880b c11880b = this.f55352c.get(i2);
            int i3 = c11880b.f55358a;
            if (i3 == 8) {
                int i4 = c11880b.f55359b;
                if (i4 == i) {
                    i = c11880b.f55361d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c11880b.f55361d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c11880b.f55359b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c11880b.f55361d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c11880b.f55361d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean m66352o(int i) {
        return (i & this.f55357h) != 0;
    }

    /* renamed from: p */
    public boolean m66351p() {
        return this.f55351b.size() > 0;
    }

    /* renamed from: q */
    public boolean m66350q() {
        return (this.f55352c.isEmpty() || this.f55351b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    public boolean m66349r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f55351b.add(mo66168a(4, i, i2, obj));
        this.f55357h |= 4;
        if (this.f55351b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean m66348s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f55351b.add(mo66168a(1, i, i2, null));
        this.f55357h |= 1;
        if (this.f55351b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m66347t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f55351b.add(mo66168a(8, i, i2, null));
            this.f55357h |= 8;
            if (this.f55351b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: u */
    public boolean m66346u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f55351b.add(mo66168a(2, i, i2, null));
        this.f55357h |= 2;
        if (this.f55351b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void m66345v(C11880b c11880b) {
        this.f55352c.add(c11880b);
        int i = c11880b.f55358a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.f55353d.mo66340a(c11880b.f55359b, c11880b.f55361d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c11880b);
                }
                this.f55353d.mo66333h(c11880b.f55359b, c11880b.f55361d, c11880b.f55360c);
                return;
            }
            this.f55353d.mo66334g(c11880b.f55359b, c11880b.f55361d);
            return;
        }
        this.f55353d.mo66336e(c11880b.f55359b, c11880b.f55361d);
    }

    /* renamed from: w */
    public void m66344w() {
        this.f55356g.m66173b(this.f55351b);
        int size = this.f55351b.size();
        for (int i = 0; i < size; i++) {
            C11880b c11880b = this.f55351b.get(i);
            int i2 = c11880b.f55358a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            m66363d(c11880b);
                        }
                    } else {
                        m66360g(c11880b);
                    }
                } else {
                    m66361f(c11880b);
                }
            } else {
                m66364c(c11880b);
            }
            Runnable runnable = this.f55354e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f55351b.clear();
    }

    /* renamed from: x */
    public void m66343x(List<C11880b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo66167b(list.get(i));
        }
        list.clear();
    }

    /* renamed from: y */
    public void m66342y() {
        m66343x(this.f55351b);
        m66343x(this.f55352c);
        this.f55357h = 0;
    }

    /* renamed from: z */
    public final int m66341z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f55352c.size() - 1; size >= 0; size--) {
            C11880b c11880b = this.f55352c.get(size);
            int i5 = c11880b.f55358a;
            if (i5 == 8) {
                int i6 = c11880b.f55359b;
                int i7 = c11880b.f55361d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c11880b.f55361d = i7 + 1;
                        } else if (i2 == 2) {
                            c11880b.f55361d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c11880b.f55359b = i6 + 1;
                        } else if (i2 == 2) {
                            c11880b.f55359b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        c11880b.f55359b = i6 + 1;
                        c11880b.f55361d = i7 + 1;
                    } else if (i2 == 2) {
                        c11880b.f55359b = i6 - 1;
                        c11880b.f55361d = i7 - 1;
                    }
                }
            } else {
                int i8 = c11880b.f55359b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c11880b.f55361d;
                    } else if (i5 == 2) {
                        i += c11880b.f55361d;
                    }
                } else if (i2 == 1) {
                    c11880b.f55359b = i8 + 1;
                } else if (i2 == 2) {
                    c11880b.f55359b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f55352c.size() - 1; size2 >= 0; size2--) {
            C11880b c11880b2 = this.f55352c.get(size2);
            if (c11880b2.f55358a == 8) {
                int i9 = c11880b2.f55361d;
                if (i9 == c11880b2.f55359b || i9 < 0) {
                    this.f55352c.remove(size2);
                    mo66167b(c11880b2);
                }
            } else if (c11880b2.f55361d <= 0) {
                this.f55352c.remove(size2);
                mo66167b(c11880b2);
            }
        }
        return i;
    }

    public C11878a(InterfaceC11879a interfaceC11879a, boolean z) {
        this.f55350a = new C42777iY3(30);
        this.f55351b = new ArrayList<>();
        this.f55352c = new ArrayList<>();
        this.f55357h = 0;
        this.f55353d = interfaceC11879a;
        this.f55355f = z;
        this.f55356g = new C11942p(this);
    }
}
