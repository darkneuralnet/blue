package co.bird.android.widget.scan;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11164h;
import androidx.camera.core.C11236l;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.lifecycle.C11260b;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import co.bird.android.model.RequirementsResult;
import co.bird.android.widget.scan.IdentificationScanView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import p000.C32271Cv1;
import p000.US1;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB\u0011\b\u0016\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AB\u001b\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\b@\u0010DB#\b\u0016\u0012\u0006\u0010?\u001a\u00020>\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\u0006\u0010E\u001a\u00020\u0014¢\u0006\u0004\b@\u0010FJ2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003J8\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u0018H\u0016J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001bJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010!\u001a\u00020 R\u001c\u0010(\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00106\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010<¨\u0006H"}, m28432d2 = {"Lco/bird/android/widget/scan/IdentificationScanView;", "Lco/bird/android/widget/scan/ScanView;", "LUS1$c;", "Lkotlin/Function1;", "Lco/bird/android/model/RequirementsResult;", "requirementsPredicate", "Lio/reactivex/F;", "Lkotlin/Triple;", "Landroid/graphics/Bitmap;", "D", "Landroid/net/Uri;", "uri", "Lkotlin/Pair;", "x", "Landroidx/camera/core/l;", "r", "", "onAttachedToWindow", "Landroidx/camera/core/e;", "m", "", "f", "Landroidx/camera/core/h;", "n", "LZ84;", "Lco/bird/android/buava/Optional;", "t", "", "useFront", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "enabled", "setFlash", "Landroidx/camera/core/h$n;", "outputFileOptions", "Landroidx/camera/core/h$o;", "B", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "h", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/Executor;", "i", "Lkotlin/Lazy;", "y", "()Ljava/util/concurrent/Executor;", "capturePhotoExecutor", "LUS1;", "j", "LUS1;", "analyzer", "k", "z", "()Landroidx/camera/core/h;", "imageCapture", "", "l", "A", "()D", "screenAspectRatio", "I", "cameraSelector", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationScanView.kt\nco/bird/android/widget/scan/IdentificationScanView\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,152:1\n41#2:153\n180#3:154\n*S KotlinDebug\n*F\n+ 1 IdentificationScanView.kt\nco/bird/android/widget/scan/IdentificationScanView\n*L\n76#1:153\n76#1:154\n*E\n"})
/* loaded from: classes4.dex */
public final class IdentificationScanView extends ScanView<US1.C8284c> {

    /* renamed from: n */
    public static final C16677a f68068n = new C16677a(null);

    /* renamed from: h */
    public final ExecutorService f68069h;

    /* renamed from: i */
    public final Lazy f68070i;

    /* renamed from: j */
    public final US1 f68071j;

    /* renamed from: k */
    public final Lazy f68072k;

    /* renamed from: l */
    public final Lazy f68073l;

