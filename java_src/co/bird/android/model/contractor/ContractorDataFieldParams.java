package co.bird.android.model.contractor;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000fJ\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003Jt\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\tHÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u0004HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, m28432d2 = {"Lco/bird/android/model/contractor/ContractorDataFieldParams;", "Landroid/os/Parcelable;", "possibleValues", "", "", "errorMessage", "articleId", "", "minLength", "", "maxLength", "minValue", "", "maxValue", "mask", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrorMessage", "()Ljava/lang/String;", "getMask", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMinLength", "getMinValue", "getPossibleValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lco/bird/android/model/contractor/ContractorDataFieldParams;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorDataFieldParams implements Parcelable {
    public static final Parcelable.Creator<ContractorDataFieldParams> CREATOR = new Creator();
    @JsonProperty("article_id")
    @InterfaceC41208ft5("article_id")
    private final Long articleId;
    @JsonProperty("error_message")
    @InterfaceC41208ft5("error_message")
    private final String errorMessage;
    @JsonProperty("mask")
    @InterfaceC41208ft5("mask")
    private final String mask;
    @JsonProperty("max_length")
    @InterfaceC41208ft5("max_length")
    private final Integer maxLength;
    @JsonProperty("max_value")
    @InterfaceC41208ft5("max_value")
    private final Float maxValue;
    @JsonProperty("min_length")
    @InterfaceC41208ft5("min_length")
    private final Integer minLength;
    @JsonProperty("min_value")
    @InterfaceC41208ft5("min_value")
    private final Float minValue;
    @JsonProperty("possible_values")
    @InterfaceC41208ft5("possible_values")
    private final List<String> possibleValues;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ContractorDataFieldParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorDataFieldParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContractorDataFieldParams(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractorDataFieldParams[] newArray(int i) {
            return new ContractorDataFieldParams[i];
        }
    }

    public ContractorDataFieldParams() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final List<String> component1() {
        return this.possibleValues;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final Long component3() {
        return this.articleId;
    }

    public final Integer component4() {
        return this.minLength;
    }

    public final Integer component5() {
        return this.maxLength;
    }

    public final Float component6() {
        return this.minValue;
    }

    public final Float component7() {
        return this.maxValue;
    }

    public final String component8() {
        return this.mask;
    }

    public final ContractorDataFieldParams copy(List<String> list, String str, Long l, Integer num, Integer num2, Float f, Float f2, String str2) {
        return new ContractorDataFieldParams(list, str, l, num, num2, f, f2, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractorDataFieldParams) {
            ContractorDataFieldParams contractorDataFieldParams = (ContractorDataFieldParams) obj;
            return Intrinsics.areEqual(this.possibleValues, contractorDataFieldParams.possibleValues) && Intrinsics.areEqual(this.errorMessage, contractorDataFieldParams.errorMessage) && Intrinsics.areEqual(this.articleId, contractorDataFieldParams.articleId) && Intrinsics.areEqual(this.minLength, contractorDataFieldParams.minLength) && Intrinsics.areEqual(this.maxLength, contractorDataFieldParams.maxLength) && Intrinsics.areEqual((Object) this.minValue, (Object) contractorDataFieldParams.minValue) && Intrinsics.areEqual((Object) this.maxValue, (Object) contractorDataFieldParams.maxValue) && Intrinsics.areEqual(this.mask, contractorDataFieldParams.mask);
        }
        return false;
    }

    public final Long getArticleId() {
        return this.articleId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getMask() {
        return this.mask;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final Float getMaxValue() {
        return this.maxValue;
    }

    public final Integer getMinLength() {
        return this.minLength;
    }

    public final Float getMinValue() {
        return this.minValue;
    }

    public final List<String> getPossibleValues() {
        return this.possibleValues;
    }

    public int hashCode() {
        List<String> list = this.possibleValues;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.errorMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.articleId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.minLength;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLength;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.minValue;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.maxValue;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str2 = this.mask;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.possibleValues;
        String str = this.errorMessage;
        Long l = this.articleId;
        Integer num = this.minLength;
        Integer num2 = this.maxLength;
        Float f = this.minValue;
        Float f2 = this.maxValue;
        String str2 = this.mask;
        return "ContractorDataFieldParams(possibleValues=" + list + ", errorMessage=" + str + ", articleId=" + l + ", minLength=" + num + ", maxLength=" + num2 + ", minValue=" + f + ", maxValue=" + f2 + ", mask=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeStringList(this.possibleValues);
        out.writeString(this.errorMessage);
        Long l = this.articleId;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        Integer num = this.minLength;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.maxLength;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Float f = this.minValue;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        Float f2 = this.maxValue;
        if (f2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f2.floatValue());
        }
        out.writeString(this.mask);
    }

    public ContractorDataFieldParams(List<String> list, String str, Long l, Integer num, Integer num2, Float f, Float f2, String str2) {
        this.possibleValues = list;
        this.errorMessage = str;
        this.articleId = l;
        this.minLength = num;
        this.maxLength = num2;
        this.minValue = f;
        this.maxValue = f2;
        this.mask = str2;
    }

    public /* synthetic */ ContractorDataFieldParams(List list, String str, Long l, Integer num, Integer num2, Float f, Float f2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2, (i & 128) == 0 ? str2 : null);
    }
}
