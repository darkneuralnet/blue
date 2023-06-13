package p000;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010\t\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LTM4;", "", "", C17296a.f69688o, "", "eventName", "e", "", "parameters", "f", "c", "paramKey", "b", "", DateTokenConverter.CONVERTER_KEY, "Z", "enabled", "Ljava/lang/String;", "TAG", "", "LTM4$a;", "Ljava/util/List;", "restrictiveParamFilters", "", "Ljava/util/Set;", "restrictedEvents", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: TM4 */
/* loaded from: classes5.dex */
public final class TM4 {

    /* renamed from: a */
    public static boolean f35376a;

    /* renamed from: e */
    public static final TM4 f35380e = new TM4();

    /* renamed from: b */
    public static final String f35377b = TM4.class.getCanonicalName();

    /* renamed from: c */
    public static final List<C7818a> f35378c = new ArrayList();

    /* renamed from: d */
    public static final Set<String> f35379d = new CopyOnWriteArraySet();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LTM4$a;", "", "", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "eventName", "", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "restrictiveParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: TM4$a */
    /* loaded from: classes5.dex */
    public static final class C7818a {

        /* renamed from: a */
        public String f35381a;

        /* renamed from: b */
        public Map<String, String> f35382b;

        public C7818a(String eventName, Map<String, String> restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.f35381a = eventName;
            this.f35382b = restrictiveParams;
        }

        /* renamed from: a */
        public final String m83722a() {
            return this.f35381a;
        }

        /* renamed from: b */
        public final Map<String, String> m83721b() {
            return this.f35382b;
        }

        /* renamed from: c */
        public final void m83720c(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f35382b = map;
        }
    }

    private TM4() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m83728a() {
        if (TD0.m84203d(TM4.class)) {
            return;
        }
        try {
            f35376a = true;
            f35380e.m83726c();
        } catch (Throwable th) {
            TD0.m84205b(th, TM4.class);
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m83724e(String eventName) {
        if (TD0.m84203d(TM4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f35376a) {
                if (f35380e.m83725d(eventName)) {
                    return "_removed_";
                }
                return eventName;
            }
            return eventName;
        } catch (Throwable th) {
            TD0.m84205b(th, TM4.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: f */
    public static final void m83723f(Map<String, String> parameters, String eventName) {
        if (TD0.m84203d(TM4.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (!f35376a) {
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str : new ArrayList(parameters.keySet())) {
                String m83727b = f35380e.m83727b(eventName, str);
                if (m83727b != null) {
                    hashMap.put(str, m83727b);
                    parameters.remove(str);
                }
            }
            if (!hashMap.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, TM4.class);
        }
    }

    /* renamed from: b */
    public final String m83727b(String str, String str2) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            try {
                for (C7818a c7818a : new ArrayList(f35378c)) {
                    if (c7818a != null && Intrinsics.areEqual(str, c7818a.m83722a())) {
                        for (String str3 : c7818a.m83721b().keySet()) {
                            if (Intrinsics.areEqual(str2, str3)) {
                                return c7818a.m83721b().get(str3);
                            }
                        }
                        continue;
                    }
                }
            } catch (Exception e) {
                Log.w(f35377b, "getMatchedRuleType failed", e);
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final void m83726c() {
        String m94971k;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            String m52740f = C17216a.m52740f();
            Intrinsics.checkNotNullExpressionValue(m52740f, "FacebookSdk.getApplicationId()");
            boolean z = false;
            C34512Mk1 m93517o = C34746Nk1.m93517o(m52740f, false);
            if (m93517o != null && (m94971k = m93517o.m94971k()) != null) {
                if (m94971k.length() == 0) {
                    z = true;
                }
                if (!z) {
                    JSONObject jSONObject = new JSONObject(m94971k);
                    f35378c.clear();
                    f35379d.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            C7818a c7818a = new C7818a(key, new HashMap());
                            if (optJSONObject != null) {
                                c7818a.m83720c(C52364yi6.m2831k(optJSONObject));
                                f35378c.add(c7818a);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                f35379d.add(c7818a.m83722a());
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: d */
    public final boolean m83725d(String str) {
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            return f35379d.contains(str);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }
}
