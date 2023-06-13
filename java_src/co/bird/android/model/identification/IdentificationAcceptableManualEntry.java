package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u009a\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\t\u00100\u001a\u00020\u0010HÖ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0010HÖ\u0001J\t\u00105\u001a\u00020\tHÖ\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001b¨\u0006;"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "Landroid/os/Parcelable;", "offerBeforeScan", "", "allowedDocumentTypes", "", "Lco/bird/android/model/identification/IdentificationDocumentType;", "allowedSpecialDocumentTypes", "requireIdNumberRegex", "", "requireIssuingAuthority", "requireGender", "requireNationality", "requireName", "requireIssueDate", "implicitAgeYears", "", "implicitExpirationDays", "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)V", "getAllowedDocumentTypes", "()Ljava/util/List;", "getAllowedSpecialDocumentTypes", "getImplicitAgeYears", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImplicitExpirationDays", "getOfferBeforeScan", "()Z", "getRequireGender", "getRequireIdNumberRegex", "()Ljava/lang/String;", "getRequireIssueDate", "getRequireIssuingAuthority", "getRequireName", "getRequireNationality", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZZZLjava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationAcceptableManualEntry implements Parcelable {
    public static final Parcelable.Creator<IdentificationAcceptableManualEntry> CREATOR = new Creator();
    private final List<IdentificationDocumentType> allowedDocumentTypes;
    private final List<IdentificationDocumentType> allowedSpecialDocumentTypes;
    private final Integer implicitAgeYears;
    private final Integer implicitExpirationDays;
    private final boolean offerBeforeScan;
    private final boolean requireGender;
    private final String requireIdNumberRegex;
    private final boolean requireIssueDate;
    private final List<String> requireIssuingAuthority;
    private final boolean requireName;
    private final boolean requireNationality;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IdentificationAcceptableManualEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationAcceptableManualEntry createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(IdentificationDocumentType.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(IdentificationDocumentType.CREATOR.createFromParcel(parcel));
                }
            }
            return new IdentificationAcceptableManualEntry(z, arrayList, arrayList2, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationAcceptableManualEntry[] newArray(int i) {
            return new IdentificationAcceptableManualEntry[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdentificationAcceptableManualEntry(boolean z, List<? extends IdentificationDocumentType> list, List<? extends IdentificationDocumentType> list2, String str, List<String> list3, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Integer num2) {
        this.offerBeforeScan = z;
        this.allowedDocumentTypes = list;
        this.allowedSpecialDocumentTypes = list2;
        this.requireIdNumberRegex = str;
        this.requireIssuingAuthority = list3;
        this.requireGender = z2;
        this.requireNationality = z3;
        this.requireName = z4;
        this.requireIssueDate = z5;
        this.implicitAgeYears = num;
        this.implicitExpirationDays = num2;
    }

    public final boolean component1() {
        return this.offerBeforeScan;
    }

    public final Integer component10() {
        return this.implicitAgeYears;
    }

    public final Integer component11() {
        return this.implicitExpirationDays;
    }

    public final List<IdentificationDocumentType> component2() {
        return this.allowedDocumentTypes;
    }

    public final List<IdentificationDocumentType> component3() {
        return this.allowedSpecialDocumentTypes;
    }

    public final String component4() {
        return this.requireIdNumberRegex;
    }

    public final List<String> component5() {
        return this.requireIssuingAuthority;
    }

    public final boolean component6() {
        return this.requireGender;
    }

    public final boolean component7() {
        return this.requireNationality;
    }

    public final boolean component8() {
        return this.requireName;
    }

    public final boolean component9() {
        return this.requireIssueDate;
    }

    public final IdentificationAcceptableManualEntry copy(boolean z, List<? extends IdentificationDocumentType> list, List<? extends IdentificationDocumentType> list2, String str, List<String> list3, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Integer num2) {
        return new IdentificationAcceptableManualEntry(z, list, list2, str, list3, z2, z3, z4, z5, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationAcceptableManualEntry) {
            IdentificationAcceptableManualEntry identificationAcceptableManualEntry = (IdentificationAcceptableManualEntry) obj;
            return this.offerBeforeScan == identificationAcceptableManualEntry.offerBeforeScan && Intrinsics.areEqual(this.allowedDocumentTypes, identificationAcceptableManualEntry.allowedDocumentTypes) && Intrinsics.areEqual(this.allowedSpecialDocumentTypes, identificationAcceptableManualEntry.allowedSpecialDocumentTypes) && Intrinsics.areEqual(this.requireIdNumberRegex, identificationAcceptableManualEntry.requireIdNumberRegex) && Intrinsics.areEqual(this.requireIssuingAuthority, identificationAcceptableManualEntry.requireIssuingAuthority) && this.requireGender == identificationAcceptableManualEntry.requireGender && this.requireNationality == identificationAcceptableManualEntry.requireNationality && this.requireName == identificationAcceptableManualEntry.requireName && this.requireIssueDate == identificationAcceptableManualEntry.requireIssueDate && Intrinsics.areEqual(this.implicitAgeYears, identificationAcceptableManualEntry.implicitAgeYears) && Intrinsics.areEqual(this.implicitExpirationDays, identificationAcceptableManualEntry.implicitExpirationDays);
        }
        return false;
    }

    public final List<IdentificationDocumentType> getAllowedDocumentTypes() {
        return this.allowedDocumentTypes;
    }

    public final List<IdentificationDocumentType> getAllowedSpecialDocumentTypes() {
        return this.allowedSpecialDocumentTypes;
    }

    public final Integer getImplicitAgeYears() {
        return this.implicitAgeYears;
    }

    public final Integer getImplicitExpirationDays() {
        return this.implicitExpirationDays;
    }

    public final boolean getOfferBeforeScan() {
        return this.offerBeforeScan;
    }

    public final boolean getRequireGender() {
        return this.requireGender;
    }

    public final String getRequireIdNumberRegex() {
        return this.requireIdNumberRegex;
    }

    public final boolean getRequireIssueDate() {
        return this.requireIssueDate;
    }

    public final List<String> getRequireIssuingAuthority() {
        return this.requireIssuingAuthority;
    }

    public final boolean getRequireName() {
        return this.requireName;
    }

    public final boolean getRequireNationality() {
        return this.requireNationality;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    public int hashCode() {
        boolean z = this.offerBeforeScan;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<IdentificationDocumentType> list = this.allowedDocumentTypes;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        List<IdentificationDocumentType> list2 = this.allowedSpecialDocumentTypes;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.requireIdNumberRegex;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list3 = this.requireIssuingAuthority;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ?? r2 = this.requireGender;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode4 + i2) * 31;
        ?? r22 = this.requireNationality;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.requireName;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.requireIssueDate;
        int i8 = (i7 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Integer num = this.implicitAgeYears;
        int hashCode5 = (i8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.implicitExpirationDays;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.offerBeforeScan;
        List<IdentificationDocumentType> list = this.allowedDocumentTypes;
        List<IdentificationDocumentType> list2 = this.allowedSpecialDocumentTypes;
        String str = this.requireIdNumberRegex;
        List<String> list3 = this.requireIssuingAuthority;
        boolean z2 = this.requireGender;
        boolean z3 = this.requireNationality;
        boolean z4 = this.requireName;
        boolean z5 = this.requireIssueDate;
        Integer num = this.implicitAgeYears;
        Integer num2 = this.implicitExpirationDays;
        return "IdentificationAcceptableManualEntry(offerBeforeScan=" + z + ", allowedDocumentTypes=" + list + ", allowedSpecialDocumentTypes=" + list2 + ", requireIdNumberRegex=" + str + ", requireIssuingAuthority=" + list3 + ", requireGender=" + z2 + ", requireNationality=" + z3 + ", requireName=" + z4 + ", requireIssueDate=" + z5 + ", implicitAgeYears=" + num + ", implicitExpirationDays=" + num2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.offerBeforeScan ? 1 : 0);
        List<IdentificationDocumentType> list = this.allowedDocumentTypes;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (IdentificationDocumentType identificationDocumentType : list) {
                identificationDocumentType.writeToParcel(out, i);
            }
        }
        List<IdentificationDocumentType> list2 = this.allowedSpecialDocumentTypes;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (IdentificationDocumentType identificationDocumentType2 : list2) {
                identificationDocumentType2.writeToParcel(out, i);
            }
        }
        out.writeString(this.requireIdNumberRegex);
        out.writeStringList(this.requireIssuingAuthority);
        out.writeInt(this.requireGender ? 1 : 0);
        out.writeInt(this.requireNationality ? 1 : 0);
        out.writeInt(this.requireName ? 1 : 0);
        out.writeInt(this.requireIssueDate ? 1 : 0);
        Integer num = this.implicitAgeYears;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.implicitExpirationDays;
        if (num2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num2.intValue());
    }

    public /* synthetic */ IdentificationAcceptableManualEntry(boolean z, List list, List list2, String str, List list3, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list3, z2, z3, z4, z5, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : num2);
    }
}
