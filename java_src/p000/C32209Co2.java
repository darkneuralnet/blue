package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38173ao2;
@Metadata(m28433d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 p2\u00020\u0001:\u0001\u0018B\u001e\u0012\t\b\u0002\u0010\u0084\u0001\u001a\u00020\t\u0012\t\b\u0002\u0010\u0085\u0001\u001a\u00020\t¢\u0006\u0005\b\u0089\u0001\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u001a\u00106\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R$\u0010<\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R+\u0010B\u001a\u00020=2\u0006\u00107\u001a\u00020=8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010/\u001a\u0004\b?\u0010@\"\u0004\b9\u0010AR\u0014\u0010E\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\"\u0010Q\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010GR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010UR\u0016\u0010W\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010LR/\u0010]\u001a\u0004\u0018\u00010X2\b\u00107\u001a\u0004\u0018\u00010X8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010/\u001a\u0004\bZ\u0010[\"\u0004\bG\u0010\\R\u001a\u0010b\u001a\u00020^8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bY\u0010fR/\u0010n\u001a\u0004\u0018\u00010h2\b\u00107\u001a\u0004\u0018\u00010h8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010/\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR4\u0010t\u001a\u00020o2\u0006\u00107\u001a\u00020o8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010z\u001a\u00020u8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR+\u0010|\u001a\u00020K2\u0006\u00107\u001a\u00020K8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010/\u001a\u0004\b(\u0010N\"\u0004\b{\u0010PR+\u0010~\u001a\u00020K2\u0006\u00107\u001a\u00020K8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010/\u001a\u0004\b>\u0010N\"\u0004\b}\u0010PR\u001f\u0010\u0083\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0080\u0001\u0010\u0082\u0001R\u0012\u0010\u0084\u0001\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bd\u0010IR\u0012\u0010\u0085\u0001\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bi\u0010IR\u0013\u0010\u0087\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bv\u0010\u0086\u0001R\u0015\u0010\u0088\u0001\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008a\u0001"}, m28432d2 = {"LCo2;", "Laq5;", "", "delta", "", "z", "Lto2;", "info", "l", "", "index", "scrollOffset", "B", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J", "(II)V", "LOX2;", "scrollPriority", "Lkotlin/Function2;", "LWp5;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "distance", "A", "(F)F", "i", "Lvo2;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "k", "(Lvo2;)V", "Lpo2;", "itemProvider", "K", "(Lpo2;)V", "LAo2;", C17296a.f69688o, "LAo2;", "scrollPosition", "Lgo2;", "Lgo2;", "animateScrollScope", "LEX2;", "LEX2;", "layoutInfoState", "LrX2;", DateTokenConverter.CONVERTER_KEY, "LrX2;", "q", "()LrX2;", "internalInteractionSource", "<set-?>", "e", "F", "y", "()F", "scrollToBeConsumed", "Lg01;", "f", "n", "()Lg01;", "(Lg01;)V", "density", "g", "Laq5;", "scrollableState", "h", "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "j", "indexToPrefetch", "Lao2$a;", "Lao2$a;", "currentPrefetchHandle", "wasScrollingForward", "LMv4;", "m", "w", "()LMv4;", "(LMv4;)V", "remeasurement", "LNv4;", "LNv4;", "x", "()LNv4;", "remeasurementModifier", "LUu;", "o", "LUu;", "()LUu;", "awaitLayoutModifier", "Lno2;", "p", "t", "()Lno2;", "G", "(Lno2;)V", "placementAnimator", "Lkz0;", "v", "()J", "H", "(J)V", "premeasureConstraints", "LZn2;", "r", "LZn2;", "s", "()LZn2;", "pinnedItems", "E", "canScrollForward", "D", "canScrollBackward", "Lao2;", "u", "Lao2;", "()Lao2;", "prefetchState", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "()Lto2;", "layoutInfo", "isScrollInProgress", "<init>", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,457:1\n76#2:458\n102#2,2:459\n76#2:461\n102#2,2:462\n76#2:464\n102#2,2:465\n76#2:467\n102#2,2:468\n76#2:470\n102#2,2:471\n76#2:473\n102#2,2:474\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n158#1:458\n158#1:459,2\n199#1:461\n199#1:462,2\n217#1:464\n217#1:465,2\n222#1:467\n222#1:468,2\n277#1:470\n277#1:471,2\n279#1:473\n279#1:474,2\n*E\n"})
/* renamed from: Co2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32209Co2 implements InterfaceC38196aq5 {

    /* renamed from: v */
    public static final C1180c f4685v = new C1180c(null);

    /* renamed from: w */
    public static final InterfaceC35668Ri5<C32209Co2, ?> f4686w = C31777As2.m115002a(C1178a.f4708g, C1179b.f4709g);

    /* renamed from: a */
    public final C31741Ao2 f4687a;

    /* renamed from: b */
    public final C41748go2 f4688b;

    /* renamed from: c */
    public final EX2<InterfaceC49456to2> f4689c;

    /* renamed from: d */
    public final InterfaceC48104rX2 f4690d;

    /* renamed from: e */
    public float f4691e;

    /* renamed from: f */
    public final EX2 f4692f;

    /* renamed from: g */
    public final InterfaceC38196aq5 f4693g;

    /* renamed from: h */
    public int f4694h;

    /* renamed from: i */
    public boolean f4695i;

    /* renamed from: j */
    public int f4696j;

    /* renamed from: k */
    public C38173ao2.InterfaceC12153a f4697k;

    /* renamed from: l */
    public boolean f4698l;

    /* renamed from: m */
    public final EX2 f4699m;

    /* renamed from: n */
    public final InterfaceC34848Nv4 f4700n;

    /* renamed from: o */
    public final C8494Uu f4701o;

    /* renamed from: p */
    public final EX2 f4702p;

    /* renamed from: q */
    public final EX2 f4703q;

    /* renamed from: r */
    public final C37582Zn2 f4704r;

    /* renamed from: s */
    public final EX2 f4705s;

    /* renamed from: t */
    public final EX2 f4706t;

    /* renamed from: u */
    public final C38173ao2 f4707u;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTi5;", "LCo2;", "it", "", "", C17296a.f69688o, "(LTi5;LCo2;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Co2$a */
    /* loaded from: classes.dex */
    public static final class C1178a extends Lambda implements Function2<InterfaceC36136Ti5, C32209Co2, List<? extends Integer>> {

        /* renamed from: g */
        public static final C1178a f4708g = new C1178a();

        public C1178a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<Integer> invoke(InterfaceC36136Ti5 listSaver, C32209Co2 it) {
            List<Integer> listOf;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.m111538o()), Integer.valueOf(it.m111537p())});
            return listOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "it", "LCo2;", C17296a.f69688o, "(Ljava/util/List;)LCo2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Co2$b */
    /* loaded from: classes.dex */
    public static final class C1179b extends Lambda implements Function1<List<? extends Integer>, C32209Co2> {

        /* renamed from: g */
        public static final C1179b f4709g = new C1179b();

        public C1179b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C32209Co2 invoke(List<Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C32209Co2(it.get(0).intValue(), it.get(1).intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LCo2$c;", "", "LRi5;", "LCo2;", "Saver", "LRi5;", C17296a.f69688o, "()LRi5;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Co2$c */
    /* loaded from: classes.dex */
    public static final class C1180c {
        public /* synthetic */ C1180c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC35668Ri5<C32209Co2, ?> m111524a() {
            return C32209Co2.f4686w;
        }

        private C1180c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Co2$d", "LNv4;", "LMv4;", "remeasurement", "", "S", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Co2$d */
    /* loaded from: classes.dex */
    public static final class C1181d implements InterfaceC34848Nv4 {
        public C1181d() {
        }

        @Override // p000.InterfaceC34848Nv4
        /* renamed from: S */
        public void mo93192S(InterfaceC34614Mv4 remeasurement) {
            Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
            C32209Co2.this.m111549I(remeasurement);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.LazyListState", m28418f = "LazyListState.kt", m28417i = {0, 0, 0}, m28416l = {267, 268}, m28415m = "scroll", m28414n = {"this", "scrollPriority", "block"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: Co2$e */
    /* loaded from: classes.dex */
    public static final class C1182e extends ContinuationImpl {

        /* renamed from: h */
        public Object f4711h;

        /* renamed from: i */
        public Object f4712i;

        /* renamed from: j */
        public Object f4713j;

        /* renamed from: k */
        public /* synthetic */ Object f4714k;

        /* renamed from: m */
        public int f4716m;

        public C1182e(Continuation<? super C1182e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4714k = obj;
            this.f4716m |= Integer.MIN_VALUE;
            return C32209Co2.this.mo11047c(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", m28418f = "LazyListState.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Co2$f */
    /* loaded from: classes.dex */
    public static final class C1183f extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f4717h;

        /* renamed from: j */
        public final /* synthetic */ int f4719j;

        /* renamed from: k */
        public final /* synthetic */ int f4720k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1183f(int i, int i2, Continuation<? super C1183f> continuation) {
            super(2, continuation);
            this.f4719j = i;
            this.f4720k = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1183f(this.f4719j, this.f4720k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
            return ((C1183f) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f4717h == 0) {
                ResultKt.throwOnFailure(obj);
                C32209Co2.this.m111548J(this.f4719j, this.f4720k);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Co2$g */
    /* loaded from: classes.dex */
    public static final class C1184g extends Lambda implements Function1<Float, Float> {
        public C1184g() {
            super(1);
        }

        public final Float invoke(float f) {
            return Float.valueOf(-C32209Co2.this.m111557A(-f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    public C32209Co2() {
        this(0, 0, 3, null);
    }

    /* renamed from: C */
    public static /* synthetic */ Object m111555C(C32209Co2 c32209Co2, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return c32209Co2.m111556B(i, i2, continuation);
    }

    /* renamed from: j */
    public static /* synthetic */ Object m111543j(C32209Co2 c32209Co2, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return c32209Co2.m111544i(i, i2, continuation);
    }

    /* renamed from: A */
    public final float m111557A(float f) {
        boolean z;
        if ((f < 0.0f && !mo11049a()) || (f > 0.0f && !mo11045f())) {
            return 0.0f;
        }
        if (Math.abs(this.f4691e) <= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.f4691e + f;
            this.f4691e = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f4691e;
                InterfaceC34614Mv4 m111530w = m111530w();
                if (m111530w != null) {
                    m111530w.mo94567g();
                }
                if (this.f4695i) {
                    m111527z(f3 - this.f4691e);
                }
            }
            if (Math.abs(this.f4691e) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f4691e;
            this.f4691e = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f4691e).toString());
    }

    /* renamed from: B */
    public final Object m111556B(int i, int i2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m65390d = InterfaceC38196aq5.m65390d(this, null, new C1183f(i, i2, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m65390d == coroutine_suspended ? m65390d : Unit.INSTANCE;
    }

    /* renamed from: D */
    public final void m111554D(boolean z) {
        this.f4706t.setValue(Boolean.valueOf(z));
    }

    /* renamed from: E */
    public final void m111553E(boolean z) {
        this.f4705s.setValue(Boolean.valueOf(z));
    }

    /* renamed from: F */
    public final void m111552F(InterfaceC41273g01 interfaceC41273g01) {
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<set-?>");
        this.f4692f.setValue(interfaceC41273g01);
    }

    /* renamed from: G */
    public final void m111551G(C45899no2 c45899no2) {
        this.f4702p.setValue(c45899no2);
    }

    /* renamed from: H */
    public final void m111550H(long j) {
        this.f4703q.setValue(C44228kz0.m28075b(j));
    }

    /* renamed from: I */
    public final void m111549I(InterfaceC34614Mv4 interfaceC34614Mv4) {
        this.f4699m.setValue(interfaceC34614Mv4);
    }

    /* renamed from: J */
    public final void m111548J(int i, int i2) {
        this.f4687a.m115209c(KS0.m98880b(i), i2);
        C45899no2 m111533t = m111533t();
        if (m111533t != null) {
            m111533t.m22349h();
        }
        InterfaceC34614Mv4 m111530w = m111530w();
        if (m111530w != null) {
            m111530w.mo94567g();
        }
    }

    /* renamed from: K */
    public final void m111547K(InterfaceC47085po2 itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f4687a.m115204h(itemProvider);
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: a */
    public boolean mo11049a() {
        return ((Boolean) this.f4705s.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: b */
    public float mo11048b(float f) {
        return this.f4693g.mo11048b(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    @Override // p000.InterfaceC38196aq5
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11047c(OX2 ox2, Function2<? super InterfaceC36901Wp5, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        C1182e c1182e;
        Object coroutine_suspended;
        int i;
        C32209Co2 c32209Co2;
        InterfaceC38196aq5 interfaceC38196aq5;
        if (continuation instanceof C1182e) {
            c1182e = (C1182e) continuation;
            int i2 = c1182e.f4716m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1182e.f4716m = i2 - Integer.MIN_VALUE;
                Object obj = c1182e.f4714k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1182e.f4716m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function2) c1182e.f4713j;
                    ox2 = (OX2) c1182e.f4712i;
                    c32209Co2 = (C32209Co2) c1182e.f4711h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    C8494Uu c8494Uu = this.f4701o;
                    c1182e.f4711h = this;
                    c1182e.f4712i = ox2;
                    c1182e.f4713j = function2;
                    c1182e.f4716m = 1;
                    if (c8494Uu.m80654a(c1182e) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c32209Co2 = this;
                }
                interfaceC38196aq5 = c32209Co2.f4693g;
                c1182e.f4711h = null;
                c1182e.f4712i = null;
                c1182e.f4713j = null;
                c1182e.f4716m = 2;
                if (interfaceC38196aq5.mo11047c(ox2, function2, c1182e) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        c1182e = new C1182e(continuation);
        Object obj2 = c1182e.f4714k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1182e.f4716m;
        if (i == 0) {
        }
        interfaceC38196aq5 = c32209Co2.f4693g;
        c1182e.f4711h = null;
        c1182e.f4712i = null;
        c1182e.f4713j = null;
        c1182e.f4716m = 2;
        if (interfaceC38196aq5.mo11047c(ox2, function2, c1182e) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: e */
    public boolean mo11046e() {
        return this.f4693g.mo11046e();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: f */
    public boolean mo11045f() {
        return ((Boolean) this.f4706t.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final Object m111544i(int i, int i2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m63984d = C38756bn2.m63984d(this.f4688b, i, i2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m63984d == coroutine_suspended ? m63984d : Unit.INSTANCE;
    }

    /* renamed from: k */
    public final void m111542k(C50641vo2 result) {
        int i;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f4687a.m115205g(result);
        this.f4691e -= result.m8013f();
        this.f4689c.setValue(result);
        m111553E(result.m8014e());
        C32677Eo2 m8012g = result.m8012g();
        boolean z = false;
        if (m8012g != null) {
            i = m8012g.m108352b();
        } else {
            i = 0;
        }
        if (i != 0 || result.m8011h() != 0) {
            z = true;
        }
        m111554D(z);
        this.f4694h++;
        m111541l(result);
    }

    /* renamed from: l */
    public final void m111541l(InterfaceC49456to2 interfaceC49456to2) {
        Object first;
        int index;
        Object last;
        if (this.f4696j != -1 && (!interfaceC49456to2.mo8015b().isEmpty())) {
            if (this.f4698l) {
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) interfaceC49456to2.mo8015b());
                index = ((InterfaceC45306mo2) last).getIndex() + 1;
            } else {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) interfaceC49456to2.mo8015b());
                index = ((InterfaceC45306mo2) first).getIndex() - 1;
            }
            if (this.f4696j != index) {
                this.f4696j = -1;
                C38173ao2.InterfaceC12153a interfaceC12153a = this.f4697k;
                if (interfaceC12153a != null) {
                    interfaceC12153a.cancel();
                }
                this.f4697k = null;
            }
        }
    }

    /* renamed from: m */
    public final C8494Uu m111540m() {
        return this.f4701o;
    }

    /* renamed from: n */
    public final InterfaceC41273g01 m111539n() {
        return (InterfaceC41273g01) this.f4692f.getValue();
    }

    /* renamed from: o */
    public final int m111538o() {
        return this.f4687a.m115211a();
    }

    /* renamed from: p */
    public final int m111537p() {
        return this.f4687a.m115210b();
    }

    /* renamed from: q */
    public final InterfaceC48104rX2 m111536q() {
        return this.f4690d;
    }

    /* renamed from: r */
    public final InterfaceC49456to2 m111535r() {
        return this.f4689c.getValue();
    }

    /* renamed from: s */
    public final C37582Zn2 m111534s() {
        return this.f4704r;
    }

    /* renamed from: t */
    public final C45899no2 m111533t() {
        return (C45899no2) this.f4702p.getValue();
    }

    /* renamed from: u */
    public final C38173ao2 m111532u() {
        return this.f4707u;
    }

    /* renamed from: v */
    public final long m111531v() {
        return ((C44228kz0) this.f4703q.getValue()).m28058s();
    }

    /* renamed from: w */
    public final InterfaceC34614Mv4 m111530w() {
        return (InterfaceC34614Mv4) this.f4699m.getValue();
    }

    /* renamed from: x */
    public final InterfaceC34848Nv4 m111529x() {
        return this.f4700n;
    }

    /* renamed from: y */
    public final float m111528y() {
        return this.f4691e;
    }

    /* renamed from: z */
    public final void m111527z(float f) {
        boolean z;
        Object first;
        int index;
        C38173ao2.InterfaceC12153a interfaceC12153a;
        Object last;
        if (!this.f4695i) {
            return;
        }
        InterfaceC49456to2 m111535r = m111535r();
        boolean z2 = true;
        if (!m111535r.mo8015b().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) m111535r.mo8015b());
                index = ((InterfaceC45306mo2) last).getIndex() + 1;
            } else {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m111535r.mo8015b());
                index = ((InterfaceC45306mo2) first).getIndex() - 1;
            }
            if (index != this.f4696j) {
                if (index < 0 || index >= m111535r.mo8016a()) {
                    z2 = false;
                }
                if (z2) {
                    if (this.f4698l != z && (interfaceC12153a = this.f4697k) != null) {
                        interfaceC12153a.cancel();
                    }
                    this.f4698l = z;
                    this.f4696j = index;
                    this.f4697k = this.f4707u.m65457b(index, m111531v());
                }
            }
        }
    }

    public C32209Co2(int i, int i2) {
        EX2<InterfaceC49456to2> m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        EX2 m97025e4;
        EX2 m97025e5;
        EX2 m97025e6;
        EX2 m97025e7;
        this.f4687a = new C31741Ao2(i, i2);
        this.f4688b = new C41748go2(this);
        m97025e = LM5.m97025e(C36060Ta1.f35697a, null, 2, null);
        this.f4689c = m97025e;
        this.f4690d = C40741f62.m42091a();
        m97025e2 = LM5.m97025e(C42459i01.m35405a(1.0f, 1.0f), null, 2, null);
        this.f4692f = m97025e2;
        this.f4693g = C38789bq5.m62556a(new C1184g());
        this.f4695i = true;
        this.f4696j = -1;
        m97025e3 = LM5.m97025e(null, null, 2, null);
        this.f4699m = m97025e3;
        this.f4700n = new C1181d();
        this.f4701o = new C8494Uu();
        m97025e4 = LM5.m97025e(null, null, 2, null);
        this.f4702p = m97025e4;
        m97025e5 = LM5.m97025e(C44228kz0.m28075b(C46007nz0.m22042b(0, 0, 0, 0, 15, null)), null, 2, null);
        this.f4703q = m97025e5;
        this.f4704r = new C37582Zn2();
        Boolean bool = Boolean.FALSE;
        m97025e6 = LM5.m97025e(bool, null, 2, null);
        this.f4705s = m97025e6;
        m97025e7 = LM5.m97025e(bool, null, 2, null);
        this.f4706t = m97025e7;
        this.f4707u = new C38173ao2();
    }

    public /* synthetic */ C32209Co2(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
