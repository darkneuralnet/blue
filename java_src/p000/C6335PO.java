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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b-\u0010.JQ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LPO;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", Stripe3ds2AuthParams.FIELD_SOURCE, "", "amount", "currency", "transactionId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSource", "e", "J", "getAmount", "()J", "f", "getCurrency", "g", "getTransactionId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PO */
/* loaded from: classes4.dex */
public final class C6335PO implements AnalyticsEvent {

    /* renamed from: a */
    public final String f28376a;

    /* renamed from: b */
    public final DateTime f28377b;

    /* renamed from: c */
    public final DateTime f28378c;

    /* renamed from: d */
    public final String f28379d;

    /* renamed from: e */
    public final long f28380e;

    /* renamed from: f */
    public final String f28381f;

    /* renamed from: g */
    public final String f28382g;

    public C6335PO(String eventId, DateTime eventTime, DateTime clientTime, String source, long j, String currency, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f28376a = eventId;
        this.f28377b = eventTime;
        this.f28378c = clientTime;
        this.f28379d = source;
        this.f28380e = j;
        this.f28381f = currency;
        this.f28382g = str;
    }

    /* renamed from: a */
    public final C6335PO m90354a(String eventId, DateTime eventTime, DateTime clientTime, String source, long j, String currency, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C6335PO(eventId, eventTime, clientTime, source, j, currency, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6335PO) {
            C6335PO c6335po = (C6335PO) obj;
            return Intrinsics.areEqual(this.f28376a, c6335po.f28376a) && Intrinsics.areEqual(this.f28377b, c6335po.f28377b) && Intrinsics.areEqual(this.f28378c, c6335po.f28378c) && Intrinsics.areEqual(this.f28379d, c6335po.f28379d) && this.f28380e == c6335po.f28380e && Intrinsics.areEqual(this.f28381f, c6335po.f28381f) && Intrinsics.areEqual(this.f28382g, c6335po.f28382g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.BirdPaySupportRequested";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f28376a), TuplesKt.m28425to("event_time", this.f28377b), TuplesKt.m28425to("client_time", this.f28378c), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f28379d), TuplesKt.m28425to("amount", Long.valueOf(this.f28380e)), TuplesKt.m28425to("currency", this.f28381f), TuplesKt.m28425to("transaction_id", this.f28382g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f28376a.hashCode() * 31) + this.f28377b.hashCode()) * 31) + this.f28378c.hashCode()) * 31) + this.f28379d.hashCode()) * 31) + Long.hashCode(this.f28380e)) * 31) + this.f28381f.hashCode()) * 31;
        String str = this.f28382g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f28376a;
        DateTime dateTime = this.f28377b;
        DateTime dateTime2 = this.f28378c;
        String str2 = this.f28379d;
        long j = this.f28380e;
        String str3 = this.f28381f;
        String str4 = this.f28382g;
        return "BirdPaySupportRequested(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", source=" + str2 + ", amount=" + j + ", currency=" + str3 + ", transactionId=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C6335PO(String str, DateTime dateTime, DateTime dateTime2, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, j, str3, (i & 64) != 0 ? null : str4);
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
