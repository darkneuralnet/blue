package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J)\u0010\u0012\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LLh0;", "S", "T", "LHh0;", "LGu1;", "collector", "", "p", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ln74;", Action.SCOPE_ATTRIBUTE, "g", "(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "newContext", "o", "(LGu1;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEu1;", "e", "LEu1;", "flow", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "<init>", "(LEu1;Lkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Lh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC34250Lh0<S, T> extends AbstractC33314Hh0<T> {
    @JvmField

    /* renamed from: e */
    public final InterfaceC32730Eu1<S> f21930e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m28432d2 = {"S", "T", "LGu1;", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m28418f = "ChannelFlow.kt", m28417i = {}, m28416l = {SyslogConstants.LOG_LOCAL3}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Lh0$a */
    /* loaded from: classes8.dex */
    public static final class C5064a extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f21931h;

        /* renamed from: i */
        public /* synthetic */ Object f21932i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC34250Lh0<S, T> f21933j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5064a(AbstractC34250Lh0<S, T> abstractC34250Lh0, Continuation<? super C5064a> continuation) {
            super(2, continuation);
            this.f21933j = abstractC34250Lh0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C5064a c5064a = new C5064a(this.f21933j, continuation);
            c5064a.f21932i = obj;
            return c5064a;
        }

        public final Object invoke(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C5064a) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21931h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC34250Lh0<S, T> abstractC34250Lh0 = this.f21933j;
                this.f21931h = 1;
                if (abstractC34250Lh0.mo93574p((InterfaceC33198Gu1) this.f21932i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((InterfaceC33198Gu1) ((InterfaceC33198Gu1) obj), continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC34250Lh0(InterfaceC32730Eu1<? extends S> interfaceC32730Eu1, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        super(coroutineContext, i, enumC43674k30);
        this.f21930e = interfaceC32730Eu1;
    }

    /* renamed from: m */
    public static /* synthetic */ Object m96436m(AbstractC34250Lh0 abstractC34250Lh0, InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        if (abstractC34250Lh0.f13761c == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext plus = context.plus(abstractC34250Lh0.f13760b);
            if (Intrinsics.areEqual(plus, context)) {
                Object mo93574p = abstractC34250Lh0.mo93574p(interfaceC33198Gu1, continuation);
                coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (mo93574p == coroutine_suspended3) {
                    return mo93574p;
                }
                return Unit.INSTANCE;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(plus.get(key), context.get(key))) {
                Object m96434o = abstractC34250Lh0.m96434o(interfaceC33198Gu1, plus, continuation);
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (m96434o == coroutine_suspended2) {
                    return m96434o;
                }
                return Unit.INSTANCE;
            }
        }
        Object collect = super.collect(interfaceC33198Gu1, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (collect == coroutine_suspended) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m96435n(AbstractC34250Lh0 abstractC34250Lh0, InterfaceC45497n74 interfaceC45497n74, Continuation continuation) {
        Object coroutine_suspended;
        Object mo93574p = abstractC34250Lh0.mo93574p(new C32248Cs5(interfaceC45497n74), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mo93574p == coroutine_suspended ? mo93574p : Unit.INSTANCE;
    }

    @Override // p000.AbstractC33314Hh0, p000.InterfaceC32730Eu1
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
        return m96436m(this, interfaceC33198Gu1, continuation);
    }

    @Override // p000.AbstractC33314Hh0
    /* renamed from: g */
    public Object mo96437g(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
        return m96435n(this, interfaceC45497n74, continuation);
    }

    /* renamed from: o */
    public final Object m96434o(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m100023c = C33782Jh0.m100023c(coroutineContext, C33782Jh0.m100025a(interfaceC33198Gu1, continuation.getContext()), null, new C5064a(this, null), continuation, 4, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m100023c == coroutine_suspended) {
            return m100023c;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public abstract Object mo93574p(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<? super Unit> continuation);

    @Override // p000.AbstractC33314Hh0
    public String toString() {
        return this.f21930e + " -> " + super.toString();
    }
}
