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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b8\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\ba\u0010bJ\u0088\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0002HÖ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\u0013\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b=\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u00101R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010%\u001a\u0004\bO\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010%\u001a\u0004\bQ\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\b\u0018\u0010TR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\b\u0019\u0010TR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bV\u0010%\u001a\u0004\bW\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bX\u0010S\u001a\u0004\b\u001b\u0010TR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bY\u0010K\u001a\u0004\bZ\u0010MR\"\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\"0[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010'¨\u0006c"}, m28432d2 = {"LV55;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdIsPrivate", "birdId", "birdModel", "partnerId", "description", "", "startPrice", "minutePrice", "minimumRidePrice", "minutesIncluded", "hasSalesTax", "balance", "defaultVendor", "defaultPaymentMethod", "isAutoPayEnabled", "isNetworkConnectivityError", "step", "isPrimaryRide", "concurrentRideCount", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)LV55;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getBirdIsBluetooth", "()Z", "e", "getBirdIsCellular", "f", "getBirdIsPrivate", "g", "getBirdId", "h", "getBirdModel", "i", "getPartnerId", "j", "getDescription", "k", "J", "getStartPrice", "()J", "l", "getMinutePrice", "m", "getMinimumRidePrice", "n", "getMinutesIncluded", "o", "getHasSalesTax", "p", "Ljava/lang/Long;", "getBalance", "()Ljava/lang/Long;", "q", "getDefaultVendor", "r", "getDefaultPaymentMethod", "s", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "t", "u", "getStep", "v", "w", "getConcurrentRideCount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: V55 */
/* loaded from: classes4.dex */
public final class V55 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f38593a;

    /* renamed from: b */
    public final DateTime f38594b;

    /* renamed from: c */
    public final DateTime f38595c;

    /* renamed from: d */
    public final boolean f38596d;

    /* renamed from: e */
    public final boolean f38597e;

    /* renamed from: f */
    public final boolean f38598f;

    /* renamed from: g */
    public final String f38599g;

    /* renamed from: h */
    public final String f38600h;

    /* renamed from: i */
    public final String f38601i;

    /* renamed from: j */
    public final String f38602j;

    /* renamed from: k */
    public final long f38603k;

    /* renamed from: l */
    public final long f38604l;

    /* renamed from: m */
    public final long f38605m;

    /* renamed from: n */
    public final long f38606n;

    /* renamed from: o */
    public final boolean f38607o;

    /* renamed from: p */
    public final Long f38608p;

    /* renamed from: q */
    public final String f38609q;

    /* renamed from: r */
    public final String f38610r;

    /* renamed from: s */
    public final Boolean f38611s;

    /* renamed from: t */
    public final Boolean f38612t;

    /* renamed from: u */
    public final String f38613u;

    /* renamed from: v */
    public final Boolean f38614v;

    /* renamed from: w */
    public final Long f38615w;

    public V55(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, boolean z3, String birdId, String birdModel, String str, String description, long j, long j2, long j3, long j4, boolean z4, Long l, String str2, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f38593a = eventId;
        this.f38594b = eventTime;
        this.f38595c = clientTime;
        this.f38596d = z;
        this.f38597e = z2;
        this.f38598f = z3;
        this.f38599g = birdId;
        this.f38600h = birdModel;
        this.f38601i = str;
        this.f38602j = description;
        this.f38603k = j;
        this.f38604l = j2;
        this.f38605m = j3;
        this.f38606n = j4;
        this.f38607o = z4;
        this.f38608p = l;
        this.f38609q = str2;
        this.f38610r = str3;
        this.f38611s = bool;
        this.f38612t = bool2;
        this.f38613u = str4;
        this.f38614v = bool3;
        this.f38615w = l2;
    }

    /* renamed from: a */
    public final V55 m80423a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, boolean z3, String birdId, String birdModel, String str, String description, long j, long j2, long j3, long j4, boolean z4, Long l, String str2, String str3, Boolean bool, Boolean bool2, String str4, Boolean bool3, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(description, "description");
        return new V55(eventId, eventTime, clientTime, z, z2, z3, birdId, birdModel, str, description, j, j2, j3, j4, z4, l, str2, str3, bool, bool2, str4, bool3, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V55) {
            V55 v55 = (V55) obj;
            return Intrinsics.areEqual(this.f38593a, v55.f38593a) && Intrinsics.areEqual(this.f38594b, v55.f38594b) && Intrinsics.areEqual(this.f38595c, v55.f38595c) && this.f38596d == v55.f38596d && this.f38597e == v55.f38597e && this.f38598f == v55.f38598f && Intrinsics.areEqual(this.f38599g, v55.f38599g) && Intrinsics.areEqual(this.f38600h, v55.f38600h) && Intrinsics.areEqual(this.f38601i, v55.f38601i) && Intrinsics.areEqual(this.f38602j, v55.f38602j) && this.f38603k == v55.f38603k && this.f38604l == v55.f38604l && this.f38605m == v55.f38605m && this.f38606n == v55.f38606n && this.f38607o == v55.f38607o && Intrinsics.areEqual(this.f38608p, v55.f38608p) && Intrinsics.areEqual(this.f38609q, v55.f38609q) && Intrinsics.areEqual(this.f38610r, v55.f38610r) && Intrinsics.areEqual(this.f38611s, v55.f38611s) && Intrinsics.areEqual(this.f38612t, v55.f38612t) && Intrinsics.areEqual(this.f38613u, v55.f38613u) && Intrinsics.areEqual(this.f38614v, v55.f38614v) && Intrinsics.areEqual(this.f38615w, v55.f38615w);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideStartError";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f38593a), TuplesKt.m28425to("event_time", this.f38594b), TuplesKt.m28425to("client_time", this.f38595c), TuplesKt.m28425to("bird_is_bluetooth", Boolean.valueOf(this.f38596d)), TuplesKt.m28425to("bird_is_cellular", Boolean.valueOf(this.f38597e)), TuplesKt.m28425to("bird_is_private", Boolean.valueOf(this.f38598f)), TuplesKt.m28425to("bird_id", this.f38599g), TuplesKt.m28425to("bird_model", this.f38600h), TuplesKt.m28425to("partner_id", this.f38601i), TuplesKt.m28425to("description", this.f38602j), TuplesKt.m28425to("start_price", Long.valueOf(this.f38603k)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f38604l)), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f38605m)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f38606n)), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f38607o)), TuplesKt.m28425to("balance", this.f38608p), TuplesKt.m28425to("default_vendor", this.f38609q), TuplesKt.m28425to("default_payment_method", this.f38610r), TuplesKt.m28425to("is_auto_pay_enabled", this.f38611s), TuplesKt.m28425to("is_network_connectivity_error", this.f38612t), TuplesKt.m28425to("step", this.f38613u), TuplesKt.m28425to("is_primary_ride", this.f38614v), TuplesKt.m28425to("concurrent_ride_count", this.f38615w));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f38593a.hashCode() * 31) + this.f38594b.hashCode()) * 31) + this.f38595c.hashCode()) * 31;
        boolean z = this.f38596d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f38597e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f38598f;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode2 = (((((i4 + i5) * 31) + this.f38599g.hashCode()) * 31) + this.f38600h.hashCode()) * 31;
        String str = this.f38601i;
        int hashCode3 = (((((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f38602j.hashCode()) * 31) + Long.hashCode(this.f38603k)) * 31) + Long.hashCode(this.f38604l)) * 31) + Long.hashCode(this.f38605m)) * 31) + Long.hashCode(this.f38606n)) * 31;
        boolean z4 = this.f38607o;
        int i6 = (hashCode3 + (z4 ? 1 : z4 ? 1 : 0)) * 31;
        Long l = this.f38608p;
        int hashCode4 = (i6 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f38609q;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f38610r;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f38611s;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f38612t;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f38613u;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.f38614v;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l2 = this.f38615w;
        return hashCode10 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f38593a;
        DateTime dateTime = this.f38594b;
        DateTime dateTime2 = this.f38595c;
        boolean z = this.f38596d;
        boolean z2 = this.f38597e;
        boolean z3 = this.f38598f;
        String str2 = this.f38599g;
        String str3 = this.f38600h;
        String str4 = this.f38601i;
        String str5 = this.f38602j;
        long j = this.f38603k;
        long j2 = this.f38604l;
        long j3 = this.f38605m;
        long j4 = this.f38606n;
        boolean z4 = this.f38607o;
        Long l = this.f38608p;
        String str6 = this.f38609q;
        String str7 = this.f38610r;
        Boolean bool = this.f38611s;
        Boolean bool2 = this.f38612t;
        String str8 = this.f38613u;
        Boolean bool3 = this.f38614v;
        Long l2 = this.f38615w;
        return "RideStartError(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + z + ", birdIsCellular=" + z2 + ", birdIsPrivate=" + z3 + ", birdId=" + str2 + ", birdModel=" + str3 + ", partnerId=" + str4 + ", description=" + str5 + ", startPrice=" + j + ", minutePrice=" + j2 + ", minimumRidePrice=" + j3 + ", minutesIncluded=" + j4 + ", hasSalesTax=" + z4 + ", balance=" + l + ", defaultVendor=" + str6 + ", defaultPaymentMethod=" + str7 + ", isAutoPayEnabled=" + bool + ", isNetworkConnectivityError=" + bool2 + ", step=" + str8 + ", isPrimaryRide=" + bool3 + ", concurrentRideCount=" + l2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ V55(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, long j, long j2, long j3, long j4, boolean z4, Long l, String str6, String str7, Boolean bool, Boolean bool2, String str8, Boolean bool3, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, z2, z3, str2, str3, (i & 256) != 0 ? null : str4, str5, j, j2, j3, j4, z4, (32768 & i) != 0 ? null : l, (65536 & i) != 0 ? null : str6, (131072 & i) != 0 ? null : str7, (262144 & i) != 0 ? null : bool, (524288 & i) != 0 ? null : bool2, (1048576 & i) != 0 ? null : str8, (2097152 & i) != 0 ? null : bool3, (i & 4194304) != 0 ? null : l2);
        String str9;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str9 = uuid;
        } else {
            str9 = str;
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
