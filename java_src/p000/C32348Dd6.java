package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"LDd6;", "T", "LGu1;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "", "c", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/jvm/functions/Function2;", "emitRef", "downstream", "<init>", "(LGu1;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Dd6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32348Dd6<T> implements InterfaceC33198Gu1<T> {

    /* renamed from: b */
    public final CoroutineContext f6110b;

    /* renamed from: c */
    public final Object f6111c;

    /* renamed from: d */
    public final Function2<T, Continuation<? super Unit>, Object> f6112d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m28418f = "ChannelFlow.kt", m28417i = {}, m28416l = {212}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Dd6$a */
    /* loaded from: classes8.dex */
    public static final class C1575a extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f6113h;

        /* renamed from: i */
        public /* synthetic */ Object f6114i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC33198Gu1<T> f6115j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1575a(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super C1575a> continuation) {
            super(2, continuation);
            this.f6115j = interfaceC33198Gu1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1575a c1575a = new C1575a(this.f6115j, continuation);
            c1575a.f6114i = obj;
            return c1575a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(T t, Continuation<? super Unit> continuation) {
            return ((C1575a) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6113h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f6114i;
                this.f6113h = 1;
                if (this.f6115j.emit(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public C32348Dd6(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, CoroutineContext coroutineContext) {
        this.f6110b = coroutineContext;
        this.f6111c = C50794w36.m7522b(coroutineContext);
        this.f6112d = new C1575a(interfaceC33198Gu1, null);
    }

    @Override // p000.InterfaceC33198Gu1
    public Object emit(T t, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m100024b = C33782Jh0.m100024b(this.f6110b, t, this.f6111c, this.f6112d, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m100024b == coroutine_suspended ? m100024b : Unit.INSTANCE;
    }
}
