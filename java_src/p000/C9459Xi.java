package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
/* renamed from: Xi */
/* loaded from: classes5.dex */
public class C9459Xi {

    /* renamed from: a */
    public C9916Yi f43705a;

    /* renamed from: Xi$a */
    /* loaded from: classes5.dex */
    public enum EnumC9460a {
        AUTO,
        EXPLICIT_ONLY
    }

    public C9459Xi(Context context, String str, AccessToken accessToken) {
        this.f43705a = new C9916Yi(context, str, accessToken);
    }

    /* renamed from: a */
    public static void m76557a(Application application, String str) {
        C9916Yi.m74460a(application, str);
    }

    /* renamed from: c */
    public static String m76555c(Context context) {
        return C9916Yi.m74456e(context);
    }

    /* renamed from: d */
    public static EnumC9460a m76554d() {
        return C9916Yi.m74455f();
    }

    /* renamed from: e */
    public static String m76553e() {
        return C12452bb.m64302b();
    }

    /* renamed from: f */
    public static void m76552f(Context context, String str) {
        C9916Yi.m74452i(context, str);
    }

    /* renamed from: h */
    public static C9459Xi m76550h(Context context) {
        return new C9459Xi(context, null, null);
    }

    /* renamed from: i */
    public static void m76549i() {
        C9916Yi.m74440u();
    }

    /* renamed from: b */
    public void m76556b() {
        this.f43705a.m74458c();
    }

    /* renamed from: g */
    public void m76551g(String str, Bundle bundle) {
        this.f43705a.m74448m(str, bundle);
    }
}
