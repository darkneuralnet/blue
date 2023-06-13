package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b*\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bK\u0010LJ²\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\u0012\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010\u001d\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001a0E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u001f¨\u0006M"}, m28432d2 = {"LCa5;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdCode", "birdStatus", "currency", "", "minimumRidePrice", "minutePrice", "minutesIncluded", "partnerId", "", "hasSalesTax", "startPrice", "isInRegistration", Stripe3ds2AuthParams.FIELD_SOURCE, "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)LCa5;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdCode", "e", "getBirdStatus", "f", "getCurrency", "g", "J", "getMinimumRidePrice", "()J", "h", "getMinutePrice", "i", "getMinutesIncluded", "j", "getPartnerId", "k", "Z", "getHasSalesTax", "()Z", "l", "getStartPrice", "m", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "n", "getSource", "o", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ZJLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ca5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32086Ca5 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f4261a;

    /* renamed from: b */
    public final DateTime f4262b;

    /* renamed from: c */
    public final DateTime f4263c;

    /* renamed from: d */
    public final String f4264d;

    /* renamed from: e */
    public final String f4265e;

    /* renamed from: f */
    public final String f4266f;

    /* renamed from: g */
    public final long f4267g;

    /* renamed from: h */
    public final long f4268h;

    /* renamed from: i */
    public final long f4269i;

    /* renamed from: j */
    public final String f4270j;

    /* renamed from: k */
    public final boolean f4271k;

    /* renamed from: l */
    public final long f4272l;

    /* renamed from: m */
    public final Boolean f4273m;

    /* renamed from: n */
    public final String f4274n;

    /* renamed from: o */
    public final Long f4275o;

    public C32086Ca5(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String currency, long j, long j2, long j3, String str3, boolean z, long j4, Boolean bool, String str4, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f4261a = eventId;
        this.f4262b = eventTime;
        this.f4263c = clientTime;
        this.f4264d = str;
        this.f4265e = str2;
        this.f4266f = currency;
        this.f4267g = j;
        this.f4268h = j2;
        this.f4269i = j3;
        this.f4270j = str3;
        this.f4271k = z;
        this.f4272l = j4;
        this.f4273m = bool;
        this.f4274n = str4;
        this.f4275o = l;
    }

    /* renamed from: a */
    public final C32086Ca5 m112102a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String currency, long j, long j2, long j3, String str3, boolean z, long j4, Boolean bool, String str4, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C32086Ca5(eventId, eventTime, clientTime, str, str2, currency, j, j2, j3, str3, z, j4, bool, str4, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32086Ca5) {
            C32086Ca5 c32086Ca5 = (C32086Ca5) obj;
            return Intrinsics.areEqual(this.f4261a, c32086Ca5.f4261a) && Intrinsics.areEqual(this.f4262b, c32086Ca5.f4262b) && Intrinsics.areEqual(this.f4263c, c32086Ca5.f4263c) && Intrinsics.areEqual(this.f4264d, c32086Ca5.f4264d) && Intrinsics.areEqual(this.f4265e, c32086Ca5.f4265e) && Intrinsics.areEqual(this.f4266f, c32086Ca5.f4266f) && this.f4267g == c32086Ca5.f4267g && this.f4268h == c32086Ca5.f4268h && this.f4269i == c32086Ca5.f4269i && Intrinsics.areEqual(this.f4270j, c32086Ca5.f4270j) && this.f4271k == c32086Ca5.f4271k && this.f4272l == c32086Ca5.f4272l && Intrinsics.areEqual(this.f4273m, c32086Ca5.f4273m) && Intrinsics.areEqual(this.f4274n, c32086Ca5.f4274n) && Intrinsics.areEqual(this.f4275o, c32086Ca5.f4275o);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderScannedBird";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f4261a), TuplesKt.m28425to("event_time", this.f4262b), TuplesKt.m28425to("client_time", this.f4263c), TuplesKt.m28425to("bird_code", this.f4264d), TuplesKt.m28425to("bird_status", this.f4265e), TuplesKt.m28425to("currency", this.f4266f), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f4267g)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f4268h)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f4269i)), TuplesKt.m28425to("partner_id", this.f4270j), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f4271k)), TuplesKt.m28425to("start_price", Long.valueOf(this.f4272l)), TuplesKt.m28425to("is_in_registration", this.f4273m), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f4274n), TuplesKt.m28425to("concurrent_ride_count", this.f4275o));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f4261a.hashCode() * 31) + this.f4262b.hashCode()) * 31) + this.f4263c.hashCode()) * 31;
        String str = this.f4264d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4265e;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f4266f.hashCode()) * 31) + Long.hashCode(this.f4267g)) * 31) + Long.hashCode(this.f4268h)) * 31) + Long.hashCode(this.f4269i)) * 31;
        String str3 = this.f4270j;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.f4271k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode5 = (((hashCode4 + i) * 31) + Long.hashCode(this.f4272l)) * 31;
        Boolean bool = this.f4273m;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f4274n;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f4275o;
        return hashCode7 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f4261a;
        DateTime dateTime = this.f4262b;
        DateTime dateTime2 = this.f4263c;
        String str2 = this.f4264d;
        String str3 = this.f4265e;
        String str4 = this.f4266f;
        long j = this.f4267g;
        long j2 = this.f4268h;
        long j3 = this.f4269i;
        String str5 = this.f4270j;
        boolean z = this.f4271k;
        long j4 = this.f4272l;
        Boolean bool = this.f4273m;
        String str6 = this.f4274n;
        Long l = this.f4275o;
        return "RiderScannedBird(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdCode=" + str2 + ", birdStatus=" + str3 + ", currency=" + str4 + ", minimumRidePrice=" + j + ", minutePrice=" + j2 + ", minutesIncluded=" + j3 + ", partnerId=" + str5 + ", hasSalesTax=" + z + ", startPrice=" + j4 + ", isInRegistration=" + bool + ", source=" + str6 + ", concurrentRideCount=" + l + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C32086Ca5(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, long j, long j2, long j3, String str5, boolean z, long j4, Boolean bool, String str6, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, str4, j, j2, j3, (i & 512) != 0 ? null : str5, z, j4, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : l);
        String str7;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str7 = uuid;
        } else {
            str7 = str;
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
