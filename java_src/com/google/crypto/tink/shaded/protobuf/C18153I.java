package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18178U;
import com.google.crypto.tink.shaded.protobuf.C18192d;
import com.google.crypto.tink.shaded.protobuf.C18225q;
import com.google.crypto.tink.shaded.protobuf.C18248w;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.I */
/* loaded from: classes6.dex */
public final class C18153I<T> implements InterfaceC18157M<T> {

    /* renamed from: a */
    public final InterfaceC18149F f74044a;

    /* renamed from: b */
    public final AbstractC18169P<?, ?> f74045b;

    /* renamed from: c */
    public final boolean f74046c;

    /* renamed from: d */
    public final AbstractC18221n<?> f74047d;

    public C18153I(AbstractC18169P<?, ?> abstractC18169P, AbstractC18221n<?> abstractC18221n, InterfaceC18149F interfaceC18149F) {
        this.f74045b = abstractC18169P;
        this.f74046c = abstractC18221n.mo47523e(interfaceC18149F);
        this.f74047d = abstractC18221n;
        this.f74044a = interfaceC18149F;
    }

    /* renamed from: m */
    public static <T> C18153I<T> m48014m(AbstractC18169P<?, ?> abstractC18169P, AbstractC18221n<?> abstractC18221n, InterfaceC18149F interfaceC18149F) {
        return new C18153I<>(abstractC18169P, abstractC18221n, interfaceC18149F);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo47994a(T t, byte[] bArr, int i, int i2, C18192d.C18194b c18194b) throws IOException {
        AbstractC18230t abstractC18230t = (AbstractC18230t) t;
        C18170Q c18170q = abstractC18230t.unknownFields;
        if (c18170q == C18170Q.m47894c()) {
            c18170q = C18170Q.m47887j();
            abstractC18230t.unknownFields = c18170q;
        }
        C18225q<AbstractC18230t.C18234d> m47442F = ((AbstractC18230t.AbstractC18233c) t).m47442F();
        AbstractC18230t.C18235e c18235e = null;
        while (i < i2) {
            int m47776I = C18192d.m47776I(bArr, i, c18194b);
            int i3 = c18194b.f74128a;
            if (i3 != C18178U.f74085a) {
                if (C18178U.m47802b(i3) == 2) {
                    AbstractC18230t.C18235e c18235e2 = (AbstractC18230t.C18235e) this.f74047d.mo47526b(c18194b.f74131d, this.f74044a, C18178U.m47803a(i3));
                    if (c18235e2 != null) {
                        i = C18192d.m47755p(M94.m95655a().m95652d(c18235e2.m47437b().getClass()), bArr, m47776I, i2, c18194b);
                        m47442F.m47495w(c18235e2.f74205b, c18194b.f74130c);
                    } else {
                        i = C18192d.m47778G(i3, bArr, m47776I, i2, c18170q, c18194b);
                    }
                    c18235e = c18235e2;
                } else {
                    i = C18192d.m47771N(i3, bArr, m47776I, i2, c18194b);
                }
            } else {
                int i4 = 0;
                AbstractC18199g abstractC18199g = null;
                while (m47776I < i2) {
                    m47776I = C18192d.m47776I(bArr, m47776I, c18194b);
                    int i5 = c18194b.f74128a;
                    int m47803a = C18178U.m47803a(i5);
                    int m47802b = C18178U.m47802b(i5);
                    if (m47803a != 2) {
                        if (m47803a == 3) {
                            if (c18235e != null) {
                                m47776I = C18192d.m47755p(M94.m95655a().m95652d(c18235e.m47437b().getClass()), bArr, m47776I, i2, c18194b);
                                m47442F.m47495w(c18235e.f74205b, c18194b.f74130c);
                            } else if (m47802b == 2) {
                                m47776I = C18192d.m47769b(bArr, m47776I, c18194b);
                                abstractC18199g = (AbstractC18199g) c18194b.f74130c;
                            }
                        }
                        if (i5 != C18178U.f74086b) {
                            break;
                        }
                        m47776I = C18192d.m47771N(i5, bArr, m47776I, i2, c18194b);
                    } else if (m47802b == 0) {
                        m47776I = C18192d.m47776I(bArr, m47776I, c18194b);
                        i4 = c18194b.f74128a;
                        c18235e = (AbstractC18230t.C18235e) this.f74047d.mo47526b(c18194b.f74131d, this.f74044a, i4);
                    } else if (i5 != C18178U.f74086b) {
                    }
                }
                if (abstractC18199g != null) {
                    c18170q.m47884m(C18178U.m47801c(i4, 2), abstractC18199g);
                }
                i = m47776I;
            }
        }
        if (i == i2) {
            return;
        }
        throw InvalidProtocolBufferException.m48004h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: b */
    public boolean mo47993b(T t, T t2) {
        if (!this.f74045b.mo47863g(t).equals(this.f74045b.mo47863g(t2))) {
            return false;
        }
        if (this.f74046c) {
            return this.f74047d.mo47525c(t).equals(this.f74047d.mo47525c(t2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: c */
    public void mo47992c(T t, T t2) {
        C18158N.m47978G(this.f74045b, t, t2);
        if (this.f74046c) {
            C18158N.m47980E(this.f74047d, t, t2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: d */
    public T mo47991d() {
        return (T) this.f74044a.newBuilderForType().mo47456E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: e */
    public int mo47990e(T t) {
        int hashCode = this.f74045b.mo47863g(t).hashCode();
        if (this.f74046c) {
            return (hashCode * 53) + this.f74047d.mo47525c(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: f */
    public final boolean mo47989f(T t) {
        return this.f74047d.mo47525c(t).m47503o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: g */
    public void mo47988g(T t) {
        this.f74045b.mo47860j(t);
        this.f74047d.mo47522f(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: h */
    public int mo47987h(T t) {
        int m48016k = m48016k(this.f74045b, t) + 0;
        if (this.f74046c) {
            return m48016k + this.f74047d.mo47525c(t).m47508j();
        }
        return m48016k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: i */
    public void mo47986i(T t, InterfaceC18156L interfaceC18156L, C18219m c18219m) throws IOException {
        m48015l(this.f74045b, this.f74047d, t, interfaceC18156L, c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: j */
    public void mo47985j(T t, InterfaceC18186V interfaceC18186V) throws IOException {
        Iterator<Map.Entry<?, Object>> m47500r = this.f74047d.mo47525c(t).m47500r();
        while (m47500r.hasNext()) {
            Map.Entry<?, Object> next = m47500r.next();
            C18225q.InterfaceC18227b interfaceC18227b = (C18225q.InterfaceC18227b) next.getKey();
            if (interfaceC18227b.getLiteJavaType() == C18178U.EnumC18185c.MESSAGE && !interfaceC18227b.isRepeated() && !interfaceC18227b.isPacked()) {
                if (next instanceof C18248w.C18250b) {
                    interfaceC18186V.mo47566b(interfaceC18227b.getNumber(), ((C18248w.C18250b) next).m47410a().m47404e());
                } else {
                    interfaceC18186V.mo47566b(interfaceC18227b.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m48012o(this.f74045b, t, interfaceC18186V);
    }

    /* renamed from: k */
    public final <UT, UB> int m48016k(AbstractC18169P<UT, UB> abstractC18169P, T t) {
        return abstractC18169P.mo47861i(abstractC18169P.mo47863g(t));
    }

    /* renamed from: l */
    public final <UT, UB, ET extends C18225q.InterfaceC18227b<ET>> void m48015l(AbstractC18169P<UT, UB> abstractC18169P, AbstractC18221n<ET> abstractC18221n, T t, InterfaceC18156L interfaceC18156L, C18219m c18219m) throws IOException {
        UB mo47864f = abstractC18169P.mo47864f(t);
        C18225q<ET> mo47524d = abstractC18221n.mo47524d(t);
        do {
            try {
                if (interfaceC18156L.mo47598n() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC18169P.mo47857o(t, mo47864f);
            }
        } while (m48013n(interfaceC18156L, c18219m, abstractC18221n, mo47524d, abstractC18169P, mo47864f));
    }

    /* renamed from: n */
    public final <UT, UB, ET extends C18225q.InterfaceC18227b<ET>> boolean m48013n(InterfaceC18156L interfaceC18156L, C18219m c18219m, AbstractC18221n<ET> abstractC18221n, C18225q<ET> c18225q, AbstractC18169P<UT, UB> abstractC18169P, UB ub) throws IOException {
        int mo47608d = interfaceC18156L.mo47608d();
        if (mo47608d != C18178U.f74085a) {
            if (C18178U.m47802b(mo47608d) == 2) {
                Object mo47526b = abstractC18221n.mo47526b(c18219m, this.f74044a, C18178U.m47803a(mo47608d));
                if (mo47526b != null) {
                    abstractC18221n.mo47520h(interfaceC18156L, mo47526b, c18219m, c18225q);
                    return true;
                }
                return abstractC18169P.m47897m(ub, interfaceC18156L);
            }
            return interfaceC18156L.mo47595q();
        }
        Object obj = null;
        int i = 0;
        AbstractC18199g abstractC18199g = null;
        while (interfaceC18156L.mo47598n() != Integer.MAX_VALUE) {
            int mo47608d2 = interfaceC18156L.mo47608d();
            if (mo47608d2 == C18178U.f74087c) {
                i = interfaceC18156L.mo47609c();
                obj = abstractC18221n.mo47526b(c18219m, this.f74044a, i);
            } else if (mo47608d2 == C18178U.f74088d) {
                if (obj != null) {
                    abstractC18221n.mo47520h(interfaceC18156L, obj, c18219m, c18225q);
                } else {
                    abstractC18199g = interfaceC18156L.mo47604h();
                }
            } else if (!interfaceC18156L.mo47595q()) {
                break;
            }
        }
        if (interfaceC18156L.mo47608d() == C18178U.f74086b) {
            if (abstractC18199g != null) {
                if (obj != null) {
                    abstractC18221n.mo47519i(abstractC18199g, obj, c18219m, c18225q);
                } else {
                    abstractC18169P.mo47866d(ub, i, abstractC18199g);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.m48010b();
    }

    /* renamed from: o */
    public final <UT, UB> void m48012o(AbstractC18169P<UT, UB> abstractC18169P, T t, InterfaceC18186V interfaceC18186V) throws IOException {
        abstractC18169P.mo47853s(abstractC18169P.mo47863g(t), interfaceC18186V);
    }
}
