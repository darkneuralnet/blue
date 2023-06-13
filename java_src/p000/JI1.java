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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b4\u00105Je\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0017¨\u00066"}, m28432d2 = {"LJI1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "", "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "Z", "getHelmetRequired", "()Z", "f", "getCurrency", "g", "I", "getInitialChargeAmount", "()I", "h", "getReturnRefundAmount", "i", "getDelinquentFeeAmount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/String;III)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JI1 */
/* loaded from: classes4.dex */
public final class JI1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f17306a;

    /* renamed from: b */
    public final DateTime f17307b;

    /* renamed from: c */
    public final DateTime f17308c;

    /* renamed from: d */
    public final String f17309d;

    /* renamed from: e */
    public final boolean f17310e;

    /* renamed from: f */
    public final String f17311f;

    /* renamed from: g */
    public final int f17312g;

    /* renamed from: h */
    public final int f17313h;

    /* renamed from: i */
    public final int f17314i;

    public JI1(String eventId, DateTime eventTime, DateTime clientTime, String str, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f17306a = eventId;
        this.f17307b = eventTime;
        this.f17308c = clientTime;
        this.f17309d = str;
        this.f17310e = z;
        this.f17311f = currency;
        this.f17312g = i;
        this.f17313h = i2;
        this.f17314i = i3;
    }

    /* renamed from: a */
    public final JI1 m100728a(String eventId, DateTime eventTime, DateTime clientTime, String str, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new JI1(eventId, eventTime, clientTime, str, z, currency, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JI1) {
            JI1 ji1 = (JI1) obj;
            return Intrinsics.areEqual(this.f17306a, ji1.f17306a) && Intrinsics.areEqual(this.f17307b, ji1.f17307b) && Intrinsics.areEqual(this.f17308c, ji1.f17308c) && Intrinsics.areEqual(this.f17309d, ji1.f17309d) && this.f17310e == ji1.f17310e && Intrinsics.areEqual(this.f17311f, ji1.f17311f) && this.f17312g == ji1.f17312g && this.f17313h == ji1.f17313h && this.f17314i == ji1.f17314i;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseOfferScreenShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f17306a), TuplesKt.m28425to("event_time", this.f17307b), TuplesKt.m28425to("client_time", this.f17308c), TuplesKt.m28425to("bird_id", this.f17309d), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f17310e)), TuplesKt.m28425to("currency", this.f17311f), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f17312g)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f17313h)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f17314i)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f17306a.hashCode() * 31) + this.f17307b.hashCode()) * 31) + this.f17308c.hashCode()) * 31;
        String str = this.f17309d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f17310e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode2 + i) * 31) + this.f17311f.hashCode()) * 31) + Integer.hashCode(this.f17312g)) * 31) + Integer.hashCode(this.f17313h)) * 31) + Integer.hashCode(this.f17314i);
    }

    public String toString() {
        String str = this.f17306a;
        DateTime dateTime = this.f17307b;
        DateTime dateTime2 = this.f17308c;
        String str2 = this.f17309d;
        boolean z = this.f17310e;
        String str3 = this.f17311f;
        int i = this.f17312g;
        int i2 = this.f17313h;
        int i3 = this.f17314i;
        return "HelmetLeaseOfferScreenShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", helmetRequired=" + z + ", currency=" + str3 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ JI1(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, String str3, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i4 & 8) != 0 ? null : str2, z, str3, i, i2, i3);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
        }
        if ((i4 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i4 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
