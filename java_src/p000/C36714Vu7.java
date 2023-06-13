package p000;
/* renamed from: Vu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36714Vu7 implements InterfaceC40044dv7 {

    /* renamed from: a */
    public final InterfaceC40044dv7[] f39982a;

    public C36714Vu7(InterfaceC40044dv7... interfaceC40044dv7Arr) {
        this.f39982a = interfaceC40044dv7Arr;
    }

    @Override // p000.InterfaceC40044dv7
    public final InterfaceC39452cv7 zzb(Class cls) {
        String str;
        InterfaceC40044dv7[] interfaceC40044dv7Arr = this.f39982a;
        for (int i = 0; i < 2; i++) {
            InterfaceC40044dv7 interfaceC40044dv7 = interfaceC40044dv7Arr[i];
            if (interfaceC40044dv7.zzc(cls)) {
                return interfaceC40044dv7.zzb(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }

    @Override // p000.InterfaceC40044dv7
    public final boolean zzc(Class cls) {
        InterfaceC40044dv7[] interfaceC40044dv7Arr = this.f39982a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC40044dv7Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
