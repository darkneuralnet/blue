package p000;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BirdActionView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import me.dm7.barcodescanner.zxing.ZXingScannerView;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B{\b\u0007\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u00100\u001a\u00020-\u0012\b\b\u0001\u00104\u001a\u000201\u0012\b\b\u0001\u00106\u001a\u000201\u0012\u0006\u0010:\u001a\u000207\u0012\b\b\u0001\u0010<\u001a\u000201\u0012\n\b\u0003\u0010@\u001a\u0004\u0018\u00010=\u0012\n\b\u0003\u0010B\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010C\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010F\u0012\n\b\u0001\u0010K\u001a\u0004\u0018\u00010F¢\u0006\u0004\bV\u0010WJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\u001a\u0010\"\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u0010H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\u0012\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0010H\u0002R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010@\u001a\u0004\u0018\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00103R\u0016\u0010E\u001a\u0004\u0018\u00010C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0016\u0010I\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010N\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010S\u001a\u0010\u0012\f\u0012\n P*\u0004\u0018\u00010\u000e0\u000e0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006X"}, m28432d2 = {"Lip2;", "Lhm5;", "LxE;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "tc", "Lak5;", "sk", C9916Yi.f46302c, "gk", "Lio/reactivex/Observable;", "sa", "z1", "LXK;", "W3", "", "i", "Sl", "n0", "jl", "Lco/bird/android/model/wire/WireBird;", "bird", "isHourly", "ec", "u5", "zc", "", "length", "d2", "show", "w9", "c2", "copy", "Qa", "Vg", "", "tolerance", "d6", "n1", "a1", "Lfm5;", "resultHandler", "l5", "Rl", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "b", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "scannerView", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "flashButton", DateTokenConverter.CONVERTER_KEY, "viewFinder", "Landroidx/appcompat/widget/AppCompatEditText;", "e", "Landroidx/appcompat/widget/AppCompatEditText;", "codeEditor", "f", "codeButton", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "infoText", "h", "scooter", "Lco/bird/android/widget/BirdActionView;", "Lco/bird/android/widget/BirdActionView;", "status", "Landroid/graphics/drawable/Drawable;", "j", "Landroid/graphics/drawable/Drawable;", "codeScooterDrawable", "k", "qrScooterDrawable", "l", "Z", "flashOn", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/d;", "birdCodeEnteredSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lme/dm7/barcodescanner/zxing/ZXingScannerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatEditText;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Lco/bird/android/widget/BirdActionView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "scanner-delegate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ip2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42944ip2 extends AbstractC30071xE implements InterfaceC42324hm5 {

    /* renamed from: b */
    public final ZXingScannerView f91342b;

    /* renamed from: c */
    public final ImageView f91343c;

    /* renamed from: d */
    public final ImageView f91344d;

    /* renamed from: e */
    public final AppCompatEditText f91345e;

    /* renamed from: f */
    public final ImageView f91346f;

    /* renamed from: g */
    public final TextView f91347g;

    /* renamed from: h */
    public final ImageView f91348h;

    /* renamed from: i */
    public final BirdActionView f91349i;

    /* renamed from: j */
    public final Drawable f91350j;

    /* renamed from: k */
    public final Drawable f91351k;

    /* renamed from: l */
    public boolean f91352l;

    /* renamed from: m */
    public final C24558d<C9400XK> f91353m;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ip2$a */
    /* loaded from: classes3.dex */
    public static final class C24594a extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        public C24594a() {
            super(3);
        }

        /* renamed from: a */
        public final Boolean m31779a(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            CharSequence trim;
            boolean isBlank;
            if (i == 6) {
                trim = StringsKt__StringsKt.trim((CharSequence) String.valueOf(C42944ip2.this.f91345e.getText()));
                String obj = trim.toString();
                isBlank = StringsKt__StringsJVMKt.isBlank(obj);
                if (isBlank) {
                    C42944ip2.this.f91345e.setError(C42944ip2.this.getActivity().getString(C45871nl4.scanner_code_error_empty));
                } else {
                    C42944ip2.this.f91353m.onNext(new C9400XK(obj));
                    C42944ip2.this.mo7480n0();
                }
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return m31779a(textView, num.intValue(), keyEvent);
        }
    }

    public /* synthetic */ C42944ip2(BaseActivity baseActivity, ZXingScannerView zXingScannerView, ImageView imageView, ImageView imageView2, AppCompatEditText appCompatEditText, ImageView imageView3, TextView textView, ImageView imageView4, BirdActionView birdActionView, Drawable drawable, Drawable drawable2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseActivity, zXingScannerView, imageView, imageView2, appCompatEditText, imageView3, (i & 64) != 0 ? null : textView, (i & 128) != 0 ? null : imageView4, (i & 256) != 0 ? null : birdActionView, drawable, drawable2);
    }

    /* renamed from: Ql */
    public static final void m31782Ql(InterfaceC41138fm5 handler, C38511bN4 c38511bN4) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        String m64617f = c38511bN4.m64617f();
        Intrinsics.checkNotNullExpressionValue(m64617f, "result.text");
        handler.mo40823b(new C40545em5(m64617f, c38511bN4));
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Qa */
    public boolean mo7502Qa(String str, boolean z) {
        return false;
    }

    /* renamed from: Rl */
    public final void m31781Rl(boolean z) {
        int i;
        C49520tu6.show$default(this.f91346f, z, 0, 2, null);
        ViewGroup.LayoutParams layoutParams = this.f91343c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            i = 8388613;
        } else {
            i = 1;
        }
        layoutParams2.gravity = i;
        this.f91343c.setLayoutParams(layoutParams);
        this.f91343c.requestLayout();
    }

    /* renamed from: Sl */
    public void m31780Sl() {
        IBinder windowToken = this.f91345e.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).toggleSoftInputFromWindow(windowToken, 2, 0);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Vg */
    public Observable<Unit> mo7499Vg() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: W3 */
    public Observable<C9400XK> mo7497W3() {
        Observable<C9400XK> hide = this.f91353m.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdCodeEnteredSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Yi */
    public void mo7496Yi() {
        m31781Rl(false);
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getActivity().getString(C45871nl4.bird_search_serial_scan_title));
        }
        this.f91344d.setImageDrawable(NA0.m94299e(getActivity(), C33309Hg4.barcode_view_finder));
        ImageView imageView = this.f91348h;
        if (imageView != null) {
            imageView.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_barcode_scooter));
        }
        TextView textView = this.f91347g;
        if (textView != null) {
            C49520tu6.m11233r(textView);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: a1 */
    public void mo7495a1() {
        this.f91342b.stopCamera();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: c2 */
    public void mo7493c2() {
        this.f91345e.requestFocus();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d2 */
    public void mo7492d2(int i) {
        C49520tu6.m11250a(this.f91345e, new InputFilter.LengthFilter(i));
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d6 */
    public void mo7491d6(float f) {
        this.f91342b.setAspectTolerance(f);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: ec */
    public void mo7488ec(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        BirdActionView birdActionView = this.f91349i;
        if (birdActionView != null) {
            C49520tu6.m11233r(birdActionView);
        }
        BirdActionView birdActionView2 = this.f91349i;
        if (birdActionView2 != null) {
            BirdActionView.setBird$default(birdActionView2, null, bird, true, z, 1, null);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: gk */
    public void mo7486gk() {
        m31781Rl(false);
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70242E(getActivity().getString(C45871nl4.bird_search_scan_new_barcode));
        }
        this.f91344d.setImageDrawable(NA0.m94299e(getActivity(), C47600qg4.qr_view_finder));
        ImageView imageView = this.f91348h;
        if (imageView != null) {
            imageView.setImageDrawable(this.f91351k);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: i */
    public boolean mo7485i() {
        boolean z;
        try {
            if (!this.f91352l) {
                z = true;
            } else {
                z = false;
            }
            this.f91352l = z;
            this.f91342b.setFlash(z);
        } catch (Exception e) {
            this.f91352l = true ^ this.f91352l;
            C41318g46.m40159e(e);
        }
        return this.f91352l;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: jl */
    public void mo7482jl() {
        this.f91345e.setText("");
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: l5 */
    public void mo7481l5(final InterfaceC41138fm5 interfaceC41138fm5) {
        ZXingScannerView.ResultHandler resultHandler;
        ZXingScannerView zXingScannerView = this.f91342b;
        if (interfaceC41138fm5 != null) {
            resultHandler = new ZXingScannerView.ResultHandler() { // from class: hp2
                @Override // me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler
                public final void handleResult(C38511bN4 c38511bN4) {
                    C42944ip2.m31782Ql(InterfaceC41138fm5.this, c38511bN4);
                }
            };
        } else {
            resultHandler = null;
        }
        zXingScannerView.setResultHandler(resultHandler);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n0 */
    public void mo7480n0() {
        this.f91345e.clearFocus();
        IBinder windowToken = this.f91345e.getWindowToken();
        if (windowToken != null) {
            Object systemService = getActivity().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n1 */
    public void mo7479n1() {
        this.f91342b.startCamera();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sa */
    public Observable<Unit> mo7478sa() {
        return C45219mf5.m25214a(this.f91346f);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sk */
    public EnumC38136ak5 mo7477sk() {
        if (this.f91345e.getVisibility() == 8) {
            this.f91345e.setVisibility(0);
            this.f91345e.requestFocus();
            this.f91344d.setImageDrawable(NA0.m94299e(getActivity(), C32364Df4.birdScanScrimColor));
            ImageView imageView = this.f91348h;
            if (imageView != null) {
                imageView.setImageDrawable(this.f91350j);
            }
            m31780Sl();
            this.f91346f.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_button_qrcode));
            return EnumC38136ak5.CODE;
        }
        this.f91344d.setImageDrawable(NA0.m94299e(getActivity(), C47600qg4.qr_view_finder));
        ImageView imageView2 = this.f91348h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.f91351k);
        }
        C49520tu6.show$default(this.f91345e, false, 0, 2, null);
        mo7480n0();
        this.f91346f.setImageDrawable(NA0.m94299e(getActivity(), C48193rg4.ic_button_bird_id));
        return EnumC38136ak5.QR;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: tc */
    public void mo7476tc(String str) {
        if (str != null) {
            this.f91345e.setText(str);
        }
        C34585Ms2.m94658m(this.f91345e, new C24594a());
        C49520tu6.m11250a(this.f91345e, new InputFilter.AllCaps());
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: u5 */
    public void mo7475u5() {
        BirdActionView birdActionView = this.f91349i;
        if (birdActionView != null) {
            C49520tu6.m11239l(birdActionView);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: w9 */
    public void mo7474w9(boolean z) {
        TextView textView = this.f91347g;
        if (textView != null) {
            C49520tu6.show$default(textView, z, 0, 2, null);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: z1 */
    public Observable<Unit> mo7472z1() {
        return C45219mf5.m25214a(this.f91343c);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: zc */
    public Observable<String> mo7471zc() {
        return C44626lf5.textChanges$default(this.f91345e, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42944ip2(BaseActivity activity, ZXingScannerView scannerView, ImageView flashButton, ImageView viewFinder, AppCompatEditText codeEditor, ImageView codeButton, TextView textView, ImageView imageView, BirdActionView birdActionView, Drawable drawable, Drawable drawable2) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scannerView, "scannerView");
        Intrinsics.checkNotNullParameter(flashButton, "flashButton");
        Intrinsics.checkNotNullParameter(viewFinder, "viewFinder");
        Intrinsics.checkNotNullParameter(codeEditor, "codeEditor");
        Intrinsics.checkNotNullParameter(codeButton, "codeButton");
        this.f91342b = scannerView;
        this.f91343c = flashButton;
        this.f91344d = viewFinder;
        this.f91345e = codeEditor;
        this.f91346f = codeButton;
        this.f91347g = textView;
        this.f91348h = imageView;
        this.f91349i = birdActionView;
        this.f91350j = drawable;
        this.f91351k = drawable2;
        C24558d<C9400XK> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<BirdCodeEnteredEvent>()");
        this.f91353m = m31902e;
        codeEditor.setInputType(4097);
        codeEditor.setMaxLines(1);
    }
}
