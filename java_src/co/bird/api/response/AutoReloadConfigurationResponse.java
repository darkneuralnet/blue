package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/response/AutoReloadConfigurationResponse;", "", "amount", "", "currency", "", "optionId", "incentiveLinkCode", "enabled", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "getEnabled", "()Z", "getIncentiveLinkCode", "getOptionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AutoReloadConfigurationResponse {
    private final int amount;
    private final String currency;
    private final boolean enabled;
    private final String incentiveLinkCode;
    private final String optionId;

    public AutoReloadConfigurationResponse(int i, String currency, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amount = i;
        this.currency = currency;
        this.optionId = str;
        this.incentiveLinkCode = str2;
        this.enabled = z;
    }

    public static /* synthetic */ AutoReloadConfigurationResponse copy$default(AutoReloadConfigurationResponse autoReloadConfigurationResponse, int i, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = autoReloadConfigurationResponse.amount;
        }
        if ((i2 & 2) != 0) {
            str = autoReloadConfigurationResponse.currency;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = autoReloadConfigurationResponse.optionId;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = autoReloadConfigurationResponse.incentiveLinkCode;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            z = autoReloadConfigurationResponse.enabled;
        }
        return autoReloadConfigurationResponse.copy(i, str4, str5, str6, z);
    }

    public final int component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.optionId;
    }

    public final String component4() {
        return this.incentiveLinkCode;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final AutoReloadConfigurationResponse copy(int i, String currency, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new AutoReloadConfigurationResponse(i, currency, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoReloadConfigurationResponse) {
            AutoReloadConfigurationResponse autoReloadConfigurationResponse = (AutoReloadConfigurationResponse) obj;
            return this.amount == autoReloadConfigurationResponse.amount && Intrinsics.areEqual(this.currency, autoReloadConfigurationResponse.currency) && Intrinsics.areEqual(this.optionId, autoReloadConfigurationResponse.optionId) && Intrinsics.areEqual(this.incentiveLinkCode, autoReloadConfigurationResponse.incentiveLinkCode) && this.enabled == autoReloadConfigurationResponse.enabled;
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getIncentiveLinkCode() {
        return this.incentiveLinkCode;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.amount) * 31) + this.currency.hashCode()) * 31;
        String str = this.optionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.incentiveLinkCode;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        int i = this.amount;
        String str = this.currency;
        String str2 = this.optionId;
        String str3 = this.incentiveLinkCode;
        boolean z = this.enabled;
        return "AutoReloadConfigurationResponse(amount=" + i + ", currency=" + str + ", optionId=" + str2 + ", incentiveLinkCode=" + str3 + ", enabled=" + z + ")";
    }
}
