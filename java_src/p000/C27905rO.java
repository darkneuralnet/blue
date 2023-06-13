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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bA\u0010BJ\u0092\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u0010\u001cR\"\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00170;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u001c¨\u0006C"}, m28432d2 = {"LrO;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "successful", "paymentError", "", "amountRequested", "currentBalance", "currency", "passthroughChargeEnabled", "merchantId", "merchantSiteId", "placardId", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LrO;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getSuccessful", "()Z", "e", "getPaymentError", "f", "J", "getAmountRequested", "()J", "g", "getCurrentBalance", "h", "getCurrency", "i", "Ljava/lang/Boolean;", "getPassthroughChargeEnabled", "()Ljava/lang/Boolean;", "j", "getMerchantId", "k", "getMerchantSiteId", "l", "getPlacardId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rO */
/* loaded from: classes4.dex */
public final class C27905rO implements AnalyticsEvent {

    /* renamed from: a */
    public final String f106942a;

    /* renamed from: b */
    public final DateTime f106943b;

    /* renamed from: c */
    public final DateTime f106944c;

    /* renamed from: d */
    public final boolean f106945d;

    /* renamed from: e */
    public final String f106946e;

    /* renamed from: f */
    public final long f106947f;

    /* renamed from: g */
    public final long f106948g;

    /* renamed from: h */
    public final String f106949h;

    /* renamed from: i */
    public final Boolean f106950i;

    /* renamed from: j */
    public final String f106951j;

    /* renamed from: k */
    public final String f106952k;

    /* renamed from: l */
    public final String f106953l;

    public C27905rO(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String str, long j, long j2, String currency, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f106942a = eventId;
        this.f106943b = eventTime;
        this.f106944c = clientTime;
        this.f106945d = z;
        this.f106946e = str;
        this.f106947f = j;
        this.f106948g = j2;
        this.f106949h = currency;
        this.f106950i = bool;
        this.f106951j = str2;
        this.f106952k = str3;
        this.f106953l = str4;
    }

    /* renamed from: a */
    public final C27905rO m16016a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, String str, long j, long j2, String currency, Boolean bool, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C27905rO(eventId, eventTime, clientTime, z, str, j, j2, currency, bool, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27905rO) {
            C27905rO c27905rO = (C27905rO) obj;
            return Intrinsics.areEqual(this.f106942a, c27905rO.f106942a) && Intrinsics.areEqual(this.f106943b, c27905rO.f106943b) && Intrinsics.areEqual(this.f106944c, c27905rO.f106944c) && this.f106945d == c27905rO.f106945d && Intrinsics.areEqual(this.f106946e, c27905rO.f106946e) && this.f106947f == c27905rO.f106947f && this.f106948g == c27905rO.f106948g && Intrinsics.areEqual(this.f106949h, c27905rO.f106949h) && Intrinsics.areEqual(this.f106950i, c27905rO.f106950i) && Intrinsics.areEqual(this.f106951j, c27905rO.f106951j) && Intrinsics.areEqual(this.f106952k, c27905rO.f106952k) && Intrinsics.areEqual(this.f106953l, c27905rO.f106953l);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPayPaymentAttempted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f106942a), TuplesKt.m28425to("event_time", this.f106943b), TuplesKt.m28425to("client_time", this.f106944c), TuplesKt.m28425to("successful", Boolean.valueOf(this.f106945d)), TuplesKt.m28425to("payment_error", this.f106946e), TuplesKt.m28425to("amount_requested", Long.valueOf(this.f106947f)), TuplesKt.m28425to("current_balance", Long.valueOf(this.f106948g)), TuplesKt.m28425to("currency", this.f106949h), TuplesKt.m28425to("passthrough_charge_enabled", this.f106950i), TuplesKt.m28425to("merchant_id", this.f106951j), TuplesKt.m28425to("merchant_site_id", this.f106952k), TuplesKt.m28425to("placard_id", this.f106953l));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f106942a.hashCode() * 31) + this.f106943b.hashCode()) * 31) + this.f106944c.hashCode()) * 31;
        boolean z = this.f106945d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f106946e;
        int hashCode2 = (((((((i2 + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.f106947f)) * 31) + Long.hashCode(this.f106948g)) * 31) + this.f106949h.hashCode()) * 31;
        Boolean bool = this.f106950i;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f106951j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106952k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f106953l;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f106942a;
        DateTime dateTime = this.f106943b;
        DateTime dateTime2 = this.f106944c;
        boolean z = this.f106945d;
        String str2 = this.f106946e;
        long j = this.f106947f;
        long j2 = this.f106948g;
        String str3 = this.f106949h;
        Boolean bool = this.f106950i;
        String str4 = this.f106951j;
        String str5 = this.f106952k;
        String str6 = this.f106953l;
        return "BirdPayPaymentAttempted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", successful=" + z + ", paymentError=" + str2 + ", amountRequested=" + j + ", currentBalance=" + j2 + ", currency=" + str3 + ", passthroughChargeEnabled=" + bool + ", merchantId=" + str4 + ", merchantSiteId=" + str5 + ", placardId=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C27905rO(String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, long j, long j2, String str3, Boolean bool, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, (i & 16) != 0 ? null : str2, j, j2, str3, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6);
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
