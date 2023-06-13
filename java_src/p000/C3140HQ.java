package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b-\u0010.JO\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LHQ;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "", "activeCount", "ineligibleCount", "availableCount", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "J", "getActiveCount", "()J", "f", "getIneligibleCount", "g", "getAvailableCount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JJJ)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HQ */
/* loaded from: classes4.dex */
public final class C3140HQ implements AnalyticsEvent {

    /* renamed from: a */
    public final String f13367a;

    /* renamed from: b */
    public final DateTime f13368b;

    /* renamed from: c */
    public final DateTime f13369c;

    /* renamed from: d */
    public final String f13370d;

    /* renamed from: e */
    public final long f13371e;

    /* renamed from: f */
    public final long f13372f;

    /* renamed from: g */
    public final long f13373g;

    public C3140HQ(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f13367a = eventId;
        this.f13368b = eventTime;
        this.f13369c = clientTime;
        this.f13370d = sessionId;
        this.f13371e = j;
        this.f13372f = j2;
        this.f13373g = j3;
    }

    /* renamed from: a */
    public final C3140HQ m103902a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new C3140HQ(eventId, eventTime, clientTime, sessionId, j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3140HQ) {
            C3140HQ c3140hq = (C3140HQ) obj;
            return Intrinsics.areEqual(this.f13367a, c3140hq.f13367a) && Intrinsics.areEqual(this.f13368b, c3140hq.f13368b) && Intrinsics.areEqual(this.f13369c, c3140hq.f13369c) && Intrinsics.areEqual(this.f13370d, c3140hq.f13370d) && this.f13371e == c3140hq.f13371e && this.f13372f == c3140hq.f13372f && this.f13373g == c3140hq.f13373g;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPlusLandingScreenDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f13367a), TuplesKt.m28425to("event_time", this.f13368b), TuplesKt.m28425to("client_time", this.f13369c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f13370d), TuplesKt.m28425to("active_count", Long.valueOf(this.f13371e)), TuplesKt.m28425to("ineligible_count", Long.valueOf(this.f13372f)), TuplesKt.m28425to("available_count", Long.valueOf(this.f13373g)));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((((this.f13367a.hashCode() * 31) + this.f13368b.hashCode()) * 31) + this.f13369c.hashCode()) * 31) + this.f13370d.hashCode()) * 31) + Long.hashCode(this.f13371e)) * 31) + Long.hashCode(this.f13372f)) * 31) + Long.hashCode(this.f13373g);
    }

    public String toString() {
        String str = this.f13367a;
        DateTime dateTime = this.f13368b;
        DateTime dateTime2 = this.f13369c;
        String str2 = this.f13370d;
        long j = this.f13371e;
        long j2 = this.f13372f;
        long j3 = this.f13373g;
        return "BirdPlusLandingScreenDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", activeCount=" + j + ", ineligibleCount=" + j2 + ", availableCount=" + j3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3140HQ(String str, DateTime dateTime, DateTime dateTime2, String str2, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, j, j2, j3);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str3 = uuid;
        } else {
            str3 = str;
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
