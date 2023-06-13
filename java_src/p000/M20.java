package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.IV2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0019\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m28432d2 = {"LM20;", "LIV2;", "", "timeNanos", "", "v", "R", "Lkotlin/Function1;", "onFrame", "m", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "s", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "onNewAwaiters", "", "c", "Ljava/lang/Object;", "lock", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Throwable;", "failureCause", "", "LM20$a;", "e", "Ljava/util/List;", "awaiters", "f", "spareList", "", "t", "()Z", "hasAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n70#2:133\n70#2:134\n70#2:144\n70#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
/* renamed from: M20 */
/* loaded from: classes.dex */
public final class M20 implements IV2 {

    /* renamed from: b */
    public final Function0<Unit> f22461b;

    /* renamed from: c */
    public final Object f22462c;

    /* renamed from: d */
    public Throwable f22463d;

    /* renamed from: e */
    public List<C5156a<?>> f22464e;

    /* renamed from: f */
    public List<C5156a<?>> f22465f;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LM20$a;", "R", "", "", "timeNanos", "", "b", "Lkotlin/Function1;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "onFrame", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/Continuation;", "()Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    /* renamed from: M20$a */
    /* loaded from: classes.dex */
    public static final class C5156a<R> {

        /* renamed from: a */
        public final Function1<Long, R> f22466a;

        /* renamed from: b */
        public final Continuation<R> f22467b;

        /* JADX WARN: Multi-variable type inference failed */
        public C5156a(Function1<? super Long, ? extends R> onFrame, Continuation<? super R> continuation) {
            Intrinsics.checkNotNullParameter(onFrame, "onFrame");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f22466a = onFrame;
            this.f22467b = continuation;
        }

        /* renamed from: a */
        public final Continuation<R> m95990a() {
            return this.f22467b;
        }

        /* renamed from: b */
        public final void m95989b(long j) {
            Object m116783constructorimpl;
            Continuation<R> continuation = this.f22467b;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(this.f22466a.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            continuation.resumeWith(m116783constructorimpl);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,132:1\n70#2:133\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n94#1:133\n*E\n"})
    /* renamed from: M20$b */
    /* loaded from: classes.dex */
    public static final class C5157b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<C5156a<R>> f22469h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5157b(Ref.ObjectRef<C5156a<R>> objectRef) {
            super(1);
            this.f22469h = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C5156a c5156a;
            Object obj = M20.this.f22462c;
            M20 m20 = M20.this;
            Ref.ObjectRef<C5156a<R>> objectRef = this.f22469h;
            synchronized (obj) {
                List list = m20.f22464e;
                Object obj2 = objectRef.element;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    c5156a = null;
                } else {
                    c5156a = (C5156a) obj2;
                }
                list.remove(c5156a);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public M20() {
        this(null, 1, null);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) IV2.C3691a.m101973a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) IV2.C3691a.m101972b(this, key);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, M20$a] */
    @Override // p000.IV2
    /* renamed from: m */
    public <R> Object mo40754m(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        Continuation intercepted;
        boolean z;
        C5156a c5156a;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.f22462c) {
            Throwable th = this.f22463d;
            if (th != null) {
                Result.Companion companion = Result.Companion;
                c37013Xc0.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
            } else {
                objectRef.element = new C5156a(function1, c37013Xc0);
                if (!this.f22464e.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List list = this.f22464e;
                Object obj = objectRef.element;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    c5156a = null;
                } else {
                    c5156a = (C5156a) obj;
                }
                list.add(c5156a);
                boolean z2 = !z;
                c37013Xc0.mo76794H(new C5157b(objectRef));
                if (z2 && this.f22461b != null) {
                    try {
                        this.f22461b.invoke();
                    } catch (Throwable th2) {
                        m95993s(th2);
                    }
                }
            }
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

    /* renamed from: s */
    public final void m95993s(Throwable th) {
        synchronized (this.f22462c) {
            if (this.f22463d != null) {
                return;
            }
            this.f22463d = th;
            List<C5156a<?>> list = this.f22464e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Continuation<?> m95990a = list.get(i).m95990a();
                Result.Companion companion = Result.Companion;
                m95990a.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(th)));
            }
            this.f22464e.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: t */
    public final boolean m95992t() {
        boolean z;
        synchronized (this.f22462c) {
            z = !this.f22464e.isEmpty();
        }
        return z;
    }

    /* renamed from: v */
    public final void m95991v(long j) {
        synchronized (this.f22462c) {
            List<C5156a<?>> list = this.f22464e;
            this.f22464e = this.f22465f;
            this.f22465f = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).m95989b(j);
            }
            list.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public M20(Function0<Unit> function0) {
        this.f22461b = function0;
        this.f22462c = new Object();
        this.f22464e = new ArrayList();
        this.f22465f = new ArrayList();
    }

    public /* synthetic */ M20(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }
}
