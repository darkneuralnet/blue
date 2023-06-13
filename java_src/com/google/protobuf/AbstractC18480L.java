package com.google.protobuf;

import java.io.IOException;
/* renamed from: com.google.protobuf.L */
/* loaded from: classes6.dex */
public abstract class AbstractC18480L<T, B> {
    /* renamed from: a */
    public abstract void mo46411a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo46410b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo46409c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo46408d(B b, int i, AbstractC18504e abstractC18504e);

    /* renamed from: e */
    public abstract void mo46407e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo46406f(Object obj);

    /* renamed from: g */
    public abstract T mo46405g(Object obj);

    /* renamed from: h */
    public abstract int mo46404h(T t);

    /* renamed from: i */
    public abstract int mo46403i(T t);

    /* renamed from: j */
    public abstract void mo46402j(Object obj);

    /* renamed from: k */
    public abstract T mo46401k(T t, T t2);

    /* renamed from: l */
    public final void m46441l(B b, InterfaceC18468I interfaceC18468I) throws IOException {
        while (interfaceC18468I.mo46195n() != Integer.MAX_VALUE && m46440m(b, interfaceC18468I)) {
        }
    }

    /* renamed from: m */
    public final boolean m46440m(B b, InterfaceC18468I interfaceC18468I) throws IOException {
        int mo46205d = interfaceC18468I.mo46205d();
        int m46345a = C18489P.m46345a(mo46205d);
        int m46344b = C18489P.m46344b(mo46205d);
        if (m46344b != 0) {
            if (m46344b != 1) {
                if (m46344b != 2) {
                    if (m46344b != 3) {
                        if (m46344b != 4) {
                            if (m46344b == 5) {
                                mo46411a(b, m46345a, interfaceC18468I.mo46231E());
                                return true;
                            }
                            throw InvalidProtocolBufferException.m46534e();
                        }
                        return false;
                    }
                    B mo46400n = mo46400n();
                    int m46343c = C18489P.m46343c(m46345a, 4);
                    m46441l(mo46400n, interfaceC18468I);
                    if (m46343c == interfaceC18468I.mo46205d()) {
                        mo46409c(b, m46345a, mo46396r(mo46400n));
                        return true;
                    }
                    throw InvalidProtocolBufferException.m46537b();
                }
                mo46408d(b, m46345a, interfaceC18468I.mo46201h());
                return true;
            }
            mo46410b(b, m46345a, interfaceC18468I.mo46188u());
            return true;
        }
        mo46407e(b, m46345a, interfaceC18468I.mo46189t());
        return true;
    }

    /* renamed from: n */
    public abstract B mo46400n();

    /* renamed from: o */
    public abstract void mo46399o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo46398p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo46397q(InterfaceC18468I interfaceC18468I);

    /* renamed from: r */
    public abstract T mo46396r(B b);

    /* renamed from: s */
    public abstract void mo46395s(T t, InterfaceC18497Q interfaceC18497Q) throws IOException;

    /* renamed from: t */
    public abstract void mo46394t(T t, InterfaceC18497Q interfaceC18497Q) throws IOException;
}
