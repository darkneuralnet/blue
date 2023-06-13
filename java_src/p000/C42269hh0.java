package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: hh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42269hh0 implements InterfaceC27152p8 {

    /* renamed from: a */
    public final C50790w32 f85662a;

    public C42269hh0(byte[] bArr) throws GeneralSecurityException {
        this.f85662a = new C50790w32(bArr);
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] m43714c = C39961dn4.m43714c(12);
        allocate.put(m43714c);
        this.f85662a.mo1897b(allocate, m43714c, bArr, bArr2);
        return allocate.array();
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f85662a.mo1898a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
