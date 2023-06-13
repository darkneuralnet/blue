package androidx.test.services.events.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.services.events.discovery.TestDiscoveryEvent;
/* loaded from: classes.dex */
final class TestDiscoveryEventFactory implements Parcelable.Creator<TestDiscoveryEvent> {

    /* renamed from: androidx.test.services.events.discovery.TestDiscoveryEventFactory$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C120031 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55758a;

        static {
            int[] iArr = new int[TestDiscoveryEvent.EventType.values().length];
            f55758a = iArr;
            try {
                iArr[TestDiscoveryEvent.EventType.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55758a[TestDiscoveryEvent.EventType.TEST_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55758a[TestDiscoveryEvent.EventType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55758a[TestDiscoveryEvent.EventType.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TestDiscoveryEvent createFromParcel(Parcel parcel) {
        TestDiscoveryEvent.EventType valueOf = TestDiscoveryEvent.EventType.valueOf(parcel.readString());
        int i = C120031.f55758a[valueOf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new TestDiscoveryFinishedEvent();
                    }
                    String valueOf2 = String.valueOf(valueOf);
                    throw new IllegalArgumentException("Unhandled event type: " + valueOf2);
                }
                return new TestDiscoveryErrorEvent(parcel);
            }
            return new TestFoundEvent(parcel);
        }
        return new TestDiscoveryStartedEvent();
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public TestDiscoveryEvent[] newArray(int i) {
        return new TestDiscoveryEvent[i];
    }
}
