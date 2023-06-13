package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.model.payments.request.CardPaymentMethod;
import com.adyen.checkout.components.model.payments.request.PaymentComponentData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0019"}, m28432d2 = {"LCf0;", "LPL3;", "Lcom/adyen/checkout/components/model/payments/request/CardPaymentMethod;", "LXf0;", DateTokenConverter.CONVERTER_KEY, "LXf0;", "getCardType", "()LXf0;", "cardType", "", "e", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "binValue", "f", "getLastFourDigits", "lastFourDigits", "Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;", "paymentComponentData", "", "isInputValid", "isReady", "<init>", "(Lcom/adyen/checkout/components/model/payments/request/PaymentComponentData;ZZLXf0;Ljava/lang/String;Ljava/lang/String;)V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Cf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32126Cf0 extends PL3<CardPaymentMethod> {

    /* renamed from: d */
    public final EnumC37040Xf0 f4439d;

    /* renamed from: e */
    public final String f4440e;

    /* renamed from: f */
    public final String f4441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32126Cf0(PaymentComponentData<CardPaymentMethod> paymentComponentData, boolean z, boolean z2, EnumC37040Xf0 enumC37040Xf0, String binValue, String str) {
        super(paymentComponentData, z, z2);
        Intrinsics.checkNotNullParameter(paymentComponentData, "paymentComponentData");
        Intrinsics.checkNotNullParameter(binValue, "binValue");
        this.f4439d = enumC37040Xf0;
        this.f4440e = binValue;
        this.f4441f = str;
    }

    /* renamed from: c */
    public final String m111925c() {
        return this.f4440e;
    }
}
