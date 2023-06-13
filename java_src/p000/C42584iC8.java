package p000;

import com.google.android.gms.internal.vision.C17551E;
import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: iC8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42584iC8 implements IU8 {

    /* renamed from: a */
    public final WB8 f86944a;

    /* renamed from: b */
    public int f86945b;

    /* renamed from: c */
    public int f86946c;

    /* renamed from: d */
    public int f86947d = 0;

    public C42584iC8(WB8 wb8) {
        WB8 wb82 = (WB8) C52124yI8.m3689f(wb8, "input");
        this.f86944a = wb82;
        wb82.f40538d = this;
    }

    /* renamed from: I */
    public static C42584iC8 m34342I(WB8 wb8) {
        C42584iC8 c42584iC8 = wb8.f40538d;
        if (c42584iC8 != null) {
            return c42584iC8;
        }
        return new C42584iC8(wb8);
    }

    /* renamed from: L */
    public static void m34339L(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzjk.m50758g();
        }
    }

    /* renamed from: N */
    public static void m34337N(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzjk.m50758g();
        }
    }

    @Override // p000.IU8
    /* renamed from: A */
    public final void mo13361A(List<Float> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C48558sH8) {
            C48558sH8 c48558sH8 = (C48558sH8) list;
            int i = this.f86945b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c48558sH8.m14482b(this.f86944a.mo10626g());
                        if (this.f86944a.mo10639A()) {
                            return;
                        }
                        mo10630a2 = this.f86944a.mo10630a();
                    } while (mo10630a2 == this.f86945b);
                    this.f86947d = mo10630a2;
                    return;
                }
                throw zzjk.m50759f();
            }
            int mo10614t = this.f86944a.mo10614t();
            m34337N(mo10614t);
            int mo10638B = this.f86944a.mo10638B() + mo10614t;
            do {
                c48558sH8.m14482b(this.f86944a.mo10626g());
            } while (this.f86944a.mo10638B() < mo10638B);
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f86944a.mo10626g()));
                    if (this.f86944a.mo10639A()) {
                        return;
                    }
                    mo10630a = this.f86944a.mo10630a();
                } while (mo10630a == this.f86945b);
                this.f86947d = mo10630a;
                return;
            }
            throw zzjk.m50759f();
        }
        int mo10614t2 = this.f86944a.mo10614t();
        m34337N(mo10614t2);
        int mo10638B2 = this.f86944a.mo10638B() + mo10614t2;
        do {
            list.add(Float.valueOf(this.f86944a.mo10626g()));
        } while (this.f86944a.mo10638B() < mo10638B2);
    }

    @Override // p000.IU8
    /* renamed from: B */
    public final <T> T mo13360B(Class<T> cls, C17551E c17551e) throws IOException {
        m34341J(3);
        return (T) m34336O(C40365eT8.m42854a().m42853b(cls), c17551e);
    }

    @Override // p000.IU8
    /* renamed from: C */
    public final void mo13359C(List<Integer> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        c37877aI8.m71672c(this.f86944a.mo10621m());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(this.f86944a.mo10621m());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Integer.valueOf(this.f86944a.mo10621m()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(this.f86944a.mo10621m()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: D */
    public final <T> T mo13358D(Class<T> cls, C17551E c17551e) throws IOException {
        m34341J(2);
        return (T) m34338M(C40365eT8.m42854a().m42853b(cls), c17551e);
    }

    @Override // p000.IU8
    /* renamed from: E */
    public final void mo13357E(List<Long> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        pm8.m90369b(this.f86944a.mo10622l());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(this.f86944a.mo10622l());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Long.valueOf(this.f86944a.mo10622l()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(this.f86944a.mo10622l()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: F */
    public final <K, V> void mo13356F(Map<K, V> map, C43294jP8<K, V> c43294jP8, C17551E c17551e) throws IOException {
        m34341J(2);
        this.f86944a.mo10625h(this.f86944a.mo10614t());
        throw null;
    }

    @Override // p000.IU8
    /* renamed from: G */
    public final <T> T mo13355G(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        m34341J(3);
        return (T) m34336O(interfaceC52825zU8, c17551e);
    }

    @Override // p000.IU8
    /* renamed from: H */
    public final <T> T mo13354H(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        m34341J(2);
        return (T) m34338M(interfaceC52825zU8, c17551e);
    }

    /* renamed from: J */
    public final void m34341J(int i) throws IOException {
        if ((this.f86945b & 7) == i) {
            return;
        }
        throw zzjk.m50759f();
    }

    /* renamed from: K */
    public final void m34340K(List<String> list, boolean z) throws IOException {
        String mo13325j;
        int mo10630a;
        int mo10630a2;
        if ((this.f86945b & 7) == 2) {
            if ((list instanceof InterfaceC41488gM8) && !z) {
                InterfaceC41488gM8 interfaceC41488gM8 = (InterfaceC41488gM8) list;
                do {
                    interfaceC41488gM8.mo6977X2(mo13330e());
                    if (this.f86944a.mo10639A()) {
                        return;
                    }
                    mo10630a2 = this.f86944a.mo10630a();
                } while (mo10630a2 == this.f86945b);
                this.f86947d = mo10630a2;
                return;
            }
            do {
                if (z) {
                    mo13325j = mo13333b();
                } else {
                    mo13325j = mo13325j();
                }
                list.add(mo13325j);
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a = this.f86944a.mo10630a();
            } while (mo10630a == this.f86945b);
            this.f86947d = mo10630a;
            return;
        }
        throw zzjk.m50759f();
    }

    /* renamed from: M */
    public final <T> T m34338M(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        WB8 wb8;
        int mo10614t = this.f86944a.mo10614t();
        WB8 wb82 = this.f86944a;
        if (wb82.f40535a < wb82.f40536b) {
            int mo10625h = wb82.mo10625h(mo10614t);
            T zza = interfaceC52825zU8.zza();
            this.f86944a.f40535a++;
            interfaceC52825zU8.mo1311d(zza, this, c17551e);
            interfaceC52825zU8.zzc(zza);
            this.f86944a.mo10629d(0);
            wb8.f40535a--;
            this.f86944a.mo10623j(mo10625h);
            return zza;
        }
        throw new zzjk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: O */
    public final <T> T m34336O(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int i = this.f86946c;
        this.f86946c = ((this.f86945b >>> 3) << 3) | 4;
        try {
            T zza = interfaceC52825zU8.zza();
            interfaceC52825zU8.mo1311d(zza, this, c17551e);
            interfaceC52825zU8.zzc(zza);
            if (this.f86945b == this.f86946c) {
                return zza;
            }
            throw zzjk.m50758g();
        } finally {
            this.f86946c = i;
        }
    }

    /* renamed from: P */
    public final void m34335P(int i) throws IOException {
        if (this.f86944a.mo10638B() == i) {
            return;
        }
        throw zzjk.m50764a();
    }

    @Override // p000.IU8
    /* renamed from: a */
    public final boolean mo13335a() throws IOException {
        m34341J(0);
        return this.f86944a.mo10618p();
    }

    @Override // p000.IU8
    /* renamed from: b */
    public final String mo13333b() throws IOException {
        m34341J(2);
        return this.f86944a.mo10616r();
    }

    @Override // p000.IU8
    /* renamed from: c */
    public final int mo13332c() throws IOException {
        m34341J(5);
        return this.f86944a.mo10619o();
    }

    @Override // p000.IU8
    /* renamed from: d */
    public final int mo13331d() throws IOException {
        m34341J(0);
        return this.f86944a.mo10613u();
    }

    @Override // p000.IU8
    /* renamed from: e */
    public final AbstractC53119zy8 mo13330e() throws IOException {
        m34341J(2);
        return this.f86944a.mo10615s();
    }

    @Override // p000.IU8
    /* renamed from: f */
    public final int mo13329f() throws IOException {
        m34341J(0);
        return this.f86944a.mo10614t();
    }

    @Override // p000.IU8
    /* renamed from: g */
    public final long mo13328g() throws IOException {
        m34341J(0);
        return this.f86944a.mo10609y();
    }

    @Override // p000.IU8
    /* renamed from: h */
    public final int mo13327h() throws IOException {
        m34341J(5);
        return this.f86944a.mo10612v();
    }

    @Override // p000.IU8
    /* renamed from: i */
    public final void mo13326i(List<Integer> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        c37877aI8.m71672c(this.f86944a.mo10610x());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(this.f86944a.mo10610x());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Integer.valueOf(this.f86944a.mo10610x()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(this.f86944a.mo10610x()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: j */
    public final String mo13325j() throws IOException {
        m34341J(2);
        return this.f86944a.mo10617q();
    }

    @Override // p000.IU8
    /* renamed from: k */
    public final long mo13324k() throws IOException {
        m34341J(1);
        return this.f86944a.mo10611w();
    }

    @Override // p000.IU8
    /* renamed from: l */
    public final void mo13323l(List<Long> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i = this.f86945b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo10614t = this.f86944a.mo10614t();
                    m34339L(mo10614t);
                    int mo10638B = this.f86944a.mo10638B() + mo10614t;
                    do {
                        pm8.m90369b(this.f86944a.mo10611w());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(this.f86944a.mo10611w());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo10614t2 = this.f86944a.mo10614t();
                m34339L(mo10614t2);
                int mo10638B2 = this.f86944a.mo10638B() + mo10614t2;
                do {
                    list.add(Long.valueOf(this.f86944a.mo10611w()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(this.f86944a.mo10611w()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: m */
    public final void mo13322m(List<Long> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        pm8.m90369b(this.f86944a.mo10609y());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(this.f86944a.mo10609y());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Long.valueOf(this.f86944a.mo10609y()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(this.f86944a.mo10609y()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: n */
    public final void mo13321n(List<Integer> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        c37877aI8.m71672c(this.f86944a.mo10614t());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(this.f86944a.mo10614t());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Integer.valueOf(this.f86944a.mo10614t()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(this.f86944a.mo10614t()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: o */
    public final void mo13320o(List<AbstractC53119zy8> list) throws IOException {
        int mo10630a;
        if ((this.f86945b & 7) == 2) {
            do {
                list.add(mo13330e());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a = this.f86944a.mo10630a();
            } while (mo10630a == this.f86945b);
            this.f86947d = mo10630a;
            return;
        }
        throw zzjk.m50759f();
    }

    @Override // p000.IU8
    /* renamed from: p */
    public final void mo13319p(List<Integer> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i = this.f86945b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c37877aI8.m71672c(this.f86944a.mo10612v());
                        if (this.f86944a.mo10639A()) {
                            return;
                        }
                        mo10630a2 = this.f86944a.mo10630a();
                    } while (mo10630a2 == this.f86945b);
                    this.f86947d = mo10630a2;
                    return;
                }
                throw zzjk.m50759f();
            }
            int mo10614t = this.f86944a.mo10614t();
            m34337N(mo10614t);
            int mo10638B = this.f86944a.mo10638B() + mo10614t;
            do {
                c37877aI8.m71672c(this.f86944a.mo10612v());
            } while (this.f86944a.mo10638B() < mo10638B);
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f86944a.mo10612v()));
                    if (this.f86944a.mo10639A()) {
                        return;
                    }
                    mo10630a = this.f86944a.mo10630a();
                } while (mo10630a == this.f86945b);
                this.f86947d = mo10630a;
                return;
            }
            throw zzjk.m50759f();
        }
        int mo10614t2 = this.f86944a.mo10614t();
        m34337N(mo10614t2);
        int mo10638B2 = this.f86944a.mo10638B() + mo10614t2;
        do {
            list.add(Integer.valueOf(this.f86944a.mo10612v()));
        } while (this.f86944a.mo10638B() < mo10638B2);
    }

    @Override // p000.IU8
    /* renamed from: q */
    public final void mo13318q(List<Integer> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        c37877aI8.m71672c(this.f86944a.mo10613u());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(this.f86944a.mo10613u());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Integer.valueOf(this.f86944a.mo10613u()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(this.f86944a.mo10613u()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.IU8
    /* renamed from: r */
    public final <T> void mo13317r(List<T> list, InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int mo10630a;
        int i = this.f86945b;
        if ((i & 7) == 3) {
            do {
                list.add(m34336O(interfaceC52825zU8, c17551e));
                if (!this.f86944a.mo10639A() && this.f86947d == 0) {
                    mo10630a = this.f86944a.mo10630a();
                } else {
                    return;
                }
            } while (mo10630a == i);
            this.f86947d = mo10630a;
            return;
        }
        throw zzjk.m50759f();
    }

    @Override // p000.IU8
    /* renamed from: s */
    public final void mo13316s(List<Boolean> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C38872by8) {
            C38872by8 c38872by8 = (C38872by8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        c38872by8.m62062b(this.f86944a.mo10618p());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c38872by8.m62062b(this.f86944a.mo10618p());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Boolean.valueOf(this.f86944a.mo10618p()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Boolean.valueOf(this.f86944a.mo10618p()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: t */
    public final void mo13315t(List<Integer> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i = this.f86945b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c37877aI8.m71672c(this.f86944a.mo10619o());
                        if (this.f86944a.mo10639A()) {
                            return;
                        }
                        mo10630a2 = this.f86944a.mo10630a();
                    } while (mo10630a2 == this.f86945b);
                    this.f86947d = mo10630a2;
                    return;
                }
                throw zzjk.m50759f();
            }
            int mo10614t = this.f86944a.mo10614t();
            m34337N(mo10614t);
            int mo10638B = this.f86944a.mo10638B() + mo10614t;
            do {
                c37877aI8.m71672c(this.f86944a.mo10619o());
            } while (this.f86944a.mo10638B() < mo10638B);
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f86944a.mo10619o()));
                    if (this.f86944a.mo10639A()) {
                        return;
                    }
                    mo10630a = this.f86944a.mo10630a();
                } while (mo10630a == this.f86945b);
                this.f86947d = mo10630a;
                return;
            }
            throw zzjk.m50759f();
        }
        int mo10614t2 = this.f86944a.mo10614t();
        m34337N(mo10614t2);
        int mo10638B2 = this.f86944a.mo10638B() + mo10614t2;
        do {
            list.add(Integer.valueOf(this.f86944a.mo10619o()));
        } while (this.f86944a.mo10638B() < mo10638B2);
    }

    @Override // p000.IU8
    /* renamed from: u */
    public final void mo13314u(List<Long> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i = this.f86945b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo10614t = this.f86944a.mo10614t();
                    m34339L(mo10614t);
                    int mo10638B = this.f86944a.mo10638B() + mo10614t;
                    do {
                        pm8.m90369b(this.f86944a.mo10620n());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(this.f86944a.mo10620n());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo10614t2 = this.f86944a.mo10614t();
                m34339L(mo10614t2);
                int mo10638B2 = this.f86944a.mo10638B() + mo10614t2;
                do {
                    list.add(Long.valueOf(this.f86944a.mo10620n()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(this.f86944a.mo10620n()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    /* renamed from: v */
    public final void mo13313v(List<String> list) throws IOException {
        m34340K(list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.IU8
    /* renamed from: w */
    public final <T> void mo13312w(List<T> list, InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int mo10630a;
        int i = this.f86945b;
        if ((i & 7) == 2) {
            do {
                list.add(m34338M(interfaceC52825zU8, c17551e));
                if (!this.f86944a.mo10639A() && this.f86947d == 0) {
                    mo10630a = this.f86944a.mo10630a();
                } else {
                    return;
                }
            } while (mo10630a == i);
            this.f86947d = mo10630a;
            return;
        }
        throw zzjk.m50759f();
    }

    @Override // p000.IU8
    /* renamed from: x */
    public final long mo13311x() throws IOException {
        m34341J(0);
        return this.f86944a.mo10624i();
    }

    @Override // p000.IU8
    /* renamed from: y */
    public final void mo13310y(List<String> list) throws IOException {
        m34340K(list, false);
    }

    @Override // p000.IU8
    /* renamed from: z */
    public final void mo13309z(List<Long> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i = this.f86945b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo10638B = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                    do {
                        pm8.m90369b(this.f86944a.mo10624i());
                    } while (this.f86944a.mo10638B() < mo10638B);
                    m34335P(mo10638B);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(this.f86944a.mo10624i());
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a2 = this.f86944a.mo10630a();
            } while (mo10630a2 == this.f86945b);
            this.f86947d = mo10630a2;
            return;
        }
        int i2 = this.f86945b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo10638B2 = this.f86944a.mo10638B() + this.f86944a.mo10614t();
                do {
                    list.add(Long.valueOf(this.f86944a.mo10624i()));
                } while (this.f86944a.mo10638B() < mo10638B2);
                m34335P(mo10638B2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(this.f86944a.mo10624i()));
            if (this.f86944a.mo10639A()) {
                return;
            }
            mo10630a = this.f86944a.mo10630a();
        } while (mo10630a == this.f86945b);
        this.f86947d = mo10630a;
    }

    @Override // p000.IU8
    public final int zza() throws IOException {
        int i = this.f86947d;
        if (i != 0) {
            this.f86945b = i;
            this.f86947d = 0;
        } else {
            this.f86945b = this.f86944a.mo10630a();
        }
        int i2 = this.f86945b;
        if (i2 == 0 || i2 == this.f86946c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // p000.IU8
    public final int zzb() {
        return this.f86945b;
    }

    @Override // p000.IU8
    public final boolean zzc() throws IOException {
        int i;
        if (!this.f86944a.mo10639A() && (i = this.f86945b) != this.f86946c) {
            return this.f86944a.mo10627f(i);
        }
        return false;
    }

    @Override // p000.IU8
    public final double zzd() throws IOException {
        m34341J(1);
        return this.f86944a.mo10628e();
    }

    @Override // p000.IU8
    public final float zze() throws IOException {
        m34341J(5);
        return this.f86944a.mo10626g();
    }

    @Override // p000.IU8
    public final long zzg() throws IOException {
        m34341J(0);
        return this.f86944a.mo10622l();
    }

    @Override // p000.IU8
    public final int zzh() throws IOException {
        m34341J(0);
        return this.f86944a.mo10621m();
    }

    @Override // p000.IU8
    public final long zzi() throws IOException {
        m34341J(1);
        return this.f86944a.mo10620n();
    }

    @Override // p000.IU8
    public final int zzs() throws IOException {
        m34341J(0);
        return this.f86944a.mo10610x();
    }

    @Override // p000.IU8
    public final void zza(List<Double> list) throws IOException {
        int mo10630a;
        int mo10630a2;
        if (list instanceof MD8) {
            MD8 md8 = (MD8) list;
            int i = this.f86945b & 7;
            if (i == 1) {
                do {
                    md8.m95488b(this.f86944a.mo10628e());
                    if (this.f86944a.mo10639A()) {
                        return;
                    }
                    mo10630a2 = this.f86944a.mo10630a();
                } while (mo10630a2 == this.f86945b);
                this.f86947d = mo10630a2;
                return;
            } else if (i == 2) {
                int mo10614t = this.f86944a.mo10614t();
                m34339L(mo10614t);
                int mo10638B = this.f86944a.mo10638B() + mo10614t;
                do {
                    md8.m95488b(this.f86944a.mo10628e());
                } while (this.f86944a.mo10638B() < mo10638B);
                return;
            } else {
                throw zzjk.m50759f();
            }
        }
        int i2 = this.f86945b & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.f86944a.mo10628e()));
                if (this.f86944a.mo10639A()) {
                    return;
                }
                mo10630a = this.f86944a.mo10630a();
            } while (mo10630a == this.f86945b);
            this.f86947d = mo10630a;
        } else if (i2 == 2) {
            int mo10614t2 = this.f86944a.mo10614t();
            m34339L(mo10614t2);
            int mo10638B2 = this.f86944a.mo10638B() + mo10614t2;
            do {
                list.add(Double.valueOf(this.f86944a.mo10628e()));
            } while (this.f86944a.mo10638B() < mo10638B2);
        } else {
            throw zzjk.m50759f();
        }
    }
}
