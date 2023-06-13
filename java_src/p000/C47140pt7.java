package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: pt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47140pt7 implements InterfaceC33681Iv7 {

    /* renamed from: a */
    public final AbstractC46547ot7 f104232a;

    /* renamed from: b */
    public int f104233b;

    /* renamed from: c */
    public int f104234c;

    /* renamed from: d */
    public int f104235d = 0;

    public C47140pt7(AbstractC46547ot7 abstractC46547ot7) {
        C46557ou7.m20292f(abstractC46547ot7, "input");
        this.f104232a = abstractC46547ot7;
        abstractC46547ot7.f102730c = this;
    }

    /* renamed from: M */
    public static final void m18544M(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzaqw.m51281g();
        }
    }

    /* renamed from: N */
    public static final void m18543N(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzaqw.m51281g();
        }
    }

    /* renamed from: O */
    public static C47140pt7 m18542O(AbstractC46547ot7 abstractC46547ot7) {
        C47140pt7 c47140pt7 = abstractC46547ot7.f102730c;
        return c47140pt7 != null ? c47140pt7 : new C47140pt7(abstractC46547ot7);
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: A */
    public final void mo18556A(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C36939Wt7) {
            C36939Wt7 c36939Wt7 = (C36939Wt7) list;
            int i = this.f104233b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c36939Wt7.m77729c(this.f104232a.mo20343i());
                        if (this.f104232a.mo20350b()) {
                            return;
                        }
                        mo20335q2 = this.f104232a.mo20335q();
                    } while (mo20335q2 == this.f104233b);
                    this.f104235d = mo20335q2;
                    return;
                }
                throw zzaqw.m51287a();
            }
            int mo20334r = this.f104232a.mo20334r();
            m18544M(mo20334r);
            int mo20342j = this.f104232a.mo20342j() + mo20334r;
            do {
                c36939Wt7.m77729c(this.f104232a.mo20343i());
            } while (this.f104232a.mo20342j() < mo20342j);
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f104232a.mo20343i()));
                    if (this.f104232a.mo20350b()) {
                        return;
                    }
                    mo20335q = this.f104232a.mo20335q();
                } while (mo20335q == this.f104233b);
                this.f104235d = mo20335q;
                return;
            }
            throw zzaqw.m51287a();
        }
        int mo20334r2 = this.f104232a.mo20334r();
        m18544M(mo20334r2);
        int mo20342j2 = this.f104232a.mo20342j() + mo20334r2;
        do {
            list.add(Float.valueOf(this.f104232a.mo20343i()));
        } while (this.f104232a.mo20342j() < mo20342j2);
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: B */
    public final void mo18555B(List list, InterfaceC34851Nv7 interfaceC34851Nv7, C53068zt7 c53068zt7) throws IOException {
        int mo20335q;
        int i = this.f104233b;
        if ((i & 7) == 2) {
            do {
                list.add(m18547J(interfaceC34851Nv7, c53068zt7));
                if (!this.f104232a.mo20350b() && this.f104235d == 0) {
                    mo20335q = this.f104232a.mo20335q();
                } else {
                    return;
                }
            } while (mo20335q == i);
            this.f104235d = mo20335q;
            return;
        }
        throw zzaqw.m51287a();
    }

    @Override // p000.InterfaceC33681Iv7
    @Deprecated
    /* renamed from: C */
    public final void mo18554C(List list, InterfaceC34851Nv7 interfaceC34851Nv7, C53068zt7 c53068zt7) throws IOException {
        int mo20335q;
        int i = this.f104233b;
        if ((i & 7) == 3) {
            do {
                list.add(m18548I(interfaceC34851Nv7, c53068zt7));
                if (!this.f104232a.mo20350b() && this.f104235d == 0) {
                    mo20335q = this.f104232a.mo20335q();
                } else {
                    return;
                }
            } while (mo20335q == i);
            this.f104235d = mo20335q;
            return;
        }
        throw zzaqw.m51287a();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: D */
    public final Object mo18553D(InterfaceC34851Nv7 interfaceC34851Nv7, C53068zt7 c53068zt7) throws IOException {
        m18545L(2);
        return m18547J(interfaceC34851Nv7, c53068zt7);
    }

    @Override // p000.InterfaceC33681Iv7
    @Deprecated
    /* renamed from: E */
    public final Object mo18552E(InterfaceC34851Nv7 interfaceC34851Nv7, C53068zt7 c53068zt7) throws IOException {
        m18545L(3);
        return m18548I(interfaceC34851Nv7, c53068zt7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    @Override // p000.InterfaceC33681Iv7
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo18551F(Map map, C37182Xu7 c37182Xu7, C53068zt7 c53068zt7) throws IOException {
        m18545L(2);
        int mo20341k = this.f104232a.mo20341k(this.f104232a.mo20334r());
        Object obj = c37182Xu7.f44207b;
        Object obj2 = c37182Xu7.f44209d;
        while (true) {
            try {
                int zzc = zzc();
                if (zzc == Integer.MAX_VALUE || this.f104232a.mo20350b()) {
                    break;
                } else if (zzc != 1) {
                    if (zzc != 2) {
                        try {
                            if (!mo18531k()) {
                                throw new zzaqw("Unable to parse map entry.");
                                break;
                            }
                        } catch (zzaqv unused) {
                            if (!mo18531k()) {
                                throw new zzaqw("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m18549H(c37182Xu7.f44208c, c37182Xu7.f44209d.getClass(), c53068zt7);
                    }
                } else {
                    obj = m18549H(c37182Xu7.f44206a, null, null);
                }
            } finally {
                this.f104232a.mo20351a(mo20341k);
            }
        }
    }

    /* renamed from: G */
    public final void m18550G(List list, boolean z) throws IOException {
        String mo18535g;
        int mo20335q;
        int mo20335q2;
        if ((this.f104233b & 7) == 2) {
            if ((list instanceof InterfaceC35076Ou7) && !z) {
                InterfaceC35076Ou7 interfaceC35076Ou7 = (InterfaceC35076Ou7) list;
                do {
                    interfaceC35076Ou7.mo4416H2(mo18538d());
                    if (this.f104232a.mo20350b()) {
                        return;
                    }
                    mo20335q2 = this.f104232a.mo20335q();
                } while (mo20335q2 == this.f104233b);
                this.f104235d = mo20335q2;
                return;
            }
            do {
                if (z) {
                    mo18535g = mo18533i();
                } else {
                    mo18535g = mo18535g();
                }
                list.add(mo18535g);
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q = this.f104232a.mo20335q();
            } while (mo20335q == this.f104233b);
            this.f104235d = mo20335q;
            return;
        }
        throw zzaqw.m51287a();
    }

    /* renamed from: H */
    public final Object m18549H(EnumC33690Iw7 enumC33690Iw7, Class cls, C53068zt7 c53068zt7) throws IOException {
        EnumC33690Iw7 enumC33690Iw72 = EnumC33690Iw7.f16483d;
        switch (enumC33690Iw7.ordinal()) {
            case 0:
                return Double.valueOf(zza());
            case 1:
                return Float.valueOf(zzb());
            case 2:
                return Long.valueOf(mo18532j());
            case 3:
                return Long.valueOf(mo18536f());
            case 4:
                return Integer.valueOf(zzg());
            case 5:
                return Long.valueOf(mo18541a());
            case 6:
                return Integer.valueOf(mo18518x());
            case 7:
                return Boolean.valueOf(mo18534h());
            case 8:
                return mo18533i();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                m18545L(2);
                return m18547J(C32979Fv7.m106247a().m106246b(cls), c53068zt7);
            case 11:
                return mo18538d();
            case 12:
                return Integer.valueOf(mo18539c());
            case 13:
                return Integer.valueOf(zze());
            case 14:
                return Integer.valueOf(zzh());
            case 15:
                return Long.valueOf(mo18540b());
            case 16:
                return Integer.valueOf(zzi());
            case 17:
                return Long.valueOf(mo18537e());
        }
    }

    /* renamed from: I */
    public final Object m18548I(InterfaceC34851Nv7 interfaceC34851Nv7, C53068zt7 c53068zt7) throws IOException {
        int i = this.f104234c;
        this.f104234c = ((this.f104233b >>> 3) << 3) | 4;
        try {
            Object zze = interfaceC34851Nv7.zze();
            interfaceC34851Nv7.mo29756h(zze, this, c53068zt7);
            interfaceC34851Nv7.zzf(zze);
            if (this.f104233b == this.f104234c) {
                return zze;
            }
            throw zzaqw.m51281g();
        } finally {
            this.f104234c = i;
        }
    }

    /* renamed from: J */
    public final Object m18547J(InterfaceC34851Nv7 interfaceC34851Nv7, C53068zt7 c53068zt7) throws IOException {
        AbstractC46547ot7 abstractC46547ot7;
        int mo20334r = this.f104232a.mo20334r();
        AbstractC46547ot7 abstractC46547ot72 = this.f104232a;
        if (abstractC46547ot72.f102728a < abstractC46547ot72.f102729b) {
            int mo20341k = abstractC46547ot72.mo20341k(mo20334r);
            Object zze = interfaceC34851Nv7.zze();
            this.f104232a.f102728a++;
            interfaceC34851Nv7.mo29756h(zze, this, c53068zt7);
            interfaceC34851Nv7.zzf(zze);
            this.f104232a.mo20352A(0);
            abstractC46547ot7.f102728a--;
            this.f104232a.mo20351a(mo20341k);
            return zze;
        }
        throw new zzaqw("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: K */
    public final void m18546K(int i) throws IOException {
        if (this.f104232a.mo20342j() != i) {
            throw zzaqw.m51278j();
        }
    }

    /* renamed from: L */
    public final void m18545L(int i) throws IOException {
        if ((this.f104233b & 7) != i) {
            throw zzaqw.m51287a();
        }
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: a */
    public final long mo18541a() throws IOException {
        m18545L(1);
        return this.f104232a.mo20333s();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: b */
    public final long mo18540b() throws IOException {
        m18545L(1);
        return this.f104232a.mo20331u();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: c */
    public final int mo18539c() throws IOException {
        m18545L(0);
        return this.f104232a.mo20334r();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: d */
    public final AbstractC44175kt7 mo18538d() throws IOException {
        m18545L(2);
        return this.f104232a.mo20328x();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: e */
    public final long mo18537e() throws IOException {
        m18545L(0);
        return this.f104232a.mo20330v();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: f */
    public final long mo18536f() throws IOException {
        m18545L(0);
        return this.f104232a.mo20329w();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: g */
    public final String mo18535g() throws IOException {
        m18545L(2);
        return this.f104232a.mo20327y();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: h */
    public final boolean mo18534h() throws IOException {
        m18545L(0);
        return this.f104232a.mo20349c();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: i */
    public final String mo18533i() throws IOException {
        m18545L(2);
        return this.f104232a.mo20326z();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: j */
    public final long mo18532j() throws IOException {
        m18545L(0);
        return this.f104232a.mo20332t();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: k */
    public final boolean mo18531k() throws IOException {
        int i;
        if (!this.f104232a.mo20350b() && (i = this.f104233b) != this.f104234c) {
            return this.f104232a.mo20348d(i);
        }
        return false;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: l */
    public final void mo18530l(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c41220fu7.m40571e(this.f104232a.mo20340l());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c41220fu7.m40571e(this.f104232a.mo20340l());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Integer.valueOf(this.f104232a.mo20340l()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Integer.valueOf(this.f104232a.mo20340l()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: m */
    public final void mo18529m(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C51289wt7) {
            C51289wt7 c51289wt7 = (C51289wt7) list;
            int i = this.f104233b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo20334r = this.f104232a.mo20334r();
                    m18543N(mo20334r);
                    int mo20342j = this.f104232a.mo20342j() + mo20334r;
                    do {
                        c51289wt7.m6155b(this.f104232a.mo20344h());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c51289wt7.m6155b(this.f104232a.mo20344h());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo20334r2 = this.f104232a.mo20334r();
                m18543N(mo20334r2);
                int mo20342j2 = this.f104232a.mo20342j() + mo20334r2;
                do {
                    list.add(Double.valueOf(this.f104232a.mo20344h()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Double.valueOf(this.f104232a.mo20344h()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: n */
    public final void mo18528n(List list) throws IOException {
        int mo20335q;
        if ((this.f104233b & 7) == 2) {
            do {
                list.add(mo18538d());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q = this.f104232a.mo20335q();
            } while (mo20335q == this.f104233b);
            this.f104235d = mo20335q;
            return;
        }
        throw zzaqw.m51287a();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: o */
    public final void mo18527o(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            int i = this.f104233b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c41220fu7.m40571e(this.f104232a.mo20339m());
                        if (this.f104232a.mo20350b()) {
                            return;
                        }
                        mo20335q2 = this.f104232a.mo20335q();
                    } while (mo20335q2 == this.f104233b);
                    this.f104235d = mo20335q2;
                    return;
                }
                throw zzaqw.m51287a();
            }
            int mo20334r = this.f104232a.mo20334r();
            m18544M(mo20334r);
            int mo20342j = this.f104232a.mo20342j() + mo20334r;
            do {
                c41220fu7.m40571e(this.f104232a.mo20339m());
            } while (this.f104232a.mo20342j() < mo20342j);
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f104232a.mo20339m()));
                    if (this.f104232a.mo20350b()) {
                        return;
                    }
                    mo20335q = this.f104232a.mo20335q();
                } while (mo20335q == this.f104233b);
                this.f104235d = mo20335q;
                return;
            }
            throw zzaqw.m51287a();
        }
        int mo20334r2 = this.f104232a.mo20334r();
        m18544M(mo20334r2);
        int mo20342j2 = this.f104232a.mo20342j() + mo20334r2;
        do {
            list.add(Integer.valueOf(this.f104232a.mo20339m()));
        } while (this.f104232a.mo20342j() < mo20342j2);
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: p */
    public final void mo18526p(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C33420Hs7) {
            C33420Hs7 c33420Hs7 = (C33420Hs7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c33420Hs7.m103252b(this.f104232a.mo20349c());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c33420Hs7.m103252b(this.f104232a.mo20349c());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Boolean.valueOf(this.f104232a.mo20349c()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Boolean.valueOf(this.f104232a.mo20349c()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: q */
    public final void mo18525q(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c36246Tu7.m82270e(this.f104232a.mo20329w());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c36246Tu7.m82270e(this.f104232a.mo20329w());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Long.valueOf(this.f104232a.mo20329w()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Long.valueOf(this.f104232a.mo20329w()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: r */
    public final void mo18524r(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c41220fu7.m40571e(this.f104232a.mo20334r());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c41220fu7.m40571e(this.f104232a.mo20334r());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Integer.valueOf(this.f104232a.mo20334r()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Integer.valueOf(this.f104232a.mo20334r()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: s */
    public final void mo18523s(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c41220fu7.m40571e(this.f104232a.mo20336p());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c41220fu7.m40571e(this.f104232a.mo20336p());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Integer.valueOf(this.f104232a.mo20336p()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Integer.valueOf(this.f104232a.mo20336p()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: t */
    public final void mo18522t(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            int i = this.f104233b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo20334r = this.f104232a.mo20334r();
                    m18543N(mo20334r);
                    int mo20342j = this.f104232a.mo20342j() + mo20334r;
                    do {
                        c36246Tu7.m82270e(this.f104232a.mo20331u());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c36246Tu7.m82270e(this.f104232a.mo20331u());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo20334r2 = this.f104232a.mo20334r();
                m18543N(mo20334r2);
                int mo20342j2 = this.f104232a.mo20342j() + mo20334r2;
                do {
                    list.add(Long.valueOf(this.f104232a.mo20331u()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Long.valueOf(this.f104232a.mo20331u()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: u */
    public final void mo18521u(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c36246Tu7.m82270e(this.f104232a.mo20330v());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c36246Tu7.m82270e(this.f104232a.mo20330v());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Long.valueOf(this.f104232a.mo20330v()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Long.valueOf(this.f104232a.mo20330v()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: v */
    public final void mo18520v(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c36246Tu7.m82270e(this.f104232a.mo20332t());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c36246Tu7.m82270e(this.f104232a.mo20332t());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Long.valueOf(this.f104232a.mo20332t()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Long.valueOf(this.f104232a.mo20332t()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: w */
    public final void mo18519w(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            int i = this.f104233b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo20342j = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                    do {
                        c41220fu7.m40571e(this.f104232a.mo20338n());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    m18546K(mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c41220fu7.m40571e(this.f104232a.mo20338n());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo20342j2 = this.f104232a.mo20342j() + this.f104232a.mo20334r();
                do {
                    list.add(Integer.valueOf(this.f104232a.mo20338n()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                m18546K(mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Integer.valueOf(this.f104232a.mo20338n()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: x */
    public final int mo18518x() throws IOException {
        m18545L(5);
        return this.f104232a.mo20339m();
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: y */
    public final void mo18517y(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C41220fu7) {
            C41220fu7 c41220fu7 = (C41220fu7) list;
            int i = this.f104233b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c41220fu7.m40571e(this.f104232a.mo20337o());
                        if (this.f104232a.mo20350b()) {
                            return;
                        }
                        mo20335q2 = this.f104232a.mo20335q();
                    } while (mo20335q2 == this.f104233b);
                    this.f104235d = mo20335q2;
                    return;
                }
                throw zzaqw.m51287a();
            }
            int mo20334r = this.f104232a.mo20334r();
            m18544M(mo20334r);
            int mo20342j = this.f104232a.mo20342j() + mo20334r;
            do {
                c41220fu7.m40571e(this.f104232a.mo20337o());
            } while (this.f104232a.mo20342j() < mo20342j);
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f104232a.mo20337o()));
                    if (this.f104232a.mo20350b()) {
                        return;
                    }
                    mo20335q = this.f104232a.mo20335q();
                } while (mo20335q == this.f104233b);
                this.f104235d = mo20335q;
                return;
            }
            throw zzaqw.m51287a();
        }
        int mo20334r2 = this.f104232a.mo20334r();
        m18544M(mo20334r2);
        int mo20342j2 = this.f104232a.mo20342j() + mo20334r2;
        do {
            list.add(Integer.valueOf(this.f104232a.mo20337o()));
        } while (this.f104232a.mo20342j() < mo20342j2);
    }

    @Override // p000.InterfaceC33681Iv7
    /* renamed from: z */
    public final void mo18516z(List list) throws IOException {
        int mo20335q;
        int mo20335q2;
        if (list instanceof C36246Tu7) {
            C36246Tu7 c36246Tu7 = (C36246Tu7) list;
            int i = this.f104233b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo20334r = this.f104232a.mo20334r();
                    m18543N(mo20334r);
                    int mo20342j = this.f104232a.mo20342j() + mo20334r;
                    do {
                        c36246Tu7.m82270e(this.f104232a.mo20333s());
                    } while (this.f104232a.mo20342j() < mo20342j);
                    return;
                }
                throw zzaqw.m51287a();
            }
            do {
                c36246Tu7.m82270e(this.f104232a.mo20333s());
                if (this.f104232a.mo20350b()) {
                    return;
                }
                mo20335q2 = this.f104232a.mo20335q();
            } while (mo20335q2 == this.f104233b);
            this.f104235d = mo20335q2;
            return;
        }
        int i2 = this.f104233b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo20334r2 = this.f104232a.mo20334r();
                m18543N(mo20334r2);
                int mo20342j2 = this.f104232a.mo20342j() + mo20334r2;
                do {
                    list.add(Long.valueOf(this.f104232a.mo20333s()));
                } while (this.f104232a.mo20342j() < mo20342j2);
                return;
            }
            throw zzaqw.m51287a();
        }
        do {
            list.add(Long.valueOf(this.f104232a.mo20333s()));
            if (this.f104232a.mo20350b()) {
                return;
            }
            mo20335q = this.f104232a.mo20335q();
        } while (mo20335q == this.f104233b);
        this.f104235d = mo20335q;
    }

    @Override // p000.InterfaceC33681Iv7
    public final double zza() throws IOException {
        m18545L(1);
        return this.f104232a.mo20344h();
    }

    @Override // p000.InterfaceC33681Iv7
    public final float zzb() throws IOException {
        m18545L(5);
        return this.f104232a.mo20343i();
    }

    @Override // p000.InterfaceC33681Iv7
    public final int zzc() throws IOException {
        int i = this.f104235d;
        if (i != 0) {
            this.f104233b = i;
            this.f104235d = 0;
        } else {
            i = this.f104232a.mo20335q();
            this.f104233b = i;
        }
        if (i == 0 || i == this.f104234c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // p000.InterfaceC33681Iv7
    public final int zzd() {
        return this.f104233b;
    }

    @Override // p000.InterfaceC33681Iv7
    public final int zze() throws IOException {
        m18545L(0);
        return this.f104232a.mo20340l();
    }

    @Override // p000.InterfaceC33681Iv7
    public final int zzg() throws IOException {
        m18545L(0);
        return this.f104232a.mo20338n();
    }

    @Override // p000.InterfaceC33681Iv7
    public final int zzh() throws IOException {
        m18545L(5);
        return this.f104232a.mo20337o();
    }

    @Override // p000.InterfaceC33681Iv7
    public final int zzi() throws IOException {
        m18545L(0);
        return this.f104232a.mo20336p();
    }
}
