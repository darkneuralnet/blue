package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.core.CameraControl;
import p000.C43385ja0;
import p000.C46203oJ6;
import p000.O80;
/* renamed from: Cd */
/* loaded from: classes.dex */
public final class C1108Cd implements C46203oJ6.InterfaceC26905b {

    /* renamed from: a */
    public final C36761Wa0 f4389a;

    /* renamed from: b */
    public final Range<Float> f4390b;

    /* renamed from: d */
    public O80.C5832a<Void> f4392d;

    /* renamed from: c */
    public float f4391c = 1.0f;

    /* renamed from: e */
    public float f4393e = 1.0f;

    public C1108Cd(C36761Wa0 c36761Wa0) {
        CameraCharacteristics.Key key;
        this.f4389a = c36761Wa0;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f4390b = (Range) c36761Wa0.m78176a(key);
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: a */
    public void mo21352a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f;
        if (this.f4392d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                f = null;
            } else {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f = (Float) request.get(key);
            }
            if (f == null) {
                return;
            }
            if (this.f4393e == f.floatValue()) {
                this.f4392d.m92861c(null);
                this.f4392d = null;
            }
        }
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: b */
    public float mo21351b() {
        return this.f4390b.getLower().floatValue();
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: c */
    public void mo21350c(float f, O80.C5832a<Void> c5832a) {
        this.f4391c = f;
        O80.C5832a<Void> c5832a2 = this.f4392d;
        if (c5832a2 != null) {
            c5832a2.m92858f(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f4393e = this.f4391c;
        this.f4392d = c5832a;
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: d */
    public float mo21349d() {
        return this.f4390b.getUpper().floatValue();
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: e */
    public void mo21348e(C43385ja0.C24930a c24930a) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        c24930a.m30298e(key, Float.valueOf(this.f4391c));
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: f */
    public void mo21347f() {
        this.f4391c = 1.0f;
        O80.C5832a<Void> c5832a = this.f4392d;
        if (c5832a != null) {
            c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f4392d = null;
        }
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: g */
    public Rect mo21346g() {
        return (Rect) HZ3.m103731g((Rect) this.f4389a.m78176a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
