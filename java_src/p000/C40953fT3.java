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
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b3\u00104Jw\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\"\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0018¨\u00065"}, m28432d2 = {"LfT3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "tutorialKind", "physicalLockId", "birdId", "rideId", "physicalLockKind", "physicalLockPurpose", "endRideAttemptId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getTutorialKind", "e", "getPhysicalLockId", "f", "getBirdId", "g", "getRideId", "h", "getPhysicalLockKind", "i", "getPhysicalLockPurpose", "j", "getEndRideAttemptId", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fT3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40953fT3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f80195a;

    /* renamed from: b */
    public final DateTime f80196b;

    /* renamed from: c */
    public final DateTime f80197c;

    /* renamed from: d */
    public final String f80198d;

    /* renamed from: e */
    public final String f80199e;

    /* renamed from: f */
    public final String f80200f;

    /* renamed from: g */
    public final String f80201g;

    /* renamed from: h */
    public final String f80202h;

    /* renamed from: i */
    public final String f80203i;

    /* renamed from: j */
    public final String f80204j;

    public C40953fT3(String eventId, DateTime eventTime, DateTime clientTime, String tutorialKind, String physicalLockId, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(tutorialKind, "tutorialKind");
        Intrinsics.checkNotNullParameter(physicalLockId, "physicalLockId");
        this.f80195a = eventId;
        this.f80196b = eventTime;
        this.f80197c = clientTime;
        this.f80198d = tutorialKind;
        this.f80199e = physicalLockId;
        this.f80200f = str;
        this.f80201g = str2;
        this.f80202h = str3;
        this.f80203i = str4;
        this.f80204j = str5;
    }

    /* renamed from: a */
    public final C40953fT3 m41297a(String eventId, DateTime eventTime, DateTime clientTime, String tutorialKind, String physicalLockId, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(tutorialKind, "tutorialKind");
        Intrinsics.checkNotNullParameter(physicalLockId, "physicalLockId");
        return new C40953fT3(eventId, eventTime, clientTime, tutorialKind, physicalLockId, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40953fT3) {
            C40953fT3 c40953fT3 = (C40953fT3) obj;
            return Intrinsics.areEqual(this.f80195a, c40953fT3.f80195a) && Intrinsics.areEqual(this.f80196b, c40953fT3.f80196b) && Intrinsics.areEqual(this.f80197c, c40953fT3.f80197c) && Intrinsics.areEqual(this.f80198d, c40953fT3.f80198d) && Intrinsics.areEqual(this.f80199e, c40953fT3.f80199e) && Intrinsics.areEqual(this.f80200f, c40953fT3.f80200f) && Intrinsics.areEqual(this.f80201g, c40953fT3.f80201g) && Intrinsics.areEqual(this.f80202h, c40953fT3.f80202h) && Intrinsics.areEqual(this.f80203i, c40953fT3.f80203i) && Intrinsics.areEqual(this.f80204j, c40953fT3.f80204j);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.PhysicalLockTutorialViewed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f80195a), TuplesKt.m28425to("event_time", this.f80196b), TuplesKt.m28425to("client_time", this.f80197c), TuplesKt.m28425to("tutorial_kind", this.f80198d), TuplesKt.m28425to("physical_lock_id", this.f80199e), TuplesKt.m28425to("bird_id", this.f80200f), TuplesKt.m28425to("ride_id", this.f80201g), TuplesKt.m28425to("physical_lock_kind", this.f80202h), TuplesKt.m28425to("physical_lock_purpose", this.f80203i), TuplesKt.m28425to("end_ride_attempt_id", this.f80204j));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f80195a.hashCode() * 31) + this.f80196b.hashCode()) * 31) + this.f80197c.hashCode()) * 31) + this.f80198d.hashCode()) * 31) + this.f80199e.hashCode()) * 31;
        String str = this.f80200f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80201g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80202h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80203i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f80204j;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f80195a;
        DateTime dateTime = this.f80196b;
        DateTime dateTime2 = this.f80197c;
        String str2 = this.f80198d;
        String str3 = this.f80199e;
        String str4 = this.f80200f;
        String str5 = this.f80201g;
        String str6 = this.f80202h;
        String str7 = this.f80203i;
        String str8 = this.f80204j;
        return "PhysicalLockTutorialViewed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", tutorialKind=" + str2 + ", physicalLockId=" + str3 + ", birdId=" + str4 + ", rideId=" + str5 + ", physicalLockKind=" + str6 + ", physicalLockPurpose=" + str7 + ", endRideAttemptId=" + str8 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C40953fT3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8);
        String str9;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str9 = uuid;
        } else {
            str9 = str;
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
