package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;
import p000.V46;
/* renamed from: x32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC51383x32 {

    /* renamed from: c */
    public static final V46.EnumC8541b f117051c = V46.EnumC8541b.f38570b;

    /* renamed from: a */
    public final AbstractC50197v32 f117052a;

    /* renamed from: b */
    public final AbstractC50197v32 f117053b;

    public AbstractC51383x32(byte[] bArr) throws GeneralSecurityException {
        if (f117051c.mo80443a()) {
            this.f117052a = mo1896e(bArr, 1);
            this.f117053b = mo1896e(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: d */
    public static byte[] m5890d(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        int i;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i2 = remaining % 16;
        if (i2 == 0) {
            i = remaining;
        } else {
            i = (remaining + 16) - i2;
        }
        int i3 = i + length;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i3);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    /* renamed from: a */
    public byte[] mo1898a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                AX3.m115663f(m5891c(bArr), m5890d(bArr2, byteBuffer), bArr3);
                byteBuffer.position(position);
                return this.f117052a.mo4215c(bArr, byteBuffer);
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public void mo1897b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.f117052a.mo4214d(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            byte[] m115668a = AX3.m115668a(m5891c(bArr), m5890d(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(m115668a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: c */
    public final byte[] m5891c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f117053b.m9266a(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: e */
    public abstract AbstractC50197v32 mo1896e(byte[] bArr, int i) throws InvalidKeyException;
}
