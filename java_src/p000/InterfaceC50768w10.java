package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.request.BraintreeTokenResponse;
import co.bird.api.request.SetDefaultProviderBody;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&JL\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0004\u0012\u00020\u00020\u000e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¨\u0006\u0011"}, m28432d2 = {"Lw10;", "", "", "userId", "Lco/bird/android/model/constant/PaymentProvider;", "kind", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/request/BraintreeTokenResponse;", DateTokenConverter.CONVERTER_KEY, "email", "nonce", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lkotlin/Pair;", "Lco/bird/api/request/SetDefaultProviderBody;", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: w10  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC50768w10 {
    /* renamed from: c */
    AbstractC23442F<Pair<HM4<SetDefaultProviderBody>, String>> mo2107c(String str, String str2, String str3, PaymentProvider paymentProvider, PaymentAddSource paymentAddSource);

    /* renamed from: d */
    AbstractC23442F<HM4<BraintreeTokenResponse>> mo2106d(String str, PaymentProvider paymentProvider);
}
