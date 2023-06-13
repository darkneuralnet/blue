package co.bird.android.model.identification;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationAcceptableAttestation;", "Landroid/os/Parcelable;", "numberRemaining", "", "validReasons", "", "", "durationSeconds", "minAge", "(ILjava/util/List;ILjava/lang/Integer;)V", "getDurationSeconds", "()I", "getMinAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumberRemaining", "getValidReasons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(ILjava/util/List;ILjava/lang/Integer;)Lco/bird/android/model/identification/IdentificationAcceptableAttestation;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationAcceptableAttestation implements Parcelable {
    public static final Parcelable.Creator<IdentificationAcceptableAttestation> CREATOR = new Creator();
    private final int durationSeconds;
    private final Integer minAge;
    private final int numberRemaining;
    private final List<String> validReasons;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<IdentificationAcceptableAttestation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationAcceptableAttestation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IdentificationAcceptableAttestation(parcel.readInt(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdentificationAcceptableAttestation[] newArray(int i) {
            return new IdentificationAcceptableAttestation[i];
        }
    }

    public IdentificationAcceptableAttestation(int i, List<String> validReasons, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(validReasons, "validReasons");
        this.numberRemaining = i;
        this.validReasons = validReasons;
        this.durationSeconds = i2;
        this.minAge = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdentificationAcceptableAttestation copy$default(IdentificationAcceptableAttestation identificationAcceptableAttestation, int i, List list, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = identificationAcceptableAttestation.numberRemaining;
        }
        if ((i3 & 2) != 0) {
            list = identificationAcceptableAttestation.validReasons;
        }
        if ((i3 & 4) != 0) {
            i2 = identificationAcceptableAttestation.durationSeconds;
        }
        if ((i3 & 8) != 0) {
            num = identificationAcceptableAttestation.minAge;
        }
        return identificationAcceptableAttestation.copy(i, list, i2, num);
    }

    public final int component1() {
        return this.numberRemaining;
    }

    public final List<String> component2() {
        return this.validReasons;
    }

    public final int component3() {
        return this.durationSeconds;
    }

    public final Integer component4() {
        return this.minAge;
    }

    public final IdentificationAcceptableAttestation copy(int i, List<String> validReasons, int i2, Integer num) {
        Intrinsics.checkNotNullParameter(validReasons, "validReasons");
        return new IdentificationAcceptableAttestation(i, validReasons, i2, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationAcceptableAttestation) {
            IdentificationAcceptableAttestation identificationAcceptableAttestation = (IdentificationAcceptableAttestation) obj;
            return this.numberRemaining == identificationAcceptableAttestation.numberRemaining && Intrinsics.areEqual(this.validReasons, identificationAcceptableAttestation.validReasons) && this.durationSeconds == identificationAcceptableAttestation.durationSeconds && Intrinsics.areEqual(this.minAge, identificationAcceptableAttestation.minAge);
        }
        return false;
    }

    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    public final Integer getMinAge() {
        return this.minAge;
    }

    public final int getNumberRemaining() {
        return this.numberRemaining;
    }

    public final List<String> getValidReasons() {
        return this.validReasons;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.numberRemaining) * 31) + this.validReasons.hashCode()) * 31) + Integer.hashCode(this.durationSeconds)) * 31;
        Integer num = this.minAge;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        int i = this.numberRemaining;
        List<String> list = this.validReasons;
        int i2 = this.durationSeconds;
        Integer num = this.minAge;
        return "IdentificationAcceptableAttestation(numberRemaining=" + i + ", validReasons=" + list + ", durationSeconds=" + i2 + ", minAge=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.numberRemaining);
        out.writeStringList(this.validReasons);
        out.writeInt(this.durationSeconds);
        Integer num = this.minAge;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public /* synthetic */ IdentificationAcceptableAttestation(int i, List list, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, i2, (i3 & 8) != 0 ? null : num);
    }
}
