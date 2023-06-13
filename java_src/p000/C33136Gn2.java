package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(m28433d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 92\u00020\u0001:\u0001\u0018B\u001e\u0012\t\b\u0002\u0010\u0091\u0001\u001a\u00020\t\u0012\t\b\u0002\u0010\u0092\u0001\u001a\u00020\t¢\u0006\u0005\b\u0096\u0001\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJD\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012¢\u0006\u0002\b\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u00100R$\u00107\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R+\u0010=\u001a\u00020\t2\u0006\u00102\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010C\u001a\u00020>2\u0006\u00102\u001a\u00020>8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010+\u001a\u0004\b@\u0010A\"\u0004\b4\u0010BR+\u0010J\u001a\u00020D2\u0006\u00102\u001a\u00020D8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010+\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR$\u0010P\u001a\u00020\t2\u0006\u00102\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b \u0010N\u001a\u0004\bO\u0010:R\"\u0010T\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010Q\u001a\u0004\bR\u0010G\"\u0004\bS\u0010IR\u0016\u0010V\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010NR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010YR\u0016\u0010\\\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR/\u0010b\u001a\u0004\u0018\u00010]2\b\u00102\u001a\u0004\u0018\u00010]8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010+\u001a\u0004\b_\u0010`\"\u0004\bN\u0010aR\u001a\u0010g\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010d\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bU\u0010kR\u0088\u0001\u0010z\u001a/\u0012\u0013\u0012\u00110n¢\u0006\f\bo\u0012\b\bp\u0012\u0004\b\b(q\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020t0s0r0m23\u00102\u001a/\u0012\u0013\u0012\u00110n¢\u0006\f\bo\u0012\b\bp\u0012\u0004\b\b(q\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020t0s0r0m8@@@X\u0080\u008e\u0002ø\u0001\u0000¢\u0006\u0012\n\u0004\bu\u0010+\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR0\u0010\u0080\u0001\u001a\u0004\u0018\u00010{2\b\u00102\u001a\u0004\u0018\u00010{8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b|\u0010+\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010\u0082\u0001R\u001f\u0010\u0088\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\bu\u0010\u0087\u0001R-\u0010\u008a\u0001\u001a\u00020D2\u0006\u00102\u001a\u00020D8V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b_\u0010+\u001a\u0004\b'\u0010G\"\u0005\b\u0089\u0001\u0010IR-\u0010\u008c\u0001\u001a\u00020D2\u0006\u00102\u001a\u00020D8V@RX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\be\u0010+\u001a\u0004\b?\u0010G\"\u0005\b\u008b\u0001\u0010IR\u001f\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b5\u0010\u008e\u0001\u001a\u0006\b\u0085\u0001\u0010\u008f\u0001R\u0012\u0010\u0091\u0001\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b[\u0010:R\u0012\u0010\u0092\u0001\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b^\u0010:R\u0013\u0010\u0094\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\bi\u0010\u0093\u0001R\u0015\u0010\u0095\u0001\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0097\u0001"}, m28432d2 = {"LGn2;", "Laq5;", "", "delta", "", "z", "Lvn2;", "info", "j", "", "index", "scrollOffset", "B", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "L", "(II)V", "LOX2;", "scrollPriority", "Lkotlin/Function2;", "LWp5;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "c", "(LOX2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "distance", "A", "(F)F", "Lxn2;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "i", "(Lxn2;)V", "Lon2;", "itemProvider", "M", "(Lon2;)V", "LDn2;", C17296a.f69688o, "LDn2;", "scrollPosition", "LEX2;", "LEX2;", "layoutInfoState", "LrX2;", "LrX2;", "o", "()LrX2;", "internalInteractionSource", "<set-?>", DateTokenConverter.CONVERTER_KEY, "F", "w", "()F", "scrollToBeConsumed", "e", "x", "()I", "J", "(I)V", "slotsPerLine", "Lg01;", "f", "l", "()Lg01;", "(Lg01;)V", "density", "", "g", "y", "()Z", "K", "(Z)V", "isVertical", "h", "Laq5;", "scrollableState", "I", "getNumMeasurePasses$foundation_release", "numMeasurePasses", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "k", "lineToPrefetch", "LLX2;", "Lao2$a;", "LLX2;", "currentLinePrefetchHandles", "m", "wasScrollingForward", "LMv4;", "n", "u", "()LMv4;", "(LMv4;)V", "remeasurement", "LNv4;", "LNv4;", "v", "()LNv4;", "remeasurementModifier", "LUu;", "p", "LUu;", "()LUu;", "awaitLayoutModifier", "Lkotlin/Function1;", "Lrr2;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Lkz0;", "q", "s", "()Lkotlin/jvm/functions/Function1;", "H", "(Lkotlin/jvm/functions/Function1;)V", "prefetchInfoRetriever", "Lmn2;", "r", "()Lmn2;", "G", "(Lmn2;)V", "placementAnimator", "Lin2;", "Lin2;", "animateScrollScope", "LZn2;", "t", "LZn2;", "()LZn2;", "pinnedItems", "E", "canScrollForward", "D", "canScrollBackward", "Lao2;", "Lao2;", "()Lao2;", "prefetchState", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "()Lvn2;", "layoutInfo", "isScrollInProgress", "<init>", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,460:1\n1182#2:461\n1161#2,2:462\n76#3:464\n102#3,2:465\n76#3:467\n102#3,2:468\n76#3:470\n102#3,2:471\n76#3:473\n102#3,2:474\n76#3:476\n102#3,2:477\n76#3:479\n102#3,2:480\n76#3:482\n102#3,2:483\n76#3:485\n102#3,2:486\n460#4,11:488\n460#4,11:505\n33#5,6:499\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n191#1:461\n191#1:462,2\n151#1:464\n151#1:465,2\n156#1:467\n156#1:468,2\n161#1:470\n161#1:471,2\n203#1:473\n203#1:474,2\n224#1:476\n224#1:477,2\n226#1:479\n226#1:480,2\n283#1:482\n283#1:483,2\n285#1:485\n285#1:486,2\n354#1:488,11\n381#1:505,11\n359#1:499,6\n*E\n"})
/* renamed from: Gn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33136Gn2 implements InterfaceC38196aq5 {

    /* renamed from: x */
    public static final C2944c f12417x = new C2944c(null);

    /* renamed from: y */
    public static final InterfaceC35668Ri5<C33136Gn2, ?> f12418y = C31777As2.m115002a(C2942a.f12442g, C2943b.f12443g);

    /* renamed from: a */
    public final C32434Dn2 f12419a;

    /* renamed from: b */
    public final EX2<InterfaceC50631vn2> f12420b;

    /* renamed from: c */
    public final InterfaceC48104rX2 f12421c;

    /* renamed from: d */
    public float f12422d;

    /* renamed from: e */
    public final EX2 f12423e;

    /* renamed from: f */
    public final EX2 f12424f;

    /* renamed from: g */
    public final EX2 f12425g;

    /* renamed from: h */
    public final InterfaceC38196aq5 f12426h;

    /* renamed from: i */
    public int f12427i;

    /* renamed from: j */
    public boolean f12428j;

    /* renamed from: k */
    public int f12429k;

    /* renamed from: l */
    public final LX2<C38173ao2.InterfaceC12153a> f12430l;

    /* renamed from: m */
    public boolean f12431m;

    /* renamed from: n */
    public final EX2 f12432n;

    /* renamed from: o */
    public final InterfaceC34848Nv4 f12433o;

    /* renamed from: p */
    public final C8494Uu f12434p;

    /* renamed from: q */
    public final EX2 f12435q;

    /* renamed from: r */
    public final EX2 f12436r;

    /* renamed from: s */
    public final C42924in2 f12437s;

    /* renamed from: t */
    public final C37582Zn2 f12438t;

    /* renamed from: u */
    public final EX2 f12439u;

    /* renamed from: v */
    public final EX2 f12440v;

    /* renamed from: w */
    public final C38173ao2 f12441w;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LTi5;", "LGn2;", "it", "", "", C17296a.f69688o, "(LTi5;LGn2;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gn2$a */
    /* loaded from: classes.dex */
    public static final class C2942a extends Lambda implements Function2<InterfaceC36136Ti5, C33136Gn2, List<? extends Integer>> {

        /* renamed from: g */
        public static final C2942a f12442g = new C2942a();

        public C2942a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<Integer> invoke(InterfaceC36136Ti5 listSaver, C33136Gn2 it) {
            List<Integer> listOf;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(it.m104738m()), Integer.valueOf(it.m104737n())});
            return listOf;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "", "it", "LGn2;", C17296a.f69688o, "(Ljava/util/List;)LGn2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gn2$b */
    /* loaded from: classes.dex */
    public static final class C2943b extends Lambda implements Function1<List<? extends Integer>, C33136Gn2> {

        /* renamed from: g */
        public static final C2943b f12443g = new C2943b();

        public C2943b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C33136Gn2 invoke(List<Integer> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C33136Gn2(it.get(0).intValue(), it.get(1).intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LGn2$c;", "", "LRi5;", "LGn2;", "Saver", "LRi5;", C17296a.f69688o, "()LRi5;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Gn2$c */
    /* loaded from: classes.dex */
    public static final class C2944c {
        public /* synthetic */ C2944c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC35668Ri5<C33136Gn2, ?> m104722a() {
            return C33136Gn2.f12418y;
        }

        private C2944c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lrr2;", "it", "", "Lkotlin/Pair;", "", "Lkz0;", "b", "(I)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gn2$d */
    /* loaded from: classes.dex */
    public static final class C2945d extends Lambda implements Function1<C48301rr2, List<? extends Pair<? extends Integer, ? extends C44228kz0>>> {

        /* renamed from: g */
        public static final C2945d f12444g = new C2945d();

        public C2945d() {
            super(1);
        }

        /* renamed from: b */
        public final List<Pair<Integer, C44228kz0>> m104721b(int i) {
            List<Pair<Integer, C44228kz0>> emptyList;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends Pair<? extends Integer, ? extends C44228kz0>> invoke(C48301rr2 c48301rr2) {
            return m104721b(c48301rr2.m15176g());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"Gn2$e", "LNv4;", "LMv4;", "remeasurement", "", "S", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Gn2$e */
    /* loaded from: classes.dex */
    public static final class C2946e implements InterfaceC34848Nv4 {
        public C2946e() {
        }

        @Override // p000.InterfaceC34848Nv4
        /* renamed from: S */
        public void mo93192S(InterfaceC34614Mv4 remeasurement) {
            Intrinsics.checkNotNullParameter(remeasurement, "remeasurement");
            C33136Gn2.this.m104749I(remeasurement);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.grid.LazyGridState", m28418f = "LazyGridState.kt", m28417i = {0, 0, 0}, m28416l = {273, 274}, m28415m = "scroll", m28414n = {"this", "scrollPriority", "block"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: Gn2$f */
    /* loaded from: classes.dex */
    public static final class C2947f extends ContinuationImpl {

        /* renamed from: h */
        public Object f12446h;

        /* renamed from: i */
        public Object f12447i;

        /* renamed from: j */
        public Object f12448j;

        /* renamed from: k */
        public /* synthetic */ Object f12449k;

        /* renamed from: m */
        public int f12451m;

        public C2947f(Continuation<? super C2947f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12449k = obj;
            this.f12451m |= Integer.MIN_VALUE;
            return C33136Gn2.this.mo11047c(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWp5;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", m28418f = "LazyGridState.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Gn2$g */
    /* loaded from: classes.dex */
    public static final class C2948g extends SuspendLambda implements Function2<InterfaceC36901Wp5, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f12452h;

        /* renamed from: j */
        public final /* synthetic */ int f12454j;

        /* renamed from: k */
        public final /* synthetic */ int f12455k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2948g(int i, int i2, Continuation<? super C2948g> continuation) {
            super(2, continuation);
            this.f12454j = i;
            this.f12455k = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2948g(this.f12454j, this.f12455k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC36901Wp5 interfaceC36901Wp5, Continuation<? super Unit> continuation) {
            return ((C2948g) create(interfaceC36901Wp5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12452h == 0) {
                ResultKt.throwOnFailure(obj);
                C33136Gn2.this.m104746L(this.f12454j, this.f12455k);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gn2$h */
    /* loaded from: classes.dex */
    public static final class C2949h extends Lambda implements Function1<Float, Float> {
        public C2949h() {
            super(1);
        }

        public final Float invoke(float f) {
            return Float.valueOf(-C33136Gn2.this.m104757A(-f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f) {
            return invoke(f.floatValue());
        }
    }

    public C33136Gn2() {
        this(0, 0, 3, null);
    }

    /* renamed from: C */
    public static /* synthetic */ Object m104755C(C33136Gn2 c33136Gn2, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return c33136Gn2.m104756B(i, i2, continuation);
    }

    /* renamed from: A */
    public final float m104757A(float f) {
        boolean z;
        if ((f < 0.0f && !mo11049a()) || (f > 0.0f && !mo11045f())) {
            return 0.0f;
        }
        if (Math.abs(this.f12422d) <= 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f2 = this.f12422d + f;
            this.f12422d = f2;
            if (Math.abs(f2) > 0.5f) {
                float f3 = this.f12422d;
                InterfaceC34614Mv4 m104730u = m104730u();
                if (m104730u != null) {
                    m104730u.mo94567g();
                }
                if (this.f12428j) {
                    m104725z(f3 - this.f12422d);
                }
            }
            if (Math.abs(this.f12422d) <= 0.5f) {
                return f;
            }
            float f4 = f - this.f12422d;
            this.f12422d = 0.0f;
            return f4;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f12422d).toString());
    }

    /* renamed from: B */
    public final Object m104756B(int i, int i2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m65390d = InterfaceC38196aq5.m65390d(this, null, new C2948g(i, i2, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m65390d == coroutine_suspended ? m65390d : Unit.INSTANCE;
    }

    /* renamed from: D */
    public final void m104754D(boolean z) {
        this.f12440v.setValue(Boolean.valueOf(z));
    }

    /* renamed from: E */
    public final void m104753E(boolean z) {
        this.f12439u.setValue(Boolean.valueOf(z));
    }

    /* renamed from: F */
    public final void m104752F(InterfaceC41273g01 interfaceC41273g01) {
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<set-?>");
        this.f12424f.setValue(interfaceC41273g01);
    }

    /* renamed from: G */
    public final void m104751G(C45296mn2 c45296mn2) {
        this.f12436r.setValue(c45296mn2);
    }

    /* renamed from: H */
    public final void m104750H(Function1<? super C48301rr2, ? extends List<Pair<Integer, C44228kz0>>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f12435q.setValue(function1);
    }

    /* renamed from: I */
    public final void m104749I(InterfaceC34614Mv4 interfaceC34614Mv4) {
        this.f12432n.setValue(interfaceC34614Mv4);
    }

    /* renamed from: J */
    public final void m104748J(int i) {
        this.f12423e.setValue(Integer.valueOf(i));
    }

    /* renamed from: K */
    public final void m104747K(boolean z) {
        this.f12425g.setValue(Boolean.valueOf(z));
    }

    /* renamed from: L */
    public final void m104746L(int i, int i2) {
        this.f12419a.m109946c(C49929uc2.m9974b(i), i2);
        C45296mn2 m104733r = m104733r();
        if (m104733r != null) {
            m104733r.m24998i();
        }
        InterfaceC34614Mv4 m104730u = m104730u();
        if (m104730u != null) {
            m104730u.mo94567g();
        }
    }

    /* renamed from: M */
    public final void m104745M(InterfaceC46482on2 itemProvider) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f12419a.m109941h(itemProvider);
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: a */
    public boolean mo11049a() {
        return ((Boolean) this.f12439u.getValue()).booleanValue();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: b */
    public float mo11048b(float f) {
        return this.f12426h.mo11048b(f);
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
        C2947f c2947f;
        Object coroutine_suspended;
        int i;
        C33136Gn2 c33136Gn2;
        InterfaceC38196aq5 interfaceC38196aq5;
        if (continuation instanceof C2947f) {
            c2947f = (C2947f) continuation;
            int i2 = c2947f.f12451m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2947f.f12451m = i2 - Integer.MIN_VALUE;
                Object obj = c2947f.f12449k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2947f.f12451m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function2) c2947f.f12448j;
                    ox2 = (OX2) c2947f.f12447i;
                    c33136Gn2 = (C33136Gn2) c2947f.f12446h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    C8494Uu c8494Uu = this.f12434p;
                    c2947f.f12446h = this;
                    c2947f.f12447i = ox2;
                    c2947f.f12448j = function2;
                    c2947f.f12451m = 1;
                    if (c8494Uu.m80654a(c2947f) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c33136Gn2 = this;
                }
                interfaceC38196aq5 = c33136Gn2.f12426h;
                c2947f.f12446h = null;
                c2947f.f12447i = null;
                c2947f.f12448j = null;
                c2947f.f12451m = 2;
                if (interfaceC38196aq5.mo11047c(ox2, function2, c2947f) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        c2947f = new C2947f(continuation);
        Object obj2 = c2947f.f12449k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2947f.f12451m;
        if (i == 0) {
        }
        interfaceC38196aq5 = c33136Gn2.f12426h;
        c2947f.f12446h = null;
        c2947f.f12447i = null;
        c2947f.f12448j = null;
        c2947f.f12451m = 2;
        if (interfaceC38196aq5.mo11047c(ox2, function2, c2947f) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: e */
    public boolean mo11046e() {
        return this.f12426h.mo11046e();
    }

    @Override // p000.InterfaceC38196aq5
    /* renamed from: f */
    public boolean mo11045f() {
        return ((Boolean) this.f12440v.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final void m104742i(C51817xn2 result) {
        int i;
        Intrinsics.checkNotNullParameter(result, "result");
        this.f12419a.m109942g(result);
        this.f12422d -= result.m4704f();
        this.f12420b.setValue(result);
        m104753E(result.m4705e());
        C53003zn2 m4703g = result.m4703g();
        boolean z = false;
        if (m4703g != null) {
            i = m4703g.m444a();
        } else {
            i = 0;
        }
        if (i != 0 || result.m4702h() != 0) {
            z = true;
        }
        m104754D(z);
        this.f12427i++;
        m104741j(result);
    }

    /* renamed from: j */
    public final void m104741j(InterfaceC50631vn2 interfaceC50631vn2) {
        Object first;
        int mo26834b;
        int i;
        Object last;
        int mo26834b2;
        if (this.f12429k != -1 && (!interfaceC50631vn2.mo4706b().isEmpty())) {
            if (this.f12431m) {
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) interfaceC50631vn2.mo4706b());
                InterfaceC44703ln2 interfaceC44703ln2 = (InterfaceC44703ln2) last;
                if (m104726y()) {
                    mo26834b2 = interfaceC44703ln2.mo26832d();
                } else {
                    mo26834b2 = interfaceC44703ln2.mo26834b();
                }
                i = mo26834b2 + 1;
            } else {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) interfaceC50631vn2.mo4706b());
                InterfaceC44703ln2 interfaceC44703ln22 = (InterfaceC44703ln2) first;
                if (m104726y()) {
                    mo26834b = interfaceC44703ln22.mo26832d();
                } else {
                    mo26834b = interfaceC44703ln22.mo26834b();
                }
                i = mo26834b - 1;
            }
            if (this.f12429k != i) {
                this.f12429k = -1;
                LX2<C38173ao2.InterfaceC12153a> lx2 = this.f12430l;
                int m96690u = lx2.m96690u();
                if (m96690u > 0) {
                    C38173ao2.InterfaceC12153a[] m96691s = lx2.m96691s();
                    int i2 = 0;
                    do {
                        m96691s[i2].cancel();
                        i2++;
                    } while (i2 < m96690u);
                    this.f12430l.m96696h();
                }
                this.f12430l.m96696h();
            }
        }
    }

    /* renamed from: k */
    public final C8494Uu m104740k() {
        return this.f12434p;
    }

    /* renamed from: l */
    public final InterfaceC41273g01 m104739l() {
        return (InterfaceC41273g01) this.f12424f.getValue();
    }

    /* renamed from: m */
    public final int m104738m() {
        return this.f12419a.m109948a();
    }

    /* renamed from: n */
    public final int m104737n() {
        return this.f12419a.m109947b();
    }

    /* renamed from: o */
    public final InterfaceC48104rX2 m104736o() {
        return this.f12421c;
    }

    /* renamed from: p */
    public final InterfaceC50631vn2 m104735p() {
        return this.f12420b.getValue();
    }

    /* renamed from: q */
    public final C37582Zn2 m104734q() {
        return this.f12438t;
    }

    /* renamed from: r */
    public final C45296mn2 m104733r() {
        return (C45296mn2) this.f12436r.getValue();
    }

    /* renamed from: s */
    public final Function1<C48301rr2, List<Pair<Integer, C44228kz0>>> m104732s() {
        return (Function1) this.f12435q.getValue();
    }

    /* renamed from: t */
    public final C38173ao2 m104731t() {
        return this.f12441w;
    }

    /* renamed from: u */
    public final InterfaceC34614Mv4 m104730u() {
        return (InterfaceC34614Mv4) this.f12432n.getValue();
    }

    /* renamed from: v */
    public final InterfaceC34848Nv4 m104729v() {
        return this.f12433o;
    }

    /* renamed from: w */
    public final float m104728w() {
        return this.f12422d;
    }

    /* renamed from: x */
    public final int m104727x() {
        return ((Number) this.f12423e.getValue()).intValue();
    }

    /* renamed from: y */
    public final boolean m104726y() {
        return ((Boolean) this.f12425g.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[LOOP:1: B:38:0x00c3->B:39:0x00c5, LOOP_END] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m104725z(float f) {
        boolean z;
        Object first;
        int mo26834b;
        int i;
        Object first2;
        int index;
        boolean z2;
        int size;
        LX2<C38173ao2.InterfaceC12153a> lx2;
        int m96690u;
        Object last;
        int mo26834b2;
        Object last2;
        C38173ao2 c38173ao2 = this.f12441w;
        if (!this.f12428j) {
            return;
        }
        InterfaceC50631vn2 m104735p = m104735p();
        if (!m104735p.mo4706b().isEmpty()) {
            if (f < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                last = CollectionsKt___CollectionsKt.last((List<? extends Object>) m104735p.mo4706b());
                InterfaceC44703ln2 interfaceC44703ln2 = (InterfaceC44703ln2) last;
                if (m104726y()) {
                    mo26834b2 = interfaceC44703ln2.mo26832d();
                } else {
                    mo26834b2 = interfaceC44703ln2.mo26834b();
                }
                i = mo26834b2 + 1;
                last2 = CollectionsKt___CollectionsKt.last((List<? extends Object>) m104735p.mo4706b());
                index = ((InterfaceC44703ln2) last2).getIndex() + 1;
            } else {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m104735p.mo4706b());
                InterfaceC44703ln2 interfaceC44703ln22 = (InterfaceC44703ln2) first;
                if (m104726y()) {
                    mo26834b = interfaceC44703ln22.mo26832d();
                } else {
                    mo26834b = interfaceC44703ln22.mo26834b();
                }
                i = mo26834b - 1;
                first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) m104735p.mo4706b());
                index = ((InterfaceC44703ln2) first2).getIndex() - 1;
            }
            if (i != this.f12429k) {
                if (index >= 0 && index < m104735p.mo4707a()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (this.f12431m != z && (m96690u = (lx2 = this.f12430l).m96690u()) > 0) {
                        C38173ao2.InterfaceC12153a[] m96691s = lx2.m96691s();
                        int i2 = 0;
                        do {
                            m96691s[i2].cancel();
                            i2++;
                        } while (i2 < m96690u);
                        this.f12431m = z;
                        this.f12429k = i;
                        this.f12430l.m96696h();
                        List<Pair<Integer, C44228kz0>> invoke = m104732s().invoke(C48301rr2.m15182a(C48301rr2.m15181b(i)));
                        size = invoke.size();
                        while (r2 < size) {
                        }
                    }
                    this.f12431m = z;
                    this.f12429k = i;
                    this.f12430l.m96696h();
                    List<Pair<Integer, C44228kz0>> invoke2 = m104732s().invoke(C48301rr2.m15182a(C48301rr2.m15181b(i)));
                    size = invoke2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Pair<Integer, C44228kz0> pair = invoke2.get(i3);
                        this.f12430l.m96701b(c38173ao2.m65457b(pair.getFirst().intValue(), pair.getSecond().m28058s()));
                    }
                }
            }
        }
    }

    public C33136Gn2(int i, int i2) {
        EX2<InterfaceC50631vn2> m97025e;
        EX2 m97025e2;
        EX2 m97025e3;
        EX2 m97025e4;
        EX2 m97025e5;
        EX2 m97025e6;
        EX2 m97025e7;
        EX2 m97025e8;
        EX2 m97025e9;
        this.f12419a = new C32434Dn2(i, i2);
        m97025e = LM5.m97025e(C35826Sa1.f33923a, null, 2, null);
        this.f12420b = m97025e;
        this.f12421c = C40741f62.m42091a();
        m97025e2 = LM5.m97025e(0, null, 2, null);
        this.f12423e = m97025e2;
        m97025e3 = LM5.m97025e(C42459i01.m35405a(1.0f, 1.0f), null, 2, null);
        this.f12424f = m97025e3;
        m97025e4 = LM5.m97025e(Boolean.TRUE, null, 2, null);
        this.f12425g = m97025e4;
        this.f12426h = C38789bq5.m62556a(new C2949h());
        this.f12428j = true;
        this.f12429k = -1;
        this.f12430l = new LX2<>(new C38173ao2.InterfaceC12153a[16], 0);
        m97025e5 = LM5.m97025e(null, null, 2, null);
        this.f12432n = m97025e5;
        this.f12433o = new C2946e();
        this.f12434p = new C8494Uu();
        m97025e6 = LM5.m97025e(C2945d.f12444g, null, 2, null);
        this.f12435q = m97025e6;
        m97025e7 = LM5.m97025e(null, null, 2, null);
        this.f12436r = m97025e7;
        this.f12437s = new C42924in2(this);
        this.f12438t = new C37582Zn2();
        Boolean bool = Boolean.FALSE;
        m97025e8 = LM5.m97025e(bool, null, 2, null);
        this.f12439u = m97025e8;
        m97025e9 = LM5.m97025e(bool, null, 2, null);
        this.f12440v = m97025e9;
        this.f12441w = new C38173ao2();
    }

    public /* synthetic */ C33136Gn2(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
