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
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b1\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bV\u0010WJê\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bC\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010!\u001a\u0004\bE\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010!\u001a\u0004\bG\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010!\u001a\u0004\bI\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010!\u001a\u0004\bM\u0010#R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010!\u001a\u0004\bO\u0010#R\"\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010#¨\u0006X"}, m28432d2 = {"LmF3;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "birdId", "verificationMethod", "", "totalTime", "birdScanTime", "surroundingsScanTime", "rideId", "closestNestId", "", "insideNest", "bestAccuracyMeters", "finalAccuracyMeters", "endRideAttemptId", "sessionId", CoreConstants.CONTEXT_SCOPE_VALUE, "skipBirdScan", "locationSource", "previousStage", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)LmF3;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "getBirdId", "e", "getVerificationMethod", "f", "D", "getTotalTime", "()D", "g", "Ljava/lang/Double;", "getBirdScanTime", "()Ljava/lang/Double;", "h", "getSurroundingsScanTime", "i", "getRideId", "j", "getClosestNestId", "k", "Ljava/lang/Boolean;", "getInsideNest", "()Ljava/lang/Boolean;", "l", "getBestAccuracyMeters", "m", "getFinalAccuracyMeters", "n", "getEndRideAttemptId", "o", "getSessionId", "p", "getContext", "q", "getSkipBirdScan", "r", "getLocationSource", "s", "getPreviousStage", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mF3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44978mF3 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f97703a;

    /* renamed from: b */
    public final DateTime f97704b;

    /* renamed from: c */
    public final DateTime f97705c;

    /* renamed from: d */
    public final String f97706d;

    /* renamed from: e */
    public final String f97707e;

    /* renamed from: f */
    public final double f97708f;

    /* renamed from: g */
    public final Double f97709g;

    /* renamed from: h */
    public final Double f97710h;

    /* renamed from: i */
    public final String f97711i;

    /* renamed from: j */
    public final String f97712j;

    /* renamed from: k */
    public final Boolean f97713k;

    /* renamed from: l */
    public final Double f97714l;

    /* renamed from: m */
    public final Double f97715m;

    /* renamed from: n */
    public final String f97716n;

    /* renamed from: o */
    public final String f97717o;

    /* renamed from: p */
    public final String f97718p;

    /* renamed from: q */
    public final Boolean f97719q;

    /* renamed from: r */
    public final String f97720r;

    /* renamed from: s */
    public final String f97721s;

    public C44978mF3(String eventId, DateTime eventTime, DateTime clientTime, String str, String verificationMethod, double d, Double d2, Double d3, String str2, String str3, Boolean bool, Double d4, Double d5, String str4, String str5, String str6, Boolean bool2, String str7, String str8) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        this.f97703a = eventId;
        this.f97704b = eventTime;
        this.f97705c = clientTime;
        this.f97706d = str;
        this.f97707e = verificationMethod;
        this.f97708f = d;
        this.f97709g = d2;
        this.f97710h = d3;
        this.f97711i = str2;
        this.f97712j = str3;
        this.f97713k = bool;
        this.f97714l = d4;
        this.f97715m = d5;
        this.f97716n = str4;
        this.f97717o = str5;
        this.f97718p = str6;
        this.f97719q = bool2;
        this.f97720r = str7;
        this.f97721s = str8;
    }

    /* renamed from: a */
    public final C44978mF3 m25863a(String eventId, DateTime eventTime, DateTime clientTime, String str, String verificationMethod, double d, Double d2, Double d3, String str2, String str3, Boolean bool, Double d4, Double d5, String str4, String str5, String str6, Boolean bool2, String str7, String str8) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(verificationMethod, "verificationMethod");
        return new C44978mF3(eventId, eventTime, clientTime, str, verificationMethod, d, d2, d3, str2, str3, bool, d4, d5, str4, str5, str6, bool2, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44978mF3) {
            C44978mF3 c44978mF3 = (C44978mF3) obj;
            return Intrinsics.areEqual(this.f97703a, c44978mF3.f97703a) && Intrinsics.areEqual(this.f97704b, c44978mF3.f97704b) && Intrinsics.areEqual(this.f97705c, c44978mF3.f97705c) && Intrinsics.areEqual(this.f97706d, c44978mF3.f97706d) && Intrinsics.areEqual(this.f97707e, c44978mF3.f97707e) && Double.compare(this.f97708f, c44978mF3.f97708f) == 0 && Intrinsics.areEqual((Object) this.f97709g, (Object) c44978mF3.f97709g) && Intrinsics.areEqual((Object) this.f97710h, (Object) c44978mF3.f97710h) && Intrinsics.areEqual(this.f97711i, c44978mF3.f97711i) && Intrinsics.areEqual(this.f97712j, c44978mF3.f97712j) && Intrinsics.areEqual(this.f97713k, c44978mF3.f97713k) && Intrinsics.areEqual((Object) this.f97714l, (Object) c44978mF3.f97714l) && Intrinsics.areEqual((Object) this.f97715m, (Object) c44978mF3.f97715m) && Intrinsics.areEqual(this.f97716n, c44978mF3.f97716n) && Intrinsics.areEqual(this.f97717o, c44978mF3.f97717o) && Intrinsics.areEqual(this.f97718p, c44978mF3.f97718p) && Intrinsics.areEqual(this.f97719q, c44978mF3.f97719q) && Intrinsics.areEqual(this.f97720r, c44978mF3.f97720r) && Intrinsics.areEqual(this.f97721s, c44978mF3.f97721s);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.ParkingLocationVerificationSucceeded";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f97703a), TuplesKt.m28425to("event_time", this.f97704b), TuplesKt.m28425to("client_time", this.f97705c), TuplesKt.m28425to("bird_id", this.f97706d), TuplesKt.m28425to("verification_method", this.f97707e), TuplesKt.m28425to("total_time", Double.valueOf(this.f97708f)), TuplesKt.m28425to("bird_scan_time", this.f97709g), TuplesKt.m28425to("surroundings_scan_time", this.f97710h), TuplesKt.m28425to("ride_id", this.f97711i), TuplesKt.m28425to("closest_nest_id", this.f97712j), TuplesKt.m28425to("inside_nest", this.f97713k), TuplesKt.m28425to("best_accuracy_meters", this.f97714l), TuplesKt.m28425to("final_accuracy_meters", this.f97715m), TuplesKt.m28425to("end_ride_attempt_id", this.f97716n), TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.f97717o), TuplesKt.m28425to(CoreConstants.CONTEXT_SCOPE_VALUE, this.f97718p), TuplesKt.m28425to("skip_bird_scan", this.f97719q), TuplesKt.m28425to("location_source", this.f97720r), TuplesKt.m28425to("previous_stage", this.f97721s));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f97703a.hashCode() * 31) + this.f97704b.hashCode()) * 31) + this.f97705c.hashCode()) * 31;
        String str = this.f97706d;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f97707e.hashCode()) * 31) + Double.hashCode(this.f97708f)) * 31;
        Double d = this.f97709g;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f97710h;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.f97711i;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97712j;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f97713k;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d3 = this.f97714l;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f97715m;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str4 = this.f97716n;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f97717o;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f97718p;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.f97719q;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f97720r;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f97721s;
        return hashCode14 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.f97703a;
        DateTime dateTime = this.f97704b;
        DateTime dateTime2 = this.f97705c;
        String str2 = this.f97706d;
        String str3 = this.f97707e;
        double d = this.f97708f;
        Double d2 = this.f97709g;
        Double d3 = this.f97710h;
        String str4 = this.f97711i;
        String str5 = this.f97712j;
        Boolean bool = this.f97713k;
        Double d4 = this.f97714l;
        Double d5 = this.f97715m;
        String str6 = this.f97716n;
        String str7 = this.f97717o;
        String str8 = this.f97718p;
        Boolean bool2 = this.f97719q;
        String str9 = this.f97720r;
        String str10 = this.f97721s;
        return "ParkingLocationVerificationSucceeded(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdId=" + str2 + ", verificationMethod=" + str3 + ", totalTime=" + d + ", birdScanTime=" + d2 + ", surroundingsScanTime=" + d3 + ", rideId=" + str4 + ", closestNestId=" + str5 + ", insideNest=" + bool + ", bestAccuracyMeters=" + d4 + ", finalAccuracyMeters=" + d5 + ", endRideAttemptId=" + str6 + ", sessionId=" + str7 + ", context=" + str8 + ", skipBirdScan=" + bool2 + ", locationSource=" + str9 + ", previousStage=" + str10 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44978mF3(String str, DateTime dateTime, DateTime dateTime2, String str2, String str3, double d, Double d2, Double d3, String str4, String str5, Boolean bool, Double d4, Double d5, String str6, String str7, String str8, Boolean bool2, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : str2, str3, d, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : d3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : d4, (i & 4096) != 0 ? null : d5, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (32768 & i) != 0 ? null : str8, (65536 & i) != 0 ? null : bool2, (131072 & i) != 0 ? null : str9, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : str10);
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
