package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bS\u0010TJ¶\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\t\u0010#\u001a\u00020\"HÖ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\b\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b\t\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b\n\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b\u000b\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b\f\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b\r\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b\u000e\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b\u000f\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b\u0010\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b\u0011\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b\u0012\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b=\u00101\u001a\u0004\b\u0013\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b\u0014\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b\u0015\u00102R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00102R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\b\u0019\u00102R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bG\u00101\u001a\u0004\b\u001a\u00102R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\b\u001b\u00102R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\b\u001c\u00102R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\b\u001d\u00102R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\bL\u0010)R\"\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010$0M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010)¨\u0006U"}, m28432d2 = {"LY85;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isLoggedIn", "isInRegistration", "isInRide", "isAfterHours", "isWeatherAlertEnabled", "isCharger", "isPowerCharger", "isOperator", "isWatcher", "isTester", "isAdmin", "isRenter", "isOwner", "isEmployee", "preloadEnabled", "", "rideCount", "isInNoRideArea", "isInNoParkingArea", "isInPreferredParkingArea", "isInSlowSpeedArea", "isInServiceArea", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)LY85;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "getPreloadEnabled", "s", "Ljava/lang/Long;", "getRideCount", "()Ljava/lang/Long;", "t", "u", "v", "w", "x", "y", "getSource", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Y85 */
/* loaded from: classes4.dex */
public final class Y85 implements AnalyticsEvent {

    /* renamed from: a */
    public final String f44675a;

    /* renamed from: b */
    public final DateTime f44676b;

    /* renamed from: c */
    public final DateTime f44677c;

    /* renamed from: d */
    public final Boolean f44678d;

    /* renamed from: e */
    public final Boolean f44679e;

    /* renamed from: f */
    public final Boolean f44680f;

    /* renamed from: g */
    public final Boolean f44681g;

    /* renamed from: h */
    public final Boolean f44682h;

    /* renamed from: i */
    public final Boolean f44683i;

    /* renamed from: j */
    public final Boolean f44684j;

    /* renamed from: k */
    public final Boolean f44685k;

    /* renamed from: l */
    public final Boolean f44686l;

    /* renamed from: m */
    public final Boolean f44687m;

    /* renamed from: n */
    public final Boolean f44688n;

    /* renamed from: o */
    public final Boolean f44689o;

    /* renamed from: p */
    public final Boolean f44690p;

    /* renamed from: q */
    public final Boolean f44691q;

    /* renamed from: r */
    public final Boolean f44692r;

    /* renamed from: s */
    public final Long f44693s;

    /* renamed from: t */
    public final Boolean f44694t;

    /* renamed from: u */
    public final Boolean f44695u;

    /* renamed from: v */
    public final Boolean f44696v;

    /* renamed from: w */
    public final Boolean f44697w;

    /* renamed from: x */
    public final Boolean f44698x;

    /* renamed from: y */
    public final String f44699y;

    public Y85() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    /* renamed from: a */
    public final Y85 m75544a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Long l, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        return new Y85(eventId, eventTime, clientTime, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, l, bool16, bool17, bool18, bool19, bool20, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y85) {
            Y85 y85 = (Y85) obj;
            return Intrinsics.areEqual(this.f44675a, y85.f44675a) && Intrinsics.areEqual(this.f44676b, y85.f44676b) && Intrinsics.areEqual(this.f44677c, y85.f44677c) && Intrinsics.areEqual(this.f44678d, y85.f44678d) && Intrinsics.areEqual(this.f44679e, y85.f44679e) && Intrinsics.areEqual(this.f44680f, y85.f44680f) && Intrinsics.areEqual(this.f44681g, y85.f44681g) && Intrinsics.areEqual(this.f44682h, y85.f44682h) && Intrinsics.areEqual(this.f44683i, y85.f44683i) && Intrinsics.areEqual(this.f44684j, y85.f44684j) && Intrinsics.areEqual(this.f44685k, y85.f44685k) && Intrinsics.areEqual(this.f44686l, y85.f44686l) && Intrinsics.areEqual(this.f44687m, y85.f44687m) && Intrinsics.areEqual(this.f44688n, y85.f44688n) && Intrinsics.areEqual(this.f44689o, y85.f44689o) && Intrinsics.areEqual(this.f44690p, y85.f44690p) && Intrinsics.areEqual(this.f44691q, y85.f44691q) && Intrinsics.areEqual(this.f44692r, y85.f44692r) && Intrinsics.areEqual(this.f44693s, y85.f44693s) && Intrinsics.areEqual(this.f44694t, y85.f44694t) && Intrinsics.areEqual(this.f44695u, y85.f44695u) && Intrinsics.areEqual(this.f44696v, y85.f44696v) && Intrinsics.areEqual(this.f44697w, y85.f44697w) && Intrinsics.areEqual(this.f44698x, y85.f44698x) && Intrinsics.areEqual(this.f44699y, y85.f44699y);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RiderDemand";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f44675a), TuplesKt.m28425to("event_time", this.f44676b), TuplesKt.m28425to("client_time", this.f44677c), TuplesKt.m28425to("is_logged_in", this.f44678d), TuplesKt.m28425to("is_in_registration", this.f44679e), TuplesKt.m28425to("is_in_ride", this.f44680f), TuplesKt.m28425to("is_after_hours", this.f44681g), TuplesKt.m28425to("is_weather_alert_enabled", this.f44682h), TuplesKt.m28425to("is_charger", this.f44683i), TuplesKt.m28425to("is_power_charger", this.f44684j), TuplesKt.m28425to("is_operator", this.f44685k), TuplesKt.m28425to("is_watcher", this.f44686l), TuplesKt.m28425to("is_tester", this.f44687m), TuplesKt.m28425to("is_admin", this.f44688n), TuplesKt.m28425to("is_renter", this.f44689o), TuplesKt.m28425to("is_owner", this.f44690p), TuplesKt.m28425to("is_employee", this.f44691q), TuplesKt.m28425to("preload_enabled", this.f44692r), TuplesKt.m28425to("ride_count", this.f44693s), TuplesKt.m28425to("is_in_no_ride_area", this.f44694t), TuplesKt.m28425to("is_in_no_parking_area", this.f44695u), TuplesKt.m28425to("is_in_preferred_parking_area", this.f44696v), TuplesKt.m28425to("is_in_slow_speed_area", this.f44697w), TuplesKt.m28425to("is_in_service_area", this.f44698x), TuplesKt.m28425to(Stripe3ds2AuthParams.FIELD_SOURCE, this.f44699y));
        return mapOf;
    }

