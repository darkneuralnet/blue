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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b&\u0010'J=\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013¨\u0006("}, m28432d2 = {"LpG3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "nearestNestId", "", "confirmedPark", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getNearestNestId", "e", "Z", "getConfirmedPark", "()Z", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pG3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46766pG3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f103364a;

    /* renamed from: b */
    public final DateTime f103365b;

    /* renamed from: c */
    public final DateTime f103366c;

    /* renamed from: d */
    public final String f103367d;

    /* renamed from: e */
    public final boolean f103368e;

    public C46766pG3(String eventId, DateTime eventTime, DateTime clientTime, String str, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f103364a = eventId;
        this.f103365b = eventTime;
        this.f103366c = clientTime;
        this.f103367d = str;
        this.f103368e = z;
    }

    public static /* synthetic */ C46766pG3 copy$default(C46766pG3 c46766pG3, String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c46766pG3.f103364a;
        }
        if ((i & 2) != 0) {
            dateTime = c46766pG3.f103365b;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 4) != 0) {
            dateTime2 = c46766pG3.f103366c;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 8) != 0) {
            str2 = c46766pG3.f103367d;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            z = c46766pG3.f103368e;
        }
        return c46766pG3.m19681a(str, dateTime3, dateTime4, str3, z);
    }

    /* renamed from: a */
    public final C46766pG3 m19681a(String eventId, DateTime eventTime, DateTime clientTime, String str, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C46766pG3(eventId, eventTime, clientTime, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46766pG3) {
            C46766pG3 c46766pG3 = (C46766pG3) obj;
            return Intrinsics.areEqual(this.f103364a, c46766pG3.f103364a) && Intrinsics.areEqual(this.f103365b, c46766pG3.f103365b) && Intrinsics.areEqual(this.f103366c, c46766pG3.f103366c) && Intrinsics.areEqual(this.f103367d, c46766pG3.f103367d) && this.f103368e == c46766pG3.f103368e;
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingOverrideDialogResponded";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f103364a), TuplesKt.m28425to("event_time", this.f103365b), TuplesKt.m28425to("client_time", this.f103366c), TuplesKt.m28425to("nearest_nest_id", this.f103367d), TuplesKt.m28425to("confirmed_park", Boolean.valueOf(this.f103368e)));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f103364a.hashCode() * 31) + this.f103365b.hashCode()) * 31) + this.f103366c.hashCode()) * 31;
        String str = this.f103367d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f103368e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f103364a;
        DateTime dateTime = this.f103365b;
        DateTime dateTime2 = this.f103366c;
        String str2 = this.f103367d;
        boolean z = this.f103368e;
        return "ParkingOverrideDialogResponded(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", nearestNestId=" + str2 + ", confirmedPark=" + z + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C46766pG3(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, dateTime2, (i & 8) != 0 ? null : str2, z);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        String str3 = str;
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
