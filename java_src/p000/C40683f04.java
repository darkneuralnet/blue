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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b6\u00107Jt\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\"\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0019¨\u00068"}, m28432d2 = {"Lf04;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "paymentMethod", "", "autoPayEnabled", "autoPayPlanId", "", "autoPayRefillAmount", "autoPayCurrency", "autoPayBonus", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lf04;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getPaymentMethod", "e", "Ljava/lang/Boolean;", "getAutoPayEnabled", "()Ljava/lang/Boolean;", "f", "getAutoPayPlanId", "g", "Ljava/lang/Long;", "getAutoPayRefillAmount", "()Ljava/lang/Long;", "h", "getAutoPayCurrency", "i", "getAutoPayBonus", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f04  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40683f04 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f79271a;

    /* renamed from: b */
    public final DateTime f79272b;

    /* renamed from: c */
    public final DateTime f79273c;

    /* renamed from: d */
    public final String f79274d;

    /* renamed from: e */
    public final Boolean f79275e;

    /* renamed from: f */
    public final String f79276f;

    /* renamed from: g */
    public final Long f79277g;

    /* renamed from: h */
    public final String f79278h;

    /* renamed from: i */
    public final Long f79279i;

    public C40683f04(String eventId, DateTime eventTime, DateTime clientTime, String paymentMethod, Boolean bool, String str, Long l, String str2, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f79271a = eventId;
        this.f79272b = eventTime;
        this.f79273c = clientTime;
        this.f79274d = paymentMethod;
        this.f79275e = bool;
        this.f79276f = str;
        this.f79277g = l;
        this.f79278h = str2;
        this.f79279i = l2;
    }

    /* renamed from: a */
    public final C40683f04 m42286a(String eventId, DateTime eventTime, DateTime clientTime, String paymentMethod, Boolean bool, String str, Long l, String str2, Long l2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new C40683f04(eventId, eventTime, clientTime, paymentMethod, bool, str, l, str2, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40683f04) {
            C40683f04 c40683f04 = (C40683f04) obj;
            return Intrinsics.areEqual(this.f79271a, c40683f04.f79271a) && Intrinsics.areEqual(this.f79272b, c40683f04.f79272b) && Intrinsics.areEqual(this.f79273c, c40683f04.f79273c) && Intrinsics.areEqual(this.f79274d, c40683f04.f79274d) && Intrinsics.areEqual(this.f79275e, c40683f04.f79275e) && Intrinsics.areEqual(this.f79276f, c40683f04.f79276f) && Intrinsics.areEqual(this.f79277g, c40683f04.f79277g) && Intrinsics.areEqual(this.f79278h, c40683f04.f79278h) && Intrinsics.areEqual(this.f79279i, c40683f04.f79279i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PreloadEnabled";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f79271a), TuplesKt.m28425to("event_time", this.f79272b), TuplesKt.m28425to("client_time", this.f79273c), TuplesKt.m28425to("payment_method", this.f79274d), TuplesKt.m28425to("auto_pay_enabled", this.f79275e), TuplesKt.m28425to("auto_pay_plan_id", this.f79276f), TuplesKt.m28425to("auto_pay_refill_amount", this.f79277g), TuplesKt.m28425to("auto_pay_currency", this.f79278h), TuplesKt.m28425to("auto_pay_bonus", this.f79279i));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f79271a.hashCode() * 31) + this.f79272b.hashCode()) * 31) + this.f79273c.hashCode()) * 31) + this.f79274d.hashCode()) * 31;
        Boolean bool = this.f79275e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f79276f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f79277g;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f79278h;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f79279i;
        return hashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f79271a;
        DateTime dateTime = this.f79272b;
        DateTime dateTime2 = this.f79273c;
        String str2 = this.f79274d;
        Boolean bool = this.f79275e;
        String str3 = this.f79276f;
        Long l = this.f79277g;
        String str4 = this.f79278h;
        Long l2 = this.f79279i;
        return "PreloadEnabled(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", paymentMethod=" + str2 + ", autoPayEnabled=" + bool + ", autoPayPlanId=" + str3 + ", autoPayRefillAmount=" + l + ", autoPayCurrency=" + str4 + ", autoPayBonus=" + l2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40683f04(String str, DateTime dateTime, DateTime dateTime2, String str2, Boolean bool, String str3, Long l, String str4, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : l2);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
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
