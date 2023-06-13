package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\"\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0014\u0010\u0012\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H&¨\u0006\u0013"}, m28432d2 = {"LQd1;", "", "", "e", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onActivityResult", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", C17296a.f69688o, "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qd1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC35385Qd1 {
    /* renamed from: a */
    void mo33691a(PaymentMethodNonce paymentMethodNonce);

    /* renamed from: c */
    void mo33689c(int i);

    /* renamed from: d */
    void mo33688d(Exception exc);

    /* renamed from: e */
    void mo33687e();

    void onActivityResult(int i, int i2, Intent intent);

    void onResume();
}
