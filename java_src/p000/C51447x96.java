package p000;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00010\u0005\u001af\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00028\u00012'\u0010\t\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0005¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"T1", "R", "LtP5;", "LZC0;", Action.SCOPE_ATTRIBUTE, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", C17296a.f69688o, "transform", "LTy5;", "b", "initial", "LEu1;", "(LtP5;LZC0;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)LTy5;", "coroutine_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransformedSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedSharedFlow.kt\nco/bird/android/lib/coroutine/TransformedSharedFlowKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,67:1\n190#2:68\n*S KotlinDebug\n*F\n+ 1 TransformedSharedFlow.kt\nco/bird/android/lib/coroutine/TransformedSharedFlowKt\n*L\n63#1:68\n*E\n"})
/* renamed from: x96  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51447x96 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "R", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedSharedFlowKt$flatMapShared$$inlined$flatMapLatest$1", m28418f = "TransformedSharedFlow.kt", m28417i = {}, m28416l = {190}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 TransformedSharedFlow.kt\nco/bird/android/lib/coroutine/TransformedSharedFlowKt\n*L\n1#1,215:1\n63#2:216\n*E\n"})
    /* renamed from: x96$a */
    /* loaded from: classes3.dex */
    public static final class C30053a extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super R>, T1, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117145h;

        /* renamed from: i */
        public /* synthetic */ Object f117146i;

        /* renamed from: j */
        public /* synthetic */ Object f117147j;

        /* renamed from: k */
        public final /* synthetic */ Function1 f117148k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30053a(Continuation continuation, Function1 function1) {
            super(3, continuation);
            this.f117148k = function1;
        }

        public final Object invoke(InterfaceC33198Gu1<? super R> interfaceC33198Gu1, T1 t1, Continuation<? super Unit> continuation) {
            C30053a c30053a = new C30053a(continuation, this.f117148k);
            c30053a.f117146i = interfaceC33198Gu1;
            c30053a.f117147j = t1;
            return c30053a.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117145h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f117147j;
                this.f117145h = 1;
                if (C36708Vu1.m79252s((InterfaceC33198Gu1) this.f117146i, (InterfaceC32730Eu1) this.f117148k.invoke(obj2), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return invoke((InterfaceC33198Gu1) obj, (InterfaceC33198Gu1) obj2, continuation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T1", "R", C17296a.f69688o, "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "co.bird.android.lib.coroutine.TransformedSharedFlowKt$mapShared$1", m28418f = "TransformedSharedFlow.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: x96$b */
    /* loaded from: classes3.dex */
    public static final class C30054b extends SuspendLambda implements Function2<T1, Continuation<? super R>, Object> {

        /* renamed from: h */
        public int f117149h;

        /* renamed from: i */
        public /* synthetic */ Object f117150i;

        /* renamed from: j */
        public final /* synthetic */ Function1<T1, R> f117151j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30054b(Function1<? super T1, ? extends R> function1, Continuation<? super C30054b> continuation) {
            super(2, continuation);
            this.f117151j = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30054b c30054b = new C30054b(this.f117151j, continuation);
            c30054b.f117150i = obj;
            return c30054b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T1 t1, Continuation<? super R> continuation) {
            return ((C30054b) create(t1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117149h == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f117151j.invoke(this.f117150i);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final <T1, R> InterfaceC36280Ty5<R> m5768a(InterfaceC49220tP5<? extends T1> interfaceC49220tP5, ZC0 zc0, R r, Function1<? super T1, ? extends InterfaceC32730Eu1<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(interfaceC49220tP5, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C50854w96(r, C36708Vu1.m79271Q(interfaceC49220tP5, new C30053a(null, transform)), zc0);
    }

    /* renamed from: b */
    public static final <T1, R> InterfaceC36280Ty5<R> m5767b(InterfaceC49220tP5<? extends T1> interfaceC49220tP5, ZC0 zc0, Function1<? super T1, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(interfaceC49220tP5, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C50854w96(transform.invoke((T1) interfaceC49220tP5.getValue()), C36708Vu1.m79278J(interfaceC49220tP5, new C30054b(transform, null)), zc0);
    }

    public static /* synthetic */ InterfaceC36280Ty5 flatMapShared$default(InterfaceC49220tP5 interfaceC49220tP5, ZC0 zc0, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            zc0 = null;
        }
        return m5768a(interfaceC49220tP5, zc0, obj, function1);
    }

    public static /* synthetic */ InterfaceC36280Ty5 mapShared$default(InterfaceC49220tP5 interfaceC49220tP5, ZC0 zc0, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            zc0 = null;
        }
        return m5767b(interfaceC49220tP5, zc0, function1);
    }
}
