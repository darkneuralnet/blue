package androidx.compose.p003ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u00010\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006="}, m28432d2 = {"Landroidx/compose/ui/platform/i;", "LSC0;", "Landroid/view/Choreographer$FrameCallback;", "callback", "", "j0", "(Landroid/view/Choreographer$FrameCallback;)V", "k0", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "block", "y", "f0", "i0", "", "frameTimeNanos", "h0", "Landroid/view/Choreographer;", "c", "Landroid/view/Choreographer;", "b0", "()Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Handler;", "handler", "", "e", "Ljava/lang/Object;", "lock", "Lkotlin/collections/ArrayDeque;", "f", "Lkotlin/collections/ArrayDeque;", "toRunTrampolined", "", "g", "Ljava/util/List;", "toRunOnFrame", "h", "spareToRunOnFrame", "", "i", "Z", "scheduledTrampolineDispatch", "j", "scheduledFrameDispatch", "androidx/compose/ui/platform/i$d", "k", "Landroidx/compose/ui/platform/i$d;", "dispatchCallback", "LIV2;", "l", "LIV2;", "c0", "()LIV2;", "frameClock", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "m", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n34#2:193\n34#2:194\n34#2:195\n34#2:196\n34#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
/* renamed from: androidx.compose.ui.platform.i */
/* loaded from: classes.dex */
public final class C11426i extends SC0 {

    /* renamed from: m */
    public static final C11430c f53362m = new C11430c(null);

    /* renamed from: n */
    public static final int f53363n = 8;

    /* renamed from: o */
    public static final Lazy<CoroutineContext> f53364o;

    /* renamed from: p */
    public static final ThreadLocal<CoroutineContext> f53365p;

    /* renamed from: c */
    public final Choreographer f53366c;

    /* renamed from: d */
    public final Handler f53367d;

    /* renamed from: e */
    public final Object f53368e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f53369f;

    /* renamed from: g */
    public List<Choreographer.FrameCallback> f53370g;

    /* renamed from: h */
    public List<Choreographer.FrameCallback> f53371h;

    /* renamed from: i */
    public boolean f53372i;

    /* renamed from: j */
    public boolean f53373j;

    /* renamed from: k */
    public final Choreographer$FrameCallbackC11431d f53374k;

    /* renamed from: l */
    public final IV2 f53375l;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lkotlin/coroutines/CoroutineContext;", "b", "()Lkotlin/coroutines/CoroutineContext;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.i$a */
    /* loaded from: classes.dex */
    public static final class C11427a extends Lambda implements Function0<CoroutineContext> {

        /* renamed from: g */
        public static final C11427a f53376g = new C11427a();

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", m28418f = "AndroidUiDispatcher.android.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: androidx.compose.ui.platform.i$a$a */
        /* loaded from: classes.dex */
        public static final class C11428a extends SuspendLambda implements Function2<ZC0, Continuation<? super Choreographer>, Object> {

            /* renamed from: h */
            public int f53377h;

