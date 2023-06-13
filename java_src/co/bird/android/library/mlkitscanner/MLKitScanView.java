package co.bird.android.library.mlkitscanner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11236l;
import androidx.camera.core.CameraControl;
import androidx.camera.lifecycle.C11260b;
import androidx.camera.view.PreviewView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.library.mlkitscanner.MLKitScanView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C42812ic0;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\b8\u00109B\u001b\b\u0016\u0012\u0006\u00107\u001a\u000204\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b8\u0010:B#\b\u0016\u0012\u0006\u00107\u001a\u000204\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b8\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\f\u0010\u000e\u001a\u00020\b*\u00020\rH\u0002R.\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\n '*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R)\u0010.\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010\r0\r0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b#\u0010-R$\u00103\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0003\u00100\"\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u00105¨\u0006>"}, m28432d2 = {"Lco/bird/android/library/mlkitscanner/MLKitScanView;", "Landroid/widget/FrameLayout;", "Landroidx/camera/core/l;", "h", "Lic0;", DateTokenConverter.CONVERTER_KEY, "Landroid/util/AttributeSet;", "attrs", "", "g", "i", "k", "m", "Landroidx/camera/lifecycle/b;", "c", "Landroidx/camera/core/e$a;", "value", "b", "Landroidx/camera/core/e$a;", "getAnalyzer", "()Landroidx/camera/core/e$a;", "setAnalyzer", "(Landroidx/camera/core/e$a;)V", "analyzer", "", "Z", "getFlash", "()Z", "setFlash", "(Z)V", "flash", "Landroidx/camera/view/PreviewView;", "Landroidx/camera/view/PreviewView;", "previewView", "Lna0;", "e", "Lna0;", "camera", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "f", "Ljava/util/concurrent/ExecutorService;", "executor", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lkotlin/Lazy;", "()Lcom/google/common/util/concurrent/ListenableFuture;", "cameraProvider", "Landroidx/camera/core/e;", "Landroidx/camera/core/e;", "setImageAnalysis", "(Landroidx/camera/core/e;)V", "imageAnalysis", "Landroid/content/Context;", "()Landroid/content/Context;", "lifecycleOwner", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mlkit-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMLKitScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MLKitScanView.kt\nco/bird/android/library/mlkitscanner/MLKitScanView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n1#2:132\n37#3,2:133\n*S KotlinDebug\n*F\n+ 1 MLKitScanView.kt\nco/bird/android/library/mlkitscanner/MLKitScanView\n*L\n114#1:133,2\n*E\n"})
/* loaded from: classes3.dex */
public class MLKitScanView extends FrameLayout {

    /* renamed from: b */
    public C11154e.InterfaceC11155a f66114b;

    /* renamed from: c */
    public boolean f66115c;

    /* renamed from: d */
    public final PreviewView f66116d;

    /* renamed from: e */
    public InterfaceC45757na0 f66117e;

    /* renamed from: f */
    public final ExecutorService f66118f;

    /* renamed from: g */
    public final Lazy f66119g;

    /* renamed from: h */
    public C11154e f66120h;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/b;", "kotlin.jvm.PlatformType", "b", "()Lcom/google/common/util/concurrent/ListenableFuture;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.mlkitscanner.MLKitScanView$a */
    /* loaded from: classes3.dex */
    public static final class C16049a extends Lambda implements Function0<ListenableFuture<C11260b>> {
        public C16049a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ListenableFuture<C11260b> invoke() {
            return C11260b.m69005h(MLKitScanView.this.getContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLKitScanView(Context context) {
        super(context);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66118f = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16049a());
        this.f66119g = lazy;
        C11154e m69617e = new C11154e.C11157c().m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n    .setBackpr…ONLY_LATEST)\n    .build()");
        this.f66120h = m69617e;
        this.f66116d = new PreviewView(context);
        init$default(this, null, 1, null);
    }

    public static /* synthetic */ void init$default(MLKitScanView mLKitScanView, AttributeSet attributeSet, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        mLKitScanView.m56011g(attributeSet);
    }

    /* renamed from: j */
    public static final void m56008j(MLKitScanView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isAttachedToWindow() && this$0.f66117e == null) {
            C11260b c11260b = this$0.m56013e().get();
            Intrinsics.checkNotNullExpressionValue(c11260b, "cameraProvider.get()");
            this$0.m56015c(c11260b);
        }
    }

