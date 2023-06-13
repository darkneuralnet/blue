package androidx.test.services.events.run;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.services.events.FailureInfo;
import androidx.test.services.events.run.TestRunEvent;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class TestRunFinishedEvent extends TestRunEvent {

    /* renamed from: b */
    public final int f55795b;

    /* renamed from: c */
    public final int f55796c;

    /* renamed from: d */
    public final long f55797d;

    /* renamed from: e */
    public final List<FailureInfo> f55798e = new ArrayList();

    public TestRunFinishedEvent(Parcel parcel) {
        this.f55795b = parcel.readInt();
        this.f55796c = parcel.readInt();
        this.f55797d = parcel.readLong();
        for (Parcelable parcelable : parcel.readParcelableArray(FailureInfo[].class.getClassLoader())) {
            this.f55798e.add((FailureInfo) parcelable);
        }
    }

    @Override // androidx.test.services.events.run.TestRunEvent
    /* renamed from: a */
    public TestRunEvent.EventType mo65972a() {
        return TestRunEvent.EventType.FINISHED;
    }

    @Override // androidx.test.services.events.run.TestRunEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f55795b);
        parcel.writeInt(this.f55796c);
        parcel.writeLong(this.f55797d);
        parcel.writeParcelableArray((FailureInfo[]) this.f55798e.toArray(new FailureInfo[0]), i);
    }
}
