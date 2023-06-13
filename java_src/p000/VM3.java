package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.AdyenCard;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.constant.PaymentInfoBank;
import co.bird.android.model.constant.PaymentInfoParams;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.request.BankRedirectOneTimeRefillResponse;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.PreloadAndMaybeConfigureAutoReloadResponse;
import co.bird.api.response.ReceiptDetailResponse;
import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.ReloadOption;
import co.bird.api.response.SavedPaymentMethodResponse;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.core.api.Environment;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
@Metadata(m28433d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH&J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H&J0\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00072\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010#\u001a\u00020\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0006\u0010$\u001a\u00020\u0004H&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00072\u0006\u0010$\u001a\u00020\u0004H&J&\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040)H&J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00072\u0006\u0010.\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\nH&J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0012\u00104\u001a\u0004\u0018\u00010\u00022\u0006\u00103\u001a\u000202H&J\u0019\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u0002082\u0006\u0010\u000b\u001a\u00020\nH&J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H&J\b\u0010<\u001a\u00020;H&J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H&J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H&J\b\u0010?\u001a\u00020\"H&J\b\u0010@\u001a\u00020\"H&J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010A\u001a\u00020\u0004H&J\u0014\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\f0\u0017H&J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010A\u001a\u00020\u0004H&J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\f2\u0006\u0010\u000b\u001a\u00020\nH&J(\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010I\u001a\u00020HH&R \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00180K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00180K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010N¨\u0006R"}, m28432d2 = {"LVM3;", "", "Lco/bird/android/model/AdyenCard;", "adyenCard", "", "dateOfBirth", "passcode", "Lio/reactivex/F;", "Lco/bird/api/response/SavedPaymentMethodResponse;", "z", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "", "Lco/bird/android/model/constant/PaymentInfoParams;", DateTokenConverter.CONVERTER_KEY, "nonce", "paypalEmail", "q", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "Lcom/adyen/checkout/core/api/Environment;", "f", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadOption;", "t", "optionId", "", "enableAutoReload", "intentId", "LHM4;", "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "l", "Lio/reactivex/c;", "r", "receiptId", "Lco/bird/api/response/ReceiptDetailResponse;", "w", "Lco/bird/api/response/DownloadRideReceiptResponse;", C17296a.f69688o, "", "metadata", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "k", "", "amount", "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "s", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LCf0;", "cardComponentState", "v", "", "c", "(Lco/bird/android/model/constant/PaymentMethod;)Ljava/lang/Integer;", "Lco/bird/android/model/constant/PaymentProvider;", "p", "x", "LR04;", "m", "y", "h", "j", "A", "paymentMethodId", "u", "Lco/bird/android/model/BirdPayment;", "b", "o", "Lco/bird/android/model/constant/PaymentInfoBank;", "n", "Lcom/adyen/checkout/card/CardConfiguration;", "cardConfiguration", "B", "LZ84;", "Lco/bird/api/response/ReloadConfigResponse;", "i", "()LZ84;", "availablePreloadConfig", "e", "defaultBirdPayment", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VM3 */
/* loaded from: classes2.dex */
public interface VM3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VM3$a */
    /* loaded from: classes2.dex */
    public static final class C8609a {
        public static /* synthetic */ AbstractC23442F addCardAdyen$default(VM3 vm3, AdyenCard adyenCard, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return vm3.mo25708z(adyenCard, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCardAdyen");
        }

        public static /* synthetic */ AbstractC23442F configurePreloadAndMaybeAutoReload$default(VM3 vm3, String str, boolean z, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return vm3.mo25731l(str, z, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configurePreloadAndMaybeAutoReload");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams createBankRedirectPaymentMethodCreateParams$default(VM3 vm3, PaymentMethod paymentMethod, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                return vm3.mo25733k(paymentMethod, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBankRedirectPaymentMethodCreateParams");
        }
    }

    /* renamed from: A */
    AbstractC23461c mo25779A();

    /* renamed from: B */
    AbstractC23442F<Boolean> mo25778B(Context context, C32126Cf0 c32126Cf0, CardConfiguration cardConfiguration);

    /* renamed from: C */
    AbstractC23442F<SavedPaymentMethodResponse> mo25777C();

    /* renamed from: a */
    AbstractC23442F<DownloadRideReceiptResponse> mo25753a(String str);

    /* renamed from: b */
    Observable<List<BirdPayment>> mo25751b();

    /* renamed from: c */
    Integer mo25749c(PaymentMethod paymentMethod);

    /* renamed from: d */
    List<PaymentInfoParams> mo25747d(PaymentMethod paymentMethod);

    /* renamed from: e */
    Z84<Optional<BirdPayment>> mo25745e();

    /* renamed from: f */
    Environment mo25743f();

    /* renamed from: g */
    String mo25741g(Context context);

    /* renamed from: h */
    AbstractC23442F<Boolean> mo25739h();

    /* renamed from: i */
    Z84<Optional<ReloadConfigResponse>> mo25737i();

    /* renamed from: j */
    AbstractC23461c mo25735j();

    /* renamed from: k */
    PaymentMethodCreateParams mo25733k(PaymentMethod paymentMethod, Map<PaymentInfoParams, String> map);

    /* renamed from: l */
    AbstractC23442F<HM4<PreloadAndMaybeConfigureAutoReloadResponse>> mo25731l(String str, boolean z, String str2);

    /* renamed from: m */
    R04 mo25729m();

    /* renamed from: n */
    List<PaymentInfoBank> mo25727n(PaymentMethod paymentMethod);

    /* renamed from: o */
    AbstractC23442F<SavedPaymentMethodResponse> mo25725o(String str);

    /* renamed from: p */
    PaymentProvider mo25723p(PaymentMethod paymentMethod);

    /* renamed from: q */
    AbstractC23442F<SavedPaymentMethodResponse> mo25721q(String str, String str2);

    /* renamed from: r */
    AbstractC23461c mo25719r(String str, boolean z);

    /* renamed from: s */
    AbstractC23442F<BankRedirectOneTimeRefillResponse> mo25717s(long j, PaymentMethod paymentMethod);

    /* renamed from: t */
    Observable<Optional<ReloadOption>> mo25715t();

    /* renamed from: u */
    AbstractC23442F<SavedPaymentMethodResponse> mo25713u(String str);

    /* renamed from: v */
    AdyenCard mo25712v(C32126Cf0 c32126Cf0);

    /* renamed from: w */
    AbstractC23442F<ReceiptDetailResponse> mo25711w(String str);

    /* renamed from: x */
    AbstractC23442F<Boolean> mo25710x();

    /* renamed from: y */
    AbstractC23442F<Boolean> mo25709y();

    /* renamed from: z */
    AbstractC23442F<SavedPaymentMethodResponse> mo25708z(AdyenCard adyenCard, String str, String str2);
}
