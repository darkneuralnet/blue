package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import p000.C43385ja0;
import p000.C46203oJ6;
import p000.O80;
/* renamed from: OE0 */
/* loaded from: classes.dex */
public final class OE0 implements C46203oJ6.InterfaceC26905b {

    /* renamed from: a */
    public final C36761Wa0 f26249a;

    /* renamed from: c */
    public O80.C5832a<Void> f26251c;

    /* renamed from: b */
    public Rect f26250b = null;

    /* renamed from: d */
    public Rect f26252d = null;

    public OE0(C36761Wa0 c36761Wa0) {
        this.f26249a = c36761Wa0;
    }

    /* renamed from: h */
    public static Rect m92601h(Rect rect, float f) {
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: a */
    public void mo21352a(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (this.f26251c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = this.f26252d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f26251c.m92861c(null);
                this.f26251c = null;
                this.f26252d = null;
            }
        }
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: b */
    public float mo21351b() {
        return 1.0f;
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: c */
    public void mo21350c(float f, O80.C5832a<Void> c5832a) {
        this.f26250b = m92601h(m92600i(), f);
        O80.C5832a<Void> c5832a2 = this.f26251c;
        if (c5832a2 != null) {
            c5832a2.m92858f(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f26252d = this.f26250b;
        this.f26251c = c5832a;
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: d */
    public float mo21349d() {
        Float f = (Float) this.f26249a.m78176a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < mo21351b()) {
            return mo21351b();
        }
        return f.floatValue();
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: e */
    public void mo21348e(C43385ja0.C24930a c24930a) {
        Rect rect = this.f26250b;
        if (rect != null) {
            c24930a.m30298e(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: f */
    public void mo21347f() {
        this.f26252d = null;
        this.f26250b = null;
        O80.C5832a<Void> c5832a = this.f26251c;
        if (c5832a != null) {
            c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f26251c = null;
        }
    }

    @Override // p000.C46203oJ6.InterfaceC26905b
    /* renamed from: g */
    public Rect mo21346g() {
        Rect rect = this.f26250b;
        return rect != null ? rect : m92600i();
    }

    /* renamed from: i */
    public final Rect m92600i() {
        return (Rect) HZ3.m103731g((Rect) this.f26249a.m78176a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }
}
