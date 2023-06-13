package androidx.test.services.events;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.util.Checks;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class TestRunInfo implements Parcelable {
    public static final Parcelable.Creator<TestRunInfo> CREATOR = new Parcelable.Creator<TestRunInfo>() { // from class: androidx.test.services.events.TestRunInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TestRunInfo createFromParcel(Parcel parcel) {
            return new TestRunInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TestRunInfo[] newArray(int i) {
            return new TestRunInfo[i];
        }
    };

    /* renamed from: b */
    public final String f55739b;

    /* renamed from: c */
    public final List<TestCaseInfo> f55740c;

    public TestRunInfo(Parcel parcel) {
        Checks.m66010b(parcel, "source cannot be null");
        this.f55739b = (String) Checks.m66010b(parcel.readString(), "className cannot be null");
        ArrayList arrayList = new ArrayList();
        this.f55740c = arrayList;
        parcel.readTypedList(arrayList, TestCaseInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55739b);
        parcel.writeTypedList(this.f55740c);
    }
}
