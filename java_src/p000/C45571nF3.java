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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J_\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LnF3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "rideId", "endRideAttemptId", "verificationMethod", "reason", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getRideId", "f", "getEndRideAttemptId", "g", "getVerificationMethod", "h", "getReason", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nF3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45571nF3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f99687a;

    /* renamed from: b */
    public final DateTime f99688b;

    /* renamed from: c */
    public final DateTime f99689c;

    /* renamed from: d */
    public final String f99690d;

    /* renamed from: e */
    public final String f99691e;

    /* renamed from: f */
    public final String f99692f;

    /* renamed from: g */
    public final String f99693g;

    /* renamed from: h */
    public final String f99694h;

    public C45571nF3(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String verificationMethod, String reason) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f99687a = eventId;
        this.f99688b = eventTime;
        this.f99689c = clientTime;
        this.f99690d = str;
        this.f99691e = str2;
        this.f99692f = str3;
        this.f99693g = verificationMethod;
        this.f99694h = reason;
    }

    /* renamed from: a */
    public final C45571nF3 m24102a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, String verificationMethod, String reason) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new C45571nF3(eventId, eventTime, clientTime, str, str2, str3, verificationMethod, reason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45571nF3) {
            C45571nF3 c45571nF3 = (C45571nF3) obj;
            return Intrinsics.areEqual(this.f99687a, c45571nF3.f99687a) && Intrinsics.areEqual(this.f99688b, c45571nF3.f99688b) && Intrinsics.areEqual(this.f99689c, c45571nF3.f99689c) && Intrinsics.areEqual(this.f99690d, c45571nF3.f99690d) && Intrinsics.areEqual(this.f99691e, c45571nF3.f99691e) && Intrinsics.areEqual(this.f99692f, c45571nF3.f99692f) && Intrinsics.areEqual(this.f99693g, c45571nF3.f99693g) && Intrinsics.areEqual(this.f99694h, c45571nF3.f99694h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingLocationVerificationUnavailable";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f99687a), TuplesKt.m28425to("event_time", this.f99688b), TuplesKt.m28425to("client_time", this.f99689c), TuplesKt.m28425to("bird_id", this.f99690d), TuplesKt.m28425to("ride_id", this.f99691e), TuplesKt.m28425to("end_ride_attempt_id", this.f99692f), TuplesKt.m28425to("verification_method", this.f99693g), TuplesKt.m28425to("reason", this.f99694h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f99687a.hashCode() * 31) + this.f99688b.hashCode()) * 31) + this.f99689c.hashCode()) * 31;
        String str = this.f99690d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99691e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99692f;
        return ((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f99693g.hashCode()) * 31) + this.f99694h.hashCode();
    }

    public String toString() {
        String str = this.f99687a;
        DateTime dateTime = this.f99688b;
        DateTime dateTime2 = this.f99689c;
        String str2 = this.f99690d;
        String str3 = this.f99691e;
        String str4 = this.f99692f;
        String str5 = this.f99693g;
        String str6 = this.f99694h;
        return "ParkingLocationVerificationUnavailable(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", rideId=" + str3 + ", endRideAttemptId=" + str4 + ", verificationMethod=" + str5 + ", reason=" + str6 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C45571nF3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, str5, str6);
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
