package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.analytics.AnalyticsEvent;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\bX\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000e¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001JÊ\u0003\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\t\u00100\u001a\u00020\u0002HÖ\u0001J\t\u00102\u001a\u000201HÖ\u0001J\u0013\u00105\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u00106\u001a\u0004\bF\u00108R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u00108R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bQ\u0010J\u001a\u0004\bR\u0010LR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bS\u0010J\u001a\u0004\bT\u0010LR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bU\u0010J\u001a\u0004\bV\u0010LR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u00106\u001a\u0004\bX\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u00106\u001a\u0004\b=\u00108R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010BR\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010LR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b^\u0010:\u001a\u0004\b_\u0010<R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\be\u0010cR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u00106\u001a\u0004\bg\u00108R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\b\u001c\u0010jR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bk\u0010i\u001a\u0004\b\u001d\u0010jR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u00106\u001a\u0004\b9\u00108R\u0019\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bq\u0010N\u001a\u0004\br\u0010PR\u0019\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bs\u0010N\u001a\u0004\bt\u0010PR\u0019\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bu\u0010N\u001a\u0004\bv\u0010PR\u0019\u0010#\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bw\u0010i\u001a\u0004\bx\u0010jR\u0019\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\by\u0010N\u001a\u0004\bz\u0010PR\u0019\u0010%\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b{\u0010N\u001a\u0004\b|\u0010PR\u0019\u0010&\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b}\u0010N\u001a\u0004\b~\u0010PR\u001a\u0010'\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\b\u007f\u0010i\u001a\u0005\b\u0080\u0001\u0010jR\u001b\u0010(\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010N\u001a\u0005\b\u0082\u0001\u0010PR\u001b\u0010)\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010N\u001a\u0005\b\u0084\u0001\u0010PR\u001b\u0010*\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010N\u001a\u0005\b\u0086\u0001\u0010PR\u001a\u0010+\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\r\n\u0004\bJ\u0010i\u001a\u0005\b\u0087\u0001\u0010jR\u001b\u0010,\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010N\u001a\u0005\b\u0089\u0001\u0010PR\u001b\u0010-\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010N\u001a\u0005\b\u008b\u0001\u0010PR&\u0010\u008f\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001030\u008c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0091\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u00108¨\u0006\u0094\u0001"}, m28432d2 = {"LAQ4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "birdIsBluetooth", "birdIsCellular", "birdModel", "currency", "", "distanceInMeters", "", "durationInSeconds", "minimumRidePrice", "minutePrice", "minutesIncluded", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "", "areaIds", "timeInAreas", "description", "isNetworkConnectivityError", "isPrimaryRide", "concurrentRideCount", "endRideAttemptId", "arLatitude", "arLongitude", "arAccuracy", "arLocationMocked", "birdLatitude", "birdLongitude", "birdAccuracy", "birdLocationMocked", "gpsLatitude", "gpsLongitude", "gpsAccuracy", "gpsLocationMocked", "accuracyLimit", "nestAdditionalBufferMeters", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)LAQ4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Z", "getBirdIsBluetooth", "()Z", "e", "getBirdIsCellular", "f", "getBirdModel", "g", "getCurrency", "h", "J", "getDistanceInMeters", "()J", "i", "Ljava/lang/Double;", "getDurationInSeconds", "()Ljava/lang/Double;", "j", "getMinimumRidePrice", "k", "getMinutePrice", "l", "getMinutesIncluded", "m", "getPartnerId", "n", "o", "getHasSalesTax", "p", "getStartPrice", "q", "getStartTime", "r", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "s", "getTimeInAreas", "t", "getDescription", "u", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "v", "w", "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "x", "y", "getArLatitude", "z", "getArLongitude", "A", "getArAccuracy", "B", "getArLocationMocked", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "getBirdLatitude", "D", "getBirdLongitude", "E", "getBirdAccuracy", "F", "getBirdLocationMocked", "G", "getGpsLatitude", "H", "getGpsLongitude", "I", "getGpsAccuracy", "getGpsLocationMocked", "K", "getAccuracyLimit", "L", "getNestAdditionalBufferMeters", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZZLjava/lang/String;Ljava/lang/String;JLjava/lang/Double;JJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AQ4 */
/* loaded from: classes4.dex */
public final class AQ4 implements AnalyticsEvent {

