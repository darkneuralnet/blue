package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/wire/configs/BountyConfig;", "", "currency", "", "chargerPowerSupplyDepositAmount", "", "bountyFilterPriceMax", "bountyFilterPriceStep", "(Ljava/lang/String;JJJ)V", "getBountyFilterPriceMax", "()J", "getBountyFilterPriceStep", "getChargerPowerSupplyDepositAmount", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyConfig {
    @JsonProperty("bounty_filter_price_max")
    @InterfaceC41208ft5("bounty_filter_price_max")
    private final long bountyFilterPriceMax;
    @JsonProperty("bounty_filter_price_step")
    @InterfaceC41208ft5("bounty_filter_price_step")
    private final long bountyFilterPriceStep;
    @JsonProperty("charger_power_supply_deposit_amount")
    @InterfaceC41208ft5("charger_power_supply_deposit_amount")
    private final long chargerPowerSupplyDepositAmount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;

    public BountyConfig() {
        this(null, 0L, 0L, 0L, 15, null);
    }

    public static /* synthetic */ BountyConfig copy$default(BountyConfig bountyConfig, String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyConfig.currency;
        }
        if ((i & 2) != 0) {
            j = bountyConfig.chargerPowerSupplyDepositAmount;
        }
        long j4 = j;
        if ((i & 4) != 0) {
            j2 = bountyConfig.bountyFilterPriceMax;
        }
        long j5 = j2;
        if ((i & 8) != 0) {
            j3 = bountyConfig.bountyFilterPriceStep;
        }
        return bountyConfig.copy(str, j4, j5, j3);
    }

    public final String component1() {
        return this.currency;
    }

    public final long component2() {
        return this.chargerPowerSupplyDepositAmount;
    }

    public final long component3() {
        return this.bountyFilterPriceMax;
    }

    public final long component4() {
        return this.bountyFilterPriceStep;
    }

    public final BountyConfig copy(String currency, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new BountyConfig(currency, j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyConfig) {
            BountyConfig bountyConfig = (BountyConfig) obj;
            return Intrinsics.areEqual(this.currency, bountyConfig.currency) && this.chargerPowerSupplyDepositAmount == bountyConfig.chargerPowerSupplyDepositAmount && this.bountyFilterPriceMax == bountyConfig.bountyFilterPriceMax && this.bountyFilterPriceStep == bountyConfig.bountyFilterPriceStep;
        }
        return false;
    }

    public final long getBountyFilterPriceMax() {
        return this.bountyFilterPriceMax;
    }

    public final long getBountyFilterPriceStep() {
        return this.bountyFilterPriceStep;
    }

    public final long getChargerPowerSupplyDepositAmount() {
        return this.chargerPowerSupplyDepositAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (((((this.currency.hashCode() * 31) + Long.hashCode(this.chargerPowerSupplyDepositAmount)) * 31) + Long.hashCode(this.bountyFilterPriceMax)) * 31) + Long.hashCode(this.bountyFilterPriceStep);
    }

    public String toString() {
        String str = this.currency;
        long j = this.chargerPowerSupplyDepositAmount;
        long j2 = this.bountyFilterPriceMax;
        long j3 = this.bountyFilterPriceStep;
        return "BountyConfig(currency=" + str + ", chargerPowerSupplyDepositAmount=" + j + ", bountyFilterPriceMax=" + j2 + ", bountyFilterPriceStep=" + j3 + ")";
    }

    public BountyConfig(String currency, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.chargerPowerSupplyDepositAmount = j;
        this.bountyFilterPriceMax = j2;
        this.bountyFilterPriceStep = j3;
    }

    public /* synthetic */ BountyConfig(String str, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Source.USD : str, (i & 2) != 0 ? 1000L : j, (i & 4) != 0 ? 2000L : j2, (i & 8) != 0 ? 100L : j3);
    }
}
