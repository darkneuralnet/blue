package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: xn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51816xn1 {

    /* renamed from: i */
    public static final C10776ad f118094i = C10776ad.m71007e();

    /* renamed from: a */
    public final Map<String, String> f118095a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C32036Bv0 f118096b;

    /* renamed from: c */
    public final PY1 f118097c;

    /* renamed from: d */
    public Boolean f118098d;

    /* renamed from: e */
    public final C31722Am1 f118099e;

    /* renamed from: f */
    public final X94<C36486Uv4> f118100f;

    /* renamed from: g */
    public final InterfaceC35934Sm1 f118101g;

    /* renamed from: h */
    public final X94<U96> f118102h;

    public C51816xn1(C31722Am1 c31722Am1, X94<C36486Uv4> x94, InterfaceC35934Sm1 interfaceC35934Sm1, X94<U96> x942, RemoteConfigManager remoteConfigManager, C32036Bv0 c32036Bv0, SessionManager sessionManager) {
        this.f118098d = null;
        this.f118099e = c31722Am1;
        this.f118100f = x94;
        this.f118101g = interfaceC35934Sm1;
        this.f118102h = x942;
        if (c31722Am1 == null) {
            this.f118098d = Boolean.FALSE;
            this.f118096b = c32036Bv0;
            this.f118097c = new PY1(new Bundle());
            return;
        }
        C41612ga6.m39128k().m39121r(c31722Am1, interfaceC35934Sm1, x942);
        Context m115293j = c31722Am1.m115293j();
        PY1 m4712a = m4712a(m115293j);
        this.f118097c = m4712a;
        remoteConfigManager.setFirebaseRemoteConfigProvider(x94);
        this.f118096b = c32036Bv0;
        c32036Bv0.m113358P(m4712a);
        c32036Bv0.m113359O(m115293j);
        sessionManager.setApplicationContext(m115293j);
        this.f118098d = c32036Bv0.m113348j();
        C10776ad c10776ad = f118094i;
        if (c10776ad.m71004h() && m4709d()) {
            c10776ad.m71006f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", C34871Ny0.m93162b(c31722Am1.m115290m().m18703e(), m115293j.getPackageName())));
        }
    }

    /* renamed from: a */
    public static PY1 m4712a(Context context) {
        Bundle bundle;
        PY1 py1;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        if (bundle != null) {
            py1 = new PY1(bundle);
        } else {
            py1 = new PY1();
        }
        return py1;
    }

    /* renamed from: c */
    public static C51816xn1 m4710c() {
        return (C51816xn1) C31722Am1.m115292k().m115294i(C51816xn1.class);
    }

    /* renamed from: b */
    public Map<String, String> m4711b() {
        return new HashMap(this.f118095a);
    }

    /* renamed from: d */
    public boolean m4709d() {
        Boolean bool = this.f118098d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C31722Am1.m115292k().m115284s();
    }

    /* renamed from: e */
    public Trace m4708e(String str) {
        return Trace.m47083c(str);
    }
}
