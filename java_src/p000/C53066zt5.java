package p000;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C32992Fx2;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J$\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R \u0010\u001c\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0011\u0010\r\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lzt5;", "", "", C17296a.f69688o, "b", "f", "g", "callId", "", "version", "Landroid/os/Bundle;", "methodArgs", "h", "Ljava/lang/String;", "TAG", "", "Ljava/util/Collection;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Collection;", "getErrorsProxyAuthDisabled$annotations", "()V", "errorsProxyAuthDisabled", "c", "e", "getErrorsUserCanceled$annotations", "errorsUserCanceled", "()Ljava/lang/String;", "getErrorConnectionFailure$annotations", "errorConnectionFailure", "<init>", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: zt5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C53066zt5 {

    /* renamed from: a */
    public static final String f122434a;

    /* renamed from: b */
    public static final Collection<String> f122435b;

    /* renamed from: c */
    public static final Collection<String> f122436c;

    /* renamed from: d */
    public static final String f122437d;

    /* renamed from: e */
    public static final C53066zt5 f122438e = new C53066zt5();

    static {
        String name = C53066zt5.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ServerProtocol::class.java.name");
        f122434a = name;
        f122435b = C52364yi6.m2802y0("service_disabled", "AndroidAuthKillSwitchException");
        f122436c = C52364yi6.m2802y0("access_denied", "OAuthAccessDeniedException");
        f122437d = "CONNECTION_FAILURE";
    }

    private C53066zt5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m164a() {
        return "v11.0";
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m163b() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("m.%s", Arrays.copyOf(new Object[]{C17216a.m52730p()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: c */
    public static final String m162c() {
        return f122437d;
    }

    /* renamed from: d */
    public static final Collection<String> m161d() {
        return f122435b;
    }

    /* renamed from: e */
    public static final Collection<String> m160e() {
        return f122436c;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m159f() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{C17216a.m52728r()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m158g() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{C17216a.m52728r()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @JvmStatic
    /* renamed from: h */
    public static final Bundle m157h(String callId, int i, Bundle bundle) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        String m52738h = C17216a.m52738h(C17216a.m52741e());
        if (C52364yi6.m2860R(m52738h)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("android_key_hash", m52738h);
        bundle2.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, C17216a.m52740f());
        bundle2.putInt("version", i);
        bundle2.putString("display", "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", callId);
        try {
            JSONObject m61925b = C38953c70.m61925b(bundle3);
            if (bundle == null) {
                bundle = new Bundle();
            }
            JSONObject m61925b2 = C38953c70.m61925b(bundle);
            if (m61925b != null && m61925b2 != null) {
                bundle2.putString("bridge_args", m61925b.toString());
                bundle2.putString("method_args", m61925b2.toString());
                return bundle2;
            }
            return null;
        } catch (IllegalArgumentException e) {
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.DEVELOPER_ERRORS;
            String str = f122434a;
            c2516a.m106216a(enumC36034Sx2, 6, str, "Error creating Url -- " + e);
            return null;
        } catch (JSONException e2) {
            C32992Fx2.C2516a c2516a2 = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx22 = EnumC36034Sx2.DEVELOPER_ERRORS;
            String str2 = f122434a;
            c2516a2.m106216a(enumC36034Sx22, 6, str2, "Error creating Url -- " + e2);
            return null;
        }
    }
}
