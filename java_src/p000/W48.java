package p000;
/* renamed from: W48 */
/* loaded from: classes5.dex */
public final class W48 implements InterfaceC31927Bi8 {

    /* renamed from: a */
    public static final W48 f40384a = new W48();

    private W48() {
    }

    /* renamed from: a */
    public static W48 m78858a() {
        return f40384a;
    }

    @Override // p000.InterfaceC31927Bi8
    public final InterfaceC46438oi8 zzb(Class cls) {
        if (V78.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC46438oi8) V78.m80348i(cls.asSubclass(V78.class)).mo3770G(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC31927Bi8
    public final boolean zzc(Class cls) {
        return V78.class.isAssignableFrom(cls);
    }
}
