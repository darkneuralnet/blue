package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* renamed from: com.google.crypto.tink.shaded.protobuf.S */
/* loaded from: classes6.dex */
public class C18171S extends AbstractC18169P<C18170Q, C18170Q> {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: A */
    public C18170Q mo47863g(Object obj) {
        return ((AbstractC18230t) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: B */
    public int mo47862h(C18170Q c18170q) {
        return c18170q.m47893d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: C */
    public int mo47861i(C18170Q c18170q) {
        return c18170q.m47892e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: D */
    public C18170Q mo47859k(C18170Q c18170q, C18170Q c18170q2) {
        if (!c18170q2.equals(C18170Q.m47894c())) {
            return C18170Q.m47888i(c18170q, c18170q2);
        }
        return c18170q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: E */
    public C18170Q mo47858n() {
        return C18170Q.m47887j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: F */
    public void mo47857o(Object obj, C18170Q c18170q) {
        mo47856p(obj, c18170q);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: G */
    public void mo47856p(Object obj, C18170Q c18170q) {
        ((AbstractC18230t) obj).unknownFields = c18170q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: H */
    public C18170Q mo47854r(C18170Q c18170q) {
        c18170q.m47889h();
        return c18170q;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: I */
    public void mo47853s(C18170Q c18170q, InterfaceC18186V interfaceC18186V) throws IOException {
        c18170q.m47882o(interfaceC18186V);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: J */
    public void mo47852t(C18170Q c18170q, InterfaceC18186V interfaceC18186V) throws IOException {
        c18170q.m47880q(interfaceC18186V);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: j */
    public void mo47860j(Object obj) {
        mo47863g(obj).m47889h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: q */
    public boolean mo47855q(InterfaceC18156L interfaceC18156L) {
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: u */
    public void mo47869a(C18170Q c18170q, int i, int i2) {
        c18170q.m47884m(C18178U.m47801c(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: v */
    public void mo47868b(C18170Q c18170q, int i, long j) {
        c18170q.m47884m(C18178U.m47801c(i, 1), Long.valueOf(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: w */
    public void mo47867c(C18170Q c18170q, int i, C18170Q c18170q2) {
        c18170q.m47884m(C18178U.m47801c(i, 3), c18170q2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: x */
    public void mo47866d(C18170Q c18170q, int i, AbstractC18199g abstractC18199g) {
        c18170q.m47884m(C18178U.m47801c(i, 2), abstractC18199g);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: y */
    public void mo47865e(C18170Q c18170q, int i, long j) {
        c18170q.m47884m(C18178U.m47801c(i, 0), Long.valueOf(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18169P
    /* renamed from: z */
    public C18170Q mo47864f(Object obj) {
        C18170Q mo47863g = mo47863g(obj);
        if (mo47863g == C18170Q.m47894c()) {
            C18170Q m47887j = C18170Q.m47887j();
            mo47856p(obj, m47887j);
            return m47887j;
        }
        return mo47863g;
    }
}
