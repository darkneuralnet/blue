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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b5\u00106Jh\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u00067"}, m28432d2 = {"LwK4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "reservationId", "", "duration", "", "price", "currency", "", "refunded", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)LwK4;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getReservationId", "e", "Ljava/lang/Double;", "getDuration", "()Ljava/lang/Double;", "f", "Ljava/lang/Integer;", "getPrice", "()Ljava/lang/Integer;", "g", "getCurrency", "h", "Ljava/lang/Boolean;", "getRefunded", "()Ljava/lang/Boolean;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wK4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50952wK4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f115812a;

    /* renamed from: b */
    public final DateTime f115813b;

    /* renamed from: c */
    public final DateTime f115814c;

    /* renamed from: d */
    public final String f115815d;

    /* renamed from: e */
    public final Double f115816e;

    /* renamed from: f */
    public final Integer f115817f;

    /* renamed from: g */
    public final String f115818g;

    /* renamed from: h */
    public final Boolean f115819h;

    public C50952wK4(String eventId, DateTime eventTime, DateTime clientTime, String reservationId, Double d, Integer num, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        this.f115812a = eventId;
        this.f115813b = eventTime;
        this.f115814c = clientTime;
        this.f115815d = reservationId;
        this.f115816e = d;
        this.f115817f = num;
        this.f115818g = str;
        this.f115819h = bool;
    }

    /* renamed from: a */
    public final C50952wK4 m6990a(String eventId, DateTime eventTime, DateTime clientTime, String reservationId, Double d, Integer num, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        return new C50952wK4(eventId, eventTime, clientTime, reservationId, d, num, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50952wK4) {
            C50952wK4 c50952wK4 = (C50952wK4) obj;
            return Intrinsics.areEqual(this.f115812a, c50952wK4.f115812a) && Intrinsics.areEqual(this.f115813b, c50952wK4.f115813b) && Intrinsics.areEqual(this.f115814c, c50952wK4.f115814c) && Intrinsics.areEqual(this.f115815d, c50952wK4.f115815d) && Intrinsics.areEqual((Object) this.f115816e, (Object) c50952wK4.f115816e) && Intrinsics.areEqual(this.f115817f, c50952wK4.f115817f) && Intrinsics.areEqual(this.f115818g, c50952wK4.f115818g) && Intrinsics.areEqual(this.f115819h, c50952wK4.f115819h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ReservationCanceled";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f115812a), TuplesKt.m28425to("event_time", this.f115813b), TuplesKt.m28425to("client_time", this.f115814c), TuplesKt.m28425to("reservation_id", this.f115815d), TuplesKt.m28425to("duration", this.f115816e), TuplesKt.m28425to("price", this.f115817f), TuplesKt.m28425to("currency", this.f115818g), TuplesKt.m28425to("refunded", this.f115819h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f115812a.hashCode() * 31) + this.f115813b.hashCode()) * 31) + this.f115814c.hashCode()) * 31) + this.f115815d.hashCode()) * 31;
        Double d = this.f115816e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f115817f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f115818g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f115819h;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.f115812a;
        DateTime dateTime = this.f115813b;
        DateTime dateTime2 = this.f115814c;
        String str2 = this.f115815d;
        Double d = this.f115816e;
        Integer num = this.f115817f;
        String str3 = this.f115818g;
        Boolean bool = this.f115819h;
        return "ReservationCanceled(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", reservationId=" + str2 + ", duration=" + d + ", price=" + num + ", currency=" + str3 + ", refunded=" + bool + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50952wK4(String str, DateTime dateTime, DateTime dateTime2, String str2, Double d, Integer num, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i & 16) != 0 ? null : d, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : bool);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
