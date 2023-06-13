package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18142B;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* loaded from: classes6.dex */
public final class C18214i implements InterfaceC18156L {

    /* renamed from: a */
    public final AbstractC18211h f74169a;

    /* renamed from: b */
    public int f74170b;

    /* renamed from: c */
    public int f74171c;

    /* renamed from: d */
    public int f74172d = 0;

    public C18214i(AbstractC18211h abstractC18211h) {
        AbstractC18211h abstractC18211h2 = (AbstractC18211h) C18238v.m47422b(abstractC18211h, "input");
        this.f74169a = abstractC18211h2;
        abstractC18211h2.f74158d = this;
    }

    /* renamed from: Q */
    public static C18214i m47619Q(AbstractC18211h abstractC18211h) {
        C18214i c18214i = abstractC18211h.f74158d;
        if (c18214i != null) {
            return c18214i;
        }
        return new C18214i(abstractC18211h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: A */
    public void mo47635A(List<String> list) throws IOException {
        m47616T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: B */
    public int mo47634B() throws IOException {
        m47614V(0);
        return this.f74169a.mo47644r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: C */
    public void mo47633C(List<Long> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 1) {
                if (m47802b == 2) {
                    int mo47672A = this.f74169a.mo47672A();
                    m47612X(mo47672A);
                    int mo47655d = this.f74169a.mo47655d() + mo47672A;
                    do {
                        c18141a.m48221f(this.f74169a.mo47646p());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18141a.m48221f(this.f74169a.mo47646p());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 1) {
            if (m47802b2 == 2) {
                int mo47672A2 = this.f74169a.mo47672A();
                m47612X(mo47672A2);
                int mo47655d2 = this.f74169a.mo47655d() + mo47672A2;
                do {
                    list.add(Long.valueOf(this.f74169a.mo47646p()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Long.valueOf(this.f74169a.mo47646p()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: D */
    public void mo47632D(List<Integer> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18237u.m47434L2(this.f74169a.mo47672A());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18237u.m47434L2(this.f74169a.mo47672A());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Integer.valueOf(this.f74169a.mo47672A()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Integer.valueOf(this.f74169a.mo47672A()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: E */
    public int mo47631E() throws IOException {
        m47614V(5);
        return this.f74169a.mo47647o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: F */
    public long mo47630F() throws IOException {
        m47614V(0);
        return this.f74169a.mo47639w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: G */
    public String mo47629G() throws IOException {
        m47614V(2);
        return this.f74169a.mo47638x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: H */
    public int mo47628H() throws IOException {
        m47614V(5);
        return this.f74169a.mo47642t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: I */
    public String mo47627I() throws IOException {
        m47614V(2);
        return this.f74169a.mo47637y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: J */
    public <T> T mo47626J(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
        m47614V(3);
        return (T) m47618R(interfaceC18157M, c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: K */
    public <T> T mo47625K(Class<T> cls, C18219m c18219m) throws IOException {
        m47614V(3);
        return (T) m47618R(M94.m95655a().m95652d(cls), c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: L */
    public <K, V> void mo47624L(Map<K, V> map, C18142B.C18143a<K, V> c18143a, C18219m c18219m) throws IOException {
        m47614V(2);
        this.f74169a.mo47652j(this.f74169a.mo47672A());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: M */
    public <T> void mo47623M(List<T> list, InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
        int mo47636z;
        if (C18178U.m47802b(this.f74170b) == 2) {
            int i = this.f74170b;
            do {
                list.add(m47617S(interfaceC18157M, c18219m));
                if (!this.f74169a.mo47654e() && this.f74172d == 0) {
                    mo47636z = this.f74169a.mo47636z();
                } else {
                    return;
                }
            } while (mo47636z == i);
            this.f74172d = mo47636z;
            return;
        }
        throw InvalidProtocolBufferException.m48007e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: N */
    public <T> T mo47622N(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
        m47614V(2);
        return (T) m47617S(interfaceC18157M, c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: O */
    public <T> T mo47621O(Class<T> cls, C18219m c18219m) throws IOException {
        m47614V(2);
        return (T) m47617S(M94.m95655a().m95652d(cls), c18219m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: P */
    public <T> void mo47620P(List<T> list, InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
        int mo47636z;
        if (C18178U.m47802b(this.f74170b) == 3) {
            int i = this.f74170b;
            do {
                list.add(m47618R(interfaceC18157M, c18219m));
                if (!this.f74169a.mo47654e() && this.f74172d == 0) {
                    mo47636z = this.f74169a.mo47636z();
                } else {
                    return;
                }
            } while (mo47636z == i);
            this.f74172d = mo47636z;
            return;
        }
        throw InvalidProtocolBufferException.m48007e();
    }

    /* renamed from: R */
    public final <T> T m47618R(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
        int i = this.f74171c;
        this.f74171c = C18178U.m47801c(C18178U.m47803a(this.f74170b), 4);
        try {
            T mo47991d = interfaceC18157M.mo47991d();
            interfaceC18157M.mo47986i(mo47991d, this, c18219m);
            interfaceC18157M.mo47988g(mo47991d);
            if (this.f74170b == this.f74171c) {
                return mo47991d;
            }
            throw InvalidProtocolBufferException.m48004h();
        } finally {
            this.f74171c = i;
        }
    }

    /* renamed from: S */
    public final <T> T m47617S(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
        AbstractC18211h abstractC18211h;
        int mo47672A = this.f74169a.mo47672A();
        AbstractC18211h abstractC18211h2 = this.f74169a;
        if (abstractC18211h2.f74155a < abstractC18211h2.f74156b) {
            int mo47652j = abstractC18211h2.mo47652j(mo47672A);
            T mo47991d = interfaceC18157M.mo47991d();
            this.f74169a.f74155a++;
            interfaceC18157M.mo47986i(mo47991d, this, c18219m);
            interfaceC18157M.mo47988g(mo47991d);
            this.f74169a.mo47656a(0);
            abstractC18211h.f74155a--;
            this.f74169a.mo47653i(mo47652j);
            return mo47991d;
        }
        throw InvalidProtocolBufferException.m48003i();
    }

    /* renamed from: T */
    public void m47616T(List<String> list, boolean z) throws IOException {
        String mo47629G;
        int mo47636z;
        int mo47636z2;
        if (C18178U.m47802b(this.f74170b) == 2) {
            if ((list instanceof InterfaceC35251Po2) && !z) {
                InterfaceC35251Po2 interfaceC35251Po2 = (InterfaceC35251Po2) list;
                do {
                    interfaceC35251Po2.mo11973q1(mo47604h());
                    if (this.f74169a.mo47654e()) {
                        return;
                    }
                    mo47636z2 = this.f74169a.mo47636z();
                } while (mo47636z2 == this.f74170b);
                this.f74172d = mo47636z2;
                return;
            }
            do {
                if (z) {
                    mo47629G = mo47627I();
                } else {
                    mo47629G = mo47629G();
                }
                list.add(mo47629G);
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z = this.f74169a.mo47636z();
            } while (mo47636z == this.f74170b);
            this.f74172d = mo47636z;
            return;
        }
        throw InvalidProtocolBufferException.m48007e();
    }

    /* renamed from: U */
    public final void m47615U(int i) throws IOException {
        if (this.f74169a.mo47655d() == i) {
            return;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: V */
    public final void m47614V(int i) throws IOException {
        if (C18178U.m47802b(this.f74170b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.m48007e();
    }

    /* renamed from: W */
    public final void m47613W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m48004h();
        }
    }

    /* renamed from: X */
    public final void m47612X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m48004h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: a */
    public void mo47611a(List<Long> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18141a.m48221f(this.f74169a.mo47639w());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18141a.m48221f(this.f74169a.mo47639w());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Long.valueOf(this.f74169a.mo47639w()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Long.valueOf(this.f74169a.mo47639w()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: b */
    public long mo47610b() throws IOException {
        m47614V(1);
        return this.f74169a.mo47641u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: c */
    public int mo47609c() throws IOException {
        m47614V(0);
        return this.f74169a.mo47672A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: d */
    public int mo47608d() {
        return this.f74170b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: e */
    public int mo47607e() throws IOException {
        m47614V(0);
        return this.f74169a.mo47648n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: f */
    public int mo47606f() throws IOException {
        m47614V(0);
        return this.f74169a.mo47640v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: g */
    public void mo47605g(List<Boolean> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18198f) {
            C18198f c18198f = (C18198f) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18198f.m47718f(this.f74169a.mo47651k());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18198f.m47718f(this.f74169a.mo47651k());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Boolean.valueOf(this.f74169a.mo47651k()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Boolean.valueOf(this.f74169a.mo47651k()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: h */
    public AbstractC18199g mo47604h() throws IOException {
        m47614V(2);
        return this.f74169a.mo47650l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: i */
    public void mo47603i(List<Integer> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18237u.m47434L2(this.f74169a.mo47640v());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18237u.m47434L2(this.f74169a.mo47640v());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Integer.valueOf(this.f74169a.mo47640v()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Integer.valueOf(this.f74169a.mo47640v()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: j */
    public long mo47602j() throws IOException {
        m47614V(0);
        return this.f74169a.mo47671B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: k */
    public void mo47601k(List<Long> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 1) {
                if (m47802b == 2) {
                    int mo47672A = this.f74169a.mo47672A();
                    m47612X(mo47672A);
                    int mo47655d = this.f74169a.mo47655d() + mo47672A;
                    do {
                        c18141a.m48221f(this.f74169a.mo47641u());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18141a.m48221f(this.f74169a.mo47641u());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 1) {
            if (m47802b2 == 2) {
                int mo47672A2 = this.f74169a.mo47672A();
                m47612X(mo47672A2);
                int mo47655d2 = this.f74169a.mo47655d() + mo47672A2;
                do {
                    list.add(Long.valueOf(this.f74169a.mo47641u()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Long.valueOf(this.f74169a.mo47641u()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: l */
    public void mo47600l(List<Integer> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18237u.m47434L2(this.f74169a.mo47644r());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18237u.m47434L2(this.f74169a.mo47644r());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Integer.valueOf(this.f74169a.mo47644r()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Integer.valueOf(this.f74169a.mo47644r()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: m */
    public void mo47599m(List<Integer> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 2) {
                if (m47802b == 5) {
                    do {
                        c18237u.m47434L2(this.f74169a.mo47647o());
                        if (this.f74169a.mo47654e()) {
                            return;
                        }
                        mo47636z2 = this.f74169a.mo47636z();
                    } while (mo47636z2 == this.f74170b);
                    this.f74172d = mo47636z2;
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            int mo47672A = this.f74169a.mo47672A();
            m47613W(mo47672A);
            int mo47655d = this.f74169a.mo47655d() + mo47672A;
            do {
                c18237u.m47434L2(this.f74169a.mo47647o());
            } while (this.f74169a.mo47655d() < mo47655d);
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 2) {
            if (m47802b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f74169a.mo47647o()));
                    if (this.f74169a.mo47654e()) {
                        return;
                    }
                    mo47636z = this.f74169a.mo47636z();
                } while (mo47636z == this.f74170b);
                this.f74172d = mo47636z;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        int mo47672A2 = this.f74169a.mo47672A();
        m47613W(mo47672A2);
        int mo47655d2 = this.f74169a.mo47655d() + mo47672A2;
        do {
            list.add(Integer.valueOf(this.f74169a.mo47647o()));
        } while (this.f74169a.mo47655d() < mo47655d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: n */
    public int mo47598n() throws IOException {
        int i = this.f74172d;
        if (i != 0) {
            this.f74170b = i;
            this.f74172d = 0;
        } else {
            this.f74170b = this.f74169a.mo47636z();
        }
        int i2 = this.f74170b;
        if (i2 != 0 && i2 != this.f74171c) {
            return C18178U.m47803a(i2);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: o */
    public void mo47597o(List<String> list) throws IOException {
        m47616T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: p */
    public void mo47596p(List<Float> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18228r) {
            C18228r c18228r = (C18228r) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 2) {
                if (m47802b == 5) {
                    do {
                        c18228r.m47491e(this.f74169a.mo47645q());
                        if (this.f74169a.mo47654e()) {
                            return;
                        }
                        mo47636z2 = this.f74169a.mo47636z();
                    } while (mo47636z2 == this.f74170b);
                    this.f74172d = mo47636z2;
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            int mo47672A = this.f74169a.mo47672A();
            m47613W(mo47672A);
            int mo47655d = this.f74169a.mo47655d() + mo47672A;
            do {
                c18228r.m47491e(this.f74169a.mo47645q());
            } while (this.f74169a.mo47655d() < mo47655d);
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 2) {
            if (m47802b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f74169a.mo47645q()));
                    if (this.f74169a.mo47654e()) {
                        return;
                    }
                    mo47636z = this.f74169a.mo47636z();
                } while (mo47636z == this.f74170b);
                this.f74172d = mo47636z;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        int mo47672A2 = this.f74169a.mo47672A();
        m47613W(mo47672A2);
        int mo47655d2 = this.f74169a.mo47655d() + mo47672A2;
        do {
            list.add(Float.valueOf(this.f74169a.mo47645q()));
        } while (this.f74169a.mo47655d() < mo47655d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: q */
    public boolean mo47595q() throws IOException {
        int i;
        if (!this.f74169a.mo47654e() && (i = this.f74170b) != this.f74171c) {
            return this.f74169a.mo47670C(i);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: r */
    public void mo47594r(List<AbstractC18199g> list) throws IOException {
        int mo47636z;
        if (C18178U.m47802b(this.f74170b) == 2) {
            do {
                list.add(mo47604h());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z = this.f74169a.mo47636z();
            } while (mo47636z == this.f74170b);
            this.f74172d = mo47636z;
            return;
        }
        throw InvalidProtocolBufferException.m48007e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    public double readDouble() throws IOException {
        m47614V(1);
        return this.f74169a.mo47649m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    public float readFloat() throws IOException {
        m47614V(5);
        return this.f74169a.mo47645q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: s */
    public void mo47593s(List<Double> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18217k) {
            C18217k c18217k = (C18217k) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 1) {
                if (m47802b == 2) {
                    int mo47672A = this.f74169a.mo47672A();
                    m47612X(mo47672A);
                    int mo47655d = this.f74169a.mo47655d() + mo47672A;
                    do {
                        c18217k.m47539e(this.f74169a.mo47649m());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18217k.m47539e(this.f74169a.mo47649m());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 1) {
            if (m47802b2 == 2) {
                int mo47672A2 = this.f74169a.mo47672A();
                m47612X(mo47672A2);
                int mo47655d2 = this.f74169a.mo47655d() + mo47672A2;
                do {
                    list.add(Double.valueOf(this.f74169a.mo47649m()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Double.valueOf(this.f74169a.mo47649m()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: t */
    public long mo47592t() throws IOException {
        m47614V(0);
        return this.f74169a.mo47643s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: u */
    public long mo47591u() throws IOException {
        m47614V(1);
        return this.f74169a.mo47646p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: v */
    public void mo47590v(List<Integer> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 2) {
                if (m47802b == 5) {
                    do {
                        c18237u.m47434L2(this.f74169a.mo47642t());
                        if (this.f74169a.mo47654e()) {
                            return;
                        }
                        mo47636z2 = this.f74169a.mo47636z();
                    } while (mo47636z2 == this.f74170b);
                    this.f74172d = mo47636z2;
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            int mo47672A = this.f74169a.mo47672A();
            m47613W(mo47672A);
            int mo47655d = this.f74169a.mo47655d() + mo47672A;
            do {
                c18237u.m47434L2(this.f74169a.mo47642t());
            } while (this.f74169a.mo47655d() < mo47655d);
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 2) {
            if (m47802b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f74169a.mo47642t()));
                    if (this.f74169a.mo47654e()) {
                        return;
                    }
                    mo47636z = this.f74169a.mo47636z();
                } while (mo47636z == this.f74170b);
                this.f74172d = mo47636z;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        int mo47672A2 = this.f74169a.mo47672A();
        m47613W(mo47672A2);
        int mo47655d2 = this.f74169a.mo47655d() + mo47672A2;
        do {
            list.add(Integer.valueOf(this.f74169a.mo47642t()));
        } while (this.f74169a.mo47655d() < mo47655d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: w */
    public boolean mo47589w() throws IOException {
        m47614V(0);
        return this.f74169a.mo47651k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: x */
    public void mo47588x(List<Long> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18141a.m48221f(this.f74169a.mo47671B());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18141a.m48221f(this.f74169a.mo47671B());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Long.valueOf(this.f74169a.mo47671B()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Long.valueOf(this.f74169a.mo47671B()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: y */
    public void mo47587y(List<Long> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18141A) {
            C18141A c18141a = (C18141A) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18141a.m48221f(this.f74169a.mo47643s());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18141a.m48221f(this.f74169a.mo47643s());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Long.valueOf(this.f74169a.mo47643s()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Long.valueOf(this.f74169a.mo47643s()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
    /* renamed from: z */
    public void mo47586z(List<Integer> list) throws IOException {
        int mo47636z;
        int mo47636z2;
        if (list instanceof C18237u) {
            C18237u c18237u = (C18237u) list;
            int m47802b = C18178U.m47802b(this.f74170b);
            if (m47802b != 0) {
                if (m47802b == 2) {
                    int mo47655d = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                    do {
                        c18237u.m47434L2(this.f74169a.mo47648n());
                    } while (this.f74169a.mo47655d() < mo47655d);
                    m47615U(mo47655d);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                c18237u.m47434L2(this.f74169a.mo47648n());
                if (this.f74169a.mo47654e()) {
                    return;
                }
                mo47636z2 = this.f74169a.mo47636z();
            } while (mo47636z2 == this.f74170b);
            this.f74172d = mo47636z2;
            return;
        }
        int m47802b2 = C18178U.m47802b(this.f74170b);
        if (m47802b2 != 0) {
            if (m47802b2 == 2) {
                int mo47655d2 = this.f74169a.mo47655d() + this.f74169a.mo47672A();
                do {
                    list.add(Integer.valueOf(this.f74169a.mo47648n()));
                } while (this.f74169a.mo47655d() < mo47655d2);
                m47615U(mo47655d2);
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }
        do {
            list.add(Integer.valueOf(this.f74169a.mo47648n()));
            if (this.f74169a.mo47654e()) {
                return;
            }
            mo47636z = this.f74169a.mo47636z();
        } while (mo47636z == this.f74170b);
        this.f74172d = mo47636z;
    }
}
