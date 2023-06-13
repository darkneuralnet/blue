package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* loaded from: classes.dex */
public final class CameraValidator {

    /* loaded from: classes.dex */
    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(String str, Throwable th) {
            super(str, th);
        }
    }

    private CameraValidator() {
    }

    /* renamed from: a */
    public static void m69473a(Context context, C41033fc0 c41033fc0, C42812ic0 c42812ic0) throws CameraIdListIncorrectException {
        Integer m33761d;
        if (c42812ic0 != null) {
            try {
                m33761d = c42812ic0.m33761d();
                if (m33761d == null) {
                    C33928Jx2.m99522l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                C33928Jx2.m99530d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            m33761d = null;
        }
        C33928Jx2.m99533a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + m33761d);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (c42812ic0 == null || m33761d.intValue() == 1)) {
                C42812ic0.f87522c.m33760e(c41033fc0.m41120a());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c42812ic0 == null || m33761d.intValue() == 0) {
                    C42812ic0.f87521b.m33760e(c41033fc0.m41120a());
                }
            }
        } catch (IllegalArgumentException e2) {
            C33928Jx2.m99531c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + c41033fc0.m41120a());
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e2);
        }
    }
}
