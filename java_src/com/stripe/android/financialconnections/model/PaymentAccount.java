package com.stripe.android.financialconnections.model;

import android.os.Parcelable;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@InterfaceC36928Ws5(with = PaymentAccountSerializer.class)
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccount;", "Landroid/os/Parcelable;", "()V", "Companion", "Lcom/stripe/android/financialconnections/model/BankAccount;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentAccount implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/PaymentAccount$Companion;", "", "LKj2;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "serializer", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<PaymentAccount> serializer() {
            return PaymentAccountSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentAccount(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentAccount() {
    }
}
