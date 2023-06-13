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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LFV4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "userRidePassId", "linkCode", "", "transfersRemaining", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getUserRidePassId", "e", "getLinkCode", "f", "J", "getTransfersRemaining", "()J", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;J)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FV4 */
/* loaded from: classes4.dex */
public final class FV4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f9528a;

    /* renamed from: b */
    public final DateTime f9529b;

    /* renamed from: c */
    public final DateTime f9530c;

    /* renamed from: d */
    public final String f9531d;

    /* renamed from: e */
    public final String f9532e;

    /* renamed from: f */
    public final long f9533f;

    public FV4(String eventId, DateTime eventTime, DateTime clientTime, String userRidePassId, String linkCode, long j) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        this.f9528a = eventId;
        this.f9529b = eventTime;
        this.f9530c = clientTime;
        this.f9531d = userRidePassId;
        this.f9532e = linkCode;
        this.f9533f = j;
    }

    public static /* synthetic */ FV4 copy$default(FV4 fv4, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fv4.f9528a;
        }
        if ((i & 2) != 0) {
            dateTime = fv4.f9529b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = fv4.f9530c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = fv4.f9531d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = fv4.f9532e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            j = fv4.f9533f;
        }
        return fv4.m107072a(str, dateTime3, dateTime4, str4, str5, j);
    }

    /* renamed from: a */
    public final FV4 m107072a(String eventId, DateTime eventTime, DateTime clientTime, String userRidePassId, String linkCode, long j) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        return new FV4(eventId, eventTime, clientTime, userRidePassId, linkCode, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FV4) {
            FV4 fv4 = (FV4) obj;
            return Intrinsics.areEqual(this.f9528a, fv4.f9528a) && Intrinsics.areEqual(this.f9529b, fv4.f9529b) && Intrinsics.areEqual(this.f9530c, fv4.f9530c) && Intrinsics.areEqual(this.f9531d, fv4.f9531d) && Intrinsics.areEqual(this.f9532e, fv4.f9532e) && this.f9533f == fv4.f9533f;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RidePassTransferCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f9528a), TuplesKt.m28425to("event_time", this.f9529b), TuplesKt.m28425to("client_time", this.f9530c), TuplesKt.m28425to("user_ride_pass_id", this.f9531d), TuplesKt.m28425to("link_code", this.f9532e), TuplesKt.m28425to("transfers_remaining", Long.valueOf(this.f9533f)));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f9528a.hashCode() * 31) + this.f9529b.hashCode()) * 31) + this.f9530c.hashCode()) * 31) + this.f9531d.hashCode()) * 31) + this.f9532e.hashCode()) * 31) + Long.hashCode(this.f9533f);
    }

    public String toString() {
        String str = this.f9528a;
        DateTime dateTime = this.f9529b;
        DateTime dateTime2 = this.f9530c;
        String str2 = this.f9531d;
        String str3 = this.f9532e;
        long j = this.f9533f;
        return "RidePassTransferCompleted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", userRidePassId=" + str2 + ", linkCode=" + str3 + ", transfersRemaining=" + j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FV4(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, j);
        String str4;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str4 = uuid;
        } else {
            str4 = str;
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
