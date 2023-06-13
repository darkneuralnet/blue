package p000;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C10334Zi;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J0\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010$\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010#R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020%8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010&¨\u0006+"}, m28432d2 = {"Luv5;", "", "LSi;", "event", "", C17296a.f69688o, "", "moveToAccumulated", "b", "Lcom/facebook/GraphRequest;", "request", "Landroid/content/Context;", "applicationContext", "includeImplicitEvents", "limitEventUsage", "", "e", "numSkipped", "Lorg/json/JSONArray;", "events", "f", "", "Ljava/util/List;", "accumulatedEvents", "inFlightEvents", "c", "I", "numSkippedEventsDueToFullBuffer", "Lvp;", DateTokenConverter.CONVERTER_KEY, "Lvp;", "attributionIdentifiers", "", "Ljava/lang/String;", "anonymousAppDeviceGUID", "()I", "accumulatedEventCount", "", "()Ljava/util/List;", "eventsToPersist", "<init>", "(Lvp;Ljava/lang/String;)V", "h", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: uv5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50122uv5 {

    /* renamed from: f */
    public static final String f113201f;

    /* renamed from: g */
    public static final int f113202g;

    /* renamed from: h */
    public static final C29342a f113203h = new C29342a(null);

    /* renamed from: a */
    public List<C7508Si> f113204a;

    /* renamed from: b */
    public final List<C7508Si> f113205b;

    /* renamed from: c */
    public int f113206c;

    /* renamed from: d */
    public final C29645vp f113207d;

    /* renamed from: e */
    public final String f113208e;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Luv5$a;", "", "", "MAX_ACCUMULATED_LOG_EVENTS", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: uv5$a */
    /* loaded from: classes5.dex */
    public static final class C29342a {
        private C29342a() {
        }

        public /* synthetic */ C29342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = C50122uv5.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "SessionEventsState::class.java.simpleName");
        f113201f = simpleName;
        f113202g = 1000;
    }

    public C50122uv5(C29645vp attributionIdentifiers, String anonymousAppDeviceGUID) {
        Intrinsics.checkNotNullParameter(attributionIdentifiers, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(anonymousAppDeviceGUID, "anonymousAppDeviceGUID");
        this.f113207d = attributionIdentifiers;
        this.f113208e = anonymousAppDeviceGUID;
        this.f113204a = new ArrayList();
        this.f113205b = new ArrayList();
    }

    /* renamed from: a */
    public final synchronized void m9491a(C7508Si event) {
        if (TD0.m84203d(this)) {
            return;
        }
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f113204a.size() + this.f113205b.size() >= f113202g) {
            this.f113206c++;
        } else {
            this.f113204a.add(event);
        }
    }

    /* renamed from: b */
    public final synchronized void m9490b(boolean z) {
        if (TD0.m84203d(this)) {
            return;
        }
        if (z) {
            this.f113204a.addAll(this.f113205b);
        }
        this.f113205b.clear();
        this.f113206c = 0;
    }

    /* renamed from: c */
    public final synchronized int m9489c() {
        if (TD0.m84203d(this)) {
            return 0;
        }
        return this.f113204a.size();
    }

    /* renamed from: d */
    public final synchronized List<C7508Si> m9488d() {
        if (TD0.m84203d(this)) {
            return null;
        }
        List<C7508Si> list = this.f113204a;
        this.f113204a = new ArrayList();
        return list;
    }

    /* renamed from: e */
    public final int m9487e(GraphRequest request, Context applicationContext, boolean z, boolean z2) {
        if (TD0.m84203d(this)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (this) {
                int i = this.f113206c;
                C33306Hg1.m103539d(this.f113204a);
                this.f113205b.addAll(this.f113204a);
                this.f113204a.clear();
                JSONArray jSONArray = new JSONArray();
                for (C7508Si c7508Si : this.f113205b) {
                    if (c7508Si.m85021f()) {
                        if (z || !c7508Si.m85020g()) {
                            jSONArray.put(c7508Si.m85022e());
                        }
                    } else {
                        String str = f113201f;
                        C52364yi6.m2853Y(str, "Event with invalid checksum: " + c7508Si);
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                Unit unit = Unit.INSTANCE;
                m9486f(request, applicationContext, i, jSONArray, z2);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return 0;
        }
    }

    /* renamed from: f */
    public final void m9486f(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                jSONObject = C10334Zi.m72664a(C10334Zi.EnumC10335a.CUSTOM_APP_EVENTS, this.f113207d, this.f113208e, z, context);
                if (this.f113206c > 0) {
                    jSONObject.put("num_skipped_events", i);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.m52852A(jSONObject);
            Bundle m52829r = graphRequest.m52829r();
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "events.toString()");
            m52829r.putString("custom_events", jSONArray2);
            graphRequest.m52848E(jSONArray2);
            graphRequest.m52850C(m52829r);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
