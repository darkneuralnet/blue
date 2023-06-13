package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: oa0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C46350oa0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: b */
    public InterfaceC27009a f102152b = null;

    /* renamed from: a */
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f102151a = new HashMap();

    /* renamed from: oa0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC27009a {
        /* renamed from: a */
        void mo20692a(CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    /* renamed from: a */
    public void m20837a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.f102151a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f102151a.put(captureRequest, arrayList);
            return;
        }
        this.f102151a.put(captureRequest, list);
    }

    /* renamed from: b */
    public final List<CameraCaptureSession.CaptureCallback> m20836b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f102151a.get(captureRequest);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: c */
    public void m20835c(InterfaceC27009a interfaceC27009a) {
        this.f102152b = interfaceC27009a;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m20836b(captureRequest)) {
            C27650qh.m17250a(captureCallback, cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m20836b(captureRequest)) {
            captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m20836b(captureRequest)) {
            captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m20836b(captureRequest)) {
            captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.f102151a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        InterfaceC27009a interfaceC27009a = this.f102152b;
        if (interfaceC27009a != null) {
            interfaceC27009a.mo20692a(cameraCaptureSession, i, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        for (List<CameraCaptureSession.CaptureCallback> list : this.f102151a.values()) {
            for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        InterfaceC27009a interfaceC27009a = this.f102152b;
        if (interfaceC27009a != null) {
            interfaceC27009a.mo20692a(cameraCaptureSession, i, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback captureCallback : m20836b(captureRequest)) {
            captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
