package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: U80 */
/* loaded from: classes.dex */
public class U80 implements B74 {

    /* renamed from: a */
    public final C46867pR5 f36885a;

    /* renamed from: b */
    public List<Size> f36886b = null;

    public U80(C36761Wa0 c36761Wa0) {
        this.f36885a = c36761Wa0.m78175b();
    }

    /* renamed from: d */
    public static boolean m81928d(C36761Wa0 c36761Wa0) {
        Integer num = (Integer) c36761Wa0.m78176a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // p000.B74
    /* renamed from: c */
    public List<Size> mo81929c() {
        List<Size> emptyList;
        if (this.f36886b == null) {
            Size[] m19305b = this.f36885a.m19305b(34);
            if (m19305b != null) {
                emptyList = Arrays.asList((Size[]) m19305b.clone());
            } else {
                emptyList = Collections.emptyList();
            }
            this.f36886b = emptyList;
            C33928Jx2.m99533a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f36886b);
        }
        return new ArrayList(this.f36886b);
    }
}
