package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* renamed from: com.google.crypto.tink.shaded.protobuf.P */
/* loaded from: classes6.dex */
public abstract class AbstractC18169P<T, B> {
    /* renamed from: a */
    public abstract void mo47869a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo47868b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo47867c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo47866d(B b, int i, AbstractC18199g abstractC18199g);

    /* renamed from: e */
    public abstract void mo47865e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo47864f(Object obj);

    /* renamed from: g */
    public abstract T mo47863g(Object obj);

    /* renamed from: h */
    public abstract int mo47862h(T t);

    /* renamed from: i */
    public abstract int mo47861i(T t);

    /* renamed from: j */
    public abstract void mo47860j(Object obj);

    /* renamed from: k */
    public abstract T mo47859k(T t, T t2);

    /* renamed from: l */
    public final void m47898l(B b, InterfaceC18156L interfaceC18156L) throws IOException {
        while (interfaceC18156L.mo47598n() != Integer.MAX_VALUE && m47897m(b, interfaceC18156L)) {
        }
    }

    /* renamed from: m */
    public final boolean m47897m(B b, InterfaceC18156L interfaceC18156L) throws IOException {
        int mo47608d = interfaceC18156L.mo47608d();
        int m47803a = C18178U.m47803a(mo47608d);
        int m47802b = C18178U.m47802b(mo47608d);
        if (m47802b != 0) {
            if (m47802b != 1) {
                if (m47802b != 2) {
                    if (m47802b != 3) {
                        if (m47802b != 4) {
                            if (m47802b == 5) {
                                mo47869a(b, m47803a, interfaceC18156L.mo47631E());
                                return true;
                            }
                            throw InvalidProtocolBufferException.m48007e();
                        }
                        return false;
                    }
                    B mo47858n = mo47858n();
                    int m47801c = C18178U.m47801c(m47803a, 4);
                    m47898l(mo47858n, interfaceC18156L);
                    if (m47801c == interfaceC18156L.mo47608d()) {
                        mo47867c(b, m47803a, mo47854r(mo47858n));
                        return true;
                    }
                    throw InvalidProtocolBufferException.m48010b();
                }
                mo47866d(b, m47803a, interfaceC18156L.mo47604h());
                return true;
            }
            mo47868b(b, m47803a, interfaceC18156L.mo47591u());
            return true;
        }
        mo47865e(b, m47803a, interfaceC18156L.mo47592t());
        return true;
    }

    /* renamed from: n */
    public abstract B mo47858n();

    /* renamed from: o */
    public abstract void mo47857o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo47856p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo47855q(InterfaceC18156L interfaceC18156L);

    /* renamed from: r */
    public abstract T mo47854r(B b);

    /* renamed from: s */
    public abstract void mo47853s(T t, InterfaceC18186V interfaceC18186V) throws IOException;

    /* renamed from: t */
    public abstract void mo47852t(T t, InterfaceC18186V interfaceC18186V) throws IOException;
}
