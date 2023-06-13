package p000;

import com.google.android.gms.internal.places.AbstractC17544k;
import p000.AbstractC41371g99;
/* renamed from: g99  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC41371g99<MessageType extends AbstractC17544k<MessageType, BuilderType>, BuilderType extends AbstractC41371g99<MessageType, BuilderType>> implements InterfaceC44515lT7 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC44515lT7
    /* renamed from: h3 */
    public final /* synthetic */ InterfaceC44515lT7 mo27253h3(InterfaceC52815zT7 interfaceC52815zT7) {
        if (mo51219d().getClass().isInstance(interfaceC52815zT7)) {
            return mo39964j((AbstractC17544k) interfaceC52815zT7);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: j */
    public abstract BuilderType mo39964j(MessageType messagetype);

    @Override // 
    /* renamed from: k */
    public abstract BuilderType clone();
}
