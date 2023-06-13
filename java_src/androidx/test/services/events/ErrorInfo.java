package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.util.Checks;
/* loaded from: classes.dex */
public final class ErrorInfo implements Parcelable {
    public static final Parcelable.Creator<ErrorInfo> CREATOR = new Parcelable.Creator<ErrorInfo>() { // from class: androidx.test.services.events.ErrorInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ErrorInfo createFromParcel(Parcel parcel) {
            return new ErrorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ErrorInfo[] newArray(int i) {
            return new ErrorInfo[i];
        }
    };

    /* renamed from: b */
    public final String f55728b;

    /* renamed from: c */
    public final String f55729c;

    /* renamed from: d */
    public final String f55730d;

    public ErrorInfo(Parcel parcel) {
        Checks.m66010b(parcel, "source cannot be null");
        this.f55728b = parcel.readString();
        this.f55729c = parcel.readString();
        this.f55730d = (String) Checks.m66010b(parcel.readString(), "stackTrace cannot be null");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55728b);
        parcel.writeString(this.f55729c);
        parcel.writeString(this.f55730d);
    }
}
