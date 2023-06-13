package p000;

import com.google.android.gms.internal.auth.zzew;
/* renamed from: fx8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41251fx8 implements InterfaceC32989Fw8 {

    /* renamed from: a */
    public static final JX7<Double> f81197a;

    /* renamed from: b */
    public static final JX7<Boolean> f81198b;

    /* renamed from: c */
    public static final JX7<Long> f81199c;

    /* renamed from: d */
    public static final JX7<Long> f81200d;

    /* renamed from: e */
    public static final JX7<Boolean> f81201e;

    /* renamed from: f */
    public static final JX7<C40648ew8> f81202f;

    /* renamed from: g */
    public static final JX7<Boolean> f81203g;

    /* renamed from: h */
    public static final JX7<Long> f81204h;

    /* renamed from: i */
    public static final JX7<Long> f81205i;

    /* renamed from: j */
    public static final JX7<Boolean> f81206j;

    /* renamed from: k */
    public static final JX7<Boolean> f81207k;

    /* renamed from: l */
    public static final JX7<Long> f81208l;

    /* renamed from: m */
    public static final JX7<Boolean> f81209m;

    /* renamed from: n */
    public static final JX7<Double> f81210n;

    static {
        C40993fX7 m41212a = new C40993fX7(C45719nV7.m23584a("com.google.android.gms.auth_account")).m41212a();
        f81197a = m41212a.m41211b("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f81198b = m41212a.m41209d("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f81199c = m41212a.m41210c("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f81200d = m41212a.m41210c("getTokenRefactor__android_id_shift", 0L);
        f81201e = m41212a.m41209d("getTokenRefactor__authenticator_logic_improved", false);
        try {
            f81202f = m41212a.m41208e("getTokenRefactor__blocked_packages", C40648ew8.m42373j(new byte[]{10, 19, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 118, 101, 110, 100, 105, 110, 103, 10, 32, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 101, 116, 105, 110, 103, 115, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 109, 101, 115, 115, 97, 103, 105, 110, 103}), C35797Rw8.f32929a);
            f81203g = m41212a.m41209d("getTokenRefactor__chimera_get_token_evolved", true);
            f81204h = m41212a.m41210c("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f81205i = m41212a.m41210c("getTokenRefactor__default_task_timeout_seconds", 20L);
            f81206j = m41212a.m41209d("getTokenRefactor__gaul_accounts_api_evolved", false);
            f81207k = m41212a.m41209d("getTokenRefactor__gaul_token_api_evolved", false);
            f81208l = m41212a.m41210c("getTokenRefactor__get_token_timeout_seconds", 120L);
            f81209m = m41212a.m41209d("getTokenRefactor__gms_account_authenticator_evolved", true);
            f81210n = m41212a.m41211b("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (zzew e) {
            throw new AssertionError("Could not parse proto flag \"getTokenRefactor__blocked_packages\"", e);
        }
    }

    @Override // p000.InterfaceC32989Fw8
    public final C40648ew8 zza() {
        return f81202f.m100270b();
    }

    @Override // p000.InterfaceC32989Fw8
    public final boolean zzb() {
        return f81206j.m100270b().booleanValue();
    }

    @Override // p000.InterfaceC32989Fw8
    public final boolean zzc() {
        return f81207k.m100270b().booleanValue();
    }
}
