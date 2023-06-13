package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/FrequentFlyerConfig;", "", "enabled", "", "mapPillDisplayTime", "", "faqZendeskArticleId", "", "termsZendeskArticleId", "(ZDLjava/lang/String;Ljava/lang/String;)V", "getEnabled", "()Z", "getFaqZendeskArticleId", "()Ljava/lang/String;", "getMapPillDisplayTime", "()D", "getTermsZendeskArticleId", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FrequentFlyerConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("faq_zendesk_article_id")
    @InterfaceC41208ft5("faq_zendesk_article_id")
    private final String faqZendeskArticleId;
    @JsonProperty("map_pill_display_time")
    @InterfaceC41208ft5("map_pill_display_time")
    private final double mapPillDisplayTime;
    @JsonProperty("terms_zendesk_article_id")
    @InterfaceC41208ft5("terms_zendesk_article_id")
    private final String termsZendeskArticleId;

    public FrequentFlyerConfig() {
        this(false, 0.0d, null, null, 15, null);
    }

    public static /* synthetic */ FrequentFlyerConfig copy$default(FrequentFlyerConfig frequentFlyerConfig, boolean z, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = frequentFlyerConfig.enabled;
        }
        if ((i & 2) != 0) {
            d = frequentFlyerConfig.mapPillDisplayTime;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str = frequentFlyerConfig.faqZendeskArticleId;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = frequentFlyerConfig.termsZendeskArticleId;
        }
        return frequentFlyerConfig.copy(z, d2, str3, str2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final double component2() {
        return this.mapPillDisplayTime;
    }

    public final String component3() {
        return this.faqZendeskArticleId;
    }

    public final String component4() {
        return this.termsZendeskArticleId;
    }

    public final FrequentFlyerConfig copy(boolean z, double d, String str, String str2) {
        return new FrequentFlyerConfig(z, d, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FrequentFlyerConfig) {
            FrequentFlyerConfig frequentFlyerConfig = (FrequentFlyerConfig) obj;
            return this.enabled == frequentFlyerConfig.enabled && Double.compare(this.mapPillDisplayTime, frequentFlyerConfig.mapPillDisplayTime) == 0 && Intrinsics.areEqual(this.faqZendeskArticleId, frequentFlyerConfig.faqZendeskArticleId) && Intrinsics.areEqual(this.termsZendeskArticleId, frequentFlyerConfig.termsZendeskArticleId);
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFaqZendeskArticleId() {
        return this.faqZendeskArticleId;
    }

    public final double getMapPillDisplayTime() {
        return this.mapPillDisplayTime;
    }

    public final String getTermsZendeskArticleId() {
        return this.termsZendeskArticleId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + Double.hashCode(this.mapPillDisplayTime)) * 31;
        String str = this.faqZendeskArticleId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.termsZendeskArticleId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        double d = this.mapPillDisplayTime;
        String str = this.faqZendeskArticleId;
        String str2 = this.termsZendeskArticleId;
        return "FrequentFlyerConfig(enabled=" + z + ", mapPillDisplayTime=" + d + ", faqZendeskArticleId=" + str + ", termsZendeskArticleId=" + str2 + ")";
    }

    public FrequentFlyerConfig(boolean z, double d, String str, String str2) {
        this.enabled = z;
        this.mapPillDisplayTime = d;
        this.faqZendeskArticleId = str;
        this.termsZendeskArticleId = str2;
    }

    public /* synthetic */ FrequentFlyerConfig(boolean z, double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 10.0d : d, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
