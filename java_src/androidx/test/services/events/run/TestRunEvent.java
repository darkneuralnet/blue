package androidx.test.services.events.run;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class TestRunEvent implements Parcelable {
    public static final Parcelable.Creator<TestRunEvent> CREATOR = new TestRunEventFactory();

    /* loaded from: classes.dex */
    public enum EventType {
        STARTED,
        TEST_STARTED,
        TEST_FINISHED,
        TEST_ASSUMPTION_FAILURE,
        TEST_FAILURE,
        TEST_IGNORED,
        FINISHED
    }

    /* renamed from: a */
    public abstract EventType mo65972a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo65972a().name());
    }
}
