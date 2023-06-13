package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* renamed from: z32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52569z32 extends AbstractC51383x32 {
    public C52569z32(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // p000.AbstractC51383x32
    /* renamed from: a */
    public /* bridge */ /* synthetic */ byte[] mo1898a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.mo1898a(byteBuffer, bArr, bArr2);
    }

    @Override // p000.AbstractC51383x32
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo1897b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.mo1897b(byteBuffer, bArr, bArr2, bArr3);
    }

    @Override // p000.AbstractC51383x32
    /* renamed from: e */
    public AbstractC50197v32 mo1896e(byte[] bArr, int i) throws InvalidKeyException {
        return new C51976y32(bArr, i);
    }
}
