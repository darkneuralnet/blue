package p000;

import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.EnergyMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "", "byte", "Lco/bird/android/model/constant/EnergyMode;", "b", "Lco/bird/android/model/VehicleDescriptor;", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Bd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31875Bd1 {
    /* renamed from: a */
    public static final EnergyMode m113750a(VehicleDescriptor vehicleDescriptor, byte b) {
        Intrinsics.checkNotNullParameter(vehicleDescriptor, "<this>");
        String model = vehicleDescriptor.getModel();
        String serialNumber = vehicleDescriptor.getSerialNumber();
        if (serialNumber == null) {
            serialNumber = "";
        }
        if (WireBirdKt.vehicleIsEsModel(model, serialNumber)) {
            if (b == 0) {
                return EnergyMode.POWER_SAVING;
            }
            if (b == 1) {
                return EnergyMode.NORMAL;
            }
            return EnergyMode.SPORT;
        } else if (WireBirdKt.vehicleIsM365Model(vehicleDescriptor.getModel())) {
            if (b == 0) {
                return EnergyMode.NORMAL;
            }
            return EnergyMode.POWER_SAVING;
        } else {
            return EnergyMode.NORMAL;
        }
    }

    /* renamed from: b */
    public static final EnergyMode m113749b(WireBird wireBird, byte b) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (WireBirdKt.isEsModel(wireBird)) {
            if (b == 0) {
                return EnergyMode.POWER_SAVING;
            }
            if (b == 1) {
                return EnergyMode.NORMAL;
            }
            return EnergyMode.SPORT;
        } else if (WireBirdKt.isM365Model(wireBird)) {
            if (b == 0) {
                return EnergyMode.NORMAL;
            }
            return EnergyMode.POWER_SAVING;
        } else {
            return EnergyMode.NORMAL;
        }
    }
}
