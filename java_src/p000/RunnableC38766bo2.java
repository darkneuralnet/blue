package p000;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.http2.Http2Connection;
import p000.C38173ao2;
import p000.ZS5;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000f\u001dB'\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b>\u0010?J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010;\u001a\n 8*\u0004\u0018\u000107078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m28432d2 = {"Lbo2;", "LPv4;", "Lao2$b;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "", "run", "", "frameTimeNanos", "doFrame", "", "index", "Lkz0;", "constraints", "Lao2$a;", C17296a.f69688o, "(IJ)Lao2$a;", "onRemembered", "onForgotten", "onAbandoned", "now", "nextFrame", "average", "", "e", "new", "current", DateTokenConverter.CONVERTER_KEY, "Lao2;", "b", "Lao2;", "prefetchState", "LZS5;", "c", "LZS5;", "subcomposeLayoutState", "LQn2;", "LQn2;", "itemContentFactory", "Landroid/view/View;", "Landroid/view/View;", "view", "LLX2;", "Lbo2$b;", "f", "LLX2;", "prefetchRequests", "g", "J", "averagePrecomposeTimeNs", "h", "averagePremeasureTimeNs", "i", "Z", "prefetchScheduled", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "j", "Landroid/view/Choreographer;", "choreographer", "k", "isActive", "<init>", "(Lao2;LZS5;LQn2;Landroid/view/View;)V", "l", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,311:1\n1182#2:312\n1161#2,2:313\n523#3:315\n26#4,5:316\n26#4,5:321\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:312\n122#1:313,2\n159#1:315\n164#1:316,5\n182#1:321,5\n*E\n"})
/* renamed from: bo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC38766bo2 implements InterfaceC35316Pv4, C38173ao2.InterfaceC12154b, Runnable, Choreographer.FrameCallback {

    /* renamed from: l */
    public static final C13285a f59556l = new C13285a(null);

    /* renamed from: m */
    public static long f59557m;

    /* renamed from: b */
    public final C38173ao2 f59558b;

    /* renamed from: c */
    public final ZS5 f59559c;

    /* renamed from: d */
    public final C35476Qn2 f59560d;

    /* renamed from: e */
    public final View f59561e;

    /* renamed from: f */
    public final LX2<C13286b> f59562f;

    /* renamed from: g */
    public long f59563g;

    /* renamed from: h */
    public long f59564h;

    /* renamed from: i */
    public boolean f59565i;

    /* renamed from: j */
    public final Choreographer f59566j;

    /* renamed from: k */
    public boolean f59567k;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lbo2$a;", "", "Landroid/view/View;", "view", "", "b", "", "frameIntervalNs", "J", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bo2$a */
    /* loaded from: classes.dex */
    public static final class C13285a {
        public /* synthetic */ C13285a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r5 >= 30.0f) goto L8;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m62568b(View view) {
            float f;
            if (RunnableC38766bo2.f59557m == 0) {
                Display display = view.getDisplay();
                if (!view.isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                RunnableC38766bo2.f59557m = ((float) Http2Connection.DEGRADED_PONG_TIMEOUT_NS) / f;
            }
        }

        private C13285a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001d\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, m28432d2 = {"Lbo2$b;", "Lao2$a;", "", "cancel", "", C17296a.f69688o, "I", "c", "()I", "index", "Lkz0;", "b", "J", "()J", "constraints", "LZS5$a;", "LZS5$a;", "e", "()LZS5$a;", "f", "(LZS5$a;)V", "precomposeHandle", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "setCanceled", "(Z)V", "canceled", "setMeasured", "measured", "<init>", "(IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bo2$b */
    /* loaded from: classes.dex */
    public static final class C13286b implements C38173ao2.InterfaceC12153a {

        /* renamed from: a */
        public final int f59568a;

        /* renamed from: b */
        public final long f59569b;

        /* renamed from: c */
        public ZS5.InterfaceC10277a f59570c;

        /* renamed from: d */
        public boolean f59571d;

        /* renamed from: e */
        public boolean f59572e;

        public /* synthetic */ C13286b(int i, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j);
        }

        /* renamed from: a */
        public final boolean m62567a() {
            return this.f59571d;
        }

        /* renamed from: b */
        public final long m62566b() {
            return this.f59569b;
        }

        /* renamed from: c */
        public final int m62565c() {
            return this.f59568a;
        }

        @Override // p000.C38173ao2.InterfaceC12153a
        public void cancel() {
            if (!this.f59571d) {
                this.f59571d = true;
                ZS5.InterfaceC10277a interfaceC10277a = this.f59570c;
                if (interfaceC10277a != null) {
                    interfaceC10277a.dispose();
                }
                this.f59570c = null;
            }
        }

        /* renamed from: d */
        public final boolean m62564d() {
            return this.f59572e;
        }

        /* renamed from: e */
        public final ZS5.InterfaceC10277a m62563e() {
            return this.f59570c;
        }

        /* renamed from: f */
        public final void m62562f(ZS5.InterfaceC10277a interfaceC10277a) {
            this.f59570c = interfaceC10277a;
        }

        public C13286b(int i, long j) {
            this.f59568a = i;
            this.f59569b = j;
        }
    }

    public RunnableC38766bo2(C38173ao2 prefetchState, ZS5 subcomposeLayoutState, C35476Qn2 itemContentFactory, View view) {
        Intrinsics.checkNotNullParameter(prefetchState, "prefetchState");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f59558b = prefetchState;
        this.f59559c = subcomposeLayoutState;
        this.f59560d = itemContentFactory;
        this.f59561e = view;
        this.f59562f = new LX2<>(new C13286b[16], 0);
        this.f59566j = Choreographer.getInstance();
        f59556l.m62568b(view);
    }

    @Override // p000.C38173ao2.InterfaceC12154b
    /* renamed from: a */
    public C38173ao2.InterfaceC12153a mo62574a(int i, long j) {
        C13286b c13286b = new C13286b(i, j, null);
        this.f59562f.m96701b(c13286b);
        if (!this.f59565i) {
            this.f59565i = true;
            this.f59561e.post(this);
        }
        return c13286b;
    }

    /* renamed from: d */
    public final long m62571d(long j, long j2) {
        if (j2 == 0) {
            return j;
        }
        long j3 = 4;
        return (j / j3) + ((j2 / j3) * 3);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (this.f59567k) {
            this.f59561e.post(this);
        }
    }

    /* renamed from: e */
    public final boolean m62570e(long j, long j2, long j3) {
        return j > j2 || j + j3 < j2;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        this.f59567k = false;
        this.f59558b.m65456c(null);
        this.f59561e.removeCallbacks(this);
        this.f59566j.removeFrameCallback(this);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
        this.f59558b.m65456c(this);
        this.f59567k = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        if (!this.f59562f.m96688w() && this.f59565i && this.f59567k && this.f59561e.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.f59561e.getDrawingTime()) + f59557m;
            boolean z2 = false;
            while (this.f59562f.m96687x() && !z2) {
                C13286b c13286b = this.f59562f.m96691s()[0];
                InterfaceC35710Rn2 invoke = this.f59560d.m87930d().invoke();
                if (!c13286b.m62567a()) {
                    int itemCount = invoke.getItemCount();
                    int m62565c = c13286b.m62565c();
                    if (m62565c >= 0 && m62565c < itemCount) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (c13286b.m62563e() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (m62570e(nanoTime, nanos, this.f59563g)) {
                                    Object mo15369c = invoke.mo15369c(c13286b.m62565c());
                                    c13286b.m62562f(this.f59559c.m73079j(mo15369c, this.f59560d.m87932b(c13286b.m62565c(), mo15369c)));
                                    this.f59563g = m62571d(System.nanoTime() - nanoTime, this.f59563g);
                                } else {
                                    z2 = true;
                                }
                                Unit unit = Unit.INSTANCE;
                            } finally {
                            }
                        } else if (!c13286b.m62564d()) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (m62570e(nanoTime2, nanos, this.f59564h)) {
                                    ZS5.InterfaceC10277a m62563e = c13286b.m62563e();
                                    Intrinsics.checkNotNull(m62563e);
                                    int mo73078a = m62563e.mo73078a();
                                    for (int i = 0; i < mo73078a; i++) {
                                        m62563e.mo73077b(i, c13286b.m62566b());
                                    }
                                    this.f59564h = m62571d(System.nanoTime() - nanoTime2, this.f59564h);
                                    this.f59562f.m96707C(0);
                                } else {
                                    Unit unit2 = Unit.INSTANCE;
                                    z2 = true;
                                }
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                this.f59562f.m96707C(0);
            }
            if (z2) {
                this.f59566j.postFrameCallback(this);
                return;
            } else {
                this.f59565i = false;
                return;
            }
        }
        this.f59565i = false;
    }
}
