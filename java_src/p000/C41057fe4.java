package p000;

import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.User;
import co.bird.android.model.wire.configs.Config;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C48163rd4;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010*\u001a\u00020'¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J1\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010/\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00105\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, m28432d2 = {"Lfe4;", "Lce4;", "LxE;", "Lco/bird/android/model/wire/configs/Config;", "config", "", "Ak", "", "locationPermissionGranted", "B0", "Lio/reactivex/Observable;", "j9", "LZg3;", "onPaymentMethodSelectedListener", "Bb", "", "token", "LL10;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LG10;", "A5", "Lco/bird/android/model/User;", "user", "", "requestCode", "Ljava/util/Currency;", "currency", "", "price", "Zk", "(Lco/bird/android/model/User;ILjava/util/Currency;Ljava/lang/Long;)V", "show", "Kd", "y", "S", "x4", "J", "A", "P3", "LiD1;", "b", "LiD1;", "googlePayManager", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "c", "Landroid/widget/TextView;", "depositText", DateTokenConverter.CONVERTER_KEY, "ridePriceText", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "selectPaymentOptions", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LiD1;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fe4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41057fe4 extends AbstractC30071xE implements InterfaceC39261ce4 {

    /* renamed from: b */
    public final InterfaceC42586iD1 f80390b;

    /* renamed from: c */
    public final TextView f80391c;

    /* renamed from: d */
    public final TextView f80392d;

    /* renamed from: e */
    public final Button f80393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41057fe4(BaseActivity activity, InterfaceC42586iD1 googlePayManager) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        this.f80390b = googlePayManager;
        this.f80391c = (TextView) activity.findViewById(C34956Oh4.depositText);
        this.f80392d = (TextView) activity.findViewById(C34956Oh4.ridePriceText);
        this.f80393e = (Button) C40788fB0.m41758x(activity, C52955zi4.button);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: A */
    public Observable<Unit> mo41083A() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: A5 */
    public G10 mo41082A5(String token, L10 listener) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            G10 m105957sa = G10.m105957sa(getActivity(), token);
            m105957sa.m105971I9(listener);
            return m105957sa;
        } catch (InvalidArgumentException e) {
            C41318g46.m40158f(e, "There was an issue with the authorization string.", new Object[0]);
            return null;
        }
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Ak */
    public void mo41081Ak(Config config) {
        boolean z;
        Intrinsics.checkNotNullParameter(config, "config");
        Long authChargeAmount = config.getFraudConfig().getAuthChargeAmount();
        TextView depositText = this.f80391c;
        Intrinsics.checkNotNullExpressionValue(depositText, "depositText");
        if (authChargeAmount != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(depositText, z, 0, 2, null);
        if (authChargeAmount != null) {
            this.f80391c.setText(getActivity().getString(C45871nl4.payment_quick_deposit_title, C51916xx1.f118396a.m4408d(authChargeAmount.longValue(), C45097mS5.m25591o(config.getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO)));
        }
        this.f80392d.setText(C47819r24.f106320a.m16578b(getActivity(), config.getRideConfig()));
        TextView ridePriceText = this.f80392d;
        Intrinsics.checkNotNullExpressionValue(ridePriceText, "ridePriceText");
        C49520tu6.show$default(ridePriceText, true, 0, 2, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: B0 */
    public void mo41080B0(boolean z) {
        if (z) {
            this.f80391c.setText(getActivity().getString(C45871nl4.pricing_turn_on_location));
        } else {
            this.f80391c.setText(getActivity().getString(C45871nl4.pricing_turn_on_permission));
        }
        TextView ridePriceText = this.f80392d;
        Intrinsics.checkNotNullExpressionValue(ridePriceText, "ridePriceText");
        C49520tu6.show$default(ridePriceText, false, 0, 2, null);
        TextView depositText = this.f80391c;
        Intrinsics.checkNotNullExpressionValue(depositText, "depositText");
        C49520tu6.show$default(depositText, true, 0, 2, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Bb */
    public void mo41079Bb(InterfaceC37520Zg3 onPaymentMethodSelectedListener) {
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
        C48163rd4.C27955a.newInstance$default(C48163rd4.f107339e, onPaymentMethodSelectedListener, null, 2, null).show(getActivity().getSupportFragmentManager(), "QuickPaymentBottomSheetDialog");
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: J */
    public Observable<Unit> mo41078J() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Kd */
    public void mo41077Kd(boolean z) {
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: P3 */
    public Observable<Unit> mo41076P3() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: S */
    public void mo41075S(boolean z) {
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Zk */
    public void mo41074Zk(User user, int i, Currency currency, Long l) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f80390b.mo16236h(user, getActivity(), i, currency, l);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: j9 */
    public Observable<Unit> mo41073j9() {
        Observable<Unit> clicksThrottle$default;
        Button button = this.f80393e;
        if (button == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null)) == null) {
            Observable<Unit> error = Observable.error(new NullPointerException("View R.id.button is missing."));
            Intrinsics.checkNotNullExpressionValue(error, "error(NullPointerExcepti….id.button is missing.\"))");
            return error;
        }
        return clicksThrottle$default;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: x4 */
    public Observable<Unit> mo41072x4() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: y */
    public void mo41071y(boolean z) {
    }
}
