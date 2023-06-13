package p000;

import co.bird.android.buava.Optional;
import com.braintreepayments.api.models.PaymentMethodNonce;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"LQ04;", "Lrx4;", "Lz04;", "Lio/reactivex/Observable;", "LG10;", "m1", "Lco/bird/android/buava/Optional;", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "G1", "", "g8", "", "preAuthAmount", "Ljava/util/Currency;", "currency", "", "J2", "(Ljava/lang/Long;Ljava/util/Currency;)Ljava/lang/String;", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q04 */
/* loaded from: classes3.dex */
public interface Q04 extends InterfaceC48362rx4<InterfaceC52541z04> {
    /* renamed from: G1 */
    Observable<Optional<PaymentMethodNonce>> mo57758G1();

    /* renamed from: J2 */
    String mo57757J2(Long l, Currency currency);

    /* renamed from: g8 */
    Observable<Boolean> mo57745g8();

    /* renamed from: m1 */
    Observable<G10> mo57743m1();
}
