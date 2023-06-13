package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, m28432d2 = {"faultCodes", "", "Lco/bird/android/model/Vehicle;", "isIBeacon", "", "toVehicleDescriptor", "Lco/bird/android/model/VehicleDescriptor;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class VehicleKt {
    public static final String faultCodes(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        String fault = vehicle.getFault();
        if (fault == null) {
            return "00000000000000000000000000000000";
        }
        return fault;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isIBeacon(Vehicle vehicle) {
        boolean z;
        boolean z2;
        boolean isBlank;
        boolean isBlank2;
        boolean isBlank3;
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        String beaconHash = vehicle.getBeaconHash();
        if (beaconHash != null) {
            isBlank3 = StringsKt__StringsJVMKt.isBlank(beaconHash);
            if (!isBlank3) {
                z = true;
                if (z) {
                    return false;
                }
                String imei = vehicle.getImei();
                if (imei != null) {
                    isBlank2 = StringsKt__StringsJVMKt.isBlank(imei);
                    if (!isBlank2) {
                        z2 = false;
                        if (z2) {
                            return false;
                        }
                        isBlank = StringsKt__StringsJVMKt.isBlank(vehicle.getBird().getSerialNumber());
                        if (!isBlank) {
                            return false;
                        }
                        return true;
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
        }
        z = false;
        if (z) {
        }
    }

    public static final VehicleDescriptor toVehicleDescriptor(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        String imei = vehicle.getImei();
        if (imei == null) {
            imei = vehicle.getBird().getImei();
        }
        String str = imei;
        String serialNumber = vehicle.getSerialNumber();
        if (serialNumber == null) {
            serialNumber = vehicle.getBird().getSerialNumber();
        }
        return new VehicleDescriptor(null, str, serialNumber, null, vehicle.getBird().getModel(), null, 33, null);
    }
}
