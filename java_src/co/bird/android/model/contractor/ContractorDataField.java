package co.bird.android.model.contractor;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0013\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000201HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u000201HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006<"}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorDataField;", "Landroid/os/Parcelable;", "id", "", "key", "kind", "Lco/bird/android/model/contractor/ContractorDataFieldKind;", "format", "Lco/bird/android/model/contractor/ContractorDataFieldFormat;", "displayName", "defaultValue", "subFieldCardinality", "Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;", "params", "Lco/bird/android/model/contractor/ContractorDataFieldParams;", "stored", "", "subFields", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/ContractorDataFieldKind;Lco/bird/android/model/contractor/ContractorDataFieldFormat;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;Lco/bird/android/model/contractor/ContractorDataFieldParams;ZLjava/util/List;)V", "getDefaultValue", "()Ljava/lang/String;", "getDisplayName", "getFormat", "()Lco/bird/android/model/contractor/ContractorDataFieldFormat;", "getId", "getKey", "getKind", "()Lco/bird/android/model/contractor/ContractorDataFieldKind;", "getParams", "()Lco/bird/android/model/contractor/ContractorDataFieldParams;", "getStored", "()Z", "getSubFieldCardinality", "()Lco/bird/android/model/contractor/DataFieldSubFieldCardinality;", "getSubFields", "()Ljava/util/List;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorDataField implements Parcelable {
    public static final Parcelable.Creator<ContractorDataField> CREATOR = new Creator();
    @JsonProperty("default_value")
    @InterfaceC41208ft5("default_value")
    private final String defaultValue;
    @JsonProperty("display_name")
    @InterfaceC41208ft5("display_name")
    private final String displayName;
    @JsonProperty("format")
    @InterfaceC41208ft5("format")
    private final ContractorDataFieldFormat format;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66655id;
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final String key;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final ContractorDataFieldKind kind;
    @JsonProperty("params")
    @InterfaceC41208ft5("params")
    private final ContractorDataFieldParams params;
    @JsonProperty("stored")
    @InterfaceC41208ft5("stored")
    private final boolean stored;
    @JsonProperty("sub_field_cardinality")
    @InterfaceC41208ft5("sub_field_cardinality")
    private final DataFieldSubFieldCardinality subFieldCardinality;
    @JsonProperty("sub_fields")
    @InterfaceC41208ft5("sub_fields")
    private final List<String> subFields;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ContractorDataField> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorDataField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractorDataField(parcel.readString(), parcel.readString(), ContractorDataFieldKind.valueOf(parcel.readString()), ContractorDataFieldFormat.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DataFieldSubFieldCardinality.valueOf(parcel.readString()), ContractorDataFieldParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorDataField[] newArray(int i) {
            return new ContractorDataField[i];
        }
    }

    public ContractorDataField(String id, String key, ContractorDataFieldKind kind, ContractorDataFieldFormat format, String str, String str2, DataFieldSubFieldCardinality dataFieldSubFieldCardinality, ContractorDataFieldParams params, boolean z, List<String> subFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(subFields, "subFields");
        this.f66655id = id;
        this.key = key;
        this.kind = kind;
        this.format = format;
        this.displayName = str;
        this.defaultValue = str2;
        this.subFieldCardinality = dataFieldSubFieldCardinality;
        this.params = params;
        this.stored = z;
        this.subFields = subFields;
    }

    public final String component1() {
        return this.f66655id;
    }

    public final List<String> component10() {
        return this.subFields;
    }

    public final String component2() {
        return this.key;
    }

    public final ContractorDataFieldKind component3() {
        return this.kind;
    }

    public final ContractorDataFieldFormat component4() {
        return this.format;
    }

    public final String component5() {
        return this.displayName;
    }

    public final String component6() {
        return this.defaultValue;
    }

    public final DataFieldSubFieldCardinality component7() {
        return this.subFieldCardinality;
    }

    public final ContractorDataFieldParams component8() {
        return this.params;
    }

    public final boolean component9() {
        return this.stored;
    }

    public final ContractorDataField copy(String id, String key, ContractorDataFieldKind kind, ContractorDataFieldFormat format, String str, String str2, DataFieldSubFieldCardinality dataFieldSubFieldCardinality, ContractorDataFieldParams params, boolean z, List<String> subFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(subFields, "subFields");
        return new ContractorDataField(id, key, kind, format, str, str2, dataFieldSubFieldCardinality, params, z, subFields);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorDataField) {
            ContractorDataField contractorDataField = (ContractorDataField) obj;
            return Intrinsics.areEqual(this.f66655id, contractorDataField.f66655id) && Intrinsics.areEqual(this.key, contractorDataField.key) && this.kind == contractorDataField.kind && this.format == contractorDataField.format && Intrinsics.areEqual(this.displayName, contractorDataField.displayName) && Intrinsics.areEqual(this.defaultValue, contractorDataField.defaultValue) && this.subFieldCardinality == contractorDataField.subFieldCardinality && Intrinsics.areEqual(this.params, contractorDataField.params) && this.stored == contractorDataField.stored && Intrinsics.areEqual(this.subFields, contractorDataField.subFields);
        }
        return false;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final ContractorDataFieldFormat getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.f66655id;
    }

    public final String getKey() {
        return this.key;
    }

    public final ContractorDataFieldKind getKind() {
        return this.kind;
    }

    public final ContractorDataFieldParams getParams() {
        return this.params;
    }

    public final boolean getStored() {
        return this.stored;
    }

    public final DataFieldSubFieldCardinality getSubFieldCardinality() {
        return this.subFieldCardinality;
    }

    public final List<String> getSubFields() {
        return this.subFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f66655id.hashCode() * 31) + this.key.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.format.hashCode()) * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DataFieldSubFieldCardinality dataFieldSubFieldCardinality = this.subFieldCardinality;
        int hashCode4 = (((hashCode3 + (dataFieldSubFieldCardinality != null ? dataFieldSubFieldCardinality.hashCode() : 0)) * 31) + this.params.hashCode()) * 31;
        boolean z = this.stored;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode4 + i) * 31) + this.subFields.hashCode();
    }

    public String toString() {
        String str = this.f66655id;
        String str2 = this.key;
        ContractorDataFieldKind contractorDataFieldKind = this.kind;
        ContractorDataFieldFormat contractorDataFieldFormat = this.format;
        String str3 = this.displayName;
        String str4 = this.defaultValue;
        DataFieldSubFieldCardinality dataFieldSubFieldCardinality = this.subFieldCardinality;
        ContractorDataFieldParams contractorDataFieldParams = this.params;
        boolean z = this.stored;
        List<String> list = this.subFields;
        return "ContractorDataField(id=" + str + ", key=" + str2 + ", kind=" + contractorDataFieldKind + ", format=" + contractorDataFieldFormat + ", displayName=" + str3 + ", defaultValue=" + str4 + ", subFieldCardinality=" + dataFieldSubFieldCardinality + ", params=" + contractorDataFieldParams + ", stored=" + z + ", subFields=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66655id);
        out.writeString(this.key);
        out.writeString(this.kind.name());
        out.writeString(this.format.name());
        out.writeString(this.displayName);
        out.writeString(this.defaultValue);
        DataFieldSubFieldCardinality dataFieldSubFieldCardinality = this.subFieldCardinality;
        if (dataFieldSubFieldCardinality == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(dataFieldSubFieldCardinality.name());
        }
        this.params.writeToParcel(out, i);
        out.writeInt(this.stored ? 1 : 0);
        out.writeStringList(this.subFields);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ContractorDataField(String str, String str2, ContractorDataFieldKind contractorDataFieldKind, ContractorDataFieldFormat contractorDataFieldFormat, String str3, String str4, DataFieldSubFieldCardinality dataFieldSubFieldCardinality, ContractorDataFieldParams contractorDataFieldParams, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r5, contractorDataFieldKind, contractorDataFieldFormat, r8, r9, r10, contractorDataFieldParams, r12, r13);
        List list2;
        List emptyList;
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 16) != 0 ? null : str3;
        String str8 = (i & 32) != 0 ? null : str4;
        DataFieldSubFieldCardinality dataFieldSubFieldCardinality2 = (i & 64) != 0 ? null : dataFieldSubFieldCardinality;
        boolean z2 = (i & 256) != 0 ? false : z;
        if ((i & 512) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        } else {
            list2 = list;
        }
    }
}
