package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PhysicalLockPurpose;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m28432d2 = {"Lco/bird/api/request/ReplacePhysicalLockBody;", "", "birdId", "", "kind", "combination", "smartlockSerialNumber", "smartlockMacAddress", "purpose", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PhysicalLockPurpose;)V", "getBirdId", "()Ljava/lang/String;", "getCombination", "getKind", "getPurpose", "()Lco/bird/android/model/constant/PhysicalLockPurpose;", "getSmartlockMacAddress", "getSmartlockSerialNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReplacePhysicalLockBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("combination")
    @InterfaceC41208ft5("combination")
    private final String combination;
    @JsonProperty("physical_lock_type")
    @InterfaceC41208ft5("physical_lock_type")
    private final String kind;
    @JsonProperty("physical_lock_purpose")
    @InterfaceC41208ft5("physical_lock_purpose")
    private final PhysicalLockPurpose purpose;
    @JsonProperty("smartlock_mac_address")
    @InterfaceC41208ft5("smartlock_mac_address")
    private final String smartlockMacAddress;
    @JsonProperty("smartlock_serial_number")
    @InterfaceC41208ft5("smartlock_serial_number")
    private final String smartlockSerialNumber;

    public ReplacePhysicalLockBody(String str, String kind, String str2, String str3, String str4, PhysicalLockPurpose physicalLockPurpose) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.birdId = str;
        this.kind = kind;
        this.combination = str2;
        this.smartlockSerialNumber = str3;
        this.smartlockMacAddress = str4;
        this.purpose = physicalLockPurpose;
    }

    public static /* synthetic */ ReplacePhysicalLockBody copy$default(ReplacePhysicalLockBody replacePhysicalLockBody, String str, String str2, String str3, String str4, String str5, PhysicalLockPurpose physicalLockPurpose, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replacePhysicalLockBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = replacePhysicalLockBody.kind;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = replacePhysicalLockBody.combination;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = replacePhysicalLockBody.smartlockSerialNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = replacePhysicalLockBody.smartlockMacAddress;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            physicalLockPurpose = replacePhysicalLockBody.purpose;
        }
        return replacePhysicalLockBody.copy(str, str6, str7, str8, str9, physicalLockPurpose);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.combination;
    }

    public final String component4() {
        return this.smartlockSerialNumber;
    }

    public final String component5() {
        return this.smartlockMacAddress;
    }

    public final PhysicalLockPurpose component6() {
        return this.purpose;
    }

    public final ReplacePhysicalLockBody copy(String str, String kind, String str2, String str3, String str4, PhysicalLockPurpose physicalLockPurpose) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new ReplacePhysicalLockBody(str, kind, str2, str3, str4, physicalLockPurpose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReplacePhysicalLockBody) {
            ReplacePhysicalLockBody replacePhysicalLockBody = (ReplacePhysicalLockBody) obj;
            return Intrinsics.areEqual(this.birdId, replacePhysicalLockBody.birdId) && Intrinsics.areEqual(this.kind, replacePhysicalLockBody.kind) && Intrinsics.areEqual(this.combination, replacePhysicalLockBody.combination) && Intrinsics.areEqual(this.smartlockSerialNumber, replacePhysicalLockBody.smartlockSerialNumber) && Intrinsics.areEqual(this.smartlockMacAddress, replacePhysicalLockBody.smartlockMacAddress) && this.purpose == replacePhysicalLockBody.purpose;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getCombination() {
        return this.combination;
    }

    public final String getKind() {
        return this.kind;
    }

    public final PhysicalLockPurpose getPurpose() {
        return this.purpose;
    }

    public final String getSmartlockMacAddress() {
        return this.smartlockMacAddress;
    }

    public final String getSmartlockSerialNumber() {
        return this.smartlockSerialNumber;
    }

    public int hashCode() {
        String str = this.birdId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.kind.hashCode()) * 31;
        String str2 = this.combination;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.smartlockSerialNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.smartlockMacAddress;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        return hashCode4 + (physicalLockPurpose != null ? physicalLockPurpose.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.kind;
        String str3 = this.combination;
        String str4 = this.smartlockSerialNumber;
        String str5 = this.smartlockMacAddress;
        PhysicalLockPurpose physicalLockPurpose = this.purpose;
        return "ReplacePhysicalLockBody(birdId=" + str + ", kind=" + str2 + ", combination=" + str3 + ", smartlockSerialNumber=" + str4 + ", smartlockMacAddress=" + str5 + ", purpose=" + physicalLockPurpose + ")";
    }

    public /* synthetic */ ReplacePhysicalLockBody(String str, String str2, String str3, String str4, String str5, PhysicalLockPurpose physicalLockPurpose, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : physicalLockPurpose);
    }
}
