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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b/\u00100J^\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\n\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017¨\u00061"}, m28432d2 = {"Lp95;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "nestId", "rideId", "", "isPrimaryRide", "", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lp95;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getNestId", "e", "getRideId", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: p95  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46704p95 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f103211a;

    /* renamed from: b */
    public final DateTime f103212b;

    /* renamed from: c */
    public final DateTime f103213c;

    /* renamed from: d */
    public final String f103214d;

    /* renamed from: e */
    public final String f103215e;

    /* renamed from: f */
    public final Boolean f103216f;

    /* renamed from: g */
    public final Long f103217g;

    public C46704p95() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ C46704p95 copy$default(C46704p95 c46704p95, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Boolean bool, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c46704p95.f103211a;
        }
        if ((i & 2) != 0) {
            dateTime = c46704p95.f103212b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c46704p95.f103213c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c46704p95.f103214d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = c46704p95.f103215e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            bool = c46704p95.f103216f;
        }
        Boolean bool2 = bool;
        if ((i & 64) != 0) {
            l = c46704p95.f103217g;
        }
        return c46704p95.m19875a(str, dateTime3, dateTime4, str4, str5, bool2, l);
    }

    /* renamed from: a */
    public final C46704p95 m19875a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C46704p95(eventId, eventTime, clientTime, str, str2, bool, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46704p95) {
            C46704p95 c46704p95 = (C46704p95) obj;
            return Intrinsics.areEqual(this.f103211a, c46704p95.f103211a) && Intrinsics.areEqual(this.f103212b, c46704p95.f103212b) && Intrinsics.areEqual(this.f103213c, c46704p95.f103213c) && Intrinsics.areEqual(this.f103214d, c46704p95.f103214d) && Intrinsics.areEqual(this.f103215e, c46704p95.f103215e) && Intrinsics.areEqual(this.f103216f, c46704p95.f103216f) && Intrinsics.areEqual(this.f103217g, c46704p95.f103217g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderExitedParkingNest";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f103211a), TuplesKt.m28425to("event_time", this.f103212b), TuplesKt.m28425to("client_time", this.f103213c), TuplesKt.m28425to("nest_id", this.f103214d), TuplesKt.m28425to("ride_id", this.f103215e), TuplesKt.m28425to("is_primary_ride", this.f103216f), TuplesKt.m28425to("concurrent_ride_count", this.f103217g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f103211a.hashCode() * 31) + this.f103212b.hashCode()) * 31) + this.f103213c.hashCode()) * 31;
        String str = this.f103214d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f103215e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f103216f;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.f103217g;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f103211a;
        DateTime dateTime = this.f103212b;
        DateTime dateTime2 = this.f103213c;
        String str2 = this.f103214d;
        String str3 = this.f103215e;
        Boolean bool = this.f103216f;
        Long l = this.f103217g;
        return "RiderExitedParkingNest(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", nestId=" + str2 + ", rideId=" + str3 + ", isPrimaryRide=" + bool + ", concurrentRideCount=" + l + ")";
    }

    public C46704p95(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, Boolean bool, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f103211a = eventId;
        this.f103212b = eventTime;
        this.f103213c = clientTime;
        this.f103214d = str;
        this.f103215e = str2;
        this.f103216f = bool;
        this.f103217g = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C46704p95(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Boolean bool, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1, r3, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) == 0 ? l : null);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str4 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str4, "randomUUID().toString()");
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        } else {
            dateTime4 = dateTime2;
        }
    }
}
