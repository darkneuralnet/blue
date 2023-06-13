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
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b2\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bW\u0010XJÎ\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010!\u001a\u0004\bA\u0010#R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010!\u001a\u0004\bC\u0010#R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u00107R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\b\u0017\u0010-R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010#¨\u0006Y"}, m28432d2 = {"LtR4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "minimumRidePrice", "minutePrice", "minutesIncluded", "", "operationTime", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "isPrimaryRide", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;)LtR4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "getBirdIsBluetooth", "()Ljava/lang/Boolean;", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getMinimumRidePrice", "()J", "i", "getMinutePrice", "j", "getMinutesIncluded", "k", "D", "getOperationTime", "()D", "l", "getPartnerId", "m", "getRideId", "n", "Z", "getHasSalesTax", "()Z", "o", "getStartPrice", "p", "getStartTime", "q", "r", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tR4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49237tR4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f110462a;

    /* renamed from: b */
    public final DateTime f110463b;

    /* renamed from: c */
    public final DateTime f110464c;

    /* renamed from: d */
    public final Boolean f110465d;

    /* renamed from: e */
    public final Boolean f110466e;

    /* renamed from: f */
    public final String f110467f;

    /* renamed from: g */
    public final String f110468g;

    /* renamed from: h */
    public final long f110469h;

    /* renamed from: i */
    public final long f110470i;

    /* renamed from: j */
    public final long f110471j;

    /* renamed from: k */
    public final double f110472k;

    /* renamed from: l */
    public final String f110473l;

    /* renamed from: m */
    public final String f110474m;

    /* renamed from: n */
    public final boolean f110475n;

    /* renamed from: o */
    public final long f110476o;

    /* renamed from: p */
    public final DateTime f110477p;

    /* renamed from: q */
    public final Boolean f110478q;

    /* renamed from: r */
    public final Long f110479r;

    public C49237tR4(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool3, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f110462a = eventId;
        this.f110463b = eventTime;
        this.f110464c = clientTime;
        this.f110465d = bool;
        this.f110466e = bool2;
        this.f110467f = birdModel;
        this.f110468g = currency;
        this.f110469h = j;
        this.f110470i = j2;
        this.f110471j = j3;
        this.f110472k = d;
        this.f110473l = str;
        this.f110474m = rideId;
        this.f110475n = z;
        this.f110476o = j4;
        this.f110477p = startTime;
        this.f110478q = bool3;
        this.f110479r = l;
    }

    /* renamed from: a */
    public final C49237tR4 m12378a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool3, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new C49237tR4(eventId, eventTime, clientTime, bool, bool2, birdModel, currency, j, j2, j3, d, str, rideId, z, j4, startTime, bool3, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49237tR4) {
            C49237tR4 c49237tR4 = (C49237tR4) obj;
            return Intrinsics.areEqual(this.f110462a, c49237tR4.f110462a) && Intrinsics.areEqual(this.f110463b, c49237tR4.f110463b) && Intrinsics.areEqual(this.f110464c, c49237tR4.f110464c) && Intrinsics.areEqual(this.f110465d, c49237tR4.f110465d) && Intrinsics.areEqual(this.f110466e, c49237tR4.f110466e) && Intrinsics.areEqual(this.f110467f, c49237tR4.f110467f) && Intrinsics.areEqual(this.f110468g, c49237tR4.f110468g) && this.f110469h == c49237tR4.f110469h && this.f110470i == c49237tR4.f110470i && this.f110471j == c49237tR4.f110471j && Double.compare(this.f110472k, c49237tR4.f110472k) == 0 && Intrinsics.areEqual(this.f110473l, c49237tR4.f110473l) && Intrinsics.areEqual(this.f110474m, c49237tR4.f110474m) && this.f110475n == c49237tR4.f110475n && this.f110476o == c49237tR4.f110476o && Intrinsics.areEqual(this.f110477p, c49237tR4.f110477p) && Intrinsics.areEqual(this.f110478q, c49237tR4.f110478q) && Intrinsics.areEqual(this.f110479r, c49237tR4.f110479r);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideFirstUnlockCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f110462a), TuplesKt.m28425to("event_time", this.f110463b), TuplesKt.m28425to("client_time", this.f110464c), TuplesKt.m28425to("bird_is_bluetooth", this.f110465d), TuplesKt.m28425to("bird_is_cellular", this.f110466e), TuplesKt.m28425to("bird_model", this.f110467f), TuplesKt.m28425to("currency", this.f110468g), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f110469h)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f110470i)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f110471j)), TuplesKt.m28425to("operation_time", Double.valueOf(this.f110472k)), TuplesKt.m28425to("partner_id", this.f110473l), TuplesKt.m28425to("ride_id", this.f110474m), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f110475n)), TuplesKt.m28425to("start_price", Long.valueOf(this.f110476o)), TuplesKt.m28425to("start_time", this.f110477p), TuplesKt.m28425to("is_primary_ride", this.f110478q), TuplesKt.m28425to("concurrent_ride_count", this.f110479r));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f110462a.hashCode() * 31) + this.f110463b.hashCode()) * 31) + this.f110464c.hashCode()) * 31;
        Boolean bool = this.f110465d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f110466e;
        int hashCode3 = (((((((((((((hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.f110467f.hashCode()) * 31) + this.f110468g.hashCode()) * 31) + Long.hashCode(this.f110469h)) * 31) + Long.hashCode(this.f110470i)) * 31) + Long.hashCode(this.f110471j)) * 31) + Double.hashCode(this.f110472k)) * 31;
        String str = this.f110473l;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f110474m.hashCode()) * 31;
        boolean z = this.f110475n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode5 = (((((hashCode4 + i) * 31) + Long.hashCode(this.f110476o)) * 31) + this.f110477p.hashCode()) * 31;
        Boolean bool3 = this.f110478q;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.f110479r;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f110462a;
        DateTime dateTime = this.f110463b;
        DateTime dateTime2 = this.f110464c;
        Boolean bool = this.f110465d;
        Boolean bool2 = this.f110466e;
        String str2 = this.f110467f;
        String str3 = this.f110468g;
        long j = this.f110469h;
        long j2 = this.f110470i;
        long j3 = this.f110471j;
        double d = this.f110472k;
        String str4 = this.f110473l;
        String str5 = this.f110474m;
        boolean z = this.f110475n;
        long j4 = this.f110476o;
        DateTime dateTime3 = this.f110477p;
        Boolean bool3 = this.f110478q;
        Long l = this.f110479r;
        return "RideFirstUnlockCompleted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + bool + ", birdIsCellular=" + bool2 + ", birdModel=" + str2 + ", currency=" + str3 + ", minimumRidePrice=" + j + ", minutePrice=" + j2 + ", minutesIncluded=" + j3 + ", operationTime=" + d + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z + ", startPrice=" + j4 + ", startTime=" + dateTime3 + ", isPrimaryRide=" + bool3 + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49237tR4(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, String str2, String str3, long j, long j2, long j3, double d, String str4, String str5, boolean z, long j4, DateTime dateTime3, Boolean bool3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, str2, str3, j, j2, j3, d, (i & 2048) != 0 ? null : str4, str5, z, j4, dateTime3, (65536 & i) != 0 ? null : bool3, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : l);
        String str6;
        DateTime dateTime4;
        DateTime dateTime5;
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
            dateTime4 = now;
        } else {
            dateTime4 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime5 = now2;
        } else {
            dateTime5 = dateTime2;
        }
    }
}
