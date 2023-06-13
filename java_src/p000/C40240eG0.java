package p000;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: eG0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40240eG0 extends AbstractC7305S {

    /* renamed from: c */
    public static final char[] f78174c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public final byte[] f78175b;

    public C40240eG0(byte[] bArr) {
        this.f78175b = C0210Ao.m115251d(bArr);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        return C0210Ao.m115244k(this.f78175b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof C40240eG0) {
            return C0210Ao.m115254a(this.f78175b, ((C40240eG0) abstractC7305S).f78175b);
        }
        return false;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89159n(z, 28, this.f78175b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() {
        return ER5.m109017a(this.f78175b.length) + 1 + this.f78175b.length;
    }

    public String toString() {
        return m43063z();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return false;
    }

    /* renamed from: z */
    public String m43063z() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = f78174c;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new ASN1ParsingException("internal error encoding UniversalString");
        }
    }
}
