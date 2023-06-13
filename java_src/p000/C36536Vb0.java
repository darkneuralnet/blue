package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;
/* renamed from: Vb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36536Vb0 extends C36302Ub0 {
    public C36536Vb0(Context context) {
        super(context);
    }

    @Override // p000.C36302Ub0, p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: b */
    public void mo74837b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f46045a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }

    @Override // p000.C36302Ub0, p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: d */
    public CameraCharacteristics mo74836d(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f46045a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }
}
