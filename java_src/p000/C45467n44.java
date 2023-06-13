package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b1\u00102Jj\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018¨\u00063"}, m28432d2 = {"Ln44;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "birdModel", "firmwareType", "", "firmwareVersionCurrent", "firmwareVersionSuggested", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)Ln44;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getBirdModel", "f", "getFirmwareType", "g", "Ljava/lang/Float;", "getFirmwareVersionCurrent", "()Ljava/lang/Float;", "h", "getFirmwareVersionSuggested", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: n44  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45467n44 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f99300a;

    /* renamed from: b */
    public final DateTime f99301b;

    /* renamed from: c */
    public final DateTime f99302c;

    /* renamed from: d */
    public final String f99303d;

    /* renamed from: e */
    public final String f99304e;

    /* renamed from: f */
    public final String f99305f;

    /* renamed from: g */
    public final Float f99306g;

    /* renamed from: h */
    public final Float f99307h;

    public C45467n44() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    /* renamed from: a */
    public final C45467n44 m24491a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C45467n44(eventId, eventTime, clientTime, str, str2, str3, f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45467n44) {
            C45467n44 c45467n44 = (C45467n44) obj;
            return Intrinsics.areEqual(this.f99300a, c45467n44.f99300a) && Intrinsics.areEqual(this.f99301b, c45467n44.f99301b) && Intrinsics.areEqual(this.f99302c, c45467n44.f99302c) && Intrinsics.areEqual(this.f99303d, c45467n44.f99303d) && Intrinsics.areEqual(this.f99304e, c45467n44.f99304e) && Intrinsics.areEqual(this.f99305f, c45467n44.f99305f) && Intrinsics.areEqual((Object) this.f99306g, (Object) c45467n44.f99306g) && Intrinsics.areEqual((Object) this.f99307h, (Object) c45467n44.f99307h);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PrivateBirdFirmwareUpdateStart";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f99300a), TuplesKt.m28425to("event_time", this.f99301b), TuplesKt.m28425to("client_time", this.f99302c), TuplesKt.m28425to("bird_id", this.f99303d), TuplesKt.m28425to("bird_model", this.f99304e), TuplesKt.m28425to("firmware_type", this.f99305f), TuplesKt.m28425to("firmware_version_current", this.f99306g), TuplesKt.m28425to("firmware_version_suggested", this.f99307h));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f99300a.hashCode() * 31) + this.f99301b.hashCode()) * 31) + this.f99302c.hashCode()) * 31;
        String str = this.f99303d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99304e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99305f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f99306g;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f99307h;
        return hashCode5 + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f99300a;
        DateTime dateTime = this.f99301b;
        DateTime dateTime2 = this.f99302c;
        String str2 = this.f99303d;
        String str3 = this.f99304e;
        String str4 = this.f99305f;
        Float f = this.f99306g;
        Float f2 = this.f99307h;
        return "PrivateBirdFirmwareUpdateStart(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", birdModel=" + str3 + ", firmwareType=" + str4 + ", firmwareVersionCurrent=" + f + ", firmwareVersionSuggested=" + f2 + ")";
    }

    public C45467n44(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f99300a = eventId;
        this.f99301b = eventTime;
        this.f99302c = clientTime;
        this.f99303d = str;
        this.f99304e = str2;
        this.f99305f = str3;
        this.f99306g = f;
        this.f99307h = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C45467n44(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : f, (i & 128) == 0 ? f2 : null);
        String str5;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str5 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str5, "randomUUID().toString()");
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
        if ((i & 4) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        } else {
            dateTime4 = dateTime2;
        }
    }
}