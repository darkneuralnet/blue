package p000;
/* renamed from: Wu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36948Wu7 implements InterfaceC35085Ov7 {

    /* renamed from: b */
    public static final InterfaceC40044dv7 f42288b = new C36480Uu7();

    /* renamed from: a */
    public final InterfaceC40044dv7 f42289a;

    public C36948Wu7() {
        InterfaceC40044dv7 interfaceC40044dv7;
        InterfaceC40044dv7[] interfaceC40044dv7Arr = new InterfaceC40044dv7[2];
        interfaceC40044dv7Arr[0] = C37407Yt7.m74025a();
        try {
            interfaceC40044dv7 = (InterfaceC40044dv7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC40044dv7 = f42288b;
        }
        interfaceC40044dv7Arr[1] = interfaceC40044dv7;
        C36714Vu7 c36714Vu7 = new C36714Vu7(interfaceC40044dv7Arr);
        C46557ou7.m20292f(c36714Vu7, "messageInfoFactory");
        this.f42289a = c36714Vu7;
    }

    /* renamed from: a */
    public static boolean m77714a(InterfaceC39452cv7 interfaceC39452cv7) {
        return interfaceC39452cv7.zzc() == 1;
    }

    @Override // p000.InterfaceC35085Ov7
    public final InterfaceC34851Nv7 zza(Class cls) {
        C35319Pv7.m89387g(cls);
        InterfaceC39452cv7 zzb = this.f42289a.zzb(cls);
        if (zzb.zzb()) {
            if (AbstractC40627eu7.class.isAssignableFrom(cls)) {
                return C43602jv7.m29761b(C35319Pv7.m89393b(), C32259Ct7.m111375b(), zzb.zza());
            }
            return C43602jv7.m29761b(C35319Pv7.m89392b0(), C32259Ct7.m111376a(), zzb.zza());
        } else if (AbstractC40627eu7.class.isAssignableFrom(cls)) {
            if (m77714a(zzb)) {
                return C43009iv7.m31635H(cls, zzb, C32511Dv7.m109697b(), AbstractC36012Su7.m84653e(), C35319Pv7.m89393b(), C32259Ct7.m111375b(), C38841bv7.m62129b());
            }
            return C43009iv7.m31635H(cls, zzb, C32511Dv7.m109697b(), AbstractC36012Su7.m84653e(), C35319Pv7.m89393b(), null, C38841bv7.m62129b());
        } else if (m77714a(zzb)) {
            return C43009iv7.m31635H(cls, zzb, C32511Dv7.m109698a(), AbstractC36012Su7.m84654d(), C35319Pv7.m89392b0(), C32259Ct7.m111376a(), C38841bv7.m62130a());
        } else {
            return C43009iv7.m31635H(cls, zzb, C32511Dv7.m109698a(), AbstractC36012Su7.m84654d(), C35319Pv7.m89395a(), null, C38841bv7.m62130a());
        }
    }
}
