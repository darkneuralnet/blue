package co.bird.android.widget.scan;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11164h;
import androidx.camera.core.C11236l;
import androidx.camera.lifecycle.C11260b;
import androidx.camera.view.PreviewView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.widget.scan.ScanView;
import com.google.common.util.concurrent.ListenableFuture;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C42812ic0;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0016\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GB\u001b\b\u0016\u0012\u0006\u0010E\u001a\u00020D\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bF\u0010HB#\b\u0016\u0012\u0006\u0010E\u001a\u00020D\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010I\u001a\u00020\u0014¢\u0006\u0004\bF\u0010JJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\fH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0010H&J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018J9\u0010 \u001a\u00020\u000421\u0010\u001f\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u001bj\b\u0012\u0004\u0012\u00028\u0000`\u001eJ\u0006\u0010!\u001a\u00020\u0004J\b\u0010\"\u001a\u00020\u0004H\u0015J\u001d\u0010%\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0000¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108RK\u0010=\u001a9\u00125\u00123\u0012/\u0012-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u001bj\b\u0012\u0004\u0012\u00028\u0000`\u001e0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R?\u0010?\u001a-\u0012)\u0012'\u0012#\u0012!\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u001bj\u0002`>0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010<R\"\u0010C\u001a\u0010\u0012\f\u0012\n A*\u0004\u0018\u000103030@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010B¨\u0006K"}, m28432d2 = {"Lco/bird/android/widget/scan/ScanView;", "T", "Landroid/widget/FrameLayout;", "", "", "e", "Lco/bird/android/buava/Optional;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "v", "Lna0;", "camera", "u", "Landroidx/camera/core/e;", "m", "Landroidx/camera/core/h;", "n", "LZ84;", "t", "Landroidx/camera/core/l;", "r", "", "f", "Lic0;", "g", "Landroid/util/AttributeSet;", "attrs", "o", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lco/bird/android/widget/scan/AnalysisResultListener;", "resultListener", DateTokenConverter.CONVERTER_KEY, "s", "onAttachedToWindow", "Lkotlin/Function0;", "runnable", "k", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/camera/view/PreviewView;", "b", "Landroidx/camera/view/PreviewView;", "l", "()Landroidx/camera/view/PreviewView;", "previewView", "c", "Lna0;", "h", "()Lna0;", "setCamera", "(Lna0;)V", "Landroidx/camera/lifecycle/b;", "Landroidx/camera/lifecycle/b;", "i", "()Landroidx/camera/lifecycle/b;", "setCameraProvider", "(Landroidx/camera/lifecycle/b;)V", "cameraProvider", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "resultListeners", "Lco/bird/android/widget/scan/CameraInitializedListener;", "cameraInitializedListeners", "Lcom/google/common/util/concurrent/ListenableFuture;", "kotlin.jvm.PlatformType", "Lcom/google/common/util/concurrent/ListenableFuture;", "cameraProviderFuture", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanView.kt\nco/bird/android/widget/scan/ScanView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n1#2:215\n1#2:230\n1#2:245\n41#3:216\n180#4:217\n37#5,2:218\n1603#6,9:220\n1855#6:229\n1856#6:231\n1612#6:232\n1855#6,2:233\n1603#6,9:235\n1855#6:244\n1856#6:246\n1612#6:247\n1855#6,2:248\n*S KotlinDebug\n*F\n+ 1 ScanView.kt\nco/bird/android/widget/scan/ScanView\n*L\n200#1:230\n208#1:245\n159#1:216\n159#1:217\n187#1:218,2\n200#1:220,9\n200#1:229\n200#1:231\n200#1:232\n201#1:233,2\n208#1:235,9\n208#1:244\n208#1:246\n208#1:247\n209#1:248,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class ScanView<T> extends FrameLayout {

    /* renamed from: b */
    public final PreviewView f68087b;

    /* renamed from: c */
    public InterfaceC45757na0 f68088c;

    /* renamed from: d */
    public C11260b f68089d;

    /* renamed from: e */
    public final List<WeakReference<Function1<Optional<T>, Unit>>> f68090e;

    /* renamed from: f */
    public final List<WeakReference<Function1<InterfaceC45757na0, Unit>>> f68091f;

    /* renamed from: g */
    public final ListenableFuture<C11260b> f68092g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "T", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.scan.ScanView$a */
    /* loaded from: classes4.dex */
    public static final class C16685a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ ScanView<T> f68093g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16685a(ScanView<T> scanView) {
            super(0);
            this.f68093g = scanView;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f68093g.m54002e();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.scan.ScanView$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16686b extends FunctionReferenceImpl implements Function1<Optional<T>, Unit> {
        public C16686b(Object obj) {
            super(1, obj, ScanView.class, "updateListeners", "updateListeners(Lco/bird/android/buava/Optional;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((Optional) ((Optional) obj));
            return Unit.INSTANCE;
        }

        public final void invoke(Optional<T> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ScanView) this.receiver).m53985v(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.scan.ScanView$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16687c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C16687c f68094b = new C16687c();

        public C16687c() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "T", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.scan.ScanView$d */
    /* loaded from: classes4.dex */
    public static final class C16688d extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ ScanView<T> f68095g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16688d(ScanView<T> scanView) {
            super(0);
            this.f68095g = scanView;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f68095g.m54002e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68090e = new ArrayList();
        this.f68091f = new ArrayList();
        ListenableFuture<C11260b> m69005h = C11260b.m69005h(getContext());
        Intrinsics.checkNotNullExpressionValue(m69005h, "getInstance(context)");
        this.f68092g = m69005h;
        this.f68087b = new PreviewView(context);
        init$default(this, null, 1, null);
    }

    public static /* synthetic */ void init$default(ScanView scanView, AttributeSet attributeSet, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        scanView.m53992o(attributeSet);
    }

    /* renamed from: j */
    public static final void m53997j(ScanView this$0, Function0 runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.f68089d = this$0.f68092g.get();
        runnable.invoke();
    }

    /* renamed from: p */
    public static final void m53991p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m53990q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m54003d(Function1<? super Optional<T>, Unit> resultListener) {
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        this.f68090e.add(new WeakReference<>(resultListener));
    }

    /* renamed from: e */
    public final void m54002e() {
        List listOfNotNull;
        C11260b c11260b = this.f68089d;
        if (c11260b != null) {
            c11260b.m68995r();
            try {
                C11236l mo53989r = mo53989r();
                Context context = getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                C42812ic0 m54000g = m54000g();
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new AbstractC11253p[]{mo53994m(), mo53993n(), mo53989r});
                AbstractC11253p[] abstractC11253pArr = (AbstractC11253p[]) listOfNotNull.toArray(new AbstractC11253p[0]);
                InterfaceC45757na0 m69007f = c11260b.m69007f((LifecycleOwner) context, m54000g, (AbstractC11253p[]) Arrays.copyOf(abstractC11253pArr, abstractC11253pArr.length));
                Intrinsics.checkNotNullExpressionValue(m69007f, "cameraProvider.bindToLif…toTypedArray(),\n        )");
                mo53989r.m69162i0(this.f68087b.m68987g());
                this.f68088c = m69007f;
                m53986u(m69007f);
                return;
            } catch (Exception e) {
                C41318g46.m40158f(e, "Use case binding failed", new Object[0]);
                return;
            }
        }
        throw new IllegalStateException("Camera initialization failed.");
    }

    /* renamed from: f */
    public int mo54001f() {
        return 1;
    }

    /* renamed from: g */
    public C42812ic0 m54000g() {
        C42812ic0 m33758b = new C42812ic0.C23290a().m33756d(mo54001f()).m33758b();
        Intrinsics.checkNotNullExpressionValue(m33758b, "Builder()\n    .requireLe…sSelector())\n    .build()");
        return m33758b;
    }

    /* renamed from: h */
    public final InterfaceC45757na0 m53999h() {
        return this.f68088c;
    }

    /* renamed from: i */
    public final C11260b m53998i() {
        return this.f68089d;
    }

    /* renamed from: k */
    public final void m53996k(final Function0<Unit> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (this.f68089d == null) {
            this.f68092g.addListener(new Runnable() { // from class: zl5
                @Override // java.lang.Runnable
                public final void run() {
                    ScanView.m53997j(ScanView.this, runnable);
                }
            }, NA0.m94296h(getContext()));
        } else {
            runnable.invoke();
        }
    }

    /* renamed from: l */
    public final PreviewView m53995l() {
        return this.f68087b;
    }

    /* renamed from: m */
    public abstract C11154e mo53994m();

    /* renamed from: n */
    public C11164h mo53993n() {
        return null;
    }

    /* renamed from: o */
    public final void m53992o(AttributeSet attributeSet) {
        addView(this.f68087b);
        this.f68087b.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m53996k(new C16685a(this));
        Z84<Optional<T>> mo53987t = mo53987t();
        ScopeProvider m45202a = ViewScopeProvider.m45202a(this);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        Object m33094as = mo53987t.m33094as(AutoDispose.m45239a(m45202a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C16686b c16686b = new C16686b(this);
        InterfaceC23484g<? super T> interfaceC23484g = new InterfaceC23484g() { // from class: xl5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ScanView.m53991p(Function1.this, obj);
            }
        };
        final C16687c c16687c = C16687c.f68094b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: yl5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ScanView.m53990q(Function1.this, obj);
            }
        });
    }

    /* renamed from: r */
    public C11236l mo53989r() {
        C11236l m69156e = new C11236l.C11237a().m69156e();
        Intrinsics.checkNotNullExpressionValue(m69156e, "Builder().build()");
        return m69156e;
    }

    /* renamed from: s */
    public final void m53988s() {
        if (isAttachedToWindow()) {
            try {
                m53996k(new C16688d(this));
            } catch (Exception e) {
                C41318g46.m40162b(e);
            }
        }
    }

    public final void setCamera(InterfaceC45757na0 interfaceC45757na0) {
        this.f68088c = interfaceC45757na0;
    }

    public final void setCameraProvider(C11260b c11260b) {
        this.f68089d = c11260b;
    }

    /* renamed from: t */
    public abstract Z84<Optional<T>> mo53987t();

    /* renamed from: u */
    public final void m53986u(InterfaceC45757na0 interfaceC45757na0) {
        ArrayList<Function1> arrayList = new ArrayList();
        Iterator<T> it = this.f68091f.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) ((WeakReference) it.next()).get();
            if (function1 != null) {
                arrayList.add(function1);
            }
        }
        for (Function1 function12 : arrayList) {
            function12.invoke(interfaceC45757na0);
        }
    }

    /* renamed from: v */
    public final void m53985v(Optional<T> optional) {
        ArrayList<Function1> arrayList = new ArrayList();
        Iterator<T> it = this.f68090e.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) ((WeakReference) it.next()).get();
            if (function1 != null) {
                arrayList.add(function1);
            }
        }
        for (Function1 function12 : arrayList) {
            function12.invoke(optional);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68090e = new ArrayList();
        this.f68091f = new ArrayList();
        ListenableFuture<C11260b> m69005h = C11260b.m69005h(getContext());
        Intrinsics.checkNotNullExpressionValue(m69005h, "getInstance(context)");
        this.f68092g = m69005h;
        this.f68087b = new PreviewView(context, attributeSet);
        m53992o(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f68090e = new ArrayList();
        this.f68091f = new ArrayList();
        ListenableFuture<C11260b> m69005h = C11260b.m69005h(getContext());
        Intrinsics.checkNotNullExpressionValue(m69005h, "getInstance(context)");
        this.f68092g = m69005h;
        this.f68087b = new PreviewView(context, attributeSet, i);
        m53992o(attributeSet);
    }
}
