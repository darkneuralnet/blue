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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-JY\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\t\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\n\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00110&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016¨\u0006."}, m28432d2 = {"LnW0;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isFirebase", "isAdjust", "isUniversal", "outerDeeplinkUrl", "innerDeeplinkUrl", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "e", "f", "g", "getOuterDeeplinkUrl", "h", "getInnerDeeplinkUrl", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZZLjava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nW0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45721nW0 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f100077a;

    /* renamed from: b */
    public final DateTime f100078b;

    /* renamed from: c */
    public final DateTime f100079c;

    /* renamed from: d */
    public final boolean f100080d;

    /* renamed from: e */
    public final boolean f100081e;

    /* renamed from: f */
    public final boolean f100082f;

    /* renamed from: g */
    public final String f100083g;

    /* renamed from: h */
    public final String f100084h;

    public C45721nW0(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, boolean z3, String outerDeeplinkUrl, String innerDeeplinkUrl) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(outerDeeplinkUrl, "outerDeeplinkUrl");
        Intrinsics.checkNotNullParameter(innerDeeplinkUrl, "innerDeeplinkUrl");
        this.f100077a = eventId;
        this.f100078b = eventTime;
        this.f100079c = clientTime;
        this.f100080d = z;
        this.f100081e = z2;
        this.f100082f = z3;
        this.f100083g = outerDeeplinkUrl;
        this.f100084h = innerDeeplinkUrl;
    }

    /* renamed from: a */
    public final C45721nW0 m23583a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, boolean z3, String outerDeeplinkUrl, String innerDeeplinkUrl) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(outerDeeplinkUrl, "outerDeeplinkUrl");
        Intrinsics.checkNotNullParameter(innerDeeplinkUrl, "innerDeeplinkUrl");
        return new C45721nW0(eventId, eventTime, clientTime, z, z2, z3, outerDeeplinkUrl, innerDeeplinkUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45721nW0) {
            C45721nW0 c45721nW0 = (C45721nW0) obj;
            return Intrinsics.areEqual(this.f100077a, c45721nW0.f100077a) && Intrinsics.areEqual(this.f100078b, c45721nW0.f100078b) && Intrinsics.areEqual(this.f100079c, c45721nW0.f100079c) && this.f100080d == c45721nW0.f100080d && this.f100081e == c45721nW0.f100081e && this.f100082f == c45721nW0.f100082f && Intrinsics.areEqual(this.f100083g, c45721nW0.f100083g) && Intrinsics.areEqual(this.f100084h, c45721nW0.f100084h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.DeeplinkOpened";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f100077a), TuplesKt.m28425to("event_time", this.f100078b), TuplesKt.m28425to("client_time", this.f100079c), TuplesKt.m28425to("is_firebase", Boolean.valueOf(this.f100080d)), TuplesKt.m28425to("is_adjust", Boolean.valueOf(this.f100081e)), TuplesKt.m28425to("is_universal", Boolean.valueOf(this.f100082f)), TuplesKt.m28425to("outer_deeplink_url", this.f100083g), TuplesKt.m28425to("inner_deeplink_url", this.f100084h));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f100077a.hashCode() * 31) + this.f100078b.hashCode()) * 31) + this.f100079c.hashCode()) * 31;
        boolean z = this.f100080d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f100081e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f100082f;
        return ((((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.f100083g.hashCode()) * 31) + this.f100084h.hashCode();
    }

    public String toString() {
        String str = this.f100077a;
        DateTime dateTime = this.f100078b;
        DateTime dateTime2 = this.f100079c;
        boolean z = this.f100080d;
        boolean z2 = this.f100081e;
        boolean z3 = this.f100082f;
        String str2 = this.f100083g;
        String str3 = this.f100084h;
        return "DeeplinkOpened(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isFirebase=" + z + ", isAdjust=" + z2 + ", isUniversal=" + z3 + ", outerDeeplinkUrl=" + str2 + ", innerDeeplinkUrl=" + str3 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C45721nW0(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, boolean z3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, z, z2, z3, str2, str3);
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
