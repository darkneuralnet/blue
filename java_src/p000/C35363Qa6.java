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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b)\u0010*JG\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006+"}, m28432d2 = {"LQa6;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "tutorialId", "endRideAttemptId", "", "viewCount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getTutorialId", "e", "getEndRideAttemptId", "f", "I", "getViewCount", "()I", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qa6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35363Qa6 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f30550a;

    /* renamed from: b */
    public final DateTime f30551b;

    /* renamed from: c */
    public final DateTime f30552c;

    /* renamed from: d */
    public final String f30553d;

    /* renamed from: e */
    public final String f30554e;

    /* renamed from: f */
    public final int f30555f;

    public C35363Qa6(String eventId, DateTime eventTime, DateTime clientTime, String tutorialId, String str, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(tutorialId, "tutorialId");
        this.f30550a = eventId;
        this.f30551b = eventTime;
        this.f30552c = clientTime;
        this.f30553d = tutorialId;
        this.f30554e = str;
        this.f30555f = i;
    }

    public static /* synthetic */ C35363Qa6 copy$default(C35363Qa6 c35363Qa6, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c35363Qa6.f30550a;
        }
        if ((i2 & 2) != 0) {
            dateTime = c35363Qa6.f30551b;
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = c35363Qa6.f30552c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i2 & 8) != 0) {
            str2 = c35363Qa6.f30553d;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = c35363Qa6.f30554e;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            i = c35363Qa6.f30555f;
        }
        return c35363Qa6.m88390a(str, dateTime3, dateTime4, str4, str5, i);
    }

    /* renamed from: a */
    public final C35363Qa6 m88390a(String eventId, DateTime eventTime, DateTime clientTime, String tutorialId, String str, int i) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(tutorialId, "tutorialId");
        return new C35363Qa6(eventId, eventTime, clientTime, tutorialId, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35363Qa6) {
            C35363Qa6 c35363Qa6 = (C35363Qa6) obj;
            return Intrinsics.areEqual(this.f30550a, c35363Qa6.f30550a) && Intrinsics.areEqual(this.f30551b, c35363Qa6.f30551b) && Intrinsics.areEqual(this.f30552c, c35363Qa6.f30552c) && Intrinsics.areEqual(this.f30553d, c35363Qa6.f30553d) && Intrinsics.areEqual(this.f30554e, c35363Qa6.f30554e) && this.f30555f == c35363Qa6.f30555f;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.TutorialViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f30550a), TuplesKt.m28425to("event_time", this.f30551b), TuplesKt.m28425to("client_time", this.f30552c), TuplesKt.m28425to("tutorial_id", this.f30553d), TuplesKt.m28425to("end_ride_attempt_id", this.f30554e), TuplesKt.m28425to("view_count", Integer.valueOf(this.f30555f)));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f30550a.hashCode() * 31) + this.f30551b.hashCode()) * 31) + this.f30552c.hashCode()) * 31) + this.f30553d.hashCode()) * 31;
        String str = this.f30554e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f30555f);
    }

    public String toString() {
        String str = this.f30550a;
        DateTime dateTime = this.f30551b;
        DateTime dateTime2 = this.f30552c;
        String str2 = this.f30553d;
        String str3 = this.f30554e;
        int i = this.f30555f;
        return "TutorialViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", tutorialId=" + str2 + ", endRideAttemptId=" + str3 + ", viewCount=" + i + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C35363Qa6(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, (i2 & 16) != 0 ? null : str3, i);
        if ((i2 & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
