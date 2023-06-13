package p000;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.SetupIntentStatus;
import com.adyen.checkout.components.model.payments.response.Action;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J$\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H&¨\u0006\u001c"}, m28432d2 = {"Lpx5;", "", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "card", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lio/reactivex/c;", "e", "Lcom/google/android/gms/wallet/PaymentData;", Action.PAYMENT_DATA, "", "attachAndSetDefault", "b", "Lio/reactivex/F;", "", "f", "", "requestCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "Lco/bird/android/model/SetupIntentStatus;", C17296a.f69688o, "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: px5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC47178px5 {
    /* renamed from: a */
    Observable<SetupIntentStatus> mo18388a();

    /* renamed from: b */
    AbstractC23461c mo18387b(PaymentData paymentData, boolean z, PaymentAddSource paymentAddSource);

    /* renamed from: c */
    void mo18386c(AppCompatActivity appCompatActivity);

    /* renamed from: d */
    AbstractC23461c mo18385d(int i, Intent intent);

    /* renamed from: e */
    AbstractC23461c mo18384e(PaymentMethodCreateParams paymentMethodCreateParams, PaymentAddSource paymentAddSource);

    /* renamed from: f */
    AbstractC23442F<String> mo18383f(PaymentMethodCreateParams paymentMethodCreateParams, PaymentAddSource paymentAddSource);
}
