package p000;

import java.nio.charset.Charset;
/* renamed from: TZ8 */
/* loaded from: classes5.dex */
public final class TZ8 implements O39 {

    /* renamed from: b */
    public static final Y09 f35693b = new SY8();

    /* renamed from: a */
    public final Y09 f35694a;

    public TZ8() {
        Y09 y09;
        Y09[] y09Arr = new Y09[2];
        y09Arr[0] = JS8.m100427a();
        try {
            y09 = (Y09) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            y09 = f35693b;
        }
        y09Arr[1] = y09;
        C39216cZ8 c39216cZ8 = new C39216cZ8(y09Arr);
        Charset charset = XV8.f43341a;
        this.f35694a = c39216cZ8;
    }

    /* renamed from: a */
    public static boolean m83387a(O09 o09) {
        return o09.zzc() == 1;
    }

    @Override // p000.O39
    public final F39 zza(Class cls) {
        X39.m77469d(cls);
        O09 zzb = this.f35694a.zzb(cls);
        if (zzb.zzb()) {
            if (AbstractC46897pU8.class.isAssignableFrom(cls)) {
                return C40115e29.m43314f(X39.m77472a(), C51612xR8.m5253b(), zzb.zza());
            }
            return C40115e29.m43314f(X39.m77474W(), C51612xR8.m5254a(), zzb.zza());
        } else if (AbstractC46897pU8.class.isAssignableFrom(cls)) {
            if (m83387a(zzb)) {
                return U19.m82093D(cls, zzb, C51973y29.m4224b(), AbstractC52268yY8.m3267d(), X39.m77472a(), C51612xR8.m5253b(), F09.m108120b());
            }
            return U19.m82093D(cls, zzb, C51973y29.m4224b(), AbstractC52268yY8.m3267d(), X39.m77472a(), null, F09.m108120b());
        } else if (m83387a(zzb)) {
            return U19.m82093D(cls, zzb, C51973y29.m4225a(), AbstractC52268yY8.m3268c(), X39.m77474W(), C51612xR8.m5254a(), F09.m108121a());
        } else {
            return U19.m82093D(cls, zzb, C51973y29.m4225a(), AbstractC52268yY8.m3268c(), X39.m77473X(), null, F09.m108121a());
        }
    }
}
