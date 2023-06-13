package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationStateJurisdiction;", "Lco/bird/android/model/identification/IdentificationJurisdiction;", TransferTable.COLUMN_STATE, "", "(Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationStateJurisdiction extends IdentificationJurisdiction {
    public static final Parcelable.Creator<IdentificationStateJurisdiction> CREATOR = new Creator();
    private final String state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IdentificationStateJurisdiction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationStateJurisdiction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentificationStateJurisdiction(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationStateJurisdiction[] newArray(int i) {
            return new IdentificationStateJurisdiction[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentificationStateJurisdiction(String state) {
        super(state, null);
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    public static /* synthetic */ IdentificationStateJurisdiction copy$default(IdentificationStateJurisdiction identificationStateJurisdiction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identificationStateJurisdiction.state;
        }
        return identificationStateJurisdiction.copy(str);
    }

    public final String component1() {
        return this.state;
    }

    public final IdentificationStateJurisdiction copy(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new IdentificationStateJurisdiction(state);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentificationStateJurisdiction) && Intrinsics.areEqual(this.state, ((IdentificationStateJurisdiction) obj).state);
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        String str = this.state;
        return "IdentificationStateJurisdiction(state=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.state);
    }
}