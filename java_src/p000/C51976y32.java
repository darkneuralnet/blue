package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
/* renamed from: y32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51976y32 extends AbstractC50197v32 {
    public C51976y32(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: g */
    public static int[] m4212g(int[] iArr, int[] iArr2) {
        C44641lh0.m27001c(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        C44641lh0.m27000d(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // p000.AbstractC50197v32
    /* renamed from: b */
    public int[] mo4216b(int[] iArr, int i) {
        if (iArr.length == mo4213e() / 4) {
            int[] iArr2 = new int[16];
            C44641lh0.m27001c(iArr2, m4212g(this.f113447a, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // p000.AbstractC50197v32
    /* renamed from: c */
    public /* bridge */ /* synthetic */ byte[] mo4215c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.mo4215c(bArr, byteBuffer);
    }

    @Override // p000.AbstractC50197v32
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo4214d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.mo4214d(byteBuffer, bArr, bArr2);
    }

    @Override // p000.AbstractC50197v32
    /* renamed from: e */
    public int mo4213e() {
        return 24;
    }
}
