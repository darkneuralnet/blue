package androidx.test.orchestrator.junit;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ParcelableFailure implements Parcelable {
    public static final Parcelable.Creator<ParcelableFailure> CREATOR = new Parcelable.Creator<ParcelableFailure>() { // from class: androidx.test.orchestrator.junit.ParcelableFailure.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableFailure createFromParcel(Parcel parcel) {
            return new ParcelableFailure(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableFailure[] newArray(int i) {
            return new ParcelableFailure[i];
        }
    };

    /* renamed from: b */
    public final ParcelableDescription f55720b;

    /* renamed from: c */
    public final String f55721c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f55720b, 0);
        parcel.writeString(this.f55721c);
    }

    public ParcelableFailure(Parcel parcel) {
        this.f55720b = (ParcelableDescription) parcel.readParcelable(ParcelableDescription.class.getClassLoader());
        this.f55721c = parcel.readString();
    }
}
