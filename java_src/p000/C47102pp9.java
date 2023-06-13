package p000;
/* renamed from: pp9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47102pp9 implements InterfaceC40599er9 {

    /* renamed from: b */
    public static final Ip9 f104146b = new C42951ip9();

    /* renamed from: a */
    public final Ip9 f104147a;

    public C47102pp9() {
        Ip9 ip9;
        Ip9[] ip9Arr = new Ip9[2];
        ip9Arr[0] = Vl9.m79433a();
        try {
            ip9 = (Ip9) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            ip9 = f104146b;
        }
        ip9Arr[1] = ip9;
        C45323mp9 c45323mp9 = new C45323mp9(ip9Arr);
        Fn9.m106449f(c45323mp9, "messageInfoFactory");
        this.f104147a = c45323mp9;
    }

    /* renamed from: a */
    public static boolean m18647a(Fp9 fp9) {
        return fp9.zzc() == 1;
    }

    @Override // p000.InterfaceC40599er9
    public final <T> InterfaceC38803br9<T> zza(Class<T> cls) {
        C42378hr9.m35719g(cls);
        Fp9 zzb = this.f104147a.zzb(cls);
        if (zzb.zzb()) {
            if (Em9.class.isAssignableFrom(cls)) {
                return Yp9.m74174f(C42378hr9.m35725b(), Jk9.m99868b(), zzb.zza());
            }
            return Yp9.m74174f(C42378hr9.m35724b0(), Jk9.m99869a(), zzb.zza());
        } else if (Em9.class.isAssignableFrom(cls)) {
            if (m18647a(zzb)) {
                return Vp9.m79353t(cls, zzb, C40589eq9.m42484b(), AbstractC38783bp9.m62557e(), C42378hr9.m35725b(), Jk9.m99868b(), Dp9.m109870b());
            }
            return Vp9.m79353t(cls, zzb, C40589eq9.m42484b(), AbstractC38783bp9.m62557e(), C42378hr9.m35725b(), null, Dp9.m109870b());
        } else if (m18647a(zzb)) {
            return Vp9.m79353t(cls, zzb, C40589eq9.m42485a(), AbstractC38783bp9.m62558d(), C42378hr9.m35724b0(), Jk9.m99869a(), Dp9.m109871a());
        } else {
            return Vp9.m79353t(cls, zzb, C40589eq9.m42485a(), AbstractC38783bp9.m62558d(), C42378hr9.m35727a(), null, Dp9.m109871a());
        }
    }
}
