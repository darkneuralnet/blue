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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(JG\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, m28432d2 = {"LkH3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "parkingEvaluationId", "photoReviewStatus", "rideId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getParkingEvaluationId", "e", "getPhotoReviewStatus", "f", "getRideId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kH3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43810kH3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f94197a;

    /* renamed from: b */
    public final DateTime f94198b;

    /* renamed from: c */
    public final DateTime f94199c;

    /* renamed from: d */
    public final String f94200d;

    /* renamed from: e */
    public final String f94201e;

    /* renamed from: f */
    public final String f94202f;

    public C43810kH3(String eventId, DateTime eventTime, DateTime clientTime, String str, String photoReviewStatus, String rideId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(photoReviewStatus, "photoReviewStatus");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        this.f94197a = eventId;
        this.f94198b = eventTime;
        this.f94199c = clientTime;
        this.f94200d = str;
        this.f94201e = photoReviewStatus;
        this.f94202f = rideId;
    }

    public static /* synthetic */ C43810kH3 copy$default(C43810kH3 c43810kH3, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43810kH3.f94197a;
        }
        if ((i & 2) != 0) {
            dateTime = c43810kH3.f94198b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c43810kH3.f94199c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c43810kH3.f94200d;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = c43810kH3.f94201e;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = c43810kH3.f94202f;
        }
        return c43810kH3.m29105a(str, dateTime3, dateTime4, str5, str6, str4);
    }

    /* renamed from: a */
    public final C43810kH3 m29105a(String eventId, DateTime eventTime, DateTime clientTime, String str, String photoReviewStatus, String rideId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(photoReviewStatus, "photoReviewStatus");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        return new C43810kH3(eventId, eventTime, clientTime, str, photoReviewStatus, rideId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43810kH3) {
            C43810kH3 c43810kH3 = (C43810kH3) obj;
            return Intrinsics.areEqual(this.f94197a, c43810kH3.f94197a) && Intrinsics.areEqual(this.f94198b, c43810kH3.f94198b) && Intrinsics.areEqual(this.f94199c, c43810kH3.f94199c) && Intrinsics.areEqual(this.f94200d, c43810kH3.f94200d) && Intrinsics.areEqual(this.f94201e, c43810kH3.f94201e) && Intrinsics.areEqual(this.f94202f, c43810kH3.f94202f);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingRatingContactSupportSubmitted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f94197a), TuplesKt.m28425to("event_time", this.f94198b), TuplesKt.m28425to("client_time", this.f94199c), TuplesKt.m28425to("parking_evaluation_id", this.f94200d), TuplesKt.m28425to("photo_review_status", this.f94201e), TuplesKt.m28425to("ride_id", this.f94202f));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f94197a.hashCode() * 31) + this.f94198b.hashCode()) * 31) + this.f94199c.hashCode()) * 31;
        String str = this.f94200d;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94201e.hashCode()) * 31) + this.f94202f.hashCode();
    }

    public String toString() {
        String str = this.f94197a;
        DateTime dateTime = this.f94198b;
        DateTime dateTime2 = this.f94199c;
        String str2 = this.f94200d;
        String str3 = this.f94201e;
        String str4 = this.f94202f;
        return "ParkingRatingContactSupportSubmitted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", parkingEvaluationId=" + str2 + ", photoReviewStatus=" + str3 + ", rideId=" + str4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43810kH3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : str2, str3, str4);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str5 = str;
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
