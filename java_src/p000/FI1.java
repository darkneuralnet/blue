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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b:\u0010;Jy\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\"\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0019¨\u0006<"}, m28432d2 = {"LFI1;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "errorTitle", "errorMessage", "birdId", "", "helmetRequired", "currency", "", "initialChargeAmount", "returnRefundAmount", "delinquentFeeAmount", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getErrorTitle", "e", "getErrorMessage", "f", "getBirdId", "g", "Z", "getHelmetRequired", "()Z", "h", "getCurrency", "i", "I", "getInitialChargeAmount", "()I", "j", "getReturnRefundAmount", "k", "getDelinquentFeeAmount", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;III)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FI1 */
/* loaded from: classes4.dex */
public final class FI1 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f9130a;

    /* renamed from: b */
    public final DateTime f9131b;

    /* renamed from: c */
    public final DateTime f9132c;

    /* renamed from: d */
    public final String f9133d;

    /* renamed from: e */
    public final String f9134e;

    /* renamed from: f */
    public final String f9135f;

    /* renamed from: g */
    public final boolean f9136g;

    /* renamed from: h */
    public final String f9137h;

    /* renamed from: i */
    public final int f9138i;

    /* renamed from: j */
    public final int f9139j;

    /* renamed from: k */
    public final int f9140k;

    public FI1(String eventId, DateTime eventTime, DateTime clientTime, String errorTitle, String errorMessage, String str, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f9130a = eventId;
        this.f9131b = eventTime;
        this.f9132c = clientTime;
        this.f9133d = errorTitle;
        this.f9134e = errorMessage;
        this.f9135f = str;
        this.f9136g = z;
        this.f9137h = currency;
        this.f9138i = i;
        this.f9139j = i2;
        this.f9140k = i3;
    }

    /* renamed from: a */
    public final FI1 m107351a(String eventId, DateTime eventTime, DateTime clientTime, String errorTitle, String errorMessage, String str, boolean z, String currency, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new FI1(eventId, eventTime, clientTime, errorTitle, errorMessage, str, z, currency, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FI1) {
            FI1 fi1 = (FI1) obj;
            return Intrinsics.areEqual(this.f9130a, fi1.f9130a) && Intrinsics.areEqual(this.f9131b, fi1.f9131b) && Intrinsics.areEqual(this.f9132c, fi1.f9132c) && Intrinsics.areEqual(this.f9133d, fi1.f9133d) && Intrinsics.areEqual(this.f9134e, fi1.f9134e) && Intrinsics.areEqual(this.f9135f, fi1.f9135f) && this.f9136g == fi1.f9136g && Intrinsics.areEqual(this.f9137h, fi1.f9137h) && this.f9138i == fi1.f9138i && this.f9139j == fi1.f9139j && this.f9140k == fi1.f9140k;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.HelmetLeaseConfirmUnlockErrorOccurred";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f9130a), TuplesKt.m28425to("event_time", this.f9131b), TuplesKt.m28425to("client_time", this.f9132c), TuplesKt.m28425to("error_title", this.f9133d), TuplesKt.m28425to("error_message", this.f9134e), TuplesKt.m28425to("bird_id", this.f9135f), TuplesKt.m28425to("helmet_required", Boolean.valueOf(this.f9136g)), TuplesKt.m28425to("currency", this.f9137h), TuplesKt.m28425to("initial_charge_amount", Integer.valueOf(this.f9138i)), TuplesKt.m28425to("return_refund_amount", Integer.valueOf(this.f9139j)), TuplesKt.m28425to("delinquent_fee_amount", Integer.valueOf(this.f9140k)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f9130a.hashCode() * 31) + this.f9131b.hashCode()) * 31) + this.f9132c.hashCode()) * 31) + this.f9133d.hashCode()) * 31) + this.f9134e.hashCode()) * 31;
        String str = this.f9135f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f9136g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode2 + i) * 31) + this.f9137h.hashCode()) * 31) + Integer.hashCode(this.f9138i)) * 31) + Integer.hashCode(this.f9139j)) * 31) + Integer.hashCode(this.f9140k);
    }

    public String toString() {
        String str = this.f9130a;
        DateTime dateTime = this.f9131b;
        DateTime dateTime2 = this.f9132c;
        String str2 = this.f9133d;
        String str3 = this.f9134e;
        String str4 = this.f9135f;
        boolean z = this.f9136g;
        String str5 = this.f9137h;
        int i = this.f9138i;
        int i2 = this.f9139j;
        int i3 = this.f9140k;
        return "HelmetLeaseConfirmUnlockErrorOccurred(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", errorTitle=" + str2 + ", errorMessage=" + str3 + ", birdId=" + str4 + ", helmetRequired=" + z + ", currency=" + str5 + ", initialChargeAmount=" + i + ", returnRefundAmount=" + i2 + ", delinquentFeeAmount=" + i3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FI1(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, boolean z, String str5, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, (i4 & 32) != 0 ? null : str4, z, str5, i, i2, i3);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i4 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
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
