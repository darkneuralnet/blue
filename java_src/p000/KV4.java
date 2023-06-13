package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.RidePassView;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010%\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*¨\u00063"}, m28432d2 = {"LKV4;", "LxE;", "LJV4;", "Lco/bird/android/model/persistence/RidePassView;", "ridePass", "", "vc", "Lio/reactivex/Observable;", "J8", "Tb", "", "show", "e2", "ug", "enabled", "ti", "LBX1;", "b", "LBX1;", "imageLoader", "Landroidx/appcompat/widget/AppCompatImageView;", "c", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "getPassTitle", "()Landroid/widget/TextView;", "passTitle", "e", "getPassBody", "passBody", "f", "getLearnMore", "learnMore", "Landroid/widget/Button;", "g", "Landroid/widget/Button;", "getPassBuy", "()Landroid/widget/Button;", "passBuy", "h", "getPassBuyPaypal", "passBuyPaypal", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(LBX1;Lco/bird/android/core/mvp/BaseActivity;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KV4 */
/* loaded from: classes3.dex */
public final class KV4 extends AbstractC30071xE implements JV4 {

    /* renamed from: b */
    public final BX1 f19698b;

    /* renamed from: c */
    public final AppCompatImageView f19699c;

    /* renamed from: d */
    public final TextView f19700d;

    /* renamed from: e */
    public final TextView f19701e;

    /* renamed from: f */
    public final TextView f19702f;

    /* renamed from: g */
    public final Button f19703g;

    /* renamed from: h */
    public final Button f19704h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KV4(BX1 imageLoader, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f19698b = imageLoader;
        View findViewById = activity.findViewById(C36126Th4.passIcon);
        Intrinsics.checkNotNullExpressionValue(findViewById, "activity.findViewById(R.id.passIcon)");
        this.f19699c = (AppCompatImageView) findViewById;
        View findViewById2 = activity.findViewById(C36126Th4.passTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "activity.findViewById(R.id.passTitle)");
        this.f19700d = (TextView) findViewById2;
        View findViewById3 = activity.findViewById(C36126Th4.passBody);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "activity.findViewById(R.id.passBody)");
        this.f19701e = (TextView) findViewById3;
        View findViewById4 = activity.findViewById(C36126Th4.learnMore);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "activity.findViewById(R.id.learnMore)");
        this.f19702f = (TextView) findViewById4;
        View findViewById5 = activity.findViewById(C36126Th4.passBuy);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "activity.findViewById(R.id.passBuy)");
        this.f19703g = (Button) findViewById5;
        View findViewById6 = activity.findViewById(C36126Th4.passBuyPaypal);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "activity.findViewById(R.id.passBuyPaypal)");
        this.f19704h = (Button) findViewById6;
    }

    @Override // p000.JV4
    /* renamed from: J8 */
    public Observable<Unit> mo98815J8() {
        return C44626lf5.clicksThrottle$default(this.f19702f, 0L, 1, null);
    }

    @Override // p000.JV4
    /* renamed from: Tb */
    public Observable<Unit> mo98814Tb() {
        return C44626lf5.clicksThrottle$default(this.f19703g, 0L, 1, null);
    }

    @Override // p000.JV4
    /* renamed from: e2 */
    public void mo98813e2(boolean z) {
        C49520tu6.show$default(this.f19704h, z, 0, 2, null);
    }

    @Override // p000.JV4
    /* renamed from: ti */
    public void mo98812ti(boolean z) {
        this.f19703g.setEnabled(z);
        this.f19704h.setEnabled(z);
    }

    @Override // p000.JV4
    /* renamed from: ug */
    public Observable<Unit> mo98811ug() {
        return C44626lf5.clicksThrottle$default(this.f19704h, 0L, 1, null);
    }

    @Override // p000.JV4
    /* renamed from: vc */
    public void mo98810vc(RidePassView ridePass) {
        Intrinsics.checkNotNullParameter(ridePass, "ridePass");
        this.f19698b.mo112174b(ridePass.getDetailImageUrl(), this.f19699c);
        this.f19700d.setText(ridePass.getTitle());
        this.f19701e.setText(ridePass.getDetailBody());
        this.f19703g.setText(ridePass.getDetailAction());
        this.f19702f.setPaintFlags(8);
    }
}
