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
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b7\u00108Jv\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\"\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0014018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001a¨\u00069"}, m28432d2 = {"Lo44;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "birdModel", "firmwareType", "", "firmwareVersionCurrent", "firmwareVersionSuggested", "", "duration", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Long;)Lo44;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getBirdModel", "f", "getFirmwareType", "g", "Ljava/lang/Float;", "getFirmwareVersionCurrent", "()Ljava/lang/Float;", "h", "getFirmwareVersionSuggested", "i", "Ljava/lang/Long;", "getDuration", "()Ljava/lang/Long;", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: o44  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46060o44 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f101310a;

    /* renamed from: b */
    public final DateTime f101311b;

    /* renamed from: c */
    public final DateTime f101312c;

    /* renamed from: d */
    public final String f101313d;

    /* renamed from: e */
    public final String f101314e;

    /* renamed from: f */
    public final String f101315f;

    /* renamed from: g */
    public final Float f101316g;

    /* renamed from: h */
    public final Float f101317h;

    /* renamed from: i */
    public final Long f101318i;

    public C46060o44() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: a */
    public final C46060o44 m21847a(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, Float f, Float f2, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new C46060o44(eventId, eventTime, clientTime, str, str2, str3, f, f2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46060o44) {
            C46060o44 c46060o44 = (C46060o44) obj;
            return Intrinsics.areEqual(this.f101310a, c46060o44.f101310a) && Intrinsics.areEqual(this.f101311b, c46060o44.f101311b) && Intrinsics.areEqual(this.f101312c, c46060o44.f101312c) && Intrinsics.areEqual(this.f101313d, c46060o44.f101313d) && Intrinsics.areEqual(this.f101314e, c46060o44.f101314e) && Intrinsics.areEqual(this.f101315f, c46060o44.f101315f) && Intrinsics.areEqual((Object) this.f101316g, (Object) c46060o44.f101316g) && Intrinsics.areEqual((Object) this.f101317h, (Object) c46060o44.f101317h) && Intrinsics.areEqual(this.f101318i, c46060o44.f101318i);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PrivateBirdFirmwareUpdateSuccess";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f101310a), TuplesKt.m28425to("event_time", this.f101311b), TuplesKt.m28425to("client_time", this.f101312c), TuplesKt.m28425to("bird_id", this.f101313d), TuplesKt.m28425to("bird_model", this.f101314e), TuplesKt.m28425to("firmware_type", this.f101315f), TuplesKt.m28425to("firmware_version_current", this.f101316g), TuplesKt.m28425to("firmware_version_suggested", this.f101317h), TuplesKt.m28425to("duration", this.f101318i));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f101310a.hashCode() * 31) + this.f101311b.hashCode()) * 31) + this.f101312c.hashCode()) * 31;
        String str = this.f101313d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101314e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f101315f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.f101316g;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f101317h;
        int hashCode6 = (hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Long l = this.f101318i;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.f101310a;
        DateTime dateTime = this.f101311b;
        DateTime dateTime2 = this.f101312c;
        String str2 = this.f101313d;
        String str3 = this.f101314e;
        String str4 = this.f101315f;
        Float f = this.f101316g;
        Float f2 = this.f101317h;
        Long l = this.f101318i;
        return "PrivateBirdFirmwareUpdateSuccess(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", birdModel=" + str3 + ", firmwareType=" + str4 + ", firmwareVersionCurrent=" + f + ", firmwareVersionSuggested=" + f2 + ", duration=" + l + ")";
    }

    public C46060o44(String eventId, DateTime eventTime, DateTime clientTime, String str, String str2, String str3, Float f, Float f2, Long l) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f101310a = eventId;
        this.f101311b = eventTime;
        this.f101312c = clientTime;
        this.f101313d = str;
        this.f101314e = str2;
        this.f101315f = str3;
        this.f101316g = f;
        this.f101317h = f2;
        this.f101318i = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C46060o44(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, Float f, Float f2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : f2, (i & 256) == 0 ? l : null);
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
