package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
@Metadata(m28433d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a \u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, m28432d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1484:1\n1436#1,6:1486\n1439#1,3:1492\n1436#1,6:1495\n1436#1,6:1501\n1439#1,3:1510\n1#2:1485\n1726#3,3:1507\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1360#1:1486,6\n1394#1:1492,3\n1397#1:1495,6\n1400#1:1501,6\n1436#1:1510,3\n1425#1:1507,3\n*E\n"})
/* loaded from: classes8.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final long durationOf(long j, int i) {
        return Duration.m118140constructorimpl((j << 1) + i);
    }

    public static final long durationOfMillis(long j) {
        return Duration.m118140constructorimpl((j << 1) + 1);
    }

    public static final long durationOfMillisNormalized(long j) {
        long coerceIn;
        if (!new LongRange(-4611686018426L, MAX_NANOS_IN_MILLIS).contains(j)) {
            coerceIn = RangesKt___RangesKt.coerceIn(j, -4611686018427387903L, (long) MAX_MILLIS);
            return durationOfMillis(coerceIn);
        }
        return durationOfNanos(millisToNanos(j));
    }

    public static final long durationOfNanos(long j) {
        return Duration.m118140constructorimpl(j << 1);
    }

    public static final long durationOfNanosNormalized(long j) {
        if (new LongRange(-4611686018426999999L, MAX_NANOS).contains(j)) {
            return durationOfNanos(j);
        }
        return durationOfMillis(nanosToMillis(j));
    }

    public static final long getDays(int i) {
        return toDuration(i, DurationUnit.DAYS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(double d) {
    }

    public static final long getHours(int i) {
        return toDuration(i, DurationUnit.HOURS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(double d) {
    }

    public static final long getMicroseconds(int i) {
        return toDuration(i, DurationUnit.MICROSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(double d) {
    }

    public static final long getMilliseconds(int i) {
        return toDuration(i, DurationUnit.MILLISECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(double d) {
    }

    public static final long getMinutes(int i) {
        return toDuration(i, DurationUnit.MINUTES);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(double d) {
    }

    public static final long getNanoseconds(int i) {
        return toDuration(i, DurationUnit.NANOSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(double d) {
    }

    public static final long getSeconds(int i) {
        return toDuration(i, DurationUnit.SECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(double d) {
    }

    public static final long millisToNanos(long j) {
        return j * ((long) NANOS_IN_MILLIS);
    }

    public static final long nanosToMillis(long j) {
        return j / ((long) NANOS_IN_MILLIS);
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x009a A[LOOP:1: B:220:0x006c->B:231:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x00a6 A[EDGE_INSN: B:354:0x00a6->B:233:0x00a6 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long parseDuration(String str, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        boolean regionMatches;
        int i2;
        boolean z4;
        int indexOf$default;
        boolean z5;
        boolean z6;
        char last;
        int i3;
        boolean z7;
        int lastIndex;
        int indexOf$default2;
        boolean z8;
        boolean contains$default;
        boolean startsWith$default;
        int length = str.length();
        if (length != 0) {
            Duration.Companion companion = Duration.Companion;
            long m118242getZEROUwyO8pc = companion.m118242getZEROUwyO8pc();
            char charAt = str.charAt(0);
            boolean z9 = true;
            if (charAt == '+' || charAt == '-') {
                i = 1;
            } else {
                i = 0;
            }
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                startsWith$default = StringsKt__StringsKt.startsWith$default((CharSequence) str, (char) CoreConstants.DASH_CHAR, false, 2, (Object) null);
                if (startsWith$default) {
                    z3 = true;
                    if (length <= i) {
                        char c = '0';
                        if (str.charAt(i) == 'P') {
                            int i4 = i + 1;
                            if (i4 != length) {
                                boolean z10 = false;
                                DurationUnit durationUnit = null;
                                while (i4 < length) {
                                    if (str.charAt(i4) == 'T') {
                                        if (!z10 && (i4 = i4 + 1) != length) {
                                            z10 = z9;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        int i5 = i4;
                                        while (true) {
                                            if (i5 < str.length()) {
                                                char charAt2 = str.charAt(i5);
                                                if (!new CharRange(c, '9').contains(charAt2)) {
                                                    i3 = length;
                                                    contains$default = StringsKt__StringsKt.contains$default((CharSequence) "+-.", charAt2, false, 2, (Object) null);
                                                    if (!contains$default) {
                                                        z8 = false;
                                                        if (z8) {
                                                            break;
                                                        }
                                                        i5++;
                                                        length = i3;
                                                        c = '0';
                                                    }
                                                } else {
                                                    i3 = length;
                                                }
                                                z8 = true;
                                                if (z8) {
                                                }
                                            } else {
                                                i3 = length;
                                                break;
                                            }
                                        }
                                        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                                        String substring = str.substring(i4, i5);
                                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        if (substring.length() == 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (!z7) {
                                            int length2 = i4 + substring.length();
                                            if (length2 >= 0) {
                                                lastIndex = StringsKt__StringsKt.getLastIndex(str);
                                                if (length2 <= lastIndex) {
                                                    char charAt3 = str.charAt(length2);
                                                    i4 = length2 + 1;
                                                    DurationUnit durationUnitByIsoChar = DurationUnitKt__DurationUnitKt.durationUnitByIsoChar(charAt3, z10);
                                                    if (durationUnit == null || durationUnit.compareTo(durationUnitByIsoChar) > 0) {
                                                        indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) substring, (char) CoreConstants.DOT, 0, false, 6, (Object) null);
                                                        if (durationUnitByIsoChar == DurationUnit.SECONDS && indexOf$default2 > 0) {
                                                            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                                                            String substring2 = substring.substring(0, indexOf$default2);
                                                            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                                            long m118176plusLRDsOJo = Duration.m118176plusLRDsOJo(m118242getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(substring2), durationUnitByIsoChar));
                                                            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                                                            String substring3 = substring.substring(indexOf$default2);
                                                            Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
                                                            m118242getZEROUwyO8pc = Duration.m118176plusLRDsOJo(m118176plusLRDsOJo, toDuration(Double.parseDouble(substring3), durationUnitByIsoChar));
                                                        } else {
                                                            m118242getZEROUwyO8pc = Duration.m118176plusLRDsOJo(m118242getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(substring), durationUnitByIsoChar));
                                                        }
                                                        durationUnit = durationUnitByIsoChar;
                                                        length = i3;
                                                        c = '0';
                                                        z9 = true;
                                                    } else {
                                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                                    }
                                                }
                                            }
                                            throw new IllegalArgumentException("Missing unit for value " + substring);
                                        }
                                        throw new IllegalArgumentException();
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else if (!z) {
                            String str2 = "null cannot be cast to non-null type java.lang.String";
                            String str3 = "this as java.lang.String).substring(startIndex)";
                            regionMatches = StringsKt__StringsJVMKt.regionMatches(str, i, "Infinity", 0, Math.max(length - i, 8), true);
                            if (regionMatches) {
                                m118242getZEROUwyO8pc = companion.m118240getINFINITEUwyO8pc();
                            } else {
                                boolean z11 = !z2;
                                if (z2 && str.charAt(i) == '(') {
                                    last = StringsKt___StringsKt.last(str);
                                    if (last == ')') {
                                        i++;
                                        int i6 = length - 1;
                                        if (i != i6) {
                                            i2 = i6;
                                            z11 = true;
                                            boolean z12 = false;
                                            DurationUnit durationUnit2 = null;
                                            while (i < i2) {
                                                if (z12 && z11) {
                                                    while (i < str.length()) {
                                                        if (str.charAt(i) == ' ') {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (!z6) {
                                                            break;
                                                        }
                                                        i++;
                                                    }
                                                }
                                                int i7 = i;
                                                while (i7 < str.length()) {
                                                    char charAt4 = str.charAt(i7);
                                                    if (!new CharRange('0', '9').contains(charAt4) && charAt4 != '.') {
                                                        z5 = false;
                                                    } else {
                                                        z5 = true;
                                                    }
                                                    if (!z5) {
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                                String str4 = str2;
                                                Intrinsics.checkNotNull(str, str4);
                                                String substring4 = str.substring(i, i7);
                                                Intrinsics.checkNotNullExpressionValue(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                                if (substring4.length() == 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    int length3 = i + substring4.length();
                                                    int i8 = length3;
                                                    while (i8 < str.length()) {
                                                        if (!new CharRange('a', 'z').contains(str.charAt(i8))) {
                                                            break;
                                                        }
                                                        i8++;
                                                    }
                                                    Intrinsics.checkNotNull(str, str4);
                                                    String substring5 = str.substring(length3, i8);
                                                    Intrinsics.checkNotNullExpressionValue(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                                    i = length3 + substring5.length();
                                                    DurationUnit durationUnitByShortName = DurationUnitKt__DurationUnitKt.durationUnitByShortName(substring5);
                                                    if (durationUnit2 == null || durationUnit2.compareTo(durationUnitByShortName) > 0) {
                                                        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) substring4, (char) CoreConstants.DOT, 0, false, 6, (Object) null);
                                                        if (indexOf$default > 0) {
                                                            Intrinsics.checkNotNull(substring4, str4);
                                                            String substring6 = substring4.substring(0, indexOf$default);
                                                            Intrinsics.checkNotNullExpressionValue(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                                            long m118176plusLRDsOJo2 = Duration.m118176plusLRDsOJo(m118242getZEROUwyO8pc, toDuration(Long.parseLong(substring6), durationUnitByShortName));
                                                            Intrinsics.checkNotNull(substring4, str4);
                                                            String substring7 = substring4.substring(indexOf$default);
                                                            String str5 = str3;
                                                            Intrinsics.checkNotNullExpressionValue(substring7, str5);
                                                            m118242getZEROUwyO8pc = Duration.m118176plusLRDsOJo(m118176plusLRDsOJo2, toDuration(Double.parseDouble(substring7), durationUnitByShortName));
                                                            if (i >= i2) {
                                                                str3 = str5;
                                                            } else {
                                                                throw new IllegalArgumentException("Fractional component must be last");
                                                            }
                                                        } else {
                                                            m118242getZEROUwyO8pc = Duration.m118176plusLRDsOJo(m118242getZEROUwyO8pc, toDuration(Long.parseLong(substring4), durationUnitByShortName));
                                                        }
                                                        str2 = str4;
                                                        durationUnit2 = durationUnitByShortName;
                                                        z12 = true;
                                                    } else {
                                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException();
                                                }
                                            }
                                        } else {
                                            throw new IllegalArgumentException("No components");
                                        }
                                    }
                                }
                                i2 = length;
                                boolean z122 = false;
                                DurationUnit durationUnit22 = null;
                                while (i < i2) {
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        if (z3) {
                            return Duration.m118192unaryMinusUwyO8pc(m118242getZEROUwyO8pc);
                        }
                        return m118242getZEROUwyO8pc;
                    }
                    throw new IllegalArgumentException("No components");
                }
            }
            z3 = false;
            if (length <= i) {
            }
        } else {
            throw new IllegalArgumentException("The string is empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long parseOverLongIsoComponent(String str) {
        int i;
        boolean startsWith$default;
        int lastIndex;
        boolean z;
        boolean contains$default;
        int length = str.length();
        if (length > 0) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null);
            if (contains$default) {
                i = 1;
                if (length - i > 16) {
                    lastIndex = StringsKt__StringsKt.getLastIndex(str);
                    IntRange intRange = new IntRange(i, lastIndex);
                    if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                        Iterator<Integer> it = intRange.iterator();
                        while (it.hasNext()) {
                            if (!new CharRange('0', '9').contains(str.charAt(((IntIterator) it).nextInt()))) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        if (str.charAt(0) == '-') {
                            return Long.MIN_VALUE;
                        }
                        return LongCompanionObject.MAX_VALUE;
                    }
                }
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "+", false, 2, null);
                if (startsWith$default) {
                    str = StringsKt___StringsKt.drop(str, 1);
                }
                return Long.parseLong(str);
            }
        }
        i = 0;
        if (length - i > 16) {
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "+", false, 2, null);
        if (startsWith$default) {
        }
        return Long.parseLong(str);
    }

    private static final int skipWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        while (i < str.length() && function1.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final String substringWhile(String str, int i, Function1<? super Character, Boolean> function1) {
        int i2 = i;
        while (i2 < str.length() && function1.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: times-kIfJnKk */
    private static final long m118265timeskIfJnKk(double d, long j) {
        return Duration.m118177timesUwyO8pc(j, d);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    @InlineOnly
    /* renamed from: times-mvk6XK0 */
    private static final long m118266timesmvk6XK0(int i, long j) {
        return Duration.m118178timesUwyO8pc(j, i);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(int i, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(DurationUnit.SECONDS) <= 0) {
            return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(i, unit, DurationUnit.NANOSECONDS));
        }
        return toDuration(i, unit);
    }

    public static final long getDays(long j) {
        return toDuration(j, DurationUnit.DAYS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(int i) {
    }

    public static final long getHours(long j) {
        return toDuration(j, DurationUnit.HOURS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(int i) {
    }

    public static final long getMicroseconds(long j) {
        return toDuration(j, DurationUnit.MICROSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(int i) {
    }

    public static final long getMilliseconds(long j) {
        return toDuration(j, DurationUnit.MILLISECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(int i) {
    }

    public static final long getMinutes(long j) {
        return toDuration(j, DurationUnit.MINUTES);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(int i) {
    }

    public static final long getNanoseconds(long j) {
        return toDuration(j, DurationUnit.NANOSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(int i) {
    }

    public static final long getSeconds(long j) {
        return toDuration(j, DurationUnit.SECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(int i) {
    }

    public static final long getDays(double d) {
        return toDuration(d, DurationUnit.DAYS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getDays$annotations(long j) {
    }

    public static final long getHours(double d) {
        return toDuration(d, DurationUnit.HOURS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getHours$annotations(long j) {
    }

    public static final long getMicroseconds(double d) {
        return toDuration(d, DurationUnit.MICROSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMicroseconds$annotations(long j) {
    }

    public static final long getMilliseconds(double d) {
        return toDuration(d, DurationUnit.MILLISECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMilliseconds$annotations(long j) {
    }

    public static final long getMinutes(double d) {
        return toDuration(d, DurationUnit.MINUTES);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getMinutes$annotations(long j) {
    }

    public static final long getNanoseconds(double d) {
        return toDuration(d, DurationUnit.NANOSECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getNanoseconds$annotations(long j) {
    }

    public static final long getSeconds(double d) {
        return toDuration(d, DurationUnit.SECONDS);
    }

    @SinceKotlin(version = "1.3")
    @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @DeprecatedSinceKotlin(errorSince = "1.8", warningSince = "1.5")
    @ExperimentalTime
    public static /* synthetic */ void getSeconds$annotations(long j) {
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(long j, DurationUnit unit) {
        long coerceIn;
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long convertDurationUnitOverflow = DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(MAX_NANOS, durationUnit, unit);
        if (!new LongRange(-convertDurationUnitOverflow, convertDurationUnitOverflow).contains(j)) {
            coerceIn = RangesKt___RangesKt.coerceIn(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, (long) MAX_MILLIS);
            return durationOfMillis(coerceIn);
        }
        return durationOfNanos(DurationUnitKt__DurationUnitJvmKt.convertDurationUnitOverflow(j, unit, durationUnit));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public static final long toDuration(double d, DurationUnit unit) {
        long roundToLong;
        long roundToLong2;
        Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.NANOSECONDS);
        if (!Double.isNaN(convertDurationUnit)) {
            roundToLong = MathKt__MathJVMKt.roundToLong(convertDurationUnit);
            if (!new LongRange(-4611686018426999999L, MAX_NANOS).contains(roundToLong)) {
                roundToLong2 = MathKt__MathJVMKt.roundToLong(DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(d, unit, DurationUnit.MILLISECONDS));
                return durationOfMillisNormalized(roundToLong2);
            }
            return durationOfNanos(roundToLong);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }
}
