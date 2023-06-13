package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0004B'\b\u0002\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0013"}, m28432d2 = {"LPT2;", "", "", "", C17296a.f69688o, "Ljava/util/List;", "c", "()Ljava/util/List;", "keyRules", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "f", "valRule", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "e", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: PT2 */
/* loaded from: classes5.dex */
public final class PT2 {

    /* renamed from: a */
    public final List<String> f28547a;

    /* renamed from: b */
    public final String f28548b;

    /* renamed from: c */
    public final String f28549c;

    /* renamed from: e */
    public static final C6379a f28546e = new C6379a(null);

    /* renamed from: d */
    public static final Set<PT2> f28545d = new CopyOnWriteArraySet();

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LPT2$a;", "", "", "LPT2;", "c", "", "rulesFromServer", "", DateTokenConverter.CONVERTER_KEY, "b", "Lorg/json/JSONObject;", "jsonObject", C17296a.f69688o, "FIELD_K", "Ljava/lang/String;", "FIELD_K_DELIMITER", "FIELD_V", "", "rules", "Ljava/util/Set;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: PT2$a */
    /* loaded from: classes5.dex */
    public static final class C6379a {
        private C6379a() {
        }

        /* renamed from: a */
        public final void m90210a(JSONObject jSONObject) {
            boolean z;
            List split$default;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k = optJSONObject.optString("k");
                    String v = optJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k, "k");
                    if (k.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Set m90217a = PT2.m90217a();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        split$default = StringsKt__StringsKt.split$default((CharSequence) k, new String[]{","}, false, 0, 6, (Object) null);
                        Intrinsics.checkNotNullExpressionValue(v, "v");
                        m90217a.add(new PT2(key, split$default, v, null));
                    }
                }
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final Set<String> m90209b() {
            HashSet hashSet = new HashSet();
            for (PT2 pt2 : PT2.m90217a()) {
                hashSet.add(pt2.m90214d());
            }
            return hashSet;
        }

        @JvmStatic
        /* renamed from: c */
        public final Set<PT2> m90208c() {
            return new HashSet(PT2.m90217a());
        }

        @JvmStatic
        /* renamed from: d */
        public final void m90207d(String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                PT2.m90217a().clear();
                m90210a(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }

        public /* synthetic */ C6379a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PT2(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ Set m90217a() {
        if (TD0.m84203d(PT2.class)) {
            return null;
        }
        try {
            return f28545d;
        } catch (Throwable th) {
            TD0.m84205b(th, PT2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final Set<String> m90216b() {
        if (TD0.m84203d(PT2.class)) {
            return null;
        }
        try {
            return f28546e.m90209b();
        } catch (Throwable th) {
            TD0.m84205b(th, PT2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final Set<PT2> m90213e() {
        if (TD0.m84203d(PT2.class)) {
            return null;
        }
        try {
            return f28546e.m90208c();
        } catch (Throwable th) {
            TD0.m84205b(th, PT2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m90211g(String str) {
        if (TD0.m84203d(PT2.class)) {
            return;
        }
        try {
            f28546e.m90207d(str);
        } catch (Throwable th) {
            TD0.m84205b(th, PT2.class);
        }
    }

    /* renamed from: c */
    public final List<String> m90215c() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f28547a);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final String m90214d() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f28548b;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public final String m90212f() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f28549c;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    public PT2(String str, List<String> list, String str2) {
        this.f28548b = str;
        this.f28549c = str2;
        this.f28547a = list;
    }
}
