package com.stripe.android.p049ui.core.forms.resources;

import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepository$supportedPaymentMethods$2 */
/* loaded from: classes7.dex */
public final class LpmRepository$supportedPaymentMethods$2 extends Lambda implements Function0<List<? extends String>> {
    public static final LpmRepository$supportedPaymentMethods$2 INSTANCE = new LpmRepository$supportedPaymentMethods$2();

    public LpmRepository$supportedPaymentMethods$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        List<? extends String> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{PaymentMethod.Type.Card.code, PaymentMethod.Type.Bancontact.code, PaymentMethod.Type.Sofort.code, PaymentMethod.Type.Ideal.code, PaymentMethod.Type.SepaDebit.code, PaymentMethod.Type.Eps.code, PaymentMethod.Type.Giropay.code, PaymentMethod.Type.P24.code, PaymentMethod.Type.Klarna.code, PaymentMethod.Type.PayPal.code, PaymentMethod.Type.AfterpayClearpay.code, PaymentMethod.Type.USBankAccount.code, PaymentMethod.Type.Affirm.code, PaymentMethod.Type.RevolutPay.code, PaymentMethod.Type.MobilePay.code, PaymentMethod.Type.Zip.code, PaymentMethod.Type.AuBecsDebit.code, PaymentMethod.Type.Upi.code, PaymentMethod.Type.CashAppPay.code});
        return listOf;
    }
}
