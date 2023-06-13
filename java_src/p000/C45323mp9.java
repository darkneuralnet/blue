package p000;
/* renamed from: mp9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45323mp9 implements Ip9 {

    /* renamed from: a */
    public final Ip9[] f98862a;

    public C45323mp9(Ip9... ip9Arr) {
        this.f98862a = ip9Arr;
    }

    @Override // p000.Ip9
    public final Fp9 zzb(Class<?> cls) {
        String str;
        Ip9[] ip9Arr = this.f98862a;
        for (int i = 0; i < 2; i++) {
            Ip9 ip9 = ip9Arr[i];
            if (ip9.zzc(cls)) {
                return ip9.zzb(cls);
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

    @Override // p000.Ip9
    public final boolean zzc(Class<?> cls) {
        Ip9[] ip9Arr = this.f98862a;
        for (int i = 0; i < 2; i++) {
            if (ip9Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
