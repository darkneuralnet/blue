package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorReleaseConfig;", "", "separateCaptureReleaseFlow", "", "verifyReleaseCapability", "modalDisplayLimitPerDay", "", "skipReleasePhoto", "bluetoothRace", "releaseAssignments", "Lco/bird/android/model/wire/configs/ReleaseAssignmentsConfig;", "enableReleaseValidation", "releaseAnywhereUsesReleaseService", "disableCodeEntryOnReleaseScanner", "(ZZLjava/lang/Integer;ZZLco/bird/android/model/wire/configs/ReleaseAssignmentsConfig;ZZZ)V", "getBluetoothRace", "()Z", "getDisableCodeEntryOnReleaseScanner", "getEnableReleaseValidation", "getModalDisplayLimitPerDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getReleaseAnywhereUsesReleaseService", "getReleaseAssignments", "()Lco/bird/android/model/wire/configs/ReleaseAssignmentsConfig;", "getSeparateCaptureReleaseFlow", "getSkipReleasePhoto", "getVerifyReleaseCapability", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/lang/Integer;ZZLco/bird/android/model/wire/configs/ReleaseAssignmentsConfig;ZZZ)Lco/bird/android/model/wire/configs/OperatorReleaseConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorReleaseConfig {
    @JsonProperty("bluetooth_race")
    @InterfaceC41208ft5("bluetooth_race")
    private final boolean bluetoothRace;
    @JsonProperty("disable_code_entry_on_release_scanner")
    @InterfaceC41208ft5("disable_code_entry_on_release_scanner")
    private final boolean disableCodeEntryOnReleaseScanner;
    @JsonProperty("enable_release_validation")
    @InterfaceC41208ft5("enable_release_validation")
    private final boolean enableReleaseValidation;
    @JsonProperty("modal_display_limit_per_day")
    @InterfaceC41208ft5("modal_display_limit_per_day")
    private final Integer modalDisplayLimitPerDay;
    @JsonProperty("release_anywhere_uses_release_service")
    @InterfaceC41208ft5("release_anywhere_uses_release_service")
    private final boolean releaseAnywhereUsesReleaseService;
    @JsonProperty("release_assignments")
    @InterfaceC41208ft5("release_assignments")
    private final ReleaseAssignmentsConfig releaseAssignments;
    @JsonProperty("separate_capture_release_flow")
    @InterfaceC41208ft5("separate_capture_release_flow")
    private final boolean separateCaptureReleaseFlow;
    @JsonProperty("skip_release_photo")
    @InterfaceC41208ft5("skip_release_photo")
    private final boolean skipReleasePhoto;
    @JsonProperty("verify_release_capability")
    @InterfaceC41208ft5("verify_release_capability")
    private final boolean verifyReleaseCapability;

    public OperatorReleaseConfig() {
        this(false, false, null, false, false, null, false, false, false, 511, null);
    }

    public final boolean component1() {
        return this.separateCaptureReleaseFlow;
    }

    public final boolean component2() {
        return this.verifyReleaseCapability;
    }

    public final Integer component3() {
        return this.modalDisplayLimitPerDay;
    }

    public final boolean component4() {
        return this.skipReleasePhoto;
    }

    public final boolean component5() {
        return this.bluetoothRace;
    }

    public final ReleaseAssignmentsConfig component6() {
        return this.releaseAssignments;
    }

    public final boolean component7() {
        return this.enableReleaseValidation;
    }

    public final boolean component8() {
        return this.releaseAnywhereUsesReleaseService;
    }

    public final boolean component9() {
        return this.disableCodeEntryOnReleaseScanner;
    }

    public final OperatorReleaseConfig copy(boolean z, boolean z2, Integer num, boolean z3, boolean z4, ReleaseAssignmentsConfig releaseAssignments, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(releaseAssignments, "releaseAssignments");
        return new OperatorReleaseConfig(z, z2, num, z3, z4, releaseAssignments, z5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorReleaseConfig) {
            OperatorReleaseConfig operatorReleaseConfig = (OperatorReleaseConfig) obj;
            return this.separateCaptureReleaseFlow == operatorReleaseConfig.separateCaptureReleaseFlow && this.verifyReleaseCapability == operatorReleaseConfig.verifyReleaseCapability && Intrinsics.areEqual(this.modalDisplayLimitPerDay, operatorReleaseConfig.modalDisplayLimitPerDay) && this.skipReleasePhoto == operatorReleaseConfig.skipReleasePhoto && this.bluetoothRace == operatorReleaseConfig.bluetoothRace && Intrinsics.areEqual(this.releaseAssignments, operatorReleaseConfig.releaseAssignments) && this.enableReleaseValidation == operatorReleaseConfig.enableReleaseValidation && this.releaseAnywhereUsesReleaseService == operatorReleaseConfig.releaseAnywhereUsesReleaseService && this.disableCodeEntryOnReleaseScanner == operatorReleaseConfig.disableCodeEntryOnReleaseScanner;
        }
        return false;
    }

    public final boolean getBluetoothRace() {
        return this.bluetoothRace;
    }

    public final boolean getDisableCodeEntryOnReleaseScanner() {
        return this.disableCodeEntryOnReleaseScanner;
    }

    public final boolean getEnableReleaseValidation() {
        return this.enableReleaseValidation;
    }

    public final Integer getModalDisplayLimitPerDay() {
        return this.modalDisplayLimitPerDay;
    }

    public final boolean getReleaseAnywhereUsesReleaseService() {
        return this.releaseAnywhereUsesReleaseService;
    }

    public final ReleaseAssignmentsConfig getReleaseAssignments() {
        return this.releaseAssignments;
    }

    public final boolean getSeparateCaptureReleaseFlow() {
        return this.separateCaptureReleaseFlow;
    }

    public final boolean getSkipReleasePhoto() {
        return this.skipReleasePhoto;
    }

    public final boolean getVerifyReleaseCapability() {
        return this.verifyReleaseCapability;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    public int hashCode() {
        boolean z = this.separateCaptureReleaseFlow;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.verifyReleaseCapability;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        Integer num = this.modalDisplayLimitPerDay;
        int hashCode = (i3 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.skipReleasePhoto;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        ?? r23 = this.bluetoothRace;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int hashCode2 = (((i5 + i6) * 31) + this.releaseAssignments.hashCode()) * 31;
        ?? r24 = this.enableReleaseValidation;
        int i7 = r24;
        if (r24 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode2 + i7) * 31;
        ?? r25 = this.releaseAnywhereUsesReleaseService;
        int i9 = r25;
        if (r25 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z2 = this.disableCodeEntryOnReleaseScanner;
        return i10 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.separateCaptureReleaseFlow;
        boolean z2 = this.verifyReleaseCapability;
        Integer num = this.modalDisplayLimitPerDay;
        boolean z3 = this.skipReleasePhoto;
        boolean z4 = this.bluetoothRace;
        ReleaseAssignmentsConfig releaseAssignmentsConfig = this.releaseAssignments;
        boolean z5 = this.enableReleaseValidation;
        boolean z6 = this.releaseAnywhereUsesReleaseService;
        boolean z7 = this.disableCodeEntryOnReleaseScanner;
        return "OperatorReleaseConfig(separateCaptureReleaseFlow=" + z + ", verifyReleaseCapability=" + z2 + ", modalDisplayLimitPerDay=" + num + ", skipReleasePhoto=" + z3 + ", bluetoothRace=" + z4 + ", releaseAssignments=" + releaseAssignmentsConfig + ", enableReleaseValidation=" + z5 + ", releaseAnywhereUsesReleaseService=" + z6 + ", disableCodeEntryOnReleaseScanner=" + z7 + ")";
    }

    public OperatorReleaseConfig(boolean z, boolean z2, Integer num, boolean z3, boolean z4, ReleaseAssignmentsConfig releaseAssignments, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(releaseAssignments, "releaseAssignments");
        this.separateCaptureReleaseFlow = z;
        this.verifyReleaseCapability = z2;
        this.modalDisplayLimitPerDay = num;
        this.skipReleasePhoto = z3;
        this.bluetoothRace = z4;
        this.releaseAssignments = releaseAssignments;
        this.enableReleaseValidation = z5;
        this.releaseAnywhereUsesReleaseService = z6;
        this.disableCodeEntryOnReleaseScanner = z7;
    }

    public /* synthetic */ OperatorReleaseConfig(boolean z, boolean z2, Integer num, boolean z3, boolean z4, ReleaseAssignmentsConfig releaseAssignmentsConfig, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? new ReleaseAssignmentsConfig(false, 1, null) : releaseAssignmentsConfig, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? false : z6, (i & 256) == 0 ? z7 : false);
    }
}
