package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\b\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/api/request/ScanBody;", "", "barcode", "", "mode", "Lco/bird/android/model/constant/ScanMode;", "intention", "Lco/bird/android/model/constant/ScanIntention;", "isCameraScan", "", "rawQrCode", "(Ljava/lang/String;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Boolean;Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "getIntention", "()Lco/bird/android/model/constant/ScanIntention;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMode", "()Lco/bird/android/model/constant/ScanMode;", "getRawQrCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Boolean;Ljava/lang/String;)Lco/bird/api/request/ScanBody;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ScanBody {
    @JsonProperty("barcode")
    @InterfaceC41208ft5("barcode")
    private final String barcode;
    @JsonProperty("intention")
    @InterfaceC41208ft5("intention")
    private final ScanIntention intention;
    @JsonProperty("is_camera_scan")
    @InterfaceC41208ft5("is_camera_scan")
    private final Boolean isCameraScan;
    @JsonProperty("mode")
    @InterfaceC41208ft5("mode")
    private final ScanMode mode;
    @JsonProperty("qr_code")
    @InterfaceC41208ft5("qr_code")
    private final String rawQrCode;

    public ScanBody(String barcode, ScanMode mode, ScanIntention scanIntention, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.barcode = barcode;
        this.mode = mode;
        this.intention = scanIntention;
        this.isCameraScan = bool;
        this.rawQrCode = str;
    }

    public static /* synthetic */ ScanBody copy$default(ScanBody scanBody, String str, ScanMode scanMode, ScanIntention scanIntention, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scanBody.barcode;
        }
        if ((i & 2) != 0) {
            scanMode = scanBody.mode;
        }
        ScanMode scanMode2 = scanMode;
        if ((i & 4) != 0) {
            scanIntention = scanBody.intention;
        }
        ScanIntention scanIntention2 = scanIntention;
        if ((i & 8) != 0) {
            bool = scanBody.isCameraScan;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str2 = scanBody.rawQrCode;
        }
        return scanBody.copy(str, scanMode2, scanIntention2, bool2, str2);
    }

    public final String component1() {
        return this.barcode;
    }

    public final ScanMode component2() {
        return this.mode;
    }

    public final ScanIntention component3() {
        return this.intention;
    }

    public final Boolean component4() {
        return this.isCameraScan;
    }

    public final String component5() {
        return this.rawQrCode;
    }

    public final ScanBody copy(String barcode, ScanMode mode, ScanIntention scanIntention, Boolean bool, String str) {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new ScanBody(barcode, mode, scanIntention, bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScanBody) {
            ScanBody scanBody = (ScanBody) obj;
            return Intrinsics.areEqual(this.barcode, scanBody.barcode) && this.mode == scanBody.mode && this.intention == scanBody.intention && Intrinsics.areEqual(this.isCameraScan, scanBody.isCameraScan) && Intrinsics.areEqual(this.rawQrCode, scanBody.rawQrCode);
        }
        return false;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final ScanIntention getIntention() {
        return this.intention;
    }

    public final ScanMode getMode() {
        return this.mode;
    }

    public final String getRawQrCode() {
        return this.rawQrCode;
    }

    public int hashCode() {
        int hashCode = ((this.barcode.hashCode() * 31) + this.mode.hashCode()) * 31;
        ScanIntention scanIntention = this.intention;
        int hashCode2 = (hashCode + (scanIntention == null ? 0 : scanIntention.hashCode())) * 31;
        Boolean bool = this.isCameraScan;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.rawQrCode;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isCameraScan() {
        return this.isCameraScan;
    }

    public String toString() {
        String str = this.barcode;
        ScanMode scanMode = this.mode;
        ScanIntention scanIntention = this.intention;
        Boolean bool = this.isCameraScan;
        String str2 = this.rawQrCode;
        return "ScanBody(barcode=" + str + ", mode=" + scanMode + ", intention=" + scanIntention + ", isCameraScan=" + bool + ", rawQrCode=" + str2 + ")";
    }

    public /* synthetic */ ScanBody(String str, ScanMode scanMode, ScanIntention scanIntention, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, scanMode, (i & 4) != 0 ? null : scanIntention, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str2);
    }
}
