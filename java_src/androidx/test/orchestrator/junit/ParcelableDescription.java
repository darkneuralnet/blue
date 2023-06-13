package androidx.test.orchestrator.junit;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ParcelableDescription implements Parcelable {
    public static final Parcelable.Creator<ParcelableDescription> CREATOR = new Parcelable.Creator<ParcelableDescription>() { // from class: androidx.test.orchestrator.junit.ParcelableDescription.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableDescription createFromParcel(Parcel parcel) {
            return new ParcelableDescription(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableDescription[] newArray(int i) {
            return new ParcelableDescription[i];
        }
    };

    /* renamed from: b */
    public final String f55717b;

    /* renamed from: c */
    public final String f55718c;

    /* renamed from: d */
    public final String f55719d;

    /* renamed from: a */
    public final String m66007a(Parcel parcel) {
        String readString = parcel.readString();
        return readString == null ? "" : readString;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55717b);
        parcel.writeString(this.f55718c);
        parcel.writeString(this.f55719d);
    }

    public ParcelableDescription(Parcel parcel) {
        this.f55717b = m66007a(parcel);
        this.f55718c = m66007a(parcel);
        this.f55719d = m66007a(parcel);
    }
}
