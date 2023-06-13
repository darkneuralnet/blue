package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/wire/configs/WebHelpCenterConfig;", "", "enabled", "", "launchInExternalBrowser", "riderHelpCenterUrl", "", "flyerHelpCenterUrl", "operatorHelpCenterUrl", "genericHelpUrls", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getEnabled", "()Z", "getFlyerHelpCenterUrl", "()Ljava/lang/String;", "getGenericHelpUrls", "getLaunchInExternalBrowser", "getOperatorHelpCenterUrl", "getRiderHelpCenterUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WebHelpCenterConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("flyer_help_center_url")
    @InterfaceC41208ft5("flyer_help_center_url")
    private final String flyerHelpCenterUrl;
    @JsonProperty("generic_help_urls")
    @InterfaceC41208ft5("generic_help_urls")
    private final boolean genericHelpUrls;
    @JsonProperty("launch_in_external_browser")
    @InterfaceC41208ft5("launch_in_external_browser")
    private final boolean launchInExternalBrowser;
    @JsonProperty("operator_help_center_url")
    @InterfaceC41208ft5("operator_help_center_url")
    private final String operatorHelpCenterUrl;
    @JsonProperty("rider_help_center_url")
    @InterfaceC41208ft5("rider_help_center_url")
    private final String riderHelpCenterUrl;

    public WebHelpCenterConfig() {
        this(false, false, null, null, null, false, 63, null);
    }

    public static /* synthetic */ WebHelpCenterConfig copy$default(WebHelpCenterConfig webHelpCenterConfig, boolean z, boolean z2, String str, String str2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webHelpCenterConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = webHelpCenterConfig.launchInExternalBrowser;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            str = webHelpCenterConfig.riderHelpCenterUrl;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = webHelpCenterConfig.flyerHelpCenterUrl;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = webHelpCenterConfig.operatorHelpCenterUrl;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z3 = webHelpCenterConfig.genericHelpUrls;
        }
        return webHelpCenterConfig.copy(z, z4, str4, str5, str6, z3);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.launchInExternalBrowser;
    }

    public final String component3() {
        return this.riderHelpCenterUrl;
    }

    public final String component4() {
        return this.flyerHelpCenterUrl;
    }

    public final String component5() {
        return this.operatorHelpCenterUrl;
    }

    public final boolean component6() {
        return this.genericHelpUrls;
    }

    public final WebHelpCenterConfig copy(boolean z, boolean z2, String str, String str2, String str3, boolean z3) {
        return new WebHelpCenterConfig(z, z2, str, str2, str3, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebHelpCenterConfig) {
            WebHelpCenterConfig webHelpCenterConfig = (WebHelpCenterConfig) obj;
            return this.enabled == webHelpCenterConfig.enabled && this.launchInExternalBrowser == webHelpCenterConfig.launchInExternalBrowser && Intrinsics.areEqual(this.riderHelpCenterUrl, webHelpCenterConfig.riderHelpCenterUrl) && Intrinsics.areEqual(this.flyerHelpCenterUrl, webHelpCenterConfig.flyerHelpCenterUrl) && Intrinsics.areEqual(this.operatorHelpCenterUrl, webHelpCenterConfig.operatorHelpCenterUrl) && this.genericHelpUrls == webHelpCenterConfig.genericHelpUrls;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFlyerHelpCenterUrl() {
        return this.flyerHelpCenterUrl;
    }

    public final boolean getGenericHelpUrls() {
        return this.genericHelpUrls;
    }

    public final boolean getLaunchInExternalBrowser() {
        return this.launchInExternalBrowser;
    }

    public final String getOperatorHelpCenterUrl() {
        return this.operatorHelpCenterUrl;
    }

    public final String getRiderHelpCenterUrl() {
        return this.riderHelpCenterUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.launchInExternalBrowser;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        String str = this.riderHelpCenterUrl;
        int hashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flyerHelpCenterUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operatorHelpCenterUrl;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.genericHelpUrls;
        return hashCode3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.launchInExternalBrowser;
        String str = this.riderHelpCenterUrl;
        String str2 = this.flyerHelpCenterUrl;
        String str3 = this.operatorHelpCenterUrl;
        boolean z3 = this.genericHelpUrls;
        return "WebHelpCenterConfig(enabled=" + z + ", launchInExternalBrowser=" + z2 + ", riderHelpCenterUrl=" + str + ", flyerHelpCenterUrl=" + str2 + ", operatorHelpCenterUrl=" + str3 + ", genericHelpUrls=" + z3 + ")";
    }

    public WebHelpCenterConfig(boolean z, boolean z2, String str, String str2, String str3, boolean z3) {
        this.enabled = z;
        this.launchInExternalBrowser = z2;
        this.riderHelpCenterUrl = str;
        this.flyerHelpCenterUrl = str2;
        this.operatorHelpCenterUrl = str3;
        this.genericHelpUrls = z3;
    }

    public /* synthetic */ WebHelpCenterConfig(boolean z, boolean z2, String str, String str2, String str3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3);
    }
}
