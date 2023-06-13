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
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\bf\n\u0002\u0010$\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u008a\u0004\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b4\u00105J\t\u00106\u001a\u00020\u0002HÖ\u0001J\t\u00108\u001a\u000207HÖ\u0001J\u0013\u0010;\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b\b\u0010GR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\bI\u0010GR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\b\n\u0010GR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010GR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010<\u001a\u0004\bN\u0010>R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010<\u001a\u0004\bP\u0010>R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010BR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010R\u001a\u0004\b\\\u0010TR\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b]\u0010R\u001a\u0004\b^\u0010TR\u0017\u0010\u0015\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b_\u0010R\u001a\u0004\b`\u0010TR\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\ba\u0010R\u001a\u0004\bb\u0010TR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010<\u001a\u0004\bd\u0010>R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010<\u001a\u0004\bf\u0010>R\u0017\u0010\u0019\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bk\u0010R\u001a\u0004\bl\u0010TR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010@\u001a\u0004\bn\u0010BR\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bo\u0010R\u001a\u0004\bp\u0010TR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bu\u0010r\u001a\u0004\bv\u0010tR\u0019\u0010 \u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bw\u0010F\u001a\u0004\bx\u0010GR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\by\u0010<\u001a\u0004\bz\u0010>R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b{\u0010<\u001a\u0004\b|\u0010>R\u0019\u0010#\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b}\u0010F\u001a\u0004\b#\u0010GR\u001b\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0004\bV\u0010<\u001a\u0005\b\u0082\u0001\u0010>R\u001d\u0010&\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010'\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u001d\u0010(\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u0086\u0001R\u001b\u0010)\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010F\u001a\u0005\b\u008c\u0001\u0010GR\u001d\u0010*\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0084\u0001\u001a\u0006\b\u008e\u0001\u0010\u0086\u0001R\u001c\u0010+\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000f\n\u0005\bR\u0010\u0084\u0001\u001a\u0006\b\u008f\u0001\u0010\u0086\u0001R\u001d\u0010,\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0084\u0001\u001a\u0006\b\u0091\u0001\u0010\u0086\u0001R\u001b\u0010-\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010F\u001a\u0005\b\u0093\u0001\u0010GR\u001d\u0010.\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0084\u0001\u001a\u0006\b\u0095\u0001\u0010\u0086\u0001R\u001d\u0010/\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0084\u0001\u001a\u0006\b\u0097\u0001\u0010\u0086\u0001R\u001d\u00100\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0084\u0001\u001a\u0006\b\u0099\u0001\u0010\u0086\u0001R\u001b\u00101\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010F\u001a\u0005\b\u009b\u0001\u0010GR\u001d\u00102\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u0084\u0001\u001a\u0006\b\u009d\u0001\u0010\u0086\u0001R\u001d\u00103\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0084\u0001\u001a\u0006\b\u009f\u0001\u0010\u0086\u0001R&\u0010£\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001090 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010¥\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010>¨\u0006¨\u0001"}, m28432d2 = {"LOP4;", "Lco/bird/android/model/analytics/AnalyticsEvent;", "", "eventId", "Lorg/joda/time/DateTime;", "eventTime", "clientTime", "", "isBluetoothBird", "birdIsBluetooth", "isCellularBird", "birdIsCellular", "birdModel", "currency", "", "distanceInMeters", "", "durationInSeconds", "endTime", "receiptPrice", "minimumRidePrice", "minutePrice", "minutesIncluded", "partnerId", "rideId", "hasSalesTax", "startPrice", "startTime", "ridePrice", "", "areaIds", "timeInAreas", "hadToParkInNest", "nearestNestId", "nestStatus", "isPrimaryRide", "concurrentRideCount", "endRideAttemptId", "arLatitude", "arLongitude", "arAccuracy", "arLocationMocked", "birdLatitude", "birdLongitude", "birdAccuracy", "birdLocationMocked", "gpsLatitude", "gpsLongitude", "gpsAccuracy", "gpsLocationMocked", "accuracyLimit", "nestAdditionalBufferMeters", C17296a.f69688o, "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)LOP4;", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "getEventTime", "()Lorg/joda/time/DateTime;", "c", "getClientTime", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "getBirdIsBluetooth", "f", "g", "getBirdIsCellular", "h", "getBirdModel", "i", "getCurrency", "j", "J", "getDistanceInMeters", "()J", "k", "D", "getDurationInSeconds", "()D", "l", "getEndTime", "m", "getReceiptPrice", "n", "getMinimumRidePrice", "o", "getMinutePrice", "p", "getMinutesIncluded", "q", "getPartnerId", "r", "getRideId", "s", "Z", "getHasSalesTax", "()Z", "t", "getStartPrice", "u", "getStartTime", "v", "getRidePrice", "w", "Ljava/util/List;", "getAreaIds", "()Ljava/util/List;", "x", "getTimeInAreas", "y", "getHadToParkInNest", "z", "getNearestNestId", "A", "getNestStatus", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Ljava/lang/Long;", "getConcurrentRideCount", "()Ljava/lang/Long;", "getEndRideAttemptId", "E", "Ljava/lang/Double;", "getArLatitude", "()Ljava/lang/Double;", "F", "getArLongitude", "G", "getArAccuracy", "H", "getArLocationMocked", "I", "getBirdLatitude", "getBirdLongitude", "K", "getBirdAccuracy", "L", "getBirdLocationMocked", "M", "getGpsLatitude", "N", "getGpsLongitude", "O", "getGpsAccuracy", "P", "getGpsLocationMocked", "Q", "getAccuracyLimit", "R", "getNestAdditionalBufferMeters", "", "getProperties", "()Ljava/util/Map;", "properties", "getName", "name", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OP4 */
/* loaded from: classes4.dex */
public final class OP4 implements AnalyticsEvent {

    /* renamed from: A */
    public final String f26492A;

    /* renamed from: B */
    public final Boolean f26493B;

    /* renamed from: C */
    public final Long f26494C;

    /* renamed from: D */
    public final String f26495D;

    /* renamed from: E */
    public final Double f26496E;

    /* renamed from: F */
    public final Double f26497F;

    /* renamed from: G */
    public final Double f26498G;

    /* renamed from: H */
    public final Boolean f26499H;

    /* renamed from: I */
    public final Double f26500I;

    /* renamed from: J */
    public final Double f26501J;

    /* renamed from: K */
    public final Double f26502K;

    /* renamed from: L */
    public final Boolean f26503L;

    /* renamed from: M */
    public final Double f26504M;

    /* renamed from: N */
    public final Double f26505N;

    /* renamed from: O */
    public final Double f26506O;

    /* renamed from: P */
    public final Boolean f26507P;

    /* renamed from: Q */
    public final Double f26508Q;

    /* renamed from: R */
    public final Double f26509R;

    /* renamed from: a */
    public final String f26510a;

    /* renamed from: b */
    public final DateTime f26511b;

    /* renamed from: c */
    public final DateTime f26512c;

    /* renamed from: d */
    public final Boolean f26513d;

    /* renamed from: e */
    public final Boolean f26514e;

    /* renamed from: f */
    public final Boolean f26515f;

    /* renamed from: g */
    public final Boolean f26516g;

    /* renamed from: h */
    public final String f26517h;

    /* renamed from: i */
    public final String f26518i;

    /* renamed from: j */
    public final long f26519j;

    /* renamed from: k */
    public final double f26520k;

    /* renamed from: l */
    public final DateTime f26521l;

    /* renamed from: m */
    public final long f26522m;

    /* renamed from: n */
    public final long f26523n;

    /* renamed from: o */
    public final long f26524o;

    /* renamed from: p */
    public final long f26525p;

    /* renamed from: q */
    public final String f26526q;

    /* renamed from: r */
    public final String f26527r;

    /* renamed from: s */
    public final boolean f26528s;

    /* renamed from: t */
    public final long f26529t;

    /* renamed from: u */
    public final DateTime f26530u;

    /* renamed from: v */
    public final long f26531v;

    /* renamed from: w */
    public final List<String> f26532w;

    /* renamed from: x */
    public final List<Double> f26533x;

    /* renamed from: y */
    public final Boolean f26534y;

    /* renamed from: z */
    public final String f26535z;

    public OP4(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String birdModel, String currency, long j, double d, DateTime endTime, long j2, long j3, long j4, long j5, String str, String rideId, boolean z, long j6, DateTime startTime, long j7, List<String> list, List<Double> list2, Boolean bool5, String str2, String str3, Boolean bool6, Long l, String str4, Double d2, Double d3, Double d4, Boolean bool7, Double d5, Double d6, Double d7, Boolean bool8, Double d8, Double d9, Double d10, Boolean bool9, Double d11, Double d12) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        this.f26510a = eventId;
        this.f26511b = eventTime;
        this.f26512c = clientTime;
        this.f26513d = bool;
        this.f26514e = bool2;
        this.f26515f = bool3;
        this.f26516g = bool4;
        this.f26517h = birdModel;
        this.f26518i = currency;
        this.f26519j = j;
        this.f26520k = d;
        this.f26521l = endTime;
        this.f26522m = j2;
        this.f26523n = j3;
        this.f26524o = j4;
        this.f26525p = j5;
        this.f26526q = str;
        this.f26527r = rideId;
        this.f26528s = z;
        this.f26529t = j6;
        this.f26530u = startTime;
        this.f26531v = j7;
        this.f26532w = list;
        this.f26533x = list2;
        this.f26534y = bool5;
        this.f26535z = str2;
        this.f26492A = str3;
        this.f26493B = bool6;
        this.f26494C = l;
        this.f26495D = str4;
        this.f26496E = d2;
        this.f26497F = d3;
        this.f26498G = d4;
        this.f26499H = bool7;
        this.f26500I = d5;
        this.f26501J = d6;
        this.f26502K = d7;
        this.f26503L = bool8;
        this.f26504M = d8;
        this.f26505N = d9;
        this.f26506O = d10;
        this.f26507P = bool9;
        this.f26508Q = d11;
        this.f26509R = d12;
    }

    /* renamed from: a */
    public final OP4 m92332a(String eventId, DateTime eventTime, DateTime clientTime, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String birdModel, String currency, long j, double d, DateTime endTime, long j2, long j3, long j4, long j5, String str, String rideId, boolean z, long j6, DateTime startTime, long j7, List<String> list, List<Double> list2, Boolean bool5, String str2, String str3, Boolean bool6, Long l, String str4, Double d2, Double d3, Double d4, Boolean bool7, Double d5, Double d6, Double d7, Boolean bool8, Double d8, Double d9, Double d10, Boolean bool9, Double d11, Double d12) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(clientTime, "clientTime");
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        return new OP4(eventId, eventTime, clientTime, bool, bool2, bool3, bool4, birdModel, currency, j, d, endTime, j2, j3, j4, j5, str, rideId, z, j6, startTime, j7, list, list2, bool5, str2, str3, bool6, l, str4, d2, d3, d4, bool7, d5, d6, d7, bool8, d8, d9, d10, bool9, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OP4) {
            OP4 op4 = (OP4) obj;
            return Intrinsics.areEqual(this.f26510a, op4.f26510a) && Intrinsics.areEqual(this.f26511b, op4.f26511b) && Intrinsics.areEqual(this.f26512c, op4.f26512c) && Intrinsics.areEqual(this.f26513d, op4.f26513d) && Intrinsics.areEqual(this.f26514e, op4.f26514e) && Intrinsics.areEqual(this.f26515f, op4.f26515f) && Intrinsics.areEqual(this.f26516g, op4.f26516g) && Intrinsics.areEqual(this.f26517h, op4.f26517h) && Intrinsics.areEqual(this.f26518i, op4.f26518i) && this.f26519j == op4.f26519j && Double.compare(this.f26520k, op4.f26520k) == 0 && Intrinsics.areEqual(this.f26521l, op4.f26521l) && this.f26522m == op4.f26522m && this.f26523n == op4.f26523n && this.f26524o == op4.f26524o && this.f26525p == op4.f26525p && Intrinsics.areEqual(this.f26526q, op4.f26526q) && Intrinsics.areEqual(this.f26527r, op4.f26527r) && this.f26528s == op4.f26528s && this.f26529t == op4.f26529t && Intrinsics.areEqual(this.f26530u, op4.f26530u) && this.f26531v == op4.f26531v && Intrinsics.areEqual(this.f26532w, op4.f26532w) && Intrinsics.areEqual(this.f26533x, op4.f26533x) && Intrinsics.areEqual(this.f26534y, op4.f26534y) && Intrinsics.areEqual(this.f26535z, op4.f26535z) && Intrinsics.areEqual(this.f26492A, op4.f26492A) && Intrinsics.areEqual(this.f26493B, op4.f26493B) && Intrinsics.areEqual(this.f26494C, op4.f26494C) && Intrinsics.areEqual(this.f26495D, op4.f26495D) && Intrinsics.areEqual((Object) this.f26496E, (Object) op4.f26496E) && Intrinsics.areEqual((Object) this.f26497F, (Object) op4.f26497F) && Intrinsics.areEqual((Object) this.f26498G, (Object) op4.f26498G) && Intrinsics.areEqual(this.f26499H, op4.f26499H) && Intrinsics.areEqual((Object) this.f26500I, (Object) op4.f26500I) && Intrinsics.areEqual((Object) this.f26501J, (Object) op4.f26501J) && Intrinsics.areEqual((Object) this.f26502K, (Object) op4.f26502K) && Intrinsics.areEqual(this.f26503L, op4.f26503L) && Intrinsics.areEqual((Object) this.f26504M, (Object) op4.f26504M) && Intrinsics.areEqual((Object) this.f26505N, (Object) op4.f26505N) && Intrinsics.areEqual((Object) this.f26506O, (Object) op4.f26506O) && Intrinsics.areEqual(this.f26507P, op4.f26507P) && Intrinsics.areEqual((Object) this.f26508Q, (Object) op4.f26508Q) && Intrinsics.areEqual((Object) this.f26509R, (Object) op4.f26509R);
        }
        return false;
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public String getName() {
        return "co.bird.data.event.clientanalytics.RideCompleted";
    }

    @Override // co.bird.android.model.analytics.AnalyticsEvent
    public Map<String, Object> getProperties() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsRequestV2.PARAM_EVENT_ID, this.f26510a), TuplesKt.m28425to("event_time", this.f26511b), TuplesKt.m28425to("client_time", this.f26512c), TuplesKt.m28425to("is_bluetooth_bird", this.f26513d), TuplesKt.m28425to("bird_is_bluetooth", this.f26514e), TuplesKt.m28425to("is_cellular_bird", this.f26515f), TuplesKt.m28425to("bird_is_cellular", this.f26516g), TuplesKt.m28425to("bird_model", this.f26517h), TuplesKt.m28425to("currency", this.f26518i), TuplesKt.m28425to("distance_in_meters", Long.valueOf(this.f26519j)), TuplesKt.m28425to("duration_in_seconds", Double.valueOf(this.f26520k)), TuplesKt.m28425to("end_time", this.f26521l), TuplesKt.m28425to("receipt_price", Long.valueOf(this.f26522m)), TuplesKt.m28425to("minimum_ride_price", Long.valueOf(this.f26523n)), TuplesKt.m28425to("minute_price", Long.valueOf(this.f26524o)), TuplesKt.m28425to("minutes_included", Long.valueOf(this.f26525p)), TuplesKt.m28425to("partner_id", this.f26526q), TuplesKt.m28425to("ride_id", this.f26527r), TuplesKt.m28425to("has_sales_tax", Boolean.valueOf(this.f26528s)), TuplesKt.m28425to("start_price", Long.valueOf(this.f26529t)), TuplesKt.m28425to("start_time", this.f26530u), TuplesKt.m28425to("ride_price", Long.valueOf(this.f26531v)), TuplesKt.m28425to("area_ids", this.f26532w), TuplesKt.m28425to("time_in_areas", this.f26533x), TuplesKt.m28425to("had_to_park_in_nest", this.f26534y), TuplesKt.m28425to("nearest_nest_id", this.f26535z), TuplesKt.m28425to("nest_status", this.f26492A), TuplesKt.m28425to("is_primary_ride", this.f26493B), TuplesKt.m28425to("concurrent_ride_count", this.f26494C), TuplesKt.m28425to("end_ride_attempt_id", this.f26495D), TuplesKt.m28425to("ar_latitude", this.f26496E), TuplesKt.m28425to("ar_longitude", this.f26497F), TuplesKt.m28425to("ar_accuracy", this.f26498G), TuplesKt.m28425to("ar_location_mocked", this.f26499H), TuplesKt.m28425to("bird_latitude", this.f26500I), TuplesKt.m28425to("bird_longitude", this.f26501J), TuplesKt.m28425to("bird_accuracy", this.f26502K), TuplesKt.m28425to("bird_location_mocked", this.f26503L), TuplesKt.m28425to("gps_latitude", this.f26504M), TuplesKt.m28425to("gps_longitude", this.f26505N), TuplesKt.m28425to("gps_accuracy", this.f26506O), TuplesKt.m28425to("gps_location_mocked", this.f26507P), TuplesKt.m28425to("accuracy_limit", this.f26508Q), TuplesKt.m28425to("nest_additional_buffer_meters", this.f26509R));
        return mapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f26510a.hashCode() * 31) + this.f26511b.hashCode()) * 31) + this.f26512c.hashCode()) * 31;
        Boolean bool = this.f26513d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f26514e;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f26515f;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f26516g;
        int hashCode5 = (((((((((((((((((((hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.f26517h.hashCode()) * 31) + this.f26518i.hashCode()) * 31) + Long.hashCode(this.f26519j)) * 31) + Double.hashCode(this.f26520k)) * 31) + this.f26521l.hashCode()) * 31) + Long.hashCode(this.f26522m)) * 31) + Long.hashCode(this.f26523n)) * 31) + Long.hashCode(this.f26524o)) * 31) + Long.hashCode(this.f26525p)) * 31;
        String str = this.f26526q;
        int hashCode6 = (((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.f26527r.hashCode()) * 31;
        boolean z = this.f26528s;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode7 = (((((((hashCode6 + i) * 31) + Long.hashCode(this.f26529t)) * 31) + this.f26530u.hashCode()) * 31) + Long.hashCode(this.f26531v)) * 31;
        List<String> list = this.f26532w;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.f26533x;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f26534y;
        int hashCode10 = (hashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f26535z;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26492A;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool6 = this.f26493B;
        int hashCode13 = (hashCode12 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l = this.f26494C;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f26495D;
        int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.f26496E;
        int hashCode16 = (hashCode15 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f26497F;
        int hashCode17 = (hashCode16 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f26498G;
        int hashCode18 = (hashCode17 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool7 = this.f26499H;
        int hashCode19 = (hashCode18 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Double d4 = this.f26500I;
        int hashCode20 = (hashCode19 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f26501J;
        int hashCode21 = (hashCode20 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f26502K;
        int hashCode22 = (hashCode21 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Boolean bool8 = this.f26503L;
        int hashCode23 = (hashCode22 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Double d7 = this.f26504M;
        int hashCode24 = (hashCode23 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.f26505N;
        int hashCode25 = (hashCode24 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.f26506O;
        int hashCode26 = (hashCode25 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Boolean bool9 = this.f26507P;
        int hashCode27 = (hashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Double d10 = this.f26508Q;
        int hashCode28 = (hashCode27 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f26509R;
        return hashCode28 + (d11 != null ? d11.hashCode() : 0);
    }

    public String toString() {
        String str = this.f26510a;
        DateTime dateTime = this.f26511b;
        DateTime dateTime2 = this.f26512c;
        Boolean bool = this.f26513d;
        Boolean bool2 = this.f26514e;
        Boolean bool3 = this.f26515f;
        Boolean bool4 = this.f26516g;
        String str2 = this.f26517h;
        String str3 = this.f26518i;
        long j = this.f26519j;
        double d = this.f26520k;
        DateTime dateTime3 = this.f26521l;
        long j2 = this.f26522m;
        long j3 = this.f26523n;
        long j4 = this.f26524o;
        long j5 = this.f26525p;
        String str4 = this.f26526q;
        String str5 = this.f26527r;
        boolean z = this.f26528s;
        long j6 = this.f26529t;
        DateTime dateTime4 = this.f26530u;
        long j7 = this.f26531v;
        List<String> list = this.f26532w;
        List<Double> list2 = this.f26533x;
        Boolean bool5 = this.f26534y;
        String str6 = this.f26535z;
        String str7 = this.f26492A;
        Boolean bool6 = this.f26493B;
        Long l = this.f26494C;
        String str8 = this.f26495D;
        Double d2 = this.f26496E;
        Double d3 = this.f26497F;
        Double d4 = this.f26498G;
        Boolean bool7 = this.f26499H;
        Double d5 = this.f26500I;
        Double d6 = this.f26501J;
        Double d7 = this.f26502K;
        Boolean bool8 = this.f26503L;
        Double d8 = this.f26504M;
        Double d9 = this.f26505N;
        Double d10 = this.f26506O;
        Boolean bool9 = this.f26507P;
        Double d11 = this.f26508Q;
        Double d12 = this.f26509R;
        return "RideCompleted(eventId=" + str + ", eventTime=" + dateTime + ", clientTime=" + dateTime2 + ", isBluetoothBird=" + bool + ", birdIsBluetooth=" + bool2 + ", isCellularBird=" + bool3 + ", birdIsCellular=" + bool4 + ", birdModel=" + str2 + ", currency=" + str3 + ", distanceInMeters=" + j + ", durationInSeconds=" + d + ", endTime=" + dateTime3 + ", receiptPrice=" + j2 + ", minimumRidePrice=" + j3 + ", minutePrice=" + j4 + ", minutesIncluded=" + j5 + ", partnerId=" + str4 + ", rideId=" + str5 + ", hasSalesTax=" + z + ", startPrice=" + j6 + ", startTime=" + dateTime4 + ", ridePrice=" + j7 + ", areaIds=" + list + ", timeInAreas=" + list2 + ", hadToParkInNest=" + bool5 + ", nearestNestId=" + str6 + ", nestStatus=" + str7 + ", isPrimaryRide=" + bool6 + ", concurrentRideCount=" + l + ", endRideAttemptId=" + str8 + ", arLatitude=" + d2 + ", arLongitude=" + d3 + ", arAccuracy=" + d4 + ", arLocationMocked=" + bool7 + ", birdLatitude=" + d5 + ", birdLongitude=" + d6 + ", birdAccuracy=" + d7 + ", birdLocationMocked=" + bool8 + ", gpsLatitude=" + d8 + ", gpsLongitude=" + d9 + ", gpsAccuracy=" + d10 + ", gpsLocationMocked=" + bool9 + ", accuracyLimit=" + d11 + ", nestAdditionalBufferMeters=" + d12 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OP4(String str, DateTime dateTime, DateTime dateTime2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, String str3, long j, double d, DateTime dateTime3, long j2, long j3, long j4, long j5, String str4, String str5, boolean z, long j6, DateTime dateTime4, long j7, List list, List list2, Boolean bool5, String str6, String str7, Boolean bool6, Long l, String str8, Double d2, Double d3, Double d4, Boolean bool7, Double d5, Double d6, Double d7, Boolean bool8, Double d8, Double d9, Double d10, Boolean bool9, Double d11, Double d12, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, r6, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, str2, str3, j, d, dateTime3, j2, j3, j4, j5, (i & 65536) != 0 ? null : str4, str5, z, j6, dateTime4, j7, (i & 4194304) != 0 ? null : list, (i & 8388608) != 0 ? null : list2, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool5, (i & 33554432) != 0 ? null : str6, (i & 67108864) != 0 ? null : str7, (i & 134217728) != 0 ? null : bool6, (i & 268435456) != 0 ? null : l, (i & 536870912) != 0 ? null : str8, (i & 1073741824) != 0 ? null : d2, (i & Integer.MIN_VALUE) != 0 ? null : d3, (i2 & 1) != 0 ? null : d4, (i2 & 2) != 0 ? null : bool7, (i2 & 4) != 0 ? null : d5, (i2 & 8) != 0 ? null : d6, (i2 & 16) != 0 ? null : d7, (i2 & 32) != 0 ? null : bool8, (i2 & 64) != 0 ? null : d8, (i2 & 128) != 0 ? null : d9, (i2 & 256) != 0 ? null : d10, (i2 & 512) != 0 ? null : bool9, (i2 & 1024) != 0 ? null : d11, (i2 & 2048) != 0 ? null : d12);
        String str9;
        DateTime dateTime5;
        DateTime dateTime6;
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
            dateTime5 = now;
        } else {
            dateTime5 = dateTime;
        }
        if ((i & 4) != 0) {
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            dateTime6 = now2;
        } else {
            dateTime6 = dateTime2;
        }
    }
}
