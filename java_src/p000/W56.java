package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;
import p000.C43385ja0;
/* renamed from: W56 */
/* loaded from: classes.dex */
public class W56 {

    /* renamed from: a */
    public final boolean f40401a;

    public W56() {
        boolean z;
        if (S21.m86079a(V56.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f40401a = z;
    }

    /* renamed from: a */
    public C11192d m78846a(C11192d c11192d) {
        C11192d.C11193a c11193a = new C11192d.C11193a();
        c11193a.m69425s(c11192d.m69445h());
        for (DeferrableSurface deferrableSurface : c11192d.m69447f()) {
            c11193a.m69438f(deferrableSurface);
        }
        c11193a.m69439e(c11192d.m69448e());
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        c24930a.m30298e(CaptureRequest.FLASH_MODE, 0);
        c11193a.m69439e(c24930a.m30300a());
        return c11193a.m69436h();
    }

    /* renamed from: b */
    public boolean m78845b(List<CaptureRequest> list, boolean z) {
        if (this.f40401a && z) {
            for (CaptureRequest captureRequest : list) {
                Integer num = (Integer) captureRequest.get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
