package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LM66;", "LL66;", "Lio/reactivex/Observable;", "", "b", "", "name", PaymentMethod.BillingDetails.PARAM_ADDRESS, "imageUrl", "c", "amount", "date", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "amountText", "merchantAddressText", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ImageView;", "merchantImage", "e", "merchantNameText", "f", "dateText", "Landroid/view/View;", "g", "Landroid/view/View;", "contactContainer", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: M66 */
/* loaded from: classes3.dex */
public final class M66 implements L66 {

    /* renamed from: a */
    public final BaseActivity f22636a;

    /* renamed from: b */
    public final TextView f22637b;

    /* renamed from: c */
    public final TextView f22638c;

    /* renamed from: d */
    public final ImageView f22639d;

    /* renamed from: e */
    public final TextView f22640e;

    /* renamed from: f */
    public final TextView f22641f;

    /* renamed from: g */
    public final View f22642g;

    public M66(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f22636a = activity;
        this.f22637b = (TextView) C40788fB0.m41779c(activity, C31914Bh4.paymentAmount);
        this.f22638c = (TextView) C40788fB0.m41779c(activity, C31914Bh4.merchantInfoStreetAddress);
        this.f22639d = (ImageView) C40788fB0.m41779c(activity, C31914Bh4.merchantInfoPhoto);
        this.f22640e = (TextView) C40788fB0.m41779c(activity, C31914Bh4.merchantInfoName);
        this.f22641f = (TextView) C40788fB0.m41779c(activity, C31914Bh4.paymentDate);
        this.f22642g = C40788fB0.m41779c(activity, C31914Bh4.supportReportIssue);
    }

    @Override // p000.L66
    /* renamed from: a */
    public void mo95815a(String amount, String date) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f22637b.setText(amount);
        this.f22641f.setText(date);
    }

    @Override // p000.L66
    /* renamed from: b */
    public Observable<Unit> mo95814b() {
        return C44626lf5.clicksThrottle$default(this.f22642g, 0L, 1, null);
    }

    @Override // p000.L66
    /* renamed from: c */
    public void mo95813c(String name, String address, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f22640e.setText(name);
        this.f22638c.setText(address);
        ComponentCallbacks2C17096a.m53136v(this.f22636a).m81653k(str).m16096R0(this.f22639d);
    }
}
