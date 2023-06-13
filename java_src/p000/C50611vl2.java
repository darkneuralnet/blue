package p000;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: vl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50611vl2 implements InterfaceC27152p8 {

    /* renamed from: c */
    public static final byte[] f114570c = new byte[0];

    /* renamed from: a */
    public final C34045Kk2 f114571a;

    /* renamed from: b */
    public final InterfaceC27152p8 f114572b;

    public C50611vl2(C34045Kk2 c34045Kk2, InterfaceC27152p8 interfaceC27152p8) {
        this.f114571a = c34045Kk2;
        this.f114572b = interfaceC27152p8;
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] mo47795e = C34830Nt4.m93225i(this.f114571a).mo47795e();
        return m8195c(this.f114572b.mo3716a(mo47795e, f114570c), ((InterfaceC27152p8) C34830Nt4.m93228f(this.f114571a.m98330L(), mo47795e, InterfaceC27152p8.class)).mo3716a(bArr, bArr2));
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((InterfaceC27152p8) C34830Nt4.m93228f(this.f114571a.m98330L(), this.f114572b.mo3715b(bArr3, f114570c), InterfaceC27152p8.class)).mo3715b(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: c */
    public final byte[] m8195c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
