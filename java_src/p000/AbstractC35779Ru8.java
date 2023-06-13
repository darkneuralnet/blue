package p000;

import com.google.android.gms.internal.vision.AbstractC17549C;
import com.google.android.gms.internal.vision.C17551E;
import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import p000.AbstractC35779Ru8;
/* renamed from: Ru8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35779Ru8<MessageType extends AbstractC17549C<MessageType, BuilderType>, BuilderType extends AbstractC35779Ru8<MessageType, BuilderType>> implements SQ8 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.SQ8
    /* renamed from: K */
    public final /* synthetic */ SQ8 mo85476K(InterfaceC44489lQ8 interfaceC44489lQ8) {
        if (mo50980k().getClass().isInstance(interfaceC44489lQ8)) {
            return mo50982g((AbstractC17549C) interfaceC44489lQ8);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: f */
    public abstract BuilderType clone();

    /* renamed from: g */
    public abstract BuilderType mo50982g(MessageType messagetype);

    /* renamed from: j */
    public abstract BuilderType mo50981j(WB8 wb8, C17551E c17551e) throws IOException;

    /* renamed from: l */
    public BuilderType mo50979l(byte[] bArr, int i, int i2, C17551E c17551e) throws zzjk {
        try {
            WB8 m78739c = WB8.m78739c(bArr, 0, i2, false);
            mo50981j(m78739c, c17551e);
            m78739c.mo10629d(0);
            return this;
        } catch (zzjk e) {
            throw e;
        } catch (IOException e2) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e2);
        }
    }
}
