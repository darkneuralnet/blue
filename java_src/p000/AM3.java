package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.CashpayResponse;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.constant.PaymentProvider;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Token;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J4\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004H&R \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001d0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140!0\u001d0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, m28432d2 = {"LAM3;", "", "Lio/reactivex/c;", "h", "", "paymentMethodId", "i", "userId", "email", "nonce", "Lco/bird/android/model/constant/PaymentProvider;", "kind", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "c", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/CashpayResponse;", DateTokenConverter.CONVERTER_KEY, "f", "Lco/bird/android/model/BirdPayment;", "payment", "g", "Lcom/stripe/android/model/Token;", "token", "v", "sourceId", "w", "LZ84;", "Lco/bird/android/buava/Optional;", "e", "()LZ84;", "defaultBirdPayment", "", "r", "stripePaymentMethods", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AM3 */
/* loaded from: classes2.dex */
public interface AM3 {
    /* renamed from: c */
    AbstractC23461c mo85680c(String str, String str2, String str3, PaymentProvider paymentProvider, PaymentAddSource paymentAddSource);

    /* renamed from: d */
    AbstractC23442F<HM4<CashpayResponse>> mo85678d();

    /* renamed from: e */
    Z84<Optional<BirdPayment>> mo85677e();

    /* renamed from: f */
    AbstractC23461c mo85675f(PaymentProvider paymentProvider);

    /* renamed from: g */
    AbstractC23461c mo85673g(BirdPayment birdPayment);

    /* renamed from: h */
    AbstractC23461c mo85670h();

    /* renamed from: i */
    AbstractC23461c mo85667i(String str);

    /* renamed from: r */
    Z84<Optional<List<BirdPayment>>> mo85657r();

    /* renamed from: v */
    AbstractC23461c mo85649v(Token token);

    /* renamed from: w */
    AbstractC23461c mo85646w(String str);
}
