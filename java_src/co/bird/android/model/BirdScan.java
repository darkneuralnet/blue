package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.constant.ScanStatus;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0097\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u00107\u001a\u000208HÖ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000208HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000208HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006D"}, m28432d2 = {"Lco/bird/android/model/BirdScan;", "Landroid/os/Parcelable;", "id", "", "userId", "barcode", "error", "Lco/bird/android/model/wire/WireError;", "mode", "Lco/bird/android/model/constant/ScanMode;", "status", "Lco/bird/android/model/constant/ScanStatus;", "birdCode", "birdId", "bird", "Lco/bird/android/model/wire/WireBird;", "coupons", "", "Lco/bird/android/model/wire/WireCoupon;", "message", "Lco/bird/android/model/ScanMessage;", "ephemeralId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireError;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanStatus;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Lco/bird/android/model/ScanMessage;Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getBirdCode", "getBirdId", "getCoupons", "()Ljava/util/List;", "getEphemeralId", "getError", "()Lco/bird/android/model/wire/WireError;", "getId", "getMessage", "()Lco/bird/android/model/ScanMessage;", "getMode", "()Lco/bird/android/model/constant/ScanMode;", "getStatus", "()Lco/bird/android/model/constant/ScanStatus;", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdScan implements Parcelable {
    public static final Parcelable.Creator<BirdScan> CREATOR = new Creator();
    @JsonProperty("barcode")
    @InterfaceC41208ft5("barcode")
    private final String barcode;
    @JsonProperty("bird")
    @InterfaceC41208ft5("bird")
    private final WireBird bird;
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("coupons")
    @InterfaceC41208ft5("coupons")
    private final List<WireCoupon> coupons;
    @JsonProperty("ephemeral_id")
    @InterfaceC41208ft5("ephemeral_id")
    private final String ephemeralId;
    @JsonProperty("error")
    @InterfaceC41208ft5("error")
    private final WireError error;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66577id;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final ScanMessage message;
    @JsonProperty("mode")
    @InterfaceC41208ft5("mode")
    private final ScanMode mode;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final ScanStatus status;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BirdScan> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BirdScan createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            WireError wireError = (WireError) parcel.readParcelable(BirdScan.class.getClassLoader());
            ScanMode valueOf = ScanMode.valueOf(parcel.readString());
            ScanStatus valueOf2 = parcel.readInt() == 0 ? null : ScanStatus.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            WireBird wireBird = (WireBird) parcel.readParcelable(BirdScan.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(BirdScan.class.getClassLoader()));
                }
            }
            return new BirdScan(readString, readString2, readString3, wireError, valueOf, valueOf2, readString4, readString5, wireBird, arrayList, parcel.readInt() != 0 ? ScanMessage.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BirdScan[] newArray(int i) {
            return new BirdScan[i];
        }
    }

    public BirdScan() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.f66577id;
    }

    public final List<WireCoupon> component10() {
        return this.coupons;
    }

    public final ScanMessage component11() {
        return this.message;
    }

    public final String component12() {
        return this.ephemeralId;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.barcode;
    }

    public final WireError component4() {
        return this.error;
    }

    public final ScanMode component5() {
        return this.mode;
    }

    public final ScanStatus component6() {
        return this.status;
    }

    public final String component7() {
        return this.birdCode;
    }

    public final String component8() {
        return this.birdId;
    }

    public final WireBird component9() {
        return this.bird;
    }

    public final BirdScan copy(String id, String userId, String barcode, WireError wireError, ScanMode mode, ScanStatus scanStatus, String str, String str2, WireBird wireBird, List<WireCoupon> list, ScanMessage scanMessage, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new BirdScan(id, userId, barcode, wireError, mode, scanStatus, str, str2, wireBird, list, scanMessage, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdScan) {
            BirdScan birdScan = (BirdScan) obj;
            return Intrinsics.areEqual(this.f66577id, birdScan.f66577id) && Intrinsics.areEqual(this.userId, birdScan.userId) && Intrinsics.areEqual(this.barcode, birdScan.barcode) && Intrinsics.areEqual(this.error, birdScan.error) && this.mode == birdScan.mode && this.status == birdScan.status && Intrinsics.areEqual(this.birdCode, birdScan.birdCode) && Intrinsics.areEqual(this.birdId, birdScan.birdId) && Intrinsics.areEqual(this.bird, birdScan.bird) && Intrinsics.areEqual(this.coupons, birdScan.coupons) && Intrinsics.areEqual(this.message, birdScan.message) && Intrinsics.areEqual(this.ephemeralId, birdScan.ephemeralId);
        }
        return false;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final WireBird getBird() {
        return this.bird;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final List<WireCoupon> getCoupons() {
        return this.coupons;
    }

    public final String getEphemeralId() {
        return this.ephemeralId;
    }

    public final WireError getError() {
        return this.error;
    }

    public final String getId() {
        return this.f66577id;
    }

    public final ScanMessage getMessage() {
        return this.message;
    }

    public final ScanMode getMode() {
        return this.mode;
    }

    public final ScanStatus getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((this.f66577id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.barcode.hashCode()) * 31;
        WireError wireError = this.error;
        int hashCode2 = (((hashCode + (wireError == null ? 0 : wireError.hashCode())) * 31) + this.mode.hashCode()) * 31;
        ScanStatus scanStatus = this.status;
        int hashCode3 = (hashCode2 + (scanStatus == null ? 0 : scanStatus.hashCode())) * 31;
        String str = this.birdCode;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birdId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WireBird wireBird = this.bird;
        int hashCode6 = (hashCode5 + (wireBird == null ? 0 : wireBird.hashCode())) * 31;
        List<WireCoupon> list = this.coupons;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ScanMessage scanMessage = this.message;
        int hashCode8 = (hashCode7 + (scanMessage == null ? 0 : scanMessage.hashCode())) * 31;
        String str3 = this.ephemeralId;
        return hashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66577id;
        String str2 = this.userId;
        String str3 = this.barcode;
        WireError wireError = this.error;
        ScanMode scanMode = this.mode;
        ScanStatus scanStatus = this.status;
        String str4 = this.birdCode;
        String str5 = this.birdId;
        WireBird wireBird = this.bird;
        List<WireCoupon> list = this.coupons;
        ScanMessage scanMessage = this.message;
        String str6 = this.ephemeralId;
        return "BirdScan(id=" + str + ", userId=" + str2 + ", barcode=" + str3 + ", error=" + wireError + ", mode=" + scanMode + ", status=" + scanStatus + ", birdCode=" + str4 + ", birdId=" + str5 + ", bird=" + wireBird + ", coupons=" + list + ", message=" + scanMessage + ", ephemeralId=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66577id);
        out.writeString(this.userId);
        out.writeString(this.barcode);
        out.writeParcelable(this.error, i);
        out.writeString(this.mode.name());
        ScanStatus scanStatus = this.status;
        if (scanStatus == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(scanStatus.name());
        }
        out.writeString(this.birdCode);
        out.writeString(this.birdId);
        out.writeParcelable(this.bird, i);
        List<WireCoupon> list = this.coupons;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (WireCoupon wireCoupon : list) {
                out.writeParcelable(wireCoupon, i);
            }
        }
        ScanMessage scanMessage = this.message;
        if (scanMessage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            scanMessage.writeToParcel(out, i);
        }
        out.writeString(this.ephemeralId);
    }

    public BirdScan(String id, String userId, String barcode, WireError wireError, ScanMode mode, ScanStatus scanStatus, String str, String str2, WireBird wireBird, List<WireCoupon> list, ScanMessage scanMessage, String str3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f66577id = id;
        this.userId = userId;
        this.barcode = barcode;
        this.error = wireError;
        this.mode = mode;
        this.status = scanStatus;
        this.birdCode = str;
        this.birdId = str2;
        this.bird = wireBird;
        this.coupons = list;
        this.message = scanMessage;
        this.ephemeralId = str3;
    }

    public /* synthetic */ BirdScan(String str, String str2, String str3, WireError wireError, ScanMode scanMode, ScanStatus scanStatus, String str4, String str5, WireBird wireBird, List list, ScanMessage scanMessage, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : wireError, (i & 16) != 0 ? ScanMode.RIDER : scanMode, (i & 32) != 0 ? null : scanStatus, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : wireBird, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : scanMessage, (i & 2048) == 0 ? str6 : null);
    }
}
