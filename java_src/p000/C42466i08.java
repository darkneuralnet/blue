package p000;
/* renamed from: i08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42466i08 implements InterfaceC49008t28 {

    /* renamed from: a */
    public InterfaceC49008t28[] f86276a;

    public C42466i08(InterfaceC49008t28... interfaceC49008t28Arr) {
        this.f86276a = interfaceC49008t28Arr;
    }

    @Override // p000.InterfaceC49008t28
    public final boolean zza(Class<?> cls) {
        for (InterfaceC49008t28 interfaceC49008t28 : this.f86276a) {
            if (interfaceC49008t28.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC49008t28
    public final InterfaceC40114e28 zzb(Class<?> cls) {
        InterfaceC49008t28[] interfaceC49008t28Arr;
        for (InterfaceC49008t28 interfaceC49008t28 : this.f86276a) {
            if (interfaceC49008t28.zza(cls)) {
                return interfaceC49008t28.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
