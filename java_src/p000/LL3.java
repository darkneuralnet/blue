package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.CashpayResponse;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.request.BirdCustomer;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.request.ConfirmCardSetupIntentRequest;
import co.bird.api.request.CreateCustomerBody;
import co.bird.api.request.DefaultPaymentProviderResponse;
import co.bird.api.request.GeneratePaymentTokenBody;
import co.bird.api.request.SetDefaultProviderBody;
import co.bird.api.response.CreateCardSetupIntentResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00050\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0015H'J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u0004H'J\u001c\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u001aH'¨\u0006\u001f"}, m28432d2 = {"LLL3;", "", "Lco/bird/api/request/GeneratePaymentTokenBody;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", "e", "Lco/bird/api/request/CreateCustomerBody;", "Lco/bird/api/request/BirdCustomer;", "m", "Lco/bird/api/request/DefaultPaymentProviderResponse;", "k", "Lco/bird/api/request/SetDefaultProviderBody;", "l", "Lco/bird/android/model/constant/PaymentProvider;", "provider", "f", "j", "Lco/bird/api/response/CreateCardSetupIntentResponse;", "i", "Lco/bird/api/request/ConfirmCardSetupIntentRequest;", "", "h", "Lco/bird/android/model/CashpayResponse;", DateTokenConverter.CONVERTER_KEY, "", "kind", "paymentMethodId", "Lio/reactivex/c;", "g", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: LL3 */
/* loaded from: classes4.dex */
public interface LL3 {
    @NA1("v1/payment/provider/cashpay")
    /* renamed from: d */
    AbstractC23442F<HM4<CashpayResponse>> m97050d();

    @AD3("v1/payment/provider/token")
    /* renamed from: e */
    AbstractC23442F<HM4<BraintreeTokenResponse>> m97049e(@InterfaceC6404PY GeneratePaymentTokenBody generatePaymentTokenBody);

    @NA1("v1/payment/provider/customer")
    /* renamed from: f */
    AbstractC23442F<BirdCustomer> m97048f(@InterfaceC37017Xc4("kind") PaymentProvider paymentProvider);

    @KF0("v1/payment/provider/payment-method")
    /* renamed from: g */
    AbstractC23461c m97047g(@InterfaceC37017Xc4("kind") String str, @InterfaceC37017Xc4("payment_method_id") String str2);

    @AD3("v1/payment/provider/card-confirm")
    /* renamed from: h */
    AbstractC23442F<HM4<Unit>> m97046h(@InterfaceC6404PY ConfirmCardSetupIntentRequest confirmCardSetupIntentRequest);

    @AD3("v1/payment/provider/card")
    /* renamed from: i */
    AbstractC23442F<CreateCardSetupIntentResponse> m97045i();

    @KF0("v1/payment/provider/customer")
    /* renamed from: j */
    AbstractC23442F<HM4<Object>> m97044j(@InterfaceC37017Xc4("kind") PaymentProvider paymentProvider);

    @NA1("v1/payment/provider/default")
    /* renamed from: k */
    AbstractC23442F<DefaultPaymentProviderResponse> m97043k();

    @CD3("v1/payment/provider/default")
    /* renamed from: l */
    AbstractC23442F<HM4<SetDefaultProviderBody>> m97042l(@InterfaceC6404PY SetDefaultProviderBody setDefaultProviderBody);

    @AD3("v1/payment/provider/customer")
    /* renamed from: m */
    AbstractC23442F<HM4<BirdCustomer>> m97041m(@InterfaceC6404PY CreateCustomerBody createCustomerBody);
}
