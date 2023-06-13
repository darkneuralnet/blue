package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C29645vp;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LTi;", "", "LlR3;", "persistedEvents", "", "b", "LE1;", "accessTokenAppIdPair", "LSi;", "appEvent", C17296a.f69688o, "", "f", "Luv5;", "c", "accessTokenAppId", "e", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "stateMap", "", DateTokenConverter.CONVERTER_KEY, "()I", "eventCount", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Ti */
/* loaded from: classes5.dex */
public final class C7913Ti {

    /* renamed from: a */
    public final HashMap<C1706E1, C50122uv5> f35899a = new HashMap<>();

    /* renamed from: a */
    public final synchronized void m83150a(C1706E1 accessTokenAppIdPair, C7508Si appEvent) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        C50122uv5 m83146e = m83146e(accessTokenAppIdPair);
        if (m83146e != null) {
            m83146e.m9491a(appEvent);
        }
    }

    /* renamed from: b */
    public final synchronized void m83149b(C44493lR3 c44493lR3) {
        if (c44493lR3 == null) {
            return;
        }
        for (C1706E1 c1706e1 : c44493lR3.m27292c()) {
            C50122uv5 m83146e = m83146e(c1706e1);
            if (m83146e != null) {
                List<C7508Si> m27293b = c44493lR3.m27293b(c1706e1);
                if (m27293b != null) {
                    for (C7508Si c7508Si : m27293b) {
                        m83146e.m9491a(c7508Si);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized C50122uv5 m83148c(C1706E1 accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.f35899a.get(accessTokenAppIdPair);
    }

    /* renamed from: d */
    public final synchronized int m83147d() {
        int i;
        i = 0;
        for (C50122uv5 c50122uv5 : this.f35899a.values()) {
            i += c50122uv5.m9489c();
        }
        return i;
    }

    /* renamed from: e */
    public final synchronized C50122uv5 m83146e(C1706E1 c1706e1) {
        C50122uv5 c50122uv5 = this.f35899a.get(c1706e1);
        if (c50122uv5 == null) {
            Context context = C17216a.m52741e();
            C29645vp.C29646a c29646a = C29645vp.f114726h;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C29645vp m7984e = c29646a.m7984e(context);
            if (m7984e != null) {
                String m76555c = C9459Xi.m76555c(context);
                Intrinsics.checkNotNullExpressionValue(m76555c, "AppEventsLogger.getAnonymousAppDeviceGUID(context)");
                c50122uv5 = new C50122uv5(m7984e, m76555c);
            } else {
                c50122uv5 = null;
            }
        }
        if (c50122uv5 == null) {
            return null;
        }
        this.f35899a.put(c1706e1, c50122uv5);
        return c50122uv5;
    }

    /* renamed from: f */
    public final synchronized Set<C1706E1> m83145f() {
        Set<C1706E1> keySet;
        keySet = this.f35899a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }
}
