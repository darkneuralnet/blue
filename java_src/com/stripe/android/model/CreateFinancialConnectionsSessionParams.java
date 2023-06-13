package com.stripe.android.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "", "clientSecret", "", "customerName", "customerEmailAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getCustomerEmailAddress", "getCustomerName", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toMap", "", "toString", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CreateFinancialConnectionsSessionParams {
    public static final Companion Companion = new Companion(null);
    private static final String PARAM_CLIENT_SECRET = "client_secret";
    private static final String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
    private final String clientSecret;
    private final String customerEmailAddress;
    private final String customerName;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;", "", "()V", "PARAM_CLIENT_SECRET", "", "PARAM_PAYMENT_METHOD_DATA", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CreateFinancialConnectionsSessionParams(String clientSecret, String customerName, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(customerName, "customerName");
        this.clientSecret = clientSecret;
        this.customerName = customerName;
        this.customerEmailAddress = str;
    }

    public static /* synthetic */ CreateFinancialConnectionsSessionParams copy$default(CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFinancialConnectionsSessionParams.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = createFinancialConnectionsSessionParams.customerName;
        }
        if ((i & 4) != 0) {
            str3 = createFinancialConnectionsSessionParams.customerEmailAddress;
        }
        return createFinancialConnectionsSessionParams.copy(str, str2, str3);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.customerName;
    }

    public final String component3() {
        return this.customerEmailAddress;
    }

    public final CreateFinancialConnectionsSessionParams copy(String clientSecret, String customerName, String str) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(customerName, "customerName");
        return new CreateFinancialConnectionsSessionParams(clientSecret, customerName, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateFinancialConnectionsSessionParams) {
            CreateFinancialConnectionsSessionParams createFinancialConnectionsSessionParams = (CreateFinancialConnectionsSessionParams) obj;
            return Intrinsics.areEqual(this.clientSecret, createFinancialConnectionsSessionParams.clientSecret) && Intrinsics.areEqual(this.customerName, createFinancialConnectionsSessionParams.customerName) && Intrinsics.areEqual(this.customerEmailAddress, createFinancialConnectionsSessionParams.customerEmailAddress);
        }
        return false;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public final String getCustomerName() {
        return this.customerName;
    }

    public int hashCode() {
        int hashCode = ((this.clientSecret.hashCode() * 31) + this.customerName.hashCode()) * 31;
        String str = this.customerEmailAddress;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Map<String, Object> toMap() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("client_secret", this.clientSecret), TuplesKt.m28425to("payment_method_data", PaymentMethodCreateParams.Companion.createUSBankAccount$default(PaymentMethodCreateParams.Companion, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, this.customerName, null, 9, null), null, 2, null).toParamMap()));
        return mapOf;
    }

    public String toString() {
        String str = this.clientSecret;
        String str2 = this.customerName;
        String str3 = this.customerEmailAddress;
        return "CreateFinancialConnectionsSessionParams(clientSecret=" + str + ", customerName=" + str2 + ", customerEmailAddress=" + str3 + ")";
    }
}