    public int hashCode() {
        int hashCode = ((((this.f44675a.hashCode() * 31) + this.f44676b.hashCode()) * 31) + this.f44677c.hashCode()) * 31;
        Boolean bool = this.f44678d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f44679e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f44680f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f44681g;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f44682h;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f44683i;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f44684j;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f44685k;
        int hashCode9 = (hashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f44686l;
        int hashCode10 = (hashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.f44687m;
        int hashCode11 = (hashCode10 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.f44688n;
        int hashCode12 = (hashCode11 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.f44689o;
        int hashCode13 = (hashCode12 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.f44690p;
        int hashCode14 = (hashCode13 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.f44691q;
        int hashCode15 = (hashCode14 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.f44692r;
        int hashCode16 = (hashCode15 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Long l = this.f44693s;
        int hashCode17 = (hashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool16 = this.f44694t;
        int hashCode18 = (hashCode17 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.f44695u;
        int hashCode19 = (hashCode18 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.f44696v;
        int hashCode20 = (hashCode19 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.f44697w;
        int hashCode21 = (hashCode20 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.f44698x;
        int hashCode22 = (hashCode21 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        String str = this.f44699y;
        return hashCode22 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f44675a;
        DateTime dateTime = this.f44676b;
        DateTime dateTime2 = this.f44677c;
        Boolean bool = this.f44678d;
        Boolean bool2 = this.f44679e;
        Boolean bool3 = this.f44680f;
        Boolean bool4 = this.f44681g;
        Boolean bool5 = this.f44682h;
        Boolean bool6 = this.f44683i;
        Boolean bool7 = this.f44684j;
        Boolean bool8 = this.f44685k;
        Boolean bool9 = this.f44686l;
        Boolean bool10 = this.f44687m;
        Boolean bool11 = this.f44688n;
        Boolean bool12 = this.f44689o;
        Boolean bool13 = this.f44690p;
        Boolean bool14 = this.f44691q;
        Boolean bool15 = this.f44692r;
        Long l = this.f44693s;
        Boolean bool16 = this.f44694t;
        Boolean bool17 = this.f44695u;
        Boolean bool18 = this.f44696v;
        Boolean bool19 = this.f44697w;
        Boolean bool20 = this.f44698x;
        String str2 = this.f44699y;
        return "RiderDemand(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isLoggedIn=" + bool + ", isInRegistration=" + bool2 + ", isInRide=" + bool3 + ", isAfterHours=" + bool4 + ", isWeatherAlertEnabled=" + bool5 + ", isCharger=" + bool6 + ", isPowerCharger=" + bool7 + ", isOperator=" + bool8 + ", isWatcher=" + bool9 + ", isTester=" + bool10 + ", isAdmin=" + bool11 + ", isRenter=" + bool12 + ", isOwner=" + bool13 + ", isEmployee=" + bool14 + ", preloadEnabled=" + bool15 + ", rideCount=" + l + ", isInNoRideArea=" + bool16 + ", isInNoParkingArea=" + bool17 + ", isInPreferredParkingArea=" + bool18 + ", isInSlowSpeedArea=" + bool19 + ", isInServiceArea=" + bool20 + ", source=" + str2 + ")";
    }

    public Y85(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Long l, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        this.f44675a = eventId;
        this.f44676b = eventTime;
        this.f44677c = clientTime;
        this.f44678d = bool;
        this.f44679e = bool2;
        this.f44680f = bool3;
        this.f44681g = bool4;
        this.f44682h = bool5;
        this.f44683i = bool6;
        this.f44684j = bool7;
        this.f44685k = bool8;
        this.f44686l = bool9;
        this.f44687m = bool10;
        this.f44688n = bool11;
        this.f44689o = bool12;
        this.f44690p = bool13;
        this.f44691q = bool14;
        this.f44692r = bool15;
        this.f44693s = l;
        this.f44694t = bool16;
        this.f44695u = bool17;
        this.f44696v = bool18;
        this.f44697w = bool19;
        this.f44698x = bool20;
        this.f44699y = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Y85(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Long l, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : bool7, (i & 1024) != 0 ? null : bool8, (i & 2048) != 0 ? null : bool9, (i & 4096) != 0 ? null : bool10, (i & 8192) != 0 ? null : bool11, (i & 16384) != 0 ? null : bool12, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : bool13, (i & 65536) != 0 ? null : bool14, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : bool15, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : l, (i & 524288) != 0 ? null : bool16, (i & 1048576) != 0 ? null : bool17, (i & 2097152) != 0 ? null : bool18, (i & 4194304) != 0 ? null : bool19, (i & 8388608) != 0 ? null : bool20, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str2);
        String str3;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i & 1) != 0) {
            str3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str3, "randomUUID().toString()");
        } else {
            str3 = str;
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
