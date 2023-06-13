package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CameraxView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\bM\u0010NJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J4\u0010\u0018\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0014H\u0016JO\u0010!\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b!\u0010\"J*\u0010#\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000fH\u0002R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00109\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u0010:\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010J\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010.¨\u0006O"}, m28432d2 = {"LWR4;", "LxE;", "LVR4;", "Lio/reactivex/Observable;", "", "C1", "h0", "Ql", "Ul", "Rh", "M1", "i", "Lio/reactivex/F;", "Landroid/graphics/Bitmap;", "Tl", "", "Pl", "", "instructionsTitle", "instructions", "", "instructionsIcon", "showScooterIcon", "scooterIconRes", "Ik", "title", "setTitle", "bannerBodyOverrideString", "photoPreview", "lockComplianceFine", "Ljava/util/Currency;", "currency", "showParkingWarning", "Rl", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;ILjava/util/Currency;ZI)V", "Sl", "LJ5;", "b", "LJ5;", "binding", "Lco/bird/android/widget/CameraxView;", "c", "Lco/bird/android/widget/CameraxView;", "cameraView", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ImageView;", "birdPhotoImageView", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "takePhotoButton", "f", "scooterIcon", "g", "flashImageView", "h", "noButton", "yesButton", "Landroid/widget/RelativeLayout;", "j", "Landroid/widget/RelativeLayout;", "takePhotoFooterContainer", "Landroid/widget/LinearLayout;", "k", "Landroid/widget/LinearLayout;", "confirmPhotoFooterContainer", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "parkingInstructions", "m", "parkingInstructionsTitle", "n", "parkingInstructionsImage", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LJ5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WR4 */
/* loaded from: classes2.dex */
public final class WR4 extends AbstractC30071xE implements VR4 {

    /* renamed from: b */
    public final C3883J5 f41007b;

    /* renamed from: c */
    public final CameraxView f41008c;

    /* renamed from: d */
    public final ImageView f41009d;

    /* renamed from: e */
    public final Button f41010e;

    /* renamed from: f */
    public final ImageView f41011f;

    /* renamed from: g */
    public final ImageView f41012g;

    /* renamed from: h */
    public final Button f41013h;

    /* renamed from: i */
    public final Button f41014i;

    /* renamed from: j */
    public final RelativeLayout f41015j;

    /* renamed from: k */
    public final LinearLayout f41016k;

    /* renamed from: l */
    public final TextView f41017l;

    /* renamed from: m */
    public final TextView f41018m;

    /* renamed from: n */
    public final ImageView f41019n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WR4(BaseActivity activity, C3883J5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f41007b = binding;
        CameraxView cameraxView = binding.f16762e;
        Intrinsics.checkNotNullExpressionValue(cameraxView, "binding.camera");
        this.f41008c = cameraxView;
        ImageView imageView = binding.f16759b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.birdImageView");
        this.f41009d = imageView;
        Button button = binding.f16775r;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        this.f41010e = button;
        ImageView imageView2 = binding.f16774q;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.scooterIcon");
        this.f41011f = imageView2;
        ImageView imageView3 = binding.f16766i;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.flashImageView");
        this.f41012g = imageView3;
        Button button2 = binding.f16769l;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.noButton");
        this.f41013h = button2;
        Button button3 = binding.f16780w;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.yesButton");
        this.f41014i = button3;
        RelativeLayout relativeLayout = binding.f16776s;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding.takePhotoFooterContainer");
        this.f41015j = relativeLayout;
        LinearLayout linearLayout = binding.f16765h;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.confirmPhotoFooterContainer");
        this.f41016k = linearLayout;
        TextView textView = binding.f16770m;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.parkingInstructions");
        this.f41017l = textView;
        TextView textView2 = binding.f16772o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.parkingInstructionsTitle");
        this.f41018m = textView2;
        ImageView imageView4 = binding.f16771n;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.parkingInstructionsImage");
        this.f41019n = imageView4;
    }

    /* renamed from: C1 */
    public Observable<Unit> m78459C1() {
        return C44626lf5.clicksThrottle$default(this.f41010e, 0L, 1, null);
    }

