package p000;

import ch.qos.logback.core.CoreConstants;
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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b>\u0010?J\u009b\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u0019\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u001bR\"\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0016088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001b¨\u0006@"}, m28432d2 = {"LRS3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", CoreConstants.CONTEXT_SCOPE_VALUE, "", "success", "smartlockId", "physicalLockId", "birdId", "rideId", "physicalLockKind", "physicalLockPurpose", "errorType", "networkError", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getContext", "e", "Z", "getSuccess", "()Z", "f", "getSmartlockId", "g", "getPhysicalLockId", "h", "getBirdId", "i", "getRideId", "j", "getPhysicalLockKind", "k", "getPhysicalLockPurpose", "l", "getErrorType", "m", "getNetworkError", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RS3 */
/* loaded from: classes4.dex */
public final class RS3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f32042a;

    /* renamed from: b */
    public final DateTime f32043b;

    /* renamed from: c */
    public final DateTime f32044c;

    /* renamed from: d */
    public final String f32045d;

    /* renamed from: e */
    public final boolean f32046e;

    /* renamed from: f */
    public final String f32047f;

    /* renamed from: g */
    public final String f32048g;

    /* renamed from: h */
    public final String f32049h;

    /* renamed from: i */
    public final String f32050i;

    /* renamed from: j */
    public final String f32051j;

    /* renamed from: k */
    public final String f32052k;

    /* renamed from: l */
    public final String f32053l;

    /* renamed from: m */
    public final String f32054m;

    public RS3(String eventId, DateTime eventTime, DateTime clientTime, String context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32042a = eventId;
        this.f32043b = eventTime;
        this.f32044c = clientTime;
        this.f32045d = context;
        this.f32046e = z;
        this.f32047f = str;
        this.f32048g = str2;
        this.f32049h = str3;
        this.f32050i = str4;
        this.f32051j = str5;
        this.f32052k = str6;
        this.f32053l = str7;
        this.f32054m = str8;
    }

    /* renamed from: a */
    public final RS3 m86738a(String eventId, DateTime eventTime, DateTime clientTime, String context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(context, "context");
        return new RS3(eventId, eventTime, clientTime, context, z, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RS3) {
            RS3 rs3 = (RS3) obj;
            return Intrinsics.areEqual(this.f32042a, rs3.f32042a) && Intrinsics.areEqual(this.f32043b, rs3.f32043b) && Intrinsics.areEqual(this.f32044c, rs3.f32044c) && Intrinsics.areEqual(this.f32045d, rs3.f32045d) && this.f32046e == rs3.f32046e && Intrinsics.areEqual(this.f32047f, rs3.f32047f) && Intrinsics.areEqual(this.f32048g, rs3.f32048g) && Intrinsics.areEqual(this.f32049h, rs3.f32049h) && Intrinsics.areEqual(this.f32050i, rs3.f32050i) && Intrinsics.areEqual(this.f32051j, rs3.f32051j) && Intrinsics.areEqual(this.f32052k, rs3.f32052k) && Intrinsics.areEqual(this.f32053l, rs3.f32053l) && Intrinsics.areEqual(this.f32054m, rs3.f32054m);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PhysicalLockSmartlockOpened";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f32042a), TuplesKt.m28425to("event_time", this.f32043b), TuplesKt.m28425to("client_time", this.f32044c), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f32045d), TuplesKt.m28425to("success", Boolean.valueOf(this.f32046e)), TuplesKt.m28425to("smartlock_id", this.f32047f), TuplesKt.m28425to("physical_lock_id", this.f32048g), TuplesKt.m28425to("bird_id", this.f32049h), TuplesKt.m28425to("ride_id", this.f32050i), TuplesKt.m28425to("physical_lock_kind", this.f32051j), TuplesKt.m28425to("physical_lock_purpose", this.f32052k), TuplesKt.m28425to("error_type", this.f32053l), TuplesKt.m28425to("network_error", this.f32054m));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f32042a.hashCode() * 31) + this.f32043b.hashCode()) * 31) + this.f32044c.hashCode()) * 31) + this.f32045d.hashCode()) * 31;
        boolean z = this.f32046e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.f32047f;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f32048g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f32049h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f32050i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f32051j;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f32052k;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f32053l;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f32054m;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.f32042a;
        DateTime dateTime = this.f32043b;
        DateTime dateTime2 = this.f32044c;
        String str2 = this.f32045d;
        boolean z = this.f32046e;
        String str3 = this.f32047f;
        String str4 = this.f32048g;
        String str5 = this.f32049h;
        String str6 = this.f32050i;
        String str7 = this.f32051j;
        String str8 = this.f32052k;
        String str9 = this.f32053l;
        String str10 = this.f32054m;
        return "PhysicalLockSmartlockOpened(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", context=" + str2 + ", success=" + z + ", smartlockId=" + str3 + ", physicalLockId=" + str4 + ", birdId=" + str5 + ", rideId=" + str6 + ", physicalLockKind=" + str7 + ", physicalLockPurpose=" + str8 + ", errorType=" + str9 + ", networkError=" + str10 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RS3(String str, DateTime dateTime, DateTime dateTime2, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, z, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10);
        String str11;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str11 = uuid;
        } else {
            str11 = str;
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
