package co.bird.android.model.constant;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005HÖ\u0001j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/constant/ScanIntention;", "", "Landroid/os/Parcelable;", "(Ljava/lang/String;I)V", "describeContents", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "RIDE", "GUEST_RIDE", "QUICKSTART", "NEST_RELEASE", "DELIVERY_RELEASE", "BULK_PROGRESS", "BULK_SCAN", "OPERATOR_ACTION", "OPERATOR_IDENTIFICATION", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum ScanIntention implements Parcelable {
    RIDE,
    GUEST_RIDE,
    QUICKSTART,
    NEST_RELEASE,
    DELIVERY_RELEASE,
    BULK_PROGRESS,
    BULK_SCAN,
    OPERATOR_ACTION,
    OPERATOR_IDENTIFICATION;
    
    public static final Parcelable.Creator<ScanIntention> CREATOR = new Parcelable.Creator<ScanIntention>() { // from class: co.bird.android.model.constant.ScanIntention.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScanIntention createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ScanIntention.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScanIntention[] newArray(int i) {
            return new ScanIntention[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}