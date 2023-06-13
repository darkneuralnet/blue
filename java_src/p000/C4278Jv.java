package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: Jv */
/* loaded from: classes8.dex */
public class C4278Jv implements InterfaceC6215P {

    /* renamed from: b */
    public C9585Y f18435b;

    public C4278Jv(C9585Y c9585y) {
        this.f18435b = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new C3812Iv(LR5.m96939b(mo78678b()));
    }

    @Override // p000.InterfaceC6215P
    /* renamed from: b */
    public InputStream mo78678b() {
        return new C46600oz0(this.f18435b);
    }

    @Override // p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        try {
            return mo17712a();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
