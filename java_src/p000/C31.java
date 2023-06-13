package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C17216a;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import p000.C34512Mk1;
import p000.C50483vY2;
/* renamed from: C31 */
/* loaded from: classes5.dex */
public class C31 {

    /* renamed from: C31$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC0847a {
        /* renamed from: a */
        Bundle mo23639a();

        Bundle getParameters();
    }

    /* renamed from: a */
    public static boolean m112942a(InterfaceC46640p31 interfaceC46640p31) {
        return m112940c(interfaceC46640p31).m8454d() != -1;
    }

    /* renamed from: b */
    public static Uri m112941b(InterfaceC46640p31 interfaceC46640p31) {
        String name = interfaceC46640p31.name();
        C34512Mk1.C5353b m94978d = C34512Mk1.m94978d(C17216a.m52740f(), interfaceC46640p31.getAction(), name);
        if (m94978d != null) {
            return m94978d.m94963b();
        }
        return null;
    }

    /* renamed from: c */
    public static C50483vY2.C29587f m112940c(InterfaceC46640p31 interfaceC46640p31) {
        String m52740f = C17216a.m52740f();
        String action = interfaceC46640p31.getAction();
        return C50483vY2.m8468t(action, m112939d(m52740f, action, interfaceC46640p31));
    }

    /* renamed from: d */
    public static int[] m112939d(String str, String str2, InterfaceC46640p31 interfaceC46640p31) {
        C34512Mk1.C5353b m94978d = C34512Mk1.m94978d(str, str2, interfaceC46640p31.name());
        return m94978d != null ? m94978d.m94961d() : new int[]{interfaceC46640p31.mo1063a()};
    }

    /* renamed from: e */
    public static void m112938e(C7501Sh c7501Sh, C33702Iy1 c33702Iy1) {
        c33702Iy1.m101437d(c7501Sh.m85128d(), c7501Sh.m85129c());
        c7501Sh.m85126f();
    }

    /* renamed from: f */
    public static void m112937f(C7501Sh c7501Sh, Activity activity) {
        activity.startActivityForResult(c7501Sh.m85128d(), c7501Sh.m85129c());
        c7501Sh.m85126f();
    }

    /* renamed from: g */
    public static void m112936g(C7501Sh c7501Sh) {
        m112933j(c7501Sh, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    /* renamed from: h */
    public static void m112935h(C7501Sh c7501Sh, FacebookException facebookException) {
        if (facebookException == null) {
            return;
        }
        C48817sj6.m13772f(C17216a.m52741e());
        Intent intent = new Intent();
        intent.setClass(C17216a.m52741e(), FacebookActivity.class);
        intent.setAction(FacebookActivity.f69339c);
        C50483vY2.m8491B(intent, c7501Sh.m85131a().toString(), null, C50483vY2.m8465w(), C50483vY2.m8479i(facebookException));
        c7501Sh.m85125g(intent);
    }

    /* renamed from: i */
    public static void m112934i(C7501Sh c7501Sh, InterfaceC0847a interfaceC0847a, InterfaceC46640p31 interfaceC46640p31) {
        Bundle mo23639a;
        Context m52741e = C17216a.m52741e();
        String action = interfaceC46640p31.getAction();
        C50483vY2.C29587f m112940c = m112940c(interfaceC46640p31);
        int m8454d = m112940c.m8454d();
        if (m8454d != -1) {
            if (C50483vY2.m8492A(m8454d)) {
                mo23639a = interfaceC0847a.getParameters();
            } else {
                mo23639a = interfaceC0847a.mo23639a();
            }
            if (mo23639a == null) {
                mo23639a = new Bundle();
            }
            Intent m8476l = C50483vY2.m8476l(m52741e, c7501Sh.m85131a().toString(), action, m112940c, mo23639a);
            if (m8476l != null) {
                c7501Sh.m85125g(m8476l);
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    /* renamed from: j */
    public static void m112933j(C7501Sh c7501Sh, FacebookException facebookException) {
        m112935h(c7501Sh, facebookException);
    }

    /* renamed from: k */
    public static void m112932k(C7501Sh c7501Sh, String str, Bundle bundle) {
        C48817sj6.m13772f(C17216a.m52741e());
        C48817sj6.m13770h(C17216a.m52741e());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C50483vY2.m8491B(intent, c7501Sh.m85131a().toString(), str, C50483vY2.m8465w(), bundle2);
        intent.setClass(C17216a.m52741e(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        c7501Sh.m85125g(intent);
    }

    /* renamed from: l */
    public static void m112931l(C7501Sh c7501Sh, Bundle bundle, InterfaceC46640p31 interfaceC46640p31) {
        Uri m2845d;
        C48817sj6.m13772f(C17216a.m52741e());
        C48817sj6.m13770h(C17216a.m52741e());
        String name = interfaceC46640p31.name();
        Uri m112941b = m112941b(interfaceC46640p31);
        if (m112941b != null) {
            Bundle m157h = C53066zt5.m157h(c7501Sh.m85131a().toString(), C50483vY2.m8465w(), bundle);
            if (m157h != null) {
                if (m112941b.isRelative()) {
                    m2845d = C52364yi6.m2845d(C53066zt5.m163b(), m112941b.toString(), m157h);
                } else {
                    m2845d = C52364yi6.m2845d(m112941b.getAuthority(), m112941b.getPath(), m157h);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("url", m2845d.toString());
                bundle2.putBoolean("is_fallback", true);
                Intent intent = new Intent();
                C50483vY2.m8491B(intent, c7501Sh.m85131a().toString(), interfaceC46640p31.getAction(), C50483vY2.m8465w(), bundle2);
                intent.setClass(C17216a.m52741e(), FacebookActivity.class);
                intent.setAction("FacebookDialogFragment");
                c7501Sh.m85125g(intent);
                return;
            }
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        throw new FacebookException("Unable to fetch the Url for the DialogFeature : '" + name + "'");
    }
}
