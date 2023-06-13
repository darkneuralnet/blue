package p000;

import com.facebook.share.internal.C17296a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lt74;", "", "", "accessToken", "Lorg/json/JSONObject;", C17296a.f69688o, "key", "value", "", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "infoCache", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: t74  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49054t74 {

    /* renamed from: b */
    public static final C49054t74 f109892b = new C49054t74();

    /* renamed from: a */
    public static final ConcurrentHashMap<String, JSONObject> f109891a = new ConcurrentHashMap<>();

    private C49054t74() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final JSONObject m13033a(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return f109891a.get(accessToken);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m13032b(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        f109891a.put(key, value);
    }
}
