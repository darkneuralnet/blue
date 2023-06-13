package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: Gv */
/* loaded from: classes8.dex */
public class C2986Gv implements InterfaceC1693E, SZ1 {

    /* renamed from: b */
    public final int f12611b;

    /* renamed from: c */
    public final C9585Y f12612c;

    public C2986Gv(int i, C9585Y c9585y) {
        this.f12611b = i;
        this.f12612c = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new C2512Fv(this.f12611b, this.f12612c.m75886d());
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
