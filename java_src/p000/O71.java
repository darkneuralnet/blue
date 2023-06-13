package p000;

import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.IdCardTerminology;
import co.bird.android.widget.scan.BarcodeScanView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0016R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u000e0\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u00060"}, m28432d2 = {"LO71;", "LxE;", "LM71;", "", "show", "", "Dh", "", "resId", "Ue", "Lio/reactivex/Observable;", "C1", "ul", "f0", "Lzy;", "Ai", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "troubleLayout", "Landroid/widget/Button;", "c", "Landroid/widget/Button;", "takePhotoButton", DateTokenConverter.CONVERTER_KEY, "helpButton", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "instruction", "f", "troubleInfo", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "barcodeSubject", "Landroid/view/View;", "h", "Landroid/view/View;", "resolvedScannerView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "useIdCard", "Lco/bird/android/model/constant/IdCardTerminology;", "idCardTerminologyType", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;ZLco/bird/android/model/constant/IdCardTerminology;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDriverLicenseScanV2Ui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Ui.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2UiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,127:1\n44#2:128\n180#3:129\n*S KotlinDebug\n*F\n+ 1 DriverLicenseScanV2Ui.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2UiImpl\n*L\n78#1:128\n78#1:129\n*E\n"})
/* renamed from: O71 */
/* loaded from: classes2.dex */
public final class O71 extends AbstractC30071xE implements M71 {

    /* renamed from: b */
    public final LinearLayout f25909b;

    /* renamed from: c */
    public final Button f25910c;

    /* renamed from: d */
    public final Button f25911d;

    /* renamed from: e */
    public final TextView f25912e;

    /* renamed from: f */
    public final TextView f25913f;

    /* renamed from: g */
    public final C24558d<C31597zy> f25914g;

    /* renamed from: h */
    public final View f25915h;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "barcodes", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDriverLicenseScanV2Ui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Ui.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2UiImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1855#2,2:128\n*S KotlinDebug\n*F\n+ 1 DriverLicenseScanV2Ui.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2UiImpl$1\n*L\n80#1:128,2\n*E\n"})
    /* renamed from: O71$a */
    /* loaded from: classes2.dex */
    public static final class C5826a extends Lambda implements Function1<Optional<List<? extends C0774Bx>>, Unit> {
        public C5826a() {
            super(1);
        }

