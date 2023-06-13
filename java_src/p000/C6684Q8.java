package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p000.V46;
/* renamed from: Q8 */
/* loaded from: classes6.dex */
public final class C6684Q8 implements InterfaceC27152p8 {

    /* renamed from: b */
    public static final V46.EnumC8541b f29861b = V46.EnumC8541b.f38571c;

    /* renamed from: a */
    public final C49012t32 f29862a;

    public C6684Q8(byte[] bArr) throws GeneralSecurityException {
        if (f29861b.mo80443a()) {
            this.f29862a = new C49012t32(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f29862a.m13189b(C39961dn4.m43714c(12), bArr, bArr2);
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f29862a.m13190a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
