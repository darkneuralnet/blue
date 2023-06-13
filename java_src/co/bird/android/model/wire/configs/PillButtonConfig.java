package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PillButtonConfig;", "", "name", "", "experimentName", "action", "Lco/bird/android/model/wire/configs/PillButtonClickAction;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/configs/PillButtonClickAction;)V", "getAction", "()Lco/bird/android/model/wire/configs/PillButtonClickAction;", "getExperimentName", "()Ljava/lang/String;", "isNull", "", "()Z", "getName", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PillButtonConfig {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final PillButtonClickAction action;
    @JsonProperty("experiment_name")
    @InterfaceC41208ft5("experiment_name")
    private final String experimentName;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    public PillButtonConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PillButtonConfig copy$default(PillButtonConfig pillButtonConfig, String str, String str2, PillButtonClickAction pillButtonClickAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pillButtonConfig.name;
        }
        if ((i & 2) != 0) {
            str2 = pillButtonConfig.experimentName;
        }
        if ((i & 4) != 0) {
            pillButtonClickAction = pillButtonConfig.action;
        }
        return pillButtonConfig.copy(str, str2, pillButtonClickAction);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.experimentName;
    }

    public final PillButtonClickAction component3() {
        return this.action;
    }

    public final PillButtonConfig copy(String str, String str2, PillButtonClickAction pillButtonClickAction) {
        return new PillButtonConfig(str, str2, pillButtonClickAction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PillButtonConfig) {
            PillButtonConfig pillButtonConfig = (PillButtonConfig) obj;
            return Intrinsics.areEqual(this.name, pillButtonConfig.name) && Intrinsics.areEqual(this.experimentName, pillButtonConfig.experimentName) && this.action == pillButtonConfig.action;
        }
        return false;
    }

    public final PillButtonClickAction getAction() {
        return this.action;
    }

    public final String getExperimentName() {
        return this.experimentName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.experimentName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PillButtonClickAction pillButtonClickAction = this.action;
        return hashCode2 + (pillButtonClickAction != null ? pillButtonClickAction.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isNull() {
        boolean z;
        boolean z2;
        boolean isBlank;
        boolean isBlank2;
        String str = this.name;
        if (str != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank2) {
                z = false;
                if (z) {
                    return false;
                }
                String str2 = this.experimentName;
                if (str2 != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(str2);
                    if (!isBlank) {
                        z2 = false;
                        return z2 && this.action == null;
                    }
                }
                z2 = true;
                if (z2) {
                    return false;
                }
            }
        }
        z = true;
        if (z) {
        }
    }

    public String toString() {
        String str = this.name;
        String str2 = this.experimentName;
        PillButtonClickAction pillButtonClickAction = this.action;
        return "PillButtonConfig(name=" + str + ", experimentName=" + str2 + ", action=" + pillButtonClickAction + ")";
    }

    public PillButtonConfig(String str, String str2, PillButtonClickAction pillButtonClickAction) {
        this.name = str;
        this.experimentName = str2;
        this.action = pillButtonClickAction;
    }

    public /* synthetic */ PillButtonConfig(String str, String str2, PillButtonClickAction pillButtonClickAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : pillButtonClickAction);
    }
}
