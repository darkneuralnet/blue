package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.KotlinVersion;
import org.bouncycastle.asn1.ASN1ParsingException;
/* renamed from: C */
/* loaded from: classes8.dex */
public abstract class AbstractC0808C extends AbstractC7305S {

    /* renamed from: d */
    public static final char[] f3195d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public final byte[] f3196b;

    /* renamed from: c */
    public final int f3197c;

    public AbstractC0808C(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f3196b = C0210Ao.m115251d(bArr);
        this.f3197c = i;
    }

    /* renamed from: z */
    public static AbstractC0808C m113146z(int i, InputStream inputStream) throws IOException {
        if (i >= 1) {
            int read = inputStream.read();
            int i2 = i - 1;
            byte[] bArr = new byte[i2];
            if (i2 != 0) {
                if (LR5.m96938c(inputStream, bArr) != i2) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
                if (read > 0 && read < 8) {
                    byte b = bArr[i2 - 1];
                    if (b != ((byte) ((KotlinVersion.MAX_COMPONENT_VALUE << read) & b))) {
                        return new C42612iG0(bArr, read);
                    }
                }
            }
            return new MF0(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* renamed from: A */
    public byte[] m113149A() {
        byte[] bArr = this.f3196b;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] m115251d = C0210Ao.m115251d(bArr);
        int length = this.f3196b.length - 1;
        m115251d[length] = (byte) (m115251d[length] & (KotlinVersion.MAX_COMPONENT_VALUE << this.f3197c));
        return m115251d;
    }

    /* renamed from: C */
    public byte[] m113148C() {
        if (this.f3197c == 0) {
            return C0210Ao.m115251d(this.f3196b);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    /* renamed from: D */
    public String m113147D() {
        StringBuffer stringBuffer = new StringBuffer("#");
        try {
            byte[] encoded = getEncoded();
            for (int i = 0; i != encoded.length; i++) {
                char[] cArr = f3195d;
                stringBuffer.append(cArr[(encoded[i] >>> 4) & 15]);
                stringBuffer.append(cArr[encoded[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        byte[] bArr = this.f3196b;
        int length = bArr.length - 1;
        if (length < 0) {
            return 1;
        }
        return ((C0210Ao.m115243l(bArr, 0, length) * 257) ^ ((byte) (bArr[length] & (KotlinVersion.MAX_COMPONENT_VALUE << this.f3197c)))) ^ this.f3197c;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC0808C) {
            AbstractC0808C abstractC0808C = (AbstractC0808C) abstractC7305S;
            if (this.f3197c != abstractC0808C.f3197c) {
                return false;
            }
            byte[] bArr = this.f3196b;
            byte[] bArr2 = abstractC0808C.f3196b;
            int length = bArr.length;
            if (length != bArr2.length) {
                return false;
            }
            int i = length - 1;
            if (i < 0) {
                return true;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
            }
            byte b = bArr[i];
            int i3 = this.f3197c;
            return ((byte) (b & (KotlinVersion.MAX_COMPONENT_VALUE << i3))) == ((byte) (bArr2[i] & (KotlinVersion.MAX_COMPONENT_VALUE << i3)));
        }
        return false;
    }

    public String toString() {
        return m113147D();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        return new MF0(this.f3196b, this.f3197c);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new C42612iG0(this.f3196b, this.f3197c);
    }
}
