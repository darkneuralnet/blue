package androidx.test.services.events.platform;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class TestPlatformEvent implements Parcelable {
    public static final Parcelable.Creator<TestPlatformEvent> CREATOR = new TestPlatformEventFactory();

    /* loaded from: classes.dex */
    public enum EventType {
        TEST_RUN_STARTED,
        TEST_RUN_ERROR,
        TEST_RUN_FINISHED,
        TEST_CASE_STARTED,
        TEST_CASE_ERROR,
        TEST_CASE_FINISHED
    }

    /* renamed from: a */
    public abstract EventType mo65976a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo65976a().name());
    }
}
