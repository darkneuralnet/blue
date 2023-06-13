package com.google.protobuf;

import java.io.IOException;
/* renamed from: com.google.protobuf.N */
/* loaded from: classes6.dex */
public class C18482N extends AbstractC18480L<C18481M, C18481M> {
    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: A */
    public C18481M mo46405g(Object obj) {
        return ((AbstractC18536r) obj).unknownFields;
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: B */
    public int mo46404h(C18481M c18481m) {
        return c18481m.m46436d();
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: C */
    public int mo46403i(C18481M c18481m) {
        return c18481m.m46435e();
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: D */
    public C18481M mo46401k(C18481M c18481m, C18481M c18481m2) {
        if (C18481M.m46437c().equals(c18481m2)) {
            return c18481m;
        }
        if (C18481M.m46437c().equals(c18481m)) {
            return C18481M.m46430j(c18481m, c18481m2);
        }
        return c18481m.m46431i(c18481m2);
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: E */
    public C18481M mo46400n() {
        return C18481M.m46429k();
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: F */
    public void mo46399o(Object obj, C18481M c18481m) {
        mo46398p(obj, c18481m);
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: G */
    public void mo46398p(Object obj, C18481M c18481m) {
        ((AbstractC18536r) obj).unknownFields = c18481m;
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: H */
    public C18481M mo46396r(C18481M c18481m) {
        c18481m.m46432h();
        return c18481m;
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: I */
    public void mo46395s(C18481M c18481m, InterfaceC18497Q interfaceC18497Q) throws IOException {
        c18481m.m46424p(interfaceC18497Q);
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: J */
    public void mo46394t(C18481M c18481m, InterfaceC18497Q interfaceC18497Q) throws IOException {
        c18481m.m46422r(interfaceC18497Q);
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: j */
    public void mo46402j(Object obj) {
        mo46405g(obj).m46432h();
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: q */
    public boolean mo46397q(InterfaceC18468I interfaceC18468I) {
        return false;
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: u */
    public void mo46411a(C18481M c18481m, int i, int i2) {
        c18481m.m46426n(C18489P.m46343c(i, 5), Integer.valueOf(i2));
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: v */
    public void mo46410b(C18481M c18481m, int i, long j) {
        c18481m.m46426n(C18489P.m46343c(i, 1), Long.valueOf(j));
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: w */
    public void mo46409c(C18481M c18481m, int i, C18481M c18481m2) {
        c18481m.m46426n(C18489P.m46343c(i, 3), c18481m2);
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: x */
    public void mo46408d(C18481M c18481m, int i, AbstractC18504e abstractC18504e) {
        c18481m.m46426n(C18489P.m46343c(i, 2), abstractC18504e);
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: y */
    public void mo46407e(C18481M c18481m, int i, long j) {
        c18481m.m46426n(C18489P.m46343c(i, 0), Long.valueOf(j));
    }

    @Override // com.google.protobuf.AbstractC18480L
    /* renamed from: z */
    public C18481M mo46406f(Object obj) {
        C18481M mo46405g = mo46405g(obj);
        if (mo46405g == C18481M.m46437c()) {
            C18481M m46429k = C18481M.m46429k();
            mo46398p(obj, m46429k);
            return m46429k;
        }
        return mo46405g;
    }
}
