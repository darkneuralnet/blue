package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireIdentification;
import co.bird.android.model.wire.WireIdentificationAcceptableAttestation;
import co.bird.android.model.wire.WireIdentificationAcceptableManualEntry;
import co.bird.android.model.wire.WireIdentificationAcceptableMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, m28432d2 = {"Lco/bird/api/response/WireIdentificationIntentPermissionResponse;", "", "status", "", "rejectionReason", "identification", "Lco/bird/android/model/wire/WireIdentification;", "acceptableMethods", "", "Lco/bird/android/model/wire/WireIdentificationAcceptableMethod;", "acceptableAttestation", "Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;", "acceptableManualEntry", "Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireIdentification;Ljava/util/List;Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;)V", "getAcceptableAttestation", "()Lco/bird/android/model/wire/WireIdentificationAcceptableAttestation;", "getAcceptableManualEntry", "()Lco/bird/android/model/wire/WireIdentificationAcceptableManualEntry;", "getAcceptableMethods", "()Ljava/util/List;", "getIdentification", "()Lco/bird/android/model/wire/WireIdentification;", "getRejectionReason", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentificationIntentPermissionResponse {
    @JsonProperty("acceptable_attestation")
    @InterfaceC41208ft5("acceptable_attestation")
    private final WireIdentificationAcceptableAttestation acceptableAttestation;
    @JsonProperty("acceptable_manual_entry")
    @InterfaceC41208ft5("acceptable_manual_entry")
    private final WireIdentificationAcceptableManualEntry acceptableManualEntry;
    @JsonProperty("acceptable_methods")
    @InterfaceC41208ft5("acceptable_methods")
    private final List<WireIdentificationAcceptableMethod> acceptableMethods;
    @JsonProperty("identification")
    @InterfaceC41208ft5("identification")
    private final WireIdentification identification;
    @JsonProperty("rejection_reason")
    @InterfaceC41208ft5("rejection_reason")
    private final String rejectionReason;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final String status;

    public WireIdentificationIntentPermissionResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ WireIdentificationIntentPermissionResponse copy$default(WireIdentificationIntentPermissionResponse wireIdentificationIntentPermissionResponse, String str, String str2, WireIdentification wireIdentification, List list, WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation, WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireIdentificationIntentPermissionResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = wireIdentificationIntentPermissionResponse.rejectionReason;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            wireIdentification = wireIdentificationIntentPermissionResponse.identification;
        }
        WireIdentification wireIdentification2 = wireIdentification;
        List<WireIdentificationAcceptableMethod> list2 = list;
        if ((i & 8) != 0) {
            list2 = wireIdentificationIntentPermissionResponse.acceptableMethods;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            wireIdentificationAcceptableAttestation = wireIdentificationIntentPermissionResponse.acceptableAttestation;
        }
        WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation2 = wireIdentificationAcceptableAttestation;
        if ((i & 32) != 0) {
            wireIdentificationAcceptableManualEntry = wireIdentificationIntentPermissionResponse.acceptableManualEntry;
        }
        return wireIdentificationIntentPermissionResponse.copy(str, str3, wireIdentification2, list3, wireIdentificationAcceptableAttestation2, wireIdentificationAcceptableManualEntry);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.rejectionReason;
    }

    public final WireIdentification component3() {
        return this.identification;
    }

    public final List<WireIdentificationAcceptableMethod> component4() {
        return this.acceptableMethods;
    }

    public final WireIdentificationAcceptableAttestation component5() {
        return this.acceptableAttestation;
    }

    public final WireIdentificationAcceptableManualEntry component6() {
        return this.acceptableManualEntry;
    }

    public final WireIdentificationIntentPermissionResponse copy(String str, String str2, WireIdentification wireIdentification, List<WireIdentificationAcceptableMethod> list, WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation, WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry) {
        return new WireIdentificationIntentPermissionResponse(str, str2, wireIdentification, list, wireIdentificationAcceptableAttestation, wireIdentificationAcceptableManualEntry);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentificationIntentPermissionResponse) {
            WireIdentificationIntentPermissionResponse wireIdentificationIntentPermissionResponse = (WireIdentificationIntentPermissionResponse) obj;
            return Intrinsics.areEqual(this.status, wireIdentificationIntentPermissionResponse.status) && Intrinsics.areEqual(this.rejectionReason, wireIdentificationIntentPermissionResponse.rejectionReason) && Intrinsics.areEqual(this.identification, wireIdentificationIntentPermissionResponse.identification) && Intrinsics.areEqual(this.acceptableMethods, wireIdentificationIntentPermissionResponse.acceptableMethods) && Intrinsics.areEqual(this.acceptableAttestation, wireIdentificationIntentPermissionResponse.acceptableAttestation) && Intrinsics.areEqual(this.acceptableManualEntry, wireIdentificationIntentPermissionResponse.acceptableManualEntry);
        }
        return false;
    }

    public final WireIdentificationAcceptableAttestation getAcceptableAttestation() {
        return this.acceptableAttestation;
    }

    public final WireIdentificationAcceptableManualEntry getAcceptableManualEntry() {
        return this.acceptableManualEntry;
    }

    public final List<WireIdentificationAcceptableMethod> getAcceptableMethods() {
        return this.acceptableMethods;
    }

    public final WireIdentification getIdentification() {
        return this.identification;
    }

    public final String getRejectionReason() {
        return this.rejectionReason;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rejectionReason;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireIdentification wireIdentification = this.identification;
        int hashCode3 = (hashCode2 + (wireIdentification == null ? 0 : wireIdentification.hashCode())) * 31;
        List<WireIdentificationAcceptableMethod> list = this.acceptableMethods;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation = this.acceptableAttestation;
        int hashCode5 = (hashCode4 + (wireIdentificationAcceptableAttestation == null ? 0 : wireIdentificationAcceptableAttestation.hashCode())) * 31;
        WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry = this.acceptableManualEntry;
        return hashCode5 + (wireIdentificationAcceptableManualEntry != null ? wireIdentificationAcceptableManualEntry.hashCode() : 0);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.rejectionReason;
        WireIdentification wireIdentification = this.identification;
        List<WireIdentificationAcceptableMethod> list = this.acceptableMethods;
        WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation = this.acceptableAttestation;
        WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry = this.acceptableManualEntry;
        return "WireIdentificationIntentPermissionResponse(status=" + str + ", rejectionReason=" + str2 + ", identification=" + wireIdentification + ", acceptableMethods=" + list + ", acceptableAttestation=" + wireIdentificationAcceptableAttestation + ", acceptableManualEntry=" + wireIdentificationAcceptableManualEntry + ")";
    }

    public WireIdentificationIntentPermissionResponse(String str, String str2, WireIdentification wireIdentification, List<WireIdentificationAcceptableMethod> list, WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation, WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry) {
        this.status = str;
        this.rejectionReason = str2;
        this.identification = wireIdentification;
        this.acceptableMethods = list;
        this.acceptableAttestation = wireIdentificationAcceptableAttestation;
        this.acceptableManualEntry = wireIdentificationAcceptableManualEntry;
    }

    public /* synthetic */ WireIdentificationIntentPermissionResponse(String str, String str2, WireIdentification wireIdentification, List list, WireIdentificationAcceptableAttestation wireIdentificationAcceptableAttestation, WireIdentificationAcceptableManualEntry wireIdentificationAcceptableManualEntry, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : wireIdentification, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : wireIdentificationAcceptableAttestation, (i & 32) != 0 ? null : wireIdentificationAcceptableManualEntry);
    }
}
