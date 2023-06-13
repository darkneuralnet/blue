package p000;

import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"LuT;", "LxE;", "LtT;", "Landroid/view/MenuItem;", "menuItem", "", "t0", "", "enabled", "L1", "found", "P1", "Lio/reactivex/Observable;", "w0", "", "O1", "D5", PaymentMethodOptionsParams.Blik.PARAM_CODE, "hd", "Landroid/widget/EditText;", "b", "Landroid/widget/EditText;", "search", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "scannerIcon", DateTokenConverter.CONVERTER_KEY, "greenCheckmark", "e", "redX", "f", "Landroid/view/MenuItem;", "next", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uT */
/* loaded from: classes2.dex */
public final class C29197uT extends AbstractC30071xE implements InterfaceC28719tT {

    /* renamed from: b */
    public final EditText f112410b;

    /* renamed from: c */
    public final ImageView f112411c;

    /* renamed from: d */
    public final ImageView f112412d;

    /* renamed from: e */
    public final ImageView f112413e;

    /* renamed from: f */
    public MenuItem f112414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29197uT(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f112410b = (EditText) C40788fB0.m41779c(activity, C36585Vg4.search);
        this.f112411c = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.scannerIcon);
        this.f112412d = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.correct);
        this.f112413e = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.incorrect);
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: D5 */
    public Observable<Unit> mo10254D5() {
        return C44626lf5.clicksThrottle$default(this.f112411c, 0L, 1, null);
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: L1 */
    public void mo10253L1(boolean z) {
        MenuItem menuItem = this.f112414f;
        if (menuItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("next");
            menuItem = null;
        }
        menuItem.setVisible(z);
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: O1 */
    public Observable<String> mo10252O1() {
        return C44626lf5.textChanges$default(this.f112410b, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: P1 */
    public void mo10251P1(boolean z) {
        C49520tu6.show$default(this.f112412d, z, 0, 2, null);
        C49520tu6.show$default(this.f112413e, !z, 0, 2, null);
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: hd */
    public void mo10250hd(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f112410b.setText(code);
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: t0 */
    public void mo10249t0(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        this.f112414f = menuItem;
    }

    @Override // p000.InterfaceC28719tT
    /* renamed from: w0 */
    public Observable<Unit> mo10248w0() {
        MenuItem menuItem = this.f112414f;
        if (menuItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("next");
            menuItem = null;
        }
        return C44626lf5.m27018b(menuItem);
    }
}
