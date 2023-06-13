package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: T70 */
/* loaded from: classes6.dex */
public final class T70 {
    private T70() {
    }

    /* renamed from: a */
    public static byte[] m84297a(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i <= Integer.MAX_VALUE - bArr2.length) {
                i += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    /* renamed from: b */
    public static final boolean m84296b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        if (i != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final void m84295c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i >= 0 && byteBuffer2.remaining() >= i && byteBuffer3.remaining() >= i && byteBuffer.remaining() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    /* renamed from: d */
    public static final byte[] m84294d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 >= 0 && bArr.length - i3 >= i && bArr2.length - i3 >= i2) {
            byte[] bArr3 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    /* renamed from: e */
    public static final byte[] m84293e(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return m84294d(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: f */
    public static final byte[] m84292f(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= bArr2.length) {
            int length = bArr.length - bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            for (int i = 0; i < bArr2.length; i++) {
                int i2 = length + i;
                copyOf[i2] = (byte) (copyOf[i2] ^ bArr2[i]);
            }
            return copyOf;
        }
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }
}
