package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import p000.C43385ja0;
/* renamed from: n8 */
/* loaded from: classes.dex */
public class C26416n8 {

    /* renamed from: a */
    public final Range<Integer> f99492a;

    public C26416n8(C36099Te4 c36099Te4) {
        C26831o8 c26831o8 = (C26831o8) c36099Te4.m83238b(C26831o8.class);
        if (c26831o8 == null) {
            this.f99492a = null;
        } else {
            this.f99492a = c26831o8.m21730e();
        }
    }

    /* renamed from: a */
    public void m24286a(C43385ja0.C24930a c24930a) {
        Range<Integer> range = this.f99492a;
        if (range != null) {
            c24930a.m30298e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
    }
}
