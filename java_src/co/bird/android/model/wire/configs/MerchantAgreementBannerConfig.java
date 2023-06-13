package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/configs/MerchantAgreementBannerConfig;", "", "headerTitle", "", "actionButtonTitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionButtonTitle", "()Ljava/lang/String;", "getHeaderTitle", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MerchantAgreementBannerConfig {
    @JsonProperty("action_button_title")
    @InterfaceC41208ft5("action_button_title")
    private final String actionButtonTitle;
    @JsonProperty("header_title")
    @InterfaceC41208ft5("header_title")
    private final String headerTitle;

    public MerchantAgreementBannerConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MerchantAgreementBannerConfig copy$default(MerchantAgreementBannerConfig merchantAgreementBannerConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantAgreementBannerConfig.headerTitle;
        }
        if ((i & 2) != 0) {
            str2 = merchantAgreementBannerConfig.actionButtonTitle;
        }
        return merchantAgreementBannerConfig.copy(str, str2);
    }

    public final String component1() {
        return this.headerTitle;
    }

    public final String component2() {
        return this.actionButtonTitle;
    }

    public final MerchantAgreementBannerConfig copy(String str, String str2) {
        return new MerchantAgreementBannerConfig(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MerchantAgreementBannerConfig) {
            MerchantAgreementBannerConfig merchantAgreementBannerConfig = (MerchantAgreementBannerConfig) obj;
            return Intrinsics.areEqual(this.headerTitle, merchantAgreementBannerConfig.headerTitle) && Intrinsics.areEqual(this.actionButtonTitle, merchantAgreementBannerConfig.actionButtonTitle);
        }
        return false;
    }

    public final String getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public int hashCode() {
        String str = this.headerTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionButtonTitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.headerTitle;
        String str2 = this.actionButtonTitle;
        return "MerchantAgreementBannerConfig(headerTitle=" + str + ", actionButtonTitle=" + str2 + ")";
    }

    public MerchantAgreementBannerConfig(String str, String str2) {
        this.headerTitle = str;
        this.actionButtonTitle = str2;
    }

    public /* synthetic */ MerchantAgreementBannerConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
