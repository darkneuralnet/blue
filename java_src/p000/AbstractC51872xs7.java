package p000;

import p000.AbstractC51872xs7;
import p000.AbstractC52465ys7;
/* renamed from: xs7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC51872xs7<MessageType extends AbstractC52465ys7<MessageType, BuilderType>, BuilderType extends AbstractC51872xs7<MessageType, BuilderType>> implements InterfaceC40637ev7 {
    @Override // p000.InterfaceC40637ev7
    /* renamed from: D0 */
    public final /* bridge */ /* synthetic */ InterfaceC40637ev7 mo4530D0(InterfaceC41230fv7 interfaceC41230fv7) {
        if (zzw().getClass().isInstance(interfaceC41230fv7)) {
            return mo4528e((AbstractC52465ys7) interfaceC41230fv7);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: d */
    public abstract AbstractC51872xs7 clone();

    /* renamed from: e */
    public abstract AbstractC51872xs7 mo4528e(AbstractC52465ys7 abstractC52465ys7);
}
