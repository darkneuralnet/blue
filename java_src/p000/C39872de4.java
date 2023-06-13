package p000;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
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
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016J1\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, m28432d2 = {"Lde4;", "Lce4;", "LxE;", "", "show", "", "Kd", "y", "S", "Lco/bird/android/model/wire/configs/Config;", "config", "Ak", "locationPermissionGranted", "B0", "Lco/bird/android/model/User;", "user", "", "requestCode", "Ljava/util/Currency;", "currency", "", "price", "Zk", "(Lco/bird/android/model/User;ILjava/util/Currency;Ljava/lang/Long;)V", "", "token", "LL10;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LG10;", "A5", "Lio/reactivex/Observable;", "x4", "J", "A", "P3", "LZg3;", "onPaymentMethodSelectedListener", "Bb", "j9", "LiD1;", "b", "LiD1;", "googlePayManager", "La5;", "c", "La5;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LiD1;La5;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: de4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39872de4 extends AbstractC30071xE implements InterfaceC39261ce4 {

    /* renamed from: b */
    public final InterfaceC42586iD1 f76983b;

    /* renamed from: c */
    public final C10566a5 f76984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39872de4(BaseActivity activity, InterfaceC42586iD1 googlePayManager, C10566a5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f76983b = googlePayManager;
        this.f76984c = binding;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: A */
    public Observable<Unit> mo41083A() {
        ImageButton imageButton = this.f76984c.f49801j;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.paypalButton");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
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
        Intrinsics.checkNotNullParameter(config, "config");
        this.f76984c.f49803l.setText(C47819r24.f106320a.m16578b(getActivity(), config.getRideConfig()));
        Long authChargeAmount = config.getFraudConfig().getAuthChargeAmount();
        boolean z = true;
        if (authChargeAmount != null) {
            this.f76984c.f49797f.setText(getActivity().getString(C45871nl4.payment_quick_deposit_title, C51916xx1.f118396a.m4408d(authChargeAmount.longValue(), C45097mS5.m25591o(config.getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO)));
        }
        TextView textView = this.f76984c.f49803l;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.ridePriceText");
        C49520tu6.show$default(textView, true, 0, 2, null);
        TextView textView2 = this.f76984c.f49797f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.depositText");
        if (authChargeAmount == null) {
            z = false;
        }
        C49520tu6.show$default(textView2, z, 0, 2, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: B0 */
    public void mo41080B0(boolean z) {
        if (z) {
            this.f76984c.f49797f.setText(getActivity().getString(C45871nl4.pricing_turn_on_location));
        } else {
            this.f76984c.f49797f.setText(getActivity().getString(C45871nl4.pricing_turn_on_permission));
        }
        TextView textView = this.f76984c.f49803l;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.ridePriceText");
        C49520tu6.show$default(textView, false, 0, 2, null);
        TextView textView2 = this.f76984c.f49797f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.depositText");
        C49520tu6.show$default(textView2, true, 0, 2, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Bb */
    public void mo41079Bb(InterfaceC37520Zg3 onPaymentMethodSelectedListener) {
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: J */
    public Observable<Unit> mo41078J() {
        ImageButton imageButton = this.f76984c.f49799h;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.googlePayButton");
        return C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Kd */
    public void mo41077Kd(boolean z) {
        Button button = this.f76984c.f49800i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.moreButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: P3 */
    public Observable<Unit> mo41076P3() {
        Button button = this.f76984c.f49800i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.moreButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: S */
    public void mo41075S(boolean z) {
        ImageButton imageButton = this.f76984c.f49801j;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.paypalButton");
        C49520tu6.show$default(imageButton, z, 0, 2, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: Zk */
    public void mo41074Zk(User user, int i, Currency currency, Long l) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f76983b.mo16236h(user, getActivity(), i, currency, l);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: j9 */
    public Observable<Unit> mo41073j9() {
        Observable<Unit> never = Observable.never();
        Intrinsics.checkNotNullExpressionValue(never, "never()");
        return never;
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: x4 */
    public Observable<Unit> mo41072x4() {
        Button button = this.f76984c.f49796e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.creditCardButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC39261ce4
    /* renamed from: y */
    public void mo41071y(boolean z) {
        ImageButton imageButton = this.f76984c.f49799h;
        Intrinsics.checkNotNullExpressionValue(imageButton, "binding.googlePayButton");
        C49520tu6.show$default(imageButton, z, 0, 2, null);
    }
}
