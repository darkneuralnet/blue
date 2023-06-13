package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RentalConfig;", "", "enabled", "", "showIntroOnce", "support", "Lco/bird/android/model/wire/configs/RentalSupportConfig;", "content", "Lco/bird/android/model/wire/configs/RentalContentConfig;", "pillConfig", "Lco/bird/android/model/wire/configs/OnDemandPillConfig;", "requiredFields", "", "", "(ZZLco/bird/android/model/wire/configs/RentalSupportConfig;Lco/bird/android/model/wire/configs/RentalContentConfig;Lco/bird/android/model/wire/configs/OnDemandPillConfig;Ljava/util/List;)V", "getContent", "()Lco/bird/android/model/wire/configs/RentalContentConfig;", "getEnabled", "()Z", "getPillConfig", "()Lco/bird/android/model/wire/configs/OnDemandPillConfig;", "getRequiredFields", "()Ljava/util/List;", "getShowIntroOnce", "getSupport", "()Lco/bird/android/model/wire/configs/RentalSupportConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RentalConfig {
    @JsonProperty("mobile_content")
    @InterfaceC41208ft5("mobile_content")
    private final RentalContentConfig content;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("pill_config")
    @InterfaceC41208ft5("pill_config")
    private final OnDemandPillConfig pillConfig;
    @JsonProperty("required_fields")
    @InterfaceC41208ft5("required_fields")
    private final List<String> requiredFields;
    @JsonProperty("show_intro_once")
    @InterfaceC41208ft5("show_intro_once")
    private final boolean showIntroOnce;
    @JsonProperty("support")
    @InterfaceC41208ft5("support")
    private final RentalSupportConfig support;

    public RentalConfig() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ RentalConfig copy$default(RentalConfig rentalConfig, boolean z, boolean z2, RentalSupportConfig rentalSupportConfig, RentalContentConfig rentalContentConfig, OnDemandPillConfig onDemandPillConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rentalConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = rentalConfig.showIntroOnce;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            rentalSupportConfig = rentalConfig.support;
        }
        RentalSupportConfig rentalSupportConfig2 = rentalSupportConfig;
        if ((i & 8) != 0) {
            rentalContentConfig = rentalConfig.content;
        }
        RentalContentConfig rentalContentConfig2 = rentalContentConfig;
        if ((i & 16) != 0) {
            onDemandPillConfig = rentalConfig.pillConfig;
        }
        OnDemandPillConfig onDemandPillConfig2 = onDemandPillConfig;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = rentalConfig.requiredFields;
        }
        return rentalConfig.copy(z, z3, rentalSupportConfig2, rentalContentConfig2, onDemandPillConfig2, list2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.showIntroOnce;
    }

    public final RentalSupportConfig component3() {
        return this.support;
    }

    public final RentalContentConfig component4() {
        return this.content;
    }

    public final OnDemandPillConfig component5() {
        return this.pillConfig;
    }

    public final List<String> component6() {
        return this.requiredFields;
    }

    public final RentalConfig copy(boolean z, boolean z2, RentalSupportConfig support, RentalContentConfig content, OnDemandPillConfig pillConfig, List<String> requiredFields) {
        Intrinsics.checkNotNullParameter(support, "support");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(pillConfig, "pillConfig");
        Intrinsics.checkNotNullParameter(requiredFields, "requiredFields");
        return new RentalConfig(z, z2, support, content, pillConfig, requiredFields);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RentalConfig) {
            RentalConfig rentalConfig = (RentalConfig) obj;
            return this.enabled == rentalConfig.enabled && this.showIntroOnce == rentalConfig.showIntroOnce && Intrinsics.areEqual(this.support, rentalConfig.support) && Intrinsics.areEqual(this.content, rentalConfig.content) && Intrinsics.areEqual(this.pillConfig, rentalConfig.pillConfig) && Intrinsics.areEqual(this.requiredFields, rentalConfig.requiredFields);
        }
        return false;
    }

    public final RentalContentConfig getContent() {
        return this.content;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final OnDemandPillConfig getPillConfig() {
        return this.pillConfig;
    }

    public final List<String> getRequiredFields() {
        return this.requiredFields;
    }

    public final boolean getShowIntroOnce() {
        return this.showIntroOnce;
    }

    public final RentalSupportConfig getSupport() {
        return this.support;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showIntroOnce;
        return ((((((((i + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.support.hashCode()) * 31) + this.content.hashCode()) * 31) + this.pillConfig.hashCode()) * 31) + this.requiredFields.hashCode();
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.showIntroOnce;
        RentalSupportConfig rentalSupportConfig = this.support;
        RentalContentConfig rentalContentConfig = this.content;
        OnDemandPillConfig onDemandPillConfig = this.pillConfig;
        List<String> list = this.requiredFields;
        return "RentalConfig(enabled=" + z + ", showIntroOnce=" + z2 + ", support=" + rentalSupportConfig + ", content=" + rentalContentConfig + ", pillConfig=" + onDemandPillConfig + ", requiredFields=" + list + ")";
    }

    public RentalConfig(boolean z, boolean z2, RentalSupportConfig support, RentalContentConfig content, OnDemandPillConfig pillConfig, List<String> requiredFields) {
        Intrinsics.checkNotNullParameter(support, "support");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(pillConfig, "pillConfig");
        Intrinsics.checkNotNullParameter(requiredFields, "requiredFields");
        this.enabled = z;
        this.showIntroOnce = z2;
        this.support = support;
        this.content = content;
        this.pillConfig = pillConfig;
        this.requiredFields = requiredFields;
    }

    public /* synthetic */ RentalConfig(boolean z, boolean z2, RentalSupportConfig rentalSupportConfig, RentalContentConfig rentalContentConfig, OnDemandPillConfig onDemandPillConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? new RentalSupportConfig(null, null, null, 7, null) : rentalSupportConfig, (i & 8) != 0 ? new RentalContentConfig(null, null, null, null, 15, null) : rentalContentConfig, (i & 16) != 0 ? new OnDemandPillConfig(null, null, null, null, 15, null) : onDemandPillConfig, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
