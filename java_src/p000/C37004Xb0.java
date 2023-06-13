package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;
/* renamed from: Xb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37004Xb0 extends C36536Vb0 {
    public C37004Xb0(Context context) {
        super(context);
    }

    @Override // p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: e */
    public Set<Set<String>> mo74835e() throws CameraAccessExceptionCompat {
        Set<Set<String>> concurrentCameraIds;
        try {
            concurrentCameraIds = this.f46045a.getConcurrentCameraIds();
            return concurrentCameraIds;
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }
}
