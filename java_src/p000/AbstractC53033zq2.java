package p000;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11734m;
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
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\t\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ;\u0010\u000b\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ;\u0010\f\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0010\u001a\u00020\r8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"Lzq2;", "LZC0;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lzh2;", "b", "(Lkotlin/jvm/functions/Function2;)Lzh2;", "e", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/f;", C17296a.f69688o, "()Landroidx/lifecycle/f;", "lifecycle", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53033zq2 implements ZC0 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m28418f = "Lifecycle.kt", m28417i = {}, m28416l = {337}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: zq2$a */
    /* loaded from: classes.dex */
    public static final class C31520a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f122304h;

        /* renamed from: j */
        public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f122306j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31520a(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C31520a> continuation) {
            super(2, continuation);
            this.f122306j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31520a(this.f122306j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C31520a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f122304h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC11719f mo390a = AbstractC53033zq2.this.mo390a();
                Function2<ZC0, Continuation<? super Unit>, Object> function2 = this.f122306j;
                this.f122304h = 1;
                if (C11734m.m66983a(mo390a, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m28418f = "Lifecycle.kt", m28417i = {}, m28416l = {375}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: zq2$b */
    /* loaded from: classes.dex */
    public static final class C31521b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f122307h;

        /* renamed from: j */
        public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f122309j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31521b(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C31521b> continuation) {
            super(2, continuation);
            this.f122309j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31521b(this.f122309j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C31521b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f122307h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC11719f mo390a = AbstractC53033zq2.this.mo390a();
                Function2<ZC0, Continuation<? super Unit>, Object> function2 = this.f122309j;
                this.f122307h = 1;
                if (C11734m.m66981c(mo390a, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m28418f = "Lifecycle.kt", m28417i = {}, m28416l = {356}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: zq2$c */
    /* loaded from: classes.dex */
    public static final class C31522c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f122310h;

        /* renamed from: j */
        public final /* synthetic */ Function2<ZC0, Continuation<? super Unit>, Object> f122312j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31522c(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C31522c> continuation) {
            super(2, continuation);
            this.f122312j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31522c(this.f122312j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C31522c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f122310h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC11719f mo390a = AbstractC53033zq2.this.mo390a();
                Function2<ZC0, Continuation<? super Unit>, Object> function2 = this.f122312j;
                this.f122310h = 1;
                if (C11734m.m66980d(mo390a, function2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public abstract AbstractC11719f mo390a();

    @Deprecated(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    /* renamed from: b */
    public final InterfaceC52943zh2 m389b(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(block, "block");
        m73800d = Z30.m73800d(this, null, null, new C31520a(block, null), 3, null);
        return m73800d;
    }

    @Deprecated(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    /* renamed from: d */
    public final InterfaceC52943zh2 m388d(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(block, "block");
        m73800d = Z30.m73800d(this, null, null, new C31521b(block, null), 3, null);
        return m73800d;
    }

    @Deprecated(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    /* renamed from: e */
    public final InterfaceC52943zh2 m387e(Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> block) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(block, "block");
        m73800d = Z30.m73800d(this, null, null, new C31522c(block, null), 3, null);
        return m73800d;
    }
}
