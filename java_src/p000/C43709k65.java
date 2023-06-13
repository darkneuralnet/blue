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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bY\u0010ZJÖ\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010$R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010.R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010&\u001a\u0004\bJ\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\b\u0017\u0010MR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\b\u0018\u0010MR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\"\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001f0S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010$¨\u0006["}, m28432d2 = {"Lk65;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "minimumRidePrice", "minutePrice", "minutesIncluded", "", "operationTime", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "isInRegistration", "isPrimaryRide", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)Lk65;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getBirdIsBluetooth", "()Z", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getMinimumRidePrice", "()J", "i", "getMinutePrice", "j", "getMinutesIncluded", "k", "D", "getOperationTime", "()D", "l", "getPartnerId", "m", "getRideId", "n", "getHasSalesTax", "o", "getStartPrice", "p", "getStartTime", "q", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "r", "s", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k65  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43709k65 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f93910a;

    /* renamed from: b */
    public final DateTime f93911b;

    /* renamed from: c */
    public final DateTime f93912c;

    /* renamed from: d */
    public final boolean f93913d;

    /* renamed from: e */
    public final boolean f93914e;

    /* renamed from: f */
    public final String f93915f;

    /* renamed from: g */
    public final String f93916g;

    /* renamed from: h */
    public final long f93917h;

    /* renamed from: i */
    public final long f93918i;

    /* renamed from: j */
    public final long f93919j;

    /* renamed from: k */
    public final double f93920k;

    /* renamed from: l */
    public final String f93921l;

    /* renamed from: m */
    public final String f93922m;

    /* renamed from: n */
    public final boolean f93923n;

    /* renamed from: o */
    public final long f93924o;

    /* renamed from: p */
    public final DateTime f93925p;

    /* renamed from: q */
    public final Boolean f93926q;

    /* renamed from: r */
    public final Boolean f93927r;

    /* renamed from: s */
    public final Long f93928s;

    public C43709k65(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z3, long j4, DateTime startTime, Boolean bool, Boolean bool2, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f93910a = eventId;
        this.f93911b = eventTime;
        this.f93912c = clientTime;
        this.f93913d = z;
        this.f93914e = z2;
        this.f93915f = birdModel;
        this.f93916g = currency;
        this.f93917h = j;
        this.f93918i = j2;
        this.f93919j = j3;
        this.f93920k = d;
        this.f93921l = str;
        this.f93922m = rideId;
        this.f93923n = z3;
        this.f93924o = j4;
        this.f93925p = startTime;
        this.f93926q = bool;
        this.f93927r = bool2;
        this.f93928s = l;
    }

    /* renamed from: a */
    public final C43709k65 m29288a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z3, long j4, DateTime startTime, Boolean bool, Boolean bool2, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new C43709k65(eventId, eventTime, clientTime, z, z2, birdModel, currency, j, j2, j3, d, str, rideId, z3, j4, startTime, bool, bool2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43709k65) {
            C43709k65 c43709k65 = (C43709k65) obj;
            return Intrinsics.areEqual(this.f93910a, c43709k65.f93910a) && Intrinsics.areEqual(this.f93911b, c43709k65.f93911b) && Intrinsics.areEqual(this.f93912c, c43709k65.f93912c) && this.f93913d == c43709k65.f93913d && this.f93914e == c43709k65.f93914e && Intrinsics.areEqual(this.f93915f, c43709k65.f93915f) && Intrinsics.areEqual(this.f93916g, c43709k65.f93916g) && this.f93917h == c43709k65.f93917h && this.f93918i == c43709k65.f93918i && this.f93919j == c43709k65.f93919j && Double.compare(this.f93920k, c43709k65.f93920k) == 0 && Intrinsics.areEqual(this.f93921l, c43709k65.f93921l) && Intrinsics.areEqual(this.f93922m, c43709k65.f93922m) && this.f93923n == c43709k65.f93923n && this.f93924o == c43709k65.f93924o && Intrinsics.areEqual(this.f93925p, c43709k65.f93925p) && Intrinsics.areEqual(this.f93926q, c43709k65.f93926q) && Intrinsics.areEqual(this.f93927r, c43709k65.f93927r) && Intrinsics.areEqual(this.f93928s, c43709k65.f93928s);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideStarted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f93910a), TuplesKt.m28425to("event_time", this.f93911b), TuplesKt.m28425to("client_time", this.f93912c), TuplesKt.m28425to("bird_is_bluetooth", Boolean.valueOf(this.f93913d)), TuplesKt.m28425to("bird_is_cellular", Boolean.valueOf(this.f93914e)), TuplesKt.m28425to("bird_model", this.f93915f), TuplesKt.m28425to("currency", this.f93916g), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f93917h)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f93918i)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f93919j)), TuplesKt.m28425to("operation_time", Double.valueOf(this.f93920k)), TuplesKt.m28425to("partner_id", this.f93921l), TuplesKt.m28425to("ride_id", this.f93922m), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f93923n)), TuplesKt.m28425to("start_price", Long.valueOf(this.f93924o)), TuplesKt.m28425to("start_time", this.f93925p), TuplesKt.m28425to("is_in_registration", this.f93926q), TuplesKt.m28425to("is_primary_ride", this.f93927r), TuplesKt.m28425to("concurrent_ride_count", this.f93928s));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f93910a.hashCode() * 31) + this.f93911b.hashCode()) * 31) + this.f93912c.hashCode()) * 31;
        boolean z = this.f93913d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f93914e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((((((((((((i2 + i3) * 31) + this.f93915f.hashCode()) * 31) + this.f93916g.hashCode()) * 31) + Long.hashCode(this.f93917h)) * 31) + Long.hashCode(this.f93918i)) * 31) + Long.hashCode(this.f93919j)) * 31) + Double.hashCode(this.f93920k)) * 31;
        String str = this.f93921l;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f93922m.hashCode()) * 31;
        boolean z3 = this.f93923n;
        int hashCode4 = (((((hashCode3 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + Long.hashCode(this.f93924o)) * 31) + this.f93925p.hashCode()) * 31;
        Boolean bool = this.f93926q;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f93927r;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.f93928s;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f93910a;
        DateTime dateTime = this.f93911b;
        DateTime dateTime2 = this.f93912c;
        boolean z = this.f93913d;
        boolean z2 = this.f93914e;
        String str2 = this.f93915f;
        String str3 = this.f93916g;
        long j = this.f93917h;
        long j2 = this.f93918i;
        long j3 = this.f93919j;
        double d = this.f93920k;
        String str4 = this.f93921l;
        String str5 = this.f93922m;
        boolean z3 = this.f93923n;
        long j4 = this.f93924o;
        DateTime dateTime3 = this.f93925p;
        Boolean bool = this.f93926q;
        Boolean bool2 = this.f93927r;
        Long l = this.f93928s;
        return "RideStarted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + z + ", birdIsCellular=" + z2 + ", birdModel=" + str2 + ", currency=" + str3 + ", minimumRidePrice=" + j + ", minutePrice=" + j2 + ", minutesIncluded=" + j3 + ", operationTime=" + d + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z3 + ", startPrice=" + j4 + ", startTime=" + dateTime3 + ", isInRegistration=" + bool + ", isPrimaryRide=" + bool2 + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43709k65(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, String str2, String str3, long j, long j2, long j3, double d, String str4, String str5, boolean z3, long j4, DateTime dateTime3, Boolean bool, Boolean bool2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, z2, str2, str3, j, j2, j3, d, (i & 2048) != 0 ? null : str4, str5, z3, j4, dateTime3, (65536 & i) != 0 ? null : bool, (131072 & i) != 0 ? null : bool2, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : l);
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
