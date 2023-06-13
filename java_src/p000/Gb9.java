package p000;
/* renamed from: Gb9 */
/* loaded from: classes5.dex */
public final class Gb9 implements InterfaceC52890zb9 {

    /* renamed from: a */
    public static final AbstractC44354lB8 f12142a;

    /* renamed from: b */
    public static final AbstractC44354lB8 f12143b;

    /* renamed from: c */
    public static final AbstractC44354lB8 f12144c;

    /* renamed from: d */
    public static final AbstractC44354lB8 f12145d;

    static {
        C35824Rz8 m86143a = new C35824Rz8(C38279ay8.m65187a("com.google.android.gms.measurement")).m86143a();
        f12142a = m86143a.m86138f("measurement.client.consent_state_v1", true);
        f12143b = m86143a.m86138f("measurement.client.3p_consent_state_v1", true);
        f12144c = m86143a.m86138f("measurement.service.consent_state_v1_W36", true);
        f12145d = m86143a.m86140d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // p000.InterfaceC52890zb9
    public final long zza() {
        return ((Long) f12145d.m27685b()).longValue();
    }
}
