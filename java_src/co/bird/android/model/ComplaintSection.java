package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/ComplaintSection;", "Landroid/os/Parcelable;", "type", "Lco/bird/android/model/ComplaintSectionType;", "title", "", "property", "options", "", "Lco/bird/android/model/ComplaintOption;", "placeholder", "(Lco/bird/android/model/ComplaintSectionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getOptions", "()Ljava/util/List;", "getPlaceholder", "()Ljava/lang/String;", "getProperty", "getTitle", "getType", "()Lco/bird/android/model/ComplaintSectionType;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ComplaintSection implements Parcelable {
    public static final Parcelable.Creator<ComplaintSection> CREATOR = new Creator();
    @JsonProperty("options")
    @InterfaceC41208ft5("options")
    private final List<ComplaintOption> options;
    @JsonProperty("placeholder")
    @InterfaceC41208ft5("placeholder")
    private final String placeholder;
    @JsonProperty("property")
    @InterfaceC41208ft5("property")
    private final String property;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final ComplaintSectionType type;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ComplaintSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComplaintSection createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ComplaintSectionType valueOf = ComplaintSectionType.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(ComplaintOption.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new ComplaintSection(valueOf, readString, readString2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComplaintSection[] newArray(int i) {
            return new ComplaintSection[i];
        }
    }

    public ComplaintSection(ComplaintSectionType type, String str, String property, List<ComplaintOption> list, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(property, "property");
        this.type = type;
        this.title = str;
        this.property = property;
        this.options = list;
        this.placeholder = str2;
    }

    public static /* synthetic */ ComplaintSection copy$default(ComplaintSection complaintSection, ComplaintSectionType complaintSectionType, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            complaintSectionType = complaintSection.type;
        }
        if ((i & 2) != 0) {
            str = complaintSection.title;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = complaintSection.property;
        }
        String str5 = str2;
        List<ComplaintOption> list2 = list;
        if ((i & 8) != 0) {
            list2 = complaintSection.options;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str3 = complaintSection.placeholder;
        }
        return complaintSection.copy(complaintSectionType, str4, str5, list3, str3);
    }

    public final ComplaintSectionType component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.property;
    }

    public final List<ComplaintOption> component4() {
        return this.options;
    }

    public final String component5() {
        return this.placeholder;
    }

    public final ComplaintSection copy(ComplaintSectionType type, String str, String property, List<ComplaintOption> list, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(property, "property");
        return new ComplaintSection(type, str, property, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComplaintSection) {
            ComplaintSection complaintSection = (ComplaintSection) obj;
            return this.type == complaintSection.type && Intrinsics.areEqual(this.title, complaintSection.title) && Intrinsics.areEqual(this.property, complaintSection.property) && Intrinsics.areEqual(this.options, complaintSection.options) && Intrinsics.areEqual(this.placeholder, complaintSection.placeholder);
        }
        return false;
    }

    public final List<ComplaintOption> getOptions() {
        return this.options;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ComplaintSectionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.property.hashCode()) * 31;
        List<ComplaintOption> list = this.options;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.placeholder;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ComplaintSectionType complaintSectionType = this.type;
        String str = this.title;
        String str2 = this.property;
        List<ComplaintOption> list = this.options;
        String str3 = this.placeholder;
        return "ComplaintSection(type=" + complaintSectionType + ", title=" + str + ", property=" + str2 + ", options=" + list + ", placeholder=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.type.name());
        out.writeString(this.title);
        out.writeString(this.property);
        List<ComplaintOption> list = this.options;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ComplaintOption complaintOption : list) {
                complaintOption.writeToParcel(out, i);
            }
        }
        out.writeString(this.placeholder);
    }

    public /* synthetic */ ComplaintSection(ComplaintSectionType complaintSectionType, String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(complaintSectionType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3);
    }
}
