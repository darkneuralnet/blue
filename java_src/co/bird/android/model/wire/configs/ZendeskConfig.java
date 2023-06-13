package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ZendeskConfig;", "", "webHelpCenter", "Lco/bird/android/model/wire/configs/WebHelpCenterConfig;", "signInScreenHelpUrl", "", "(Lco/bird/android/model/wire/configs/WebHelpCenterConfig;Ljava/lang/String;)V", "getSignInScreenHelpUrl", "()Ljava/lang/String;", "getWebHelpCenter", "()Lco/bird/android/model/wire/configs/WebHelpCenterConfig;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZendeskConfig {
    @JsonProperty("sign_in_screen_help_url")
    @InterfaceC41208ft5("sign_in_screen_help_url")
    private final String signInScreenHelpUrl;
    @JsonProperty("web_help_center")
    @InterfaceC41208ft5("web_help_center")
    private final WebHelpCenterConfig webHelpCenter;

    public ZendeskConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ZendeskConfig copy$default(ZendeskConfig zendeskConfig, WebHelpCenterConfig webHelpCenterConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            webHelpCenterConfig = zendeskConfig.webHelpCenter;
        }
        if ((i & 2) != 0) {
            str = zendeskConfig.signInScreenHelpUrl;
        }
        return zendeskConfig.copy(webHelpCenterConfig, str);
    }

    public final WebHelpCenterConfig component1() {
        return this.webHelpCenter;
    }

    public final String component2() {
        return this.signInScreenHelpUrl;
    }

    public final ZendeskConfig copy(WebHelpCenterConfig webHelpCenter, String str) {
        Intrinsics.checkNotNullParameter(webHelpCenter, "webHelpCenter");
        return new ZendeskConfig(webHelpCenter, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZendeskConfig) {
            ZendeskConfig zendeskConfig = (ZendeskConfig) obj;
            return Intrinsics.areEqual(this.webHelpCenter, zendeskConfig.webHelpCenter) && Intrinsics.areEqual(this.signInScreenHelpUrl, zendeskConfig.signInScreenHelpUrl);
        }
        return false;
    }

    public final String getSignInScreenHelpUrl() {
        return this.signInScreenHelpUrl;
    }

    public final WebHelpCenterConfig getWebHelpCenter() {
        return this.webHelpCenter;
    }

    public int hashCode() {
        int hashCode = this.webHelpCenter.hashCode() * 31;
        String str = this.signInScreenHelpUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        WebHelpCenterConfig webHelpCenterConfig = this.webHelpCenter;
        String str = this.signInScreenHelpUrl;
        return "ZendeskConfig(webHelpCenter=" + webHelpCenterConfig + ", signInScreenHelpUrl=" + str + ")";
    }

    public ZendeskConfig(WebHelpCenterConfig webHelpCenter, String str) {
        Intrinsics.checkNotNullParameter(webHelpCenter, "webHelpCenter");
        this.webHelpCenter = webHelpCenter;
        this.signInScreenHelpUrl = str;
    }

    public /* synthetic */ ZendeskConfig(WebHelpCenterConfig webHelpCenterConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WebHelpCenterConfig(false, false, null, null, null, false, 63, null) : webHelpCenterConfig, (i & 2) != 0 ? null : str);
    }
}
