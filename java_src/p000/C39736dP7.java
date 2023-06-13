package p000;
/* renamed from: dP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39736dP7 implements GS7 {

    /* renamed from: a */
    public GS7[] f76574a;

    public C39736dP7(GS7... gs7Arr) {
        this.f76574a = gs7Arr;
    }

    @Override // p000.GS7
    public final boolean zzb(Class<?> cls) {
        for (GS7 gs7 : this.f76574a) {
            if (gs7.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.GS7
    public final WS7 zzc(Class<?> cls) {
        GS7[] gs7Arr;
        String str;
        for (GS7 gs7 : this.f76574a) {
            if (gs7.zzb(cls)) {
                return gs7.zzc(cls);
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
