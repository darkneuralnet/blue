package p000;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import com.google.android.gms.internal.clearcut.C17504e;
import com.google.android.gms.internal.clearcut.C17505f;
/* renamed from: FZ7 */
/* loaded from: classes5.dex */
public final class FZ7 implements N88 {

    /* renamed from: b */
    public static final InterfaceC49008t28 f9703b = new TZ7();

    /* renamed from: a */
    public final InterfaceC49008t28 f9704a;

    public FZ7() {
        this(new C42466i08(C41541gS7.m39367a(), m106939c()));
    }

    /* renamed from: b */
    public static boolean m106940b(InterfaceC40114e28 interfaceC40114e28) {
        return interfaceC40114e28.mo19060a() == AbstractC17497c.C17502e.f70411i;
    }

    /* renamed from: c */
    public static InterfaceC49008t28 m106939c() {
        try {
            return (InterfaceC49008t28) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f9703b;
        }
    }

    @Override // p000.N88
    /* renamed from: a */
    public final <T> InterfaceC51439x88<T> mo94319a(Class<T> cls) {
        C38981c98.m61866I(cls);
        InterfaceC40114e28 zzb = this.f9704a.zzb(cls);
        if (zzb.mo19059b()) {
            return AbstractC17497c.class.isAssignableFrom(cls) ? C17505f.m51497i(C38981c98.m61873B(), EO7.m109048b(), zzb.mo19058c()) : C17505f.m51497i(C38981c98.m61818z(), EO7.m109047c(), zzb.mo19058c());
        } else if (!AbstractC17497c.class.isAssignableFrom(cls)) {
            boolean m106940b = m106940b(zzb);
            T48 m5855a = C51409x58.m5855a();
            AbstractC44551lX7 m27168c = AbstractC44551lX7.m27168c();
            return m106940b ? C17504e.m51506r(cls, zzb, m5855a, m27168c, C38981c98.m61818z(), EO7.m109047c(), Q18.m89109a()) : C17504e.m51506r(cls, zzb, m5855a, m27168c, C38981c98.m61874A(), null, Q18.m89109a());
        } else {
            boolean m106940b2 = m106940b(zzb);
            T48 m5854b = C51409x58.m5854b();
            AbstractC44551lX7 m27167d = AbstractC44551lX7.m27167d();
            AbstractC32584Ed8<?, ?> m61873B = C38981c98.m61873B();
            return m106940b2 ? C17504e.m51506r(cls, zzb, m5854b, m27167d, m61873B, EO7.m109048b(), Q18.m89108b()) : C17504e.m51506r(cls, zzb, m5854b, m27167d, m61873B, null, Q18.m89108b());
        }
    }

    public FZ7(InterfaceC49008t28 interfaceC49008t28) {
        this.f9704a = (InterfaceC49008t28) C37975aT7.m71328e(interfaceC49008t28, "messageInfoFactory");
    }
}
