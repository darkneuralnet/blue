package p000;

import com.google.android.gms.internal.places.AbstractC17530c;
import com.google.android.gms.internal.places.C17537e;
import com.google.android.gms.internal.places.C17538f;
/* renamed from: AO7 */
/* loaded from: classes5.dex */
public final class AO7 implements InterfaceC51072wX7 {

    /* renamed from: b */
    public static final GS7 f481b = new CQ7();

    /* renamed from: a */
    public final GS7 f482a;

    public AO7() {
        this(new C39736dP7(SC7.m85841a(), m115828c()));
    }

    /* renamed from: b */
    public static boolean m115829b(WS7 ws7) {
        return ws7.mo78373a() == AbstractC17530c.C17534d.f71161i;
    }

    /* renamed from: c */
    public static GS7 m115828c() {
        try {
            return (GS7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f481b;
        }
    }

    @Override // p000.InterfaceC51072wX7
    /* renamed from: a */
    public final <T> LY7<T> mo6684a(Class<T> cls) {
        C46348oZ7.m20889E(cls);
        WS7 zzc = this.f482a.zzc(cls);
        if (zzc.mo78372b()) {
            if (AbstractC17530c.class.isAssignableFrom(cls)) {
                return C17538f.m51164i(C46348oZ7.m20846r(), C44788lv7.m26668b(), zzc.mo78371c());
            }
            return C17538f.m51164i(C46348oZ7.m20852l(), C44788lv7.m26667c(), zzc.mo78371c());
        } else if (AbstractC17530c.class.isAssignableFrom(cls)) {
            if (m115829b(zzc)) {
                return C17537e.m51179t(cls, zzc, C40391eW7.m42815b(), HN7.m103919d(), C46348oZ7.m20846r(), C44788lv7.m26668b(), C39152cS7.m61297b());
            }
            return C17537e.m51179t(cls, zzc, C40391eW7.m42815b(), HN7.m103919d(), C46348oZ7.m20846r(), null, C39152cS7.m61297b());
        } else if (m115829b(zzc)) {
            return C17537e.m51179t(cls, zzc, C40391eW7.m42816a(), HN7.m103920c(), C46348oZ7.m20852l(), C44788lv7.m26667c(), C39152cS7.m61298a());
        } else {
            return C17537e.m51179t(cls, zzc, C40391eW7.m42816a(), HN7.m103920c(), C46348oZ7.m20847q(), null, C39152cS7.m61298a());
        }
    }

    public AO7(GS7 gs7) {
        this.f482a = (GS7) C44389lF7.m27615e(gs7, "messageInfoFactory");
    }
}
