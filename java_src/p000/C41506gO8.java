package p000;

import com.google.android.gms.internal.vision.AbstractC17554G;
import com.google.android.gms.internal.vision.C17561H;
import com.google.android.gms.internal.vision.C17563J;
/* renamed from: gO8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41506gO8 implements InterfaceC40976fV8 {

    /* renamed from: b */
    public static final InterfaceC51010wQ8 f82129b = new UN8();

    /* renamed from: a */
    public final InterfaceC51010wQ8 f82130a;

    public C41506gO8() {
        this(new NO8(OH8.m92561a(), m39500a()));
    }

    /* renamed from: a */
    public static InterfaceC51010wQ8 m39500a() {
        try {
            return (InterfaceC51010wQ8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f82129b;
        }
    }

    /* renamed from: b */
    public static boolean m39499b(PP8 pp8) {
        return pp8.zza() == C46888pT8.f103738a;
    }

    @Override // p000.InterfaceC40976fV8
    public final <T> InterfaceC52825zU8<T> zza(Class<T> cls) {
        UU8.m81418m(cls);
        PP8 zzb = this.f82130a.zzb(cls);
        if (zzb.zzb()) {
            if (AbstractC17554G.class.isAssignableFrom(cls)) {
                return C17563J.m50923g(UU8.m81459B(), QE8.m88703a(), zzb.zzc());
            }
            return C17563J.m50923g(UU8.m81423h(), QE8.m88702b(), zzb.zzc());
        } else if (AbstractC17554G.class.isAssignableFrom(cls)) {
            if (m39499b(zzb)) {
                return C17561H.m50941m(cls, zzb, C45693nS8.m23655b(), UL8.m81609d(), UU8.m81459B(), QE8.m88703a(), C37949aQ8.m71409b());
            }
            return C17561H.m50941m(cls, zzb, C45693nS8.m23655b(), UL8.m81609d(), UU8.m81459B(), null, C37949aQ8.m71409b());
        } else if (m39499b(zzb)) {
            return C17561H.m50941m(cls, zzb, C45693nS8.m23656a(), UL8.m81610b(), UU8.m81423h(), QE8.m88702b(), C37949aQ8.m71410a());
        } else {
            return C17561H.m50941m(cls, zzb, C45693nS8.m23656a(), UL8.m81610b(), UU8.m81409v(), null, C37949aQ8.m71410a());
        }
    }

    public C41506gO8(InterfaceC51010wQ8 interfaceC51010wQ8) {
        this.f82130a = (InterfaceC51010wQ8) C52124yI8.m3689f(interfaceC51010wQ8, "messageInfoFactory");
    }
}
