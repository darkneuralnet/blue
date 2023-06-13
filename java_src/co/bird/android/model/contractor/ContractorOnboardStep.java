package co.bird.android.model.contractor;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorOnboardStep;", "Landroid/os/Parcelable;", "name", "", "displayName", "rootFieldId", "fields", "", "Lco/bird/android/model/contractor/ContractorDataField;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getDisplayName", "()Ljava/lang/String;", "getFields", "()Ljava/util/Map;", "getName", "getRootFieldId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorOnboardStep implements Parcelable {
    public static final Parcelable.Creator<ContractorOnboardStep> CREATOR = new Creator();
    @JsonProperty("display_name")
    @InterfaceC41208ft5("display_name")
    private final String displayName;
    @JsonProperty("fields")
    @InterfaceC41208ft5("fields")
    private final Map<String, ContractorDataField> fields;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("root_field_id")
    @InterfaceC41208ft5("root_field_id")
    private final String rootFieldId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ContractorOnboardStep> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorOnboardStep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), ContractorDataField.CREATOR.createFromParcel(parcel));
            }
            return new ContractorOnboardStep(readString, readString2, readString3, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorOnboardStep[] newArray(int i) {
            return new ContractorOnboardStep[i];
        }
    }

    public ContractorOnboardStep(String str, String displayName, String rootFieldId, Map<String, ContractorDataField> fields) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(rootFieldId, "rootFieldId");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.name = str;
        this.displayName = displayName;
        this.rootFieldId = rootFieldId;
        this.fields = fields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContractorOnboardStep copy$default(ContractorOnboardStep contractorOnboardStep, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractorOnboardStep.name;
        }
        if ((i & 2) != 0) {
            str2 = contractorOnboardStep.displayName;
        }
        if ((i & 4) != 0) {
            str3 = contractorOnboardStep.rootFieldId;
        }
        if ((i & 8) != 0) {
            map = contractorOnboardStep.fields;
        }
        return contractorOnboardStep.copy(str, str2, str3, map);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.rootFieldId;
    }

    public final Map<String, ContractorDataField> component4() {
        return this.fields;
    }

    public final ContractorOnboardStep copy(String str, String displayName, String rootFieldId, Map<String, ContractorDataField> fields) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(rootFieldId, "rootFieldId");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new ContractorOnboardStep(str, displayName, rootFieldId, fields);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorOnboardStep) {
            ContractorOnboardStep contractorOnboardStep = (ContractorOnboardStep) obj;
            return Intrinsics.areEqual(this.name, contractorOnboardStep.name) && Intrinsics.areEqual(this.displayName, contractorOnboardStep.displayName) && Intrinsics.areEqual(this.rootFieldId, contractorOnboardStep.rootFieldId) && Intrinsics.areEqual(this.fields, contractorOnboardStep.fields);
        }
        return false;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Map<String, ContractorDataField> getFields() {
        return this.fields;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRootFieldId() {
        return this.rootFieldId;
    }

    public int hashCode() {
        String str = this.name;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.rootFieldId.hashCode()) * 31) + this.fields.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.displayName;
        String str3 = this.rootFieldId;
        Map<String, ContractorDataField> map = this.fields;
        return "ContractorOnboardStep(name=" + str + ", displayName=" + str2 + ", rootFieldId=" + str3 + ", fields=" + map + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.displayName);
        out.writeString(this.rootFieldId);
        Map<String, ContractorDataField> map = this.fields;
        out.writeInt(map.size());
        for (Map.Entry<String, ContractorDataField> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            entry.getValue().writeToParcel(out, i);
        }
    }

    public /* synthetic */ ContractorOnboardStep(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, map);
    }
}
