package p000;

import android.hardware.camera2.CameraCharacteristics;
import p000.C36761Wa0;
/* renamed from: Va0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36527Va0 implements C36761Wa0.InterfaceC9103a {

    /* renamed from: a */
    public final CameraCharacteristics f39252a;

    public C36527Va0(CameraCharacteristics cameraCharacteristics) {
        this.f39252a = cameraCharacteristics;
    }

    @Override // p000.C36761Wa0.InterfaceC9103a
    /* renamed from: a */
    public <T> T mo78172a(CameraCharacteristics.Key<T> key) {
        return (T) this.f39252a.get(key);
    }
}
