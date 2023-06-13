package com.stripe.android.financialconnections.model.serializer;

import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PaymentAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;", "Lki2;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "Lxi2;", "element", "LKj2;", "selectDeserializer", "", "getObjectValue", "(Lxi2;)Ljava/lang/String;", "objectValue", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentAccountSerializer extends AbstractC44060ki2<PaymentAccount> {
    public static final PaymentAccountSerializer INSTANCE = new PaymentAccountSerializer();

    private PaymentAccountSerializer() {
        super(Reflection.getOrCreateKotlinClass(PaymentAccount.class));
    }

    private final String getObjectValue(AbstractC51767xi2 abstractC51767xi2) {
        AbstractC37303Yi2 m521l;
        AbstractC51767xi2 abstractC51767xi22 = (AbstractC51767xi2) C52953zi2.m522k(abstractC51767xi2).get("object");
        if (abstractC51767xi22 == null || (m521l = C52953zi2.m521l(abstractC51767xi22)) == null) {
            return null;
        }
        return m521l.mo74434a();
    }

    @Override // p000.AbstractC44060ki2
    public E01<PaymentAccount> selectDeserializer(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String objectValue = getObjectValue(element);
        return Intrinsics.areEqual(objectValue, "linked_account") ? true : Intrinsics.areEqual(objectValue, FinancialConnectionsAccount.OBJECT_NEW) ? FinancialConnectionsAccount.Companion.serializer() : BankAccount.Companion.serializer();
    }
}