    /* renamed from: A */
    public final Double f513A;

    /* renamed from: B */
    public final Boolean f514B;

    /* renamed from: C */
    public final Double f515C;

    /* renamed from: D */
    public final Double f516D;

    /* renamed from: E */
    public final Double f517E;

    /* renamed from: F */
    public final Boolean f518F;

    /* renamed from: G */
    public final Double f519G;

    /* renamed from: H */
    public final Double f520H;

    /* renamed from: I */
    public final Double f521I;

    /* renamed from: J */
    public final Boolean f522J;

    /* renamed from: K */
    public final Double f523K;

    /* renamed from: L */
    public final Double f524L;

    /* renamed from: a */
    public final String f525a;

    /* renamed from: b */
    public final DateTime f526b;

    /* renamed from: c */
    public final DateTime f527c;

    /* renamed from: d */
    public final boolean f528d;

    /* renamed from: e */
    public final boolean f529e;

    /* renamed from: f */
    public final String f530f;

    /* renamed from: g */
    public final String f531g;

    /* renamed from: h */
    public final long f532h;

    /* renamed from: i */
    public final Double f533i;

    /* renamed from: j */
    public final long f534j;

    /* renamed from: k */
    public final long f535k;

    /* renamed from: l */
    public final long f536l;

    /* renamed from: m */
    public final String f537m;

    /* renamed from: n */
    public final String f538n;

    /* renamed from: o */
    public final boolean f539o;

    /* renamed from: p */
    public final long f540p;

    /* renamed from: q */
    public final DateTime f541q;

    /* renamed from: r */
    public final List<String> f542r;

    /* renamed from: s */
    public final List<Double> f543s;

    /* renamed from: t */
    public final String f544t;

    /* renamed from: u */
    public final Boolean f545u;

    /* renamed from: v */
    public final Boolean f546v;

    /* renamed from: w */
    public final Long f547w;

    /* renamed from: x */
    public final String f548x;

    /* renamed from: y */
    public final Double f549y;

    /* renamed from: z */
    public final Double f550z;

