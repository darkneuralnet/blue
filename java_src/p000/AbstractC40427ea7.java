package p000;

import java.io.IOException;
import p000.AbstractC39835da7;
import p000.AbstractC40427ea7;
/* renamed from: ea7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC40427ea7<MessageType extends AbstractC40427ea7<MessageType, BuilderType>, BuilderType extends AbstractC39835da7<MessageType, BuilderType>> implements InterfaceC36075Tb7 {
    protected int zba = 0;

    /* renamed from: a */
    public int mo41145a(InterfaceC42819ic7 interfaceC42819ic7) {
        throw null;
    }

    /* renamed from: b */
    public final byte[] m42734b() {
        try {
            int mo41143d = mo41143d();
            byte[] bArr = new byte[mo41143d];
            AbstractC33726Ja7 m100164c = AbstractC33726Ja7.m100164c(bArr, 0, mo41143d);
            mo41137j(m100164c);
            m100164c.m100163d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // p000.InterfaceC36075Tb7
    /* renamed from: s */
    public final AbstractC32088Ca7 mo41154s() {
        try {
            int mo41143d = mo41143d();
            AbstractC32088Ca7 abstractC32088Ca7 = AbstractC32088Ca7.f4281c;
            byte[] bArr = new byte[mo41143d];
            AbstractC33726Ja7 m100164c = AbstractC33726Ja7.m100164c(bArr, 0, mo41143d);
            mo41137j(m100164c);
            return C51692xa7.m4983a(m100164c, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
