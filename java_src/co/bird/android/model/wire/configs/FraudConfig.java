package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/configs/FraudConfig;", "", "authChargeAmount", "", "(Ljava/lang/Long;)V", "getAuthChargeAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lco/bird/android/model/wire/configs/FraudConfig;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FraudConfig {
    @JsonProperty("auth_charge_amount")
    @InterfaceC41208ft5("auth_charge_amount")
    private final Long authChargeAmount;

    public FraudConfig() {
        this(null, 1, null);
    }

    public static /* synthetic */ FraudConfig copy$default(FraudConfig fraudConfig, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = fraudConfig.authChargeAmount;
        }
        return fraudConfig.copy(l);
    }

    public final Long component1() {
        return this.authChargeAmount;
    }

    public final FraudConfig copy(Long l) {
        return new FraudConfig(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FraudConfig) && Intrinsics.areEqual(this.authChargeAmount, ((FraudConfig) obj).authChargeAmount);
    }

    public final Long getAuthChargeAmount() {
        return this.authChargeAmount;
    }

    public int hashCode() {
        Long l = this.authChargeAmount;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        Long l = this.authChargeAmount;
        return "FraudConfig(authChargeAmount=" + l + ")";
    }

    public FraudConfig(Long l) {
        this.authChargeAmount = l;
    }

    public /* synthetic */ FraudConfig(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l);
    }
}
