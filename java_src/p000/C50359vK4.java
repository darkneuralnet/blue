package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b-\u0010.J_\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0016¨\u0006/"}, m28432d2 = {"LvK4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "reservationId", "", "issues", "feedback", "photoUrls", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getReservationId", "e", "Ljava/util/List;", "getIssues", "()Ljava/util/List;", "f", "getFeedback", "g", "getPhotoUrls", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vK4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50359vK4 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f113838a;

    /* renamed from: b */
    public final DateTime f113839b;

    /* renamed from: c */
    public final DateTime f113840c;

    /* renamed from: d */
    public final String f113841d;

    /* renamed from: e */
    public final List<String> f113842e;

    /* renamed from: f */
    public final String f113843f;

    /* renamed from: g */
    public final List<String> f113844g;

    public C50359vK4(String eventId, DateTime eventTime, DateTime clientTime, String reservationId, List<String> list, String str, List<String> photoUrls) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        this.f113838a = eventId;
        this.f113839b = eventTime;
        this.f113840c = clientTime;
        this.f113841d = reservationId;
        this.f113842e = list;
        this.f113843f = str;
        this.f113844g = photoUrls;
    }

    public static /* synthetic */ C50359vK4 copy$default(C50359vK4 c50359vK4, String str, DateTime dateTime, DateTime dateTime2, String str2, List list, String str3, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c50359vK4.f113838a;
        }
        if ((i & 2) != 0) {
            dateTime = c50359vK4.f113839b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c50359vK4.f113840c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c50359vK4.f113841d;
        }
        String str4 = str2;
        List<String> list3 = list;
        if ((i & 16) != 0) {
            list3 = c50359vK4.f113842e;
        }
        List list4 = list3;
        if ((i & 32) != 0) {
            str3 = c50359vK4.f113843f;
        }
        String str5 = str3;
        List<String> list5 = list2;
        if ((i & 64) != 0) {
            list5 = c50359vK4.f113844g;
        }
        return c50359vK4.m8891a(str, dateTime3, dateTime4, str4, list4, str5, list5);
    }

    /* renamed from: a */
    public final C50359vK4 m8891a(String eventId, DateTime eventTime, DateTime clientTime, String reservationId, List<String> list, String str, List<String> photoUrls) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        return new C50359vK4(eventId, eventTime, clientTime, reservationId, list, str, photoUrls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50359vK4) {
            C50359vK4 c50359vK4 = (C50359vK4) obj;
            return Intrinsics.areEqual(this.f113838a, c50359vK4.f113838a) && Intrinsics.areEqual(this.f113839b, c50359vK4.f113839b) && Intrinsics.areEqual(this.f113840c, c50359vK4.f113840c) && Intrinsics.areEqual(this.f113841d, c50359vK4.f113841d) && Intrinsics.areEqual(this.f113842e, c50359vK4.f113842e) && Intrinsics.areEqual(this.f113843f, c50359vK4.f113843f) && Intrinsics.areEqual(this.f113844g, c50359vK4.f113844g);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ReservationCancelationFeedbackSubmitted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f113838a), TuplesKt.m28425to("event_time", this.f113839b), TuplesKt.m28425to("client_time", this.f113840c), TuplesKt.m28425to("reservation_id", this.f113841d), TuplesKt.m28425to("issues", this.f113842e), TuplesKt.m28425to("feedback", this.f113843f), TuplesKt.m28425to("photo_urls", this.f113844g));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f113838a.hashCode() * 31) + this.f113839b.hashCode()) * 31) + this.f113840c.hashCode()) * 31) + this.f113841d.hashCode()) * 31;
        List<String> list = this.f113842e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f113843f;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f113844g.hashCode();
    }

    public String toString() {
        String str = this.f113838a;
        DateTime dateTime = this.f113839b;
        DateTime dateTime2 = this.f113840c;
        String str2 = this.f113841d;
        List<String> list = this.f113842e;
        String str3 = this.f113843f;
        List<String> list2 = this.f113844g;
        return "ReservationCancelationFeedbackSubmitted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", reservationId=" + str2 + ", issues=" + list + ", feedback=" + str3 + ", photoUrls=" + list2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50359vK4(String str, DateTime dateTime, DateTime dateTime2, String str2, List list, String str3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str3, list2);
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
