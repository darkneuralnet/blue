package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: Kv */
/* loaded from: classes8.dex */
public class C4614Kv extends AbstractC7627T {
    public C4614Kv(int i, C2042F c2042f) {
        super(true, i, m98182A(c2042f));
    }

    /* renamed from: A */
    public static byte[] m98182A(C2042F c2042f) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != c2042f.m108146f(); i++) {
            try {
                byteArrayOutputStream.write(((AbstractC5142M) c2042f.m108148d(i)).m96022h("BER"));
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed object: " + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p000.AbstractC7627T, p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89158o(z, this.f34595b ? 224 : 192, this.f34596c, this.f34597d);
    }
}
