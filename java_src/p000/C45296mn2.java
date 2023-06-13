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
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020\u001f¢\u0006\u0004\bA\u0010BJ<\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ;\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001aH\u0002J\u0014\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u001c\u0010!\u001a\u00020\u0013*\u00020\u0002H\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001a0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000102j\b\u0012\u0004\u0012\u00020\u0001`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00107R\u001b\u0010>\u001a\u00020\u0002*\u00020\u00138BX\u0082\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u0010=R\u0018\u0010@\u001a\u00020\u0002*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010?\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006C"}, m28432d2 = {"Lmn2;", "", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "LAn2;", "positionedItems", "LFo2;", "itemProvider", "LFn2;", "spanLayoutProvider", "", "h", "key", "placeableIndex", "minOffset", "maxOffset", "LA52;", "rawOffset", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;IIIJ)J", "i", "item", "mainAxisOffset", "Lvc2;", "b", "itemInfo", "j", "mainAxisLayoutSize", "", "g", "k", "(I)J", "LZC0;", C17296a.f69688o, "LZC0;", Action.SCOPE_ATTRIBUTE, "Z", "isVertical", "", "c", "Ljava/util/Map;", "keyToItemInfoMap", "", "keyToIndexMap", "e", "I", "firstVisibleIndex", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "Ljava/util/LinkedHashSet;", "movingAwayKeys", "Ljava/util/List;", "movingInFromStartBound", "movingInFromEndBound", "Lyn2;", "movingAwayToStartBound", "movingAwayToEndBound", "(J)I", "mainAxis", "(LAn2;)I", "line", "<init>", "(LZC0;Z)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,412:1\n101#2,2:413\n33#2,6:415\n103#2:421\n33#2,4:422\n38#2:427\n33#2,6:430\n33#2,6:438\n101#2,2:445\n33#2,6:447\n103#2:453\n33#2,6:457\n33#2,6:465\n69#2,4:474\n74#2:480\n101#2,2:481\n33#2,4:483\n38#2:488\n103#2:489\n86#3:426\n86#3:471\n86#3:472\n79#3:473\n86#3:478\n79#3:479\n86#3:487\n1011#4,2:428\n1002#4,2:436\n1855#4:444\n1856#4:454\n1011#4,2:455\n1002#4,2:463\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n77#1:413,2\n77#1:415,6\n77#1:421\n96#1:422,4\n96#1:427\n131#1:430,6\n149#1:438,6\n171#1:445,2\n171#1:447,6\n171#1:453\n199#1:457,6\n227#1:465,6\n338#1:474,4\n338#1:480\n376#1:481,2\n376#1:483,4\n376#1:488\n376#1:489\n116#1:426\n272#1:471\n273#1:472\n332#1:473\n339#1:478\n344#1:479\n377#1:487\n128#1:428,2\n148#1:436,2\n164#1:444\n164#1:454\n198#1:455,2\n226#1:463,2\n*E\n"})
/* renamed from: mn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45296mn2 {

    /* renamed from: a */
    public final ZC0 f98758a;

    /* renamed from: b */
    public final boolean f98759b;

    /* renamed from: c */
    public final Map<Object, C50521vc2> f98760c;

    /* renamed from: d */
    public Map<Object, Integer> f98761d;

    /* renamed from: e */
    public int f98762e;

    /* renamed from: f */
    public final LinkedHashSet<Object> f98763f;

    /* renamed from: g */
    public final List<C31732An2> f98764g;

    /* renamed from: h */
    public final List<C31732An2> f98765h;

    /* renamed from: i */
    public final List<C52410yn2> f98766i;

    /* renamed from: j */
    public final List<C52410yn2> f98767j;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$getAnimatedOffset$1", m28418f = "LazyGridItemPlacementAnimator.kt", m28417i = {}, m28416l = {281}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: mn2$a */
    /* loaded from: classes.dex */
    public static final class C26216a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f98768h;

        /* renamed from: i */
        public final /* synthetic */ PU3 f98769i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26216a(PU3 pu3, Continuation<? super C26216a> continuation) {
            super(2, continuation);
            this.f98769i = pu3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26216a(this.f98769i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C26216a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f98768h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C26560ne<A52, C28797tf> m90198a = this.f98769i.m90198a();
                A52 m116119b = A52.m116119b(this.f98769i.m90195d());
                this.f98768h = 1;
                if (m90198a.m23378u(m116119b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f98769i.m90194e(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n148#2:329\n*E\n"})
    /* renamed from: mn2$b */
    /* loaded from: classes.dex */
    public static final class C26217b<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Map f98770b;

        public C26217b(Map map) {
            this.f98770b = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) this.f98770b.get(((C31732An2) t).m115260i()), (Integer) this.f98770b.get(((C31732An2) t2).m115260i()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n226#2:329\n*E\n"})
    /* renamed from: mn2$c */
    /* loaded from: classes.dex */
    public static final class C26218c<T> implements Comparator {
        public C26218c() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) C45296mn2.this.f98761d.get(((C52410yn2) t).m2585c()), (Integer) C45296mn2.this.f98761d.get(((C52410yn2) t2).m2585c()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n128#2:329\n*E\n"})
    /* renamed from: mn2$d */
    /* loaded from: classes.dex */
    public static final class C26219d<T> implements Comparator {

        /* renamed from: b */
        public final /* synthetic */ Map f98772b;

        public C26219d(Map map) {
            this.f98772b = map;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) this.f98772b.get(((C31732An2) t2).m115260i()), (Integer) this.f98772b.get(((C31732An2) t).m115260i()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n1#1,328:1\n198#2:329\n*E\n"})
    /* renamed from: mn2$e */
    /* loaded from: classes.dex */
    public static final class C26220e<T> implements Comparator {
        public C26220e() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues((Integer) C45296mn2.this.f98761d.get(((C52410yn2) t2).m2585c()), (Integer) C45296mn2.this.f98761d.get(((C52410yn2) t).m2585c()));
            return compareValues;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", m28418f = "LazyGridItemPlacementAnimator.kt", m28417i = {}, m28416l = {357}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: mn2$f */
    /* loaded from: classes.dex */
    public static final class C26221f extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f98774h;

        /* renamed from: i */
        public final /* synthetic */ PU3 f98775i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC49435tm1<A52> f98776j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26221f(PU3 pu3, InterfaceC49435tm1<A52> interfaceC49435tm1, Continuation<? super C26221f> continuation) {
            super(2, continuation);
            this.f98775i = pu3;
            this.f98776j = interfaceC49435tm1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C26221f(this.f98775i, this.f98776j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C26221f) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC25753lf interfaceC25753lf;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f98774h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (this.f98775i.m90198a().m23382q()) {
                        InterfaceC49435tm1<A52> interfaceC49435tm1 = this.f98776j;
                        if (interfaceC49435tm1 instanceof C43282jO5) {
                            interfaceC25753lf = (C43282jO5) interfaceC49435tm1;
                        } else {
                            interfaceC25753lf = C45889nn2.m23148a();
                        }
                    } else {
                        interfaceC25753lf = this.f98776j;
                    }
                    InterfaceC25753lf interfaceC25753lf2 = interfaceC25753lf;
                    C26560ne<A52, C28797tf> m90198a = this.f98775i.m90198a();
                    A52 m116119b = A52.m116119b(this.f98775i.m90195d());
                    this.f98774h = 1;
                    if (C26560ne.m23393f(m90198a, m116119b, interfaceC25753lf2, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f98775i.m90194e(false);
            } catch (CancellationException unused) {
            }
            return Unit.INSTANCE;
        }
    }

    public C45296mn2(ZC0 scope, boolean z) {
        Map<Object, Integer> emptyMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f98758a = scope;
        this.f98759b = z;
        this.f98760c = new LinkedHashMap();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f98761d = emptyMap;
        this.f98763f = new LinkedHashSet<>();
        this.f98764g = new ArrayList();
        this.f98765h = new ArrayList();
        this.f98766i = new ArrayList();
        this.f98767j = new ArrayList();
    }

    /* renamed from: c */
    public static /* synthetic */ C50521vc2 m25004c(C45296mn2 c45296mn2, C31732An2 c31732An2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = c45296mn2.m25001f(c31732An2.mo26833c());
        }
        return c45296mn2.m25005b(c31732An2, i);
    }

    /* renamed from: b */
    public final C50521vc2 m25005b(C31732An2 c31732An2, int i) {
        long m116114g;
        C50521vc2 c50521vc2 = new C50521vc2(c31732An2.m115262g(), c31732An2.m115263f());
        if (this.f98759b) {
            m116114g = A52.m116114g(c31732An2.mo26833c(), 0, i, 1, null);
        } else {
            m116114g = A52.m116114g(c31732An2.mo26833c(), i, 0, 2, null);
        }
        int m115256m = c31732An2.m115256m();
        for (int i2 = 0; i2 < m115256m; i2++) {
            c50521vc2.m8379d().add(new PU3(m116114g, c31732An2.m115258k(i2), null));
        }
        return c50521vc2;
    }

    /* renamed from: d */
    public final long m25003d(Object key, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        C50521vc2 c50521vc2 = this.f98760c.get(key);
        if (c50521vc2 == null) {
            return j;
        }
        PU3 pu3 = c50521vc2.m8379d().get(i);
        long m116107n = pu3.m90198a().m23385n().m116107n();
        long m8380c = c50521vc2.m8380c();
        long m114704a = B52.m114704a(A52.m116111j(m116107n) + A52.m116111j(m8380c), A52.m116110k(m116107n) + A52.m116110k(m8380c));
        long m90195d = pu3.m90195d();
        long m8380c2 = c50521vc2.m8380c();
        long m114704a2 = B52.m114704a(A52.m116111j(m90195d) + A52.m116111j(m8380c2), A52.m116110k(m90195d) + A52.m116110k(m8380c2));
        if (pu3.m90197b() && ((m25001f(m114704a2) <= i2 && m25001f(m114704a) < i2) || (m25001f(m114704a2) >= i3 && m25001f(m114704a) > i3))) {
            X30.m77507d(this.f98758a, null, null, new C26216a(pu3, null), 3, null);
        }
        return m114704a;
    }

    /* renamed from: e */
    public final int m25002e(C31732An2 c31732An2) {
        return this.f98759b ? c31732An2.mo26832d() : c31732An2.mo26834b();
    }

    /* renamed from: f */
    public final int m25001f(long j) {
        return this.f98759b ? A52.m116110k(j) : A52.m116111j(j);
    }

    /* renamed from: g */
    public final boolean m25000g(C50521vc2 c50521vc2, int i) {
        boolean z;
        List<PU3> m8379d = c50521vc2.m8379d();
        int size = m8379d.size();
        for (int i2 = 0; i2 < size; i2++) {
            PU3 pu3 = m8379d.get(i2);
            long m90195d = pu3.m90195d();
            long m8380c = c50521vc2.m8380c();
            long m114704a = B52.m114704a(A52.m116111j(m90195d) + A52.m116111j(m8380c), A52.m116110k(m90195d) + A52.m116110k(m8380c));
            if (m25001f(m114704a) + pu3.m90196c() > 0 && m25001f(m114704a) < i) {
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

    /* renamed from: h */
    public final void m24999h(int i, int i2, int i3, List<C31732An2> positionedItems, C32911Fo2 itemProvider, C32902Fn2 spanLayoutProvider) {
        boolean z;
        Object firstOrNull;
        Object value;
        Object value2;
        Object value3;
        boolean z2;
        long m28054d;
        int i4;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        int size = positionedItems.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                z = false;
                break;
            } else if (positionedItems.get(i6).m115261h()) {
                z = true;
                break;
            } else {
                i6++;
            }
        }
        if (!z && this.f98760c.isEmpty()) {
            m24998i();
            return;
        }
        int i7 = this.f98762e;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) positionedItems);
        C31732An2 c31732An2 = (C31732An2) firstOrNull;
        this.f98762e = c31732An2 != null ? c31732An2.getIndex() : 0;
        Map<Object, Integer> map = this.f98761d;
        this.f98761d = itemProvider.m106441c();
        int i8 = this.f98759b ? i3 : i2;
        long m24996k = m24996k(i);
        this.f98763f.addAll(this.f98760c.keySet());
        int size2 = positionedItems.size();
        int i9 = 0;
        while (i9 < size2) {
            C31732An2 c31732An22 = positionedItems.get(i9);
            this.f98763f.remove(c31732An22.m115260i());
            if (c31732An22.m115261h()) {
                C50521vc2 c50521vc2 = this.f98760c.get(c31732An22.m115260i());
                if (c50521vc2 == null) {
                    Integer num = map.get(c31732An22.m115260i());
                    if (num != null && c31732An22.getIndex() != num.intValue()) {
                        if (num.intValue() < i7) {
                            this.f98764g.add(c31732An22);
                        } else {
                            this.f98765h.add(c31732An22);
                        }
                        i4 = i7;
                    } else {
                        i4 = i7;
                        this.f98760c.put(c31732An22.m115260i(), m25004c(this, c31732An22, i5, 2, null));
                    }
                } else {
                    i4 = i7;
                    long m8380c = c50521vc2.m8380c();
                    c50521vc2.m8376g(B52.m114704a(A52.m116111j(m8380c) + A52.m116111j(m24996k), A52.m116110k(m8380c) + A52.m116110k(m24996k)));
                    c50521vc2.m8377f(c31732An22.m115262g());
                    c50521vc2.m8378e(c31732An22.m115263f());
                    m24997j(c31732An22, c50521vc2);
                }
            } else {
                i4 = i7;
                this.f98760c.remove(c31732An22.m115260i());
            }
            i9++;
            i7 = i4;
            i5 = 0;
        }
        List<C31732An2> list = this.f98764g;
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new C26219d(map));
        }
        List<C31732An2> list2 = this.f98764g;
        int size3 = list2.size();
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < size3) {
            C31732An2 c31732An23 = list2.get(i12);
            int m25002e = m25002e(c31732An23);
            if (m25002e != i10 && m25002e == i11) {
                i14 = Math.max(i14, c31732An23.m115259j());
            } else {
                i13 += i14;
                i14 = c31732An23.m115259j();
                i11 = m25002e;
            }
            C50521vc2 m25005b = m25005b(c31732An23, (0 - i13) - c31732An23.m115259j());
            this.f98760c.put(c31732An23.m115260i(), m25005b);
            m24997j(c31732An23, m25005b);
            i12++;
            i10 = -1;
        }
        List<C31732An2> list3 = this.f98765h;
        if (list3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list3, new C26217b(map));
        }
        List<C31732An2> list4 = this.f98765h;
        int size4 = list4.size();
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < size4; i18++) {
            C31732An2 c31732An24 = list4.get(i18);
            int m25002e2 = m25002e(c31732An24);
            if (m25002e2 != -1 && m25002e2 == i15) {
                i17 = Math.max(i17, c31732An24.m115259j());
            } else {
                i16 += i17;
                i17 = c31732An24.m115259j();
                i15 = m25002e2;
            }
            C50521vc2 m25005b2 = m25005b(c31732An24, i8 + i16);
            this.f98760c.put(c31732An24.m115260i(), m25005b2);
            m24997j(c31732An24, m25005b2);
        }
        for (Object obj : this.f98763f) {
            value3 = MapsKt__MapsKt.getValue(this.f98760c, obj);
            C50521vc2 c50521vc22 = (C50521vc2) value3;
            Integer num2 = this.f98761d.get(obj);
            List<PU3> m8379d = c50521vc22.m8379d();
            int size5 = m8379d.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size5) {
                    z2 = false;
                    break;
                } else if (m8379d.get(i19).m90197b()) {
                    z2 = true;
                    break;
                } else {
                    i19++;
                }
            }
            if (!c50521vc22.m8379d().isEmpty() && num2 != null && ((z2 || !Intrinsics.areEqual(num2, map.get(obj))) && (z2 || m25000g(c50521vc22, i8)))) {
                int m9974b = C49929uc2.m9974b(num2.intValue());
                if (this.f98759b) {
                    m28054d = C44228kz0.f95301b.m28053e(c50521vc22.m8381b());
                } else {
                    m28054d = C44228kz0.f95301b.m28054d(c50521vc22.m8381b());
                }
                C52410yn2 m106442b = C32911Fo2.m106442b(itemProvider, m9974b, 0, m28054d, 2, null);
                if (num2.intValue() < this.f98762e) {
                    this.f98766i.add(m106442b);
                } else {
                    this.f98767j.add(m106442b);
                }
            } else {
                this.f98760c.remove(obj);
            }
        }
        List<C52410yn2> list5 = this.f98766i;
        if (list5.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list5, new C26220e());
        }
        List<C52410yn2> list6 = this.f98766i;
        int size6 = list6.size();
        int i20 = 0;
        int i21 = 0;
        int i22 = -1;
        for (int i23 = 0; i23 < size6; i23++) {
            C52410yn2 c52410yn2 = list6.get(i23);
            int m106467d = spanLayoutProvider.m106467d(c52410yn2.m2586b());
            if (m106467d != -1 && m106467d == i22) {
                i21 = Math.max(i21, c52410yn2.m2584d());
            } else {
                i20 += i21;
                i21 = c52410yn2.m2584d();
                i22 = m106467d;
            }
            int m2584d = (0 - i20) - c52410yn2.m2584d();
            value2 = MapsKt__MapsKt.getValue(this.f98760c, c52410yn2.m2585c());
            C50521vc2 c50521vc23 = (C50521vc2) value2;
            C31732An2 m2582f = c52410yn2.m2582f(m2584d, c50521vc23.m8382a(), i2, i3, -1, -1);
            positionedItems.add(m2582f);
            m24997j(m2582f, c50521vc23);
        }
        List<C52410yn2> list7 = this.f98767j;
        if (list7.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list7, new C26218c());
        }
        List<C52410yn2> list8 = this.f98767j;
        int size7 = list8.size();
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        for (int i27 = 0; i27 < size7; i27++) {
            C52410yn2 c52410yn22 = list8.get(i27);
            int m106467d2 = spanLayoutProvider.m106467d(c52410yn22.m2586b());
            if (m106467d2 != -1 && m106467d2 == i24) {
                i25 = Math.max(i25, c52410yn22.m2584d());
            } else {
                i26 += i25;
                i25 = c52410yn22.m2584d();
                i24 = m106467d2;
            }
            value = MapsKt__MapsKt.getValue(this.f98760c, c52410yn22.m2585c());
            C50521vc2 c50521vc24 = (C50521vc2) value;
            C31732An2 m2582f2 = c52410yn22.m2582f(i8 + i26, c50521vc24.m8382a(), i2, i3, -1, -1);
            positionedItems.add(m2582f2);
            m24997j(m2582f2, c50521vc24);
        }
        this.f98764g.clear();
        this.f98765h.clear();
        this.f98766i.clear();
        this.f98767j.clear();
        this.f98763f.clear();
    }

    /* renamed from: i */
    public final void m24998i() {
        Map<Object, Integer> emptyMap;
        this.f98760c.clear();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f98761d = emptyMap;
        this.f98762e = -1;
    }

    /* renamed from: j */
    public final void m24997j(C31732An2 c31732An2, C50521vc2 c50521vc2) {
        while (c50521vc2.m8379d().size() > c31732An2.m115256m()) {
            CollectionsKt__MutableCollectionsKt.removeLast(c50521vc2.m8379d());
        }
        while (c50521vc2.m8379d().size() < c31732An2.m115256m()) {
            int size = c50521vc2.m8379d().size();
            long mo26833c = c31732An2.mo26833c();
            List<PU3> m8379d = c50521vc2.m8379d();
            long m8380c = c50521vc2.m8380c();
            m8379d.add(new PU3(B52.m114704a(A52.m116111j(mo26833c) - A52.m116111j(m8380c), A52.m116110k(mo26833c) - A52.m116110k(m8380c)), c31732An2.m115258k(size), null));
        }
        List<PU3> m8379d2 = c50521vc2.m8379d();
        int size2 = m8379d2.size();
        for (int i = 0; i < size2; i++) {
            PU3 pu3 = m8379d2.get(i);
            long m90195d = pu3.m90195d();
            long m8380c2 = c50521vc2.m8380c();
            long m114704a = B52.m114704a(A52.m116111j(m90195d) + A52.m116111j(m8380c2), A52.m116110k(m90195d) + A52.m116110k(m8380c2));
            long mo26833c2 = c31732An2.mo26833c();
            pu3.m90193f(c31732An2.m115258k(i));
            InterfaceC49435tm1<A52> m115264e = c31732An2.m115264e(i);
            if (!A52.m116112i(m114704a, mo26833c2)) {
                long m8380c3 = c50521vc2.m8380c();
                pu3.m90192g(B52.m114704a(A52.m116111j(mo26833c2) - A52.m116111j(m8380c3), A52.m116110k(mo26833c2) - A52.m116110k(m8380c3)));
                if (m115264e != null) {
                    pu3.m90194e(true);
                    X30.m77507d(this.f98758a, null, null, new C26221f(pu3, m115264e, null), 3, null);
                }
            }
        }
    }

    /* renamed from: k */
    public final long m24996k(int i) {
        boolean z = this.f98759b;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return B52.m114704a(i2, i);
    }
}
