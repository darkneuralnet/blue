package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: Pv */
/* loaded from: classes8.dex */
public class C6562Pv implements InterfaceC9262X {

    /* renamed from: b */
    public C9585Y f29387b;

    public C6562Pv(C9585Y c9585y) {
        this.f29387b = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new C6205Ov(this.f29387b.m75886d());
    }

    @Override // p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        try {
            return mo17712a();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
