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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b+\u0010,JP\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0016¨\u0006-"}, m28432d2 = {"LfG3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "nestId", "rideId", "", "distanceFromNest", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)LfG3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getNestId", "e", "getRideId", "f", "Ljava/lang/Double;", "getDistanceFromNest", "()Ljava/lang/Double;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fG3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40836fG3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f79777a;

    /* renamed from: b */
    public final DateTime f79778b;

    /* renamed from: c */
    public final DateTime f79779c;

    /* renamed from: d */
    public final String f79780d;

    /* renamed from: e */
    public final String f79781e;

    /* renamed from: f */
    public final Double f79782f;

    public C40836fG3(String eventId, DateTime eventTime, DateTime clientTime, String nestId, String str, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        this.f79777a = eventId;
        this.f79778b = eventTime;
        this.f79779c = clientTime;
        this.f79780d = nestId;
        this.f79781e = str;
        this.f79782f = d;
    }

    public static /* synthetic */ C40836fG3 copy$default(C40836fG3 c40836fG3, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40836fG3.f79777a;
        }
        if ((i & 2) != 0) {
            dateTime = c40836fG3.f79778b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c40836fG3.f79779c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c40836fG3.f79780d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = c40836fG3.f79781e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            d = c40836fG3.f79782f;
        }
        return c40836fG3.m41636a(str, dateTime3, dateTime4, str4, str5, d);
    }

    /* renamed from: a */
    public final C40836fG3 m41636a(String eventId, DateTime eventTime, DateTime clientTime, String nestId, String str, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(nestId, "nestId");
        return new C40836fG3(eventId, eventTime, clientTime, nestId, str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40836fG3) {
            C40836fG3 c40836fG3 = (C40836fG3) obj;
            return Intrinsics.areEqual(this.f79777a, c40836fG3.f79777a) && Intrinsics.areEqual(this.f79778b, c40836fG3.f79778b) && Intrinsics.areEqual(this.f79779c, c40836fG3.f79779c) && Intrinsics.areEqual(this.f79780d, c40836fG3.f79780d) && Intrinsics.areEqual(this.f79781e, c40836fG3.f79781e) && Intrinsics.areEqual((Object) this.f79782f, (Object) c40836fG3.f79782f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingNestGetDirectionsTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f79777a), TuplesKt.m28425to("event_time", this.f79778b), TuplesKt.m28425to("client_time", this.f79779c), TuplesKt.m28425to("nest_id", this.f79780d), TuplesKt.m28425to("ride_id", this.f79781e), TuplesKt.m28425to("distance_from_nest", this.f79782f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f79777a.hashCode() * 31) + this.f79778b.hashCode()) * 31) + this.f79779c.hashCode()) * 31) + this.f79780d.hashCode()) * 31;
        String str = this.f79781e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f79782f;
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        String str = this.f79777a;
        DateTime dateTime = this.f79778b;
        DateTime dateTime2 = this.f79779c;
        String str2 = this.f79780d;
        String str3 = this.f79781e;
        Double d = this.f79782f;
        return "ParkingNestGetDirectionsTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", nestId=" + str2 + ", rideId=" + str3 + ", distanceFromNest=" + d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40836fG3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : d);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str4 = str;
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
