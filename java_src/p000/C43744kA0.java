package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B'\u0012\u0006\u0010,\u001a\u00020*\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00107\u001a\u00020\u001b¢\u0006\u0004\bS\u0010TJ\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J%\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000eH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u001b*\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000eH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002J\"\u0010&\u001a\u00020%*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\"\u0010)\u001a\u00020%*\u00020(2\u0006\u0010$\u001a\u00020(H\u0082\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00106R\u001f\u0010G\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00106R\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010R\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bF\u0010Q\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, m28432d2 = {"LkA0;", "LI20;", "Lgh3;", "Lch3;", "LOs4;", "localRect", C17296a.f69688o, "Lkotlin/Function0;", "", "b", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnm2;", "coordinates", "t", "LG52;", "size", "A", "(J)V", "I", "N", "", "x", "G", "childBounds", "containerSize", "E", "(LOs4;J)LOs4;", "", "K", "(LOs4;J)Z", "LCe3;", "P", "(LOs4;J)J", "leadingEdge", "trailingEdge", "O", LegacyRepairType.OTHER_KEY, "", "z", "(JJ)I", "LxB5;", "D", "LZC0;", "LZC0;", Action.SCOPE_ATTRIBUTE, "LEy3;", "c", "LEy3;", "orientation", "Laq5;", DateTokenConverter.CONVERTER_KEY, "Laq5;", "scrollState", "e", "Z", "reverseDirection", "LD20;", "f", "LD20;", "bringIntoViewRequests", "g", "Lnm2;", "h", "focusedChild", "i", "LOs4;", "focusedChildBoundsFromPreviousRemeasure", "j", "trackingFocusedChild", "k", "J", "viewportSize", "l", "isAnimationRunning", "LFe6;", "m", "LFe6;", "animationState", "LgV2;", "n", "LgV2;", "()LgV2;", "modifier", "<init>", "(LZC0;LEy3;Laq5;Z)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
/* renamed from: kA0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43744kA0 implements I20, InterfaceC41679gh3, InterfaceC39290ch3 {

    /* renamed from: b */
    public final ZC0 f94018b;

    /* renamed from: c */
    public final EnumC32768Ey3 f94019c;

    /* renamed from: d */
    public final InterfaceC38196aq5 f94020d;

    /* renamed from: e */
    public final boolean f94021e;

    /* renamed from: f */
    public final D20 f94022f;

    /* renamed from: g */
    public InterfaceC45879nm2 f94023g;

    /* renamed from: h */
    public InterfaceC45879nm2 f94024h;

    /* renamed from: i */
    public C35055Os4 f94025i;

    /* renamed from: j */
    public boolean f94026j;

    /* renamed from: k */
    public long f94027k;

    /* renamed from: l */
    public boolean f94028l;

    /* renamed from: m */
    public final C32825Fe6 f94029m;

    /* renamed from: n */
    public final InterfaceC41563gV2 f94030n;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LkA0$a;", "", "", "toString", "Lkotlin/Function0;", "LOs4;", C17296a.f69688o, "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "currentBounds", "LWc0;", "", "LWc0;", "()LWc0;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;LWc0;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    /* renamed from: kA0$a */
    /* loaded from: classes.dex */
    public static final class C25120a {

        /* renamed from: a */
        public final Function0<C35055Os4> f94031a;

        /* renamed from: b */
        public final InterfaceC36779Wc0<Unit> f94032b;

        /* JADX WARN: Multi-variable type inference failed */
        public C25120a(Function0<C35055Os4> currentBounds, InterfaceC36779Wc0<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(currentBounds, "currentBounds");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f94031a = currentBounds;
            this.f94032b = continuation;
        }

        /* renamed from: a */
        public final InterfaceC36779Wc0<Unit> m29209a() {
            return this.f94032b;
        }

        /* renamed from: b */
        public final Function0<C35055Os4> m29208b() {
            return this.f94031a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
            if (r0 == null) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            String str;
            int checkRadix;
            String str2;
            XC0 xc0 = (XC0) this.f94032b.getContext().get(XC0.f42869c);
            if (xc0 != null) {
                str = xc0.m77190y();
            } else {
                str = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Request@");
            int hashCode = hashCode();
            checkRadix = CharsKt__CharJVMKt.checkRadix(16);
            String num = Integer.toString(hashCode, checkRadix);
            Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
            sb.append(num);
            if (str != null) {
                str2 = '[' + str + "](";
            }
            str2 = "(";
            sb.append(str2);
            sb.append("currentBounds()=");
            sb.append(this.f94031a.invoke());
            sb.append(", continuation=");
            sb.append(this.f94032b);
            sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb.toString();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kA0$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C25121b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC32768Ey3.values().length];
            try {
                iArr[EnumC32768Ey3.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32768Ey3.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", m28418f = "ContentInViewModifier.kt", m28417i = {}, m28416l = {193}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: kA0$c */
    /* loaded from: classes.dex */
    public static final class C25122c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f94033h;

        /* renamed from: i */
        public /* synthetic */ Object f94034i;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", m28418f = "ContentInViewModifier.kt", m28417i = {}, m28416l = {198}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: kA0$c$a */
        /* loaded from: classes.dex */
        public static final class C25123a extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f94036h;

            /* renamed from: i */
            public /* synthetic */ Object f94037i;

            /* renamed from: j */
            public final /* synthetic */ C43744kA0 f94038j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC52943zh2 f94039k;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "delta", "", C17296a.f69688o, "(F)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: kA0$c$a$a */
            /* loaded from: classes.dex */
            public static final class C25124a extends Lambda implements Function1<Float, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C43744kA0 f94040g;

                /* renamed from: h */
                public final /* synthetic */ InterfaceC36901Wp5 f94041h;

                /* renamed from: i */
                public final /* synthetic */ InterfaceC52943zh2 f94042i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C25124a(C43744kA0 c43744kA0, InterfaceC36901Wp5 interfaceC36901Wp5, InterfaceC52943zh2 interfaceC52943zh2) {
                    super(1);
                    this.f94040g = c43744kA0;
                    this.f94041h = interfaceC36901Wp5;
                    this.f94042i = interfaceC52943zh2;
                }

                /* renamed from: a */
                public final void m29206a(float f) {
                    float f2;
                    if (this.f94040g.f94021e) {
                        f2 = 1.0f;
                    } else {
                        f2 = -1.0f;
                    }
                    float mo43646a = f2 * this.f94041h.mo43646a(f2 * f);
                    if (mo43646a < f) {
                        InterfaceC52943zh2 interfaceC52943zh2 = this.f94042i;
                        C34486Mh2.m95042e(interfaceC52943zh2, "Scroll animation cancelled because scroll was not consumed (" + mo43646a + " < " + f + CoreConstants.RIGHT_PARENTHESIS_CHAR, null, 2, null);
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    m29206a(f.floatValue());
                    return Unit.INSTANCE;
                }
            }

            @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n118#2,4:428\n123#2,4:433\n48#3:432\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n*L\n236#1:428,4\n236#1:433,4\n236#1:432\n*E\n"})
            /* renamed from: kA0$c$a$b */
            /* loaded from: classes.dex */
            public static final class C25125b extends Lambda implements Function0<Unit> {

                /* renamed from: g */
                public final /* synthetic */ C43744kA0 f94043g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C25125b(C43744kA0 c43744kA0) {
                    super(0);
                    this.f94043g = c43744kA0;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    boolean z;
                    D20 d20 = this.f94043g.f94022f;
                    C43744kA0 c43744kA0 = this.f94043g;
                    while (true) {
                        z = true;
                        if (!d20.f5099a.m96687x()) {
                            break;
                        }
                        C35055Os4 invoke = ((C25120a) d20.f5099a.m96686y()).m29208b().invoke();
                        if (!(invoke == null ? true : C43744kA0.m29230M(c43744kA0, invoke, 0L, 1, null))) {
                            break;
                        }
                        ((C25120a) d20.f5099a.m96707C(d20.f5099a.m96690u() - 1)).m29209a().resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                    }
                    if (this.f94043g.f94026j) {
                        C35055Os4 m29233I = this.f94043g.m29233I();
                        if (m29233I == null || !C43744kA0.m29230M(this.f94043g, m29233I, 0L, 1, null)) {
                            z = false;
                        }
                        if (z) {
                            this.f94043g.f94026j = false;
                        }
                    }
                    this.f94043g.f94029m.m106779j(this.f94043g.m29211x());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25123a(C43744kA0 c43744kA0, InterfaceC52943zh2 interfaceC52943zh2, Continuation<? super C25123a> continuation) {
                super(2, continuation);
                this.f94038j = c43744kA0;
                this.f94039k = interfaceC52943zh2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C25123a c25123a = new C25123a(this.f94038j, this.f94039k, continuation);
                c25123a.f94037i = obj;
                return c25123a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: e */
            public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
                return ((C25123a) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f94036h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f94038j.f94029m.m106779j(this.f94038j.m29211x());
                    C32825Fe6 c32825Fe6 = this.f94038j.f94029m;
                    C25124a c25124a = new C25124a(this.f94038j, (InterfaceC36901Wp5) this.f94037i, this.f94039k);
                    C25125b c25125b = new C25125b(this.f94038j);
                    this.f94036h = 1;
                    if (c32825Fe6.m106781h(c25124a, c25125b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C25122c(Continuation<? super C25122c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25122c c25122c = new C25122c(continuation);
            c25122c.f94034i = obj;
            return c25122c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C25122c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f94033h;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC52943zh2 m98498n = C34018Kh2.m98498n(((ZC0) this.f94034i).mo18342K());
                        C43744kA0.this.f94028l = true;
                        InterfaceC38196aq5 interfaceC38196aq5 = C43744kA0.this.f94020d;
                        C25123a c25123a = new C25123a(C43744kA0.this, m98498n, null);
                        this.f94033h = 1;
                        if (InterfaceC38196aq5.m65390d(interfaceC38196aq5, null, c25123a, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    C43744kA0.this.f94022f.m111028d();
                    C43744kA0.this.f94028l = false;
                    C43744kA0.this.f94022f.m111030b(null);
                    C43744kA0.this.f94026j = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                C43744kA0.this.f94028l = false;
                C43744kA0.this.f94022f.m111030b(null);
                C43744kA0.this.f94026j = false;
                throw th;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lnm2;", "it", "", "invoke", "(Lnm2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kA0$d */
    /* loaded from: classes.dex */
    public static final class C25126d extends Lambda implements Function1<InterfaceC45879nm2, Unit> {
        public C25126d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
            invoke2(interfaceC45879nm2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC45879nm2 interfaceC45879nm2) {
            C43744kA0.this.f94024h = interfaceC45879nm2;
        }
    }

    public C43744kA0(ZC0 scope, EnumC32768Ey3 orientation, InterfaceC38196aq5 scrollState, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.f94018b = scope;
        this.f94019c = orientation;
        this.f94020d = scrollState;
        this.f94021e = z;
        this.f94022f = new D20();
        this.f94027k = G52.f10893b.m105825a();
        this.f94029m = new C32825Fe6();
        this.f94030n = J20.m101290b(C38845bw1.m62120b(this, new C25126d()), this);
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m29230M(C43744kA0 c43744kA0, C35055Os4 c35055Os4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c43744kA0.f94027k;
        }
        return c43744kA0.m29231K(c35055Os4, j);
    }

    @Override // p000.InterfaceC41679gh3
    /* renamed from: A */
    public void mo26980A(long j) {
        C35055Os4 m29233I;
        long j2 = this.f94027k;
        this.f94027k = j;
        if (m29210z(j, j2) < 0 && (m29233I = m29233I()) != null) {
            C35055Os4 c35055Os4 = this.f94025i;
            if (c35055Os4 == null) {
                c35055Os4 = m29233I;
            }
            if (!this.f94028l && !this.f94026j && m29231K(c35055Os4, j2) && !m29231K(m29233I, j)) {
                this.f94026j = true;
                m29229N();
            }
            this.f94025i = m29233I;
        }
    }

    /* renamed from: D */
    public final int m29236D(long j, long j2) {
        int i = C25121b.$EnumSwitchMapping$0[this.f94019c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Float.compare(C51465xB5.m5730i(j), C51465xB5.m5730i(j2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return Float.compare(C51465xB5.m5732g(j), C51465xB5.m5732g(j2));
    }

    /* renamed from: E */
    public final C35055Os4 m29235E(C35055Os4 c35055Os4, long j) {
        return c35055Os4.m91248s(C32120Ce3.m111936w(m29227P(c35055Os4, j)));
    }

    /* renamed from: G */
    public final C35055Os4 m29234G() {
        LX2 lx2 = this.f94022f.f5099a;
        int m96690u = lx2.m96690u();
        C35055Os4 c35055Os4 = null;
        if (m96690u > 0) {
            int i = m96690u - 1;
            Object[] m96691s = lx2.m96691s();
            do {
                C35055Os4 invoke = ((C25120a) m96691s[i]).m29208b().invoke();
                if (invoke != null) {
                    if (m29236D(invoke.m91256k(), H52.m104428c(this.f94027k)) <= 0) {
                        c35055Os4 = invoke;
                    } else {
                        return c35055Os4;
                    }
                }
                i--;
            } while (i >= 0);
            return c35055Os4;
        }
        return c35055Os4;
    }

    /* renamed from: I */
    public final C35055Os4 m29233I() {
        InterfaceC45879nm2 interfaceC45879nm2;
        InterfaceC45879nm2 interfaceC45879nm22 = this.f94023g;
        if (interfaceC45879nm22 != null) {
            if (!interfaceC45879nm22.mo23189F()) {
                interfaceC45879nm22 = null;
            }
            if (interfaceC45879nm22 != null && (interfaceC45879nm2 = this.f94024h) != null) {
                if (!interfaceC45879nm2.mo23189F()) {
                    interfaceC45879nm2 = null;
                }
                if (interfaceC45879nm2 != null) {
                    return interfaceC45879nm22.mo23185e(interfaceC45879nm2, false);
                }
            }
        }
        return null;
    }

    /* renamed from: J */
    public final InterfaceC41563gV2 m29232J() {
        return this.f94030n;
    }

    /* renamed from: K */
    public final boolean m29231K(C35055Os4 c35055Os4, long j) {
        return C32120Ce3.m111947l(m29227P(c35055Os4, j), C32120Ce3.f4427b.m111932c());
    }

    /* renamed from: N */
    public final void m29229N() {
        if (!this.f94028l) {
            Z30.m73800d(this.f94018b, null, EnumC38417bD0.UNDISPATCHED, new C25122c(null), 1, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: O */
    public final float m29228O(float f, float f2, float f3) {
        if ((f < 0.0f || f2 > f3) && (f >= 0.0f || f2 <= f3)) {
            float f4 = f2 - f3;
            return Math.abs(f) < Math.abs(f4) ? f : f4;
        }
        return 0.0f;
    }

    /* renamed from: P */
    public final long m29227P(C35055Os4 c35055Os4, long j) {
        long m104428c = H52.m104428c(j);
        int i = C25121b.$EnumSwitchMapping$0[this.f94019c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C33056Ge3.m104938a(m29228O(c35055Os4.m91258i(), c35055Os4.m91257j(), C51465xB5.m5730i(m104428c)), 0.0f);
            }
            throw new NoWhenBranchMatchedException();
        }
        return C33056Ge3.m104938a(0.0f, m29228O(c35055Os4.m91255l(), c35055Os4.m91262e(), C51465xB5.m5732g(m104428c)));
    }

    @Override // p000.I20
    /* renamed from: a */
    public C35055Os4 mo29226a(C35055Os4 localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        if (!G52.m105831e(this.f94027k, G52.f10893b.m105825a())) {
            return m29235E(localRect, this.f94027k);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // p000.I20
    /* renamed from: b */
    public Object mo29225b(Function0<C35055Os4> function0, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        C35055Os4 invoke = function0.invoke();
        boolean z = false;
        if (invoke != null && !m29230M(this, invoke, 0L, 1, null)) {
            z = true;
        }
        if (!z) {
            return Unit.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        if (this.f94022f.m111029c(new C25120a(function0, c37013Xc0)) && !this.f94028l) {
            m29229N();
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC39290ch3
    /* renamed from: t */
    public void mo29214t(InterfaceC45879nm2 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f94023g = coordinates;
    }

    /* renamed from: x */
    public final float m29211x() {
        if (G52.m105831e(this.f94027k, G52.f10893b.m105825a())) {
            return 0.0f;
        }
        C35055Os4 m29234G = m29234G();
        if (m29234G == null) {
            if (this.f94026j) {
                m29234G = m29233I();
            } else {
                m29234G = null;
            }
            if (m29234G == null) {
                return 0.0f;
            }
        }
        long m104428c = H52.m104428c(this.f94027k);
        int i = C25121b.$EnumSwitchMapping$0[this.f94019c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return m29228O(m29234G.m91258i(), m29234G.m91257j(), C51465xB5.m5730i(m104428c));
            }
            throw new NoWhenBranchMatchedException();
        }
        return m29228O(m29234G.m91255l(), m29234G.m91262e(), C51465xB5.m5732g(m104428c));
    }

    /* renamed from: z */
    public final int m29210z(long j, long j2) {
        int i = C25121b.$EnumSwitchMapping$0[this.f94019c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Intrinsics.compare(G52.m105829g(j), G52.m105829g(j2));
            }
            throw new NoWhenBranchMatchedException();
        }
        return Intrinsics.compare(G52.m105830f(j), G52.m105830f(j2));
    }
}
