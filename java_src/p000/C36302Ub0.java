package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;
/* renamed from: Ub0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36302Ub0 extends C37238Yb0 {
    public C36302Ub0(Context context) {
        super(context, null);
    }

    /* renamed from: i */
    public static C36302Ub0 m81300i(Context context) {
        return new C36302Ub0(context);
    }

    /* renamed from: k */
    public static boolean m81298k(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: a */
    public void mo74838a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f46045a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: b */
    public void mo74837b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f46045a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (m81299j(e4)) {
                m81297l(e4);
            }
            throw e4;
        }
    }

    @Override // p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: d */
    public CameraCharacteristics mo74836d(String str) throws CameraAccessExceptionCompat {
        try {
            return super.mo74836d(str);
        } catch (RuntimeException e) {
            if (m81299j(e)) {
                m81297l(e);
            }
            throw e;
        }
    }

    @Override // p000.C37238Yb0, p000.C35600Rb0.InterfaceC7212b
    /* renamed from: g */
    public void mo74833g(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f46045a.unregisterAvailabilityCallback(availabilityCallback);
    }

    /* renamed from: j */
    public final boolean m81299j(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m81298k(th);
    }

    /* renamed from: l */
    public final void m81297l(Throwable th) throws CameraAccessExceptionCompat {
        throw new CameraAccessExceptionCompat(10001, th);
    }
}
