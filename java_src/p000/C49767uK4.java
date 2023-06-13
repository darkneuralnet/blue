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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010)JD\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0015¨\u0006*"}, m28432d2 = {"LuK4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "reservationId", "", "duration", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;)LuK4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getReservationId", "e", "Ljava/lang/Double;", "getDuration", "()Ljava/lang/Double;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uK4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49767uK4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f112206a;

    /* renamed from: b */
    public final DateTime f112207b;

    /* renamed from: c */
    public final DateTime f112208c;

    /* renamed from: d */
    public final String f112209d;

    /* renamed from: e */
    public final Double f112210e;

    public C49767uK4(String eventId, DateTime eventTime, DateTime clientTime, String reservationId, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        this.f112206a = eventId;
        this.f112207b = eventTime;
        this.f112208c = clientTime;
        this.f112209d = reservationId;
        this.f112210e = d;
    }

    public static /* synthetic */ C49767uK4 copy$default(C49767uK4 c49767uK4, String str, DateTime dateTime, DateTime dateTime2, String str2, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49767uK4.f112206a;
        }
        if ((i & 2) != 0) {
            dateTime = c49767uK4.f112207b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c49767uK4.f112208c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c49767uK4.f112209d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            d = c49767uK4.f112210e;
        }
        return c49767uK4.m10453a(str, dateTime3, dateTime4, str3, d);
    }

    /* renamed from: a */
    public final C49767uK4 m10453a(String eventId, DateTime eventTime, DateTime clientTime, String reservationId, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        return new C49767uK4(eventId, eventTime, clientTime, reservationId, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49767uK4) {
            C49767uK4 c49767uK4 = (C49767uK4) obj;
            return Intrinsics.areEqual(this.f112206a, c49767uK4.f112206a) && Intrinsics.areEqual(this.f112207b, c49767uK4.f112207b) && Intrinsics.areEqual(this.f112208c, c49767uK4.f112208c) && Intrinsics.areEqual(this.f112209d, c49767uK4.f112209d) && Intrinsics.areEqual((Object) this.f112210e, (Object) c49767uK4.f112210e);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ReservationCancelButtonTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f112206a), TuplesKt.m28425to("event_time", this.f112207b), TuplesKt.m28425to("client_time", this.f112208c), TuplesKt.m28425to("reservation_id", this.f112209d), TuplesKt.m28425to("duration", this.f112210e));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f112206a.hashCode() * 31) + this.f112207b.hashCode()) * 31) + this.f112208c.hashCode()) * 31) + this.f112209d.hashCode()) * 31;
        Double d = this.f112210e;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        String str = this.f112206a;
        DateTime dateTime = this.f112207b;
        DateTime dateTime2 = this.f112208c;
        String str2 = this.f112209d;
        Double d = this.f112210e;
        return "ReservationCancelButtonTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", reservationId=" + str2 + ", duration=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49767uK4(String str, DateTime dateTime, DateTime dateTime2, String str2, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, (i & 16) != 0 ? null : d);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str3 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
