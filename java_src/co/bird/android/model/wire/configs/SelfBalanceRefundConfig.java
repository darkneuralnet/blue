package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;", "", "enabled", "", "zendeskArticleId", "", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getZendeskArticleId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lco/bird/android/model/wire/configs/SelfBalanceRefundConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SelfBalanceRefundConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final Boolean enabled;
    @JsonProperty("zendesk_article_id")
    @InterfaceC41208ft5("zendesk_article_id")
    private final String zendeskArticleId;

    public SelfBalanceRefundConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SelfBalanceRefundConfig copy$default(SelfBalanceRefundConfig selfBalanceRefundConfig, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = selfBalanceRefundConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = selfBalanceRefundConfig.zendeskArticleId;
        }
        return selfBalanceRefundConfig.copy(bool, str);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.zendeskArticleId;
    }

    public final SelfBalanceRefundConfig copy(Boolean bool, String str) {
        return new SelfBalanceRefundConfig(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelfBalanceRefundConfig) {
            SelfBalanceRefundConfig selfBalanceRefundConfig = (SelfBalanceRefundConfig) obj;
            return Intrinsics.areEqual(this.enabled, selfBalanceRefundConfig.enabled) && Intrinsics.areEqual(this.zendeskArticleId, selfBalanceRefundConfig.zendeskArticleId);
        }
        return false;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.zendeskArticleId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        String str = this.zendeskArticleId;
        return "SelfBalanceRefundConfig(enabled=" + bool + ", zendeskArticleId=" + str + ")";
    }

    public SelfBalanceRefundConfig(Boolean bool, String str) {
        this.enabled = bool;
        this.zendeskArticleId = str;
    }

    public /* synthetic */ SelfBalanceRefundConfig(Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }
}
