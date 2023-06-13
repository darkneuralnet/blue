package p000;

import android.location.Location;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireFrequentFlyerView;
import co.bird.android.widget.BirdActionView;
import co.bird.android.widget.FrequentFlyerScannerView;
import co.bird.android.widget.QuickStartUnselectedBannerView;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010k\u001a\u00020j\u0012\u0006\u0010L\u001a\u00020G\u0012\u0006\u0010R\u001a\u00020M\u0012\u0006\u0010X\u001a\u00020S\u0012\b\u0010[\u001a\u0004\u0018\u00010S\u0012\u0006\u0010`\u001a\u00020\u0003\u0012\u0006\u0010e\u001a\u00020\u001a¢\u0006\u0004\bl\u0010mJ\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0096\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\t\u0010\u000f\u001a\u00020\u0004H\u0096\u0001J\u0015\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001J\u0019\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001J\u001d\u0010\u001f\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u001aH\u0096\u0001J\u0013\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001aH\u0096\u0001J\t\u0010\"\u001a\u00020!H\u0096\u0001J\t\u0010#\u001a\u00020\u001aH\u0096\u0001J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u000bH\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0015H\u0016J:\u00104\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u0004002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0004002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000400H\u0016J:\u00105\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u0004002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0004002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000400H\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0016J\b\u00109\u001a\u00020\u0004H\u0016J\u001a\u0010<\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010;\u001a\u00020:H\u0016J,\u0010>\u001a&\u0012\f\u0012\n =*\u0004\u0018\u00010\u00040\u0004 =*\u0012\u0012\f\u0012\n =*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00070\u0007H\u0016J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020\u0004H\u0016J\b\u0010C\u001a\u00020\u0004H\u0016J\u0012\u0010F\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010DH\u0016R\u0017\u0010L\u001a\u00020G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010[\u001a\u0004\u0018\u00010S8\u0006¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010WR\u0017\u0010`\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010i\u001a\u0004\u0018\u00010f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h¨\u0006n"}, m28432d2 = {"LaT;", "LZS;", "LxE;", "Lhm5;", "", "jl", "n0", "Lio/reactivex/Observable;", "sa", "LXK;", "W3", "", "zc", "z1", "Vg", "u5", PaymentMethodOptionsParams.Blik.PARAM_CODE, "tc", "gk", C9916Yi.f46302c, "c2", "", "length", "d2", "Lco/bird/android/model/wire/WireBird;", "bird", "", "isHourly", "ec", "copy", "show", "Qa", "w9", "Lak5;", "sk", "i", "c5", "gl", "F2", "pricingString", "nl", "ol", "title", "hint", "Lio/reactivex/F;", "LH31$b;", "M", "duration", "Lkotlin/Function0;", "onPrimary", "onSecondary", "onDismiss", "Q3", "we", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "view", "Rk", "Rf", "Landroid/location/Location;", "location", "O9", "kotlin.jvm.PlatformType", "Hh", "", "tolerance", "d6", "n1", "a1", "Lfm5;", "resultHandler", "l5", "Lco/bird/android/widget/FrequentFlyerScannerView;", "b", "Lco/bird/android/widget/FrequentFlyerScannerView;", "getFrequentFlyerStatus", "()Lco/bird/android/widget/FrequentFlyerScannerView;", "frequentFlyerStatus", "Lco/bird/android/widget/BirdActionView;", "c", "Lco/bird/android/widget/BirdActionView;", "getStatus", "()Lco/bird/android/widget/BirdActionView;", "status", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "getPricing", "()Landroid/widget/TextView;", "pricing", "e", "getPricingUiString", "pricingUiString", "f", "Lhm5;", "getDelegate", "()Lhm5;", "delegate", "g", "Z", "getPricingUiStringTappable", "()Z", "pricingUiStringTappable", "Lco/bird/android/widget/QuickStartUnselectedBannerView;", "h", "Lco/bird/android/widget/QuickStartUnselectedBannerView;", "quickStartBanner", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/FrequentFlyerScannerView;Lco/bird/android/widget/BirdActionView;Landroid/widget/TextView;Landroid/widget/TextView;Lhm5;Z)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aT */
/* loaded from: classes2.dex */
public final class C10715aT extends AbstractC30071xE implements InterfaceC10274ZS, InterfaceC42324hm5 {

    /* renamed from: b */
    public final FrequentFlyerScannerView f50502b;

    /* renamed from: c */
    public final BirdActionView f50503c;

    /* renamed from: d */
    public final TextView f50504d;

    /* renamed from: e */
    public final TextView f50505e;

    /* renamed from: f */
    public final InterfaceC42324hm5 f50506f;

    /* renamed from: g */
    public final boolean f50507g;

    /* renamed from: h */
    public final QuickStartUnselectedBannerView f50508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10715aT(BaseActivity activity, FrequentFlyerScannerView frequentFlyerStatus, BirdActionView status, TextView pricing, TextView textView, InterfaceC42324hm5 delegate, boolean z) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(frequentFlyerStatus, "frequentFlyerStatus");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f50502b = frequentFlyerStatus;
        this.f50503c = status;
        this.f50504d = pricing;
        this.f50505e = textView;
        this.f50506f = delegate;
        this.f50507g = z;
        this.f50508h = (QuickStartUnselectedBannerView) C40788fB0.m41758x(activity, C36585Vg4.quickStartUnselectedBannerView);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: F2 */
    public Observable<Unit> mo71347F2() {
        TextView textView;
        if (!this.f50507g || (textView = this.f50505e) == null) {
            Observable<Unit> empty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(empty, "empty()");
            return empty;
        }
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: Hh */
    public Observable<Unit> mo71346Hh() {
        Observable<Unit> m54461r;
        QuickStartUnselectedBannerView quickStartUnselectedBannerView = this.f50508h;
        return (quickStartUnselectedBannerView == null || (m54461r = quickStartUnselectedBannerView.m54461r()) == null) ? Observable.empty() : m54461r;
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: M */
    public AbstractC23442F<H31.AbstractC3016b> mo71345M(int i, int i2) {
        return H31.C3014a.dialogWithInput$default(this, getString(i, new Object[0]), null, getString(i2, new Object[0]), "", null, getString(C45871nl4.dialog_okay, new Object[0]), getString(C45871nl4.alert_leave_page_cancel, new Object[0]), false, false, true, 18, null);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: O9 */
    public void mo71344O9(WireBird wireBird, Location location) {
        boolean z;
        Intrinsics.checkNotNullParameter(location, "location");
        QuickStartUnselectedBannerView quickStartUnselectedBannerView = this.f50508h;
        if (quickStartUnselectedBannerView != null) {
            quickStartUnselectedBannerView.setBird(wireBird, location);
        }
        QuickStartUnselectedBannerView quickStartUnselectedBannerView2 = this.f50508h;
        if (quickStartUnselectedBannerView2 != null) {
            if (wireBird != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(quickStartUnselectedBannerView2, z, 0, 2, null);
        }
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: Q3 */
    public void mo71343Q3(String duration, Function0<Unit> onPrimary, Function0<Unit> onSecondary, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        Intrinsics.checkNotNullParameter(onSecondary, "onSecondary");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_ride_start_outside_operating_area, (Integer) null, (Integer) null, false, false, false, (Integer) null, Integer.valueOf(C36585Vg4.outsideAreaBody), (CharSequence) null, (CharSequence) getString(C45871nl4.ride_start_outside_operating_area_dialog_body_updated2, duration), C36585Vg4.outsideAreaPrimaryButton, Integer.valueOf(C36585Vg4.outsideAreaSecondaryButton), (String) null, (String) null, (Function0) onPrimary, (Function0) onSecondary, (Function0) onDismiss, (Function0) null, false, 405886, (Object) null);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Qa */
    public boolean mo7502Qa(String str, boolean z) {
        return this.f50506f.mo7502Qa(str, z);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: Rf */
    public void mo71342Rf() {
        C49520tu6.m11239l(this.f50502b);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: Rk */
    public void mo71341Rk(WireFrequentFlyerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50502b.m54567a(view.getScannerStatus(), C44931mA1.m26205a(view.getProgress(), getActivity()));
        C49520tu6.m11233r(this.f50502b);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Vg */
    public Observable<Unit> mo7499Vg() {
        return this.f50506f.mo7499Vg();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: W3 */
    public Observable<C9400XK> mo7497W3() {
        return this.f50506f.mo7497W3();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Yi */
    public void mo7496Yi() {
        this.f50506f.mo7496Yi();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: a1 */
    public void mo7495a1() {
        this.f50506f.mo7495a1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: c2 */
    public void mo7493c2() {
        this.f50506f.mo7493c2();
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: c5 */
    public void mo71340c5() {
        TextView textView = this.f50505e;
        if (textView != null) {
            textView.setText(getActivity().getString(C45871nl4.scanner_screen_tap_payment_before_1st_ride));
        }
        TextView textView2 = this.f50505e;
        if (textView2 != null) {
            C49520tu6.m11233r(textView2);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d2 */
    public void mo7492d2(int i) {
        this.f50506f.mo7492d2(i);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d6 */
    public void mo7491d6(float f) {
        this.f50506f.mo7491d6(f);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: ec */
    public void mo7488ec(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f50506f.mo7488ec(bird, z);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: gk */
    public void mo7486gk() {
        this.f50506f.mo7486gk();
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: gl */
    public void mo71339gl() {
        TextView textView = this.f50505e;
        if (textView != null) {
            textView.setText(getActivity().getString(C45871nl4.scanner_screen_tap_payment_pricing_changed));
        }
        TextView textView2 = this.f50505e;
        if (textView2 != null) {
            C49520tu6.m11233r(textView2);
        }
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: i */
    public boolean mo7485i() {
        return this.f50506f.mo7485i();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: jl */
    public void mo7482jl() {
        this.f50506f.mo7482jl();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: l5 */
    public void mo7481l5(InterfaceC41138fm5 interfaceC41138fm5) {
        this.f50506f.mo7481l5(interfaceC41138fm5);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n0 */
    public void mo7480n0() {
        this.f50506f.mo7480n0();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n1 */
    public void mo7479n1() {
        this.f50506f.mo7479n1();
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: nl */
    public void mo71338nl(String pricingString) {
        Intrinsics.checkNotNullParameter(pricingString, "pricingString");
        this.f50504d.setText(pricingString);
        C49520tu6.show$default(this.f50504d, true, 0, 2, null);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: ol */
    public void mo71337ol() {
        C49520tu6.show$default(this.f50504d, false, 0, 2, null);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sa */
    public Observable<Unit> mo7478sa() {
        return this.f50506f.mo7478sa();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sk */
    public EnumC38136ak5 mo7477sk() {
        return this.f50506f.mo7477sk();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: tc */
    public void mo7476tc(String str) {
        this.f50506f.mo7476tc(str);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: u5 */
    public void mo7475u5() {
        this.f50506f.mo7475u5();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: w9 */
    public void mo7474w9(boolean z) {
        this.f50506f.mo7474w9(z);
    }

    @Override // p000.InterfaceC10274ZS
    /* renamed from: we */
    public void mo71336we(String duration, Function0<Unit> onPrimary, Function0<Unit> onSecondary, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        Intrinsics.checkNotNullParameter(onSecondary, "onSecondary");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_ride_start_in_no_ride_area, (Integer) null, (Integer) null, false, false, false, (Integer) null, Integer.valueOf(C36585Vg4.noRideBody), (CharSequence) null, (CharSequence) getString(C45871nl4.ride_start_in_no_ride_area_dialog_body_updated2, duration), C36585Vg4.noRidePrimaryButton, Integer.valueOf(C36585Vg4.noRideSecondaryButton), (String) null, (String) null, (Function0) onPrimary, (Function0) onSecondary, (Function0) onDismiss, (Function0) null, false, 405886, (Object) null);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: z1 */
    public Observable<Unit> mo7472z1() {
        return this.f50506f.mo7472z1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: zc */
    public Observable<String> mo7471zc() {
        return this.f50506f.mo7471zc();
    }
}
