package p000;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p000.C35600Rb0;
import p000.C44581lb0;
/* renamed from: Yb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37238Yb0 implements C35600Rb0.InterfaceC7212b {

    /* renamed from: a */
    public final CameraManager f46045a;

    /* renamed from: b */
    public final Object f46046b;

    /* renamed from: Yb0$a */
    /* loaded from: classes.dex */
    public static final class C9818a {

        /* renamed from: a */
        public final Map<CameraManager.AvailabilityCallback, C35600Rb0.C7211a> f46047a = new HashMap();

        /* renamed from: b */
        public final Handler f46048b;

        public C9818a(Handler handler) {
            this.f46048b = handler;
        }
    }

    public C37238Yb0(Context context, Object obj) {
        this.f46045a = (CameraManager) context.getSystemService("camera");
        this.f46046b = obj;
    }

    /* renamed from: h */
    public static C37238Yb0 m74832h(Context context, Handler handler) {
        return new C37238Yb0(context, new C9818a(handler));
    }

    @Override // p000.C35600Rb0.InterfaceC7212b
    /* renamed from: a */
    public void mo74838a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        C35600Rb0.C7211a c7211a;
        if (executor != null) {
            C9818a c9818a = (C9818a) this.f46046b;
            if (availabilityCallback != null) {
                synchronized (c9818a.f46047a) {
                    c7211a = c9818a.f46047a.get(availabilityCallback);
                    if (c7211a == null) {
                        c7211a = new C35600Rb0.C7211a(executor, availabilityCallback);
                        c9818a.f46047a.put(availabilityCallback, c7211a);
                    }
                }
            } else {
                c7211a = null;
            }
            this.f46045a.registerAvailabilityCallback(c7211a, c9818a.f46048b);
            return;
        }
        throw new IllegalArgumentException("executor was null");
    }

    @Override // p000.C35600Rb0.InterfaceC7212b
    /* renamed from: b */
    public void mo74837b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        HZ3.m103731g(executor);
        HZ3.m103731g(stateCallback);
        try {
            this.f46045a.openCamera(str, new C44581lb0.C25732b(executor, stateCallback), ((C9818a) this.f46046b).f46048b);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }

    @Override // p000.C35600Rb0.InterfaceC7212b
    /* renamed from: d */
    public CameraCharacteristics mo74836d(String str) throws CameraAccessExceptionCompat {
        try {
            return this.f46045a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }

    @Override // p000.C35600Rb0.InterfaceC7212b
    /* renamed from: e */
    public Set<Set<String>> mo74835e() throws CameraAccessExceptionCompat {
        return Collections.emptySet();
    }

    @Override // p000.C35600Rb0.InterfaceC7212b
    /* renamed from: f */
    public String[] mo74834f() throws CameraAccessExceptionCompat {
        try {
            return this.f46045a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.m69657e(e);
        }
    }

    @Override // p000.C35600Rb0.InterfaceC7212b
    /* renamed from: g */
    public void mo74833g(CameraManager.AvailabilityCallback availabilityCallback) {
        C35600Rb0.C7211a c7211a;
        if (availabilityCallback != null) {
            C9818a c9818a = (C9818a) this.f46046b;
            synchronized (c9818a.f46047a) {
                c7211a = c9818a.f46047a.remove(availabilityCallback);
            }
        } else {
            c7211a = null;
        }
        if (c7211a != null) {
            c7211a.m86578g();
        }
        this.f46045a.unregisterAvailabilityCallback(c7211a);
    }
}
