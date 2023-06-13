package p000;

import p000.A39;
import p000.AbstractC47834r39;
/* renamed from: r39  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC47834r39<MessageType extends A39<MessageType, BuilderType>, BuilderType extends AbstractC47834r39<MessageType, BuilderType>> implements InterfaceC42861ig9 {
    @Override // p000.InterfaceC42861ig9
    /* renamed from: Y0 */
    public final /* bridge */ /* synthetic */ InterfaceC42861ig9 mo16552Y0(InterfaceC47012pg9 interfaceC47012pg9) {
        if (mo6491g().getClass().isInstance(interfaceC47012pg9)) {
            return mo16550f((A39) interfaceC47012pg9);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: e */
    public abstract AbstractC47834r39 clone();

    /* renamed from: f */
    public abstract AbstractC47834r39 mo16550f(A39 a39);
}
