package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005HÖ\u0001j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00062"}, m28432d2 = {"Lco/bird/android/model/IssueKind;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "displayName", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FLAT_TIRE", "BRAKE", "MOTOR", "NOISE", "UNLOCK", "LOCK", "HANDLEBARS", "SHAFT", "HEADLIGHTS", "BROKEN", "MISSING", "SLOW", "PHYSICAL_LOCK", "PHYSICAL_LOCK_MISSING", "DAMAGED_BRAIN", "NEEDS_PARTS", "TOO_DAMAGED", "WONT_STOP", "BUMPY", "SHAKY", "WONT_START", "TEST_RIDE_SLOW", "BRAKES", "BRAIN", "CUT_WIRES", "BELL", "WHEEL", "LIGHTS_OFF", "SCREWS", "THROTTLE", "QR_CODE", "OFFLINE", "KICKSTAND", "FENDER", "BLUETOOTH_CONNECTION", "BLUETOOTH_COMMUNICATION", "OTHER", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum IssueKind implements Parcelable {
    FLAT_TIRE,
    BRAKE,
    MOTOR,
    NOISE,
    UNLOCK,
    LOCK,
    HANDLEBARS,
    SHAFT,
    HEADLIGHTS,
    BROKEN,
    MISSING,
    SLOW,
    PHYSICAL_LOCK,
    PHYSICAL_LOCK_MISSING,
    DAMAGED_BRAIN,
    NEEDS_PARTS,
    TOO_DAMAGED,
    WONT_STOP,
    BUMPY,
    SHAKY,
    WONT_START,
    TEST_RIDE_SLOW,
    BRAKES,
    BRAIN,
    CUT_WIRES,
    BELL,
    WHEEL,
    LIGHTS_OFF,
    SCREWS,
    THROTTLE,
    QR_CODE,
    OFFLINE,
    KICKSTAND,
    FENDER,
    BLUETOOTH_CONNECTION,
    BLUETOOTH_COMMUNICATION,
    OTHER;
    
    public static final Parcelable.Creator<IssueKind> CREATOR = new Parcelable.Creator<IssueKind>() { // from class: co.bird.android.model.IssueKind.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueKind createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return IssueKind.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueKind[] newArray(int i) {
            return new IssueKind[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String displayName() {
        String replace$default;
        replace$default = StringsKt__StringsJVMKt.replace$default(name(), "_", " ", false, 4, (Object) null);
        return replace$default;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