            public C11428a(Continuation<? super C11428a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11428a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Choreographer> continuation) {
                return ((C11428a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f53377h == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C11427a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final CoroutineContext invoke() {
            boolean m74804b;
            Choreographer choreographer;
            m74804b = C9822Yd.m74804b();
            if (m74804b) {
                choreographer = Choreographer.getInstance();
            } else {
                choreographer = (Choreographer) X30.m77506e(T41.m84376c(), new C11428a(null));
            }
            Intrinsics.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler m90563a = PE1.m90563a(Looper.getMainLooper());
            Intrinsics.checkNotNullExpressionValue(m90563a, "createAsync(Looper.getMainLooper())");
            C11426i c11426i = new C11426i(choreographer, m90563a, null);
            return c11426i.plus(c11426i.m68301c0());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, m28432d2 = {"androidx/compose/ui/platform/i$b", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$Companion$currentThread$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.i$b */
    /* loaded from: classes.dex */
    public static final class C11429b extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler m90563a = PE1.m90563a(myLooper);
                Intrinsics.checkNotNullExpressionValue(m90563a, "createAsync(\n           …d\")\n                    )");
                C11426i c11426i = new C11426i(choreographer, m90563a, null);
                return c11426i.plus(c11426i.m68301c0());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Landroidx/compose/ui/platform/i$c;", "", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lkotlin/Lazy;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", C17296a.f69688o, "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.i$c */
    /* loaded from: classes.dex */
    public static final class C11430c {
        public /* synthetic */ C11430c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CoroutineContext m68293a() {
            boolean m74804b;
            m74804b = C9822Yd.m74804b();
            if (m74804b) {
                return m68292b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) C11426i.f53365p.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        /* renamed from: b */
        public final CoroutineContext m68292b() {
            return (CoroutineContext) C11426i.f53364o.getValue();
        }

        private C11430c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, m28432d2 = {"androidx/compose/ui/platform/i$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "", "frameTimeNanos", "doFrame", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.i$d */
    /* loaded from: classes.dex */
    public static final class Choreographer$FrameCallbackC11431d implements Choreographer.FrameCallback, Runnable {
        public Choreographer$FrameCallbackC11431d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            C11426i.this.f53367d.removeCallbacks(this);
            C11426i.this.m68298i0();
            C11426i.this.m68299h0(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            C11426i.this.m68298i0();
            Object obj = C11426i.this.f53368e;
            C11426i c11426i = C11426i.this;
            synchronized (obj) {
                if (c11426i.f53370g.isEmpty()) {
                    c11426i.m68302b0().removeFrameCallback(this);
                    c11426i.f53373j = false;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    static {
        Lazy<CoroutineContext> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(C11427a.f53376g);
        f53364o = lazy;
        f53365p = new C11429b();
    }

    public /* synthetic */ C11426i(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    /* renamed from: b0 */
    public final Choreographer m68302b0() {
        return this.f53366c;
    }

    /* renamed from: c0 */
    public final IV2 m68301c0() {
        return this.f53375l;
    }

    /* renamed from: f0 */
    public final Runnable m68300f0() {
        Runnable removeFirstOrNull;
        synchronized (this.f53368e) {
            removeFirstOrNull = this.f53369f.removeFirstOrNull();
        }
        return removeFirstOrNull;
    }

    /* renamed from: h0 */
    public final void m68299h0(long j) {
        synchronized (this.f53368e) {
            if (!this.f53373j) {
                return;
            }
            this.f53373j = false;
            List<Choreographer.FrameCallback> list = this.f53370g;
            this.f53370g = this.f53371h;
            this.f53371h = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).doFrame(j);
            }
            list.clear();
        }
    }

    /* renamed from: i0 */
    public final void m68298i0() {
        boolean z;
        do {
            Runnable m68300f0 = m68300f0();
            while (m68300f0 != null) {
                m68300f0.run();
                m68300f0 = m68300f0();
            }
            synchronized (this.f53368e) {
                if (this.f53369f.isEmpty()) {
                    z = false;
                    this.f53372i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* renamed from: j0 */
    public final void m68297j0(Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f53368e) {
            this.f53370g.add(callback);
            if (!this.f53373j) {
                this.f53373j = true;
                this.f53366c.postFrameCallback(this.f53374k);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: k0 */
    public final void m68296k0(Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f53368e) {
            this.f53370g.remove(callback);
        }
    }

    @Override // p000.SC0
    /* renamed from: y */
    public void mo14150y(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f53368e) {
            this.f53369f.addLast(block);
            if (!this.f53372i) {
                this.f53372i = true;
                this.f53367d.post(this.f53374k);
                if (!this.f53373j) {
                    this.f53373j = true;
                    this.f53366c.postFrameCallback(this.f53374k);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public C11426i(Choreographer choreographer, Handler handler) {
        this.f53366c = choreographer;
        this.f53367d = handler;
        this.f53368e = new Object();
        this.f53369f = new ArrayDeque<>();
        this.f53370g = new ArrayList();
        this.f53371h = new ArrayList();
        this.f53374k = new Choreographer$FrameCallbackC11431d();
        this.f53375l = new C10299Zd(choreographer);
    }
}
