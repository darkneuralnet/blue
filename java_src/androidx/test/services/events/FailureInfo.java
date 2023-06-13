package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.util.Checks;
/* loaded from: classes.dex */
public final class FailureInfo implements Parcelable {
    public static final Parcelable.Creator<FailureInfo> CREATOR = new Parcelable.Creator<FailureInfo>() { // from class: androidx.test.services.events.FailureInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FailureInfo createFromParcel(Parcel parcel) {
            return new FailureInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public FailureInfo[] newArray(int i) {
            return new FailureInfo[i];
        }
    };

    /* renamed from: b */
    public final String f55731b;

    /* renamed from: c */
    public final String f55732c;

    /* renamed from: d */
    public final String f55733d;

    /* renamed from: e */
    public final TestCaseInfo f55734e;

    public FailureInfo(Parcel parcel) {
        Checks.m66010b(parcel, "source cannot be null");
        this.f55731b = parcel.readString();
        this.f55732c = parcel.readString();
        this.f55733d = parcel.readString();
        this.f55734e = (TestCaseInfo) parcel.readParcelable(TestCaseInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55731b);
        parcel.writeString(this.f55732c);
        parcel.writeString(this.f55733d);
        parcel.writeParcelable(this.f55734e, i);
    }
}
