package androidx.test.services.events.discovery;

import android.os.Parcel;
import androidx.test.services.events.ErrorInfo;
import androidx.test.services.events.TimeStamp;
import androidx.test.services.events.discovery.TestDiscoveryEvent;
/* loaded from: classes.dex */
public class TestDiscoveryErrorEvent extends TestDiscoveryEvent {

    /* renamed from: b */
    public final ErrorInfo f55751b;

    /* renamed from: c */
    public final TimeStamp f55752c;

    public TestDiscoveryErrorEvent(Parcel parcel) {
        this.f55751b = new ErrorInfo(parcel);
        this.f55752c = new TimeStamp(parcel);
    }

    @Override // androidx.test.services.events.discovery.TestDiscoveryEvent
    /* renamed from: a */
    public TestDiscoveryEvent.EventType mo65980a() {
        return TestDiscoveryEvent.EventType.ERROR;
    }

    @Override // androidx.test.services.events.discovery.TestDiscoveryEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        this.f55751b.writeToParcel(parcel, i);
        this.f55752c.writeToParcel(parcel, i);
    }
}
