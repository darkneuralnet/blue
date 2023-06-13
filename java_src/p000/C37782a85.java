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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b4\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b[\u0010\\Jæ\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\b\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b\n\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010.R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010#\u001a\u0004\bE\u0010%R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u0010%R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010;R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u0010'\u001a\u0004\bO\u0010)R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bP\u0010-\u001a\u0004\b\u0019\u0010.R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\"\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010 0U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010%¨\u0006]"}, m28432d2 = {"La85;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isBluetoothBird", "birdIsBluetooth", "isCellularBird", "birdIsCellular", "birdModel", "currency", "", "minimumRidePrice", "minutePrice", "minutesIncluded", "", "operationTime", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "isPrimaryRide", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;)La85;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getBirdIsBluetooth", "f", "g", "getBirdIsCellular", "h", "getBirdModel", "i", "getCurrency", "j", "J", "getMinimumRidePrice", "()J", "k", "getMinutePrice", "l", "getMinutesIncluded", "m", "D", "getOperationTime", "()D", "n", "getPartnerId", "o", "getRideId", "p", "Z", "getHasSalesTax", "()Z", "q", "getStartPrice", "r", "getStartTime", "s", "t", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: a85  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37782a85 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f49865a;

    /* renamed from: b */
    public final DateTime f49866b;

    /* renamed from: c */
    public final DateTime f49867c;

    /* renamed from: d */
    public final Boolean f49868d;

    /* renamed from: e */
    public final Boolean f49869e;

    /* renamed from: f */
    public final Boolean f49870f;

    /* renamed from: g */
    public final Boolean f49871g;

    /* renamed from: h */
    public final String f49872h;

    /* renamed from: i */
    public final String f49873i;

    /* renamed from: j */
    public final long f49874j;

    /* renamed from: k */
    public final long f49875k;

    /* renamed from: l */
    public final long f49876l;

    /* renamed from: m */
    public final double f49877m;

    /* renamed from: n */
    public final String f49878n;

    /* renamed from: o */
    public final String f49879o;

    /* renamed from: p */
    public final boolean f49880p;

    /* renamed from: q */
    public final long f49881q;

    /* renamed from: r */
    public final DateTime f49882r;

    /* renamed from: s */
    public final Boolean f49883s;

    /* renamed from: t */
    public final Long f49884t;

    public C37782a85(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool5, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f49865a = eventId;
        this.f49866b = eventTime;
        this.f49867c = clientTime;
        this.f49868d = bool;
        this.f49869e = bool2;
        this.f49870f = bool3;
        this.f49871g = bool4;
        this.f49872h = birdModel;
        this.f49873i = currency;
        this.f49874j = j;
        this.f49875k = j2;
        this.f49876l = j3;
        this.f49877m = d;
        this.f49878n = str;
        this.f49879o = rideId;
        this.f49880p = z;
        this.f49881q = j4;
        this.f49882r = startTime;
        this.f49883s = bool5;
        this.f49884t = l;
    }

    /* renamed from: a */
    public final C37782a85 m71861a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool5, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new C37782a85(eventId, eventTime, clientTime, bool, bool2, bool3, bool4, birdModel, currency, j, j2, j3, d, str, rideId, z, j4, startTime, bool5, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37782a85) {
            C37782a85 c37782a85 = (C37782a85) obj;
            return Intrinsics.areEqual(this.f49865a, c37782a85.f49865a) && Intrinsics.areEqual(this.f49866b, c37782a85.f49866b) && Intrinsics.areEqual(this.f49867c, c37782a85.f49867c) && Intrinsics.areEqual(this.f49868d, c37782a85.f49868d) && Intrinsics.areEqual(this.f49869e, c37782a85.f49869e) && Intrinsics.areEqual(this.f49870f, c37782a85.f49870f) && Intrinsics.areEqual(this.f49871g, c37782a85.f49871g) && Intrinsics.areEqual(this.f49872h, c37782a85.f49872h) && Intrinsics.areEqual(this.f49873i, c37782a85.f49873i) && this.f49874j == c37782a85.f49874j && this.f49875k == c37782a85.f49875k && this.f49876l == c37782a85.f49876l && Double.compare(this.f49877m, c37782a85.f49877m) == 0 && Intrinsics.areEqual(this.f49878n, c37782a85.f49878n) && Intrinsics.areEqual(this.f49879o, c37782a85.f49879o) && this.f49880p == c37782a85.f49880p && this.f49881q == c37782a85.f49881q && Intrinsics.areEqual(this.f49882r, c37782a85.f49882r) && Intrinsics.areEqual(this.f49883s, c37782a85.f49883s) && Intrinsics.areEqual(this.f49884t, c37782a85.f49884t);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideUnlocked";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f49865a), TuplesKt.m28425to("event_time", this.f49866b), TuplesKt.m28425to("client_time", this.f49867c), TuplesKt.m28425to("is_bluetooth_bird", this.f49868d), TuplesKt.m28425to("bird_is_bluetooth", this.f49869e), TuplesKt.m28425to("is_cellular_bird", this.f49870f), TuplesKt.m28425to("bird_is_cellular", this.f49871g), TuplesKt.m28425to("bird_model", this.f49872h), TuplesKt.m28425to("currency", this.f49873i), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f49874j)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f49875k)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f49876l)), TuplesKt.m28425to("operation_time", Double.valueOf(this.f49877m)), TuplesKt.m28425to("partner_id", this.f49878n), TuplesKt.m28425to("ride_id", this.f49879o), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f49880p)), TuplesKt.m28425to("start_price", Long.valueOf(this.f49881q)), TuplesKt.m28425to("start_time", this.f49882r), TuplesKt.m28425to("is_primary_ride", this.f49883s), TuplesKt.m28425to("concurrent_ride_count", this.f49884t));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f49865a.hashCode() * 31) + this.f49866b.hashCode()) * 31) + this.f49867c.hashCode()) * 31;
        Boolean bool = this.f49868d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f49869e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f49870f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f49871g;
        int hashCode5 = (((((((((((((hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.f49872h.hashCode()) * 31) + this.f49873i.hashCode()) * 31) + Long.hashCode(this.f49874j)) * 31) + Long.hashCode(this.f49875k)) * 31) + Long.hashCode(this.f49876l)) * 31) + Double.hashCode(this.f49877m)) * 31;
        String str = this.f49878n;
        int hashCode6 = (((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.f49879o.hashCode()) * 31;
        boolean z = this.f49880p;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode7 = (((((hashCode6 + i) * 31) + Long.hashCode(this.f49881q)) * 31) + this.f49882r.hashCode()) * 31;
        Boolean bool5 = this.f49883s;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l = this.f49884t;
        return hashCode8 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f49865a;
        DateTime dateTime = this.f49866b;
        DateTime dateTime2 = this.f49867c;
        Boolean bool = this.f49868d;
        Boolean bool2 = this.f49869e;
        Boolean bool3 = this.f49870f;
        Boolean bool4 = this.f49871g;
        String str2 = this.f49872h;
        String str3 = this.f49873i;
        long j = this.f49874j;
        long j2 = this.f49875k;
        long j3 = this.f49876l;
        double d = this.f49877m;
        String str4 = this.f49878n;
        String str5 = this.f49879o;
        boolean z = this.f49880p;
        long j4 = this.f49881q;
        DateTime dateTime3 = this.f49882r;
        Boolean bool5 = this.f49883s;
        Long l = this.f49884t;
        return "RideUnlocked(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isBluetoothBird=" + bool + ", birdIsBluetooth=" + bool2 + ", isCellularBird=" + bool3 + ", birdIsCellular=" + bool4 + ", birdModel=" + str2 + ", currency=" + str3 + ", minimumRidePrice=" + j + ", minutePrice=" + j2 + ", minutesIncluded=" + j3 + ", operationTime=" + d + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z + ", startPrice=" + j4 + ", startTime=" + dateTime3 + ", isPrimaryRide=" + bool5 + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C37782a85(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, long j, long j2, long j3, double d, String str4, String str5, boolean z, long j4, DateTime dateTime3, Boolean bool5, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, str2, str3, j, j2, j3, d, (i & 8192) != 0 ? null : str4, str5, z, j4, dateTime3, (262144 & i) != 0 ? null : bool5, (i & 524288) != 0 ? null : l);
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
