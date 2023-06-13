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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J;\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, m28432d2 = {"LeV4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "activeCount", "ineligibleCount", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "J", "getActiveCount", "()J", "e", "getIneligibleCount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;JJ)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eV4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40379eV4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f78470a;

    /* renamed from: b */
    public final DateTime f78471b;

    /* renamed from: c */
    public final DateTime f78472c;

    /* renamed from: d */
    public final long f78473d;

    /* renamed from: e */
    public final long f78474e;

    public C40379eV4(String eventId, DateTime eventTime, DateTime clientTime, long j, long j2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f78470a = eventId;
        this.f78471b = eventTime;
        this.f78472c = clientTime;
        this.f78473d = j;
        this.f78474e = j2;
    }

    public static /* synthetic */ C40379eV4 copy$default(C40379eV4 c40379eV4, String str, DateTime dateTime, DateTime dateTime2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40379eV4.f78470a;
        }
        if ((i & 2) != 0) {
            dateTime = c40379eV4.f78471b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c40379eV4.f78472c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            j = c40379eV4.f78473d;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = c40379eV4.f78474e;
        }
        return c40379eV4.m42839a(str, dateTime3, dateTime4, j3, j2);
    }

    /* renamed from: a */
    public final C40379eV4 m42839a(String eventId, DateTime eventTime, DateTime clientTime, long j, long j2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C40379eV4(eventId, eventTime, clientTime, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40379eV4) {
            C40379eV4 c40379eV4 = (C40379eV4) obj;
            return Intrinsics.areEqual(this.f78470a, c40379eV4.f78470a) && Intrinsics.areEqual(this.f78471b, c40379eV4.f78471b) && Intrinsics.areEqual(this.f78472c, c40379eV4.f78472c) && this.f78473d == c40379eV4.f78473d && this.f78474e == c40379eV4.f78474e;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RidePassOwnedPassesDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f78470a), TuplesKt.m28425to("event_time", this.f78471b), TuplesKt.m28425to("client_time", this.f78472c), TuplesKt.m28425to("active_count", Long.valueOf(this.f78473d)), TuplesKt.m28425to("ineligible_count", Long.valueOf(this.f78474e)));
        return mapOf;
    }

    public int hashCode() {
        return (((((((this.f78470a.hashCode() * 31) + this.f78471b.hashCode()) * 31) + this.f78472c.hashCode()) * 31) + Long.hashCode(this.f78473d)) * 31) + Long.hashCode(this.f78474e);
    }

    public String toString() {
        String str = this.f78470a;
        DateTime dateTime = this.f78471b;
        DateTime dateTime2 = this.f78472c;
        long j = this.f78473d;
        long j2 = this.f78474e;
        return "RidePassOwnedPassesDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", activeCount=" + j + ", ineligibleCount=" + j2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40379eV4(String str, DateTime dateTime, DateTime dateTime2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, j, j2);
        String str2;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str2 = uuid;
        } else {
            str2 = str;
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
