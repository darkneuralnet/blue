package p000;

import android.view.Choreographer;
import androidx.compose.p003ui.platform.C11426i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.IV2;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"LZd;", "LIV2;", "R", "Lkotlin/Function1;", "", "onFrame", "m", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "b", "Landroid/view/Choreographer;", "e", "()Landroid/view/Choreographer;", "choreographer", "<init>", "(Landroid/view/Choreographer;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,53:1\n314#2,11:54\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n31#1:54,11\n*E\n"})
/* renamed from: Zd */
/* loaded from: classes.dex */
public final class C10299Zd implements IV2 {

    /* renamed from: b */
    public final Choreographer f48842b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zd$a */
    /* loaded from: classes.dex */
    public static final class C10300a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C11426i f48843g;

        /* renamed from: h */
        public final /* synthetic */ Choreographer.FrameCallback f48844h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10300a(C11426i c11426i, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f48843g = c11426i;
            this.f48844h = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f48843g.m68296k0(this.f48844h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zd$b */
    /* loaded from: classes.dex */
    public static final class C10301b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Choreographer.FrameCallback f48846h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10301b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f48846h = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C10299Zd.this.m72847e().removeFrameCallback(this.f48846h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "R", "frameTimeNanos", "", "doFrame"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    /* renamed from: Zd$c */
    /* loaded from: classes.dex */
    public static final class Choreographer$FrameCallbackC10302c implements Choreographer.FrameCallback {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC36779Wc0<R> f48847b;

        /* renamed from: c */
        public final /* synthetic */ C10299Zd f48848c;

        /* renamed from: d */
        public final /* synthetic */ Function1<Long, R> f48849d;

        /* JADX WARN: Multi-variable type inference failed */
        public Choreographer$FrameCallbackC10302c(InterfaceC36779Wc0<? super R> interfaceC36779Wc0, C10299Zd c10299Zd, Function1<? super Long, ? extends R> function1) {
            this.f48847b = interfaceC36779Wc0;
            this.f48848c = c10299Zd;
            this.f48849d = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object m116783constructorimpl;
            Continuation continuation = this.f48847b;
            Function1<Long, R> function1 = this.f48849d;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(function1.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            continuation.resumeWith(m116783constructorimpl);
        }
    }

    public C10299Zd(Choreographer choreographer) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.f48842b = choreographer;
    }

    /* renamed from: e */
    public final Choreographer m72847e() {
        return this.f48842b;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) IV2.C3691a.m101973a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) IV2.C3691a.m101972b(this, key);
    }

    @Override // p000.IV2
    /* renamed from: m */
    public <R> Object mo40754m(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        C11426i c11426i;
        Continuation intercepted;
        Object coroutine_suspended;
        CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.Key);
        if (element instanceof C11426i) {
            c11426i = (C11426i) element;
        } else {
            c11426i = null;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        Choreographer$FrameCallbackC10302c choreographer$FrameCallbackC10302c = new Choreographer$FrameCallbackC10302c(c37013Xc0, this, function1);
        if (c11426i != null && Intrinsics.areEqual(c11426i.m68302b0(), m72847e())) {
            c11426i.m68297j0(choreographer$FrameCallbackC10302c);
            c37013Xc0.mo76794H(new C10300a(c11426i, choreographer$FrameCallbackC10302c));
        } else {
            m72847e().postFrameCallback(choreographer$FrameCallbackC10302c);
            c37013Xc0.mo76794H(new C10301b(choreographer$FrameCallbackC10302c));
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m76770q;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return IV2.C3691a.m101971c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return IV2.C3691a.m101970d(this, coroutineContext);
    }
}
