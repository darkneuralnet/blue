package p000;
/* renamed from: Eg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32611Eg8 implements InterfaceC31927Bi8 {

    /* renamed from: a */
    public final InterfaceC31927Bi8[] f7940a;

    public C32611Eg8(InterfaceC31927Bi8... interfaceC31927Bi8Arr) {
        this.f7940a = interfaceC31927Bi8Arr;
    }

    @Override // p000.InterfaceC31927Bi8
    public final InterfaceC46438oi8 zzb(Class cls) {
        InterfaceC31927Bi8[] interfaceC31927Bi8Arr = this.f7940a;
        for (int i = 0; i < 2; i++) {
            InterfaceC31927Bi8 interfaceC31927Bi8 = interfaceC31927Bi8Arr[i];
            if (interfaceC31927Bi8.zzc(cls)) {
                return interfaceC31927Bi8.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC31927Bi8
    public final boolean zzc(Class cls) {
        InterfaceC31927Bi8[] interfaceC31927Bi8Arr = this.f7940a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC31927Bi8Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
