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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+JQ\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LlH3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "parkingEvaluationId", "photoReviewStatus", "photoBadReason", "rideId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getParkingEvaluationId", "e", "getPhotoReviewStatus", "f", "getPhotoBadReason", "g", "getRideId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lH3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44403lH3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f95831a;

    /* renamed from: b */
    public final DateTime f95832b;

    /* renamed from: c */
    public final DateTime f95833c;

    /* renamed from: d */
    public final String f95834d;

    /* renamed from: e */
    public final String f95835e;

    /* renamed from: f */
    public final String f95836f;

    /* renamed from: g */
    public final String f95837g;

    public C44403lH3(String eventId, DateTime eventTime, DateTime clientTime, String str, String photoReviewStatus, String photoBadReason, String rideId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(photoReviewStatus, "photoReviewStatus");
        Intrinsics.checkNotNullParameter(photoBadReason, "photoBadReason");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        this.f95831a = eventId;
        this.f95832b = eventTime;
        this.f95833c = clientTime;
        this.f95834d = str;
        this.f95835e = photoReviewStatus;
        this.f95836f = photoBadReason;
        this.f95837g = rideId;
    }

    public static /* synthetic */ C44403lH3 copy$default(C44403lH3 c44403lH3, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c44403lH3.f95831a;
        }
        if ((i & 2) != 0) {
            dateTime = c44403lH3.f95832b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c44403lH3.f95833c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c44403lH3.f95834d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = c44403lH3.f95835e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c44403lH3.f95836f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c44403lH3.f95837g;
        }
        return c44403lH3.m27442a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final C44403lH3 m27442a(String eventId, DateTime eventTime, DateTime clientTime, String str, String photoReviewStatus, String photoBadReason, String rideId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(photoReviewStatus, "photoReviewStatus");
        Intrinsics.checkNotNullParameter(photoBadReason, "photoBadReason");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        return new C44403lH3(eventId, eventTime, clientTime, str, photoReviewStatus, photoBadReason, rideId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44403lH3) {
            C44403lH3 c44403lH3 = (C44403lH3) obj;
            return Intrinsics.areEqual(this.f95831a, c44403lH3.f95831a) && Intrinsics.areEqual(this.f95832b, c44403lH3.f95832b) && Intrinsics.areEqual(this.f95833c, c44403lH3.f95833c) && Intrinsics.areEqual(this.f95834d, c44403lH3.f95834d) && Intrinsics.areEqual(this.f95835e, c44403lH3.f95835e) && Intrinsics.areEqual(this.f95836f, c44403lH3.f95836f) && Intrinsics.areEqual(this.f95837g, c44403lH3.f95837g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingRatingContactSupportTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f95831a), TuplesKt.m28425to("event_time", this.f95832b), TuplesKt.m28425to("client_time", this.f95833c), TuplesKt.m28425to("parking_evaluation_id", this.f95834d), TuplesKt.m28425to("photo_review_status", this.f95835e), TuplesKt.m28425to("photo_bad_reason", this.f95836f), TuplesKt.m28425to("ride_id", this.f95837g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f95831a.hashCode() * 31) + this.f95832b.hashCode()) * 31) + this.f95833c.hashCode()) * 31;
        String str = this.f95834d;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95835e.hashCode()) * 31) + this.f95836f.hashCode()) * 31) + this.f95837g.hashCode();
    }

    public String toString() {
        String str = this.f95831a;
        DateTime dateTime = this.f95832b;
        DateTime dateTime2 = this.f95833c;
        String str2 = this.f95834d;
        String str3 = this.f95835e;
        String str4 = this.f95836f;
        String str5 = this.f95837g;
        return "ParkingRatingContactSupportTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", parkingEvaluationId=" + str2 + ", photoReviewStatus=" + str3 + ", photoBadReason=" + str4 + ", rideId=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44403lH3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : str2, str3, str4, str5);
        String str6;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str6 = uuid;
        } else {
            str6 = str;
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
