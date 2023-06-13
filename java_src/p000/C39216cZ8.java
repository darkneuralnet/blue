package p000;
/* renamed from: cZ8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39216cZ8 implements Y09 {

    /* renamed from: a */
    public final Y09[] f60918a;

    public C39216cZ8(Y09... y09Arr) {
        this.f60918a = y09Arr;
    }

    @Override // p000.Y09
    public final O09 zzb(Class cls) {
        Y09[] y09Arr = this.f60918a;
        for (int i = 0; i < 2; i++) {
            Y09 y09 = y09Arr[i];
            if (y09.zzc(cls)) {
                return y09.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.Y09
    public final boolean zzc(Class cls) {
        Y09[] y09Arr = this.f60918a;
        for (int i = 0; i < 2; i++) {
            if (y09Arr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
