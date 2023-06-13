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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b3\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\bY\u0010ZJØ\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010\"\u001a\u0004\bD\u0010$R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010&\u001a\u0004\bL\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bM\u0010,\u001a\u0004\b\u0017\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010F\u001a\u0004\b\u0019\u0010HR\"\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001f0S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010$¨\u0006["}, m28432d2 = {"LuR4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "minimumRidePrice", "minutePrice", "minutesIncluded", "", "operationTime", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "isPrimaryRide", "concurrentRideCount", "isNetworkConnectivityError", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;Z)LuR4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "getBirdIsBluetooth", "()Ljava/lang/Boolean;", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getMinimumRidePrice", "()J", "i", "getMinutePrice", "j", "getMinutesIncluded", "k", "D", "getOperationTime", "()D", "l", "getPartnerId", "m", "getRideId", "n", "Z", "getHasSalesTax", "()Z", "o", "getStartPrice", "p", "getStartTime", "q", "r", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "s", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JJJDLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Long;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uR4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49830uR4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f112356a;

    /* renamed from: b */
    public final DateTime f112357b;

    /* renamed from: c */
    public final DateTime f112358c;

    /* renamed from: d */
    public final Boolean f112359d;

    /* renamed from: e */
    public final Boolean f112360e;

    /* renamed from: f */
    public final String f112361f;

    /* renamed from: g */
    public final String f112362g;

    /* renamed from: h */
    public final long f112363h;

    /* renamed from: i */
    public final long f112364i;

    /* renamed from: j */
    public final long f112365j;

    /* renamed from: k */
    public final double f112366k;

    /* renamed from: l */
    public final String f112367l;

    /* renamed from: m */
    public final String f112368m;

    /* renamed from: n */
    public final boolean f112369n;

    /* renamed from: o */
    public final long f112370o;

    /* renamed from: p */
    public final DateTime f112371p;

    /* renamed from: q */
    public final Boolean f112372q;

    /* renamed from: r */
    public final Long f112373r;

    /* renamed from: s */
    public final boolean f112374s;

    public C49830uR4(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool3, Long l, boolean z2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f112356a = eventId;
        this.f112357b = eventTime;
        this.f112358c = clientTime;
        this.f112359d = bool;
        this.f112360e = bool2;
        this.f112361f = birdModel;
        this.f112362g = currency;
        this.f112363h = j;
        this.f112364i = j2;
        this.f112365j = j3;
        this.f112366k = d;
        this.f112367l = str;
        this.f112368m = rideId;
        this.f112369n = z;
        this.f112370o = j4;
        this.f112371p = startTime;
        this.f112372q = bool3;
        this.f112373r = l;
        this.f112374s = z2;
    }

    /* renamed from: a */
    public final C49830uR4 m10280a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, String birdModel, String currency, long j, long j2, long j3, double d, String str, String rideId, boolean z, long j4, DateTime startTime, Boolean bool3, Long l, boolean z2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new C49830uR4(eventId, eventTime, clientTime, bool, bool2, birdModel, currency, j, j2, j3, d, str, rideId, z, j4, startTime, bool3, l, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49830uR4) {
            C49830uR4 c49830uR4 = (C49830uR4) obj;
            return Intrinsics.areEqual(this.f112356a, c49830uR4.f112356a) && Intrinsics.areEqual(this.f112357b, c49830uR4.f112357b) && Intrinsics.areEqual(this.f112358c, c49830uR4.f112358c) && Intrinsics.areEqual(this.f112359d, c49830uR4.f112359d) && Intrinsics.areEqual(this.f112360e, c49830uR4.f112360e) && Intrinsics.areEqual(this.f112361f, c49830uR4.f112361f) && Intrinsics.areEqual(this.f112362g, c49830uR4.f112362g) && this.f112363h == c49830uR4.f112363h && this.f112364i == c49830uR4.f112364i && this.f112365j == c49830uR4.f112365j && Double.compare(this.f112366k, c49830uR4.f112366k) == 0 && Intrinsics.areEqual(this.f112367l, c49830uR4.f112367l) && Intrinsics.areEqual(this.f112368m, c49830uR4.f112368m) && this.f112369n == c49830uR4.f112369n && this.f112370o == c49830uR4.f112370o && Intrinsics.areEqual(this.f112371p, c49830uR4.f112371p) && Intrinsics.areEqual(this.f112372q, c49830uR4.f112372q) && Intrinsics.areEqual(this.f112373r, c49830uR4.f112373r) && this.f112374s == c49830uR4.f112374s;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideFirstUnlockFailed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f112356a), TuplesKt.m28425to("event_time", this.f112357b), TuplesKt.m28425to("client_time", this.f112358c), TuplesKt.m28425to("bird_is_bluetooth", this.f112359d), TuplesKt.m28425to("bird_is_cellular", this.f112360e), TuplesKt.m28425to("bird_model", this.f112361f), TuplesKt.m28425to("currency", this.f112362g), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f112363h)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f112364i)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f112365j)), TuplesKt.m28425to("operation_time", Double.valueOf(this.f112366k)), TuplesKt.m28425to("partner_id", this.f112367l), TuplesKt.m28425to("ride_id", this.f112368m), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f112369n)), TuplesKt.m28425to("start_price", Long.valueOf(this.f112370o)), TuplesKt.m28425to("start_time", this.f112371p), TuplesKt.m28425to("is_primary_ride", this.f112372q), TuplesKt.m28425to("concurrent_ride_count", this.f112373r), TuplesKt.m28425to("is_network_connectivity_error", Boolean.valueOf(this.f112374s)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f112356a.hashCode() * 31) + this.f112357b.hashCode()) * 31) + this.f112358c.hashCode()) * 31;
        Boolean bool = this.f112359d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f112360e;
        int hashCode3 = (((((((((((((hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.f112361f.hashCode()) * 31) + this.f112362g.hashCode()) * 31) + Long.hashCode(this.f112363h)) * 31) + Long.hashCode(this.f112364i)) * 31) + Long.hashCode(this.f112365j)) * 31) + Double.hashCode(this.f112366k)) * 31;
        String str = this.f112367l;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f112368m.hashCode()) * 31;
        boolean z = this.f112369n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode5 = (((((hashCode4 + i) * 31) + Long.hashCode(this.f112370o)) * 31) + this.f112371p.hashCode()) * 31;
        Boolean bool3 = this.f112372q;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.f112373r;
        int hashCode7 = (hashCode6 + (l != null ? l.hashCode() : 0)) * 31;
        boolean z2 = this.f112374s;
        return hashCode7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f112356a;
        DateTime dateTime = this.f112357b;
        DateTime dateTime2 = this.f112358c;
        Boolean bool = this.f112359d;
        Boolean bool2 = this.f112360e;
        String str2 = this.f112361f;
        String str3 = this.f112362g;
        long j = this.f112363h;
        long j2 = this.f112364i;
        long j3 = this.f112365j;
        double d = this.f112366k;
        String str4 = this.f112367l;
        String str5 = this.f112368m;
        boolean z = this.f112369n;
        long j4 = this.f112370o;
        DateTime dateTime3 = this.f112371p;
        Boolean bool3 = this.f112372q;
        Long l = this.f112373r;
        boolean z2 = this.f112374s;
        return "RideFirstUnlockFailed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + bool + ", birdIsCellular=" + bool2 + ", birdModel=" + str2 + ", currency=" + str3 + ", minimumRidePrice=" + j + ", minutePrice=" + j2 + ", minutesIncluded=" + j3 + ", operationTime=" + d + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z + ", startPrice=" + j4 + ", startTime=" + dateTime3 + ", isPrimaryRide=" + bool3 + ", concurrentRideCount=" + l + ", isNetworkConnectivityError=" + z2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49830uR4(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, String str2, String str3, long j, long j2, long j3, double d, String str4, String str5, boolean z, long j4, DateTime dateTime3, Boolean bool3, Long l, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, str2, str3, j, j2, j3, d, (i & 2048) != 0 ? null : str4, str5, z, j4, dateTime3, (65536 & i) != 0 ? null : bool3, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : l, z2);
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
