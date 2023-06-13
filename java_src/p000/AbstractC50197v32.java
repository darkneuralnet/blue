package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: v32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC50197v32 {

    /* renamed from: a */
    public int[] f113447a;

    /* renamed from: b */
    public final int f113448b;

    public AbstractC50197v32(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f113447a = C44641lh0.m26999e(bArr);
            this.f113448b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    public ByteBuffer m9266a(byte[] bArr, int i) {
        int[] mo4216b = mo4216b(C44641lh0.m26999e(bArr), i);
        int[] iArr = (int[]) mo4216b.clone();
        C44641lh0.m27000d(iArr);
        for (int i2 = 0; i2 < mo4216b.length; i2++) {
            mo4216b[i2] = mo4216b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(mo4216b, 0, 16);
        return order;
    }

    /* renamed from: b */
    public abstract int[] mo4216b(int[] iArr, int i);

    /* renamed from: c */
    public byte[] mo4215c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        m9265f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    /* renamed from: d */
    public void mo4214d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            m9265f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: e */
    public abstract int mo4213e();

    /* renamed from: f */
    public final void m9265f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == mo4213e()) {
            int remaining = byteBuffer2.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer m9266a = m9266a(bArr, this.f113448b + i2);
                if (i2 == i - 1) {
                    T70.m84295c(byteBuffer, byteBuffer2, m9266a, remaining % 64);
                } else {
                    T70.m84295c(byteBuffer, byteBuffer2, m9266a, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo4213e());
    }
}
