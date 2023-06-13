package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import p000.C48355rw6;
import p000.O80;
/* renamed from: rw6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48355rw6 {

    /* renamed from: a */
    public final boolean f107931a;

    /* renamed from: c */
    public final ListenableFuture<Void> f107933c;

    /* renamed from: d */
    public O80.C5832a<Void> f107934d;

    /* renamed from: e */
    public boolean f107935e;

    /* renamed from: b */
    public final Object f107932b = new Object();

    /* renamed from: f */
    public final CameraCaptureSession.CaptureCallback f107936f = new C28067a();

    /* renamed from: rw6$a */
    /* loaded from: classes.dex */
    public class C28067a extends CameraCaptureSession.CaptureCallback {
        public C28067a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            O80.C5832a<Void> c5832a = C48355rw6.this.f107934d;
            if (c5832a != null) {
                c5832a.m92860d();
                C48355rw6.this.f107934d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            O80.C5832a<Void> c5832a = C48355rw6.this.f107934d;
            if (c5832a != null) {
                c5832a.m92861c(null);
                C48355rw6.this.f107934d = null;
            }
        }
    }

    @FunctionalInterface
    /* renamed from: rw6$b */
    /* loaded from: classes.dex */
    public interface InterfaceC28068b {
        /* renamed from: a */
        ListenableFuture<Void> mo15011a(CameraDevice cameraDevice, C49529tv5 c49529tv5, List<DeferrableSurface> list);
    }

    @FunctionalInterface
    /* renamed from: rw6$c */
    /* loaded from: classes.dex */
    public interface InterfaceC28069c {
        /* renamed from: a */
        int mo15010a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    public C48355rw6(C36099Te4 c36099Te4) {
        this.f107931a = c36099Te4.m83239a(C51142wf0.class);
        if (m15012i()) {
            this.f107933c = O80.m92864a(new O80.InterfaceC5834c() { // from class: pw6
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m15017d;
                    m15017d = C48355rw6.this.m15017d(c5832a);
                    return m15017d;
                }
            });
        } else {
            this.f107933c = IA1.m102836h(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m15017d(O80.C5832a c5832a) throws Exception {
        this.f107934d = c5832a;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    /* renamed from: c */
    public ListenableFuture<Void> m15018c() {
        return IA1.m102834j(this.f107933c);
    }

    /* renamed from: f */
    public void m15015f() {
        synchronized (this.f107932b) {
            if (m15012i() && !this.f107935e) {
                this.f107933c.cancel(true);
            }
        }
    }

    /* renamed from: g */
    public ListenableFuture<Void> m15014g(final CameraDevice cameraDevice, final C49529tv5 c49529tv5, final List<DeferrableSurface> list, List<DX5> list2, final InterfaceC28068b interfaceC28068b) {
        ArrayList arrayList = new ArrayList();
        for (DX5 dx5 : list2) {
            arrayList.add(dx5.mo92028h());
        }
        return DA1.m110820a(IA1.m102830n(arrayList)).m110816e(new InterfaceC20537fp() { // from class: qw6
            @Override // p000.InterfaceC20537fp
            public final ListenableFuture apply(Object obj) {
                ListenableFuture mo15011a;
                List list3 = (List) obj;
                mo15011a = C48355rw6.InterfaceC28068b.this.mo15011a(cameraDevice, c49529tv5, list);
                return mo15011a;
            }
        }, C31631Ac0.m115449a());
    }

    /* renamed from: h */
    public int m15013h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, InterfaceC28069c interfaceC28069c) throws CameraAccessException {
        int mo15010a;
        synchronized (this.f107932b) {
            if (m15012i()) {
                captureCallback = K90.m99128b(this.f107936f, captureCallback);
                this.f107935e = true;
            }
            mo15010a = interfaceC28069c.mo15010a(captureRequest, captureCallback);
        }
        return mo15010a;
    }

    /* renamed from: i */
    public boolean m15012i() {
        return this.f107931a;
    }
}
