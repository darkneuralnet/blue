package p000;

import java.nio.charset.Charset;
/* renamed from: Tg8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36121Tg8 implements InterfaceC35257Po8 {

    /* renamed from: b */
    public static final InterfaceC31927Bi8 f35868b = new C46418og8();

    /* renamed from: a */
    public final InterfaceC31927Bi8 f35869a;

    public C36121Tg8() {
        InterfaceC31927Bi8 interfaceC31927Bi8;
        InterfaceC31927Bi8[] interfaceC31927Bi8Arr = new InterfaceC31927Bi8[2];
        interfaceC31927Bi8Arr[0] = W48.m78858a();
        try {
            interfaceC31927Bi8 = (InterfaceC31927Bi8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC31927Bi8 = f35868b;
        }
        interfaceC31927Bi8Arr[1] = interfaceC31927Bi8;
        C32611Eg8 c32611Eg8 = new C32611Eg8(interfaceC31927Bi8Arr);
        Charset charset = C32791Fa8.f9736a;
        this.f35869a = c32611Eg8;
    }

    /* renamed from: a */
    public static boolean m83167a(InterfaceC46438oi8 interfaceC46438oi8) {
        return interfaceC46438oi8.zzc() == 1;
    }

    @Override // p000.InterfaceC35257Po8
    public final InterfaceC32449Do8 zza(Class cls) {
        C39393cp8.m45023e(cls);
        InterfaceC46438oi8 zzb = this.f35869a.zzb(cls);
        if (zzb.zzb()) {
            if (V78.class.isAssignableFrom(cls)) {
                return C41121fk8.m40914f(C39393cp8.m45027a(), C52575z38.m1859b(), zzb.zza());
            }
            return C41121fk8.m40914f(C39393cp8.m45029X(), C52575z38.m1860a(), zzb.zza());
        } else if (V78.class.isAssignableFrom(cls)) {
            if (m83167a(zzb)) {
                return C35914Sj8.m84973D(cls, zzb, C35689Rk8.m86351b(), AbstractC33772Jf8.m100047d(), C39393cp8.m45027a(), C52575z38.m1859b(), C37534Zh8.m72665b());
            }
            return C35914Sj8.m84973D(cls, zzb, C35689Rk8.m86351b(), AbstractC33772Jf8.m100047d(), C39393cp8.m45027a(), null, C37534Zh8.m72665b());
        } else if (m83167a(zzb)) {
            return C35914Sj8.m84973D(cls, zzb, C35689Rk8.m86352a(), AbstractC33772Jf8.m100048c(), C39393cp8.m45029X(), C52575z38.m1860a(), C37534Zh8.m72666a());
        } else {
            return C35914Sj8.m84973D(cls, zzb, C35689Rk8.m86352a(), AbstractC33772Jf8.m100048c(), C39393cp8.m45028Y(), null, C37534Zh8.m72666a());
        }
    }
}
