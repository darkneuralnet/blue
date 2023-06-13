package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.util.Checks;
/* loaded from: classes.dex */
public final class TimeStamp implements Parcelable {
    public static final Parcelable.Creator<TimeStamp> CREATOR = new Parcelable.Creator<TimeStamp>() { // from class: androidx.test.services.events.TimeStamp.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeStamp createFromParcel(Parcel parcel) {
            return new TimeStamp(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeStamp[] newArray(int i) {
            return new TimeStamp[i];
        }
    };

    /* renamed from: b */
    public final Long f55749b;

    /* renamed from: c */
    public final Integer f55750c;

    public TimeStamp(Parcel parcel) {
        Checks.m66010b(parcel, "source cannot be null");
        this.f55749b = (Long) Checks.m66010b(Long.valueOf(parcel.readLong()), "seconds cannot be null");
        this.f55750c = (Integer) Checks.m66010b(Integer.valueOf(parcel.readInt()), "nanos cannot be null");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f55749b.longValue());
        parcel.writeInt(this.f55750c.intValue());
    }
}
