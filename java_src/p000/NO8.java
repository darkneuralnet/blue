package p000;
/* renamed from: NO8 */
/* loaded from: classes6.dex */
public final class NO8 implements InterfaceC51010wQ8 {

    /* renamed from: a */
    public InterfaceC51010wQ8[] f24538a;

    public NO8(InterfaceC51010wQ8... interfaceC51010wQ8Arr) {
        this.f24538a = interfaceC51010wQ8Arr;
    }

    @Override // p000.InterfaceC51010wQ8
    public final boolean zza(Class<?> cls) {
        for (InterfaceC51010wQ8 interfaceC51010wQ8 : this.f24538a) {
            if (interfaceC51010wQ8.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC51010wQ8
    public final PP8 zzb(Class<?> cls) {
        InterfaceC51010wQ8[] interfaceC51010wQ8Arr;
        String str;
        for (InterfaceC51010wQ8 interfaceC51010wQ8 : this.f24538a) {
            if (interfaceC51010wQ8.zza(cls)) {
                return interfaceC51010wQ8.zzb(cls);
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
}
