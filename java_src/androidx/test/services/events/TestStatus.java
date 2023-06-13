package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.util.Checks;
/* loaded from: classes.dex */
public final class TestStatus implements Parcelable {
    public static final Parcelable.Creator<TestStatus> CREATOR = new Parcelable.Creator<TestStatus>() { // from class: androidx.test.services.events.TestStatus.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TestStatus createFromParcel(Parcel parcel) {
            return new TestStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TestStatus[] newArray(int i) {
            return new TestStatus[i];
        }
    };

    /* renamed from: b */
    public Status f55741b;

    /* loaded from: classes.dex */
    public enum Status {
        CANCELLED,
        IGNORED,
        SKIPPED,
        ABORTED,
        PASSED,
        FAILED
    }

    public TestStatus(Parcel parcel) {
        Checks.m66010b(parcel, "source cannot be null");
        this.f55741b = Status.valueOf((String) Checks.m66010b(parcel.readString(), "status cannot be null"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55741b.name());
    }
}
