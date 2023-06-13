package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/configs/BankRedirectConfig;", "", "allowSufficientBalanceToStartRide", "", "minBalanceToRide", "", "reloadOptions", "", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;)V", "getAllowSufficientBalanceToStartRide", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinBalanceToRide", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReloadOptions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;)Lco/bird/android/model/wire/configs/BankRedirectConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BankRedirectConfig {
    @JsonProperty("allow_sufficient_balance_to_start_ride")
    @InterfaceC41208ft5("allow_sufficient_balance_to_start_ride")
    private final Boolean allowSufficientBalanceToStartRide;
    @JsonProperty("minimum_balance_to_ride")
    @InterfaceC41208ft5("minimum_balance_to_ride")
    private final Long minBalanceToRide;
    @JsonProperty("reload_options")
    @InterfaceC41208ft5("reload_options")
    private final List<Long> reloadOptions;

    public BankRedirectConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankRedirectConfig copy$default(BankRedirectConfig bankRedirectConfig, Boolean bool, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = bankRedirectConfig.allowSufficientBalanceToStartRide;
        }
        if ((i & 2) != 0) {
            l = bankRedirectConfig.minBalanceToRide;
        }
        if ((i & 4) != 0) {
            list = bankRedirectConfig.reloadOptions;
        }
        return bankRedirectConfig.copy(bool, l, list);
    }

    public final Boolean component1() {
        return this.allowSufficientBalanceToStartRide;
    }

    public final Long component2() {
        return this.minBalanceToRide;
    }

    public final List<Long> component3() {
        return this.reloadOptions;
    }

    public final BankRedirectConfig copy(Boolean bool, Long l, List<Long> reloadOptions) {
        Intrinsics.checkNotNullParameter(reloadOptions, "reloadOptions");
        return new BankRedirectConfig(bool, l, reloadOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankRedirectConfig) {
            BankRedirectConfig bankRedirectConfig = (BankRedirectConfig) obj;
            return Intrinsics.areEqual(this.allowSufficientBalanceToStartRide, bankRedirectConfig.allowSufficientBalanceToStartRide) && Intrinsics.areEqual(this.minBalanceToRide, bankRedirectConfig.minBalanceToRide) && Intrinsics.areEqual(this.reloadOptions, bankRedirectConfig.reloadOptions);
        }
        return false;
    }

    public final Boolean getAllowSufficientBalanceToStartRide() {
        return this.allowSufficientBalanceToStartRide;
    }

    public final Long getMinBalanceToRide() {
        return this.minBalanceToRide;
    }

    public final List<Long> getReloadOptions() {
        return this.reloadOptions;
    }

    public int hashCode() {
        Boolean bool = this.allowSufficientBalanceToStartRide;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.minBalanceToRide;
        return ((hashCode + (l != null ? l.hashCode() : 0)) * 31) + this.reloadOptions.hashCode();
    }

    public String toString() {
        Boolean bool = this.allowSufficientBalanceToStartRide;
        Long l = this.minBalanceToRide;
        List<Long> list = this.reloadOptions;
        return "BankRedirectConfig(allowSufficientBalanceToStartRide=" + bool + ", minBalanceToRide=" + l + ", reloadOptions=" + list + ")";
    }

    public BankRedirectConfig(Boolean bool, Long l, List<Long> reloadOptions) {
        Intrinsics.checkNotNullParameter(reloadOptions, "reloadOptions");
        this.allowSufficientBalanceToStartRide = bool;
        this.minBalanceToRide = l;
        this.reloadOptions = reloadOptions;
    }

    public /* synthetic */ BankRedirectConfig(Boolean bool, Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