    public AQ4(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, String description, Boolean bool, Boolean bool2, Long l, String str4, Double d2, Double d3, Double d4, Boolean bool3, Double d5, Double d6, Double d7, Boolean bool4, Double d8, Double d9, Double d10, Boolean bool5, Double d11, Double d12) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f525a = eventId;
        this.f526b = eventTime;
        this.f527c = clientTime;
        this.f528d = z;
        this.f529e = z2;
        this.f530f = str;
        this.f531g = currency;
        this.f532h = j;
        this.f533i = d;
        this.f534j = j2;
        this.f535k = j3;
        this.f536l = j4;
        this.f537m = str2;
        this.f538n = str3;
        this.f539o = z3;
        this.f540p = j5;
        this.f541q = dateTime;
        this.f542r = list;
        this.f543s = list2;
        this.f544t = description;
        this.f545u = bool;
        this.f546v = bool2;
        this.f547w = l;
        this.f548x = str4;
        this.f549y = d2;
        this.f550z = d3;
        this.f513A = d4;
        this.f514B = bool3;
        this.f515C = d5;
        this.f516D = d6;
        this.f517E = d7;
        this.f518F = bool4;
        this.f519G = d8;
        this.f520H = d9;
        this.f521I = d10;
        this.f522J = bool5;
        this.f523K = d11;
        this.f524L = d12;
    }

    /* renamed from: a */
    public final AQ4 m115798a(String eventId, DateTime eventTime, DateTime clientTime, boolean z, boolean z2, String str, String currency, long j, Double d, long j2, long j3, long j4, String str2, String str3, boolean z3, long j5, DateTime dateTime, List<String> list, List<Double> list2, String description, Boolean bool, Boolean bool2, Long l, String str4, Double d2, Double d3, Double d4, Boolean bool3, Double d5, Double d6, Double d7, Boolean bool4, Double d8, Double d9, Double d10, Boolean bool5, Double d11, Double d12) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        return new AQ4(eventId, eventTime, clientTime, z, z2, str, currency, j, d, j2, j3, j4, str2, str3, z3, j5, dateTime, list, list2, description, bool, bool2, l, str4, d2, d3, d4, bool3, d5, d6, d7, bool4, d8, d9, d10, bool5, d11, d12);
    }

    /* renamed from: b */
    public final String m115797b() {
        return this.f548x;
    }

    /* renamed from: c */
    public final String m115796c() {
        return this.f538n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AQ4) {
            AQ4 aq4 = (AQ4) obj;
            return Intrinsics.areEqual(this.f525a, aq4.f525a) && Intrinsics.areEqual(this.f526b, aq4.f526b) && Intrinsics.areEqual(this.f527c, aq4.f527c) && this.f528d == aq4.f528d && this.f529e == aq4.f529e && Intrinsics.areEqual(this.f530f, aq4.f530f) && Intrinsics.areEqual(this.f531g, aq4.f531g) && this.f532h == aq4.f532h && Intrinsics.areEqual((Object) this.f533i, (Object) aq4.f533i) && this.f534j == aq4.f534j && this.f535k == aq4.f535k && this.f536l == aq4.f536l && Intrinsics.areEqual(this.f537m, aq4.f537m) && Intrinsics.areEqual(this.f538n, aq4.f538n) && this.f539o == aq4.f539o && this.f540p == aq4.f540p && Intrinsics.areEqual(this.f541q, aq4.f541q) && Intrinsics.areEqual(this.f542r, aq4.f542r) && Intrinsics.areEqual(this.f543s, aq4.f543s) && Intrinsics.areEqual(this.f544t, aq4.f544t) && Intrinsics.areEqual(this.f545u, aq4.f545u) && Intrinsics.areEqual(this.f546v, aq4.f546v) && Intrinsics.areEqual(this.f547w, aq4.f547w) && Intrinsics.areEqual(this.f548x, aq4.f548x) && Intrinsics.areEqual((Object) this.f549y, (Object) aq4.f549y) && Intrinsics.areEqual((Object) this.f550z, (Object) aq4.f550z) && Intrinsics.areEqual((Object) this.f513A, (Object) aq4.f513A) && Intrinsics.areEqual(this.f514B, aq4.f514B) && Intrinsics.areEqual((Object) this.f515C, (Object) aq4.f515C) && Intrinsics.areEqual((Object) this.f516D, (Object) aq4.f516D) && Intrinsics.areEqual((Object) this.f517E, (Object) aq4.f517E) && Intrinsics.areEqual(this.f518F, aq4.f518F) && Intrinsics.areEqual((Object) this.f519G, (Object) aq4.f519G) && Intrinsics.areEqual((Object) this.f520H, (Object) aq4.f520H) && Intrinsics.areEqual((Object) this.f521I, (Object) aq4.f521I) && Intrinsics.areEqual(this.f522J, aq4.f522J) && Intrinsics.areEqual((Object) this.f523K, (Object) aq4.f523K) && Intrinsics.areEqual((Object) this.f524L, (Object) aq4.f524L);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideEndFlowError";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f525a), TuplesKt.m28425to("event_time", this.f526b), TuplesKt.m28425to("client_time", this.f527c), TuplesKt.m28425to("bird_is_bluetooth", Boolean.valueOf(this.f528d)), TuplesKt.m28425to("bird_is_cellular", Boolean.valueOf(this.f529e)), TuplesKt.m28425to("bird_model", this.f530f), TuplesKt.m28425to("currency", this.f531g), TuplesKt.m28425to("distance_in_meters", Long.valueOf(this.f532h)), TuplesKt.m28425to("duration_in_seconds", this.f533i), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f534j)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f535k)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f536l)), TuplesKt.m28425to("partner_id", this.f537m), TuplesKt.m28425to("ride_id", this.f538n), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f539o)), TuplesKt.m28425to("start_price", Long.valueOf(this.f540p)), TuplesKt.m28425to("start_time", this.f541q), TuplesKt.m28425to("area_ids", this.f542r), TuplesKt.m28425to("time_in_areas", this.f543s), TuplesKt.m28425to("description", this.f544t), TuplesKt.m28425to("is_network_connectivity_error", this.f545u), TuplesKt.m28425to("is_primary_ride", this.f546v), TuplesKt.m28425to("concurrent_ride_count", this.f547w), TuplesKt.m28425to("end_ride_attempt_id", this.f548x), TuplesKt.m28425to("ar_latitude", this.f549y), TuplesKt.m28425to("ar_longitude", this.f550z), TuplesKt.m28425to("ar_accuracy", this.f513A), TuplesKt.m28425to("ar_location_mocked", this.f514B), TuplesKt.m28425to("bird_latitude", this.f515C), TuplesKt.m28425to("bird_longitude", this.f516D), TuplesKt.m28425to("bird_accuracy", this.f517E), TuplesKt.m28425to("bird_location_mocked", this.f518F), TuplesKt.m28425to("gps_latitude", this.f519G), TuplesKt.m28425to("gps_longitude", this.f520H), TuplesKt.m28425to("gps_accuracy", this.f521I), TuplesKt.m28425to("gps_location_mocked", this.f522J), TuplesKt.m28425to("accuracy_limit", this.f523K), TuplesKt.m28425to("nest_additional_buffer_meters", this.f524L));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f525a.hashCode() * 31) + this.f526b.hashCode()) * 31) + this.f527c.hashCode()) * 31;
        boolean z = this.f528d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f529e;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        String str = this.f530f;
        int hashCode2 = (((((i4 + (str == null ? 0 : str.hashCode())) * 31) + this.f531g.hashCode()) * 31) + Long.hashCode(this.f532h)) * 31;
        Double d = this.f533i;
        int hashCode3 = (((((((hashCode2 + (d == null ? 0 : d.hashCode())) * 31) + Long.hashCode(this.f534j)) * 31) + Long.hashCode(this.f535k)) * 31) + Long.hashCode(this.f536l)) * 31;
        String str2 = this.f537m;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f538n;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.f539o;
        int hashCode6 = (((hashCode5 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + Long.hashCode(this.f540p)) * 31;
        DateTime dateTime = this.f541q;
        int hashCode7 = (hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        List<String> list = this.f542r;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.f543s;
        int hashCode9 = (((hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.f544t.hashCode()) * 31;
        Boolean bool = this.f545u;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f546v;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.f547w;
        int hashCode12 = (hashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f548x;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d2 = this.f549y;
        int hashCode14 = (hashCode13 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f550z;
        int hashCode15 = (hashCode14 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f513A;
        int hashCode16 = (hashCode15 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool3 = this.f514B;
        int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Double d5 = this.f515C;
        int hashCode18 = (hashCode17 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f516D;
        int hashCode19 = (hashCode18 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.f517E;
        int hashCode20 = (hashCode19 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Boolean bool4 = this.f518F;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Double d8 = this.f519G;
        int hashCode22 = (hashCode21 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.f520H;
        int hashCode23 = (hashCode22 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.f521I;
        int hashCode24 = (hashCode23 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool5 = this.f522J;
        int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Double d11 = this.f523K;
        int hashCode26 = (hashCode25 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f524L;
        return hashCode26 + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        String str = this.f525a;
        DateTime dateTime = this.f526b;
        DateTime dateTime2 = this.f527c;
        boolean z = this.f528d;
        boolean z2 = this.f529e;
        String str2 = this.f530f;
        String str3 = this.f531g;
        long j = this.f532h;
        Double d = this.f533i;
        long j2 = this.f534j;
        long j3 = this.f535k;
        long j4 = this.f536l;
        String str4 = this.f537m;
        String str5 = this.f538n;
        boolean z3 = this.f539o;
        long j5 = this.f540p;
        DateTime dateTime3 = this.f541q;
        List<String> list = this.f542r;
        List<Double> list2 = this.f543s;
        String str6 = this.f544t;
        Boolean bool = this.f545u;
        Boolean bool2 = this.f546v;
        Long l = this.f547w;
        String str7 = this.f548x;
        Double d2 = this.f549y;
        Double d3 = this.f550z;
        Double d4 = this.f513A;
        Boolean bool3 = this.f514B;
        Double d5 = this.f515C;
        Double d6 = this.f516D;
        Double d7 = this.f517E;
        Boolean bool4 = this.f518F;
        Double d8 = this.f519G;
        Double d9 = this.f520H;
        Double d10 = this.f521I;
        Boolean bool5 = this.f522J;
        Double d11 = this.f523K;
        Double d12 = this.f524L;
        return "RideEndFlowError(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", birdIsBluetooth=" + z + ", birdIsCellular=" + z2 + ", birdModel=" + str2 + ", currency=" + str3 + ", distanceInMeters=" + j + ", durationInSeconds=" + d + ", minimumRidePrice=" + j2 + ", minutePrice=" + j3 + ", minutesIncluded=" + j4 + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z3 + ", startPrice=" + j5 + ", startTime=" + dateTime3 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", description=" + str6 + ", isNetworkConnectivityError=" + bool + ", isPrimaryRide=" + bool2 + ", concurrentRideCount=" + l + ", endRideAttemptId=" + str7 + ", arLatitude=" + d2 + ", arLongitude=" + d3 + ", arAccuracy=" + d4 + ", arLocationMocked=" + bool3 + ", birdLatitude=" + d5 + ", birdLongitude=" + d6 + ", birdAccuracy=" + d7 + ", birdLocationMocked=" + bool4 + ", gpsLatitude=" + d8 + ", gpsLongitude=" + d9 + ", gpsAccuracy=" + d10 + ", gpsLocationMocked=" + bool5 + ", accuracyLimit=" + d11 + ", nestAdditionalBufferMeters=" + d12 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AQ4(String str, DateTime dateTime, DateTime dateTime2, boolean z, boolean z2, String str2, String str3, long j, Double d, long j2, long j3, long j4, String str4, String str5, boolean z3, long j5, DateTime dateTime3, List list, List list2, String str6, Boolean bool, Boolean bool2, Long l, String str7, Double d2, Double d3, Double d4, Boolean bool3, Double d5, Double d6, Double d7, Boolean bool4, Double d8, Double d9, Double d10, Boolean bool5, Double d11, Double d12, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, z, z2, (i & 32) != 0 ? null : str2, str3, j, (i & 256) != 0 ? null : d, j2, j3, j4, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : str5, z3, j5, (65536 & i) != 0 ? null : dateTime3, (131072 & i) != 0 ? null : list, (262144 & i) != 0 ? null : list2, str6, (1048576 & i) != 0 ? null : bool, (2097152 & i) != 0 ? null : bool2, (4194304 & i) != 0 ? null : l, (8388608 & i) != 0 ? null : str7, (16777216 & i) != 0 ? null : d2, (33554432 & i) != 0 ? null : d3, (67108864 & i) != 0 ? null : d4, (134217728 & i) != 0 ? null : bool3, (268435456 & i) != 0 ? null : d5, (536870912 & i) != 0 ? null : d6, (1073741824 & i) != 0 ? null : d7, (i & Integer.MIN_VALUE) != 0 ? null : bool4, (i2 & 1) != 0 ? null : d8, (i2 & 2) != 0 ? null : d9, (i2 & 4) != 0 ? null : d10, (i2 & 8) != 0 ? null : bool5, (i2 & 16) != 0 ? null : d11, (i2 & 32) != 0 ? null : d12);
        String str8;
        DateTime dateTime4;
        DateTime dateTime5;
        if ((i & 1) != 0) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            str8 = uuid;
        } else {
            str8 = str;
        }
        if ((i & 2) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime4 = now;
        } else {
            dateTime4 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime5 = now2;
        } else {
            dateTime5 = dateTime2;
        }
    }
}
