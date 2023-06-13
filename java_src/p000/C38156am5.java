package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.api.response.TransferOrderVehicleViewResponse;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lam5;", "", "Lco/bird/android/model/wire/WireSkuScanItem;", "scanItem", "", "force", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", "vehicleAcceptanceOptions", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/wire/WireSkuScanItem;", "c", "()Lco/bird/android/model/wire/WireSkuScanItem;", "b", "Z", "()Z", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/api/response/TransferOrderVehicleViewResponse;", "<init>", "(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: am5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38156am5 {

    /* renamed from: a */
    public final WireSkuScanItem f51209a;

    /* renamed from: b */
    public final boolean f51210b;

    /* renamed from: c */
    public final TransferOrderVehicleViewResponse f51211c;

    public C38156am5(WireSkuScanItem scanItem, boolean z, TransferOrderVehicleViewResponse vehicleAcceptanceOptions) {
        Intrinsics.checkNotNullParameter(scanItem, "scanItem");
        Intrinsics.checkNotNullParameter(vehicleAcceptanceOptions, "vehicleAcceptanceOptions");
        this.f51209a = scanItem;
        this.f51210b = z;
        this.f51211c = vehicleAcceptanceOptions;
    }

    public static /* synthetic */ C38156am5 copy$default(C38156am5 c38156am5, WireSkuScanItem wireSkuScanItem, boolean z, TransferOrderVehicleViewResponse transferOrderVehicleViewResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            wireSkuScanItem = c38156am5.f51209a;
        }
        if ((i & 2) != 0) {
            z = c38156am5.f51210b;
        }
        if ((i & 4) != 0) {
            transferOrderVehicleViewResponse = c38156am5.f51211c;
        }
        return c38156am5.m70766a(wireSkuScanItem, z, transferOrderVehicleViewResponse);
    }

    /* renamed from: a */
    public final C38156am5 m70766a(WireSkuScanItem scanItem, boolean z, TransferOrderVehicleViewResponse vehicleAcceptanceOptions) {
        Intrinsics.checkNotNullParameter(scanItem, "scanItem");
        Intrinsics.checkNotNullParameter(vehicleAcceptanceOptions, "vehicleAcceptanceOptions");
        return new C38156am5(scanItem, z, vehicleAcceptanceOptions);
    }

    /* renamed from: b */
    public final boolean m70765b() {
        return this.f51210b;
    }

    /* renamed from: c */
    public final WireSkuScanItem m70764c() {
        return this.f51209a;
    }

    /* renamed from: d */
    public final TransferOrderVehicleViewResponse m70763d() {
        return this.f51211c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38156am5) {
            C38156am5 c38156am5 = (C38156am5) obj;
            return Intrinsics.areEqual(this.f51209a, c38156am5.f51209a) && this.f51210b == c38156am5.f51210b && Intrinsics.areEqual(this.f51211c, c38156am5.f51211c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f51209a.hashCode() * 31;
        boolean z = this.f51210b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.f51211c.hashCode();
    }

    public String toString() {
        WireSkuScanItem wireSkuScanItem = this.f51209a;
        boolean z = this.f51210b;
        TransferOrderVehicleViewResponse transferOrderVehicleViewResponse = this.f51211c;
        return "ScannedItem(scanItem=" + wireSkuScanItem + ", force=" + z + ", vehicleAcceptanceOptions=" + transferOrderVehicleViewResponse + ")";
    }
}
