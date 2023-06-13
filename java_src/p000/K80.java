package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BW\u0012-\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014R>\u0010\u0016\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010¢\u0006\u0002\b\u00138\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LK80;", "T", "LIh0;", "Ln74;", Action.SCOPE_ATTRIBUTE, "", "g", "(Ln74;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lk30;", "onBufferOverflow", "LHh0;", "h", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "f", "Lkotlin/jvm/functions/Function2;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: K80 */
/* loaded from: classes8.dex */
public final class K80<T> extends C33548Ih0<T> {

    /* renamed from: f */
    public final Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> f19151f;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m28418f = "Builders.kt", m28417i = {0}, m28416l = {336}, m28415m = "collectTo", m28414n = {Action.SCOPE_ATTRIBUTE}, m28413s = {"L$0"})
    /* renamed from: K80$a */
    /* loaded from: classes8.dex */
    public static final class C4356a extends ContinuationImpl {

        /* renamed from: h */
        public Object f19152h;

        /* renamed from: i */
        public /* synthetic */ Object f19153i;

        /* renamed from: j */
        public final /* synthetic */ K80<T> f19154j;

        /* renamed from: k */
        public int f19155k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4356a(K80<T> k80, Continuation<? super C4356a> continuation) {
            super(continuation);
            this.f19154j = k80;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19153i = obj;
            this.f19155k |= Integer.MIN_VALUE;
            return this.f19154j.mo96437g(null, this);
        }
    }

    public /* synthetic */ K80(Function2 function2, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC43674k30.SUSPEND : enumC43674k30);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // p000.C33548Ih0, p000.AbstractC33314Hh0
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo96437g(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
        C4356a c4356a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C4356a) {
            c4356a = (C4356a) continuation;
            int i2 = c4356a.f19155k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4356a.f19155k = i2 - Integer.MIN_VALUE;
                Object obj = c4356a.f19153i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4356a.f19155k;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC45497n74 = (InterfaceC45497n74) c4356a.f19152h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    c4356a.f19152h = interfaceC45497n74;
                    c4356a.f19155k = 1;
                    if (super.mo96437g(interfaceC45497n74, c4356a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (!interfaceC45497n74.mo2353A()) {
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        c4356a = new C4356a(this, continuation);
        Object obj2 = c4356a.f19153i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4356a.f19155k;
        if (i == 0) {
        }
        if (!interfaceC45497n74.mo2353A()) {
        }
    }

    @Override // p000.C33548Ih0, p000.AbstractC33314Hh0
    /* renamed from: h */
    public AbstractC33314Hh0<T> mo93575h(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return new K80(this.f19151f, coroutineContext, i, enumC43674k30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public K80(Function2<? super InterfaceC45497n74<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        super(function2, coroutineContext, i, enumC43674k30);
        this.f19151f = function2;
    }
}
