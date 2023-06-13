package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/UserInterfaceConfig;", "", "allowRiderDarkMode", "", "enableUserSettingsV2", "enableRideTransactionsV2", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAllowRiderDarkMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableRideTransactionsV2", "getEnableUserSettingsV2", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lco/bird/android/model/wire/configs/UserInterfaceConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserInterfaceConfig {
    @JsonProperty("allow_rider_dark_mode")
    @InterfaceC41208ft5("allow_rider_dark_mode")
    private final Boolean allowRiderDarkMode;
    @JsonProperty("enable_ride_transactions_v2")
    @InterfaceC41208ft5("enable_ride_transactions_v2")
    private final Boolean enableRideTransactionsV2;
    @JsonProperty("enable_user_settings_v2")
    @InterfaceC41208ft5("enable_user_settings_v2")
    private final Boolean enableUserSettingsV2;

    public UserInterfaceConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserInterfaceConfig copy$default(UserInterfaceConfig userInterfaceConfig, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = userInterfaceConfig.allowRiderDarkMode;
        }
        if ((i & 2) != 0) {
            bool2 = userInterfaceConfig.enableUserSettingsV2;
        }
        if ((i & 4) != 0) {
            bool3 = userInterfaceConfig.enableRideTransactionsV2;
        }
        return userInterfaceConfig.copy(bool, bool2, bool3);
    }

    public final Boolean component1() {
        return this.allowRiderDarkMode;
    }

    public final Boolean component2() {
        return this.enableUserSettingsV2;
    }

    public final Boolean component3() {
        return this.enableRideTransactionsV2;
    }

    public final UserInterfaceConfig copy(Boolean bool, Boolean bool2, Boolean bool3) {
        return new UserInterfaceConfig(bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserInterfaceConfig) {
            UserInterfaceConfig userInterfaceConfig = (UserInterfaceConfig) obj;
            return Intrinsics.areEqual(this.allowRiderDarkMode, userInterfaceConfig.allowRiderDarkMode) && Intrinsics.areEqual(this.enableUserSettingsV2, userInterfaceConfig.enableUserSettingsV2) && Intrinsics.areEqual(this.enableRideTransactionsV2, userInterfaceConfig.enableRideTransactionsV2);
        }
        return false;
    }

    public final Boolean getAllowRiderDarkMode() {
        return this.allowRiderDarkMode;
    }

    public final Boolean getEnableRideTransactionsV2() {
        return this.enableRideTransactionsV2;
    }

    public final Boolean getEnableUserSettingsV2() {
        return this.enableUserSettingsV2;
    }

    public int hashCode() {
        Boolean bool = this.allowRiderDarkMode;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableUserSettingsV2;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableRideTransactionsV2;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.allowRiderDarkMode;
        Boolean bool2 = this.enableUserSettingsV2;
        Boolean bool3 = this.enableRideTransactionsV2;
        return "UserInterfaceConfig(allowRiderDarkMode=" + bool + ", enableUserSettingsV2=" + bool2 + ", enableRideTransactionsV2=" + bool3 + ")";
    }

    public UserInterfaceConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this.allowRiderDarkMode = bool;
        this.enableUserSettingsV2 = bool2;
        this.enableRideTransactionsV2 = bool3;
    }

    public /* synthetic */ UserInterfaceConfig(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
