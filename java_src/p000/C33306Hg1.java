package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J&\u0010\f\u001a\u00020\u00022\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u0002H\u0002R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"LHg1;", "", "", C17296a.f69688o, "", "LSi;", "events", DateTokenConverter.CONVERTER_KEY, "", "", "parameters", "eventName", "c", "b", "", "Z", "enabled", "LHg1$a;", "Ljava/util/List;", "deprecatedParamFilters", "", "Ljava/util/Set;", "deprecatedEvents", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Hg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33306Hg1 {

    /* renamed from: a */
    public static boolean f13745a;

    /* renamed from: d */
    public static final C33306Hg1 f13748d = new C33306Hg1();

    /* renamed from: b */
    public static final List<C3206a> f13746b = new ArrayList();

    /* renamed from: c */
    public static final Set<String> f13747c = new HashSet();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LHg1$a;", "", "", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "eventName", "", "Ljava/util/List;", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "deprecateParams", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Hg1$a */
    /* loaded from: classes5.dex */
    public static final class C3206a {

        /* renamed from: a */
        public String f13749a;

        /* renamed from: b */
        public List<String> f13750b;

        public C3206a(String eventName, List<String> deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.f13749a = eventName;
            this.f13750b = deprecateParams;
        }

        /* renamed from: a */
        public final List<String> m103538a() {
            return this.f13750b;
        }

        /* renamed from: b */
        public final String m103537b() {
            return this.f13749a;
        }

        /* renamed from: c */
        public final void m103536c(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f13750b = list;
        }
    }

    private C33306Hg1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m103542a() {
        if (TD0.m84203d(C33306Hg1.class)) {
            return;
        }
        try {
            f13745a = true;
            f13748d.m103541b();
        } catch (Throwable th) {
            TD0.m84205b(th, C33306Hg1.class);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m103540c(Map<String, String> parameters, String eventName) {
        if (TD0.m84203d(C33306Hg1.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (!f13745a) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList(parameters.keySet());
            for (C3206a c3206a : new ArrayList(f13746b)) {
                if (!(!Intrinsics.areEqual(c3206a.m103537b(), eventName))) {
                    for (String str : arrayList) {
                        if (c3206a.m103538a().contains(str)) {
                            parameters.remove(str);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C33306Hg1.class);
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m103539d(List<C7508Si> events) {
        if (TD0.m84203d(C33306Hg1.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (!f13745a) {
                return;
            }
            Iterator<C7508Si> it = events.iterator();
            while (it.hasNext()) {
                if (f13747c.contains(it.next().getName())) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C33306Hg1.class);
        }
    }

    /* renamed from: b */
    public final synchronized void m103541b() {
        boolean z;
        C34512Mk1 m93517o;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            String m52740f = C17216a.m52740f();
            Intrinsics.checkNotNullExpressionValue(m52740f, "FacebookSdk.getApplicationId()");
            z = false;
            m93517o = C34746Nk1.m93517o(m52740f, false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return;
        }
        if (m93517o != null) {
            String m94971k = m93517o.m94971k();
            if (m94971k != null) {
                if (m94971k.length() > 0) {
                    z = true;
                }
                if (z) {
                    JSONObject jSONObject = new JSONObject(m94971k);
                    f13746b.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set<String> set = f13747c;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                set.add(key);
                            } else {
                                JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                C3206a c3206a = new C3206a(key, new ArrayList());
                                if (optJSONArray != null) {
                                    c3206a.m103536c(C52364yi6.m2833j(optJSONArray));
                                }
                                f13746b.add(c3206a);
                            }
                        }
                    }
                }
            }
        }
    }
}
