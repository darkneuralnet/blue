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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.J[\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LRq5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "method", "service", "path", "httpMethod", "failureReason", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getMethod", "e", "getService", "f", "getPath", "g", "getHttpMethod", "h", "getFailureReason", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35740Rq5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f32730a;

    /* renamed from: b */
    public final DateTime f32731b;

    /* renamed from: c */
    public final DateTime f32732c;

    /* renamed from: d */
    public final String f32733d;

    /* renamed from: e */
    public final String f32734e;

    /* renamed from: f */
    public final String f32735f;

    /* renamed from: g */
    public final String f32736g;

    /* renamed from: h */
    public final String f32737h;

    public C35740Rq5(String eventId, DateTime eventTime, DateTime clientTime, String method, String service, String path, String httpMethod, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        this.f32730a = eventId;
        this.f32731b = eventTime;
        this.f32732c = clientTime;
        this.f32733d = method;
        this.f32734e = service;
        this.f32735f = path;
        this.f32736g = httpMethod;
        this.f32737h = str;
    }

    /* renamed from: a */
    public final C35740Rq5 m86274a(String eventId, DateTime eventTime, DateTime clientTime, String method, String service, String path, String httpMethod, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        return new C35740Rq5(eventId, eventTime, clientTime, method, service, path, httpMethod, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35740Rq5) {
            C35740Rq5 c35740Rq5 = (C35740Rq5) obj;
            return Intrinsics.areEqual(this.f32730a, c35740Rq5.f32730a) && Intrinsics.areEqual(this.f32731b, c35740Rq5.f32731b) && Intrinsics.areEqual(this.f32732c, c35740Rq5.f32732c) && Intrinsics.areEqual(this.f32733d, c35740Rq5.f32733d) && Intrinsics.areEqual(this.f32734e, c35740Rq5.f32734e) && Intrinsics.areEqual(this.f32735f, c35740Rq5.f32735f) && Intrinsics.areEqual(this.f32736g, c35740Rq5.f32736g) && Intrinsics.areEqual(this.f32737h, c35740Rq5.f32737h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.SecurityAppCheckTokenResult";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f32730a), TuplesKt.m28425to("event_time", this.f32731b), TuplesKt.m28425to("client_time", this.f32732c), TuplesKt.m28425to("method", this.f32733d), TuplesKt.m28425to("service", this.f32734e), TuplesKt.m28425to("path", this.f32735f), TuplesKt.m28425to("http_method", this.f32736g), TuplesKt.m28425to("failure_reason", this.f32737h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f32730a.hashCode() * 31) + this.f32731b.hashCode()) * 31) + this.f32732c.hashCode()) * 31) + this.f32733d.hashCode()) * 31) + this.f32734e.hashCode()) * 31) + this.f32735f.hashCode()) * 31) + this.f32736g.hashCode()) * 31;
        String str = this.f32737h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f32730a;
        DateTime dateTime = this.f32731b;
        DateTime dateTime2 = this.f32732c;
        String str2 = this.f32733d;
        String str3 = this.f32734e;
        String str4 = this.f32735f;
        String str5 = this.f32736g;
        String str6 = this.f32737h;
        return "SecurityAppCheckTokenResult(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", method=" + str2 + ", service=" + str3 + ", path=" + str4 + ", httpMethod=" + str5 + ", failureReason=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35740Rq5(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, str4, str5, (i & 128) != 0 ? null : str6);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
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
