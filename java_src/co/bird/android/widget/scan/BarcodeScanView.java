package co.bird.android.widget.scan;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import androidx.camera.core.C11154e;
import androidx.camera.core.CameraControl;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u0000 *2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\"\u0010&B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b\"\u0010)J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00070\u0006H\u0016J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m28432d2 = {"Lco/bird/android/widget/scan/BarcodeScanView;", "Lco/bird/android/widget/scan/ScanView;", "", "LBx;", "Landroidx/camera/core/e;", "m", "LZ84;", "Lco/bird/android/buava/Optional;", "t", "", "enabled", "", "setFlash", "", "h", "Lkotlin/Lazy;", "x", "()D", "screenAspectRatio", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "i", "Ljava/util/concurrent/ExecutorService;", "getExecutor$widget_release", "()Ljava/util/concurrent/ExecutorService;", "executor", "LPx;", "j", "LPx;", "w", "()LPx;", "analyzer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "k", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class BarcodeScanView extends ScanView<List<? extends C0774Bx>> {

    /* renamed from: k */
    public static final C16666a f68037k = new C16666a(null);

    /* renamed from: h */
    public final Lazy f68038h;

    /* renamed from: i */
    public final ExecutorService f68039i;

    /* renamed from: j */
    public final C6587Px f68040j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/scan/BarcodeScanView$a;", "", "", "MINIMUM_TARGET_RESOLUTION_WIDTH", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.scan.BarcodeScanView$a */
    /* loaded from: classes4.dex */
    public static final class C16666a {
        public /* synthetic */ C16666a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16666a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nBarcodeScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BarcodeScanView.kt\nco/bird/android/widget/scan/BarcodeScanView$screenAspectRatio$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    /* renamed from: co.bird.android.widget.scan.BarcodeScanView$b */
    /* loaded from: classes4.dex */
    public static final class C16667b extends Lambda implements Function0<Double> {
        public C16667b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            DisplayMetrics displayMetrics = BarcodeScanView.this.getContext().getResources().getDisplayMetrics();
            return Double.valueOf(displayMetrics.widthPixels / displayMetrics.heightPixels);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScanView(Context context) {
        super(context);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16667b());
        this.f68038h = lazy;
        this.f68039i = Executors.newSingleThreadExecutor();
        this.f68040j = new C6587Px(null, 1, null);
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: m */
    public C11154e mo53994m() {
        int roundToInt;
        C11154e.C11157c c11157c = new C11154e.C11157c();
        roundToInt = MathKt__MathJVMKt.roundToInt(1080.0d / m54035x());
        C11154e m69617e = c11157c.mo69157c(new Size(1080, roundToInt)).m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n      // set t…LY_LATEST)\n      .build()");
        m69617e.m69623i0(this.f68039i, mo54007w());
        return m69617e;
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
    public Z84<Optional<List<? extends C0774Bx>>> mo53987t() {
        return mo54007w().m89285G();
    }

    /* renamed from: w */
    public C6587Px mo54007w() {
        return this.f68040j;
    }

    /* renamed from: x */
    public final double m54035x() {
        return ((Number) this.f68038h.getValue()).doubleValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16667b());
        this.f68038h = lazy;
        this.f68039i = Executors.newSingleThreadExecutor();
        this.f68040j = new C6587Px(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodeScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        lazy = LazyKt__LazyJVMKt.lazy(new C16667b());
        this.f68038h = lazy;
        this.f68039i = Executors.newSingleThreadExecutor();
        this.f68040j = new C6587Px(null, 1, null);
    }
}
