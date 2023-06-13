package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11208l;
import p000.C45807nf0;
/* renamed from: ja0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43385ja0 extends C45807nf0 {

    /* renamed from: F */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f92937F = InterfaceC11197f.AbstractC11198a.m69420a("camera2.captureRequest.templateType", Integer.TYPE);

    /* renamed from: G */
    public static final InterfaceC11197f.AbstractC11198a<Long> f92938G = InterfaceC11197f.AbstractC11198a.m69420a("camera2.cameraCaptureSession.streamUseCase", Long.TYPE);

    /* renamed from: H */
    public static final InterfaceC11197f.AbstractC11198a<CameraDevice.StateCallback> f92939H = InterfaceC11197f.AbstractC11198a.m69420a("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class);

    /* renamed from: I */
    public static final InterfaceC11197f.AbstractC11198a<CameraCaptureSession.StateCallback> f92940I = InterfaceC11197f.AbstractC11198a.m69420a("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class);

    /* renamed from: J */
    public static final InterfaceC11197f.AbstractC11198a<CameraCaptureSession.CaptureCallback> f92941J = InterfaceC11197f.AbstractC11198a.m69420a("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class);

    /* renamed from: K */
    public static final InterfaceC11197f.AbstractC11198a<C32090Cb0> f92942K = InterfaceC11197f.AbstractC11198a.m69420a("camera2.cameraEvent.callback", C32090Cb0.class);

    /* renamed from: L */
    public static final InterfaceC11197f.AbstractC11198a<Object> f92943L = InterfaceC11197f.AbstractC11198a.m69420a("camera2.captureRequest.tag", Object.class);

    /* renamed from: M */
    public static final InterfaceC11197f.AbstractC11198a<String> f92944M = InterfaceC11197f.AbstractC11198a.m69420a("camera2.cameraCaptureSession.physicalCameraId", String.class);

    /* renamed from: ja0$a */
    /* loaded from: classes.dex */
    public static final class C24930a implements InterfaceC32388Di1<C43385ja0> {

        /* renamed from: a */
        public final C11209m f92945a = C11209m.m69372V();

        /* renamed from: a */
        public C43385ja0 m30300a() {
            return new C43385ja0(C11210n.m69366T(this.f92945a));
        }

        @Override // p000.InterfaceC32388Di1
        /* renamed from: b */
        public InterfaceC11208l mo1343b() {
            return this.f92945a;
        }

        /* renamed from: c */
        public C24930a m30299c(InterfaceC11197f interfaceC11197f) {
            for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : interfaceC11197f.mo69357g()) {
                this.f92945a.mo69373C(abstractC11198a, interfaceC11197f.mo69363a(abstractC11198a));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: e */
        public <ValueT> C24930a m30298e(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f92945a.mo69373C(C43385ja0.m30310R(key), valuet);
            return this;
        }
    }

    public C43385ja0(InterfaceC11197f interfaceC11197f) {
        super(interfaceC11197f);
    }

    /* renamed from: R */
    public static InterfaceC11197f.AbstractC11198a<Object> m30310R(CaptureRequest.Key<?> key) {
        return InterfaceC11197f.AbstractC11198a.m69419b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* renamed from: S */
    public C32090Cb0 m30309S(C32090Cb0 c32090Cb0) {
        return (C32090Cb0) mo1036B().mo69360d(f92942K, c32090Cb0);
    }

    /* renamed from: T */
    public C45807nf0 m30308T() {
        return C45807nf0.C26566a.m23349e(mo1036B()).m23350c();
    }

    /* renamed from: U */
    public Object m30307U(Object obj) {
        return mo1036B().mo69360d(f92943L, obj);
    }

    /* renamed from: V */
    public int m30306V(int i) {
        return ((Integer) mo1036B().mo69360d(f92937F, Integer.valueOf(i))).intValue();
    }

    /* renamed from: W */
    public CameraDevice.StateCallback m30305W(CameraDevice.StateCallback stateCallback) {
        return (CameraDevice.StateCallback) mo1036B().mo69360d(f92939H, stateCallback);
    }

    /* renamed from: X */
    public String m30304X(String str) {
        return (String) mo1036B().mo69360d(f92944M, str);
    }

    /* renamed from: Y */
    public CameraCaptureSession.CaptureCallback m30303Y(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) mo1036B().mo69360d(f92941J, captureCallback);
    }

    /* renamed from: Z */
    public CameraCaptureSession.StateCallback m30302Z(CameraCaptureSession.StateCallback stateCallback) {
        return (CameraCaptureSession.StateCallback) mo1036B().mo69360d(f92940I, stateCallback);
    }

    /* renamed from: a0 */
    public long m30301a0(long j) {
        return ((Long) mo1036B().mo69360d(f92938G, Long.valueOf(j))).longValue();
    }
}
