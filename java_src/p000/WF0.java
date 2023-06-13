package p000;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: WF0 */
/* loaded from: classes8.dex */
public class WF0 implements InterfaceC6215P {

    /* renamed from: b */
    public C44562lZ0 f40634b;

    public WF0(C44562lZ0 c44562lZ0) {
        this.f40634b = c44562lZ0;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new VF0(this.f40634b.m27154f());
    }

    @Override // p000.InterfaceC6215P
    /* renamed from: b */
    public InputStream mo78678b() {
        return this.f40634b;
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
