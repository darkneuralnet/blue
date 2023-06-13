package p000;

import com.adyen.checkout.components.model.payments.request.PaymentComponentData;
import com.adyen.checkout.components.model.payments.request.PaymentMethodDetails;
/* renamed from: PL3 */
/* loaded from: classes.dex */
public abstract class PL3<PaymentMethodDetailsT extends PaymentMethodDetails> {

    /* renamed from: a */
    public final PaymentComponentData<PaymentMethodDetailsT> f28287a;

    /* renamed from: b */
    public final boolean f28288b;

    /* renamed from: c */
    public final boolean f28289c;

    public PL3(PaymentComponentData<PaymentMethodDetailsT> paymentComponentData, boolean z, boolean z2) {
        this.f28287a = paymentComponentData;
        this.f28288b = z;
        this.f28289c = z2;
    }

    /* renamed from: a */
    public PaymentComponentData<PaymentMethodDetailsT> m90451a() {
        return this.f28287a;
    }

    /* renamed from: b */
    public boolean m90450b() {
        return this.f28288b && this.f28289c;
    }
}
