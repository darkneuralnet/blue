package p000;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u000b"}, m28432d2 = {"Lkotlin/Function0;", "", "firstVisibleItemIndex", "slidingWindowSize", "extraItemCount", "LsP5;", "Lkotlin/ranges/IntRange;", "c", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)LsP5;", "firstVisibleItem", "b", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyNearestItemsRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,89:1\n67#2,3:90\n66#2:93\n83#2,3:110\n1114#3,3:94\n1117#3,3:107\n1114#3,6:113\n480#4,4:97\n485#4:106\n122#5,5:101\n*S KotlinDebug\n*F\n+ 1 LazyNearestItemsRange.kt\nandroidx/compose/foundation/lazy/layout/LazyNearestItemsRangeKt\n*L\n47#1:90,3\n47#1:93\n59#1:110,3\n47#1:94,3\n47#1:107,3\n59#1:113,6\n48#1:97,4\n48#1:106\n48#1:101,5\n*E\n"})
/* renamed from: Io2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33613Io2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", m28418f = "LazyNearestItemsRange.kt", m28417i = {}, m28416l = {66}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Io2$a */
    /* loaded from: classes.dex */
    public static final class C3757a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f16214h;

        /* renamed from: i */
        public final /* synthetic */ Function0<Integer> f16215i;

        /* renamed from: j */
        public final /* synthetic */ Function0<Integer> f16216j;

        /* renamed from: k */
        public final /* synthetic */ Function0<Integer> f16217k;

        /* renamed from: l */
        public final /* synthetic */ EX2<IntRange> f16218l;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Io2$a$a */
        /* loaded from: classes.dex */
        public static final class C3758a extends Lambda implements Function0<IntRange> {

            /* renamed from: g */
            public final /* synthetic */ Function0<Integer> f16219g;

            /* renamed from: h */
            public final /* synthetic */ Function0<Integer> f16220h;

            /* renamed from: i */
            public final /* synthetic */ Function0<Integer> f16221i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3758a(Function0<Integer> function0, Function0<Integer> function02, Function0<Integer> function03) {
                super(0);
                this.f16219g = function0;
                this.f16220h = function02;
                this.f16221i = function03;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b */
            public final IntRange invoke() {
                return C33613Io2.m101702b(this.f16219g.invoke().intValue(), this.f16220h.invoke().intValue(), this.f16221i.invoke().intValue());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Io2$a$b */
        /* loaded from: classes.dex */
        public static final class C3759b implements InterfaceC33198Gu1<IntRange> {

            /* renamed from: b */
            public final /* synthetic */ EX2<IntRange> f16222b;

            public C3759b(EX2<IntRange> ex2) {
                this.f16222b = ex2;
            }

            @Override // p000.InterfaceC33198Gu1
            /* renamed from: c */
            public final Object emit(IntRange intRange, Continuation<? super Unit> continuation) {
                this.f16222b.setValue(intRange);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3757a(Function0<Integer> function0, Function0<Integer> function02, Function0<Integer> function03, EX2<IntRange> ex2, Continuation<? super C3757a> continuation) {
            super(2, continuation);
            this.f16215i = function0;
            this.f16216j = function02;
            this.f16217k = function03;
            this.f16218l = ex2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C3757a(this.f16215i, this.f16216j, this.f16217k, this.f16218l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C3757a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f16214h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC32730Eu1 m105192o = GM5.m105192o(new C3758a(this.f16215i, this.f16216j, this.f16217k));
                C3759b c3759b = new C3759b(this.f16218l);
                this.f16214h = 1;
                if (m105192o.collect(c3759b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: b */
    public static final IntRange m101702b(int i, int i2, int i3) {
        IntRange until;
        int i4 = (i / i2) * i2;
        until = RangesKt___RangesKt.until(Math.max(i4 - i3, 0), i4 + i2 + i3);
        return until;
    }

    /* renamed from: c */
    public static final InterfaceC48627sP5<IntRange> m101701c(Function0<Integer> firstVisibleItemIndex, Function0<Integer> slidingWindowSize, Function0<Integer> extraItemCount, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Object m97025e;
        Intrinsics.checkNotNullParameter(firstVisibleItemIndex, "firstVisibleItemIndex");
        Intrinsics.checkNotNullParameter(slidingWindowSize, "slidingWindowSize");
        Intrinsics.checkNotNullParameter(extraItemCount, "extraItemCount");
        interfaceC32720Et0.mo89638F(429733345);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(429733345, i, -1, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)");
        }
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(firstVisibleItemIndex) | interfaceC32720Et0.mo89539n(slidingWindowSize) | interfaceC32720Et0.mo89539n(extraItemCount);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            AbstractC48600sM5 m14281a = AbstractC48600sM5.f108670e.m14281a();
            try {
                AbstractC48600sM5 m14295k = m14281a.m14295k();
                m97025e = LM5.m97025e(m101702b(firstVisibleItemIndex.invoke().intValue(), slidingWindowSize.invoke().intValue(), extraItemCount.invoke().intValue()), null, 2, null);
                m14281a.m14288r(m14295k);
                m14281a.mo1848d();
                interfaceC32720Et0.mo89503z(m97025e);
                mo89635G = m97025e;
            } catch (Throwable th) {
                m14281a.mo1848d();
                throw th;
            }
        }
        interfaceC32720Et0.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        Object[] objArr = {firstVisibleItemIndex, slidingWindowSize, extraItemCount, ex2};
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            z |= interfaceC32720Et0.mo89539n(objArr[i2]);
        }
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        if (z || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G2 = new C3757a(firstVisibleItemIndex, slidingWindowSize, extraItemCount, ex2, null);
            interfaceC32720Et0.mo89503z(mo89635G2);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75533f(ex2, (Function2) mo89635G2, interfaceC32720Et0, 64);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return ex2;
    }
}
