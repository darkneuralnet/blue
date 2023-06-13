package p000;
/* renamed from: px0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47173px0 extends AbstractC31820Ax0<String> {

    /* renamed from: a */
    public static C47173px0 f104371a;

    /* renamed from: e */
    public static synchronized C47173px0 m18410e() {
        C47173px0 c47173px0;
        synchronized (C47173px0.class) {
            if (f104371a == null) {
                f104371a = new C47173px0();
            }
            c47173px0 = f104371a;
        }
        return c47173px0;
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: a */
    public String mo89a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // p000.AbstractC31820Ax0
    /* renamed from: c */
    public String mo88c() {
        return "fpr_disabled_android_versions";
    }

    /* renamed from: d */
    public String m18411d() {
        return "";
    }
}
