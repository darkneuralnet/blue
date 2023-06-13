package co.bird.android.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScanIntention;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/extra/RiderBirdScanExtra;", "Landroid/os/Parcelable;", "scanIntention", "Lco/bird/android/model/constant/ScanIntention;", "birdCode", "", "(Lco/bird/android/model/constant/ScanIntention;Ljava/lang/String;)V", "getBirdCode", "()Ljava/lang/String;", "getScanIntention", "()Lco/bird/android/model/constant/ScanIntention;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderBirdScanExtra implements Parcelable {
    public static final Parcelable.Creator<RiderBirdScanExtra> CREATOR = new Creator();
    private final String birdCode;
    private final ScanIntention scanIntention;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RiderBirdScanExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiderBirdScanExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RiderBirdScanExtra(ScanIntention.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiderBirdScanExtra[] newArray(int i) {
            return new RiderBirdScanExtra[i];
        }
    }

    public RiderBirdScanExtra() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RiderBirdScanExtra copy$default(RiderBirdScanExtra riderBirdScanExtra, ScanIntention scanIntention, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            scanIntention = riderBirdScanExtra.scanIntention;
        }
        if ((i & 2) != 0) {
            str = riderBirdScanExtra.birdCode;
        }
        return riderBirdScanExtra.copy(scanIntention, str);
    }

    public final ScanIntention component1() {
        return this.scanIntention;
    }

    public final String component2() {
        return this.birdCode;
    }

    public final RiderBirdScanExtra copy(ScanIntention scanIntention, String str) {
        Intrinsics.checkNotNullParameter(scanIntention, "scanIntention");
        return new RiderBirdScanExtra(scanIntention, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RiderBirdScanExtra) {
            RiderBirdScanExtra riderBirdScanExtra = (RiderBirdScanExtra) obj;
            return this.scanIntention == riderBirdScanExtra.scanIntention && Intrinsics.areEqual(this.birdCode, riderBirdScanExtra.birdCode);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final ScanIntention getScanIntention() {
        return this.scanIntention;
    }

    public int hashCode() {
        int hashCode = this.scanIntention.hashCode() * 31;
        String str = this.birdCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        ScanIntention scanIntention = this.scanIntention;
        String str = this.birdCode;
        return "RiderBirdScanExtra(scanIntention=" + scanIntention + ", birdCode=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.scanIntention.writeToParcel(out, i);
        out.writeString(this.birdCode);
    }

    public RiderBirdScanExtra(ScanIntention scanIntention, String str) {
        Intrinsics.checkNotNullParameter(scanIntention, "scanIntention");
        this.scanIntention = scanIntention;
        this.birdCode = str;
    }

    public /* synthetic */ RiderBirdScanExtra(ScanIntention scanIntention, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ScanIntention.RIDE : scanIntention, (i & 2) != 0 ? null : str);
    }
}
