package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: yH6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52113yH6 implements InterfaceC27152p8 {

    /* renamed from: a */
    public final C52569z32 f119301a;

    public C52113yH6(byte[] bArr) throws GeneralSecurityException {
        this.f119301a = new C52569z32(bArr);
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 24 + 16);
        byte[] m43714c = C39961dn4.m43714c(24);
        allocate.put(m43714c);
        this.f119301a.mo1897b(allocate, m43714c, bArr, bArr2);
        return allocate.array();
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f119301a.mo1898a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
