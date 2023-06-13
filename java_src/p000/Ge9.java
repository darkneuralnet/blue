package p000;

import p000.Ge9;
import p000.Ne9;
/* renamed from: Ge9 */
/* loaded from: classes6.dex */
public abstract class Ge9<MessageType extends Ne9<MessageType, BuilderType>, BuilderType extends Ge9<MessageType, BuilderType>> implements Kp9 {
    @Override // 
    /* renamed from: k */
    public abstract BuilderType clone();

    /* renamed from: l */
    public abstract BuilderType mo64025l(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.Kp9
    /* renamed from: p0 */
    public final /* bridge */ /* synthetic */ Kp9 mo98240p0(Np9 np9) {
        if (mo64027h().getClass().isInstance(np9)) {
            return mo64025l((Ne9) np9);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
