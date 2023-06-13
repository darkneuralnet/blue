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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b&\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bG\u0010HJ²\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\b\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u001d\u001a\u0004\b<\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001a0A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u001f¨\u0006I"}, m28432d2 = {"LtN3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isInRegistration", Stripe3ds2AuthParams.FIELD_SOURCE, "vendor", "paymentMethod", "autoPayEnabled", "autoPayPlanId", "", "autoPayRefillAmount", "autoPayCurrency", "autoPayBonus", "deviceCheckMethod", "", "deviceCheckAge", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)LtN3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getSource", "f", "getVendor", "g", "getPaymentMethod", "h", "getAutoPayEnabled", "i", "getAutoPayPlanId", "j", "Ljava/lang/Long;", "getAutoPayRefillAmount", "()Ljava/lang/Long;", "k", "getAutoPayCurrency", "l", "getAutoPayBonus", "m", "getDeviceCheckMethod", "n", "Ljava/lang/Double;", "getDeviceCheckAge", "()Ljava/lang/Double;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tN3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49200tN3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f110363a;

    /* renamed from: b */
    public final DateTime f110364b;

    /* renamed from: c */
    public final DateTime f110365c;

    /* renamed from: d */
    public final Boolean f110366d;

    /* renamed from: e */
    public final String f110367e;

    /* renamed from: f */
    public final String f110368f;

    /* renamed from: g */
    public final String f110369g;

    /* renamed from: h */
    public final Boolean f110370h;

    /* renamed from: i */
    public final String f110371i;

    /* renamed from: j */
    public final Long f110372j;

    /* renamed from: k */
    public final String f110373k;

    /* renamed from: l */
    public final Long f110374l;

    /* renamed from: m */
    public final String f110375m;

    /* renamed from: n */
    public final Double f110376n;

    public C49200tN3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: a */
    public final C49200tN3 m12472a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, Long l, String str5, Long l2, String str6, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C49200tN3(eventId, eventTime, clientTime, bool, str, str2, str3, bool2, str4, l, str5, l2, str6, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49200tN3) {
            C49200tN3 c49200tN3 = (C49200tN3) obj;
            return Intrinsics.areEqual(this.f110363a, c49200tN3.f110363a) && Intrinsics.areEqual(this.f110364b, c49200tN3.f110364b) && Intrinsics.areEqual(this.f110365c, c49200tN3.f110365c) && Intrinsics.areEqual(this.f110366d, c49200tN3.f110366d) && Intrinsics.areEqual(this.f110367e, c49200tN3.f110367e) && Intrinsics.areEqual(this.f110368f, c49200tN3.f110368f) && Intrinsics.areEqual(this.f110369g, c49200tN3.f110369g) && Intrinsics.areEqual(this.f110370h, c49200tN3.f110370h) && Intrinsics.areEqual(this.f110371i, c49200tN3.f110371i) && Intrinsics.areEqual(this.f110372j, c49200tN3.f110372j) && Intrinsics.areEqual(this.f110373k, c49200tN3.f110373k) && Intrinsics.areEqual(this.f110374l, c49200tN3.f110374l) && Intrinsics.areEqual(this.f110375m, c49200tN3.f110375m) && Intrinsics.areEqual((Object) this.f110376n, (Object) c49200tN3.f110376n);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PaymentMethodEntered";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f110363a), TuplesKt.m28425to("event_time", this.f110364b), TuplesKt.m28425to("client_time", this.f110365c), TuplesKt.m28425to("is_in_registration", this.f110366d), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f110367e), TuplesKt.m28425to("vendor", this.f110368f), TuplesKt.m28425to("payment_method", this.f110369g), TuplesKt.m28425to("auto_pay_enabled", this.f110370h), TuplesKt.m28425to("auto_pay_plan_id", this.f110371i), TuplesKt.m28425to("auto_pay_refill_amount", this.f110372j), TuplesKt.m28425to("auto_pay_currency", this.f110373k), TuplesKt.m28425to("auto_pay_bonus", this.f110374l), TuplesKt.m28425to("device_check_method", this.f110375m), TuplesKt.m28425to("device_check_age", this.f110376n));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f110363a.hashCode() * 31) + this.f110364b.hashCode()) * 31) + this.f110365c.hashCode()) * 31;
        Boolean bool = this.f110366d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f110367e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110368f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f110369g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f110370h;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f110371i;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f110372j;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f110373k;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.f110374l;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.f110375m;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d = this.f110376n;
        return hashCode11 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        String str = this.f110363a;
        DateTime dateTime = this.f110364b;
        DateTime dateTime2 = this.f110365c;
        Boolean bool = this.f110366d;
        String str2 = this.f110367e;
        String str3 = this.f110368f;
        String str4 = this.f110369g;
        Boolean bool2 = this.f110370h;
        String str5 = this.f110371i;
        Long l = this.f110372j;
        String str6 = this.f110373k;
        Long l2 = this.f110374l;
        String str7 = this.f110375m;
        Double d = this.f110376n;
        return "PaymentMethodEntered(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isInRegistration=" + bool + ", source=" + str2 + ", vendor=" + str3 + ", paymentMethod=" + str4 + ", autoPayEnabled=" + bool2 + ", autoPayPlanId=" + str5 + ", autoPayRefillAmount=" + l + ", autoPayCurrency=" + str6 + ", autoPayBonus=" + l2 + ", deviceCheckMethod=" + str7 + ", deviceCheckAge=" + d + ")";
    }

    public C49200tN3(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, String str, String str2, String str3, Boolean bool2, String str4, Long l, String str5, Long l2, String str6, Double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f110363a = eventId;
        this.f110364b = eventTime;
        this.f110365c = clientTime;
        this.f110366d = bool;
        this.f110367e = str;
        this.f110368f = str2;
        this.f110369g = str3;
        this.f110370h = bool2;
        this.f110371i = str4;
        this.f110372j = l;
        this.f110373k = str5;
        this.f110374l = l2;
        this.f110375m = str6;
        this.f110376n = d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C49200tN3(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, String str2, String str3, String str4, Boolean bool2, String str5, Long l, String str6, Long l2, String str7, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : l, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : str7, (i & 8192) == 0 ? d : null);
        String str8;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str8 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str8, "randomUUID().toString()");
        } else {
            str8 = str;
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
