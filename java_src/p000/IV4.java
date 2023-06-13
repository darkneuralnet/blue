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
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b*\u0010+JE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000f0$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015¨\u0006,"}, m28432d2 = {"LIV4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "userRidePassId", "linkCode", "", "transfersRemaining", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getUserRidePassId", "e", "getLinkCode", "f", "J", "getTransfersRemaining", "()J", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;J)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IV4 */
/* loaded from: classes4.dex */
public final class IV4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f15814a;

    /* renamed from: b */
    public final DateTime f15815b;

    /* renamed from: c */
    public final DateTime f15816c;

    /* renamed from: d */
    public final String f15817d;

    /* renamed from: e */
    public final String f15818e;

    /* renamed from: f */
    public final long f15819f;

    public IV4(String eventId, DateTime eventTime, DateTime clientTime, String userRidePassId, String linkCode, long j) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        this.f15814a = eventId;
        this.f15815b = eventTime;
        this.f15816c = clientTime;
        this.f15817d = userRidePassId;
        this.f15818e = linkCode;
        this.f15819f = j;
    }

    public static /* synthetic */ IV4 copy$default(IV4 iv4, String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iv4.f15814a;
        }
        if ((i & 2) != 0) {
            dateTime = iv4.f15815b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = iv4.f15816c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = iv4.f15817d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = iv4.f15818e;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            j = iv4.f15819f;
        }
        return iv4.m101968a(str, dateTime3, dateTime4, str4, str5, j);
    }

    /* renamed from: a */
    public final IV4 m101968a(String eventId, DateTime eventTime, DateTime clientTime, String userRidePassId, String linkCode, long j) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(userRidePassId, "userRidePassId");
        Intrinsics.checkNotNullParameter(linkCode, "linkCode");
        return new IV4(eventId, eventTime, clientTime, userRidePassId, linkCode, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IV4) {
            IV4 iv4 = (IV4) obj;
            return Intrinsics.areEqual(this.f15814a, iv4.f15814a) && Intrinsics.areEqual(this.f15815b, iv4.f15815b) && Intrinsics.areEqual(this.f15816c, iv4.f15816c) && Intrinsics.areEqual(this.f15817d, iv4.f15817d) && Intrinsics.areEqual(this.f15818e, iv4.f15818e) && this.f15819f == iv4.f15819f;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RidePassTransferInitiated";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f15814a), TuplesKt.m28425to("event_time", this.f15815b), TuplesKt.m28425to("client_time", this.f15816c), TuplesKt.m28425to("user_ride_pass_id", this.f15817d), TuplesKt.m28425to("link_code", this.f15818e), TuplesKt.m28425to("transfers_remaining", Long.valueOf(this.f15819f)));
        return mapOf;
    }

    public int hashCode() {
        return (((((((((this.f15814a.hashCode() * 31) + this.f15815b.hashCode()) * 31) + this.f15816c.hashCode()) * 31) + this.f15817d.hashCode()) * 31) + this.f15818e.hashCode()) * 31) + Long.hashCode(this.f15819f);
    }

    public String toString() {
        String str = this.f15814a;
        DateTime dateTime = this.f15815b;
        DateTime dateTime2 = this.f15816c;
        String str2 = this.f15817d;
        String str3 = this.f15818e;
        long j = this.f15819f;
        return "RidePassTransferInitiated(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", userRidePassId=" + str2 + ", linkCode=" + str3 + ", transfersRemaining=" + j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IV4(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
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