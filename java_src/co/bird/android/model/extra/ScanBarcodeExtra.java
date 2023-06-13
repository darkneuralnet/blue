package co.bird.android.model.extra;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.ScanType;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.ScanIntention;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m28432d2 = {"Lco/bird/android/model/extra/ScanBarcodeExtra;", "Landroid/os/Parcelable;", "scanType", "Lco/bird/android/model/ScanType;", "birdCode", "", "action", "Lco/bird/android/model/constant/BirdAction;", "mode", "Lco/bird/android/model/constant/MapMode;", "intention", "Lco/bird/android/model/constant/ScanIntention;", "damageStatusUpdate", "", "(Lco/bird/android/model/ScanType;Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;Lco/bird/android/model/constant/MapMode;Lco/bird/android/model/constant/ScanIntention;Z)V", "getAction", "()Lco/bird/android/model/constant/BirdAction;", "getBirdCode", "()Ljava/lang/String;", "getDamageStatusUpdate", "()Z", "getIntention", "()Lco/bird/android/model/constant/ScanIntention;", "getMode", "()Lco/bird/android/model/constant/MapMode;", "getScanType", "()Lco/bird/android/model/ScanType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ScanBarcodeExtra implements Parcelable {
    public static final Parcelable.Creator<ScanBarcodeExtra> CREATOR = new Creator();
    private final BirdAction action;
    private final String birdCode;
    private final boolean damageStatusUpdate;
    private final ScanIntention intention;
    private final MapMode mode;
    private final ScanType scanType;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ScanBarcodeExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScanBarcodeExtra createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScanBarcodeExtra(ScanType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : BirdAction.valueOf(parcel.readString()), MapMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? ScanIntention.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScanBarcodeExtra[] newArray(int i) {
            return new ScanBarcodeExtra[i];
        }
    }

    public ScanBarcodeExtra(ScanType scanType, String str, BirdAction birdAction, MapMode mode, ScanIntention scanIntention, boolean z) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.scanType = scanType;
        this.birdCode = str;
        this.action = birdAction;
        this.mode = mode;
        this.intention = scanIntention;
        this.damageStatusUpdate = z;
    }

    public static /* synthetic */ ScanBarcodeExtra copy$default(ScanBarcodeExtra scanBarcodeExtra, ScanType scanType, String str, BirdAction birdAction, MapMode mapMode, ScanIntention scanIntention, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            scanType = scanBarcodeExtra.scanType;
        }
        if ((i & 2) != 0) {
            str = scanBarcodeExtra.birdCode;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            birdAction = scanBarcodeExtra.action;
        }
        BirdAction birdAction2 = birdAction;
        if ((i & 8) != 0) {
            mapMode = scanBarcodeExtra.mode;
        }
        MapMode mapMode2 = mapMode;
        if ((i & 16) != 0) {
            scanIntention = scanBarcodeExtra.intention;
        }
        ScanIntention scanIntention2 = scanIntention;
        if ((i & 32) != 0) {
            z = scanBarcodeExtra.damageStatusUpdate;
        }
        return scanBarcodeExtra.copy(scanType, str2, birdAction2, mapMode2, scanIntention2, z);
    }

    public final ScanType component1() {
        return this.scanType;
    }

    public final String component2() {
        return this.birdCode;
    }

    public final BirdAction component3() {
        return this.action;
    }

    public final MapMode component4() {
        return this.mode;
    }

    public final ScanIntention component5() {
        return this.intention;
    }

    public final boolean component6() {
        return this.damageStatusUpdate;
    }

    public final ScanBarcodeExtra copy(ScanType scanType, String str, BirdAction birdAction, MapMode mode, ScanIntention scanIntention, boolean z) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new ScanBarcodeExtra(scanType, str, birdAction, mode, scanIntention, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScanBarcodeExtra) {
            ScanBarcodeExtra scanBarcodeExtra = (ScanBarcodeExtra) obj;
            return this.scanType == scanBarcodeExtra.scanType && Intrinsics.areEqual(this.birdCode, scanBarcodeExtra.birdCode) && this.action == scanBarcodeExtra.action && this.mode == scanBarcodeExtra.mode && this.intention == scanBarcodeExtra.intention && this.damageStatusUpdate == scanBarcodeExtra.damageStatusUpdate;
        }
        return false;
    }

    public final BirdAction getAction() {
        return this.action;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final boolean getDamageStatusUpdate() {
        return this.damageStatusUpdate;
    }

    public final ScanIntention getIntention() {
        return this.intention;
    }

    public final MapMode getMode() {
        return this.mode;
    }

    public final ScanType getScanType() {
        return this.scanType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.scanType.hashCode() * 31;
        String str = this.birdCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BirdAction birdAction = this.action;
        int hashCode3 = (((hashCode2 + (birdAction == null ? 0 : birdAction.hashCode())) * 31) + this.mode.hashCode()) * 31;
        ScanIntention scanIntention = this.intention;
        int hashCode4 = (hashCode3 + (scanIntention != null ? scanIntention.hashCode() : 0)) * 31;
        boolean z = this.damageStatusUpdate;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        ScanType scanType = this.scanType;
        String str = this.birdCode;
        BirdAction birdAction = this.action;
        MapMode mapMode = this.mode;
        ScanIntention scanIntention = this.intention;
        boolean z = this.damageStatusUpdate;
        return "ScanBarcodeExtra(scanType=" + scanType + ", birdCode=" + str + ", action=" + birdAction + ", mode=" + mapMode + ", intention=" + scanIntention + ", damageStatusUpdate=" + z + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.scanType.name());
        out.writeString(this.birdCode);
        BirdAction birdAction = this.action;
        if (birdAction == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(birdAction.name());
        }
        out.writeString(this.mode.name());
        ScanIntention scanIntention = this.intention;
        if (scanIntention == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            scanIntention.writeToParcel(out, i);
        }
        out.writeInt(this.damageStatusUpdate ? 1 : 0);
    }

    public /* synthetic */ ScanBarcodeExtra(ScanType scanType, String str, BirdAction birdAction, MapMode mapMode, ScanIntention scanIntention, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ScanType.EXISTING_QR_CODE : scanType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : birdAction, mapMode, (i & 16) != 0 ? null : scanIntention, (i & 32) != 0 ? false : z);
    }
}
