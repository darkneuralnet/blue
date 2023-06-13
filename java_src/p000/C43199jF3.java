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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b1\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bV\u0010WJä\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010!\u001a\u0004\bA\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010!\u001a\u0004\bI\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010!\u001a\u0004\bK\u0010#R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bL\u0010=\u001a\u0004\bM\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER\"\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010#¨\u0006X"}, m28432d2 = {"LjF3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "sessionId", "birdId", "verificationMethod", "", "elapsedTime", "previousStage", "currentStage", "rideId", "closestNestId", "", "insideNest", "locationSource", "bestAccuracyMeters", "currentAccuracyMeters", "endRideAttemptId", CoreConstants.CONTEXT_SCOPE_VALUE, "skipBirdScan", "totalElapsedTime", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)LjF3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getSessionId", "e", "getBirdId", "f", "getVerificationMethod", "g", "D", "getElapsedTime", "()D", "h", "getPreviousStage", "i", "getCurrentStage", "j", "getRideId", "k", "getClosestNestId", "l", "Ljava/lang/Boolean;", "getInsideNest", "()Ljava/lang/Boolean;", "m", "getLocationSource", "n", "Ljava/lang/Double;", "getBestAccuracyMeters", "()Ljava/lang/Double;", "o", "getCurrentAccuracyMeters", "p", "getEndRideAttemptId", "q", "getContext", "r", "getSkipBirdScan", "s", "getTotalElapsedTime", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jF3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43199jF3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f92374a;

    /* renamed from: b */
    public final DateTime f92375b;

    /* renamed from: c */
    public final DateTime f92376c;

    /* renamed from: d */
    public final String f92377d;

    /* renamed from: e */
    public final String f92378e;

    /* renamed from: f */
    public final String f92379f;

    /* renamed from: g */
    public final double f92380g;

    /* renamed from: h */
    public final String f92381h;

    /* renamed from: i */
    public final String f92382i;

    /* renamed from: j */
    public final String f92383j;

    /* renamed from: k */
    public final String f92384k;

    /* renamed from: l */
    public final Boolean f92385l;

    /* renamed from: m */
    public final String f92386m;

    /* renamed from: n */
    public final Double f92387n;

    /* renamed from: o */
    public final Double f92388o;

    /* renamed from: p */
    public final String f92389p;

    /* renamed from: q */
    public final String f92390q;

    /* renamed from: r */
    public final Boolean f92391r;

    /* renamed from: s */
    public final Double f92392s;

    public C43199jF3(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String str, String verificationMethod, double d, String previousStage, String currentStage, String str2, String str3, Boolean bool, String str4, Double d2, Double d3, String str5, String str6, Boolean bool2, Double d4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        Intrinsics.checkNotNullParameter(previousStage, "previousStage");
        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
        this.f92374a = eventId;
        this.f92375b = eventTime;
        this.f92376c = clientTime;
        this.f92377d = sessionId;
        this.f92378e = str;
        this.f92379f = verificationMethod;
        this.f92380g = d;
        this.f92381h = previousStage;
        this.f92382i = currentStage;
        this.f92383j = str2;
        this.f92384k = str3;
        this.f92385l = bool;
        this.f92386m = str4;
        this.f92387n = d2;
        this.f92388o = d3;
        this.f92389p = str5;
        this.f92390q = str6;
        this.f92391r = bool2;
        this.f92392s = d4;
    }

    /* renamed from: a */
    public final C43199jF3 m30918a(String eventId, DateTime eventTime, DateTime clientTime, String sessionId, String str, String verificationMethod, double d, String previousStage, String currentStage, String str2, String str3, Boolean bool, String str4, Double d2, Double d3, String str5, String str6, Boolean bool2, Double d4) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        Intrinsics.checkNotNullParameter(previousStage, "previousStage");
        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
        return new C43199jF3(eventId, eventTime, clientTime, sessionId, str, verificationMethod, d, previousStage, currentStage, str2, str3, bool, str4, d2, d3, str5, str6, bool2, d4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43199jF3) {
            C43199jF3 c43199jF3 = (C43199jF3) obj;
            return Intrinsics.areEqual(this.f92374a, c43199jF3.f92374a) && Intrinsics.areEqual(this.f92375b, c43199jF3.f92375b) && Intrinsics.areEqual(this.f92376c, c43199jF3.f92376c) && Intrinsics.areEqual(this.f92377d, c43199jF3.f92377d) && Intrinsics.areEqual(this.f92378e, c43199jF3.f92378e) && Intrinsics.areEqual(this.f92379f, c43199jF3.f92379f) && Double.compare(this.f92380g, c43199jF3.f92380g) == 0 && Intrinsics.areEqual(this.f92381h, c43199jF3.f92381h) && Intrinsics.areEqual(this.f92382i, c43199jF3.f92382i) && Intrinsics.areEqual(this.f92383j, c43199jF3.f92383j) && Intrinsics.areEqual(this.f92384k, c43199jF3.f92384k) && Intrinsics.areEqual(this.f92385l, c43199jF3.f92385l) && Intrinsics.areEqual(this.f92386m, c43199jF3.f92386m) && Intrinsics.areEqual((Object) this.f92387n, (Object) c43199jF3.f92387n) && Intrinsics.areEqual((Object) this.f92388o, (Object) c43199jF3.f92388o) && Intrinsics.areEqual(this.f92389p, c43199jF3.f92389p) && Intrinsics.areEqual(this.f92390q, c43199jF3.f92390q) && Intrinsics.areEqual(this.f92391r, c43199jF3.f92391r) && Intrinsics.areEqual((Object) this.f92392s, (Object) c43199jF3.f92392s);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingLocationVerificationEnteredStage";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f92374a), TuplesKt.m28425to("event_time", this.f92375b), TuplesKt.m28425to("client_time", this.f92376c), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f92377d), TuplesKt.m28425to("bird_id", this.f92378e), TuplesKt.m28425to("verification_method", this.f92379f), TuplesKt.m28425to("elapsed_time", Double.valueOf(this.f92380g)), TuplesKt.m28425to("previous_stage", this.f92381h), TuplesKt.m28425to("current_stage", this.f92382i), TuplesKt.m28425to("ride_id", this.f92383j), TuplesKt.m28425to("closest_nest_id", this.f92384k), TuplesKt.m28425to("inside_nest", this.f92385l), TuplesKt.m28425to("location_source", this.f92386m), TuplesKt.m28425to("best_accuracy_meters", this.f92387n), TuplesKt.m28425to("current_accuracy_meters", this.f92388o), TuplesKt.m28425to("end_ride_attempt_id", this.f92389p), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f92390q), TuplesKt.m28425to("skip_bird_scan", this.f92391r), TuplesKt.m28425to("total_elapsed_time", this.f92392s));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((((this.f92374a.hashCode() * 31) + this.f92375b.hashCode()) * 31) + this.f92376c.hashCode()) * 31) + this.f92377d.hashCode()) * 31;
        String str = this.f92378e;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f92379f.hashCode()) * 31) + Double.hashCode(this.f92380g)) * 31) + this.f92381h.hashCode()) * 31) + this.f92382i.hashCode()) * 31;
        String str2 = this.f92383j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f92384k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f92385l;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f92386m;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.f92387n;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f92388o;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str5 = this.f92389p;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f92390q;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.f92391r;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Double d3 = this.f92392s;
        return hashCode11 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f92374a;
        DateTime dateTime = this.f92375b;
        DateTime dateTime2 = this.f92376c;
        String str2 = this.f92377d;
        String str3 = this.f92378e;
        String str4 = this.f92379f;
        double d = this.f92380g;
        String str5 = this.f92381h;
        String str6 = this.f92382i;
        String str7 = this.f92383j;
        String str8 = this.f92384k;
        Boolean bool = this.f92385l;
        String str9 = this.f92386m;
        Double d2 = this.f92387n;
        Double d3 = this.f92388o;
        String str10 = this.f92389p;
        String str11 = this.f92390q;
        Boolean bool2 = this.f92391r;
        Double d4 = this.f92392s;
        return "ParkingLocationVerificationEnteredStage(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", sessionId=" + str2 + ", birdId=" + str3 + ", verificationMethod=" + str4 + ", elapsedTime=" + d + ", previousStage=" + str5 + ", currentStage=" + str6 + ", rideId=" + str7 + ", closestNestId=" + str8 + ", insideNest=" + bool + ", locationSource=" + str9 + ", bestAccuracyMeters=" + d2 + ", currentAccuracyMeters=" + d3 + ", endRideAttemptId=" + str10 + ", context=" + str11 + ", skipBirdScan=" + bool2 + ", totalElapsedTime=" + d4 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C43199jF3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, String str4, double d, String str5, String str6, String str7, String str8, Boolean bool, String str9, Double d2, Double d3, String str10, String str11, Boolean bool2, Double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, str2, (i & 16) != 0 ? null : str3, str4, d, str5, str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : d2, (i & 16384) != 0 ? null : d3, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : str11, (131072 & i) != 0 ? null : bool2, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : d4);
        String str12;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str12 = uuid;
        } else {
            str12 = str;
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
