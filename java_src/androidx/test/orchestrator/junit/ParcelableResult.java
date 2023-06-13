package androidx.test.orchestrator.junit;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ParcelableResult implements Parcelable {
    public static final Parcelable.Creator<ParcelableResult> CREATOR = new Parcelable.Creator<ParcelableResult>() { // from class: androidx.test.orchestrator.junit.ParcelableResult.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableResult createFromParcel(Parcel parcel) {
            return new ParcelableResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableResult[] newArray(int i) {
            return new ParcelableResult[i];
        }
    };

    /* renamed from: b */
    public final List<ParcelableFailure> f55722b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeArray(this.f55722b.toArray());
    }

    public ParcelableResult(Parcel parcel) {
        this.f55722b = new ArrayList();
        for (Object obj : parcel.readArray(ParcelableFailure[].class.getClassLoader())) {
            this.f55722b.add((ParcelableFailure) obj);
        }
    }
}
