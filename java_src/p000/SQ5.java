package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.List;
/* renamed from: SQ5 */
/* loaded from: classes.dex */
public class SQ5 {

    /* renamed from: a */
    public final boolean f33670a;

    public SQ5() {
        boolean z;
        if (((RQ5) S21.m86079a(RQ5.class)) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f33670a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m85478a(List<CaptureRequest> list, boolean z) {
        if (this.f33670a && z) {
            for (CaptureRequest captureRequest : list) {
                int intValue = ((Integer) captureRequest.get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (intValue == 2 || intValue == 3) {
                    return true;
                }
                while (r3.hasNext()) {
                }
            }
        }
        return false;
    }
}
