package p000;

import android.app.Activity;
import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Token;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u0003H&¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&J.\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¨\u0006#"}, m28432d2 = {"LiD1;", "", "Lio/reactivex/Observable;", "", "f", "Lio/reactivex/F;", "g", "Lco/bird/android/model/User;", "user", "Landroid/app/Activity;", "activity", "", "requestCode", "Ljava/util/Currency;", "currency", "", "price", "", "h", "(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V", "priceTax", "showPlusTaxDisclaimer", "e", "(Ljava/util/Currency;Ljava/lang/Long;Ljava/lang/Long;Z)V", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "attachAndSetDefault", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lio/reactivex/p;", "Lcom/stripe/android/model/Token;", "c", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC42586iD1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: iD1$a */
    /* loaded from: classes2.dex */
    public static final class C23161a {
        public static /* synthetic */ AbstractC24507p handleGooglePayActivityResult$default(InterfaceC42586iD1 interfaceC42586iD1, int i, Intent intent, boolean z, PaymentAddSource paymentAddSource, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    paymentAddSource = null;
                }
                return interfaceC42586iD1.mo16241c(i, intent, z, paymentAddSource);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleGooglePayActivityResult");
        }

        public static /* synthetic */ AbstractC23461c handleGooglePayForPaymentMethod$default(InterfaceC42586iD1 interfaceC42586iD1, int i, Intent intent, boolean z, PaymentAddSource paymentAddSource, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    paymentAddSource = null;
                }
                return interfaceC42586iD1.mo16240d(i, intent, z, paymentAddSource);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleGooglePayForPaymentMethod");
        }

        public static /* synthetic */ void performGooglePaymentRequest$default(InterfaceC42586iD1 interfaceC42586iD1, User user, Activity activity, int i, Currency currency, Long l, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performGooglePaymentRequest");
            }
            if ((i2 & 16) != 0) {
                l = null;
            }
            interfaceC42586iD1.mo16236h(user, activity, i, currency, l);
        }

        public static /* synthetic */ void performGooglePaymentRequest$default(InterfaceC42586iD1 interfaceC42586iD1, Currency currency, Long l, Long l2, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performGooglePaymentRequest");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            if ((i & 4) != 0) {
                l2 = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            interfaceC42586iD1.mo16239e(currency, l, l2, z);
        }
    }

    /* renamed from: c */
    AbstractC24507p<Token> mo16241c(int i, Intent intent, boolean z, PaymentAddSource paymentAddSource);

    /* renamed from: d */
    AbstractC23461c mo16240d(int i, Intent intent, boolean z, PaymentAddSource paymentAddSource);

    /* renamed from: e */
    void mo16239e(Currency currency, Long l, Long l2, boolean z);

    /* renamed from: f */
    Observable<Boolean> mo16238f();

    /* renamed from: g */
    AbstractC23442F<Boolean> mo16237g();

    /* renamed from: h */
    void mo16236h(User user, Activity activity, int i, Currency currency, Long l);
}
