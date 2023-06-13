package p000;

import android.content.Context;
import android.content.Intent;
import com.paypal.android.sdk.onetouch.core.Request;
import com.paypal.android.sdk.onetouch.core.Result;
/* renamed from: pL3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C46811pL3 {

    /* renamed from: a */
    public static XA0 f103536a;

    /* renamed from: b */
    public static C46560ov0 f103537b;

    /* renamed from: c */
    public static C36033Sx1 f103538c;

    /* renamed from: a */
    public static String m19465a(Context context, String str) {
        return C45032mL3.m25818c(context, str);
    }

    /* renamed from: b */
    public static XA0 m19464b(Context context) {
        if (f103536a == null) {
            f103536a = new XA0(context);
        }
        return f103536a;
    }

    /* renamed from: c */
    public static C36033Sx1 m19463c(Context context) {
        m19461e(context);
        return f103538c;
    }

    /* renamed from: d */
    public static C41519gQ3 m19462d(Context context, Request request) {
        m19461e(context);
        m19460f(context);
        AbstractC45348ms4 mo45886l = request.mo45886l(context, f103537b.m20280b());
        if (mo45886l == null) {
            return new C41519gQ3(false, null, null, null);
        }
        EnumC43236jJ4 enumC43236jJ4 = EnumC43236jJ4.wallet;
        if (enumC43236jJ4 == mo45886l.m24832c()) {
            request.mo45881q(context, EnumC45489n66.SwitchToWallet, mo45886l.m24833b());
            return new C41519gQ3(true, enumC43236jJ4, request.m45888j(), C27348pl.m18829b(f103536a, f103537b, request, mo45886l));
        }
        Intent m82053a = U20.m82053a(f103536a, f103537b, request);
        if (m82053a != null) {
            return new C41519gQ3(true, EnumC43236jJ4.browser, request.m45888j(), m82053a);
        }
        return new C41519gQ3(false, EnumC43236jJ4.browser, request.m45888j(), null);
    }

    /* renamed from: e */
    public static void m19461e(Context context) {
        if (f103537b == null || f103538c == null) {
            C46218oL3 m3544i = new C46218oL3().m3544i("https://api-m.paypal.com/v1/");
            f103537b = new C46560ov0(m19464b(context), m3544i);
            f103538c = new C36033Sx1(m19464b(context), m3544i);
        }
        f103537b.m20278d();
    }

    /* renamed from: f */
    public static boolean m19460f(Context context) {
        m19461e(context);
        for (C49940ud3 c49940ud3 : f103537b.m20280b().m84528e()) {
            if (c49940ud3.m24832c() == EnumC43236jJ4.wallet && c49940ud3.m24829g(context)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static Result m19459g(Context context, Request request, Intent intent) {
        m19461e(context);
        if (intent != null && intent.getData() != null) {
            return U20.m82052b(f103536a, request, intent.getData());
        }
        if (intent != null && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
            return C27348pl.m18827d(f103536a, request, intent);
        }
        request.mo45881q(context, EnumC45489n66.Cancel, null);
        return new Result();
    }
}
