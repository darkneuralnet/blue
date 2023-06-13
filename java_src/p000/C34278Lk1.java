package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\bH\u0007J\u0006\u0010\u000f\u001a\u00020\u0004J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+¨\u0006/"}, m28432d2 = {"LLk1;", "", "LLk1$a;", "callback", "", "j", "", NamedConstantsKt.APPLICATION_ID, "", "forceRequery", "Lorg/json/JSONObject;", "m", "name", "defaultValue", "f", "i", "", "g", "gateKeepersJSON", "k", "l", "e", "", FraudDetectionData.KEY_TIMESTAMP, "h", "(Ljava/lang/Long;)Z", C17296a.f69688o, "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "c", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "callbacks", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "fetchedAppGateKeepers", "Ljava/lang/Long;", "LWA1;", "LWA1;", "gateKeeperRuntimeCache", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Lk1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34278Lk1 {

    /* renamed from: e */
    public static Long f22001e;

    /* renamed from: f */
    public static WA1 f22002f;

    /* renamed from: g */
    public static final C34278Lk1 f22003g = new C34278Lk1();

    /* renamed from: a */
    public static final String f21997a = Reflection.getOrCreateKotlinClass(C34278Lk1.class).getSimpleName();

    /* renamed from: b */
    public static final AtomicBoolean f21998b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final ConcurrentLinkedQueue<InterfaceC5074a> f21999c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    public static final Map<String, JSONObject> f22000d = new ConcurrentHashMap();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, m28432d2 = {"LLk1$a;", "", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: Lk1$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC5074a {
        /* renamed from: a */
        void mo96383a();
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Lk1$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC5075b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f22004b;

        /* renamed from: c */
        public final /* synthetic */ Context f22005c;

        /* renamed from: d */
        public final /* synthetic */ String f22006d;

        public RunnableC5075b(String str, Context context, String str2) {
            this.f22004b = str;
            this.f22005c = context;
            this.f22006d = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C34278Lk1 c34278Lk1 = C34278Lk1.f22003g;
                String applicationId = this.f22004b;
                Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
                JSONObject m96392e = c34278Lk1.m96392e(applicationId);
                if (m96392e.length() != 0) {
                    String applicationId2 = this.f22004b;
                    Intrinsics.checkNotNullExpressionValue(applicationId2, "applicationId");
                    c34278Lk1.m96386k(applicationId2, m96392e);
                    this.f22005c.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f22006d, m96392e.toString()).apply();
                    C34278Lk1.f22001e = Long.valueOf(System.currentTimeMillis());
                }
                c34278Lk1.m96385l();
                C34278Lk1.f21998b.set(false);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Lk1$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC5076c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC5074a f22007b;

        public RunnableC5076c(InterfaceC5074a interfaceC5074a) {
            this.f22007b = interfaceC5074a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                this.f22007b.mo96383a();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    private C34278Lk1() {
    }

    @JvmStatic
    /* renamed from: f */
    public static final boolean m96391f(String name, String str, boolean z) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Boolean> m96390g = f22003g.m96390g(str);
        if (m96390g.containsKey(name) && (bool = m96390g.get(name)) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    @JvmStatic
    /* renamed from: j */
    public static final synchronized void m96387j(InterfaceC5074a interfaceC5074a) {
        synchronized (C34278Lk1.class) {
            if (interfaceC5074a != null) {
                f21999c.add(interfaceC5074a);
            }
            String applicationId = C17216a.m52740f();
            C34278Lk1 c34278Lk1 = f22003g;
            if (c34278Lk1.m96389h(f22001e) && f22000d.containsKey(applicationId)) {
                c34278Lk1.m96385l();
                return;
            }
            Context m52741e = C17216a.m52741e();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            if (m52741e == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = m52741e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!C52364yi6.m2860R(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    C52364yi6.m2854X("FacebookSDK", e);
                }
                if (jSONObject != null) {
                    C34278Lk1 c34278Lk12 = f22003g;
                    Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
                    c34278Lk12.m96386k(applicationId, jSONObject);
                }
            }
            Executor m52731o = C17216a.m52731o();
            if (m52731o != null) {
                if (!f21998b.compareAndSet(false, true)) {
                    return;
                }
                m52731o.execute(new RunnableC5075b(applicationId, m52741e, format));
            }
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final JSONObject m96384m(String applicationId, boolean z) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z) {
            Map<String, JSONObject> map = f22000d;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                if (jSONObject == null) {
                    return new JSONObject();
                }
                return jSONObject;
            }
        }
        C34278Lk1 c34278Lk1 = f22003g;
        JSONObject m96392e = c34278Lk1.m96392e(applicationId);
        Context m52741e = C17216a.m52741e();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        m52741e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, m96392e.toString()).apply();
        return c34278Lk1.m96386k(applicationId, m96392e);
    }

    /* renamed from: e */
    public final JSONObject m96392e(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString(AnalyticsRequestV2Factory.PARAM_SDK_VERSION, C17216a.m52725u());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.C17206c c17206c = GraphRequest.f69390s;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, "mobile_sdk_gk"}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        GraphRequest m52781w = c17206c.m52781w(null, format, null);
        m52781w.m52849D(true);
        m52781w.m52850C(bundle);
        JSONObject m78702d = m52781w.m52837j().m78702d();
        if (m78702d == null) {
            return new JSONObject();
        }
        return m78702d;
    }

    /* renamed from: g */
    public final Map<String, Boolean> m96390g(String str) {
        List<VA1> list;
        m96388i();
        if (str != null) {
            Map<String, JSONObject> map = f22000d;
            if (map.containsKey(str)) {
                WA1 wa1 = f22002f;
                if (wa1 != null) {
                    list = wa1.m78774a(str);
                } else {
                    list = null;
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (VA1 va1 : list) {
                        hashMap.put(va1.m80266a(), Boolean.valueOf(va1.m80265b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                WA1 wa12 = f22002f;
                if (wa12 == null) {
                    wa12 = new WA1();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new VA1((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                wa12.m78773b(str, arrayList);
                f22002f = wa12;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    /* renamed from: h */
    public final boolean m96389h(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < CoreConstants.MILLIS_IN_ONE_HOUR;
    }

    /* renamed from: i */
    public final void m96388i() {
        m96387j(null);
    }

    /* renamed from: k */
    public final synchronized JSONObject m96386k(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        jSONObject2 = f22000d.get(applicationId);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(MessageExtension.FIELD_DATA)) == null || (jSONObject3 = optJSONArray.optJSONObject(0)) == null) {
            jSONObject3 = new JSONObject();
        }
        JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
        if (optJSONArray2 == null) {
            optJSONArray2 = new JSONArray();
        }
        int length = optJSONArray2.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
            } catch (JSONException e) {
                C52364yi6.m2854X("FacebookSDK", e);
            }
        }
        f22000d.put(applicationId, jSONObject2);
        return jSONObject2;
    }

    /* renamed from: l */
    public final void m96385l() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<InterfaceC5074a> concurrentLinkedQueue = f21999c;
            if (!concurrentLinkedQueue.isEmpty()) {
                InterfaceC5074a poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new RunnableC5076c(poll));
                }
            } else {
                return;
            }
        }
    }
}
