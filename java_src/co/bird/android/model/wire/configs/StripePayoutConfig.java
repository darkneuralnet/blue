package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/configs/StripePayoutConfig;", "", "publishableKey", "", "currency", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getPublishableKey", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class StripePayoutConfig {
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty(AnalyticsFields.PUBLISHABLE_KEY)
    @InterfaceC41208ft5(AnalyticsFields.PUBLISHABLE_KEY)
    private final String publishableKey;

    public StripePayoutConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ StripePayoutConfig copy$default(StripePayoutConfig stripePayoutConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripePayoutConfig.publishableKey;
        }
        if ((i & 2) != 0) {
            str2 = stripePayoutConfig.currency;
        }
        return stripePayoutConfig.copy(str, str2);
    }

    public final String component1() {
        return this.publishableKey;
    }

    public final String component2() {
        return this.currency;
    }

    public final StripePayoutConfig copy(String publishableKey, String currency) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new StripePayoutConfig(publishableKey, currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripePayoutConfig) {
            StripePayoutConfig stripePayoutConfig = (StripePayoutConfig) obj;
            return Intrinsics.areEqual(this.publishableKey, stripePayoutConfig.publishableKey) && Intrinsics.areEqual(this.currency, stripePayoutConfig.currency);
        }
        return false;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public int hashCode() {
        return (this.publishableKey.hashCode() * 31) + this.currency.hashCode();
    }

    public String toString() {
        String str = this.publishableKey;
        String str2 = this.currency;
        return "StripePayoutConfig(publishableKey=" + str + ", currency=" + str2 + ")";
    }

    public StripePayoutConfig(String publishableKey, String currency) {
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.publishableKey = publishableKey;
        this.currency = currency;
    }

    public /* synthetic */ StripePayoutConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
