package p000;

import java.io.IOException;
import p000.A39;
import p000.AbstractC47834r39;
/* renamed from: A39 */
/* loaded from: classes5.dex */
public abstract class A39<MessageType extends A39<MessageType, BuilderType>, BuilderType extends AbstractC47834r39<MessageType, BuilderType>> implements InterfaceC47012pg9 {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9994a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9993b(int i) {
        throw null;
    }

    /* renamed from: c */
    public final byte[] m116159c() {
        try {
            byte[] bArr = new byte[mo9989i()];
            Z79 m73700f = Z79.m73700f(bArr);
            mo9992d(m73700f);
            m73700f.m73699g();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // p000.InterfaceC47012pg9
    /* renamed from: h */
    public final T69 mo18995h() {
        try {
            int mo9989i = mo9989i();
            T69 t69 = T69.f34797c;
            byte[] bArr = new byte[mo9989i];
            Z79 m73700f = Z79.m73700f(bArr);
            mo9992d(m73700f);
            m73700f.m73699g();
            return new C50827w69(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
