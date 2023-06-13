package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003Jf\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ComplianceConfig;", "", "warnFineLeaveOutsideServiceArea", "", "warnFineLockCompliance", "enableNoParkingAreaWarnings", "", "helmetRequiredForRide", "helmetLeaseRequiredIfAvailable", "helmetLeaseCanBypassSelfie", "userCanDeleteAccount", "insuranceArticle", "", "(IIZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getEnableNoParkingAreaWarnings", "()Z", "getHelmetLeaseCanBypassSelfie", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHelmetLeaseRequiredIfAvailable", "getHelmetRequiredForRide", "getInsuranceArticle", "()Ljava/lang/String;", "getUserCanDeleteAccount", "getWarnFineLeaveOutsideServiceArea", "()I", "getWarnFineLockCompliance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(IIZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lco/bird/android/model/wire/configs/ComplianceConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplianceConfig {
    @JsonProperty("enable_no_parking_area_warnings")
    @InterfaceC41208ft5("enable_no_parking_area_warnings")
    private final boolean enableNoParkingAreaWarnings;
    @JsonProperty("helmet_lease_can_bypass_selfie")
    @InterfaceC41208ft5("helmet_lease_can_bypass_selfie")
    private final Boolean helmetLeaseCanBypassSelfie;
    @JsonProperty("helmet_lease_required_if_available")
    @InterfaceC41208ft5("helmet_lease_required_if_available")
    private final Boolean helmetLeaseRequiredIfAvailable;
    @JsonProperty("helmet_required_for_ride")
    @InterfaceC41208ft5("helmet_required_for_ride")
    private final boolean helmetRequiredForRide;
    @JsonProperty("insurance_article")
    @InterfaceC41208ft5("insurance_article")
    private final String insuranceArticle;
    @JsonProperty("user_can_delete_account")
    @InterfaceC41208ft5("user_can_delete_account")
    private final Boolean userCanDeleteAccount;
    @JsonProperty("warn_fine_leave_outside_service_area")
    @InterfaceC41208ft5("warn_fine_leave_outside_service_area")
    private final int warnFineLeaveOutsideServiceArea;
    @JsonProperty("warn_fine_lock_compliance")
    @InterfaceC41208ft5("warn_fine_lock_compliance")
    private final int warnFineLockCompliance;

    public ComplianceConfig() {
        this(0, 0, false, false, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final int component1() {
        return this.warnFineLeaveOutsideServiceArea;
    }

    public final int component2() {
        return this.warnFineLockCompliance;
    }

    public final boolean component3() {
        return this.enableNoParkingAreaWarnings;
    }

    public final boolean component4() {
        return this.helmetRequiredForRide;
    }

    public final Boolean component5() {
        return this.helmetLeaseRequiredIfAvailable;
    }

    public final Boolean component6() {
        return this.helmetLeaseCanBypassSelfie;
    }

    public final Boolean component7() {
        return this.userCanDeleteAccount;
    }

    public final String component8() {
        return this.insuranceArticle;
    }

    public final ComplianceConfig copy(int i, int i2, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        return new ComplianceConfig(i, i2, z, z2, bool, bool2, bool3, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplianceConfig) {
            ComplianceConfig complianceConfig = (ComplianceConfig) obj;
            return this.warnFineLeaveOutsideServiceArea == complianceConfig.warnFineLeaveOutsideServiceArea && this.warnFineLockCompliance == complianceConfig.warnFineLockCompliance && this.enableNoParkingAreaWarnings == complianceConfig.enableNoParkingAreaWarnings && this.helmetRequiredForRide == complianceConfig.helmetRequiredForRide && Intrinsics.areEqual(this.helmetLeaseRequiredIfAvailable, complianceConfig.helmetLeaseRequiredIfAvailable) && Intrinsics.areEqual(this.helmetLeaseCanBypassSelfie, complianceConfig.helmetLeaseCanBypassSelfie) && Intrinsics.areEqual(this.userCanDeleteAccount, complianceConfig.userCanDeleteAccount) && Intrinsics.areEqual(this.insuranceArticle, complianceConfig.insuranceArticle);
        }
        return false;
    }

    public final boolean getEnableNoParkingAreaWarnings() {
        return this.enableNoParkingAreaWarnings;
    }

    public final Boolean getHelmetLeaseCanBypassSelfie() {
        return this.helmetLeaseCanBypassSelfie;
    }

    public final Boolean getHelmetLeaseRequiredIfAvailable() {
        return this.helmetLeaseRequiredIfAvailable;
    }

    public final boolean getHelmetRequiredForRide() {
        return this.helmetRequiredForRide;
    }

    public final String getInsuranceArticle() {
        return this.insuranceArticle;
    }

    public final Boolean getUserCanDeleteAccount() {
        return this.userCanDeleteAccount;
    }

    public final int getWarnFineLeaveOutsideServiceArea() {
        return this.warnFineLeaveOutsideServiceArea;
    }

    public final int getWarnFineLockCompliance() {
        return this.warnFineLockCompliance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.warnFineLeaveOutsideServiceArea) * 31) + Integer.hashCode(this.warnFineLockCompliance)) * 31;
        boolean z = this.enableNoParkingAreaWarnings;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.helmetRequiredForRide;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Boolean bool = this.helmetLeaseRequiredIfAvailable;
        int hashCode2 = (i3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.helmetLeaseCanBypassSelfie;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.userCanDeleteAccount;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.insuranceArticle;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = this.warnFineLeaveOutsideServiceArea;
        int i2 = this.warnFineLockCompliance;
        boolean z = this.enableNoParkingAreaWarnings;
        boolean z2 = this.helmetRequiredForRide;
        Boolean bool = this.helmetLeaseRequiredIfAvailable;
        Boolean bool2 = this.helmetLeaseCanBypassSelfie;
        Boolean bool3 = this.userCanDeleteAccount;
        String str = this.insuranceArticle;
        return "ComplianceConfig(warnFineLeaveOutsideServiceArea=" + i + ", warnFineLockCompliance=" + i2 + ", enableNoParkingAreaWarnings=" + z + ", helmetRequiredForRide=" + z2 + ", helmetLeaseRequiredIfAvailable=" + bool + ", helmetLeaseCanBypassSelfie=" + bool2 + ", userCanDeleteAccount=" + bool3 + ", insuranceArticle=" + str + ")";
    }

    public ComplianceConfig(int i, int i2, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.warnFineLeaveOutsideServiceArea = i;
        this.warnFineLockCompliance = i2;
        this.enableNoParkingAreaWarnings = z;
        this.helmetRequiredForRide = z2;
        this.helmetLeaseRequiredIfAvailable = bool;
        this.helmetLeaseCanBypassSelfie = bool2;
        this.userCanDeleteAccount = bool3;
        this.insuranceArticle = str;
    }

    public /* synthetic */ ComplianceConfig(int i, int i2, boolean z, boolean z2, Boolean bool, Boolean bool2, Boolean bool3, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? false : z, (i3 & 8) == 0 ? z2 : false, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : bool2, (i3 & 64) != 0 ? Boolean.FALSE : bool3, (i3 & 128) == 0 ? str : null);
    }
}
