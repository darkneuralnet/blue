package com.google.protobuf;

import com.google.protobuf.C18489P;
import com.google.protobuf.C18565z;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.protobuf.g */
/* loaded from: classes6.dex */
public final class C18519g implements InterfaceC18468I {

    /* renamed from: a */
    public final AbstractC18516f f74824a;

    /* renamed from: b */
    public int f74825b;

    /* renamed from: c */
    public int f74826c;

    /* renamed from: d */
    public int f74827d = 0;

    /* renamed from: com.google.protobuf.g$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18520a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74828a;

        static {
            int[] iArr = new int[C18489P.EnumC18491b.values().length];
            f74828a = iArr;
            try {
                iArr[C18489P.EnumC18491b.f74763k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74767o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74756d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74769q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74762j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74761i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74757e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74760h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74758f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74766n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74770r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74771s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74772t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74773u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74764l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74768p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f74828a[C18489P.EnumC18491b.f74759g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C18519g(AbstractC18516f abstractC18516f) {
        AbstractC18516f abstractC18516f2 = (AbstractC18516f) C18544t.m45999b(abstractC18516f, "input");
        this.f74824a = abstractC18516f2;
        abstractC18516f2.f74813d = this;
    }

    /* renamed from: Q */
    public static C18519g m46219Q(AbstractC18516f abstractC18516f) {
        C18519g c18519g = abstractC18516f.f74813d;
        if (c18519g != null) {
            return c18519g;
        }
        return new C18519g(abstractC18516f);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: A */
    public void mo46235A(List<String> list) throws IOException {
        m46213W(list, true);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: B */
    public int mo46234B() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46244r();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: C */
    public void mo46233C(List<Long> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 1) {
                if (m46344b == 2) {
                    int mo46272A = this.f74824a.mo46272A();
                    m46208a0(mo46272A);
                    int mo46255d = this.f74824a.mo46255d() + mo46272A;
                    do {
                        c18564y.m45962f(this.f74824a.mo46246p());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18564y.m45962f(this.f74824a.mo46246p());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 1) {
            if (m46344b2 == 2) {
                int mo46272A2 = this.f74824a.mo46272A();
                m46208a0(mo46272A2);
                int mo46255d2 = this.f74824a.mo46255d() + mo46272A2;
                do {
                    list.add(Long.valueOf(this.f74824a.mo46246p()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Long.valueOf(this.f74824a.mo46246p()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: D */
    public void mo46232D(List<Integer> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18543s.mo45990L2(this.f74824a.mo46272A());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18543s.mo45990L2(this.f74824a.mo46272A());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Integer.valueOf(this.f74824a.mo46272A()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Integer.valueOf(this.f74824a.mo46272A()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: E */
    public int mo46231E() throws IOException {
        m46211Y(5);
        return this.f74824a.mo46247o();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: F */
    public long mo46230F() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46239w();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: G */
    public String mo46229G() throws IOException {
        m46211Y(2);
        return this.f74824a.mo46238x();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: H */
    public int mo46228H() throws IOException {
        m46211Y(5);
        return this.f74824a.mo46242t();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: I */
    public String mo46227I() throws IOException {
        m46211Y(2);
        return this.f74824a.mo46237y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC18468I
    @Deprecated
    /* renamed from: J */
    public <T> void mo46226J(List<T> list, InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        int mo46236z;
        if (C18489P.m46344b(this.f74825b) == 3) {
            int i = this.f74825b;
            do {
                list.add(m46215U(interfaceC33832Jm5, c18525k));
                if (!this.f74824a.mo46254e() && this.f74827d == 0) {
                    mo46236z = this.f74824a.mo46236z();
                } else {
                    return;
                }
            } while (mo46236z == i);
            this.f74827d = mo46236z;
            return;
        }
        throw InvalidProtocolBufferException.m46534e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: K */
    public <T> void mo46225K(List<T> list, InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        int mo46236z;
        if (C18489P.m46344b(this.f74825b) == 2) {
            int i = this.f74825b;
            do {
                list.add(m46214V(interfaceC33832Jm5, c18525k));
                if (!this.f74824a.mo46254e() && this.f74827d == 0) {
                    mo46236z = this.f74824a.mo46236z();
                } else {
                    return;
                }
            } while (mo46236z == i);
            this.f74827d = mo46236z;
            return;
        }
        throw InvalidProtocolBufferException.m46534e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <K, V> void mo46224L(Map<K, V> map, C18565z.C18566a<K, V> c18566a, C18525k c18525k) throws IOException {
        m46211Y(2);
        int mo46252j = this.f74824a.mo46252j(this.f74824a.mo46272A());
        Object obj = c18566a.f74899b;
        Object obj2 = c18566a.f74901d;
        while (true) {
            try {
                int mo46195n = mo46195n();
                if (mo46195n == Integer.MAX_VALUE || this.f74824a.mo46254e()) {
                    break;
                } else if (mo46195n != 1) {
                    if (mo46195n != 2) {
                        try {
                            if (!mo46192q()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!mo46192q()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = m46216T(c18566a.f74900c, c18566a.f74901d.getClass(), c18525k);
                    }
                } else {
                    obj = m46216T(c18566a.f74898a, null, null);
                }
            } finally {
                this.f74824a.mo46253i(mo46252j);
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: M */
    public <T> void mo46223M(T t, InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        m46211Y(3);
        m46218R(t, interfaceC33832Jm5, c18525k);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: N */
    public <T> void mo46222N(T t, InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        m46211Y(2);
        m46217S(t, interfaceC33832Jm5, c18525k);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    @Deprecated
    /* renamed from: O */
    public <T> T mo46221O(Class<T> cls, C18525k c18525k) throws IOException {
        m46211Y(3);
        return (T) m46215U(L94.m97649a().m97647c(cls), c18525k);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: P */
    public <T> T mo46220P(Class<T> cls, C18525k c18525k) throws IOException {
        m46211Y(2);
        return (T) m46214V(L94.m97649a().m97647c(cls), c18525k);
    }

    /* renamed from: R */
    public final <T> void m46218R(T t, InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        int i = this.f74826c;
        this.f74826c = C18489P.m46343c(C18489P.m46345a(this.f74825b), 4);
        try {
            interfaceC33832Jm5.mo46548j(t, this, c18525k);
            if (this.f74825b == this.f74826c) {
                return;
            }
            throw InvalidProtocolBufferException.m46531h();
        } finally {
            this.f74826c = i;
        }
    }

    /* renamed from: S */
    public final <T> void m46217S(T t, InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        AbstractC18516f abstractC18516f;
        int mo46272A = this.f74824a.mo46272A();
        AbstractC18516f abstractC18516f2 = this.f74824a;
        if (abstractC18516f2.f74810a < abstractC18516f2.f74811b) {
            int mo46252j = abstractC18516f2.mo46252j(mo46272A);
            this.f74824a.f74810a++;
            interfaceC33832Jm5.mo46548j(t, this, c18525k);
            this.f74824a.mo46256a(0);
            abstractC18516f.f74810a--;
            this.f74824a.mo46253i(mo46252j);
            return;
        }
        throw InvalidProtocolBufferException.m46530i();
    }

    /* renamed from: T */
    public final Object m46216T(C18489P.EnumC18491b enumC18491b, Class<?> cls, C18525k c18525k) throws IOException {
        switch (C18520a.f74828a[enumC18491b.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo46186w());
            case 2:
                return mo46201h();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo46204e());
            case 5:
                return Integer.valueOf(mo46231E());
            case 6:
                return Long.valueOf(mo46188u());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo46234B());
            case 9:
                return Long.valueOf(mo46189t());
            case 10:
                return mo46220P(cls, c18525k);
            case 11:
                return Integer.valueOf(mo46228H());
            case 12:
                return Long.valueOf(mo46207b());
            case 13:
                return Integer.valueOf(mo46203f());
            case 14:
                return Long.valueOf(mo46230F());
            case 15:
                return mo46227I();
            case 16:
                return Integer.valueOf(mo46206c());
            case 17:
                return Long.valueOf(mo46199j());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* renamed from: U */
    public final <T> T m46215U(InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        T mo46554d = interfaceC33832Jm5.mo46554d();
        m46218R(mo46554d, interfaceC33832Jm5, c18525k);
        interfaceC33832Jm5.mo46551g(mo46554d);
        return mo46554d;
    }

    /* renamed from: V */
    public final <T> T m46214V(InterfaceC33832Jm5<T> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        T mo46554d = interfaceC33832Jm5.mo46554d();
        m46217S(mo46554d, interfaceC33832Jm5, c18525k);
        interfaceC33832Jm5.mo46551g(mo46554d);
        return mo46554d;
    }

    /* renamed from: W */
    public void m46213W(List<String> list, boolean z) throws IOException {
        String mo46229G;
        int mo46236z;
        int mo46236z2;
        if (C18489P.m46344b(this.f74825b) == 2) {
            if ((list instanceof InterfaceC35017Oo2) && !z) {
                InterfaceC35017Oo2 interfaceC35017Oo2 = (InterfaceC35017Oo2) list;
                do {
                    interfaceC35017Oo2.mo13910P(mo46201h());
                    if (this.f74824a.mo46254e()) {
                        return;
                    }
                    mo46236z2 = this.f74824a.mo46236z();
                } while (mo46236z2 == this.f74825b);
                this.f74827d = mo46236z2;
                return;
            }
            do {
                if (z) {
                    mo46229G = mo46227I();
                } else {
                    mo46229G = mo46229G();
                }
                list.add(mo46229G);
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z = this.f74824a.mo46236z();
            } while (mo46236z == this.f74825b);
            this.f74827d = mo46236z;
            return;
        }
        throw InvalidProtocolBufferException.m46534e();
    }

    /* renamed from: X */
    public final void m46212X(int i) throws IOException {
        if (this.f74824a.mo46255d() == i) {
            return;
        }
        throw InvalidProtocolBufferException.m46528k();
    }

    /* renamed from: Y */
    public final void m46211Y(int i) throws IOException {
        if (C18489P.m46344b(this.f74825b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.m46534e();
    }

    /* renamed from: Z */
    public final void m46210Z(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m46531h();
        }
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: a */
    public void mo46209a(List<Long> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18564y.m45962f(this.f74824a.mo46239w());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18564y.m45962f(this.f74824a.mo46239w());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Long.valueOf(this.f74824a.mo46239w()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Long.valueOf(this.f74824a.mo46239w()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    /* renamed from: a0 */
    public final void m46208a0(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m46531h();
        }
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: b */
    public long mo46207b() throws IOException {
        m46211Y(1);
        return this.f74824a.mo46241u();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: c */
    public int mo46206c() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46272A();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: d */
    public int mo46205d() {
        return this.f74825b;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: e */
    public int mo46204e() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46248n();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: f */
    public int mo46203f() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46240v();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: g */
    public void mo46202g(List<Boolean> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18503d) {
            C18503d c18503d = (C18503d) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18503d.m46317f(this.f74824a.mo46251k());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18503d.m46317f(this.f74824a.mo46251k());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Boolean.valueOf(this.f74824a.mo46251k()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Boolean.valueOf(this.f74824a.mo46251k()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: h */
    public AbstractC18504e mo46201h() throws IOException {
        m46211Y(2);
        return this.f74824a.mo46250l();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: i */
    public void mo46200i(List<Integer> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18543s.mo45990L2(this.f74824a.mo46240v());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18543s.mo45990L2(this.f74824a.mo46240v());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Integer.valueOf(this.f74824a.mo46240v()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Integer.valueOf(this.f74824a.mo46240v()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: j */
    public long mo46199j() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46271B();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: k */
    public void mo46198k(List<Long> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 1) {
                if (m46344b == 2) {
                    int mo46272A = this.f74824a.mo46272A();
                    m46208a0(mo46272A);
                    int mo46255d = this.f74824a.mo46255d() + mo46272A;
                    do {
                        c18564y.m45962f(this.f74824a.mo46241u());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18564y.m45962f(this.f74824a.mo46241u());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 1) {
            if (m46344b2 == 2) {
                int mo46272A2 = this.f74824a.mo46272A();
                m46208a0(mo46272A2);
                int mo46255d2 = this.f74824a.mo46255d() + mo46272A2;
                do {
                    list.add(Long.valueOf(this.f74824a.mo46241u()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Long.valueOf(this.f74824a.mo46241u()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: l */
    public void mo46197l(List<Integer> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18543s.mo45990L2(this.f74824a.mo46244r());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18543s.mo45990L2(this.f74824a.mo46244r());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Integer.valueOf(this.f74824a.mo46244r()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Integer.valueOf(this.f74824a.mo46244r()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: m */
    public void mo46196m(List<Integer> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 2) {
                if (m46344b == 5) {
                    do {
                        c18543s.mo45990L2(this.f74824a.mo46247o());
                        if (this.f74824a.mo46254e()) {
                            return;
                        }
                        mo46236z2 = this.f74824a.mo46236z();
                    } while (mo46236z2 == this.f74825b);
                    this.f74827d = mo46236z2;
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            int mo46272A = this.f74824a.mo46272A();
            m46210Z(mo46272A);
            int mo46255d = this.f74824a.mo46255d() + mo46272A;
            do {
                c18543s.mo45990L2(this.f74824a.mo46247o());
            } while (this.f74824a.mo46255d() < mo46255d);
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 2) {
            if (m46344b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f74824a.mo46247o()));
                    if (this.f74824a.mo46254e()) {
                        return;
                    }
                    mo46236z = this.f74824a.mo46236z();
                } while (mo46236z == this.f74825b);
                this.f74827d = mo46236z;
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        int mo46272A2 = this.f74824a.mo46272A();
        m46210Z(mo46272A2);
        int mo46255d2 = this.f74824a.mo46255d() + mo46272A2;
        do {
            list.add(Integer.valueOf(this.f74824a.mo46247o()));
        } while (this.f74824a.mo46255d() < mo46255d2);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: n */
    public int mo46195n() throws IOException {
        int i = this.f74827d;
        if (i != 0) {
            this.f74825b = i;
            this.f74827d = 0;
        } else {
            this.f74825b = this.f74824a.mo46236z();
        }
        int i2 = this.f74825b;
        if (i2 != 0 && i2 != this.f74826c) {
            return C18489P.m46345a(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: o */
    public void mo46194o(List<String> list) throws IOException {
        m46213W(list, false);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: p */
    public void mo46193p(List<Float> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18534p) {
            C18534p c18534p = (C18534p) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 2) {
                if (m46344b == 5) {
                    do {
                        c18534p.m46080e(this.f74824a.mo46245q());
                        if (this.f74824a.mo46254e()) {
                            return;
                        }
                        mo46236z2 = this.f74824a.mo46236z();
                    } while (mo46236z2 == this.f74825b);
                    this.f74827d = mo46236z2;
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            int mo46272A = this.f74824a.mo46272A();
            m46210Z(mo46272A);
            int mo46255d = this.f74824a.mo46255d() + mo46272A;
            do {
                c18534p.m46080e(this.f74824a.mo46245q());
            } while (this.f74824a.mo46255d() < mo46255d);
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 2) {
            if (m46344b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f74824a.mo46245q()));
                    if (this.f74824a.mo46254e()) {
                        return;
                    }
                    mo46236z = this.f74824a.mo46236z();
                } while (mo46236z == this.f74825b);
                this.f74827d = mo46236z;
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        int mo46272A2 = this.f74824a.mo46272A();
        m46210Z(mo46272A2);
        int mo46255d2 = this.f74824a.mo46255d() + mo46272A2;
        do {
            list.add(Float.valueOf(this.f74824a.mo46245q()));
        } while (this.f74824a.mo46255d() < mo46255d2);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: q */
    public boolean mo46192q() throws IOException {
        int i;
        if (!this.f74824a.mo46254e() && (i = this.f74825b) != this.f74826c) {
            return this.f74824a.mo46270C(i);
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: r */
    public void mo46191r(List<AbstractC18504e> list) throws IOException {
        int mo46236z;
        if (C18489P.m46344b(this.f74825b) == 2) {
            do {
                list.add(mo46201h());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z = this.f74824a.mo46236z();
            } while (mo46236z == this.f74825b);
            this.f74827d = mo46236z;
            return;
        }
        throw InvalidProtocolBufferException.m46534e();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    public double readDouble() throws IOException {
        m46211Y(1);
        return this.f74824a.mo46249m();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    public float readFloat() throws IOException {
        m46211Y(5);
        return this.f74824a.mo46245q();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: s */
    public void mo46190s(List<Double> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18523i) {
            C18523i c18523i = (C18523i) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 1) {
                if (m46344b == 2) {
                    int mo46272A = this.f74824a.mo46272A();
                    m46208a0(mo46272A);
                    int mo46255d = this.f74824a.mo46255d() + mo46272A;
                    do {
                        c18523i.m46132e(this.f74824a.mo46249m());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18523i.m46132e(this.f74824a.mo46249m());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 1) {
            if (m46344b2 == 2) {
                int mo46272A2 = this.f74824a.mo46272A();
                m46208a0(mo46272A2);
                int mo46255d2 = this.f74824a.mo46255d() + mo46272A2;
                do {
                    list.add(Double.valueOf(this.f74824a.mo46249m()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Double.valueOf(this.f74824a.mo46249m()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: t */
    public long mo46189t() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46243s();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: u */
    public long mo46188u() throws IOException {
        m46211Y(1);
        return this.f74824a.mo46246p();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: v */
    public void mo46187v(List<Integer> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 2) {
                if (m46344b == 5) {
                    do {
                        c18543s.mo45990L2(this.f74824a.mo46242t());
                        if (this.f74824a.mo46254e()) {
                            return;
                        }
                        mo46236z2 = this.f74824a.mo46236z();
                    } while (mo46236z2 == this.f74825b);
                    this.f74827d = mo46236z2;
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            int mo46272A = this.f74824a.mo46272A();
            m46210Z(mo46272A);
            int mo46255d = this.f74824a.mo46255d() + mo46272A;
            do {
                c18543s.mo45990L2(this.f74824a.mo46242t());
            } while (this.f74824a.mo46255d() < mo46255d);
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 2) {
            if (m46344b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f74824a.mo46242t()));
                    if (this.f74824a.mo46254e()) {
                        return;
                    }
                    mo46236z = this.f74824a.mo46236z();
                } while (mo46236z == this.f74825b);
                this.f74827d = mo46236z;
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        int mo46272A2 = this.f74824a.mo46272A();
        m46210Z(mo46272A2);
        int mo46255d2 = this.f74824a.mo46255d() + mo46272A2;
        do {
            list.add(Integer.valueOf(this.f74824a.mo46242t()));
        } while (this.f74824a.mo46255d() < mo46255d2);
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: w */
    public boolean mo46186w() throws IOException {
        m46211Y(0);
        return this.f74824a.mo46251k();
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: x */
    public void mo46185x(List<Long> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18564y.m45962f(this.f74824a.mo46271B());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18564y.m45962f(this.f74824a.mo46271B());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Long.valueOf(this.f74824a.mo46271B()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Long.valueOf(this.f74824a.mo46271B()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: y */
    public void mo46184y(List<Long> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18564y) {
            C18564y c18564y = (C18564y) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18564y.m45962f(this.f74824a.mo46243s());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18564y.m45962f(this.f74824a.mo46243s());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Long.valueOf(this.f74824a.mo46243s()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Long.valueOf(this.f74824a.mo46243s()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }

    @Override // com.google.protobuf.InterfaceC18468I
    /* renamed from: z */
    public void mo46183z(List<Integer> list) throws IOException {
        int mo46236z;
        int mo46236z2;
        if (list instanceof C18543s) {
            C18543s c18543s = (C18543s) list;
            int m46344b = C18489P.m46344b(this.f74825b);
            if (m46344b != 0) {
                if (m46344b == 2) {
                    int mo46255d = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                    do {
                        c18543s.mo45990L2(this.f74824a.mo46248n());
                    } while (this.f74824a.mo46255d() < mo46255d);
                    m46212X(mo46255d);
                    return;
                }
                throw InvalidProtocolBufferException.m46534e();
            }
            do {
                c18543s.mo45990L2(this.f74824a.mo46248n());
                if (this.f74824a.mo46254e()) {
                    return;
                }
                mo46236z2 = this.f74824a.mo46236z();
            } while (mo46236z2 == this.f74825b);
            this.f74827d = mo46236z2;
            return;
        }
        int m46344b2 = C18489P.m46344b(this.f74825b);
        if (m46344b2 != 0) {
            if (m46344b2 == 2) {
                int mo46255d2 = this.f74824a.mo46255d() + this.f74824a.mo46272A();
                do {
                    list.add(Integer.valueOf(this.f74824a.mo46248n()));
                } while (this.f74824a.mo46255d() < mo46255d2);
                m46212X(mo46255d2);
                return;
            }
            throw InvalidProtocolBufferException.m46534e();
        }
        do {
            list.add(Integer.valueOf(this.f74824a.mo46248n()));
            if (this.f74824a.mo46254e()) {
                return;
            }
            mo46236z = this.f74824a.mo46236z();
        } while (mo46236z == this.f74825b);
        this.f74827d = mo46236z;
    }
}