    /* renamed from: m */
    public int f68074m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/scan/IdentificationScanView$a;", "", "", "MINIMUM_TARGET_RESOLUTION_WIDTH", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$a */
    /* loaded from: classes4.dex */
    public static final class C16677a {
        public /* synthetic */ C16677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16677a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Ljava/util/concurrent/Executor;", "b", "()Ljava/util/concurrent/Executor;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$b */
    /* loaded from: classes4.dex */
    public static final class C16678b extends Lambda implements Function0<Executor> {
        public C16678b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Executor invoke() {
            return NA0.m94296h(IdentificationScanView.this.getContext());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/camera/core/h;", "b", "()Landroidx/camera/core/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$c */
    /* loaded from: classes4.dex */
    public static final class C16679c extends Lambda implements Function0<C11164h> {

        /* renamed from: g */
        public static final C16679c f68076g = new C16679c();

        public C16679c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C11164h invoke() {
            return new C11164h.C11171g().m69512l(1).m69514j(90).m69516h(0).m69519e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$d */
    /* loaded from: classes4.dex */
    public static final class C16680d extends Lambda implements Function1<Long, Unit> {
        public C16680d() {
            super(1);
        }

        /* renamed from: a */
        public final void m54010a(Long l) {
            CameraControl mo23506a;
            RT2 m85380b = IdentificationScanView.this.m53995l().m68990d().m85380b(IdentificationScanView.this.m53995l().getWidth() / 2.0f, IdentificationScanView.this.m53995l().getHeight() / 2.0f);
            Intrinsics.checkNotNullExpressionValue(m85380b, "previewView.meteringPoin…ew.height.toFloat() / 2f)");
            InterfaceC45757na0 m53999h = IdentificationScanView.this.m53999h();
            if (m53999h != null && (mo23506a = m53999h.mo23506a()) != null) {
                mo23506a.mo16396g(new C32271Cv1.C1229a(m85380b).m111346b());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            m54010a(l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nIdentificationScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationScanView.kt\nco/bird/android/widget/scan/IdentificationScanView$screenAspectRatio$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1#2:153\n*E\n"})
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$e */
    /* loaded from: classes4.dex */
    public static final class C16681e extends Lambda implements Function0<Double> {
        public C16681e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            DisplayMetrics displayMetrics = IdentificationScanView.this.getContext().getResources().getDisplayMetrics();
            return Double.valueOf(displayMetrics.widthPixels / displayMetrics.heightPixels);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "Landroidx/camera/core/h$o;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$f */
    /* loaded from: classes4.dex */
    public static final class C16682f extends Lambda implements Function1<InterfaceC23444H<C11164h.C11182o>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C11164h.C11180n f68080h;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"co/bird/android/widget/scan/IdentificationScanView$f$a", "Landroidx/camera/core/h$m;", "Landroidx/camera/core/h$o;", "outputFileResults", "", C17296a.f69688o, "Landroidx/camera/core/ImageCaptureException;", "exception", "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.widget.scan.IdentificationScanView$f$a */
        /* loaded from: classes4.dex */
        public static final class C16683a implements C11164h.InterfaceC11179m {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23444H<C11164h.C11182o> f68081a;

            public C16683a(InterfaceC23444H<C11164h.C11182o> interfaceC23444H) {
                this.f68081a = interfaceC23444H;
            }

            @Override // androidx.camera.core.C11164h.InterfaceC11179m
            /* renamed from: a */
            public void mo54009a(C11164h.C11182o outputFileResults) {
                Intrinsics.checkNotNullParameter(outputFileResults, "outputFileResults");
                this.f68081a.onSuccess(outputFileResults);
            }

            @Override // androidx.camera.core.C11164h.InterfaceC11179m
            /* renamed from: b */
            public void mo54008b(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.f68081a.onError(exception);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16682f(C11164h.C11180n c11180n) {
            super(1);
            this.f68080h = c11180n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<C11164h.C11182o> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC23444H<C11164h.C11182o> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            IdentificationScanView.this.m54013z().m69569G0(this.f68080h, IdentificationScanView.this.m54014y(), new C16683a(emitter));
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.scan.IdentificationScanView$g */
    /* loaded from: classes4.dex */
    public static final class C16684g extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ int f68083h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16684g(int i) {
            super(0);
            this.f68083h = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IdentificationScanView identificationScanView = IdentificationScanView.this;
            C11260b m53998i = identificationScanView.m53998i();
            int i = 0;
            if (m53998i != null && m53998i.m69003j(C42812ic0.f87521b)) {
                i = 1;
            }
            identificationScanView.f68074m = i ^ 1;
            if (this.f68083h != IdentificationScanView.this.f68074m) {
                IdentificationScanView.this.m53988s();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationScanView(Context context) {
        super(context);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68069h = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16678b());
        this.f68070i = lazy;
        this.f68071j = new US1();
        lazy2 = LazyKt__LazyJVMKt.lazy(C16679c.f68076g);
        this.f68072k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16681e());
        this.f68073l = lazy3;
        this.f68074m = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC23442F analyzeManualImage$default(IdentificationScanView identificationScanView, Uri uri, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return identificationScanView.m54015x(uri, function1);
    }

    /* renamed from: p */
    public static final void m54017p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final double m54021A() {
        return ((Number) this.f68073l.getValue()).doubleValue();
    }

    /* renamed from: B */
    public final AbstractC23442F<C11164h.C11182o> m54020B(C11164h.C11180n outputFileOptions) {
        Intrinsics.checkNotNullParameter(outputFileOptions, "outputFileOptions");
        return C45832nh5.m23305k(new C16682f(outputFileOptions));
    }

    /* renamed from: C */
    public final void m54019C(boolean z) {
        int i = this.f68074m;
        if (z) {
            m53996k(new C16684g(i));
            return;
        }
        this.f68074m = 1;
        if (i != 1) {
            m53988s();
        }
    }

    /* renamed from: D */
    public final AbstractC23442F<Triple<US1.C8284c, RequirementsResult, Bitmap>> m54018D(Function1<? super US1.C8284c, RequirementsResult> requirementsPredicate) {
        Intrinsics.checkNotNullParameter(requirementsPredicate, "requirementsPredicate");
        return this.f68071j.m81540B(requirementsPredicate);
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: f */
    public int mo54001f() {
        return this.f68074m;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: m */
    public C11154e mo53994m() {
        int roundToInt;
        C11154e.C11157c c11157c = new C11154e.C11157c();
        roundToInt = MathKt__MathJVMKt.roundToInt(480.0d / m54021A());
        C11154e m69617e = c11157c.mo69157c(new Size(480, roundToInt)).m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n      // set t…LY_LATEST)\n      .build()");
        m69617e.m69623i0(this.f68069h, this.f68071j);
        return m69617e;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: n */
    public C11164h mo53993n() {
        C11164h imageCapture = m54013z();
        Intrinsics.checkNotNullExpressionValue(imageCapture, "imageCapture");
        return imageCapture;
    }

    @Override // co.bird.android.widget.scan.ScanView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<Long> observeOn = Observable.interval(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "interval(500, TimeUnit.M…dSchedulers.mainThread())");
        ScopeProvider m45202a = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45202a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16680d c16680d = new C16680d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qV1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IdentificationScanView.m54017p(Function1.this, obj);
            }
        });
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: r */
    public C11236l mo53989r() {
        C11236l m69156e = new C11236l.C11237a().m69152i(1).m69156e();
        Intrinsics.checkNotNullExpressionValue(m69156e, "Builder()\n      .setTarg…ATIO_16_9)\n      .build()");
        return m69156e;
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
    public Z84<Optional<US1.C8284c>> mo53987t() {
        return this.f68071j.m81520v();
    }

    /* renamed from: x */
    public final AbstractC23442F<Pair<US1.C8284c, RequirementsResult>> m54015x(Uri uri, Function1<? super US1.C8284c, RequirementsResult> function1) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        US1 us1 = this.f68071j;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return us1.m81529m(context, uri, function1);
    }

    /* renamed from: y */
    public final Executor m54014y() {
        return (Executor) this.f68070i.getValue();
    }

    /* renamed from: z */
    public final C11164h m54013z() {
        return (C11164h) this.f68072k.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68069h = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16678b());
        this.f68070i = lazy;
        this.f68071j = new US1();
        lazy2 = LazyKt__LazyJVMKt.lazy(C16679c.f68076g);
        this.f68072k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16681e());
        this.f68073l = lazy3;
        this.f68074m = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68069h = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16678b());
        this.f68070i = lazy;
        this.f68071j = new US1();
        lazy2 = LazyKt__LazyJVMKt.lazy(C16679c.f68076g);
        this.f68072k = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C16681e());
        this.f68073l = lazy3;
        this.f68074m = 1;
    }
}
