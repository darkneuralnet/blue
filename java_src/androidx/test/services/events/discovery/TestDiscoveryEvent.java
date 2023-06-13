package androidx.test.services.events.discovery;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class TestDiscoveryEvent implements Parcelable {
    public static final Parcelable.Creator<TestDiscoveryEvent> CREATOR = new TestDiscoveryEventFactory();

    /* loaded from: classes.dex */
    public enum EventType {
        STARTED,
        TEST_FOUND,
        ERROR,
        FINISHED
    }

    /* renamed from: a */
    public abstract EventType mo65980a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo65980a().name());
    }
}
