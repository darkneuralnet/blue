package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: OF0 */
/* loaded from: classes8.dex */
public class OF0 implements InterfaceC1693E, SZ1 {

    /* renamed from: b */
    public C9585Y f26265b;

    public OF0(C9585Y c9585y) {
        this.f26265b = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        try {
            return new C43205jG0(this.f26265b.m75886d());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        try {
            return mo17712a();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
