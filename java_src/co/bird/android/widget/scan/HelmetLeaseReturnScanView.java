package co.bird.android.widget.scan;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11164h;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.subjects.C24558d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.C39065cJ1;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0011\b\u0016\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b5\u00109B#\b\u0016\u0012\u0006\u00104\u001a\u000203\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\u0006\u0010:\u001a\u00020\u0005¢\u0006\u0004\b5\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\tH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010R\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010-R\"\u00102\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101¨\u0006>"}, m28432d2 = {"Lco/bird/android/widget/scan/HelmetLeaseReturnScanView;", "Lco/bird/android/widget/scan/ScanView;", "LcJ1$b;", "Landroidx/camera/core/e;", "m", "", "f", "Landroidx/camera/core/h;", "n", "LZ84;", "Lco/bird/android/buava/Optional;", "t", "", "enabled", "", "setFlash", "Landroidx/camera/core/h$n;", "outputFileOptions", "Lio/reactivex/F;", "Landroidx/camera/core/h$o;", "z", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "h", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/Executor;", "i", "Lkotlin/Lazy;", "w", "()Ljava/util/concurrent/Executor;", "capturePhotoExecutor", "LcJ1;", "j", "LcJ1;", "analyzer", "k", "x", "()Landroidx/camera/core/h;", "imageCapture", "", "l", "y", "()D", "screenAspectRatio", "I", "cameraSelector", "Lio/reactivex/subjects/d;", "Landroidx/camera/core/i;", "Lio/reactivex/subjects/d;", "imagesSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "o", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class HelmetLeaseReturnScanView extends ScanView<C39065cJ1.C13488b> {

    /* renamed from: o */
    public static final C16671a f68054o = new C16671a(null);

    /* renamed from: h */
    public final ExecutorService f68055h;

    /* renamed from: i */
    public final Lazy f68056i;

    /* renamed from: j */
    public final C39065cJ1 f68057j;

    /* renamed from: k */
    public final Lazy f68058k;

    /* renamed from: l */
    public final Lazy f68059l;

    /* renamed from: m */
    public int f68060m;

    /* renamed from: n */
    public final C24558d<InterfaceC11183i> f68061n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/scan/HelmetLeaseReturnScanView$a;", "", "", "MINIMUM_TARGET_RESOLUTION_WIDTH", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.HelmetLeaseReturnScanView$a */
    /* loaded from: classes4.dex */
    public static final class C16671a {
        public /* synthetic */ C16671a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16671a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/concurrent/Executor;", "b", "()Ljava/util/concurrent/Executor;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.HelmetLeaseReturnScanView$b */
    /* loaded from: classes4.dex */
    public static final class C16672b extends Lambda implements Function0<Executor> {
        public C16672b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Executor invoke() {
            return NA0.m94296h(HelmetLeaseReturnScanView.this.getContext());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/camera/core/h;", "b", "()Landroidx/camera/core/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.HelmetLeaseReturnScanView$c */
    /* loaded from: classes4.dex */
    public static final class C16673c extends Lambda implements Function0<C11164h> {
        public C16673c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11164h invoke() {
            Size size;
            C11164h.C11171g c11171g = new C11164h.C11171g();
            if (HelmetLeaseReturnScanView.this.getResources().getConfiguration().orientation == 2) {
                size = new Size(1000, 750);
            } else {
                size = new Size(750, 1000);
            }
            return c11171g.mo69157c(size).m69519e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHelmetLeaseReturnScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScanView.kt\nco/bird/android/widget/scan/HelmetLeaseReturnScanView$screenAspectRatio$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
    /* renamed from: co.bird.android.widget.scan.HelmetLeaseReturnScanView$d */
    /* loaded from: classes4.dex */
    public static final class C16674d extends Lambda implements Function0<Double> {
        public C16674d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            DisplayMetrics displayMetrics = HelmetLeaseReturnScanView.this.getContext().getResources().getDisplayMetrics();
            return Double.valueOf(displayMetrics.widthPixels / displayMetrics.heightPixels);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Landroidx/camera/core/h$o;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.HelmetLeaseReturnScanView$e */
    /* loaded from: classes4.dex */
    public static final class C16675e extends Lambda implements Function1<InterfaceC23444H<C11164h.C11182o>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C11164h.C11180n f68066h;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"co/bird/android/widget/scan/HelmetLeaseReturnScanView$e$a", "Landroidx/camera/core/h$m;", "Landroidx/camera/core/h$o;", "outputFileResults", "", C17296a.f69688o, "Landroidx/camera/core/ImageCaptureException;", "exception", "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.widget.scan.HelmetLeaseReturnScanView$e$a */
        /* loaded from: classes4.dex */
        public static final class C16676a implements C11164h.InterfaceC11179m {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<C11164h.C11182o> f68067a;

            public C16676a(InterfaceC23444H<C11164h.C11182o> interfaceC23444H) {
                this.f68067a = interfaceC23444H;
            }

            @Override // androidx.camera.core.C11164h.InterfaceC11179m
            /* renamed from: a */
            public void mo54009a(C11164h.C11182o outputFileResults) {
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                this.f68067a.onSuccess(outputFileResults);
            }

            @Override // androidx.camera.core.C11164h.InterfaceC11179m
            /* renamed from: b */
            public void mo54008b(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f68067a.onError(exception);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16675e(C11164h.C11180n c11180n) {
            super(1);
            this.f68066h = c11180n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<C11164h.C11182o> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<C11164h.C11182o> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            HelmetLeaseReturnScanView.this.m54026x().m69569G0(this.f68066h, HelmetLeaseReturnScanView.this.m54027w(), new C16676a(emitter));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelmetLeaseReturnScanView(Context context) {
        super(context);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68055h = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16672b());
        this.f68056i = lazy;
        this.f68057j = new C39065cJ1();
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16673c());
        this.f68058k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16674d());
        this.f68059l = lazy3;
        this.f68060m = 1;
        C24558d<InterfaceC11183i> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<ImageProxy>()");
        this.f68061n = m31902e;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: f */
    public int mo54001f() {
        return this.f68060m;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: m */
    public C11154e mo53994m() {
        int roundToInt;
        C11154e.C11157c c11157c = new C11154e.C11157c();
        roundToInt = MathKt__MathJVMKt.roundToInt(480.0d / m54025y());
        C11154e m69617e = c11157c.mo69157c(new Size(480, roundToInt)).m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n      // set t…LY_LATEST)\n      .build()");
        m69617e.m69623i0(this.f68055h, this.f68057j);
        return m69617e;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: n */
    public C11164h mo53993n() {
        C11164h imageCapture = m54026x();
        Intrinsics.checkNotNullExpressionValue(imageCapture, "imageCapture");
        return imageCapture;
    }

    public final void setFlash(boolean z) {
        CameraControl mo23506a;
        InterfaceC45757na0 m53999h = m53999h();
        if (m53999h == null || (mo23506a = m53999h.mo23506a()) == null) {
            return;
        }
        mo23506a.mo16400e(z);
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: t */
    public Z84<Optional<C39065cJ1.C13488b>> mo53987t() {
        return this.f68057j.m61599l();
    }

    /* renamed from: w */
    public final Executor m54027w() {
        return (Executor) this.f68056i.getValue();
    }

    /* renamed from: x */
    public final C11164h m54026x() {
        return (C11164h) this.f68058k.getValue();
    }

    /* renamed from: y */
    public final double m54025y() {
        return ((Number) this.f68059l.getValue()).doubleValue();
    }

    /* renamed from: z */
    public final AbstractC23442F<C11164h.C11182o> m54024z(C11164h.C11180n outputFileOptions) {
        Intrinsics.checkNotNullParameter(outputFileOptions, "outputFileOptions");
        return C45832nh5.m23305k(new C16675e(outputFileOptions));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelmetLeaseReturnScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68055h = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16672b());
        this.f68056i = lazy;
        this.f68057j = new C39065cJ1();
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16673c());
        this.f68058k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16674d());
        this.f68059l = lazy3;
        this.f68060m = 1;
        C24558d<InterfaceC11183i> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<ImageProxy>()");
        this.f68061n = m31902e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelmetLeaseReturnScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68055h = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16672b());
        this.f68056i = lazy;
        this.f68057j = new C39065cJ1();
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16673c());
        this.f68058k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16674d());
        this.f68059l = lazy3;
        this.f68060m = 1;
        C24558d<InterfaceC11183i> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<ImageProxy>()");
        this.f68061n = m31902e;
    }
}
