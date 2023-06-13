package p000;

import com.google.android.gms.internal.clearcut.AbstractC17495a;
import p000.AbstractC41833gw7;
/* renamed from: gw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC41833gw7<MessageType extends AbstractC17495a<MessageType, BuilderType>, BuilderType extends AbstractC41833gw7<MessageType, BuilderType>> implements U28 {
    /* renamed from: d */
    public abstract BuilderType mo37305d(MessageType messagetype);

    @Override // 
    /* renamed from: e */
    public abstract BuilderType clone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.U28
    /* renamed from: g3 */
    public final /* synthetic */ U28 mo37303g3(H28 h28) {
        if (mo29386v().getClass().isInstance(h28)) {
            return mo37305d((AbstractC17495a) h28);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