    /* renamed from: l */
    public static final void m56006l(MLKitScanView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m56013e().get().m68995r();
        this$0.f66117e = null;
    }

    /* renamed from: c */
    public final void m56015c(C11260b c11260b) {
        Unit unit;
        List listOfNotNull;
        C11236l m56010h = m56010h();
        if (m56012f() != null) {
            Context m56012f = m56012f();
            Intrinsics.checkNotNull(m56012f, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            C42812ic0 m56014d = m56014d();
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AbstractC11253p[]{this.f66120h, m56010h});
            AbstractC11253p[] abstractC11253pArr = (AbstractC11253p[]) listOfNotNull.toArray(new AbstractC11253p[0]);
            this.f66117e = c11260b.m69007f((LifecycleOwner) m56012f, m56014d, (AbstractC11253p[]) Arrays.copyOf(abstractC11253pArr, abstractC11253pArr.length));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            m56010h.m69162i0(this.f66116d.m68987g());
            return;
        }
        throw new UnsupportedOperationException("Cannot find the lifecycle owner for this context");
    }

    /* renamed from: d */
    public C42812ic0 m56014d() {
        C42812ic0 m33758b = new C42812ic0.C23290a().m33756d(1).m33758b();
        Intrinsics.checkNotNullExpressionValue(m33758b, "Builder()\n    .requireLe…FACING_BACK)\n    .build()");
        return m33758b;
    }

    /* renamed from: e */
    public final ListenableFuture<C11260b> m56013e() {
        return (ListenableFuture) this.f66119g.getValue();
    }

    /* renamed from: f */
    public final Context m56012f() {
        Context m99060a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        m99060a = KE2.m99060a(context);
        return m99060a;
    }

    /* renamed from: g */
    public final void m56011g(AttributeSet attributeSet) {
        addView(this.f66116d);
        this.f66116d.setVisibility(0);
    }

    /* renamed from: h */
    public C11236l m56010h() {
        C11236l m69156e = new C11236l.C11237a().m69156e();
        Intrinsics.checkNotNullExpressionValue(m69156e, "Builder().build()");
        return m69156e;
    }

    /* renamed from: i */
    public final void m56009i() {
        m56013e().addListener(new Runnable() { // from class: IE2
            @Override // java.lang.Runnable
            public final void run() {
                MLKitScanView.m56008j(MLKitScanView.this);
            }
        }, NA0.m94296h(getContext()));
    }

    /* renamed from: k */
    public final void m56007k() {
        m56013e().addListener(new Runnable() { // from class: JE2
            @Override // java.lang.Runnable
            public final void run() {
                MLKitScanView.m56006l(MLKitScanView.this);
            }
        }, NA0.m94296h(getContext()));
    }

    /* renamed from: m */
    public final void m56005m() {
        setFlash(!this.f66115c);
    }

    public final void setAnalyzer(C11154e.InterfaceC11155a interfaceC11155a) {
        C11154e c11154e;
        this.f66114b = interfaceC11155a;
        if (interfaceC11155a != null && (c11154e = this.f66120h) != null) {
            c11154e.m69623i0(this.f66118f, interfaceC11155a);
        }
    }

    public final void setFlash(boolean z) {
        CameraControl mo23506a;
        this.f66115c = z;
        InterfaceC45757na0 interfaceC45757na0 = this.f66117e;
        if (interfaceC45757na0 != null && (mo23506a = interfaceC45757na0.mo23506a()) != null) {
            mo23506a.mo16400e(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLKitScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66118f = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16049a());
        this.f66119g = lazy;
        C11154e m69617e = new C11154e.C11157c().m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n    .setBackpr…ONLY_LATEST)\n    .build()");
        this.f66120h = m69617e;
        this.f66116d = new PreviewView(context, attributeSet);
        m56011g(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLKitScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66118f = Executors.newSingleThreadExecutor();
        lazy = LazyKt__LazyJVMKt.lazy(new C16049a());
        this.f66119g = lazy;
        C11154e m69617e = new C11154e.C11157c().m69614h(0).m69617e();
        Intrinsics.checkNotNullExpressionValue(m69617e, "Builder()\n    .setBackpr…ONLY_LATEST)\n    .build()");
        this.f66120h = m69617e;
        this.f66116d = new PreviewView(context, attributeSet, i);
        m56011g(attributeSet);
    }
}
