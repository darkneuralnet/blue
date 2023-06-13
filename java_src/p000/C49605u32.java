package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: u32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49605u32 extends AbstractC50197v32 {
    public C49605u32(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p000.AbstractC50197v32
    /* renamed from: b */
    public int[] mo4216b(int[] iArr, int i) {
        if (iArr.length == mo4213e() / 4) {
            int[] iArr2 = new int[16];
            C44641lh0.m27001c(iArr2, this.f113447a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
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
        return 12;
    }
}
