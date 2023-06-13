package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: Lv */
/* loaded from: classes8.dex */
public class C5126Lv implements InterfaceC1693E, SZ1 {

    /* renamed from: b */
    public final int f22236b;

    /* renamed from: c */
    public final C9585Y f22237c;

    public C5126Lv(int i, C9585Y c9585y) {
        this.f22236b = i;
        this.f22237c = c9585y;
    }

    @Override // p000.SZ1
    /* renamed from: a */
    public AbstractC7305S mo17712a() throws IOException {
        return new C4614Kv(this.f22236b, this.f22237c.m75886d());
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
