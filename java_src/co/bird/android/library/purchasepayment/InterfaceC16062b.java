package co.bird.android.library.purchasepayment;

import android.app.Activity;
import co.bird.android.model.PaymentAddSource;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/library/purchasepayment/b;", "", "Lco/bird/android/library/purchasepayment/PurchasePaymentActivity;", "activity", "", C17296a.f69688o, "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.library.purchasepayment.b */
/* loaded from: classes3.dex */
public interface InterfaceC16062b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, m28432d2 = {"Lco/bird/android/library/purchasepayment/b$a;", "", "LlG2;", "mainComponent", "Landroid/app/Activity;", "activity", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/library/purchasepayment/b;", C17296a.f69688o, "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.library.purchasepayment.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC16063a {
        /* renamed from: a */
        InterfaceC16062b mo55979a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance Activity activity, @BindsInstance PaymentAddSource paymentAddSource);
    }

    /* renamed from: a */
    void mo55980a(PurchasePaymentActivity purchasePaymentActivity);
}
