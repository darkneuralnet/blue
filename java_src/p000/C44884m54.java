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
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b0\u00101JY\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\r\u0010)R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0016¨\u00062"}, m28432d2 = {"Lm54;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "ownershipKind", "", "displayedDistanceMeters", "displayedDistance", "", "isDisplayedInMetric", C17296a.f69688o, "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getOwnershipKind", "f", "I", "getDisplayedDistanceMeters", "()I", "g", "getDisplayedDistance", "h", "Z", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m54  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44884m54 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f97317a;

    /* renamed from: b */
    public final DateTime f97318b;

    /* renamed from: c */
    public final DateTime f97319c;

    /* renamed from: d */
    public final String f97320d;

    /* renamed from: e */
    public final String f97321e;

    /* renamed from: f */
    public final int f97322f;

    /* renamed from: g */
    public final String f97323g;

    /* renamed from: h */
    public final boolean f97324h;

    public C44884m54(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String ownershipKind, int i, String displayedDistance, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(ownershipKind, "ownershipKind");
        Intrinsics.checkNotNullParameter(displayedDistance, "displayedDistance");
        this.f97317a = eventId;
        this.f97318b = eventTime;
        this.f97319c = clientTime;
        this.f97320d = birdId;
        this.f97321e = ownershipKind;
        this.f97322f = i;
        this.f97323g = displayedDistance;
        this.f97324h = z;
    }

    /* renamed from: a */
    public final C44884m54 m26358a(String eventId, DateTime eventTime, DateTime clientTime, String birdId, String ownershipKind, int i, String displayedDistance, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(ownershipKind, "ownershipKind");
        Intrinsics.checkNotNullParameter(displayedDistance, "displayedDistance");
        return new C44884m54(eventId, eventTime, clientTime, birdId, ownershipKind, i, displayedDistance, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44884m54) {
            C44884m54 c44884m54 = (C44884m54) obj;
            return Intrinsics.areEqual(this.f97317a, c44884m54.f97317a) && Intrinsics.areEqual(this.f97318b, c44884m54.f97318b) && Intrinsics.areEqual(this.f97319c, c44884m54.f97319c) && Intrinsics.areEqual(this.f97320d, c44884m54.f97320d) && Intrinsics.areEqual(this.f97321e, c44884m54.f97321e) && this.f97322f == c44884m54.f97322f && Intrinsics.areEqual(this.f97323g, c44884m54.f97323g) && this.f97324h == c44884m54.f97324h;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PrivateBirdTotalDistanceDisplayed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f97317a), TuplesKt.m28425to("event_time", this.f97318b), TuplesKt.m28425to("client_time", this.f97319c), TuplesKt.m28425to("bird_id", this.f97320d), TuplesKt.m28425to("ownership_kind", this.f97321e), TuplesKt.m28425to("displayed_distance_meters", Integer.valueOf(this.f97322f)), TuplesKt.m28425to("displayed_distance", this.f97323g), TuplesKt.m28425to("is_displayed_in_metric", Boolean.valueOf(this.f97324h)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.f97317a.hashCode() * 31) + this.f97318b.hashCode()) * 31) + this.f97319c.hashCode()) * 31) + this.f97320d.hashCode()) * 31) + this.f97321e.hashCode()) * 31) + Integer.hashCode(this.f97322f)) * 31) + this.f97323g.hashCode()) * 31;
        boolean z = this.f97324h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f97317a;
        DateTime dateTime = this.f97318b;
        DateTime dateTime2 = this.f97319c;
        String str2 = this.f97320d;
        String str3 = this.f97321e;
        int i = this.f97322f;
        String str4 = this.f97323g;
        boolean z = this.f97324h;
        return "PrivateBirdTotalDistanceDisplayed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", ownershipKind=" + str3 + ", displayedDistanceMeters=" + i + ", displayedDistance=" + str4 + ", isDisplayedInMetric=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44884m54(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, int i, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, str2, str3, i, str4, z);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i2 & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str5 = uuid;
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
        if ((i2 & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime4 = now2;
        } else {
            dateTime4 = dateTime2;
        }
    }
}
