package p000;

import co.bird.android.model.Vehicle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "LJA5;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: y13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51957y13 {
    /* renamed from: a */
    public static final JA5 m4236a(Vehicle vehicle) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(vehicle, "<this>");
        Integer rssi = vehicle.getRssi();
        if (rssi != null) {
            int intValue = rssi.intValue();
            boolean z3 = true;
            if (-55 <= intValue && intValue < Integer.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return JA5.CLOSEST;
            }
            if (-65 <= intValue && intValue < -55) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return JA5.CLOSE;
            }
            if (-75 > intValue || intValue >= -65) {
                z3 = false;
            }
            if (z3) {
                return JA5.FAR;
            }
            return JA5.FARTHEST;
        }
        return null;
    }
}
