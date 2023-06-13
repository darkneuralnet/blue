package p000;
/* renamed from: Ye9 */
/* loaded from: classes5.dex */
public final class Ye9 implements InterfaceC38100ag9 {

    /* renamed from: a */
    public final InterfaceC38100ag9[] f46212a;

    public Ye9(InterfaceC38100ag9... interfaceC38100ag9Arr) {
        this.f46212a = interfaceC38100ag9Arr;
    }

    @Override // p000.InterfaceC38100ag9
    public final Tf9 zzb(Class cls) {
        String str;
        InterfaceC38100ag9[] interfaceC38100ag9Arr = this.f46212a;
        for (int i = 0; i < 2; i++) {
            InterfaceC38100ag9 interfaceC38100ag9 = interfaceC38100ag9Arr[i];
            if (interfaceC38100ag9.zzc(cls)) {
                return interfaceC38100ag9.zzb(cls);
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

    @Override // p000.InterfaceC38100ag9
    public final boolean zzc(Class cls) {
        InterfaceC38100ag9[] interfaceC38100ag9Arr = this.f46212a;
        for (int i = 0; i < 2; i++) {
            if (interfaceC38100ag9Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
