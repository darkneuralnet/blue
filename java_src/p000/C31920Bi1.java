package p000;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl;
import java.util.concurrent.Executor;
import p000.C43385ja0;
import p000.C47885r90;
import p000.O80;
/* renamed from: Bi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C31920Bi1 {

    /* renamed from: a */
    public final C47885r90 f2704a;

    /* renamed from: b */
    public final C32154Ci1 f2705b;

    /* renamed from: c */
    public final Executor f2706c;

    /* renamed from: d */
    public boolean f2707d = false;

    /* renamed from: e */
    public O80.C5832a<Integer> f2708e;

    /* renamed from: f */
    public C47885r90.InterfaceC27858c f2709f;

    public C31920Bi1(C47885r90 c47885r90, C36761Wa0 c36761Wa0, Executor executor) {
        this.f2704a = c47885r90;
        this.f2705b = new C32154Ci1(c36761Wa0, 0);
        this.f2706c = executor;
    }

    /* renamed from: a */
    public final void m113661a() {
        O80.C5832a<Integer> c5832a = this.f2708e;
        if (c5832a != null) {
            c5832a.m92858f(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f2708e = null;
        }
        C47885r90.InterfaceC27858c interfaceC27858c = this.f2709f;
        if (interfaceC27858c != null) {
            this.f2704a.m16401d0(interfaceC27858c);
            this.f2709f = null;
        }
    }

    /* renamed from: b */
    public void m113660b(boolean z) {
        if (z == this.f2707d) {
            return;
        }
        this.f2707d = z;
        if (!z) {
            this.f2705b.m111826b(0);
            m113661a();
        }
    }

    /* renamed from: c */
    public void m113659c(C43385ja0.C24930a c24930a) {
        c24930a.m30298e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f2705b.m111827a()));
    }
}
