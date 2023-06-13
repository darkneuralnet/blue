package com.google.protobuf;

import com.google.protobuf.C18489P;
import com.google.protobuf.C18531o;
import com.google.protobuf.C18554u;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.protobuf.G */
/* loaded from: classes6.dex */
public final class C18466G<T> implements InterfaceC33832Jm5<T> {

    /* renamed from: a */
    public final InterfaceC18462D f74711a;

    /* renamed from: b */
    public final AbstractC18480L<?, ?> f74712b;

    /* renamed from: c */
    public final boolean f74713c;

    /* renamed from: d */
    public final AbstractC18527l<?> f74714d;

    public C18466G(AbstractC18480L<?, ?> abstractC18480L, AbstractC18527l<?> abstractC18527l, InterfaceC18462D interfaceC18462D) {
        this.f74712b = abstractC18480L;
        this.f74713c = abstractC18527l.mo46116e(interfaceC18462D);
        this.f74714d = abstractC18527l;
        this.f74711a = interfaceC18462D;
    }

    /* renamed from: l */
    public static <T> C18466G<T> m46546l(AbstractC18480L<?, ?> abstractC18480L, AbstractC18527l<?> abstractC18527l, InterfaceC18462D interfaceC18462D) {
        return new C18466G<>(abstractC18480L, abstractC18527l, interfaceC18462D);
    }

    /* renamed from: a */
    public final <UT, UB> int m46557a(AbstractC18480L<UT, UB> abstractC18480L, T t) {
        return abstractC18480L.mo46403i(abstractC18480L.mo46405g(t));
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: b */
    public boolean mo46556b(T t, T t2) {
        if (!this.f74712b.mo46405g(t).equals(this.f74712b.mo46405g(t2))) {
            return false;
        }
        if (this.f74713c) {
            return this.f74714d.mo46118c(t).equals(this.f74714d.mo46118c(t2));
        }
        return true;
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: c */
    public void mo46555c(T t, T t2) {
        C18469J.m46521G(this.f74712b, t, t2);
        if (this.f74713c) {
            C18469J.m46523E(this.f74714d, t, t2);
        }
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: d */
    public T mo46554d() {
        InterfaceC18462D interfaceC18462D = this.f74711a;
        if (interfaceC18462D instanceof AbstractC18536r) {
            return (T) ((AbstractC18536r) interfaceC18462D).m46056O();
        }
        return (T) interfaceC18462D.newBuilderForType().mo46033E();
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: e */
    public int mo46553e(T t) {
        int hashCode = this.f74712b.mo46405g(t).hashCode();
        if (this.f74713c) {
            return (hashCode * 53) + this.f74714d.mo46118c(t).hashCode();
        }
        return hashCode;
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: f */
    public final boolean mo46552f(T t) {
        return this.f74714d.mo46118c(t).m46093p();
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: g */
    public void mo46551g(T t) {
        this.f74712b.mo46402j(t);
        this.f74714d.mo46115f(t);
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: h */
    public int mo46550h(T t) {
        int m46557a = m46557a(this.f74712b, t) + 0;
        if (this.f74713c) {
            return m46557a + this.f74714d.mo46118c(t).m46099j();
        }
        return m46557a;
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: i */
    public void mo46549i(T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        Iterator<Map.Entry<?, Object>> m46089t = this.f74714d.mo46118c(t).m46089t();
        while (m46089t.hasNext()) {
            Map.Entry<?, Object> next = m46089t.next();
            C18531o.InterfaceC18533b interfaceC18533b = (C18531o.InterfaceC18533b) next.getKey();
            if (interfaceC18533b.getLiteJavaType() == C18489P.EnumC18496c.MESSAGE && !interfaceC18533b.isRepeated() && !interfaceC18533b.isPacked()) {
                if (next instanceof C18554u.C18556b) {
                    interfaceC18497Q.mo46159b(interfaceC18533b.getNumber(), ((C18554u.C18556b) next).m45987a().m45981e());
                } else {
                    interfaceC18497Q.mo46159b(interfaceC18533b.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        m46544n(this.f74712b, t, interfaceC18497Q);
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: j */
    public void mo46548j(T t, InterfaceC18468I interfaceC18468I, C18525k c18525k) throws IOException {
        m46547k(this.f74712b, this.f74714d, t, interfaceC18468I, c18525k);
    }

    /* renamed from: k */
    public final <UT, UB, ET extends C18531o.InterfaceC18533b<ET>> void m46547k(AbstractC18480L<UT, UB> abstractC18480L, AbstractC18527l<ET> abstractC18527l, T t, InterfaceC18468I interfaceC18468I, C18525k c18525k) throws IOException {
        UB mo46406f = abstractC18480L.mo46406f(t);
        C18531o<ET> mo46117d = abstractC18527l.mo46117d(t);
        do {
            try {
                if (interfaceC18468I.mo46195n() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                abstractC18480L.mo46399o(t, mo46406f);
            }
        } while (m46545m(interfaceC18468I, c18525k, abstractC18527l, mo46117d, abstractC18480L, mo46406f));
    }

    /* renamed from: m */
    public final <UT, UB, ET extends C18531o.InterfaceC18533b<ET>> boolean m46545m(InterfaceC18468I interfaceC18468I, C18525k c18525k, AbstractC18527l<ET> abstractC18527l, C18531o<ET> c18531o, AbstractC18480L<UT, UB> abstractC18480L, UB ub) throws IOException {
        int mo46205d = interfaceC18468I.mo46205d();
        if (mo46205d != C18489P.f74752a) {
            if (C18489P.m46344b(mo46205d) == 2) {
                Object mo46119b = abstractC18527l.mo46119b(c18525k, this.f74711a, C18489P.m46345a(mo46205d));
                if (mo46119b != null) {
                    abstractC18527l.mo46113h(interfaceC18468I, mo46119b, c18525k, c18531o);
                    return true;
                }
                return abstractC18480L.m46440m(ub, interfaceC18468I);
            }
            return interfaceC18468I.mo46192q();
        }
        Object obj = null;
        int i = 0;
        AbstractC18504e abstractC18504e = null;
        while (interfaceC18468I.mo46195n() != Integer.MAX_VALUE) {
            int mo46205d2 = interfaceC18468I.mo46205d();
            if (mo46205d2 == C18489P.f74754c) {
                i = interfaceC18468I.mo46206c();
                obj = abstractC18527l.mo46119b(c18525k, this.f74711a, i);
            } else if (mo46205d2 == C18489P.f74755d) {
                if (obj != null) {
                    abstractC18527l.mo46113h(interfaceC18468I, obj, c18525k, c18531o);
                } else {
                    abstractC18504e = interfaceC18468I.mo46201h();
                }
            } else if (!interfaceC18468I.mo46192q()) {
                break;
            }
        }
        if (interfaceC18468I.mo46205d() == C18489P.f74753b) {
            if (abstractC18504e != null) {
                if (obj != null) {
                    abstractC18527l.mo46112i(abstractC18504e, obj, c18525k, c18531o);
                } else {
                    abstractC18480L.mo46408d(ub, i, abstractC18504e);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.m46537b();
    }

    /* renamed from: n */
    public final <UT, UB> void m46544n(AbstractC18480L<UT, UB> abstractC18480L, T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        abstractC18480L.mo46395s(abstractC18480L.mo46405g(t), interfaceC18497Q);
    }
}
