package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorBulkScannerConfig;", "", "enableInSideMenu", "", "enableFromMapScanButton", "enableMarkDamagedAction", "enableMarkFixedAction", "enableChirpAction", "enableAlarmAction", "enableWakeBluetoothAction", "enableNewCaptureFlow", "newCaptureFlowRequiresCaptureConfirmation", "newCaptureFlowDisableCodeEntry", "(ZZZZZZZZZZ)V", "getEnableAlarmAction", "()Z", "getEnableChirpAction", "getEnableFromMapScanButton", "getEnableInSideMenu", "getEnableMarkDamagedAction", "getEnableMarkFixedAction", "getEnableNewCaptureFlow", "getEnableWakeBluetoothAction", "getNewCaptureFlowDisableCodeEntry", "getNewCaptureFlowRequiresCaptureConfirmation", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBulkScannerConfig {
    @JsonProperty("enable_alarm_action")
    @InterfaceC41208ft5("enable_alarm_action")
    private final boolean enableAlarmAction;
    @JsonProperty("enable_chirp_action")
    @InterfaceC41208ft5("enable_chirp_action")
    private final boolean enableChirpAction;
    @JsonProperty("enable_from_map_scan_button")
    @InterfaceC41208ft5("enable_from_map_scan_button")
    private final boolean enableFromMapScanButton;
    @JsonProperty("enable_in_side_menu")
    @InterfaceC41208ft5("enable_in_side_menu")
    private final boolean enableInSideMenu;
    @JsonProperty("enable_mark_damaged_action")
    @InterfaceC41208ft5("enable_mark_damaged_action")
    private final boolean enableMarkDamagedAction;
    @JsonProperty("enable_mark_fixed_action")
    @InterfaceC41208ft5("enable_mark_fixed_action")
    private final boolean enableMarkFixedAction;
    @JsonProperty("enable_new_capture_flow")
    @InterfaceC41208ft5("enable_new_capture_flow")
    private final boolean enableNewCaptureFlow;
    @JsonProperty("enable_wake_bluetooth_action")
    @InterfaceC41208ft5("enable_wake_bluetooth_action")
    private final boolean enableWakeBluetoothAction;
    @JsonProperty("new_capture_flow_disable_code_entry_boolean")
    @InterfaceC41208ft5("new_capture_flow_disable_code_entry_boolean")
    private final boolean newCaptureFlowDisableCodeEntry;
    @JsonProperty("new_capture_flow_requires_capture_confirmation")
    @InterfaceC41208ft5("new_capture_flow_requires_capture_confirmation")
    private final boolean newCaptureFlowRequiresCaptureConfirmation;

    public OperatorBulkScannerConfig() {
        this(false, false, false, false, false, false, false, false, false, false, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final boolean component1() {
        return this.enableInSideMenu;
    }

    public final boolean component10() {
        return this.newCaptureFlowDisableCodeEntry;
    }

    public final boolean component2() {
        return this.enableFromMapScanButton;
    }

    public final boolean component3() {
        return this.enableMarkDamagedAction;
    }

    public final boolean component4() {
        return this.enableMarkFixedAction;
    }

    public final boolean component5() {
        return this.enableChirpAction;
    }

    public final boolean component6() {
        return this.enableAlarmAction;
    }

    public final boolean component7() {
        return this.enableWakeBluetoothAction;
    }

    public final boolean component8() {
        return this.enableNewCaptureFlow;
    }

    public final boolean component9() {
        return this.newCaptureFlowRequiresCaptureConfirmation;
    }

    public final OperatorBulkScannerConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        return new OperatorBulkScannerConfig(z, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBulkScannerConfig) {
            OperatorBulkScannerConfig operatorBulkScannerConfig = (OperatorBulkScannerConfig) obj;
            return this.enableInSideMenu == operatorBulkScannerConfig.enableInSideMenu && this.enableFromMapScanButton == operatorBulkScannerConfig.enableFromMapScanButton && this.enableMarkDamagedAction == operatorBulkScannerConfig.enableMarkDamagedAction && this.enableMarkFixedAction == operatorBulkScannerConfig.enableMarkFixedAction && this.enableChirpAction == operatorBulkScannerConfig.enableChirpAction && this.enableAlarmAction == operatorBulkScannerConfig.enableAlarmAction && this.enableWakeBluetoothAction == operatorBulkScannerConfig.enableWakeBluetoothAction && this.enableNewCaptureFlow == operatorBulkScannerConfig.enableNewCaptureFlow && this.newCaptureFlowRequiresCaptureConfirmation == operatorBulkScannerConfig.newCaptureFlowRequiresCaptureConfirmation && this.newCaptureFlowDisableCodeEntry == operatorBulkScannerConfig.newCaptureFlowDisableCodeEntry;
        }
        return false;
    }

    public final boolean getEnableAlarmAction() {
        return this.enableAlarmAction;
    }

    public final boolean getEnableChirpAction() {
        return this.enableChirpAction;
    }

    public final boolean getEnableFromMapScanButton() {
        return this.enableFromMapScanButton;
    }

    public final boolean getEnableInSideMenu() {
        return this.enableInSideMenu;
    }

    public final boolean getEnableMarkDamagedAction() {
        return this.enableMarkDamagedAction;
    }

    public final boolean getEnableMarkFixedAction() {
        return this.enableMarkFixedAction;
    }

    public final boolean getEnableNewCaptureFlow() {
        return this.enableNewCaptureFlow;
    }

    public final boolean getEnableWakeBluetoothAction() {
        return this.enableWakeBluetoothAction;
    }

    public final boolean getNewCaptureFlowDisableCodeEntry() {
        return this.newCaptureFlowDisableCodeEntry;
    }

    public final boolean getNewCaptureFlowRequiresCaptureConfirmation() {
        return this.newCaptureFlowRequiresCaptureConfirmation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableInSideMenu;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableFromMapScanButton;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableMarkDamagedAction;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableMarkFixedAction;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableChirpAction;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.enableAlarmAction;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.enableWakeBluetoothAction;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r27 = this.enableNewCaptureFlow;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r28 = this.newCaptureFlowRequiresCaptureConfirmation;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z2 = this.newCaptureFlowDisableCodeEntry;
        return i17 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enableInSideMenu;
        boolean z2 = this.enableFromMapScanButton;
        boolean z3 = this.enableMarkDamagedAction;
        boolean z4 = this.enableMarkFixedAction;
        boolean z5 = this.enableChirpAction;
        boolean z6 = this.enableAlarmAction;
        boolean z7 = this.enableWakeBluetoothAction;
        boolean z8 = this.enableNewCaptureFlow;
        boolean z9 = this.newCaptureFlowRequiresCaptureConfirmation;
        boolean z10 = this.newCaptureFlowDisableCodeEntry;
        return "OperatorBulkScannerConfig(enableInSideMenu=" + z + ", enableFromMapScanButton=" + z2 + ", enableMarkDamagedAction=" + z3 + ", enableMarkFixedAction=" + z4 + ", enableChirpAction=" + z5 + ", enableAlarmAction=" + z6 + ", enableWakeBluetoothAction=" + z7 + ", enableNewCaptureFlow=" + z8 + ", newCaptureFlowRequiresCaptureConfirmation=" + z9 + ", newCaptureFlowDisableCodeEntry=" + z10 + ")";
    }

    public OperatorBulkScannerConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.enableInSideMenu = z;
        this.enableFromMapScanButton = z2;
        this.enableMarkDamagedAction = z3;
        this.enableMarkFixedAction = z4;
        this.enableChirpAction = z5;
        this.enableAlarmAction = z6;
        this.enableWakeBluetoothAction = z7;
        this.enableNewCaptureFlow = z8;
        this.newCaptureFlowRequiresCaptureConfirmation = z9;
        this.newCaptureFlowDisableCodeEntry = z10;
    }

    public /* synthetic */ OperatorBulkScannerConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) == 0 ? z10 : false);
    }
}
