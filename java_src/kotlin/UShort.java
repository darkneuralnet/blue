package kotlin;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.p056ws.WebSocketProtocol;
@SinceKotlin(version = "1.5")
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0014\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\u001a\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u0013J\u001b\u0010&\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0005J\u0016\u00100\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0005J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b3\u0010\u0010J\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\b4\u0010\u0013J\u001b\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\b5\u0010\u001fJ\u001b\u00102\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b6\u0010\u0018J\u001b\u00107\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0087\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u00107\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\bø\u0001\u0000¢\u0006\u0004\b:\u0010\u0013J\u001b\u00107\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010\u001fJ\u001b\u00107\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010\u000bJ\u001b\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\b>\u0010\u000bJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010\u0010J\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bA\u0010\u0013J\u001b\u0010?\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010\u001fJ\u001b\u0010?\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bC\u0010\u0018J\u001b\u0010D\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020E2\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bI\u0010GJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bK\u0010\u0010J\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bL\u0010\u0013J\u001b\u0010J\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bM\u0010\u001fJ\u001b\u0010J\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bN\u0010\u0018J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000eH\u0087\nø\u0001\u0000¢\u0006\u0004\bP\u0010\u0010J\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0011H\u0087\nø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013J\u001b\u0010O\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0014H\u0087\nø\u0001\u0000¢\u0006\u0004\bR\u0010\u001fJ\u001b\u0010O\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\bS\u0010\u0018J\u0010\u0010T\u001a\u00020UH\u0087\b¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020YH\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020]H\u0087\b¢\u0006\u0004\b^\u0010_J\u0010\u0010`\u001a\u00020\rH\u0087\b¢\u0006\u0004\ba\u0010-J\u0010\u0010b\u001a\u00020cH\u0087\b¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010\u0005J\u000f\u0010h\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u0016\u0010l\u001a\u00020\u000eH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bm\u0010WJ\u0016\u0010n\u001a\u00020\u0011H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010-J\u0016\u0010p\u001a\u00020\u0014H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010eJ\u0016\u0010r\u001a\u00020\u0000H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010\u0005J\u001b\u0010t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\fø\u0001\u0000¢\u0006\u0004\bu\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006w"}, m28432d2 = {"Lkotlin/UShort;", "", MessageExtension.FIELD_DATA, "", "constructor-impl", "(S)S", "getData$annotations", "()V", "and", LegacyRepairType.OTHER_KEY, "and-xj2QHRw", "(SS)S", "compareTo", "", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "compareTo-xj2QHRw", "(SS)I", "dec", "dec-Mh2AYeg", "div", "div-7apg3OU", "div-WZ4Q5Ns", "div-VKZWuLQ", "(SJ)J", "div-xj2QHRw", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floorDiv", "floorDiv-7apg3OU", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode", "hashCode-impl", "(S)I", "inc", "inc-Mh2AYeg", "inv", "inv-Mh2AYeg", "minus", "minus-7apg3OU", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod", "mod-7apg3OU", "(SB)B", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "or", "or-xj2QHRw", "plus", "plus-7apg3OU", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "rem", "rem-7apg3OU", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times", "times-7apg3OU", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte", "", "toByte-impl", "(S)B", "toDouble", "", "toDouble-impl", "(S)D", "toFloat", "", "toFloat-impl", "(S)F", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toShort", "toShort-impl", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "toUByte", "toUByte-w2LRezQ", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toUShort", "toUShort-Mh2AYeg", "xor", "xor-xj2QHRw", "Companion", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@JvmInline
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes8.dex */
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\n"}, m28432d2 = {"Lkotlin/UShort$Companion;", "", "()V", "MAX_VALUE", "Lkotlin/UShort;", "S", "MIN_VALUE", "SIZE_BITS", "", "SIZE_BYTES", "kotlin-stdlib"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s) {
        this.data = s;
    }

    @InlineOnly
    /* renamed from: and-xj2QHRw  reason: not valid java name */
    private static final short m117057andxj2QHRw(short s, short s2) {
        return m117064constructorimpl((short) (s & s2));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ UShort m117058boximpl(short s) {
        return new UShort(s);
    }

    @InlineOnly
    /* renamed from: compareTo-7apg3OU  reason: not valid java name */
    private static final int m117059compareTo7apg3OU(short s, byte b) {
        return Intrinsics.compare(s & MAX_VALUE, b & UByte.MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: compareTo-VKZWuLQ  reason: not valid java name */
    private static final int m117060compareToVKZWuLQ(short s, long j) {
        int compare;
        compare = Long.compare(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-WZ4Q5Ns  reason: not valid java name */
    private static final int m117061compareToWZ4Q5Ns(short s, int i) {
        int compare;
        compare = Integer.compare(UInt.m116878constructorimpl(s & MAX_VALUE) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
        return compare;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private int m117062compareToxj2QHRw(short s) {
        return Intrinsics.compare(m117114unboximpl() & MAX_VALUE, s & MAX_VALUE);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m117064constructorimpl(short s) {
        return s;
    }

    @InlineOnly
    /* renamed from: dec-Mh2AYeg  reason: not valid java name */
    private static final short m117065decMh2AYeg(short s) {
        return m117064constructorimpl((short) (s - 1));
    }

    @InlineOnly
    /* renamed from: div-7apg3OU  reason: not valid java name */
    private static final int m117066div7apg3OU(short s, byte b) {
        return C33743Jc6.m100111a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: div-VKZWuLQ  reason: not valid java name */
    private static final long m117067divVKZWuLQ(short s, long j) {
        return C37019Xc6.m76753a(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: div-WZ4Q5Ns  reason: not valid java name */
    private static final int m117068divWZ4Q5Ns(short s, int i) {
        return C33743Jc6.m100111a(UInt.m116878constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: div-xj2QHRw  reason: not valid java name */
    private static final int m117069divxj2QHRw(short s, short s2) {
        return C33743Jc6.m100111a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m117070equalsimpl(short s, Object obj) {
        return (obj instanceof UShort) && s == ((UShort) obj).m117114unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m117071equalsimpl0(short s, short s2) {
        return s == s2;
    }

    @InlineOnly
    /* renamed from: floorDiv-7apg3OU  reason: not valid java name */
    private static final int m117072floorDiv7apg3OU(short s, byte b) {
        return C33743Jc6.m100111a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: floorDiv-VKZWuLQ  reason: not valid java name */
    private static final long m117073floorDivVKZWuLQ(short s, long j) {
        return C37019Xc6.m76753a(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: floorDiv-WZ4Q5Ns  reason: not valid java name */
    private static final int m117074floorDivWZ4Q5Ns(short s, int i) {
        return C33743Jc6.m100111a(UInt.m116878constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: floorDiv-xj2QHRw  reason: not valid java name */
    private static final int m117075floorDivxj2QHRw(short s, short s2) {
        return C33743Jc6.m100111a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m117076hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    @InlineOnly
    /* renamed from: inc-Mh2AYeg  reason: not valid java name */
    private static final short m117077incMh2AYeg(short s) {
        return m117064constructorimpl((short) (s + 1));
    }

    @InlineOnly
    /* renamed from: inv-Mh2AYeg  reason: not valid java name */
    private static final short m117078invMh2AYeg(short s) {
        return m117064constructorimpl((short) (~s));
    }

    @InlineOnly
    /* renamed from: minus-7apg3OU  reason: not valid java name */
    private static final int m117079minus7apg3OU(short s, byte b) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) - UInt.m116878constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: minus-VKZWuLQ  reason: not valid java name */
    private static final long m117080minusVKZWuLQ(short s, long j) {
        return ULong.m116957constructorimpl(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @InlineOnly
    /* renamed from: minus-WZ4Q5Ns  reason: not valid java name */
    private static final int m117081minusWZ4Q5Ns(short s, int i) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) - i);
    }

    @InlineOnly
    /* renamed from: minus-xj2QHRw  reason: not valid java name */
    private static final int m117082minusxj2QHRw(short s, short s2) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) - UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: mod-7apg3OU  reason: not valid java name */
    private static final byte m117083mod7apg3OU(short s, byte b) {
        return UByte.m116801constructorimpl((byte) C33509Ic6.m101887a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(b & UByte.MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: mod-VKZWuLQ  reason: not valid java name */
    private static final long m117084modVKZWuLQ(short s, long j) {
        return C34211Lc6.m96583a(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: mod-WZ4Q5Ns  reason: not valid java name */
    private static final int m117085modWZ4Q5Ns(short s, int i) {
        return C33509Ic6.m101887a(UInt.m116878constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: mod-xj2QHRw  reason: not valid java name */
    private static final short m117086modxj2QHRw(short s, short s2) {
        return m117064constructorimpl((short) C33509Ic6.m101887a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(s2 & MAX_VALUE)));
    }

    @InlineOnly
    /* renamed from: or-xj2QHRw  reason: not valid java name */
    private static final short m117087orxj2QHRw(short s, short s2) {
        return m117064constructorimpl((short) (s | s2));
    }

    @InlineOnly
    /* renamed from: plus-7apg3OU  reason: not valid java name */
    private static final int m117088plus7apg3OU(short s, byte b) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) + UInt.m116878constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: plus-VKZWuLQ  reason: not valid java name */
    private static final long m117089plusVKZWuLQ(short s, long j) {
        return ULong.m116957constructorimpl(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @InlineOnly
    /* renamed from: plus-WZ4Q5Ns  reason: not valid java name */
    private static final int m117090plusWZ4Q5Ns(short s, int i) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) + i);
    }

    @InlineOnly
    /* renamed from: plus-xj2QHRw  reason: not valid java name */
    private static final int m117091plusxj2QHRw(short s, short s2) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) + UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rangeTo-xj2QHRw  reason: not valid java name */
    private static final UIntRange m117092rangeToxj2QHRw(short s, short s2) {
        return new UIntRange(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(s2 & MAX_VALUE), null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-xj2QHRw  reason: not valid java name */
    private static final UIntRange m117093rangeUntilxj2QHRw(short s, short s2) {
        return URangesKt.m118049untilJ1ME1BU(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-7apg3OU  reason: not valid java name */
    private static final int m117094rem7apg3OU(short s, byte b) {
        return C33509Ic6.m101887a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: rem-VKZWuLQ  reason: not valid java name */
    private static final long m117095remVKZWuLQ(short s, long j) {
        return C34211Lc6.m96583a(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @InlineOnly
    /* renamed from: rem-WZ4Q5Ns  reason: not valid java name */
    private static final int m117096remWZ4Q5Ns(short s, int i) {
        return C33509Ic6.m101887a(UInt.m116878constructorimpl(s & MAX_VALUE), i);
    }

    @InlineOnly
    /* renamed from: rem-xj2QHRw  reason: not valid java name */
    private static final int m117097remxj2QHRw(short s, short s2) {
        return C33509Ic6.m101887a(UInt.m116878constructorimpl(s & MAX_VALUE), UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-7apg3OU  reason: not valid java name */
    private static final int m117098times7apg3OU(short s, byte b) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) * UInt.m116878constructorimpl(b & UByte.MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: times-VKZWuLQ  reason: not valid java name */
    private static final long m117099timesVKZWuLQ(short s, long j) {
        return ULong.m116957constructorimpl(ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @InlineOnly
    /* renamed from: times-WZ4Q5Ns  reason: not valid java name */
    private static final int m117100timesWZ4Q5Ns(short s, int i) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) * i);
    }

    @InlineOnly
    /* renamed from: times-xj2QHRw  reason: not valid java name */
    private static final int m117101timesxj2QHRw(short s, short s2) {
        return UInt.m116878constructorimpl(UInt.m116878constructorimpl(s & MAX_VALUE) * UInt.m116878constructorimpl(s2 & MAX_VALUE));
    }

    @InlineOnly
    /* renamed from: toByte-impl  reason: not valid java name */
    private static final byte m117102toByteimpl(short s) {
        return (byte) s;
    }

    @InlineOnly
    /* renamed from: toDouble-impl  reason: not valid java name */
    private static final double m117103toDoubleimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toFloat-impl  reason: not valid java name */
    private static final float m117104toFloatimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toInt-impl  reason: not valid java name */
    private static final int m117105toIntimpl(short s) {
        return s & MAX_VALUE;
    }

    @InlineOnly
    /* renamed from: toLong-impl  reason: not valid java name */
    private static final long m117106toLongimpl(short s) {
        return s & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @InlineOnly
    /* renamed from: toShort-impl  reason: not valid java name */
    private static final short m117107toShortimpl(short s) {
        return s;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m117108toStringimpl(short s) {
        return String.valueOf(s & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toUByte-w2LRezQ  reason: not valid java name */
    private static final byte m117109toUBytew2LRezQ(short s) {
        return UByte.m116801constructorimpl((byte) s);
    }

    @InlineOnly
    /* renamed from: toUInt-pVg5ArA  reason: not valid java name */
    private static final int m117110toUIntpVg5ArA(short s) {
        return UInt.m116878constructorimpl(s & MAX_VALUE);
    }

    @InlineOnly
    /* renamed from: toULong-s-VKNKU  reason: not valid java name */
    private static final long m117111toULongsVKNKU(short s) {
        return ULong.m116957constructorimpl(s & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @InlineOnly
    /* renamed from: toUShort-Mh2AYeg  reason: not valid java name */
    private static final short m117112toUShortMh2AYeg(short s) {
        return s;
    }

    @InlineOnly
    /* renamed from: xor-xj2QHRw  reason: not valid java name */
    private static final short m117113xorxj2QHRw(short s, short s2) {
        return m117064constructorimpl((short) (s ^ s2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m117114unboximpl() & MAX_VALUE, uShort.m117114unboximpl() & MAX_VALUE);
    }

    public boolean equals(Object obj) {
        return m117070equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m117076hashCodeimpl(this.data);
    }

    public String toString() {
        return m117108toStringimpl(this.data);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m117114unboximpl() {
        return this.data;
    }

    @InlineOnly
    /* renamed from: compareTo-xj2QHRw  reason: not valid java name */
    private static int m117063compareToxj2QHRw(short s, short s2) {
        return Intrinsics.compare(s & MAX_VALUE, s2 & MAX_VALUE);
    }
}