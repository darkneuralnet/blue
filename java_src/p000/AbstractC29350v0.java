package p000;

import android.widget.Button;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import java.util.Currency;
import java.util.MissingFormatArgumentException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"Lv0;", "LxE;", "Lzz1;", "Lio/reactivex/Observable;", "", "h3", "Eg", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Wj", "", "freeRideValue", "Ljava/util/Currency;", "currency", "Ij", "", "enabled", "p0", "Landroid/widget/Button;", "Sl", "()Landroid/widget/Button;", "sendButton", "Pl", "copyButton", "Landroid/widget/TextView;", "Ql", "()Landroid/widget/TextView;", "pricingMessage", "", "Rl", "()I", "pricingStringRes", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "freeride_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: v0 */
/* loaded from: classes3.dex */
public abstract class AbstractC29350v0 extends AbstractC30071xE implements InterfaceC53122zz1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC29350v0(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // p000.InterfaceC53122zz1
    /* renamed from: Eg */
    public Observable<Unit> mo27Eg() {
        return C44626lf5.clicksThrottle$default(mo9408Pl(), 0L, 1, null);
    }

    @Override // p000.InterfaceC53122zz1
    /* renamed from: Ij */
    public void mo26Ij(long j, Currency currency) {
        String string;
        Intrinsics.checkNotNullParameter(currency, "currency");
        String m4408d = C51916xx1.f118396a.m4408d(j, currency, EnumC36501Ux1.SHOW_IF_NON_ZERO);
        TextView mo9407Ql = mo9407Ql();
        try {
            string = getActivity().getString(mo9406Rl(), m4408d);
        } catch (MissingFormatArgumentException unused) {
            string = getActivity().getString(mo9406Rl(), m4408d, m4408d);
        }
        mo9407Ql.setText(string);
    }

    /* renamed from: Pl */
    public abstract Button mo9408Pl();

    /* renamed from: Ql */
    public abstract TextView mo9407Ql();

    /* renamed from: Rl */
    public abstract int mo9406Rl();

    /* renamed from: Sl */
    public abstract Button mo9405Sl();

    @Override // p000.InterfaceC53122zz1
    /* renamed from: Wj */
    public void mo25Wj(String str) {
        Button mo9408Pl = mo9408Pl();
        if (str == null) {
            str = getActivity().getString(C45871nl4.free_ride_share_with_copy_url_action);
        }
        mo9408Pl.setText(str);
    }

    @Override // p000.InterfaceC53122zz1
    /* renamed from: h3 */
    public Observable<Unit> mo24h3() {
        return C44626lf5.clicksThrottle$default(mo9405Sl(), 0L, 1, null);
    }

    @Override // p000.InterfaceC53122zz1
    /* renamed from: p0 */
    public void mo23p0(boolean z) {
        mo9405Sl().setEnabled(z);
        mo9408Pl().setEnabled(z);
    }
}
