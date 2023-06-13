package p000;
/* renamed from: ph8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47021ph8 implements InterfaceC43483jj8 {

    /* renamed from: a */
    public final InterfaceC43483jj8[] f103951a;

    public C47021ph8(InterfaceC43483jj8... interfaceC43483jj8Arr) {
        this.f103951a = interfaceC43483jj8Arr;
    }

    @Override // p000.InterfaceC43483jj8
    public final InterfaceC36841Wi8 zzb(Class<?> cls) {
        String str;
        InterfaceC43483jj8[] interfaceC43483jj8Arr = this.f103951a;
        for (int i = 0; i < 2; i++) {
            InterfaceC43483jj8 interfaceC43483jj8 = interfaceC43483jj8Arr[i];
            if (interfaceC43483jj8.zzc(cls)) {
                return interfaceC43483jj8.zzb(cls);
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

    @Override // p000.InterfaceC43483jj8
    public final boolean zzc(Class<?> cls) {
        InterfaceC43483jj8[] interfaceC43483jj8Arr = this.f103951a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC43483jj8Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
