package p000;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: q24  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47226q24 implements VE2 {

    /* renamed from: a */
    public final InterfaceC45447n24 f104593a;

    /* renamed from: b */
    public final int f104594b;

    public C47226q24(InterfaceC45447n24 interfaceC45447n24, int i) throws GeneralSecurityException {
        this.f104593a = interfaceC45447n24;
        this.f104594b = i;
        if (i >= 10) {
            interfaceC45447n24.mo20026a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // p000.VE2
    /* renamed from: a */
    public void mo18275a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (T70.m84296b(mo18274b(bArr2), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // p000.VE2
    /* renamed from: b */
    public byte[] mo18274b(byte[] bArr) throws GeneralSecurityException {
        return this.f104593a.mo20026a(bArr, this.f104594b);
    }
}
