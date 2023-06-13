package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020\u001d¢\u0006\u0004\b<\u0010=J4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tJ;\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u000bJ\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u001c\u0010\u001f\u001a\u00020\u0011*\u00020\u0002H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R$\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000100j\b\u0012\u0004\u0012\u00020\u0001`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u001b\u0010;\u001a\u00020\u0002*\u00020\u00118BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010:\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006>"}, m28432d2 = {"Lno2;", "", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Lxo2;", "positionedItems", "LGo2;", "itemProvider", "", "g", "key", "placeableIndex", "minOffset", "maxOffset", "LA52;", "rawOffset", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;IIIJ)J", "h", "item", "mainAxisOffset", "Lwc2;", "b", "itemInfo", "i", "mainAxisLayoutSize", "", "f", "j", "(I)J", "LZC0;", C17296a.f69688o, "LZC0;", Action.SCOPE_ATTRIBUTE, "Z", "isVertical", "", "c", "Ljava/util/Map;", "keyToItemInfoMap", "", "keyToIndexMap", "e", "I", "firstVisibleIndex", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "movingInFromEndBound", "LEo2;", "movingAwayToStartBound", "movingAwayToEndBound", "(J)I", "mainAxis", "<init>", "(LZC0;Z)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n33#2,4:360\n38#2:365\n33#2,6:368\n33#2,6:376\n101#2,2:383\n33#2,6:385\n103#2:391\n33#2,6:395\n33#2,6:403\n69#2,4:414\n74#2:420\n101#2,2:421\n33#2,4:423\n38#2:428\n103#2:429\n86#3:364\n86#3:409\n86#3:410\n79#3:411\n86#3:412\n79#3:413\n86#3:418\n79#3:419\n86#3:427\n1011#4,2:366\n1002#4,2:374\n1855#4:382\n1856#4:392\n1011#4,2:393\n1002#4,2:401\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n74#1:351,2\n74#1:353,6\n74#1:359\n93#1:360,4\n93#1:365\n124#1:368,6\n133#1:376,6\n148#1:383,2\n148#1:385,6\n148#1:391\n167#1:395,6\n178#1:403,6\n278#1:414,4\n278#1:420\n316#1:421,2\n316#1:423,4\n316#1:428\n316#1:429\n113#1:364\n208#1:409\n209#1:410\n251#1:411\n254#1:412\n272#1:413\n279#1:418\n284#1:419\n317#1:427\n123#1:366,2\n132#1:374,2\n141#1:382\n141#1:392\n166#1:393,2\n177#1:401,2\n*E\n"})
/* renamed from: no2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45899no2 {

    /* renamed from: a */
    public final ZC0 f100848a;

    /* renamed from: b */
    public final boolean f100849b;

    /* renamed from: c */
    public final Map<Object, C51114wc2> f100850c;

    /* renamed from: d */
    public Map<Object, Integer> f100851d;

    /* renamed from: e */
    public int f100852e;

    /* renamed from: f */
    public final LinkedHashSet<Object> f100853f;

    /* renamed from: g */
    public final List<C51827xo2> f100854g;

    /* renamed from: h */
    public final List<C51827xo2> f100855h;

    /* renamed from: i */
    public final List<C32677Eo2> f100856i;

    /* renamed from: j */
    public final List<C32677Eo2> f100857j;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", m28418f = "LazyListItemPlacementAnimator.kt", m28417i = {}, m28416l = {217}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: no2$a */
    /* loaded from: classes.dex */
    public static final class C26714a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f100858h;

        /* renamed from: i */
        public final /* synthetic */ QU3 f100859i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26714a(QU3 qu3, Continuation<? super C26714a> continuation) {
            super(2, continuation);
            this.f100859i = qu3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26714a(this.f100859i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C26714a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f100858h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne<A52, C28797tf> m88477a = this.f100859i.m88477a();
                A52 m116119b = A52.m116119b(this.f100859i.m88474d());
                this.f100858h = 1;
                if (m88477a.m23378u(m116119b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f100859i.m88473e(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n132#2:329\n*E\n"})
    /* renamed from: no2$b */
    /* loaded from: classes.dex */
    public static final class C26715b<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Map f100860b;

        public C26715b(Map map) {
            this.f100860b = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) this.f100860b.get(((C51827xo2) t).m4636e()), (Integer) this.f100860b.get(((C51827xo2) t2).m4636e()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n177#2:329\n*E\n"})
    /* renamed from: no2$c */
    /* loaded from: classes.dex */
    public static final class C26716c<T> implements Comparator {
        public C26716c() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) C45899no2.this.f100851d.get(((C32677Eo2) t).m108351c()), (Integer) C45899no2.this.f100851d.get(((C32677Eo2) t2).m108351c()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n123#2:329\n*E\n"})
    /* renamed from: no2$d */
    /* loaded from: classes.dex */
    public static final class C26717d<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Map f100862b;

        public C26717d(Map map) {
            this.f100862b = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) this.f100862b.get(((C51827xo2) t2).m4636e()), (Integer) this.f100862b.get(((C51827xo2) t).m4636e()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n1#1,328:1\n166#2:329\n*E\n"})
    /* renamed from: no2$e */
    /* loaded from: classes.dex */
    public static final class C26718e<T> implements Comparator {
        public C26718e() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) C45899no2.this.f100851d.get(((C32677Eo2) t2).m108351c()), (Integer) C45899no2.this.f100851d.get(((C32677Eo2) t).m108351c()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1", m28418f = "LazyListItemPlacementAnimator.kt", m28417i = {}, m28416l = {297}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: no2$f */
    /* loaded from: classes.dex */
    public static final class C26719f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f100864h;

        /* renamed from: i */
        public final /* synthetic */ QU3 f100865i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC49435tm1<A52> f100866j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26719f(QU3 qu3, InterfaceC49435tm1<A52> interfaceC49435tm1, Continuation<? super C26719f> continuation) {
            super(2, continuation);
            this.f100865i = qu3;
            this.f100866j = interfaceC49435tm1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26719f(this.f100865i, this.f100866j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C26719f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC25753lf interfaceC25753lf;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f100864h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (this.f100865i.m88477a().m23382q()) {
                        InterfaceC49435tm1<A52> interfaceC49435tm1 = this.f100866j;
                        if (interfaceC49435tm1 instanceof C43282jO5) {
                            interfaceC25753lf = (C43282jO5) interfaceC49435tm1;
                        } else {
                            interfaceC25753lf = C46492oo2.m20480a();
                        }
                    } else {
                        interfaceC25753lf = this.f100866j;
                    }
                    InterfaceC25753lf interfaceC25753lf2 = interfaceC25753lf;
                    C26560ne<A52, C28797tf> m88477a = this.f100865i.m88477a();
                    A52 m116119b = A52.m116119b(this.f100865i.m88474d());
                    this.f100864h = 1;
                    if (C26560ne.m23393f(m88477a, m116119b, interfaceC25753lf2, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f100865i.m88473e(false);
            } catch (CancellationException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public C45899no2(ZC0 scope, boolean z) {
        Map<Object, Integer> emptyMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f100848a = scope;
        this.f100849b = z;
        this.f100850c = new LinkedHashMap();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f100851d = emptyMap;
        this.f100853f = new LinkedHashSet<>();
        this.f100854g = new ArrayList();
        this.f100855h = new ArrayList();
        this.f100856i = new ArrayList();
        this.f100857j = new ArrayList();
    }

    /* renamed from: c */
    public static /* synthetic */ C51114wc2 m22354c(C45899no2 c45899no2, C51827xo2 c51827xo2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = c45899no2.m22352e(c51827xo2.m4633h(0));
        }
        return c45899no2.m22355b(c51827xo2, i);
    }

    /* renamed from: b */
    public final C51114wc2 m22355b(C51827xo2 c51827xo2, int i) {
        long m116114g;
        C51114wc2 c51114wc2 = new C51114wc2();
        long m4633h = c51827xo2.m4633h(0);
        if (this.f100849b) {
            m116114g = A52.m116114g(m4633h, 0, i, 1, null);
        } else {
            m116114g = A52.m116114g(m4633h, i, 0, 2, null);
        }
        int m4632i = c51827xo2.m4632i();
        for (int i2 = 0; i2 < m4632i; i2++) {
            long m4633h2 = c51827xo2.m4633h(i2);
            long m114704a = B52.m114704a(A52.m116111j(m4633h2) - A52.m116111j(m4633h), A52.m116110k(m4633h2) - A52.m116110k(m4633h));
            c51114wc2.m6595b().add(new QU3(B52.m114704a(A52.m116111j(m116114g) + A52.m116111j(m114704a), A52.m116110k(m116114g) + A52.m116110k(m114704a)), c51827xo2.m4635f(i2), null));
        }
        return c51114wc2;
    }

    /* renamed from: d */
    public final long m22353d(Object key, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        C51114wc2 c51114wc2 = this.f100850c.get(key);
        if (c51114wc2 == null) {
            return j;
        }
        QU3 qu3 = c51114wc2.m6595b().get(i);
        long m116107n = qu3.m88477a().m23385n().m116107n();
        long m6596a = c51114wc2.m6596a();
        long m114704a = B52.m114704a(A52.m116111j(m116107n) + A52.m116111j(m6596a), A52.m116110k(m116107n) + A52.m116110k(m6596a));
        long m88474d = qu3.m88474d();
        long m6596a2 = c51114wc2.m6596a();
        long m114704a2 = B52.m114704a(A52.m116111j(m88474d) + A52.m116111j(m6596a2), A52.m116110k(m88474d) + A52.m116110k(m6596a2));
        if (qu3.m88476b() && ((m22352e(m114704a2) <= i2 && m22352e(m114704a) <= i2) || (m22352e(m114704a2) >= i3 && m22352e(m114704a) >= i3))) {
            X30.m77507d(this.f100848a, null, null, new C26714a(qu3, null), 3, null);
        }
        return m114704a;
    }

    /* renamed from: e */
    public final int m22352e(long j) {
        return this.f100849b ? A52.m116110k(j) : A52.m116111j(j);
    }

    /* renamed from: f */
    public final boolean m22351f(C51114wc2 c51114wc2, int i) {
        boolean z;
        List<QU3> m6595b = c51114wc2.m6595b();
        int size = m6595b.size();
        for (int i2 = 0; i2 < size; i2++) {
            QU3 qu3 = m6595b.get(i2);
            long m88474d = qu3.m88474d();
            long m6596a = c51114wc2.m6596a();
            long m114704a = B52.m114704a(A52.m116111j(m88474d) + A52.m116111j(m6596a), A52.m116110k(m88474d) + A52.m116110k(m6596a));
            if (m22352e(m114704a) + qu3.m88475c() > 0 && m22352e(m114704a) < i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m22350g(int i, int i2, int i3, List<C51827xo2> positionedItems, C33145Go2 itemProvider) {
        boolean z;
        Object firstOrNull;
        int i4;
        int i5;
        Object value;
        Object value2;
        Object value3;
        boolean z2;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (positionedItems.get(i8).m4637d()) {
                    z = true;
                    break;
                }
                i8++;
            } else {
                z = false;
                break;
            }
        }
        if (!z && this.f100850c.isEmpty()) {
            m22349h();
            return;
        }
        int i9 = this.f100852e;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) positionedItems);
        C51827xo2 c51827xo2 = (C51827xo2) firstOrNull;
        if (c51827xo2 != null) {
            i4 = c51827xo2.getIndex();
        } else {
            i4 = 0;
        }
        this.f100852e = i4;
        Map<Object, Integer> map = this.f100851d;
        this.f100851d = itemProvider.m104709c();
        if (this.f100849b) {
            i5 = i3;
        } else {
            i5 = i2;
        }
        long m22347j = m22347j(i);
        this.f100853f.addAll(this.f100850c.keySet());
        int size2 = positionedItems.size();
        int i10 = 0;
        while (i10 < size2) {
            C51827xo2 c51827xo22 = positionedItems.get(i10);
            this.f100853f.remove(c51827xo22.m4636e());
            if (c51827xo22.m4637d()) {
                C51114wc2 c51114wc2 = this.f100850c.get(c51827xo22.m4636e());
                if (c51114wc2 == null) {
                    Integer num = map.get(c51827xo22.m4636e());
                    if (num != null && c51827xo22.getIndex() != num.intValue()) {
                        if (num.intValue() < i9) {
                            this.f100854g.add(c51827xo22);
                        } else {
                            this.f100855h.add(c51827xo22);
                        }
                        i6 = i9;
                        i7 = size2;
                    } else {
                        i6 = i9;
                        i7 = size2;
                        this.f100850c.put(c51827xo22.m4636e(), m22354c(this, c51827xo22, 0, 2, null));
                    }
                } else {
                    i6 = i9;
                    i7 = size2;
                    long m6596a = c51114wc2.m6596a();
                    c51114wc2.m6594c(B52.m114704a(A52.m116111j(m6596a) + A52.m116111j(m22347j), A52.m116110k(m6596a) + A52.m116110k(m22347j)));
                    m22348i(c51827xo22, c51114wc2);
                }
            } else {
                i6 = i9;
                i7 = size2;
                this.f100850c.remove(c51827xo22.m4636e());
            }
            i10++;
            size2 = i7;
            i9 = i6;
        }
        int i11 = 0;
        List<C51827xo2> list = this.f100854g;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new C26717d(map));
        }
        List<C51827xo2> list2 = this.f100854g;
        int size3 = list2.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size3; i13++) {
            C51827xo2 c51827xo23 = list2.get(i13);
            int mo4640a = (0 - i12) - c51827xo23.mo4640a();
            i12 += c51827xo23.mo4640a();
            C51114wc2 m22355b = m22355b(c51827xo23, mo4640a);
            this.f100850c.put(c51827xo23.m4636e(), m22355b);
            m22348i(c51827xo23, m22355b);
        }
        List<C51827xo2> list3 = this.f100855h;
        if (list3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list3, new C26715b(map));
        }
        List<C51827xo2> list4 = this.f100855h;
        int size4 = list4.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size4; i15++) {
            C51827xo2 c51827xo24 = list4.get(i15);
            int i16 = i5 + i14;
            i14 += c51827xo24.mo4640a();
            C51114wc2 m22355b2 = m22355b(c51827xo24, i16);
            this.f100850c.put(c51827xo24.m4636e(), m22355b2);
            m22348i(c51827xo24, m22355b2);
        }
        for (Object obj : this.f100853f) {
            value3 = MapsKt__MapsKt.getValue(this.f100850c, obj);
            C51114wc2 c51114wc22 = (C51114wc2) value3;
            Integer num2 = this.f100851d.get(obj);
            List<QU3> m6595b = c51114wc22.m6595b();
            int size5 = m6595b.size();
            int i17 = 0;
            while (true) {
                if (i17 < size5) {
                    if (m6595b.get(i17).m88476b()) {
                        z2 = true;
                        break;
                    }
                    i17++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!c51114wc22.m6595b().isEmpty() && num2 != null && ((z2 || !Intrinsics.areEqual(num2, map.get(obj))) && (z2 || m22351f(c51114wc22, i5)))) {
                C32677Eo2 m104711a = itemProvider.m104711a(KS0.m98880b(num2.intValue()));
                if (num2.intValue() < this.f100852e) {
                    this.f100856i.add(m104711a);
                } else {
                    this.f100857j.add(m104711a);
                }
            } else {
                this.f100850c.remove(obj);
            }
        }
        List<C32677Eo2> list5 = this.f100856i;
        if (list5.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list5, new C26718e());
        }
        List<C32677Eo2> list6 = this.f100856i;
        int size6 = list6.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size6; i19++) {
            C32677Eo2 c32677Eo2 = list6.get(i19);
            int m108350d = (0 - i18) - c32677Eo2.m108350d();
            i18 += c32677Eo2.m108350d();
            value2 = MapsKt__MapsKt.getValue(this.f100850c, c32677Eo2.m108351c());
            C51827xo2 m108348f = c32677Eo2.m108348f(m108350d, i2, i3);
            positionedItems.add(m108348f);
            m22348i(m108348f, (C51114wc2) value2);
        }
        List<C32677Eo2> list7 = this.f100857j;
        if (list7.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list7, new C26716c());
        }
        List<C32677Eo2> list8 = this.f100857j;
        int size7 = list8.size();
        for (int i20 = 0; i20 < size7; i20++) {
            C32677Eo2 c32677Eo22 = list8.get(i20);
            int i21 = i5 + i11;
            i11 += c32677Eo22.m108350d();
            value = MapsKt__MapsKt.getValue(this.f100850c, c32677Eo22.m108351c());
            C51827xo2 m108348f2 = c32677Eo22.m108348f(i21, i2, i3);
            positionedItems.add(m108348f2);
            m22348i(m108348f2, (C51114wc2) value);
        }
        this.f100854g.clear();
        this.f100855h.clear();
        this.f100856i.clear();
        this.f100857j.clear();
        this.f100853f.clear();
    }

    /* renamed from: h */
    public final void m22349h() {
        Map<Object, Integer> emptyMap;
        this.f100850c.clear();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f100851d = emptyMap;
        this.f100852e = -1;
    }

    /* renamed from: i */
    public final void m22348i(C51827xo2 c51827xo2, C51114wc2 c51114wc2) {
        while (c51114wc2.m6595b().size() > c51827xo2.m4632i()) {
            CollectionsKt__MutableCollectionsKt.removeLast(c51114wc2.m6595b());
        }
        while (c51114wc2.m6595b().size() < c51827xo2.m4632i()) {
            int size = c51114wc2.m6595b().size();
            long m4633h = c51827xo2.m4633h(size);
            List<QU3> m6595b = c51114wc2.m6595b();
            long m6596a = c51114wc2.m6596a();
            m6595b.add(new QU3(B52.m114704a(A52.m116111j(m4633h) - A52.m116111j(m6596a), A52.m116110k(m4633h) - A52.m116110k(m6596a)), c51827xo2.m4635f(size), null));
        }
        List<QU3> m6595b2 = c51114wc2.m6595b();
        int size2 = m6595b2.size();
        for (int i = 0; i < size2; i++) {
            QU3 qu3 = m6595b2.get(i);
            long m88474d = qu3.m88474d();
            long m6596a2 = c51114wc2.m6596a();
            long m114704a = B52.m114704a(A52.m116111j(m88474d) + A52.m116111j(m6596a2), A52.m116110k(m88474d) + A52.m116110k(m6596a2));
            long m4633h2 = c51827xo2.m4633h(i);
            qu3.m88472f(c51827xo2.m4635f(i));
            InterfaceC49435tm1<A52> m4638c = c51827xo2.m4638c(i);
            if (!A52.m116112i(m114704a, m4633h2)) {
                long m6596a3 = c51114wc2.m6596a();
                qu3.m88471g(B52.m114704a(A52.m116111j(m4633h2) - A52.m116111j(m6596a3), A52.m116110k(m4633h2) - A52.m116110k(m6596a3)));
                if (m4638c != null) {
                    qu3.m88473e(true);
                    X30.m77507d(this.f100848a, null, null, new C26719f(qu3, m4638c, null), 3, null);
                }
            }
        }
    }

    /* renamed from: j */
    public final long m22347j(int i) {
        boolean z = this.f100849b;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return B52.m114704a(i2, i);
    }
}
