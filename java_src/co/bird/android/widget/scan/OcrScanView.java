package co.bird.android.widget.scan;

import android.content.Context;
import android.util.AttributeSet;
import androidx.camera.core.C11154e;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.buava.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0013\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005H\u0016R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/widget/scan/OcrScanView;", "Lco/bird/android/widget/scan/ScanView;", "Lp06;", "Landroidx/camera/core/e;", "m", "LZ84;", "Lco/bird/android/buava/Optional;", "t", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "h", "Ljava/util/concurrent/ExecutorService;", "executor", "Lzd3;", "i", "Lzd3;", "analyzer", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class OcrScanView extends ScanView<C46615p06> {

    /* renamed from: h */
    public final ExecutorService f68084h;

    /* renamed from: i */
    public final C52904zd3 f68085i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrScanView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68084h = Executors.newSingleThreadExecutor();
        this.f68085i = new C52904zd3();
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: m */
    public C11154e mo53994m() {
        C11154e m69617e = new C11154e.C11157c().m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n      .setBack…LY_LATEST)\n      .build()");
        m69617e.m69623i0(this.f68084h, this.f68085i);
        return m69617e;
    }

    @Override // co.bird.android.widget.scan.ScanView
    /* renamed from: t */
    public Z84<Optional<C46615p06>> mo53987t() {
        return this.f68085i.m959m();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68084h = Executors.newSingleThreadExecutor();
        this.f68085i = new C52904zd3();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68084h = Executors.newSingleThreadExecutor();
        this.f68085i = new C52904zd3();
    }
}
