package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorTaskListConfig;", "", "enabled", "", "enableAlarmAction", "enableLockAction", "enableCancelTaskAction", "enableDirectTaskCancel", "showTaskLimit", "v2", "(ZZZZZZZ)V", "getEnableAlarmAction", "()Z", "getEnableCancelTaskAction", "getEnableDirectTaskCancel", "getEnableLockAction", "getEnabled", "getShowTaskLimit", "getV2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorTaskListConfig {
    @JsonProperty("enable_alarm_action")
    @InterfaceC41208ft5("enable_alarm_action")
    private final boolean enableAlarmAction;
    @JsonProperty("enable_cancel_task_action")
    @InterfaceC41208ft5("enable_cancel_task_action")
    private final boolean enableCancelTaskAction;
    @JsonProperty("enable_direct_task_cancel")
    @InterfaceC41208ft5("enable_direct_task_cancel")
    private final boolean enableDirectTaskCancel;
    @JsonProperty("enable_lock_action")
    @InterfaceC41208ft5("enable_lock_action")
    private final boolean enableLockAction;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("show_task_limit")
    @InterfaceC41208ft5("show_task_limit")
    private final boolean showTaskLimit;
    @JsonProperty("v2")
    @InterfaceC41208ft5("v2")

    /* renamed from: v2 */
    private final boolean f66780v2;

    public OperatorTaskListConfig() {
        this(false, false, false, false, false, false, false, 127, null);
    }

    public static /* synthetic */ OperatorTaskListConfig copy$default(OperatorTaskListConfig operatorTaskListConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorTaskListConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = operatorTaskListConfig.enableAlarmAction;
        }
        boolean z8 = z2;
        if ((i & 4) != 0) {
            z3 = operatorTaskListConfig.enableLockAction;
        }
        boolean z9 = z3;
        if ((i & 8) != 0) {
            z4 = operatorTaskListConfig.enableCancelTaskAction;
        }
        boolean z10 = z4;
        if ((i & 16) != 0) {
            z5 = operatorTaskListConfig.enableDirectTaskCancel;
        }
        boolean z11 = z5;
        if ((i & 32) != 0) {
            z6 = operatorTaskListConfig.showTaskLimit;
        }
        boolean z12 = z6;
        if ((i & 64) != 0) {
            z7 = operatorTaskListConfig.f66780v2;
        }
        return operatorTaskListConfig.copy(z, z8, z9, z10, z11, z12, z7);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.enableAlarmAction;
    }

    public final boolean component3() {
        return this.enableLockAction;
    }

    public final boolean component4() {
        return this.enableCancelTaskAction;
    }

    public final boolean component5() {
        return this.enableDirectTaskCancel;
    }

    public final boolean component6() {
        return this.showTaskLimit;
    }

    public final boolean component7() {
        return this.f66780v2;
    }

    public final OperatorTaskListConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new OperatorTaskListConfig(z, z2, z3, z4, z5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorTaskListConfig) {
            OperatorTaskListConfig operatorTaskListConfig = (OperatorTaskListConfig) obj;
            return this.enabled == operatorTaskListConfig.enabled && this.enableAlarmAction == operatorTaskListConfig.enableAlarmAction && this.enableLockAction == operatorTaskListConfig.enableLockAction && this.enableCancelTaskAction == operatorTaskListConfig.enableCancelTaskAction && this.enableDirectTaskCancel == operatorTaskListConfig.enableDirectTaskCancel && this.showTaskLimit == operatorTaskListConfig.showTaskLimit && this.f66780v2 == operatorTaskListConfig.f66780v2;
        }
        return false;
    }

    public final boolean getEnableAlarmAction() {
        return this.enableAlarmAction;
    }

    public final boolean getEnableCancelTaskAction() {
        return this.enableCancelTaskAction;
    }

    public final boolean getEnableDirectTaskCancel() {
        return this.enableDirectTaskCancel;
    }

    public final boolean getEnableLockAction() {
        return this.enableLockAction;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getShowTaskLimit() {
        return this.showTaskLimit;
    }

    public final boolean getV2() {
        return this.f66780v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableAlarmAction;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableLockAction;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableCancelTaskAction;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableDirectTaskCancel;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.showTaskLimit;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z2 = this.f66780v2;
        return i11 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enableAlarmAction;
        boolean z3 = this.enableLockAction;
        boolean z4 = this.enableCancelTaskAction;
        boolean z5 = this.enableDirectTaskCancel;
        boolean z6 = this.showTaskLimit;
        boolean z7 = this.f66780v2;
        return "OperatorTaskListConfig(enabled=" + z + ", enableAlarmAction=" + z2 + ", enableLockAction=" + z3 + ", enableCancelTaskAction=" + z4 + ", enableDirectTaskCancel=" + z5 + ", showTaskLimit=" + z6 + ", v2=" + z7 + ")";
    }

    public OperatorTaskListConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.enabled = z;
        this.enableAlarmAction = z2;
        this.enableLockAction = z3;
        this.enableCancelTaskAction = z4;
        this.enableDirectTaskCancel = z5;
        this.showTaskLimit = z6;
        this.f66780v2 = z7;
    }

    public /* synthetic */ OperatorTaskListConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7);
    }
}
