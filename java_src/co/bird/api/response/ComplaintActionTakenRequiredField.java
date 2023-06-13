package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ComplaintResolutionField;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/response/ComplaintActionTakenRequiredField;", "", "field", "Lco/bird/android/model/constant/ComplaintResolutionField;", "required", "", "(Lco/bird/android/model/constant/ComplaintResolutionField;Z)V", "getField", "()Lco/bird/android/model/constant/ComplaintResolutionField;", "getRequired", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplaintActionTakenRequiredField {
    @JsonProperty("field")
    @InterfaceC41208ft5("field")
    private final ComplaintResolutionField field;
    @JsonProperty("required")
    @InterfaceC41208ft5("required")
    private final boolean required;

    public ComplaintActionTakenRequiredField(ComplaintResolutionField field, boolean z) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.field = field;
        this.required = z;
    }

    public static /* synthetic */ ComplaintActionTakenRequiredField copy$default(ComplaintActionTakenRequiredField complaintActionTakenRequiredField, ComplaintResolutionField complaintResolutionField, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            complaintResolutionField = complaintActionTakenRequiredField.field;
        }
        if ((i & 2) != 0) {
            z = complaintActionTakenRequiredField.required;
        }
        return complaintActionTakenRequiredField.copy(complaintResolutionField, z);
    }

    public final ComplaintResolutionField component1() {
        return this.field;
    }

    public final boolean component2() {
        return this.required;
    }

    public final ComplaintActionTakenRequiredField copy(ComplaintResolutionField field, boolean z) {
        Intrinsics.checkNotNullParameter(field, "field");
        return new ComplaintActionTakenRequiredField(field, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplaintActionTakenRequiredField) {
            ComplaintActionTakenRequiredField complaintActionTakenRequiredField = (ComplaintActionTakenRequiredField) obj;
            return this.field == complaintActionTakenRequiredField.field && this.required == complaintActionTakenRequiredField.required;
        }
        return false;
    }

    public final ComplaintResolutionField getField() {
        return this.field;
    }

    public final boolean getRequired() {
        return this.required;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.field.hashCode() * 31;
        boolean z = this.required;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        ComplaintResolutionField complaintResolutionField = this.field;
        boolean z = this.required;
        return "ComplaintActionTakenRequiredField(field=" + complaintResolutionField + ", required=" + z + ")";
    }
}
