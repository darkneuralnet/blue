package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
/* renamed from: o8 */
/* loaded from: classes.dex */
public class C26831o8 implements InterfaceC35865Se4 {

    /* renamed from: a */
    public final Range<Integer> f101423a;

    public C26831o8(C36761Wa0 c36761Wa0) {
        this.f101423a = m21728g((Range[]) c36761Wa0.m78176a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    /* renamed from: f */
    public static boolean m21729f(C36761Wa0 c36761Wa0) {
        Integer num = (Integer) c36761Wa0.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Range<Integer> m21731d(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    /* renamed from: e */
    public Range<Integer> m21730e() {
        return this.f101423a;
    }

    /* renamed from: g */
    public final Range<Integer> m21728g(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> m21731d = m21731d(range2);
                if (m21731d.getUpper().intValue() == 30 && (range == null || m21731d.getLower().intValue() < range.getLower().intValue())) {
                    range = m21731d;
                }
            }
        }
        return range;
    }
}
