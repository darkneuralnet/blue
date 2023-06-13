package p000;

import p000.AbstractC45451n28;
import p000.Z18;
/* renamed from: Z18 */
/* loaded from: classes5.dex */
public abstract class Z18<MessageType extends AbstractC45451n28<MessageType, BuilderType>, BuilderType extends Z18<MessageType, BuilderType>> implements InterfaceC51783xj8 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC51783xj8
    /* renamed from: J1 */
    public final /* bridge */ /* synthetic */ InterfaceC51783xj8 mo4766J1(InterfaceC34042Kj8 interfaceC34042Kj8) {
        if (zzh().getClass().isInstance(interfaceC34042Kj8)) {
            return mo23459e((AbstractC45451n28) interfaceC34042Kj8);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: d */
    public abstract BuilderType clone();

    /* renamed from: e */
    public abstract BuilderType mo23459e(MessageType messagetype);
}
