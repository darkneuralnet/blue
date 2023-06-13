package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "Landroid/os/Parcelable;", "documentType", "Lco/bird/android/model/identification/IdentificationDocumentType;", "jurisdiction", "Lco/bird/android/model/identification/IdentificationJurisdiction;", "entryMethodType", "Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;", "(Lco/bird/android/model/identification/IdentificationDocumentType;Lco/bird/android/model/identification/IdentificationJurisdiction;Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;)V", "getDocumentType", "()Lco/bird/android/model/identification/IdentificationDocumentType;", "getEntryMethodType", "()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;", "getJurisdiction", "()Lco/bird/android/model/identification/IdentificationJurisdiction;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDocumentDescriptor implements Parcelable {
    public static final Parcelable.Creator<IdentificationDocumentDescriptor> CREATOR = new Creator();
    private final IdentificationDocumentType documentType;
    private final IdentificationAcceptableMethod.EntryMethodType entryMethodType;
    private final IdentificationJurisdiction jurisdiction;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IdentificationDocumentDescriptor> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationDocumentDescriptor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentificationDocumentDescriptor(IdentificationDocumentType.CREATOR.createFromParcel(parcel), (IdentificationJurisdiction) parcel.readParcelable(IdentificationDocumentDescriptor.class.getClassLoader()), IdentificationAcceptableMethod.EntryMethodType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationDocumentDescriptor[] newArray(int i) {
            return new IdentificationDocumentDescriptor[i];
        }
    }

    public IdentificationDocumentDescriptor(IdentificationDocumentType documentType, IdentificationJurisdiction jurisdiction, IdentificationAcceptableMethod.EntryMethodType entryMethodType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(jurisdiction, "jurisdiction");
        Intrinsics.checkNotNullParameter(entryMethodType, "entryMethodType");
        this.documentType = documentType;
        this.jurisdiction = jurisdiction;
        this.entryMethodType = entryMethodType;
    }

    public static /* synthetic */ IdentificationDocumentDescriptor copy$default(IdentificationDocumentDescriptor identificationDocumentDescriptor, IdentificationDocumentType identificationDocumentType, IdentificationJurisdiction identificationJurisdiction, IdentificationAcceptableMethod.EntryMethodType entryMethodType, int i, Object obj) {
        if ((i & 1) != 0) {
            identificationDocumentType = identificationDocumentDescriptor.documentType;
        }
        if ((i & 2) != 0) {
            identificationJurisdiction = identificationDocumentDescriptor.jurisdiction;
        }
        if ((i & 4) != 0) {
            entryMethodType = identificationDocumentDescriptor.entryMethodType;
        }
        return identificationDocumentDescriptor.copy(identificationDocumentType, identificationJurisdiction, entryMethodType);
    }

    public final IdentificationDocumentType component1() {
        return this.documentType;
    }

    public final IdentificationJurisdiction component2() {
        return this.jurisdiction;
    }

    public final IdentificationAcceptableMethod.EntryMethodType component3() {
        return this.entryMethodType;
    }

    public final IdentificationDocumentDescriptor copy(IdentificationDocumentType documentType, IdentificationJurisdiction jurisdiction, IdentificationAcceptableMethod.EntryMethodType entryMethodType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(jurisdiction, "jurisdiction");
        Intrinsics.checkNotNullParameter(entryMethodType, "entryMethodType");
        return new IdentificationDocumentDescriptor(documentType, jurisdiction, entryMethodType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationDocumentDescriptor) {
            IdentificationDocumentDescriptor identificationDocumentDescriptor = (IdentificationDocumentDescriptor) obj;
            return this.documentType == identificationDocumentDescriptor.documentType && Intrinsics.areEqual(this.jurisdiction, identificationDocumentDescriptor.jurisdiction) && this.entryMethodType == identificationDocumentDescriptor.entryMethodType;
        }
        return false;
    }

    public final IdentificationDocumentType getDocumentType() {
        return this.documentType;
    }

    public final IdentificationAcceptableMethod.EntryMethodType getEntryMethodType() {
        return this.entryMethodType;
    }

    public final IdentificationJurisdiction getJurisdiction() {
        return this.jurisdiction;
    }

    public int hashCode() {
        return (((this.documentType.hashCode() * 31) + this.jurisdiction.hashCode()) * 31) + this.entryMethodType.hashCode();
    }

    public String toString() {
        IdentificationDocumentType identificationDocumentType = this.documentType;
        IdentificationJurisdiction identificationJurisdiction = this.jurisdiction;
        IdentificationAcceptableMethod.EntryMethodType entryMethodType = this.entryMethodType;
        return "IdentificationDocumentDescriptor(documentType=" + identificationDocumentType + ", jurisdiction=" + identificationJurisdiction + ", entryMethodType=" + entryMethodType + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.documentType.writeToParcel(out, i);
        out.writeParcelable(this.jurisdiction, i);
        out.writeString(this.entryMethodType.name());
    }
}
