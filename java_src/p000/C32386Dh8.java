package p000;
/* renamed from: Dh8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32386Dh8 implements InterfaceC53009zn8 {

    /* renamed from: b */
    public static final InterfaceC43483jj8 f6203b = new C37525Zg8();

    /* renamed from: a */
    public final InterfaceC43483jj8 f6204a;

    public C32386Dh8() {
        InterfaceC43483jj8 interfaceC43483jj8;
        InterfaceC43483jj8[] interfaceC43483jj8Arr = new InterfaceC43483jj8[2];
        interfaceC43483jj8Arr[0] = C37471Za8.m72909a();
        try {
            interfaceC43483jj8 = (InterfaceC43483jj8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC43483jj8 = f6203b;
        }
        interfaceC43483jj8Arr[1] = interfaceC43483jj8;
        C47021ph8 c47021ph8 = new C47021ph8(interfaceC43483jj8Arr);
        C41051fd8.m41089f(c47021ph8, "messageInfoFactory");
        this.f6204a = c47021ph8;
    }

    /* renamed from: a */
    public static boolean m110003a(InterfaceC36841Wi8 interfaceC36841Wi8) {
        return interfaceC36841Wi8.zzc() == 1;
    }

    @Override // p000.InterfaceC53009zn8
    public final <T> InterfaceC45895nn8<T> zza(Class<T> cls) {
        C34312Ln8.m96339g(cls);
        InterfaceC36841Wi8 zzb = this.f6204a.zzb(cls);
        if (zzb.zzb()) {
            if (AbstractC35140Pb8.class.isAssignableFrom(cls)) {
                return C34285Lk8.m96381a(C34312Ln8.m96343c(), Q98.m88852b(), zzb.zza());
            }
            return C34285Lk8.m96381a(C34312Ln8.m96345a(), Q98.m88853a(), zzb.zza());
        } else if (AbstractC35140Pb8.class.isAssignableFrom(cls)) {
            if (m110003a(zzb)) {
                return C52386yk8.m2678r(cls, zzb, C44689ll8.m26854b(), AbstractC49975ug8.m9879d(), C34312Ln8.m96343c(), Q98.m88852b(), C33331Hi8.m103500b());
            }
            return C52386yk8.m2678r(cls, zzb, C44689ll8.m26854b(), AbstractC49975ug8.m9879d(), C34312Ln8.m96343c(), null, C33331Hi8.m103500b());
        } else if (m110003a(zzb)) {
            return C52386yk8.m2678r(cls, zzb, C44689ll8.m26855a(), AbstractC49975ug8.m9880c(), C34312Ln8.m96345a(), Q98.m88853a(), C33331Hi8.m103501a());
        } else {
            return C52386yk8.m2678r(cls, zzb, C44689ll8.m26855a(), AbstractC49975ug8.m9880c(), C34312Ln8.m96344b(), null, C33331Hi8.m103501a());
        }
    }
}
