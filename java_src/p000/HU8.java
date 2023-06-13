package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: HU8 */
/* loaded from: classes6.dex */
public abstract class HU8 extends AbstractC40383eV8 {

    /* renamed from: a */
    public final ByteBuffer f13450a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // p000.AbstractC40383eV8, p000.WW8
    /* renamed from: a */
    public final WW8 mo19172a(byte[] bArr, int i, int i2) {
        C52142yK8.m3657h(0, i2, bArr.length);
        mo103824b(bArr, 0, i2);
        return this;
    }

    /* renamed from: b */
    public void mo103824b(byte[] bArr, int i, int i2) {
        throw null;
    }
}
