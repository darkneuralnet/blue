package p000;

import java.io.IOException;
import p000.AbstractC48665sT7;
import p000.GT7;
/* renamed from: GT7 */
/* loaded from: classes5.dex */
public abstract class GT7<MessageType extends GT7<MessageType, BuilderType>, BuilderType extends AbstractC48665sT7<MessageType, BuilderType>> implements InterfaceC39926dj8 {
    protected int zzb = 0;

    /* renamed from: b */
    public int mo80353b(InterfaceC32449Do8 interfaceC32449Do8) {
        throw null;
    }

    @Override // p000.InterfaceC39926dj8
    /* renamed from: y */
    public final AbstractC41604gZ7 mo43830y() {
        try {
            int mo43831l = mo43831l();
            AbstractC41604gZ7 abstractC41604gZ7 = AbstractC41604gZ7.f82424c;
            byte[] bArr = new byte[mo43831l];
            AbstractC47813r18 m16654a = AbstractC47813r18.m16654a(bArr, 0, mo43831l);
            mo43829z(m16654a);
            m16654a.m16653b();
            return new C46330oX7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
