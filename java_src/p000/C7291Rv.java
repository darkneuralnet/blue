package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: Rv */
/* loaded from: classes8.dex */
public class C7291Rv implements InterfaceC1693E, SZ1 {

    /* renamed from: b */
    public boolean f32883b;

    /* renamed from: c */
    public int f32884c;

    /* renamed from: d */
    public C9585Y f32885d;

    public C7291Rv(boolean z, int i, C9585Y c9585y) {
        this.f32883b = z;
        this.f32884c = i;
        this.f32885d = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return this.f32885d.m75887c(this.f32883b, this.f32884c);
    }

    @Override // p000.InterfaceC1693E
    /* renamed from: c */
    public AbstractC7305S mo13850c() {
        try {
            return mo17712a();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
