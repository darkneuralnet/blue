package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b<\u0010=J\u0098\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\"\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0016068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001b¨\u0006>"}, m28432d2 = {"LlF3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "verificationMethod", "rideId", "closestNestId", "", "insideNest", "endRideAttemptId", "sessionId", CoreConstants.CONTEXT_SCOPE_VALUE, "skipBirdScan", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)LlF3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getVerificationMethod", "f", "getRideId", "g", "getClosestNestId", "h", "Ljava/lang/Boolean;", "getInsideNest", "()Ljava/lang/Boolean;", "i", "getEndRideAttemptId", "j", "getSessionId", "k", "getContext", "l", "getSkipBirdScan", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lF3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44385lF3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f95780a;

    /* renamed from: b */
    public final DateTime f95781b;

    /* renamed from: c */
    public final DateTime f95782c;

    /* renamed from: d */
    public final String f95783d;

    /* renamed from: e */
    public final String f95784e;

    /* renamed from: f */
    public final String f95785f;

    /* renamed from: g */
    public final String f95786g;

    /* renamed from: h */
    public final Boolean f95787h;

    /* renamed from: i */
    public final String f95788i;

    /* renamed from: j */
    public final String f95789j;

    /* renamed from: k */
    public final String f95790k;

    /* renamed from: l */
    public final Boolean f95791l;

    public C44385lF3(String eventId, DateTime eventTime, DateTime clientTime, String str, String verificationMethod, String str2, String str3, Boolean bool, String str4, String str5, String str6, Boolean bool2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        this.f95780a = eventId;
        this.f95781b = eventTime;
        this.f95782c = clientTime;
        this.f95783d = str;
        this.f95784e = verificationMethod;
        this.f95785f = str2;
        this.f95786g = str3;
        this.f95787h = bool;
        this.f95788i = str4;
        this.f95789j = str5;
        this.f95790k = str6;
        this.f95791l = bool2;
    }

    /* renamed from: a */
    public final C44385lF3 m27625a(String eventId, DateTime eventTime, DateTime clientTime, String str, String verificationMethod, String str2, String str3, Boolean bool, String str4, String str5, String str6, Boolean bool2) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        return new C44385lF3(eventId, eventTime, clientTime, str, verificationMethod, str2, str3, bool, str4, str5, str6, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44385lF3) {
            C44385lF3 c44385lF3 = (C44385lF3) obj;
            return Intrinsics.areEqual(this.f95780a, c44385lF3.f95780a) && Intrinsics.areEqual(this.f95781b, c44385lF3.f95781b) && Intrinsics.areEqual(this.f95782c, c44385lF3.f95782c) && Intrinsics.areEqual(this.f95783d, c44385lF3.f95783d) && Intrinsics.areEqual(this.f95784e, c44385lF3.f95784e) && Intrinsics.areEqual(this.f95785f, c44385lF3.f95785f) && Intrinsics.areEqual(this.f95786g, c44385lF3.f95786g) && Intrinsics.areEqual(this.f95787h, c44385lF3.f95787h) && Intrinsics.areEqual(this.f95788i, c44385lF3.f95788i) && Intrinsics.areEqual(this.f95789j, c44385lF3.f95789j) && Intrinsics.areEqual(this.f95790k, c44385lF3.f95790k) && Intrinsics.areEqual(this.f95791l, c44385lF3.f95791l);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingLocationVerificationShown";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f95780a), TuplesKt.m28425to("event_time", this.f95781b), TuplesKt.m28425to("client_time", this.f95782c), TuplesKt.m28425to("bird_id", this.f95783d), TuplesKt.m28425to("verification_method", this.f95784e), TuplesKt.m28425to("ride_id", this.f95785f), TuplesKt.m28425to("closest_nest_id", this.f95786g), TuplesKt.m28425to("inside_nest", this.f95787h), TuplesKt.m28425to("end_ride_attempt_id", this.f95788i), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f95789j), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f95790k), TuplesKt.m28425to("skip_bird_scan", this.f95791l));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f95780a.hashCode() * 31) + this.f95781b.hashCode()) * 31) + this.f95782c.hashCode()) * 31;
        String str = this.f95783d;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95784e.hashCode()) * 31;
        String str2 = this.f95785f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95786g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f95787h;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f95788i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95789j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f95790k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.f95791l;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f95780a;
        DateTime dateTime = this.f95781b;
        DateTime dateTime2 = this.f95782c;
        String str2 = this.f95783d;
        String str3 = this.f95784e;
        String str4 = this.f95785f;
        String str5 = this.f95786g;
        Boolean bool = this.f95787h;
        String str6 = this.f95788i;
        String str7 = this.f95789j;
        String str8 = this.f95790k;
        Boolean bool2 = this.f95791l;
        return "ParkingLocationVerificationShown(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", verificationMethod=" + str3 + ", rideId=" + str4 + ", closestNestId=" + str5 + ", insideNest=" + bool + ", endRideAttemptId=" + str6 + ", sessionId=" + str7 + ", context=" + str8 + ", skipBirdScan=" + bool2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44385lF3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool2);
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
