package p000;

import com.google.android.gms.internal.recaptcha.zzrq;
import com.google.android.gms.internal.recaptcha.zzrr;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: Ai9 */
/* loaded from: classes6.dex */
public final class Ai9 implements InterfaceC51261wq9 {

    /* renamed from: a */
    public final AbstractC49403ti9 f975a;

    /* renamed from: b */
    public int f976b;

    /* renamed from: c */
    public int f977c;

    /* renamed from: d */
    public int f978d = 0;

    public Ai9(AbstractC49403ti9 abstractC49403ti9) {
        Fn9.m106449f(abstractC49403ti9, "input");
        this.f975a = abstractC49403ti9;
        abstractC49403ti9.f110933c = this;
    }

    /* renamed from: M */
    public static final void m115365M(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzrr.m51024g();
        }
    }

    /* renamed from: N */
    public static final void m115364N(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzrr.m51024g();
        }
    }

    /* renamed from: O */
    public static Ai9 m115363O(AbstractC49403ti9 abstractC49403ti9) {
        Ai9 ai9 = abstractC49403ti9.f110933c;
        if (ai9 != null) {
            return ai9;
        }
        return new Ai9(abstractC49403ti9);
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: A */
    public final void mo6269A(List<Float> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof C42318hl9) {
            C42318hl9 c42318hl9 = (C42318hl9) list;
            int i = this.f976b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        c42318hl9.m35885b(this.f975a.mo11869i());
                        if (this.f975a.mo11876b()) {
                            return;
                        }
                        mo11861q2 = this.f975a.mo11861q();
                    } while (mo11861q2 == this.f976b);
                    this.f978d = mo11861q2;
                    return;
                }
                throw zzrr.m51030a();
            }
            int mo11860r = this.f975a.mo11860r();
            m115365M(mo11860r);
            int mo11868j = this.f975a.mo11868j() + mo11860r;
            do {
                c42318hl9.m35885b(this.f975a.mo11869i());
            } while (this.f975a.mo11868j() < mo11868j);
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f975a.mo11869i()));
                    if (this.f975a.mo11876b()) {
                        return;
                    }
                    mo11861q = this.f975a.mo11861q();
                } while (mo11861q == this.f976b);
                this.f978d = mo11861q;
                return;
            }
            throw zzrr.m51030a();
        }
        int mo11860r2 = this.f975a.mo11860r();
        m115365M(mo11860r2);
        int mo11868j2 = this.f975a.mo11868j() + mo11860r2;
        do {
            list.add(Float.valueOf(this.f975a.mo11869i()));
        } while (this.f975a.mo11868j() < mo11868j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC51261wq9
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void mo6268B(Map<K, V> map, C49473tp9<K, V> c49473tp9, C48830sk9 c48830sk9) throws IOException {
        m115366L(2);
        int mo11867k = this.f975a.mo11867k(this.f975a.mo11860r());
        Object obj = c49473tp9.f111091b;
        Object obj2 = c49473tp9.f111093d;
        while (true) {
            try {
                int zzc = zzc();
                if (zzc == Integer.MAX_VALUE || this.f975a.mo11876b()) {
                    break;
                } else if (zzc != 1) {
                    if (zzc != 2) {
                        try {
                            if (!mo6253k()) {
                                throw new zzrr("Unable to parse map entry.");
                                break;
                            }
                        } catch (zzrq unused) {
                            if (!mo6253k()) {
                                throw new zzrr("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m115370H(c49473tp9.f111092c, c49473tp9.f111093d.getClass(), c48830sk9);
                    }
                } else {
                    obj = m115370H(c49473tp9.f111090a, null, null);
                }
            } finally {
                this.f975a.mo11877a(mo11867k);
            }
        }
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: C */
    public final <T> T mo6267C(InterfaceC38803br9<T> interfaceC38803br9, C48830sk9 c48830sk9) throws IOException {
        m115366L(3);
        return (T) m115369I(interfaceC38803br9, c48830sk9);
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: D */
    public final <T> T mo6266D(InterfaceC38803br9<T> interfaceC38803br9, C48830sk9 c48830sk9) throws IOException {
        m115366L(2);
        return (T) m115368J(interfaceC38803br9, c48830sk9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC51261wq9
    /* renamed from: E */
    public final <T> void mo6265E(List<T> list, InterfaceC38803br9<T> interfaceC38803br9, C48830sk9 c48830sk9) throws IOException {
        int mo11861q;
        int i = this.f976b;
        if ((i & 7) == 3) {
            do {
                list.add(m115369I(interfaceC38803br9, c48830sk9));
                if (!this.f975a.mo11876b() && this.f978d == 0) {
                    mo11861q = this.f975a.mo11861q();
                } else {
                    return;
                }
            } while (mo11861q == i);
            this.f978d = mo11861q;
            return;
        }
        throw zzrr.m51030a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC51261wq9
    /* renamed from: F */
    public final <T> void mo6264F(List<T> list, InterfaceC38803br9<T> interfaceC38803br9, C48830sk9 c48830sk9) throws IOException {
        int mo11861q;
        int i = this.f976b;
        if ((i & 7) == 2) {
            do {
                list.add(m115368J(interfaceC38803br9, c48830sk9));
                if (!this.f975a.mo11876b() && this.f978d == 0) {
                    mo11861q = this.f975a.mo11861q();
                } else {
                    return;
                }
            } while (mo11861q == i);
            this.f978d = mo11861q;
            return;
        }
        throw zzrr.m51030a();
    }

    /* renamed from: G */
    public final void m115371G(List<String> list, boolean z) throws IOException {
        String mo6257g;
        int mo11861q;
        int mo11861q2;
        if ((this.f976b & 7) == 2) {
            if ((list instanceof InterfaceC44127ko9) && !z) {
                InterfaceC44127ko9 interfaceC44127ko9 = (InterfaceC44127ko9) list;
                do {
                    interfaceC44127ko9.mo28435P2(mo6260d());
                    if (this.f975a.mo11876b()) {
                        return;
                    }
                    mo11861q2 = this.f975a.mo11861q();
                } while (mo11861q2 == this.f976b);
                this.f978d = mo11861q2;
                return;
            }
            do {
                if (z) {
                    mo6257g = mo6255i();
                } else {
                    mo6257g = mo6257g();
                }
                list.add(mo6257g);
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q = this.f975a.mo11861q();
            } while (mo11861q == this.f976b);
            this.f978d = mo11861q;
            return;
        }
        throw zzrr.m51030a();
    }

    /* renamed from: H */
    public final Object m115370H(Rs9 rs9, Class<?> cls, C48830sk9 c48830sk9) throws IOException {
        Rs9 rs92 = Rs9.f32768d;
        switch (rs9.ordinal()) {
            case 0:
                return Double.valueOf(zza());
            case 1:
                return Float.valueOf(zzb());
            case 2:
                return Long.valueOf(mo6254j());
            case 3:
                return Long.valueOf(mo6258f());
            case 4:
                return Integer.valueOf(zzg());
            case 5:
                return Long.valueOf(mo6263a());
            case 6:
                return Integer.valueOf(mo6240x());
            case 7:
                return Boolean.valueOf(mo6256h());
            case 8:
                return mo6255i();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m115366L(2);
                return m115368J(C45926nq9.m22329a().m22328b(cls), c48830sk9);
            case 11:
                return mo6260d();
            case 12:
                return Integer.valueOf(mo6261c());
            case 13:
                return Integer.valueOf(zze());
            case 14:
                return Integer.valueOf(zzh());
            case 15:
                return Long.valueOf(mo6262b());
            case 16:
                return Integer.valueOf(zzi());
            case 17:
                return Long.valueOf(mo6259e());
        }
    }

    /* renamed from: I */
    public final <T> T m115369I(InterfaceC38803br9<T> interfaceC38803br9, C48830sk9 c48830sk9) throws IOException {
        int i = this.f977c;
        this.f977c = ((this.f976b >>> 3) << 3) | 4;
        try {
            T zzc = interfaceC38803br9.zzc();
            interfaceC38803br9.mo62272b(zzc, this, c48830sk9);
            interfaceC38803br9.mo62273a(zzc);
            if (this.f976b == this.f977c) {
                return zzc;
            }
            throw zzrr.m51024g();
        } finally {
            this.f977c = i;
        }
    }

    /* renamed from: J */
    public final <T> T m115368J(InterfaceC38803br9<T> interfaceC38803br9, C48830sk9 c48830sk9) throws IOException {
        AbstractC49403ti9 abstractC49403ti9;
        int mo11860r = this.f975a.mo11860r();
        AbstractC49403ti9 abstractC49403ti92 = this.f975a;
        if (abstractC49403ti92.f110931a < abstractC49403ti92.f110932b) {
            int mo11867k = abstractC49403ti92.mo11867k(mo11860r);
            T zzc = interfaceC38803br9.zzc();
            this.f975a.f110931a++;
            interfaceC38803br9.mo62272b(zzc, this, c48830sk9);
            interfaceC38803br9.mo62273a(zzc);
            this.f975a.mo11878A(0);
            abstractC49403ti9.f110931a--;
            this.f975a.mo11877a(mo11867k);
            return zzc;
        }
        throw new zzrr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: K */
    public final void m115367K(int i) throws IOException {
        if (this.f975a.mo11868j() == i) {
            return;
        }
        throw zzrr.m51021j();
    }

    /* renamed from: L */
    public final void m115366L(int i) throws IOException {
        if ((this.f976b & 7) == i) {
            return;
        }
        throw zzrr.m51030a();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: a */
    public final long mo6263a() throws IOException {
        m115366L(1);
        return this.f975a.mo11859s();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: b */
    public final long mo6262b() throws IOException {
        m115366L(1);
        return this.f975a.mo11857u();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: c */
    public final int mo6261c() throws IOException {
        m115366L(0);
        return this.f975a.mo11860r();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: d */
    public final AbstractC45836nh9 mo6260d() throws IOException {
        m115366L(2);
        return this.f975a.mo11854x();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: e */
    public final long mo6259e() throws IOException {
        m115366L(0);
        return this.f975a.mo11856v();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: f */
    public final long mo6258f() throws IOException {
        m115366L(0);
        return this.f975a.mo11855w();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: g */
    public final String mo6257g() throws IOException {
        m115366L(2);
        return this.f975a.mo11853y();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: h */
    public final boolean mo6256h() throws IOException {
        m115366L(0);
        return this.f975a.mo11875c();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: i */
    public final String mo6255i() throws IOException {
        m115366L(2);
        return this.f975a.mo11852z();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: j */
    public final long mo6254j() throws IOException {
        m115366L(0);
        return this.f975a.mo11858t();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: k */
    public final boolean mo6253k() throws IOException {
        int i;
        if (!this.f975a.mo11876b() && (i = this.f976b) != this.f977c) {
            return this.f975a.mo11874d(i);
        }
        return false;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: l */
    public final void mo6252l(List<Integer> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        km9.zzh(this.f975a.mo11866l());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                km9.zzh(this.f975a.mo11866l());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Integer.valueOf(this.f975a.mo11866l()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Integer.valueOf(this.f975a.mo11866l()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: m */
    public final void mo6251m(List<Double> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Fj9) {
            Fj9 fj9 = (Fj9) list;
            int i = this.f976b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo11860r = this.f975a.mo11860r();
                    m115364N(mo11860r);
                    int mo11868j = this.f975a.mo11868j() + mo11860r;
                    do {
                        fj9.m106638b(this.f975a.mo11870h());
                    } while (this.f975a.mo11868j() < mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                fj9.m106638b(this.f975a.mo11870h());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo11860r2 = this.f975a.mo11860r();
                m115364N(mo11860r2);
                int mo11868j2 = this.f975a.mo11868j() + mo11860r2;
                do {
                    list.add(Double.valueOf(this.f975a.mo11870h()));
                } while (this.f975a.mo11868j() < mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Double.valueOf(this.f975a.mo11870h()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: n */
    public final void mo6250n(List<AbstractC45836nh9> list) throws IOException {
        int mo11861q;
        if ((this.f976b & 7) == 2) {
            do {
                list.add(mo6260d());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q = this.f975a.mo11861q();
            } while (mo11861q == this.f976b);
            this.f978d = mo11861q;
            return;
        }
        throw zzrr.m51030a();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: o */
    public final void mo6249o(List<Integer> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            int i = this.f976b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        km9.zzh(this.f975a.mo11865m());
                        if (this.f975a.mo11876b()) {
                            return;
                        }
                        mo11861q2 = this.f975a.mo11861q();
                    } while (mo11861q2 == this.f976b);
                    this.f978d = mo11861q2;
                    return;
                }
                throw zzrr.m51030a();
            }
            int mo11860r = this.f975a.mo11860r();
            m115365M(mo11860r);
            int mo11868j = this.f975a.mo11868j() + mo11860r;
            do {
                km9.zzh(this.f975a.mo11865m());
            } while (this.f975a.mo11868j() < mo11868j);
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f975a.mo11865m()));
                    if (this.f975a.mo11876b()) {
                        return;
                    }
                    mo11861q = this.f975a.mo11861q();
                } while (mo11861q == this.f976b);
                this.f978d = mo11861q;
                return;
            }
            throw zzrr.m51030a();
        }
        int mo11860r2 = this.f975a.mo11860r();
        m115365M(mo11860r2);
        int mo11868j2 = this.f975a.mo11868j() + mo11860r2;
        do {
            list.add(Integer.valueOf(this.f975a.mo11865m()));
        } while (this.f975a.mo11868j() < mo11868j2);
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: p */
    public final void mo6248p(List<Boolean> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Af9) {
            Af9 af9 = (Af9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        af9.m115390b(this.f975a.mo11875c());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                af9.m115390b(this.f975a.mo11875c());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Boolean.valueOf(this.f975a.mo11875c()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Boolean.valueOf(this.f975a.mo11875c()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: q */
    public final void mo6247q(List<Long> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        c41172fp9.m40783c(this.f975a.mo11855w());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                c41172fp9.m40783c(this.f975a.mo11855w());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Long.valueOf(this.f975a.mo11855w()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Long.valueOf(this.f975a.mo11855w()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: r */
    public final void mo6246r(List<Integer> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        km9.zzh(this.f975a.mo11860r());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                km9.zzh(this.f975a.mo11860r());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Integer.valueOf(this.f975a.mo11860r()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Integer.valueOf(this.f975a.mo11860r()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: s */
    public final void mo6245s(List<Integer> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        km9.zzh(this.f975a.mo11862p());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                km9.zzh(this.f975a.mo11862p());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Integer.valueOf(this.f975a.mo11862p()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Integer.valueOf(this.f975a.mo11862p()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: t */
    public final void mo6244t(List<Long> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            int i = this.f976b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo11860r = this.f975a.mo11860r();
                    m115364N(mo11860r);
                    int mo11868j = this.f975a.mo11868j() + mo11860r;
                    do {
                        c41172fp9.m40783c(this.f975a.mo11857u());
                    } while (this.f975a.mo11868j() < mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                c41172fp9.m40783c(this.f975a.mo11857u());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo11860r2 = this.f975a.mo11860r();
                m115364N(mo11860r2);
                int mo11868j2 = this.f975a.mo11868j() + mo11860r2;
                do {
                    list.add(Long.valueOf(this.f975a.mo11857u()));
                } while (this.f975a.mo11868j() < mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Long.valueOf(this.f975a.mo11857u()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: u */
    public final void mo6243u(List<Long> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        c41172fp9.m40783c(this.f975a.mo11856v());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                c41172fp9.m40783c(this.f975a.mo11856v());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Long.valueOf(this.f975a.mo11856v()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Long.valueOf(this.f975a.mo11856v()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: v */
    public final void mo6242v(List<Long> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        c41172fp9.m40783c(this.f975a.mo11858t());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                c41172fp9.m40783c(this.f975a.mo11858t());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Long.valueOf(this.f975a.mo11858t()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Long.valueOf(this.f975a.mo11858t()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: w */
    public final void mo6241w(List<Integer> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            int i = this.f976b & 7;
            if (i != 0) {
                if (i == 2) {
                    int mo11868j = this.f975a.mo11868j() + this.f975a.mo11860r();
                    do {
                        km9.zzh(this.f975a.mo11864n());
                    } while (this.f975a.mo11868j() < mo11868j);
                    m115367K(mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                km9.zzh(this.f975a.mo11864n());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int mo11868j2 = this.f975a.mo11868j() + this.f975a.mo11860r();
                do {
                    list.add(Integer.valueOf(this.f975a.mo11864n()));
                } while (this.f975a.mo11868j() < mo11868j2);
                m115367K(mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Integer.valueOf(this.f975a.mo11864n()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: x */
    public final int mo6240x() throws IOException {
        m115366L(5);
        return this.f975a.mo11865m();
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: y */
    public final void mo6239y(List<Integer> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof Km9) {
            Km9 km9 = (Km9) list;
            int i = this.f976b & 7;
            if (i != 2) {
                if (i == 5) {
                    do {
                        km9.zzh(this.f975a.mo11863o());
                        if (this.f975a.mo11876b()) {
                            return;
                        }
                        mo11861q2 = this.f975a.mo11861q();
                    } while (mo11861q2 == this.f976b);
                    this.f978d = mo11861q2;
                    return;
                }
                throw zzrr.m51030a();
            }
            int mo11860r = this.f975a.mo11860r();
            m115365M(mo11860r);
            int mo11868j = this.f975a.mo11868j() + mo11860r;
            do {
                km9.zzh(this.f975a.mo11863o());
            } while (this.f975a.mo11868j() < mo11868j);
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 2) {
            if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f975a.mo11863o()));
                    if (this.f975a.mo11876b()) {
                        return;
                    }
                    mo11861q = this.f975a.mo11861q();
                } while (mo11861q == this.f976b);
                this.f978d = mo11861q;
                return;
            }
            throw zzrr.m51030a();
        }
        int mo11860r2 = this.f975a.mo11860r();
        m115365M(mo11860r2);
        int mo11868j2 = this.f975a.mo11868j() + mo11860r2;
        do {
            list.add(Integer.valueOf(this.f975a.mo11863o()));
        } while (this.f975a.mo11868j() < mo11868j2);
    }

    @Override // p000.InterfaceC51261wq9
    /* renamed from: z */
    public final void mo6238z(List<Long> list) throws IOException {
        int mo11861q;
        int mo11861q2;
        if (list instanceof C41172fp9) {
            C41172fp9 c41172fp9 = (C41172fp9) list;
            int i = this.f976b & 7;
            if (i != 1) {
                if (i == 2) {
                    int mo11860r = this.f975a.mo11860r();
                    m115364N(mo11860r);
                    int mo11868j = this.f975a.mo11868j() + mo11860r;
                    do {
                        c41172fp9.m40783c(this.f975a.mo11859s());
                    } while (this.f975a.mo11868j() < mo11868j);
                    return;
                }
                throw zzrr.m51030a();
            }
            do {
                c41172fp9.m40783c(this.f975a.mo11859s());
                if (this.f975a.mo11876b()) {
                    return;
                }
                mo11861q2 = this.f975a.mo11861q();
            } while (mo11861q2 == this.f976b);
            this.f978d = mo11861q2;
            return;
        }
        int i2 = this.f976b & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int mo11860r2 = this.f975a.mo11860r();
                m115364N(mo11860r2);
                int mo11868j2 = this.f975a.mo11868j() + mo11860r2;
                do {
                    list.add(Long.valueOf(this.f975a.mo11859s()));
                } while (this.f975a.mo11868j() < mo11868j2);
                return;
            }
            throw zzrr.m51030a();
        }
        do {
            list.add(Long.valueOf(this.f975a.mo11859s()));
            if (this.f975a.mo11876b()) {
                return;
            }
            mo11861q = this.f975a.mo11861q();
        } while (mo11861q == this.f976b);
        this.f978d = mo11861q;
    }

    @Override // p000.InterfaceC51261wq9
    public final double zza() throws IOException {
        m115366L(1);
        return this.f975a.mo11870h();
    }

    @Override // p000.InterfaceC51261wq9
    public final float zzb() throws IOException {
        m115366L(5);
        return this.f975a.mo11869i();
    }

    @Override // p000.InterfaceC51261wq9
    public final int zzc() throws IOException {
        int i = this.f978d;
        if (i != 0) {
            this.f976b = i;
            this.f978d = 0;
        } else {
            i = this.f975a.mo11861q();
            this.f976b = i;
        }
        if (i != 0 && i != this.f977c) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // p000.InterfaceC51261wq9
    public final int zzd() {
        return this.f976b;
    }

    @Override // p000.InterfaceC51261wq9
    public final int zze() throws IOException {
        m115366L(0);
        return this.f975a.mo11866l();
    }

    @Override // p000.InterfaceC51261wq9
    public final int zzg() throws IOException {
        m115366L(0);
        return this.f975a.mo11864n();
    }

    @Override // p000.InterfaceC51261wq9
    public final int zzh() throws IOException {
        m115366L(5);
        return this.f975a.mo11863o();
    }

    @Override // p000.InterfaceC51261wq9
    public final int zzi() throws IOException {
        m115366L(0);
        return this.f975a.mo11862p();
    }
}
