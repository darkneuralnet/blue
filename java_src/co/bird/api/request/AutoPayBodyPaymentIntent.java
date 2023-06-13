package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/request/AutoPayBodyPaymentIntent;", "", "autoPayAsked", "", "autoPayActive", "autoPayPlan", "", "intentId", "paymentMethodId", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutoPayActive", "()Z", "getAutoPayAsked", "getAutoPayPlan", "()Ljava/lang/String;", "getIntentId", "getPaymentMethodId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AutoPayBodyPaymentIntent {
    @JsonProperty("auto_pay_active")
    @InterfaceC41208ft5("auto_pay_active")
    private final boolean autoPayActive;
    @JsonProperty("auto_pay_asked")
    @InterfaceC41208ft5("auto_pay_asked")
    private final boolean autoPayAsked;
    @JsonProperty("auto_pay_plan")
    @InterfaceC41208ft5("auto_pay_plan")
    private final String autoPayPlan;
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;
    @JsonProperty("payment_method_id")
    @InterfaceC41208ft5("payment_method_id")
    private final String paymentMethodId;

    public AutoPayBodyPaymentIntent(boolean z, boolean z2, String str, String str2, String str3) {
        this.autoPayAsked = z;
        this.autoPayActive = z2;
        this.autoPayPlan = str;
        this.intentId = str2;
        this.paymentMethodId = str3;
    }

    public static /* synthetic */ AutoPayBodyPaymentIntent copy$default(AutoPayBodyPaymentIntent autoPayBodyPaymentIntent, boolean z, boolean z2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoPayBodyPaymentIntent.autoPayAsked;
        }
        if ((i & 2) != 0) {
            z2 = autoPayBodyPaymentIntent.autoPayActive;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = autoPayBodyPaymentIntent.autoPayPlan;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = autoPayBodyPaymentIntent.intentId;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = autoPayBodyPaymentIntent.paymentMethodId;
        }
        return autoPayBodyPaymentIntent.copy(z, z3, str4, str5, str3);
    }

    public final boolean component1() {
        return this.autoPayAsked;
    }

    public final boolean component2() {
        return this.autoPayActive;
    }

    public final String component3() {
        return this.autoPayPlan;
    }

    public final String component4() {
        return this.intentId;
    }

    public final String component5() {
        return this.paymentMethodId;
    }

    public final AutoPayBodyPaymentIntent copy(boolean z, boolean z2, String str, String str2, String str3) {
        return new AutoPayBodyPaymentIntent(z, z2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoPayBodyPaymentIntent) {
            AutoPayBodyPaymentIntent autoPayBodyPaymentIntent = (AutoPayBodyPaymentIntent) obj;
            return this.autoPayAsked == autoPayBodyPaymentIntent.autoPayAsked && this.autoPayActive == autoPayBodyPaymentIntent.autoPayActive && Intrinsics.areEqual(this.autoPayPlan, autoPayBodyPaymentIntent.autoPayPlan) && Intrinsics.areEqual(this.intentId, autoPayBodyPaymentIntent.intentId) && Intrinsics.areEqual(this.paymentMethodId, autoPayBodyPaymentIntent.paymentMethodId);
        }
        return false;
    }

    public final boolean getAutoPayActive() {
        return this.autoPayActive;
    }

    public final boolean getAutoPayAsked() {
        return this.autoPayAsked;
    }

    public final String getAutoPayPlan() {
        return this.autoPayPlan;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.autoPayAsked;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.autoPayActive;
        int i2 = (i + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str = this.autoPayPlan;
        int hashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.intentId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.autoPayAsked;
        boolean z2 = this.autoPayActive;
        String str = this.autoPayPlan;
        String str2 = this.intentId;
        String str3 = this.paymentMethodId;
        return "AutoPayBodyPaymentIntent(autoPayAsked=" + z + ", autoPayActive=" + z2 + ", autoPayPlan=" + str + ", intentId=" + str2 + ", paymentMethodId=" + str3 + ")";
    }

    public /* synthetic */ AutoPayBodyPaymentIntent(boolean z, boolean z2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
