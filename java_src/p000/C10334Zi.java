package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LZi;", "", "LZi$a;", "activityType", "Lvp;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "", "limitEventUsage", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lorg/json/JSONObject;", C17296a.f69688o, "", "Ljava/util/Map;", "API_ACTIVITY_TYPE_TO_STRING", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Zi */
/* loaded from: classes5.dex */
public final class C10334Zi {

    /* renamed from: a */
    public static final Map<EnumC10335a, String> f48973a;

    /* renamed from: b */
    public static final C10334Zi f48974b = new C10334Zi();

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LZi$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Zi$a */
    /* loaded from: classes5.dex */
    public enum EnumC10335a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    static {
        HashMap hashMapOf;
        hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m28425to(EnumC10335a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), TuplesKt.m28425to(EnumC10335a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f48973a = hashMapOf;
    }

    private C10334Zi() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final JSONObject m72664a(EnumC10335a activityType, C29645vp c29645vp, String str, boolean z, Context context) throws JSONException {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f48973a.get(activityType));
        String m76553e = C9459Xi.m76553e();
        if (m76553e != null) {
            jSONObject.put("app_user_id", m76553e);
        }
        C52364yi6.m2814s0(jSONObject, c29645vp, str, z);
        try {
            C52364yi6.m2812t0(jSONObject, context);
        } catch (Exception e) {
            C32992Fx2.f10539f.m106213d(EnumC36034Sx2.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject m2807w = C52364yi6.m2807w();
        if (m2807w != null) {
            Iterator<String> keys = m2807w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, m2807w.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
