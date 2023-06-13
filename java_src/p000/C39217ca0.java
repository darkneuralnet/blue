package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.C45807nf0;
/* renamed from: ca0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C39217ca0 {

    /* renamed from: ca0$a */
    /* loaded from: classes.dex */
    public static class C13602a {
        private C13602a() {
        }

        /* renamed from: a */
        public static CaptureRequest.Builder m61194a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
            return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
        }
    }

    private C39217ca0() {
    }

    /* renamed from: a */
    public static void m61199a(C11192d c11192d, CaptureRequest.Builder builder) {
        if (!C45807nf0.C26566a.m23349e(c11192d.m69448e()).m23350c().mo69359e(C43385ja0.m30310R(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE)) && !c11192d.m69449d().equals(BR5.f2318a)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c11192d.m69449d());
        }
    }

    /* renamed from: b */
    public static void m61198b(CaptureRequest.Builder builder, InterfaceC11197f interfaceC11197f) {
        C45807nf0 m23350c = C45807nf0.C26566a.m23349e(interfaceC11197f).m23350c();
        for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : m23350c.mo69357g()) {
            CaptureRequest.Key key = (CaptureRequest.Key) abstractC11198a.mo69417d();
            try {
                builder.set(key, m23350c.mo69363a(abstractC11198a));
            } catch (IllegalArgumentException unused) {
                C33928Jx2.m99531c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    /* renamed from: c */
    public static CaptureRequest m61197c(C11192d c11192d, CameraDevice cameraDevice, Map<DeferrableSurface, Surface> map) throws CameraAccessException {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<Surface> m61195e = m61195e(c11192d.m69447f(), map);
        if (m61195e.isEmpty()) {
            return null;
        }
        InterfaceC51685xa0 m69450c = c11192d.m69450c();
        if (c11192d.m69445h() == 5 && m69450c != null && (m69450c.mo4999g() instanceof TotalCaptureResult)) {
            C33928Jx2.m99533a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = C13602a.m61194a(cameraDevice, (TotalCaptureResult) m69450c.mo4999g());
        } else {
            C33928Jx2.m99533a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(c11192d.m69445h());
        }
        m61198b(createCaptureRequest, c11192d.m69448e());
        m61199a(c11192d, createCaptureRequest);
        InterfaceC11197f m69448e = c11192d.m69448e();
        InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a = C11192d.f52582i;
        if (m69448e.mo69359e(abstractC11198a)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) c11192d.m69448e().mo69363a(abstractC11198a));
        }
        InterfaceC11197f m69448e2 = c11192d.m69448e();
        InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a2 = C11192d.f52583j;
        if (m69448e2.mo69359e(abstractC11198a2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c11192d.m69448e().mo69363a(abstractC11198a2)).byteValue()));
        }
        for (Surface surface : m61195e) {
            createCaptureRequest.addTarget(surface);
        }
        createCaptureRequest.setTag(c11192d.m69446g());
        return createCaptureRequest.build();
    }

    /* renamed from: d */
    public static CaptureRequest m61196d(C11192d c11192d, CameraDevice cameraDevice) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(c11192d.m69445h());
        m61198b(createCaptureRequest, c11192d.m69448e());
        return createCaptureRequest.build();
    }

    /* renamed from: e */
    public static List<Surface> m61195e(List<DeferrableSurface> list, Map<DeferrableSurface, Surface> map) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            Surface surface = map.get(deferrableSurface);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        return arrayList;
    }
}
