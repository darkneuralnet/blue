package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b%\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u0006."}, m28432d2 = {"Lco/bird/android/model/wire/configs/ZigZagConfig;", "", "enabled", "", "_feedUrl", "", "useTestFeedUrl", "centerIds", "", "", "_partnerId", "useTestPartnerId", "_deeplinkUrl", "useTestDeeplinkUrl", "(ZLjava/lang/String;ZLjava/util/List;Ljava/lang/String;ZLjava/lang/String;Z)V", "get_deeplinkUrl", "()Ljava/lang/String;", "get_feedUrl", "get_partnerId", "getCenterIds", "()Ljava/util/List;", "deeplinkUrl", "getDeeplinkUrl", "getEnabled", "()Z", "feedUrl", "getFeedUrl", "partnerId", "getPartnerId", "getUseTestDeeplinkUrl", "getUseTestFeedUrl", "getUseTestPartnerId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "Companion", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZigZagConfig {
    public static final Companion Companion = new Companion(null);
    private static final String TEST_DEEPLINK_URL = "zigzag://qrcode.zigzagsharing.com";
    private static final String TEST_FEED_URL = "https://zigzag-75e51.firebaseio.com/zigzag/fleet2.json";
    private static final String TEST_PARTNER_ID = "12760fa2-628c-41e4-bb62-cb41acaabb17";
    @JsonProperty("deeplink_url")
    @InterfaceC41208ft5("deeplink_url")
    private final String _deeplinkUrl;
    @JsonProperty("feed_url")
    @InterfaceC41208ft5("feed_url")
    private final String _feedUrl;
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String _partnerId;
    @JsonProperty("center_ids")
    @InterfaceC41208ft5("center_ids")
    private final List<Integer> centerIds;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    private final boolean useTestDeeplinkUrl;
    private final boolean useTestFeedUrl;
    private final boolean useTestPartnerId;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ZigZagConfig$Companion;", "", "()V", "TEST_DEEPLINK_URL", "", "TEST_FEED_URL", "TEST_PARTNER_ID", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ZigZagConfig() {
        this(false, null, false, null, null, false, null, false, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this._feedUrl;
    }

    public final boolean component3() {
        return this.useTestFeedUrl;
    }

    public final List<Integer> component4() {
        return this.centerIds;
    }

    public final String component5() {
        return this._partnerId;
    }

    public final boolean component6() {
        return this.useTestPartnerId;
    }

    public final String component7() {
        return this._deeplinkUrl;
    }

    public final boolean component8() {
        return this.useTestDeeplinkUrl;
    }

    public final ZigZagConfig copy(boolean z, String str, boolean z2, List<Integer> centerIds, String str2, boolean z3, String str3, boolean z4) {
        Intrinsics.checkNotNullParameter(centerIds, "centerIds");
        return new ZigZagConfig(z, str, z2, centerIds, str2, z3, str3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZigZagConfig) {
            ZigZagConfig zigZagConfig = (ZigZagConfig) obj;
            return this.enabled == zigZagConfig.enabled && Intrinsics.areEqual(this._feedUrl, zigZagConfig._feedUrl) && this.useTestFeedUrl == zigZagConfig.useTestFeedUrl && Intrinsics.areEqual(this.centerIds, zigZagConfig.centerIds) && Intrinsics.areEqual(this._partnerId, zigZagConfig._partnerId) && this.useTestPartnerId == zigZagConfig.useTestPartnerId && Intrinsics.areEqual(this._deeplinkUrl, zigZagConfig._deeplinkUrl) && this.useTestDeeplinkUrl == zigZagConfig.useTestDeeplinkUrl;
        }
        return false;
    }

    public final List<Integer> getCenterIds() {
        return this.centerIds;
    }

    @JsonIgnore
    public final String getDeeplinkUrl() {
        if (this.useTestDeeplinkUrl) {
            return TEST_DEEPLINK_URL;
        }
        return this._deeplinkUrl;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @JsonIgnore
    public final String getFeedUrl() {
        if (this.useTestFeedUrl) {
            return TEST_FEED_URL;
        }
        return this._feedUrl;
    }

    @JsonIgnore
    public final String getPartnerId() {
        if (this.useTestPartnerId) {
            return TEST_PARTNER_ID;
        }
        return this._partnerId;
    }

    public final boolean getUseTestDeeplinkUrl() {
        return this.useTestDeeplinkUrl;
    }

    public final boolean getUseTestFeedUrl() {
        return this.useTestFeedUrl;
    }

    public final boolean getUseTestPartnerId() {
        return this.useTestPartnerId;
    }

    public final String get_deeplinkUrl() {
        return this._deeplinkUrl;
    }

    public final String get_feedUrl() {
        return this._feedUrl;
    }

    public final String get_partnerId() {
        return this._partnerId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this._feedUrl;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        ?? r2 = this.useTestFeedUrl;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode2 = (((hashCode + i2) * 31) + this.centerIds.hashCode()) * 31;
        String str2 = this._partnerId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ?? r22 = this.useTestPartnerId;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode3 + i3) * 31;
        String str3 = this._deeplinkUrl;
        int hashCode4 = (i4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.useTestDeeplinkUrl;
        return hashCode4 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this._feedUrl;
        boolean z2 = this.useTestFeedUrl;
        List<Integer> list = this.centerIds;
        String str2 = this._partnerId;
        boolean z3 = this.useTestPartnerId;
        String str3 = this._deeplinkUrl;
        boolean z4 = this.useTestDeeplinkUrl;
        return "ZigZagConfig(enabled=" + z + ", _feedUrl=" + str + ", useTestFeedUrl=" + z2 + ", centerIds=" + list + ", _partnerId=" + str2 + ", useTestPartnerId=" + z3 + ", _deeplinkUrl=" + str3 + ", useTestDeeplinkUrl=" + z4 + ")";
    }

    public ZigZagConfig(boolean z, String str, boolean z2, List<Integer> centerIds, String str2, boolean z3, String str3, boolean z4) {
        Intrinsics.checkNotNullParameter(centerIds, "centerIds");
        this.enabled = z;
        this._feedUrl = str;
        this.useTestFeedUrl = z2;
        this.centerIds = centerIds;
        this._partnerId = str2;
        this.useTestPartnerId = z3;
        this._deeplinkUrl = str3;
        this.useTestDeeplinkUrl = z4;
    }

    public /* synthetic */ ZigZagConfig(boolean z, String str, boolean z2, List list, String str2, boolean z3, String str3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? CollectionsKt__CollectionsJVMKt.listOf(5) : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z3, (i & 64) == 0 ? str3 : null, (i & 128) == 0 ? z4 : false);
    }
}
