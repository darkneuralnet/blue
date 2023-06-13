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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+JQ\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LyR4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "parkingEvaluationId", "photoReviewStatus", "rideId", "birdId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getParkingEvaluationId", "e", "getPhotoReviewStatus", "f", "getRideId", "g", "getBirdId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yR4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52201yR4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f119546a;

    /* renamed from: b */
    public final DateTime f119547b;

    /* renamed from: c */
    public final DateTime f119548c;

    /* renamed from: d */
    public final String f119549d;

    /* renamed from: e */
    public final String f119550e;

    /* renamed from: f */
    public final String f119551f;

    /* renamed from: g */
    public final String f119552g;

    public C52201yR4(String eventId, DateTime eventTime, DateTime clientTime, String str, String photoReviewStatus, String rideId, String birdId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(photoReviewStatus, "photoReviewStatus");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f119546a = eventId;
        this.f119547b = eventTime;
        this.f119548c = clientTime;
        this.f119549d = str;
        this.f119550e = photoReviewStatus;
        this.f119551f = rideId;
        this.f119552g = birdId;
    }

    public static /* synthetic */ C52201yR4 copy$default(C52201yR4 c52201yR4, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c52201yR4.f119546a;
        }
        if ((i & 2) != 0) {
            dateTime = c52201yR4.f119547b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c52201yR4.f119548c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c52201yR4.f119549d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = c52201yR4.f119550e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = c52201yR4.f119551f;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = c52201yR4.f119552g;
        }
        return c52201yR4.m3498a(str, dateTime3, dateTime4, str6, str7, str8, str5);
    }

    /* renamed from: a */
    public final C52201yR4 m3498a(String eventId, DateTime eventTime, DateTime clientTime, String str, String photoReviewStatus, String rideId, String birdId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(photoReviewStatus, "photoReviewStatus");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C52201yR4(eventId, eventTime, clientTime, str, photoReviewStatus, rideId, birdId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52201yR4) {
            C52201yR4 c52201yR4 = (C52201yR4) obj;
            return Intrinsics.areEqual(this.f119546a, c52201yR4.f119546a) && Intrinsics.areEqual(this.f119547b, c52201yR4.f119547b) && Intrinsics.areEqual(this.f119548c, c52201yR4.f119548c) && Intrinsics.areEqual(this.f119549d, c52201yR4.f119549d) && Intrinsics.areEqual(this.f119550e, c52201yR4.f119550e) && Intrinsics.areEqual(this.f119551f, c52201yR4.f119551f) && Intrinsics.areEqual(this.f119552g, c52201yR4.f119552g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideHistoryParkingPhotoTapped";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f119546a), TuplesKt.m28425to("event_time", this.f119547b), TuplesKt.m28425to("client_time", this.f119548c), TuplesKt.m28425to("parking_evaluation_id", this.f119549d), TuplesKt.m28425to("photo_review_status", this.f119550e), TuplesKt.m28425to("ride_id", this.f119551f), TuplesKt.m28425to("bird_id", this.f119552g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f119546a.hashCode() * 31) + this.f119547b.hashCode()) * 31) + this.f119548c.hashCode()) * 31;
        String str = this.f119549d;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f119550e.hashCode()) * 31) + this.f119551f.hashCode()) * 31) + this.f119552g.hashCode();
    }

    public String toString() {
        String str = this.f119546a;
        DateTime dateTime = this.f119547b;
        DateTime dateTime2 = this.f119548c;
        String str2 = this.f119549d;
        String str3 = this.f119550e;
        String str4 = this.f119551f;
        String str5 = this.f119552g;
        return "RideHistoryParkingPhotoTapped(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", parkingEvaluationId=" + str2 + ", photoReviewStatus=" + str3 + ", rideId=" + str4 + ", birdId=" + str5 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C52201yR4(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
