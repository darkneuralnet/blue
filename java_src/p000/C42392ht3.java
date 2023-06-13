package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
import p000.InterfaceC42324hm5;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006%"}, m28432d2 = {"Lht3;", "Let3;", "", C17296a.f69688o, "LbN4;", "rawResult", "handleResult", "Lio/reactivex/Observable;", "d4", "onResume", "onPause", "", "enabled", "a5", "f", "N6", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lhm5;", "c", "Lhm5;", "ui", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", DateTokenConverter.CONVERTER_KEY, "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scanView", "e", "Z", "shouldEnableScanner", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "scanResultSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;Lhm5;Lme/dm7/barcodescanner/zxing/ZXingScannerView;)V", "scanner-delegate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorScannerDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorScannerDelegate.kt\nco/bird/android/library/scannerdelegate/OperatorScannerDelegateImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,97:1\n180#2:98\n180#2:99\n*S KotlinDebug\n*F\n+ 1 OperatorScannerDelegate.kt\nco/bird/android/library/scannerdelegate/OperatorScannerDelegateImpl\n*L\n46#1:98\n49#1:99\n*E\n"})
/* renamed from: ht3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42392ht3 implements InterfaceC40613et3 {

    /* renamed from: b */
    public final ScopeProvider f86055b;

    /* renamed from: c */
    public final InterfaceC42324hm5 f86056c;

    /* renamed from: d */
    public final ZXingScannerView f86057d;

    /* renamed from: e */
    public boolean f86058e;

    /* renamed from: f */
    public final C24558d<C38511bN4> f86059f;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ht3$a */
    /* loaded from: classes3.dex */
    public static final class C22785a extends Lambda implements Function1<Unit, Unit> {
        public C22785a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42392ht3.this.f86056c.mo7477sk();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ht3$b */
    /* loaded from: classes3.dex */
    public static final class C22786b extends Lambda implements Function1<Unit, Unit> {
        public C22786b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C42392ht3.this.f86056c.mo7485i();
        }
    }

    public C42392ht3(ScopeProvider scopeProvider, InterfaceC42324hm5 ui, ZXingScannerView scanView) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scanView, "scanView");
        this.f86055b = scopeProvider;
        this.f86056c = ui;
        this.f86057d = scanView;
        this.f86058e = true;
        C24558d<C38511bN4> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Result>()");
        this.f86059f = m31902e;
    }

    /* renamed from: d */
    public static final void m35629d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m35627e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: N6 */
    public void mo35634N6() {
        this.f86057d.resumeCameraPreview(this);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: a */
    public void mo35633a() {
        Object m33094as = this.f86056c.mo7478sa().m33094as(AutoDispose.m45239a(this.f86055b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22785a c22785a = new C22785a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ft3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42392ht3.m35629d(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f86056c.mo7472z1().m33094as(AutoDispose.m45239a(this.f86055b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C22786b c22786b = new C22786b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: gt3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42392ht3.m35627e(Function1.this, obj);
            }
        });
        InterfaceC42324hm5.C22721a.initCodeEditor$default(this.f86056c, null, 1, null);
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: a5 */
    public void mo35632a5(boolean z) {
        C42392ht3 c42392ht3;
        this.f86058e = z;
        if (z) {
            c42392ht3 = this;
        } else {
            c42392ht3 = null;
        }
        this.f86057d.setResultHandler(c42392ht3);
        if (z) {
            this.f86057d.startCamera();
        }
    }

    @Override // p000.InterfaceC40613et3
    /* renamed from: d4 */
    public Observable<C38511bN4> mo35628d4() {
        Observable<C38511bN4> hide = this.f86059f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanResultSubject.hide()");
        return hide;
    }

    /* renamed from: f */
    public void m35626f() {
        if (this.f86058e) {
            this.f86057d.setResultHandler(this);
        }
        this.f86057d.startCamera();
    }

    @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
    public void handleResult(C38511bN4 rawResult) {
        Intrinsics.checkNotNullParameter(rawResult, "rawResult");
        this.f86059f.onNext(rawResult);
    }

    @Override // p000.InterfaceC40613et3
    public void onPause() {
        C41318g46.m40151m("camera: onPause", new Object[0]);
        this.f86057d.stopCamera();
    }

    @Override // p000.InterfaceC40613et3
    public void onResume() {
        C41318g46.m40151m("camera: onResume", new Object[0]);
        this.f86057d.setAspectTolerance(0.2f);
        m35626f();
    }
}
