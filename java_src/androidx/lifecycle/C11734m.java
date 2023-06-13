package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u000b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aF\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\t\u001aN\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000f2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"T", "Landroidx/lifecycle/f;", "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", C17296a.f69688o, "(Landroidx/lifecycle/f;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "LLifecycleOwner;", "b", "(LLifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Landroidx/lifecycle/f$b;", "minState", "e", "(Landroidx/lifecycle/f;Landroidx/lifecycle/f$b;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class C11734m {

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m28418f = "PausingDispatcher.kt", m28417i = {0}, m28416l = {203}, m28415m = "invokeSuspend", m28414n = {"controller"}, m28413s = {"L$0"})
    /* renamed from: androidx.lifecycle.m$a */
    /* loaded from: classes.dex */
    public static final class C11735a extends SuspendLambda implements Function2<ZC0, Continuation<? super T>, Object> {

        /* renamed from: h */
        public int f54938h;

        /* renamed from: i */
        public /* synthetic */ Object f54939i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC11719f f54940j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC11719f.EnumC11724b f54941k;

        /* renamed from: l */
        public final /* synthetic */ Function2<ZC0, Continuation<? super T>, Object> f54942l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11735a(AbstractC11719f abstractC11719f, AbstractC11719f.EnumC11724b enumC11724b, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C11735a> continuation) {
            super(2, continuation);
            this.f54940j = abstractC11719f;
            this.f54941k = enumC11724b;
            this.f54942l = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11735a c11735a = new C11735a(this.f54940j, this.f54941k, this.f54942l, continuation);
            c11735a.f54939i = obj;
            return c11735a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super T> continuation) {
            return ((C11735a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C11725g c11725g;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f54938h;
            if (i != 0) {
                if (i == 1) {
                    c11725g = (C11725g) this.f54939i;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        c11725g.m67011b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC52943zh2 interfaceC52943zh2 = (InterfaceC52943zh2) ((ZC0) this.f54939i).mo18342K().get(InterfaceC52943zh2.f122077a0);
                if (interfaceC52943zh2 != null) {
                    C38492bL3 c38492bL3 = new C38492bL3();
                    C11725g c11725g2 = new C11725g(this.f54940j, this.f54941k, c38492bL3.f57297c, interfaceC52943zh2);
                    try {
                        Function2<ZC0, Continuation<? super T>, Object> function2 = this.f54942l;
                        this.f54939i = c11725g2;
                        this.f54938h = 1;
                        obj = X30.m77504g(c38492bL3, function2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c11725g = c11725g2;
                    } catch (Throwable th2) {
                        th = th2;
                        c11725g = c11725g2;
                        c11725g.m67011b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            }
            c11725g.m67011b();
            return obj;
        }
    }

    @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    /* renamed from: a */
    public static final <T> Object m66983a(AbstractC11719f abstractC11719f, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return m66979e(abstractC11719f, AbstractC11719f.EnumC11724b.CREATED, function2, continuation);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    /* renamed from: b */
    public static final <T> Object m66982b(LifecycleOwner lifecycleOwner, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return m66981c(lifecycleOwner.getLifecycle(), function2, continuation);
    }

    @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    /* renamed from: c */
    public static final <T> Object m66981c(AbstractC11719f abstractC11719f, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return m66979e(abstractC11719f, AbstractC11719f.EnumC11724b.RESUMED, function2, continuation);
    }

    @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    /* renamed from: d */
    public static final <T> Object m66980d(AbstractC11719f abstractC11719f, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return m66979e(abstractC11719f, AbstractC11719f.EnumC11724b.STARTED, function2, continuation);
    }

    @Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    /* renamed from: e */
    public static final <T> Object m66979e(AbstractC11719f abstractC11719f, AbstractC11719f.EnumC11724b enumC11724b, Function2<? super ZC0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return X30.m77504g(T41.m84376c().mo14156G(), new C11735a(abstractC11719f, enumC11724b, function2, null), continuation);
    }
}
