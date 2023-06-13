package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorConfig;", "", "enableCompleteOtherUsersTask", "", "features", "Lco/bird/android/model/wire/configs/OperatorFeatureConfig;", "helpSideMenuZendeskArticleId", "", "faqSideMenuWebUrl", "enableReleaseAllTasksDistanceCheck", "permissions", "Lco/bird/android/model/wire/configs/OperatorPermissionsConfig;", "enableUnlockPhysicalLocks", "enablePeripheralKeyboardSupport", "(ZLco/bird/android/model/wire/configs/OperatorFeatureConfig;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/wire/configs/OperatorPermissionsConfig;ZZ)V", "getEnableCompleteOtherUsersTask", "()Z", "getEnablePeripheralKeyboardSupport", "getEnableReleaseAllTasksDistanceCheck", "getEnableUnlockPhysicalLocks", "getFaqSideMenuWebUrl", "()Ljava/lang/String;", "getFeatures", "()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;", "getHelpSideMenuZendeskArticleId", "getPermissions", "()Lco/bird/android/model/wire/configs/OperatorPermissionsConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorConfig {
    @JsonProperty("enable_complete_other_users_task")
    @InterfaceC41208ft5("enable_complete_other_users_task")
    private final boolean enableCompleteOtherUsersTask;
    @JsonProperty("enable_peripheral_keyboard_support")
    @InterfaceC41208ft5("enable_peripheral_keyboard_support")
    private final boolean enablePeripheralKeyboardSupport;
    @JsonProperty("enable_release_all_tasks_distance_check")
    @InterfaceC41208ft5("enable_release_all_tasks_distance_check")
    private final boolean enableReleaseAllTasksDistanceCheck;
    @JsonProperty("enable_unlock_physical_locks")
    @InterfaceC41208ft5("enable_unlock_physical_locks")
    private final boolean enableUnlockPhysicalLocks;
    @JsonProperty("faq_side_menu_web_url")
    @InterfaceC41208ft5("faq_side_menu_web_url")
    private final String faqSideMenuWebUrl;
    @JsonProperty("features")
    @InterfaceC41208ft5("features")
    private final OperatorFeatureConfig features;
    @JsonProperty("help_side_menu_zendesk_article_id")
    @InterfaceC41208ft5("help_side_menu_zendesk_article_id")
    private final String helpSideMenuZendeskArticleId;
    @JsonProperty("permissions")
    @InterfaceC41208ft5("permissions")
    private final OperatorPermissionsConfig permissions;

    public OperatorConfig() {
        this(false, null, null, null, false, null, false, false, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final boolean component1() {
        return this.enableCompleteOtherUsersTask;
    }

    public final OperatorFeatureConfig component2() {
        return this.features;
    }

    public final String component3() {
        return this.helpSideMenuZendeskArticleId;
    }

    public final String component4() {
        return this.faqSideMenuWebUrl;
    }

    public final boolean component5() {
        return this.enableReleaseAllTasksDistanceCheck;
    }

    public final OperatorPermissionsConfig component6() {
        return this.permissions;
    }

    public final boolean component7() {
        return this.enableUnlockPhysicalLocks;
    }

    public final boolean component8() {
        return this.enablePeripheralKeyboardSupport;
    }

    public final OperatorConfig copy(boolean z, OperatorFeatureConfig features, String str, String str2, boolean z2, OperatorPermissionsConfig permissions, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return new OperatorConfig(z, features, str, str2, z2, permissions, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorConfig) {
            OperatorConfig operatorConfig = (OperatorConfig) obj;
            return this.enableCompleteOtherUsersTask == operatorConfig.enableCompleteOtherUsersTask && Intrinsics.areEqual(this.features, operatorConfig.features) && Intrinsics.areEqual(this.helpSideMenuZendeskArticleId, operatorConfig.helpSideMenuZendeskArticleId) && Intrinsics.areEqual(this.faqSideMenuWebUrl, operatorConfig.faqSideMenuWebUrl) && this.enableReleaseAllTasksDistanceCheck == operatorConfig.enableReleaseAllTasksDistanceCheck && Intrinsics.areEqual(this.permissions, operatorConfig.permissions) && this.enableUnlockPhysicalLocks == operatorConfig.enableUnlockPhysicalLocks && this.enablePeripheralKeyboardSupport == operatorConfig.enablePeripheralKeyboardSupport;
        }
        return false;
    }

    public final boolean getEnableCompleteOtherUsersTask() {
        return this.enableCompleteOtherUsersTask;
    }

    public final boolean getEnablePeripheralKeyboardSupport() {
        return this.enablePeripheralKeyboardSupport;
    }

    public final boolean getEnableReleaseAllTasksDistanceCheck() {
        return this.enableReleaseAllTasksDistanceCheck;
    }

    public final boolean getEnableUnlockPhysicalLocks() {
        return this.enableUnlockPhysicalLocks;
    }

    public final String getFaqSideMenuWebUrl() {
        return this.faqSideMenuWebUrl;
    }

    public final OperatorFeatureConfig getFeatures() {
        return this.features;
    }

    public final String getHelpSideMenuZendeskArticleId() {
        return this.helpSideMenuZendeskArticleId;
    }

    public final OperatorPermissionsConfig getPermissions() {
        return this.permissions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableCompleteOtherUsersTask;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.features.hashCode()) * 31;
        String str = this.helpSideMenuZendeskArticleId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.faqSideMenuWebUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ?? r2 = this.enableReleaseAllTasksDistanceCheck;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int hashCode4 = (((hashCode3 + i) * 31) + this.permissions.hashCode()) * 31;
        ?? r22 = this.enableUnlockPhysicalLocks;
        int i2 = r22;
        if (r22 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z2 = this.enablePeripheralKeyboardSupport;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enableCompleteOtherUsersTask;
        OperatorFeatureConfig operatorFeatureConfig = this.features;
        String str = this.helpSideMenuZendeskArticleId;
        String str2 = this.faqSideMenuWebUrl;
        boolean z2 = this.enableReleaseAllTasksDistanceCheck;
        OperatorPermissionsConfig operatorPermissionsConfig = this.permissions;
        boolean z3 = this.enableUnlockPhysicalLocks;
        boolean z4 = this.enablePeripheralKeyboardSupport;
        return "OperatorConfig(enableCompleteOtherUsersTask=" + z + ", features=" + operatorFeatureConfig + ", helpSideMenuZendeskArticleId=" + str + ", faqSideMenuWebUrl=" + str2 + ", enableReleaseAllTasksDistanceCheck=" + z2 + ", permissions=" + operatorPermissionsConfig + ", enableUnlockPhysicalLocks=" + z3 + ", enablePeripheralKeyboardSupport=" + z4 + ")";
    }

    public OperatorConfig(boolean z, OperatorFeatureConfig features, String str, String str2, boolean z2, OperatorPermissionsConfig permissions, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.enableCompleteOtherUsersTask = z;
        this.features = features;
        this.helpSideMenuZendeskArticleId = str;
        this.faqSideMenuWebUrl = str2;
        this.enableReleaseAllTasksDistanceCheck = z2;
        this.permissions = permissions;
        this.enableUnlockPhysicalLocks = z3;
        this.enablePeripheralKeyboardSupport = z4;
    }

    public /* synthetic */ OperatorConfig(boolean z, OperatorFeatureConfig operatorFeatureConfig, String str, String str2, boolean z2, OperatorPermissionsConfig operatorPermissionsConfig, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new OperatorFeatureConfig(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null) : operatorFeatureConfig, (i & 4) != 0 ? null : str, (i & 8) == 0 ? str2 : null, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? new OperatorPermissionsConfig(false, false, false, false, 15, null) : operatorPermissionsConfig, (i & 64) != 0 ? false : z3, (i & 128) == 0 ? z4 : false);
    }
}
