package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/VehicleVersion;", "", "id", "", "bmsVersion", "dashVersion", "firmwareVersion", "", "pcmVersion", "stmVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBmsVersion", "()Ljava/lang/String;", "getDashVersion", "getFirmwareVersion", "()I", "getId", "getPcmVersion", "getStmVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleVersion {
    private final String bmsVersion;
    private final String dashVersion;
    private final int firmwareVersion;

    /* renamed from: id */
    private final String f66692id;
    private final String pcmVersion;
    private final String stmVersion;

    public VehicleVersion(String id, String str, String str2, int i, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66692id = id;
        this.bmsVersion = str;
        this.dashVersion = str2;
        this.firmwareVersion = i;
        this.pcmVersion = str3;
        this.stmVersion = str4;
    }

    public static /* synthetic */ VehicleVersion copy$default(VehicleVersion vehicleVersion, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vehicleVersion.f66692id;
        }
        if ((i2 & 2) != 0) {
            str2 = vehicleVersion.bmsVersion;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = vehicleVersion.dashVersion;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            i = vehicleVersion.firmwareVersion;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = vehicleVersion.pcmVersion;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = vehicleVersion.stmVersion;
        }
        return vehicleVersion.copy(str, str6, str7, i3, str8, str5);
    }

    public final String component1() {
        return this.f66692id;
    }

    public final String component2() {
        return this.bmsVersion;
    }

    public final String component3() {
        return this.dashVersion;
    }

    public final int component4() {
        return this.firmwareVersion;
    }

    public final String component5() {
        return this.pcmVersion;
    }

    public final String component6() {
        return this.stmVersion;
    }

    public final VehicleVersion copy(String id, String str, String str2, int i, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new VehicleVersion(id, str, str2, i, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleVersion) {
            VehicleVersion vehicleVersion = (VehicleVersion) obj;
            return Intrinsics.areEqual(this.f66692id, vehicleVersion.f66692id) && Intrinsics.areEqual(this.bmsVersion, vehicleVersion.bmsVersion) && Intrinsics.areEqual(this.dashVersion, vehicleVersion.dashVersion) && this.firmwareVersion == vehicleVersion.firmwareVersion && Intrinsics.areEqual(this.pcmVersion, vehicleVersion.pcmVersion) && Intrinsics.areEqual(this.stmVersion, vehicleVersion.stmVersion);
        }
        return false;
    }

    public final String getBmsVersion() {
        return this.bmsVersion;
    }

    public final String getDashVersion() {
        return this.dashVersion;
    }

    public final int getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final String getId() {
        return this.f66692id;
    }

    public final String getPcmVersion() {
        return this.pcmVersion;
    }

    public final String getStmVersion() {
        return this.stmVersion;
    }

    public int hashCode() {
        int hashCode = this.f66692id.hashCode() * 31;
        String str = this.bmsVersion;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dashVersion;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.firmwareVersion)) * 31;
        String str3 = this.pcmVersion;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stmVersion;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66692id;
        String str2 = this.bmsVersion;
        String str3 = this.dashVersion;
        int i = this.firmwareVersion;
        String str4 = this.pcmVersion;
        String str5 = this.stmVersion;
        return "VehicleVersion(id=" + str + ", bmsVersion=" + str2 + ", dashVersion=" + str3 + ", firmwareVersion=" + i + ", pcmVersion=" + str4 + ", stmVersion=" + str5 + ")";
    }

    public /* synthetic */ VehicleVersion(String str, String str2, String str3, int i, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? str5 : null);
    }
}
