package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aª\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152-\b\u0002\u0010\u001d\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\u0004\u0018\u0001`\u001c2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Ln74;", "Lkotlin/Function0;", "", "block", C17296a.f69688o, "(Ln74;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "LZC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lks4;", "c", "(LZC0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lks4;", "Lk30;", "onBufferOverflow", "LbD0;", "start", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "b", "(LZC0;Lkotlin/coroutines/CoroutineContext;ILk30;LbD0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lks4;", "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: j74 */
/* loaded from: classes8.dex */
public final class C43125j74 {

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.channels.ProduceKt", m28418f = "Produce.kt", m28417i = {0, 0}, m28416l = {153}, m28415m = "awaitClose", m28414n = {"$this$awaitClose", "block"}, m28413s = {"L$0", "L$1"})
    /* renamed from: j74$a */
    /* loaded from: classes8.dex */
    public static final class C24721a extends ContinuationImpl {

        /* renamed from: h */
        public Object f92183h;

        /* renamed from: i */
        public Object f92184i;

        /* renamed from: j */
        public /* synthetic */ Object f92185j;

        /* renamed from: k */
        public int f92186k;

        public C24721a(Continuation<? super C24721a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92185j = obj;
            this.f92186k |= Integer.MIN_VALUE;
            return C43125j74.m31072a(null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: j74$b */
    /* loaded from: classes8.dex */
    public static final class C24722b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC36779Wc0<Unit> f92187g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24722b(InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
            super(1);
            this.f92187g = interfaceC36779Wc0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th) {
            InterfaceC36779Wc0<Unit> interfaceC36779Wc0 = this.f92187g;
            Result.Companion companion = Result.Companion;
            interfaceC36779Wc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m31072a(InterfaceC45497n74<?> interfaceC45497n74, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        C24721a c24721a;
        Object coroutine_suspended;
        int i;
        boolean z;
        Continuation intercepted;
        Object coroutine_suspended2;
        try {
            if (continuation instanceof C24721a) {
                c24721a = (C24721a) continuation;
                int i2 = c24721a.f92186k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c24721a.f92186k = i2 - Integer.MIN_VALUE;
                    Object obj = c24721a.f92185j;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c24721a.f92186k;
                    if (i == 0) {
                        if (i == 1) {
                            function0 = (Function0) c24721a.f92184i;
                            InterfaceC45497n74 interfaceC45497n742 = (InterfaceC45497n74) c24721a.f92183h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        if (c24721a.getContext().get(InterfaceC52943zh2.f122077a0) == interfaceC45497n74) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            c24721a.f92183h = interfaceC45497n74;
                            c24721a.f92184i = function0;
                            c24721a.f92186k = 1;
                            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(c24721a);
                            C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
                            c37013Xc0.m76766u();
                            interfaceC45497n74.mo2350e(new C24722b(c37013Xc0));
                            Object m76770q = c37013Xc0.m76770q();
                            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (m76770q == coroutine_suspended2) {
                                DebugProbesKt.probeCoroutineSuspended(c24721a);
                            }
                            if (m76770q == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                        }
                    }
                    function0.invoke();
                    return Unit.INSTANCE;
                }
            }
            if (i == 0) {
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
        c24721a = new C24721a(continuation);
        Object obj2 = c24721a.f92185j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c24721a.f92186k;
    }

    /* renamed from: b */
    public static final <E> InterfaceC44162ks4<E> m31071b(ZC0 zc0, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30, EnumC38417bD0 enumC38417bD0, Function1<? super Throwable, Unit> function1, @BuilderInference Function2<? super InterfaceC45497n74<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C44904m74 c44904m74 = new C44904m74(RC0.m87211d(zc0, coroutineContext), C35186Ph0.m89918b(i, enumC43674k30, null, 4, null));
        if (function1 != null) {
            c44904m74.mo551n(function1);
        }
        c44904m74.m18338e1(enumC38417bD0, c44904m74, function2);
        return c44904m74;
    }

    /* renamed from: c */
    public static final <E> InterfaceC44162ks4<E> m31070c(ZC0 zc0, CoroutineContext coroutineContext, int i, @BuilderInference Function2<? super InterfaceC45497n74<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return m31071b(zc0, coroutineContext, i, EnumC43674k30.SUSPEND, EnumC38417bD0.DEFAULT, null, function2);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC44162ks4 m31069d(ZC0 zc0, CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30, EnumC38417bD0 enumC38417bD0, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC43674k30 = EnumC43674k30.SUSPEND;
        }
        EnumC43674k30 enumC43674k302 = enumC43674k30;
        if ((i2 & 8) != 0) {
            enumC38417bD0 = EnumC38417bD0.DEFAULT;
        }
        EnumC38417bD0 enumC38417bD02 = enumC38417bD0;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return m31071b(zc0, coroutineContext2, i3, enumC43674k302, enumC38417bD02, function1, function2);
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC44162ks4 m31068e(ZC0 zc0, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m31070c(zc0, coroutineContext, i, function2);
    }
}
