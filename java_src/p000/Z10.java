package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
import p000.TC0;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"LZ10;", "LZC0;", "", "startDelayInMs", "Lkotlin/coroutines/CoroutineContext;", "specificContext", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lzh2;", C17296a.f69688o, "(Ljava/lang/Number;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)Lzh2;", "LTC0;", "c", "LTC0;", "exceptionHandler", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "K", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Z10 */
/* loaded from: classes2.dex */
public final class Z10 implements ZC0 {

    /* renamed from: b */
    public static final Z10 f47750b = new Z10();

    /* renamed from: c */
    public static final TC0 f47751c;

    /* renamed from: d */
    public static final CoroutineContext f47752d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Z10$a */
    /* loaded from: classes2.dex */
    public static final class C10098a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f47753g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10098a(Throwable th) {
            super(0);
            this.f47753g = th;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Child job of BrazeCoroutineScope got exception: ", this.f47753g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.coroutine.BrazeCoroutineScope$launchDelayed$1", m28418f = "BrazeCoroutineScope.kt", m28417i = {}, m28416l = {51, 52}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Z10$b */
    /* loaded from: classes2.dex */
    public static final class C10099b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f47754h;

        /* renamed from: i */
        public final /* synthetic */ Number f47755i;

        /* renamed from: j */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f47756j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10099b(Number number, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C10099b> continuation) {
            super(2, continuation);
            this.f47755i = number;
            this.f47756j = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C10099b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10099b(this.f47755i, this.f47756j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f47754h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                long longValue = this.f47755i.longValue();
                this.f47754h = 1;
                if (C48120rZ0.m15768a(longValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Function1<Continuation<? super Unit>, Object> function1 = this.f47756j;
            this.f47754h = 2;
            if (function1.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, m28432d2 = {"Z10$c", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "LTC0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "u", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Z10$c */
    /* loaded from: classes2.dex */
    public static final class C10100c extends AbstractCoroutineContextElement implements TC0 {
        public C10100c(TC0.C7679a c7679a) {
            super(c7679a);
        }

        @Override // p000.TC0
        /* renamed from: u */
        public void mo3742u(CoroutineContext coroutineContext, Throwable th) {
            C43664k20.m29442e(C43664k20.f93782a, Z10.f47750b, C43664k20.EnumC25082a.E, th, false, new C10098a(th), 4, null);
        }
    }

    static {
        C10100c c10100c = new C10100c(TC0.f34895N);
        f47751c = c10100c;
        f47752d = T41.m84377b().plus(c10100c).plus(XU5.m76946b(null, 1, null));
    }

    private Z10() {
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC52943zh2 m73846b(Z10 z10, Number number, CoroutineContext coroutineContext, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = z10.mo18342K();
        }
        return z10.m73847a(number, coroutineContext, function1);
    }

    @Override // p000.ZC0
    /* renamed from: K */
    public CoroutineContext mo18342K() {
        return f47752d;
    }

    /* renamed from: a */
    public final InterfaceC52943zh2 m73847a(Number startDelayInMs, CoroutineContext specificContext, Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(startDelayInMs, "startDelayInMs");
        Intrinsics.checkNotNullParameter(specificContext, "specificContext");
        Intrinsics.checkNotNullParameter(block, "block");
        m73800d = Z30.m73800d(this, specificContext, null, new C10099b(startDelayInMs, block, null), 2, null);
        return m73800d;
    }
}
