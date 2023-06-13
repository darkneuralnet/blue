package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b/\u00100JY\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0016¨\u00061"}, m28432d2 = {"LQq5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "method", "service", "path", "httpMethod", "", "forceRefresh", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getMethod", "e", "getService", "f", "getPath", "g", "getHttpMethod", "h", "Z", "getForceRefresh", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35506Qq5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f31012a;

    /* renamed from: b */
    public final DateTime f31013b;

    /* renamed from: c */
    public final DateTime f31014c;

    /* renamed from: d */
    public final String f31015d;

    /* renamed from: e */
    public final String f31016e;

    /* renamed from: f */
    public final String f31017f;

    /* renamed from: g */
    public final String f31018g;

    /* renamed from: h */
    public final boolean f31019h;

    public C35506Qq5(String eventId, DateTime eventTime, DateTime clientTime, String method, String service, String path, String httpMethod, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.f31012a = eventId;
        this.f31013b = eventTime;
        this.f31014c = clientTime;
        this.f31015d = method;
        this.f31016e = service;
        this.f31017f = path;
        this.f31018g = httpMethod;
        this.f31019h = z;
    }

    /* renamed from: a */
    public final C35506Qq5 m87887a(String eventId, DateTime eventTime, DateTime clientTime, String method, String service, String path, String httpMethod, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        return new C35506Qq5(eventId, eventTime, clientTime, method, service, path, httpMethod, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35506Qq5) {
            C35506Qq5 c35506Qq5 = (C35506Qq5) obj;
            return Intrinsics.areEqual(this.f31012a, c35506Qq5.f31012a) && Intrinsics.areEqual(this.f31013b, c35506Qq5.f31013b) && Intrinsics.areEqual(this.f31014c, c35506Qq5.f31014c) && Intrinsics.areEqual(this.f31015d, c35506Qq5.f31015d) && Intrinsics.areEqual(this.f31016e, c35506Qq5.f31016e) && Intrinsics.areEqual(this.f31017f, c35506Qq5.f31017f) && Intrinsics.areEqual(this.f31018g, c35506Qq5.f31018g) && this.f31019h == c35506Qq5.f31019h;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.SecurityAppCheckRequested";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f31012a), TuplesKt.m28425to("event_time", this.f31013b), TuplesKt.m28425to("client_time", this.f31014c), TuplesKt.m28425to("method", this.f31015d), TuplesKt.m28425to("service", this.f31016e), TuplesKt.m28425to("path", this.f31017f), TuplesKt.m28425to("http_method", this.f31018g), TuplesKt.m28425to("force_refresh", Boolean.valueOf(this.f31019h)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f31012a.hashCode() * 31) + this.f31013b.hashCode()) * 31) + this.f31014c.hashCode()) * 31) + this.f31015d.hashCode()) * 31) + this.f31016e.hashCode()) * 31) + this.f31017f.hashCode()) * 31) + this.f31018g.hashCode()) * 31;
        boolean z = this.f31019h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f31012a;
        DateTime dateTime = this.f31013b;
        DateTime dateTime2 = this.f31014c;
        String str2 = this.f31015d;
        String str3 = this.f31016e;
        String str4 = this.f31017f;
        String str5 = this.f31018g;
        boolean z = this.f31019h;
        return "SecurityAppCheckRequested(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", method=" + str2 + ", service=" + str3 + ", path=" + str4 + ", httpMethod=" + str5 + ", forceRefresh=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35506Qq5(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, str4, str5, z);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
