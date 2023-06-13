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
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b1\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bV\u0010WJè\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010!\u001a\u0004\b=\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010!\u001a\u0004\bE\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010!\u001a\u0004\bG\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010!\u001a\u0004\bI\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\bK\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010!\u001a\u0004\bM\u0010#R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010!\u001a\u0004\bO\u0010#R\"\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010#¨\u0006X"}, m28432d2 = {"LkF3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "verificationMethod", "failureReason", "thirdPartyError", "", "totalTime", "birdScanTime", "rideId", "closestNestId", "", "insideNest", "bestAccuracyMeters", "endRideAttemptId", "sessionId", CoreConstants.CONTEXT_SCOPE_VALUE, "skipBirdScan", "locationSource", "previousStage", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)LkF3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getVerificationMethod", "f", "getFailureReason", "g", "getThirdPartyError", "h", "D", "getTotalTime", "()D", "i", "Ljava/lang/Double;", "getBirdScanTime", "()Ljava/lang/Double;", "j", "getRideId", "k", "getClosestNestId", "l", "Ljava/lang/Boolean;", "getInsideNest", "()Ljava/lang/Boolean;", "m", "getBestAccuracyMeters", "n", "getEndRideAttemptId", "o", "getSessionId", "p", "getContext", "q", "getSkipBirdScan", "r", "getLocationSource", "s", "getPreviousStage", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kF3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43792kF3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f94141a;

    /* renamed from: b */
    public final DateTime f94142b;

    /* renamed from: c */
    public final DateTime f94143c;

    /* renamed from: d */
    public final String f94144d;

    /* renamed from: e */
    public final String f94145e;

    /* renamed from: f */
    public final String f94146f;

    /* renamed from: g */
    public final String f94147g;

    /* renamed from: h */
    public final double f94148h;

    /* renamed from: i */
    public final Double f94149i;

    /* renamed from: j */
    public final String f94150j;

    /* renamed from: k */
    public final String f94151k;

    /* renamed from: l */
    public final Boolean f94152l;

    /* renamed from: m */
    public final Double f94153m;

    /* renamed from: n */
    public final String f94154n;

    /* renamed from: o */
    public final String f94155o;

    /* renamed from: p */
    public final String f94156p;

    /* renamed from: q */
    public final Boolean f94157q;

    /* renamed from: r */
    public final String f94158r;

    /* renamed from: s */
    public final String f94159s;

    public C43792kF3(String eventId, DateTime eventTime, DateTime clientTime, String str, String verificationMethod, String failureReason, String str2, double d, Double d2, String str3, String str4, Boolean bool, Double d3, String str5, String str6, String str7, Boolean bool2, String str8, String str9) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        this.f94141a = eventId;
        this.f94142b = eventTime;
        this.f94143c = clientTime;
        this.f94144d = str;
        this.f94145e = verificationMethod;
        this.f94146f = failureReason;
        this.f94147g = str2;
        this.f94148h = d;
        this.f94149i = d2;
        this.f94150j = str3;
        this.f94151k = str4;
        this.f94152l = bool;
        this.f94153m = d3;
        this.f94154n = str5;
        this.f94155o = str6;
        this.f94156p = str7;
        this.f94157q = bool2;
        this.f94158r = str8;
        this.f94159s = str9;
    }

    /* renamed from: a */
    public final C43792kF3 m29136a(String eventId, DateTime eventTime, DateTime clientTime, String str, String verificationMethod, String failureReason, String str2, double d, Double d2, String str3, String str4, Boolean bool, Double d3, String str5, String str6, String str7, Boolean bool2, String str8, String str9) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        return new C43792kF3(eventId, eventTime, clientTime, str, verificationMethod, failureReason, str2, d, d2, str3, str4, bool, d3, str5, str6, str7, bool2, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43792kF3) {
            C43792kF3 c43792kF3 = (C43792kF3) obj;
            return Intrinsics.areEqual(this.f94141a, c43792kF3.f94141a) && Intrinsics.areEqual(this.f94142b, c43792kF3.f94142b) && Intrinsics.areEqual(this.f94143c, c43792kF3.f94143c) && Intrinsics.areEqual(this.f94144d, c43792kF3.f94144d) && Intrinsics.areEqual(this.f94145e, c43792kF3.f94145e) && Intrinsics.areEqual(this.f94146f, c43792kF3.f94146f) && Intrinsics.areEqual(this.f94147g, c43792kF3.f94147g) && Double.compare(this.f94148h, c43792kF3.f94148h) == 0 && Intrinsics.areEqual((Object) this.f94149i, (Object) c43792kF3.f94149i) && Intrinsics.areEqual(this.f94150j, c43792kF3.f94150j) && Intrinsics.areEqual(this.f94151k, c43792kF3.f94151k) && Intrinsics.areEqual(this.f94152l, c43792kF3.f94152l) && Intrinsics.areEqual((Object) this.f94153m, (Object) c43792kF3.f94153m) && Intrinsics.areEqual(this.f94154n, c43792kF3.f94154n) && Intrinsics.areEqual(this.f94155o, c43792kF3.f94155o) && Intrinsics.areEqual(this.f94156p, c43792kF3.f94156p) && Intrinsics.areEqual(this.f94157q, c43792kF3.f94157q) && Intrinsics.areEqual(this.f94158r, c43792kF3.f94158r) && Intrinsics.areEqual(this.f94159s, c43792kF3.f94159s);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingLocationVerificationFailed";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f94141a), TuplesKt.m28425to("event_time", this.f94142b), TuplesKt.m28425to("client_time", this.f94143c), TuplesKt.m28425to("bird_id", this.f94144d), TuplesKt.m28425to("verification_method", this.f94145e), TuplesKt.m28425to("failure_reason", this.f94146f), TuplesKt.m28425to("third_party_error", this.f94147g), TuplesKt.m28425to("total_time", Double.valueOf(this.f94148h)), TuplesKt.m28425to("bird_scan_time", this.f94149i), TuplesKt.m28425to("ride_id", this.f94150j), TuplesKt.m28425to("closest_nest_id", this.f94151k), TuplesKt.m28425to("inside_nest", this.f94152l), TuplesKt.m28425to("best_accuracy_meters", this.f94153m), TuplesKt.m28425to("end_ride_attempt_id", this.f94154n), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f94155o), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f94156p), TuplesKt.m28425to("skip_bird_scan", this.f94157q), TuplesKt.m28425to("location_source", this.f94158r), TuplesKt.m28425to("previous_stage", this.f94159s));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f94141a.hashCode() * 31) + this.f94142b.hashCode()) * 31) + this.f94143c.hashCode()) * 31;
        String str = this.f94144d;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94145e.hashCode()) * 31) + this.f94146f.hashCode()) * 31;
        String str2 = this.f94147g;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.f94148h)) * 31;
        Double d = this.f94149i;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f94150j;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94151k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f94152l;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d2 = this.f94153m;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.f94154n;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f94155o;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f94156p;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.f94157q;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str8 = this.f94158r;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f94159s;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.f94141a;
        DateTime dateTime = this.f94142b;
        DateTime dateTime2 = this.f94143c;
        String str2 = this.f94144d;
        String str3 = this.f94145e;
        String str4 = this.f94146f;
        String str5 = this.f94147g;
        double d = this.f94148h;
        Double d2 = this.f94149i;
        String str6 = this.f94150j;
        String str7 = this.f94151k;
        Boolean bool = this.f94152l;
        Double d3 = this.f94153m;
        String str8 = this.f94154n;
        String str9 = this.f94155o;
        String str10 = this.f94156p;
        Boolean bool2 = this.f94157q;
        String str11 = this.f94158r;
        String str12 = this.f94159s;
        return "ParkingLocationVerificationFailed(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", verificationMethod=" + str3 + ", failureReason=" + str4 + ", thirdPartyError=" + str5 + ", totalTime=" + d + ", birdScanTime=" + d2 + ", rideId=" + str6 + ", closestNestId=" + str7 + ", insideNest=" + bool + ", bestAccuracyMeters=" + d3 + ", endRideAttemptId=" + str8 + ", sessionId=" + str9 + ", context=" + str10 + ", skipBirdScan=" + bool2 + ", locationSource=" + str11 + ", previousStage=" + str12 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43792kF3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, String str5, double d, Double d2, String str6, String str7, Boolean bool, Double d3, String str8, String str9, String str10, Boolean bool2, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, str3, str4, (i & 64) != 0 ? null : str5, d, (i & 256) != 0 ? null : d2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : d3, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : bool2, (131072 & i) != 0 ? null : str11, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str12);
        String str13;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str13 = uuid;
        } else {
            str13 = str;
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
