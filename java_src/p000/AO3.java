package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¨\u0006\u0016"}, m28432d2 = {"LAO3;", "", "Landroid/content/Intent;", "intent", "", "b", "", "requestCode", "resultCode", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onActivityResult", "f", "g", "e", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", C17296a.f69688o, "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AO3 */
/* loaded from: classes2.dex */
public interface AO3 {
    /* renamed from: a */
    void mo21171a(PaymentMethodNonce paymentMethodNonce);

    /* renamed from: b */
    void mo21169b(Intent intent);

    /* renamed from: c */
    void mo21167c(int i);

    /* renamed from: d */
    void mo21165d(Exception exc);

    /* renamed from: e */
    void mo21163e();

    /* renamed from: f */
    void mo21161f();

    /* renamed from: g */
    void mo21159g();

    void onActivityResult(int i, int i2, Intent intent);
}
