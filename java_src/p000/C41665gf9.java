package p000;
/* renamed from: gf9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41665gf9 implements Mi9 {

    /* renamed from: b */
    public static final InterfaceC38100ag9 f84002b = new Qe9();

    /* renamed from: a */
    public final InterfaceC38100ag9 f84003a;

    public C41665gf9() {
        InterfaceC38100ag9 interfaceC38100ag9;
        InterfaceC38100ag9[] interfaceC38100ag9Arr = new InterfaceC38100ag9[2];
        interfaceC38100ag9Arr[0] = C52287ya9.m3214a();
        try {
            interfaceC38100ag9 = (InterfaceC38100ag9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC38100ag9 = f84002b;
        }
        interfaceC38100ag9Arr[1] = interfaceC38100ag9;
        Ye9 ye9 = new Ye9(interfaceC38100ag9Arr);
        C44007kc9.m28734f(ye9, "messageInfoFactory");
        this.f84003a = ye9;
    }

    /* renamed from: a */
    public static boolean m37918a(Tf9 tf9) {
        return tf9.zzc() == 1;
    }

    @Override // p000.Mi9
    public final Ei9 zza(Class cls) {
        Ti9.m83097g(cls);
        Tf9 zzb = this.f84003a.zzb(cls);
        if (zzb.zzb()) {
            if (AbstractC49926ub9.class.isAssignableFrom(cls)) {
                return Tg9.m83161f(Ti9.m83103b(), P99.m90619b(), zzb.zza());
            }
            return Tg9.m83161f(Ti9.m83102b0(), P99.m90620a(), zzb.zza());
        } else if (AbstractC49926ub9.class.isAssignableFrom(cls)) {
            if (m37918a(zzb)) {
                return Lg9.m96473B(cls, zzb, C48208rh9.m15561b(), Ce9.m111929d(), Ti9.m83103b(), P99.m90619b(), Mf9.m95074b());
            }
            return Lg9.m96473B(cls, zzb, C48208rh9.m15561b(), Ce9.m111929d(), Ti9.m83103b(), null, Mf9.m95074b());
        } else if (m37918a(zzb)) {
            return Lg9.m96473B(cls, zzb, C48208rh9.m15562a(), Ce9.m111930c(), Ti9.m83102b0(), P99.m90620a(), Mf9.m95075a());
        } else {
            return Lg9.m96473B(cls, zzb, C48208rh9.m15562a(), Ce9.m111930c(), Ti9.m83105a(), null, Mf9.m95075a());
        }
    }
}