        /* renamed from: a */
        public final void m92879a(Optional<List<C0774Bx>> optional) {
            List<C0774Bx> m59035e = optional.m59035e();
            if (m59035e != null) {
                O71 o71 = O71.this;
                for (C0774Bx c0774Bx : m59035e) {
                    o71.f25914g.onNext(new C31597zy(c0774Bx));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<List<? extends C0774Bx>> optional) {
            m92879a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: O71$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5827b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdCardTerminology.values().length];
            try {
                iArr[IdCardTerminology.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdCardTerminology.DRIVER_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdCardTerminology.DRIVER_LICENSE_OR_PROVISIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdCardTerminology.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O71(BaseActivity activity, boolean z, IdCardTerminology idCardTerminologyType) {
        super(activity);
        CharSequence text;
        CharSequence text2;
        BarcodeScanView barcodeScanView;
        Z84<Optional<List<? extends C0774Bx>>> mo53987t;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(idCardTerminologyType, "idCardTerminologyType");
        this.f25909b = (LinearLayout) C40788fB0.m41758x(activity, C36585Vg4.troubleLayout);
        this.f25910c = (Button) C40788fB0.m41779c(activity, C36585Vg4.takePhotoButton);
        this.f25911d = (Button) C40788fB0.m41779c(activity, C36585Vg4.helpButton);
        TextView textView = (TextView) C40788fB0.m41779c(activity, C36585Vg4.instruction);
        this.f25912e = textView;
        TextView textView2 = (TextView) C40788fB0.m41779c(activity, C36585Vg4.troubleInfo);
        this.f25913f = textView2;
        C24558d<C31597zy> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<BarcodeWrapper>()");
        this.f25914g = m31902e;
        int[] iArr = C5827b.$EnumSwitchMapping$0;
        int i3 = iArr[idCardTerminologyType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        if (z) {
                            i2 = C45871nl4.id_card_scan_back_instruction;
                        } else {
                            i2 = C45871nl4.driver_license_scan_back_instruction;
                        }
                        text = activity.getText(i2);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    text = activity.getText(C45871nl4.driver_license_or_provisional_scan_back_instruction);
                }
            } else {
                text = activity.getText(C45871nl4.driver_license_scan_back_instruction);
            }
        } else {
            text = activity.getText(C45871nl4.id_card_scan_back_instruction);
        }
        textView.setText(text);
        int i4 = iArr[idCardTerminologyType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        if (z) {
                            i = C45871nl4.id_card_scan_trouble;
                        } else {
                            i = C45871nl4.driver_license_scan_trouble;
                        }
                        text2 = activity.getText(i);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    text2 = activity.getText(C45871nl4.driver_license_or_provisional_scan_trouble);
                }
            } else {
                text2 = activity.getText(C45871nl4.driver_license_scan_trouble);
            }
        } else {
            text2 = activity.getText(C45871nl4.id_card_scan_trouble);
        }
        textView2.setText(text2);
        ViewStub viewStub = (ViewStub) C40788fB0.m41779c(activity, C36585Vg4.previewStub);
        viewStub.setLayoutResource(C39311cj4.view_stub_mlkit_pdf_scanner_view);
        View inflate = viewStub.inflate();
        Intrinsics.checkNotNullExpressionValue(inflate, "stub.inflate()");
        this.f25915h = inflate;
        if (inflate instanceof BarcodeScanView) {
            barcodeScanView = (BarcodeScanView) inflate;
        } else {
            barcodeScanView = null;
        }
        if (barcodeScanView != null && (mo53987t = barcodeScanView.mo53987t()) != null) {
            AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(activity);
            Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
            Object m33094as = mo53987t.m33094as(AutoDispose.m45239a(m45197b));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            ObservableSubscribeProxy observableSubscribeProxy = (ObservableSubscribeProxy) m33094as;
            if (observableSubscribeProxy != null) {
                final C5826a c5826a = new C5826a();
                observableSubscribeProxy.subscribe(new InterfaceC23484g() { // from class: N71
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        O71._init_$lambda$0(Function1.this, obj);
                    }
                });
            }
        }
    }

    public static final void _init_$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.M71
    /* renamed from: Ai */
    public Observable<C31597zy> mo92886Ai() {
        Observable<C31597zy> observeOn = this.f25914g.subscribeOn(C24542a.m31934a()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "barcodeSubject\n    .subs…dSchedulers.mainThread())");
        return observeOn;
    }

    @Override // p000.M71
    /* renamed from: C1 */
    public Observable<Unit> mo92885C1() {
        return C44626lf5.clicksThrottle$default(this.f25910c, 0L, 1, null);
    }

    @Override // p000.M71
    /* renamed from: Dh */
    public void mo92884Dh(boolean z) {
        LinearLayout linearLayout = this.f25909b;
        if (linearLayout != null) {
            C49520tu6.show$default(linearLayout, z, 0, 2, null);
        }
    }

    @Override // p000.M71
    /* renamed from: Ue */
    public void mo92882Ue(int i) {
        this.f25910c.setText(i);
    }

    @Override // p000.M71
    /* renamed from: f0 */
    public void mo92881f0(boolean z) {
        C49520tu6.show$default(this.f25911d, z, 0, 2, null);
    }

    @Override // p000.M71
    /* renamed from: ul */
    public Observable<Unit> mo92880ul() {
        return C44626lf5.clicksThrottle$default(this.f25911d, 0L, 1, null);
    }
}
