package p000;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: Rc1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35610Rc1 implements InterfaceC27152p8 {

    /* renamed from: a */
    public final InterfaceC43656k12 f32303a;

    /* renamed from: b */
    public final VE2 f32304b;

    /* renamed from: c */
    public final int f32305c;

    public C35610Rc1(InterfaceC43656k12 interfaceC43656k12, VE2 ve2, int i) {
        this.f32303a = interfaceC43656k12;
        this.f32304b = ve2;
        this.f32305c = i;
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: a */
    public byte[] mo3716a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] mo29455a = this.f32303a.mo29455a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return T70.m84297a(mo29455a, this.f32304b.mo18274b(T70.m84297a(bArr2, mo29455a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // p000.InterfaceC27152p8
    /* renamed from: b */
    public byte[] mo3715b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f32305c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f32305c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f32304b.mo18275a(copyOfRange2, T70.m84297a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f32303a.mo29454b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