    @Override // p000.VR4
    /* renamed from: Ik */
    public void mo78458Ik(String str, String instructions, int i, boolean z, int i2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        getActivity().setTitle(getActivity().getString(C45871nl4.ride_lock_photo_pre_photo_capture_actionbar_label));
        this.f41018m.setText(str);
        TextView textView = this.f41018m;
        if (str != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(textView, z2, 0, 2, null);
        this.f41017l.setText(instructions);
        this.f41019n.setImageResource(i);
        C49520tu6.show$default(this.f41015j, true, 0, 2, null);
        C49520tu6.show$default(this.f41016k, false, 0, 2, null);
        C49520tu6.show$default(this.f41010e, true, 0, 2, null);
        C49520tu6.show$default(this.f41012g, true, 0, 2, null);
        C49520tu6.show$default(this.f41008c, true, 0, 2, null);
        ImageView imageView = this.f41007b.f16779v;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.viewfinderFrame");
        C49520tu6.show$default(imageView, true, 0, 2, null);
        View view = this.f41007b.f16778u;
        Intrinsics.checkNotNullExpressionValue(view, "binding.topOverlay");
        C49520tu6.show$default(view, true, 0, 2, null);
        View view2 = this.f41007b.f16761d;
        Intrinsics.checkNotNullExpressionValue(view2, "binding.bottomOverlay");
        C49520tu6.show$default(view2, true, 0, 2, null);
        if (z) {
            this.f41011f.setImageResource(i2);
        }
        C49520tu6.show$default(this.f41011f, z, 0, 2, null);
        C49520tu6.show$default(this.f41009d, false, 0, 2, null);
    }

    /* renamed from: M1 */
    public void m78457M1() {
        this.f41008c.m54655z();
    }

    /* renamed from: Pl */
    public boolean m78456Pl() {
        if (this.f41008c.m54667n() != CameraxView.EnumC16478b.AUTO && this.f41008c.m54667n() != CameraxView.EnumC16478b.OFF) {
            return true;
        }
        return false;
    }

    /* renamed from: Ql */
    public Observable<Unit> m78455Ql() {
        return C44626lf5.clicksThrottle$default(this.f41013h, 0L, 1, null);
    }

    /* renamed from: Rh */
    public void m78454Rh() {
        this.f41008c.m54656y();
    }

    /* renamed from: Rl */
    public final void m78453Rl(String str, String str2, Bitmap photoPreview, int i, Currency currency, boolean z, int i2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(photoPreview, "photoPreview");
        Intrinsics.checkNotNullParameter(currency, "currency");
        getActivity().setTitle(getActivity().getString(C45871nl4.ride_lock_photo_post_photo_capture_actionbar_label));
        m78452Sl(str2, i, currency, z);
        this.f41018m.setText(str);
        TextView textView = this.f41018m;
        if (str != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(textView, z2, 0, 2, null);
        this.f41019n.setImageResource(i2);
        this.f41009d.setImageBitmap(photoPreview);
        C49520tu6.show$default(this.f41009d, true, 0, 2, null);
        C49520tu6.show$default(this.f41016k, true, 0, 2, null);
        C49520tu6.show$default(this.f41015j, false, 0, 2, null);
        C49520tu6.show$default(this.f41010e, false, 0, 2, null);
        C49520tu6.show$default(this.f41012g, false, 0, 2, null);
        C49520tu6.show$default(this.f41011f, false, 0, 2, null);
        C49520tu6.show$default(this.f41008c, false, 0, 2, null);
        ImageView imageView = this.f41007b.f16779v;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.viewfinderFrame");
        C49520tu6.m11232s(imageView, false, 4);
        View view = this.f41007b.f16778u;
        Intrinsics.checkNotNullExpressionValue(view, "binding.topOverlay");
        C49520tu6.show$default(view, false, 0, 2, null);
        View view2 = this.f41007b.f16761d;
        Intrinsics.checkNotNullExpressionValue(view2, "binding.bottomOverlay");
        C49520tu6.show$default(view2, false, 0, 2, null);
        S74.C7343a.showProgress$default(this, false, 0, 2, null);
    }

    /* renamed from: Sl */
    public final void m78452Sl(String str, int i, Currency currency, boolean z) {
        if (str == null) {
            if (i > 0) {
                str = getActivity().getString(C45871nl4.ride_lock_photo_info_post_photo_capture_body, C51916xx1.f118396a.m4408d(i, currency, EnumC36501Ux1.SHOW_IF_NON_ZERO));
            } else if (z) {
                str = getActivity().getString(C45871nl4.rider_bar_parking_warning_photo_confirmation_body);
            } else {
                str = getActivity().getString(C45871nl4.ride_lock_photo_info_post_photo_capture_body_no_fine_amount_label);
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (lockComplianceFine >…ount_label)\n      }\n    }");
        }
        this.f41017l.setText(str);
    }

    /* renamed from: Tl */
    public AbstractC23442F<Bitmap> m78451Tl() {
        return this.f41008c.m54682A();
    }

    /* renamed from: Ul */
    public Observable<Unit> m78450Ul() {
        return C44626lf5.clicksThrottle$default(this.f41014i, 0L, 1, null);
    }

    /* renamed from: h0 */
    public Observable<Unit> m78449h0() {
        return C44626lf5.clicksThrottle$default(this.f41012g, 0L, 1, null);
    }

    /* renamed from: i */
    public void m78448i() {
        this.f41008c.m54681B();
    }

    public void setTitle(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getResources().getString(i));
    }
}
