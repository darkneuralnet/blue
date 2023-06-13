package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Lzq2;", "Landroidx/lifecycle/i;", "", "f", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "onStateChanged", "Landroidx/lifecycle/f;", "b", "Landroidx/lifecycle/f;", C17296a.f69688o, "()Landroidx/lifecycle/f;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "c", "Lkotlin/coroutines/CoroutineContext;", "K", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/f;Lkotlin/coroutines/CoroutineContext;)V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC53033zq2 implements InterfaceC11728i {

    /* renamed from: b */
    public final AbstractC11719f f54838b;

    /* renamed from: c */
    public final CoroutineContext f54839c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m28418f = "Lifecycle.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* loaded from: classes.dex */
    public static final class C11701a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f54840h;

        /* renamed from: i */
        public /* synthetic */ Object f54841i;

        public C11701a(Continuation<? super C11701a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11701a c11701a = new C11701a(continuation);
            c11701a.f54841i = obj;
            return c11701a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C11701a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f54840h == 0) {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f54841i;
                if (LifecycleCoroutineScopeImpl.this.mo390a().mo67007b().compareTo(AbstractC11719f.EnumC11724b.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl.this.mo390a().mo67008a(LifecycleCoroutineScopeImpl.this);
                } else {
                    C34486Mh2.m95041f(zc0.mo18342K(), null, 1, null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(AbstractC11719f lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f54838b = lifecycle;
        this.f54839c = coroutineContext;
        if (mo390a().mo67007b() == AbstractC11719f.EnumC11724b.DESTROYED) {
            C34486Mh2.m95041f(mo18342K(), null, 1, null);
        }
    }

    @Override // p000.ZC0
    /* renamed from: K */
    public CoroutineContext mo18342K() {
        return this.f54839c;
    }

    @Override // p000.AbstractC53033zq2
    /* renamed from: a */
    public AbstractC11719f mo390a() {
        return this.f54838b;
    }

    /* renamed from: f */
    public final void m67045f() {
        Z30.m73800d(this, T41.m84376c().mo14156G(), null, new C11701a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (mo390a().mo67007b().compareTo(AbstractC11719f.EnumC11724b.DESTROYED) <= 0) {
            mo390a().mo67006d(this);
            C34486Mh2.m95041f(mo18342K(), null, 1, null);
        }
    }
}
